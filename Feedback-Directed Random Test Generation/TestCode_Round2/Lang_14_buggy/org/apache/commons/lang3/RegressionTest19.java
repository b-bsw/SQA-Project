package org.apache.commons.lang3;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest19 {

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
    public void test09501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09501");
        char[] charArray8 = new char[] { 'a', '4', 'a' };
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "###################################44444444444444444444444444444444444444444444444444444444444444444", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "#################", charArray8);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "             hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   hi!hi!hhi ! hi ! hi ! hi ! hi ! h", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { 'a', '4', 'a' });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test09502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09502");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                                                   ########", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09503");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("44444444444444444444444", "4                                                                                           hi!hi!44", 753);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
    }

    @Test
    public void test09504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09504");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 753);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09505");
        java.lang.CharSequence[] charSequenceArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "i!    hi!hi!    hi!hi!hi!    hi!hi!", charSequenceArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09506");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("44", 96, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                              44" + "'", str3, "                                                                                              44");
    }

    @Test
    public void test09507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09507");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat(' ', 753);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
    }

    @Test
    public void test09508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09508");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("HIhia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiHIhia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HIhia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiHIhia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahi" + "'", str1, "HIhia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiHIhia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahi");
    }

    @Test
    public void test09509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09509");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 724 + "'", int1 == 724);
    }

    @Test
    public void test09510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09510");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("             ", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09511");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("!IH!IH!IH!IH!IH!IHH       !IH", 141, "hi!44hi!44");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!44hi!44hi!44hi!44hi!44hi!44hi!44hi!44hi!44hi!44hi!44hi!44hi!44hi!44hi!44hi!44hi!44hi!44hi!44hi!44hi!44hi!44hi!IH!IH!IH!IH!IH!IHH       !IH" + "'", str3, "hi!44hi!44hi!44hi!44hi!44hi!44hi!44hi!44hi!44hi!44hi!44hi!44hi!44hi!44hi!44hi!44hi!44hi!44hi!44hi!44hi!44hi!44hi!IH!IH!IH!IH!IH!IHH       !IH");
    }

    @Test
    public void test09512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09512");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "HI!HI!HI!HIhi!hi!hi!hi!hi!hi", 92, 73);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09513");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaclass [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;aaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test09514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09514");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", 24);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09515");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("Aaaaaaaaaaaaclass [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;aaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##", (int) ' ', 23);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ring;class [Ljava.lang." + "'", str3, "ring;class [Ljava.lang.");
    }

    @Test
    public void test09516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09516");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "                                                                                           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09517");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("!ih!ih                          hi!hi!    hi!hi!hi!", 94, 75);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!ih!ih                          hi!hi!    hi!hi!hi!" + "'", str3, "!ih!ih                          hi!hi!    hi!hi!hi!");
    }

    @Test
    public void test09518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09518");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "                                !i", (java.lang.CharSequence) "HI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09519");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;Aaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;Aaaaaaaaa" + "'", str1, "class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;Aaaaaaaaa");
    }

    @Test
    public void test09520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09520");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "                                              !ih!ih                                             ", (java.lang.CharSequence) "HIAAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09521");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                 !ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!                  ", 25, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                 ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                 !ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!                  " + "'", str3, "                 !ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!                  ");
    }

    @Test
    public void test09522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09522");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!HI!HI!HI!HI" + "'", str1, "HI!HI!HI!HI!HI!HI");
    }

    @Test
    public void test09523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09523");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("###########################################################", "h");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "###########################################################" });
    }

    @Test
    public void test09524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09524");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "###HI!#######HI!##########################    !IH!IH###HI!#######HI!##########################    !IH!IH###HI!#######HI!##########################    !IH!IH###HI!#######HI!##########################    !IH!IH###HI!#######HI!##########################    !IH!IH###HI!#######HI!##########################    !IH!IH###HI!#######HI!##########################    !IH!IH###HI!#######HI!##########################    !IH!IH###HI!#######HI!##########################    !IH!IH###HI!#######HI!##########################    !IH!IH###HI!#######HI!##########################    !IH!IH###HI!#######HI!##########################    !IH!IH###HI!#######HI!##########################    !IH!IH###HI!#######HI!################HI!HI!HI!    HI!HI!    HI!HI!HI!    HI!HI!   ", (java.lang.CharSequence) "H444444444444444444444444444444HI!HI!HI!H...c                                                                                           hi!hi!va.lang.string;class [ljava.lang.string;class [ljava.lang.stringc                                                                                           hi!hi!va.lan");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test09525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09525");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("class [ljava.langclass [ljava.lang", "AAAAAAAAAAAA", 59, 719);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "class [ljava.langclass [ljava.langAAAAAAAAAAAA" + "'", str4, "class [ljava.langclass [ljava.langAAAAAAAAAAAA");
    }

    @Test
    public void test09526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09526");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("                                                                                              ", "44444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444" + "'", str2, "44444");
    }

    @Test
    public void test09527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09527");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "      hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09528");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("###  ...");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "###", "  ", "..." });
    }

    @Test
    public void test09529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09529");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("Class [Ljava.lang.String;!class [Ljava.lang.String                      ", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Class [Ljava.lang.String;!class [Ljava.lang.String                      " + "'", str2, "Class [Ljava.lang.String;!class [Ljava.lang.String                      ");
    }

    @Test
    public void test09530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09530");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                 IH!IH!IH!IH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09531");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hI", (java.lang.CharSequence) "ng.String;             a.lavass [Ljang.String;cla.lavass [Ljang.String;cla.lavass [LjaCl");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09532");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hih            hih                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ", (java.lang.CharSequence) ";gnirtS.gnal.avajL[ ssalc;gnirtS.gnal.avajL[ ssalc;gnirtS.gnal.avajL[ ssalc;gnirthi!hi!hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test09533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09533");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Hi!#hi!hi!###hi!hi!#", "HI!HI!HI!HI!HI!Hclass[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "Hi!#hi!hi!###hi!hi!#" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hi!#hi!hi!###hi!hi!#" + "'", str4, "Hi!#hi!hi!###hi!hi!#");
    }

    @Test
    public void test09534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09534");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("!ih!ih!ih!ih!ih!ihh       !ih", " !ih!ih               !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih               !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih               !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih               !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih               !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih               !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih               !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih               !ih!ih !ih!ih !i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih!ih!ih!ih!ih!ihh       !ih" + "'", str2, "!ih!ih!ih!ih!ih!ihh       !ih");
    }

    @Test
    public void test09535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09535");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hi!              ");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "iIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", (java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test09536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09536");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ...#######!ih!ih#####################...                           ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 720 + "'", int1 == 720);
    }

    @Test
    public void test09537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09537");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("hiH hiH", "Hi!              ", 141);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hiH hiH" + "'", str3, "hiH hiH");
    }

    @Test
    public void test09538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09538");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "hi! h#hi!hi!###hi!hi!#! hi! hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09539");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "        ...    hi...         ", (java.lang.CharSequence) "#!IH!IH###!IH!IH#!IH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09540");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace(";gnirtS.gnal.avajL[ ssalc;gnirtS.gnal.avajL[ ssalc;gnirtS.gnal.avajL[ ssalc;gnirthi!hi!hi!hi!hi!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ";gnirtS.gnal.avajL[ssalc;gnirtS.gnal.avajL[ssalc;gnirtS.gnal.avajL[ssalc;gnirthi!hi!hi!hi!hi!h" + "'", str1, ";gnirtS.gnal.avajL[ssalc;gnirtS.gnal.avajL[ssalc;gnirtS.gnal.avajL[ssalc;gnirthi!hi!hi!hi!hi!h");
    }

    @Test
    public void test09541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09541");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce(".................................................................................................", "hi!            hi!", "class [Ljava.lang.String;!class [Ljava.lang.String");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "................................................................................................." + "'", str3, ".................................................................................................");
    }

    @Test
    public void test09542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09542");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##", 94);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09543");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09544");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", (java.lang.CharSequence) "                                                                aaaaaa!iH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09545");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("hi!            hi!            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!            HI!            " + "'", str1, "HI!            HI!            ");
    }

    @Test
    public void test09546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09546");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("HIaaaa", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HIaaaa" + "'", str2, "HIaaaa");
    }

    @Test
    public void test09547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09547");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "         4                                                                ...44444444444444444444", (java.lang.CharSequence) "CLASS [lJAVA.LANG.sTRING;HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!CLASS [lJAVA.LANG.sTRING;HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!CLASS [lJAVA.LANG.sTRING;", 965);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09548");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!##HI!##AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!##HI!##AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!##HI!##AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test09549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09549");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("###################################################...", ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "###################################################..." });
    }

    @Test
    public void test09550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09550");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("   hi!       hi!       hi!       hi!       hi! hi!hi!   hi!       hi!       hi!       hi!       hi! ");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("hi!hi!", "hi!hi!", (-1));
        int int7 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray6);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("hi!", strArray2, strArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray6);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test09551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09551");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("!ih!ih!ih!ih!i                                                                              ", 314);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                               !ih!ih!ih!ih!i                                                                                                                                                                                             " + "'", str2, "                                                                                                               !ih!ih!ih!ih!i                                                                                                                                                                                             ");
    }

    @Test
    public void test09552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09552");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 40 + "'", int1 == 40);
    }

    @Test
    public void test09553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09553");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("###       #HI#HI#HI#HI#HI#HI#");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "###", "       ", "#", "HI", "#", "HI", "#", "HI", "#", "HI", "#", "HI", "#", "HI", "#" });
    }

    @Test
    public void test09554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09554");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "                             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09555");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("############################################################################################################################################################################################################################################################################hi!hi!hi!    hi!hi!    hi!hi!hi!    hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "############################################################################################################################################################################################################################################################################hi!hi!hi!    hi!hi!    hi!hi!hi!    hi!hi!" + "'", str1, "############################################################################################################################################################################################################################################################################hi!hi!hi!    hi!hi!    hi!hi!hi!    hi!hi!");
    }

    @Test
    public void test09556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09556");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "      ", 1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "!ih!ih");
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray12);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(strArray13);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Comparable<java.lang.String>[]) strArray13);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray13, "      ");
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("!ih!ih", strArray4, strArray13);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '4');
        int int21 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!", "", "hi!", "", "" });
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "", "hi!", "", "" });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!hi!" + "'", str14, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!hi!" + "'", str15, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!            hi!            " + "'", str17, "hi!            hi!            ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "!ih!ih" + "'", str18, "!ih!ih");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test09557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09557");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("              hIH            hIH", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09558");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                                                                                                                                                                                                                                                                                                                   hi!hi!h", "hi! 44hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09559");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "###hi!#######hi!#######hi!#######hi!#######hi!#hi!hi!###hi!#######hi!#######hi!###############################################################################################   hi!       !i   hi!", (java.lang.CharSequence) "                                                                aaaaaa!iH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09560");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "#############################!#############################!#############################!#############################!#############################!#######                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09561");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "HIhia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!aaahia!", (java.lang.CharSequence) "ng;class [Ljava.lang.String;aaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##", (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09562");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "i!    hi!hi!   ######################!ih!ihhi!  ", (java.lang.CharSequence) "hi!    ...", 20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09563");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "!i!i!i", (java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444   !i");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test09564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09564");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("   hi!       hi!    ...", "                                                                                                                                                                                                                                                                                                ###############################################hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!################################################                                                                                                                                                                                                                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09565");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("I!    HI!HI!    HI!HI!HI!    HI!HI!", "I!aI!aI!aI!aI!aI!AAaI!AAaI!aI!aI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H", 746, 1000);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "I!    HI!HI!    HI!HI!HI!    HI!HI!I!aI!aI!aI!aI!aI!AAaI!AAaI!aI!aI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H" + "'", str4, "I!    HI!HI!    HI!HI!HI!    HI!HI!I!aI!aI!aI!aI!aI!AAaI!AAaI!aI!aI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H");
    }

    @Test
    public void test09566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09566");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "Hhi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#I!HI!HI!", (java.lang.CharSequence) "   hi!       hi!    ...");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "Hhi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#I!HI!HI!" + "'", charSequence2, "Hhi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#I!HI!HI!");
    }

    @Test
    public void test09567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09567");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("i!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!", "...    hi...", 724);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "i!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!" });
    }

    @Test
    public void test09568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09568");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split(" hi! h#hi!hi!###hi!hi!#! hi! hi!", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 11);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { " hi! h#hi!hi!###hi!hi!#! hi! hi!" });
    }

    @Test
    public void test09569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09569");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("...a...", "aaa...h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "...a..." });
    }

    @Test
    public void test09570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09570");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "class [Ljava.lang.String;!class [Ljava.lang.String                      ", (java.lang.CharSequence) "4444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "class [Ljava.lang.String;!class [Ljava.lang.String                      " + "'", charSequence2, "class [Ljava.lang.String;!class [Ljava.lang.String                      ");
    }

    @Test
    public void test09571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09571");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("############hi#hi! hi! h#hi!hi!###hi!hi!#! hi! hi!############hi#", 39, "aaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "############hi#hi! hi! h#hi!hi!###hi!hi!#! hi! hi!############hi#" + "'", str3, "############hi#hi! hi! h#hi!hi!###hi!hi!#! hi! hi!############hi#");
    }

    @Test
    public void test09572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09572");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("s");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "s" + "'", str1, "s");
    }

    @Test
    public void test09573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09573");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("!ih!ih!ih!ih!i", 753, " hi!       hi!       hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!ih!ih!ih!ih!i hi!       hi!       hi! hi!       hi!       hi! hi!       hi!       hi! hi!       hi!       hi! hi!       hi!       hi! hi!       hi!       hi! hi!       hi!       hi! hi!       hi!       hi! hi!       hi!       hi! hi!       hi!       hi! hi!       hi!       hi! hi!       hi!       hi! hi!       hi!       hi! hi!       hi!       hi! hi!       hi!       hi! hi!       hi!       hi! hi!       hi!       hi! hi!       hi!       hi! hi!       hi!       hi! hi!       hi!       hi! hi!       hi!       hi! hi!       hi!       hi! hi!       hi!       hi! hi!       hi!       hi! hi!       hi!       hi! hi!       hi!       hi! hi!       hi!       hi! hi!       hi!       hi! hi!       hi!       hi! hi!       hi!       hi! hi!       hi!     " + "'", str3, "!ih!ih!ih!ih!i hi!       hi!       hi! hi!       hi!       hi! hi!       hi!       hi! hi!       hi!       hi! hi!       hi!       hi! hi!       hi!       hi! hi!       hi!       hi! hi!       hi!       hi! hi!       hi!       hi! hi!       hi!       hi! hi!       hi!       hi! hi!       hi!       hi! hi!       hi!       hi! hi!       hi!       hi! hi!       hi!       hi! hi!       hi!       hi! hi!       hi!       hi! hi!       hi!       hi! hi!       hi!       hi! hi!       hi!       hi! hi!       hi!       hi! hi!       hi!       hi! hi!       hi!       hi! hi!       hi!       hi! hi!       hi!       hi! hi!       hi!       hi! hi!       hi!       hi! hi!       hi!       hi! hi!       hi!       hi! hi!       hi!       hi! hi!       hi!     ");
    }

    @Test
    public void test09574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09574");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "hi! hi!", (java.lang.CharSequence) "class [Ljava.lang.String;!class [Ljava.lang.String;hiclass [Ljava.lang.String;!class [Ljava.lang.String;hiclass [Ljava.lang.String;!class [Ljava.lang.String;hiclass [Ljava.lang.String;!class [Ljava.lang.String;hiclass [Ljava.lang.String;!class [Ljava.lang.String;");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09575");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("ring;a.lavass[Ljang.String;cla.lavass[Ljang.String;cla.lavass[LjaCl", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIh HIh");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test09576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09576");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 58);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09577");
        java.lang.CharSequence charSequence0 = null;
        int int2 = org.apache.commons.lang3.StringUtils.countMatches(charSequence0, (java.lang.CharSequence) "Clss [Ljv.lng.String;clss [Ljv.lng.String;clss [Ljv.lng.String;                                                                                                                                                                                                                                                           ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09578");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######", (java.lang.CharSequence) "i!    hi!hi!    hi!hi#######        ", 57);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09579");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######" + "'", str1, "#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######");
    }

    @Test
    public void test09580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09580");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("   hi!       hi!    ...", "!ih!ih                          hi!hi!    hi!hi!hi!    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   hi!       hi!    ..." + "'", str2, "   hi!       hi!    ...");
    }

    @Test
    public void test09581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09581");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh...", 16, 67);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09582");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "!i!i!i");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test09583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09583");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("", 71, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#######################################################################" + "'", str3, "#######################################################################");
    }

    @Test
    public void test09584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09584");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "ng;class [Ljava.lang.String;aaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##", (java.lang.CharSequence) "ring;a.lavass[Ljang.String;cla.lavass[Ljang.String;cla.lavass[LjaCl");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09585");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("                         !ih!ih                     ", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                         !ih!ih                     " + "'", str2, "                         !ih!ih                     ");
    }

    @Test
    public void test09586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09586");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("i!       4444444444444444444444444444444444444444444444444444444444", "                                                                                 4444444444444444", "Aaaaaaaaaaaaclass [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;aaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test09587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09587");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("         4                                                          ", "#hi!hi!###hi!hi!#");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         4                                                          " + "'", str2, "         4                                                          ");
    }

    @Test
    public void test09588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09588");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("     !IH!IH!IH!IH!IH!IHH       !IH!IH!IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!IH!IH!IH!IH!IH!IHH       !IH!IH!IH" + "'", str1, "!IH!IH!IH!IH!IH!IHH       !IH!IH!IH");
    }

    @Test
    public void test09589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09589");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "          ", (java.lang.CharSequence) "   !ih!ih       !ih       !ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaih       !ih       !ih      !ih", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09590");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("salc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalcIHalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssal", "   #####################################################################", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test09591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09591");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "#########hi!#########", (java.lang.CharSequence) "Clss [Ljv.lng.String;clss [Ljv.lng.String;clss [Ljv.lng.String;");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09592");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("", "HI! HI! HI! HI! HI! HI!HI! HI! HI! HI! HI! HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09593");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test09594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09594");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat('#', 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##########" + "'", str2, "##########");
    }

    @Test
    public void test09595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09595");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("   hi!       hHI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "   HI!       HHI!HI!HI!HI!HI!HI!" + "'", str1, "   HI!       HHI!HI!HI!HI!HI!HI!");
    }

    @Test
    public void test09596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09596");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "ring;class [Ljava.lang.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09597");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("", "!ih!ih!ih!ih!ih!ihHHHHHHHH!IH");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
    }

    @Test
    public void test09598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09598");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("!IH!IH!IH!IH!IH!IHH#######!IH####################################################", "                     ", "          hi!hi!h          hi!hi!h                                    !i", 141);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "!IH!IH!IH!IH!IH!IHH#######!IH####################################################" + "'", str4, "!IH!IH!IH!IH!IH!IHH#######!IH####################################################");
    }

    @Test
    public void test09599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09599");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!a##############################################################################################################################################################################################################################################################################################################################################################################################Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!h!h!h", 11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09600");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("44444444444444444444444444444444444444444444444444444444444444444444444444444", 268, "hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##44444444444444444444444444444444444444444444444444444444444444444444444444444hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##h" + "'", str3, "hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##44444444444444444444444444444444444444444444444444444444444444444444444444444hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##h");
    }

    @Test
    public void test09601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09601");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "h               ", (java.lang.CharSequence) "Class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09602");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "hI! 44HI! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09603");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("h               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test09604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09604");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("hiH            hiH                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ", "#############    !ih!ihh!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hiH            hiH                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     " + "'", str2, "hiH            hiH                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
    }

    @Test
    public void test09605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09605");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09606");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!hi!hi!h                               i!    hi!hi!    hi!hi!hi!    hi!hi!                                  hi!hi!h", "I44444");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) " !ihhi!hi!######################   !ih!ih    !i", (java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!hi!hi!h                               i!    hi!hi!    hi!hi!hi!    hi!hi!                                  hi!hi!h" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test09607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09607");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("...aaaaaaaaaaaaaaaaaaaaaa", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...aaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "...aaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test09608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09608");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "###################################");
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "hi!       ", (java.lang.CharSequence[]) strArray4);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                             hi!hi!                                              ", "Hi!#hi!hi!###hi!hi!#", (int) (short) -1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hia!aaahia!aaa", strArray4, strArray9);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray9, "ring;             a.lavass [Ljang.String;cla.lavass [Ljang.String;cla.lavass [LjaCl");
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.stripAll(strArray12, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    hi!                                ");
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray14, "...#######!ih!ih#####################...");
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "...#######!ih!ih#####################......#######!ih!ih#####################......#######!ih!ih#####################......#######!ih!ih#####################......#######!ih!ih#####################......#######!ih!ih#####################..." + "'", str16, "...#######!ih!ih#####################......#######!ih!ih#####################......#######!ih!ih#####################......#######!ih!ih#####################......#######!ih!ih#####################......#######!ih!ih#####################...");
    }

    @Test
    public void test09609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09609");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("", "                         HI!HI!HI!HI!HI!H   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09610");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("         HI ! HI ! HI ! HI ! HI ! H", 0, "...ih ! ih ! ...                                      #######ih!ih    !ih!ih    !i                                                                                            #######ih!ih    !ih!ih    !i                                                                                            #######ih!ih    !ih!ih    !i                                                                                            #######ih!ih    !ih!ih    !i                                                                                            #######ih!ih    !ih!ih    !i                                                                                            #######ih!ih    !ih!ih    !i                                                         ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "         HI ! HI ! HI ! HI ! HI ! H" + "'", str3, "         HI ! HI ! HI ! HI ! HI ! H");
    }

    @Test
    public void test09611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09611");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "###################################44444444444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence) "HI!HI!HI!HI!HI!H   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09612");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444" + "'", str1, "444444");
    }

    @Test
    public void test09613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09613");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!IH!IH!IH!!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!IH!IH!IH!!", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09614");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("...hi!h...");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "...hi!h..." });
    }

    @Test
    public void test09615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09615");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("class [Ljava.lang.String;", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "clss [Ljv.lng.String;" + "'", str2, "clss [Ljv.lng.String;");
    }

    @Test
    public void test09616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09616");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "            Ih!ih!ih!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09617");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa##!IH##!IHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa##!IH##!IHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa" });
    }

    @Test
    public void test09618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09618");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "                                    !IH!IH!IH!IH!IH!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09619");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("            CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;             ", "        ...    hi...                                                                      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "            CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;" + "'", str2, "            CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;");
    }

    @Test
    public void test09620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09620");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase(" !ih!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " !IH!IH" + "'", str1, " !IH!IH");
    }

    @Test
    public void test09621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09621");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("", '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
    }

    @Test
    public void test09622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09622");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIi!    hi!hi!   ######################!ih!ihhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09623");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals(charSequence0, (java.lang.CharSequence) "i!    hi!hi!    hi!hi!hi!    hi!hi!i!    hi!hi!    hi!hi!hi!    hi!hi!i!    hi!hi!    hi!hi!hi!    hi!hi!i!    hi!hi!    hi!hi!hi!    hi!hi!i!    hi!hi!    hi!hi!hi!    hi!hi!i!    hi!hi!    hi!hi!hi!    hi!hi!i!    hi!hi!    hi!hi!hi!    hi!hi!i!    hi!hi!    hi!hi!hi!    hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09624");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "            CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;             ", "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 24 + "'", int2 == 24);
    }

    @Test
    public void test09625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09625");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "hi!!ih!ih!ih!ihhi!!ih!ih!ih!ih", (java.lang.CharSequence) "Aaa...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09626");
        char[] charArray6 = new char[] { 'a', '4', 'a' };
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hi!h", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "aaaaaaaaaa", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { 'a', '4', 'a' });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test09627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09627");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("!", "ng.String;             a.lavass [Ljang.String;cla.lavass [Ljang.String;cla.lavass [LjaCl");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!" + "'", str2, "!");
    }

    @Test
    public void test09628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09628");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!", (java.lang.CharSequence) "hAH            hAH                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ", 729);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09629");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("hi!       hi!       hihi!       hi!       hi!hi!       hi!       hihi!       hi!       hi!hi!       hi!       hihi!       hi!       hi!hi!       hi!       hihi!       hi!       hi!hi!       hi!       hi   hi!       hi!       hihi!       hi!       hi! hi!       hi!       hihi!       hi!       hi!hi!       hi!       hihi!       hi!       hi!hi!       hi!       hihi!       hi!       hi!hi!       hi!       hihi!       hi!       hi!hi!       hi!       hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!       hi!       hihi!       hi!       hi!hi!       hi!       hihi!       hi!       hi!hi!       hi!       hihi!       hi!       hi!hi!       hi!       hihi!       hi!       hi!hi!       hi!       hi   hi!       hi!       hihi!       hi!       hi! hi!       hi!       hihi!       hi!       hi!hi!       hi!       hihi!       hi!       hi!hi!       hi!       hihi!       hi!       hi!hi!       hi!       hihi!       hi!       hi!hi!       hi!       hi" + "'", str1, "hi!       hi!       hihi!       hi!       hi!hi!       hi!       hihi!       hi!       hi!hi!       hi!       hihi!       hi!       hi!hi!       hi!       hihi!       hi!       hi!hi!       hi!       hi   hi!       hi!       hihi!       hi!       hi! hi!       hi!       hihi!       hi!       hi!hi!       hi!       hihi!       hi!       hi!hi!       hi!       hihi!       hi!       hi!hi!       hi!       hihi!       hi!       hi!hi!       hi!       hi");
    }

    @Test
    public void test09630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09630");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("44444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444" + "'", str1, "44444444");
    }

    @Test
    public void test09631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09631");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "     HI!HI!HI!HI!HI!HI!                            ", (java.lang.CharSequence) "class ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09632");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "                       ", (java.lang.CharSequence) "I!HI!#I!HI!#I!HI!#I!HI!#I!HI!#I!HI!#");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09633");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                 ", "######################!ih!ih");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                                                 " });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09634");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "!IH!IH!IH!IH!IH!IHH#######!IH####################################################", 718);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09635");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("...##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################Aaaaaaaaaaaaclass [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;aaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##", ' ', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################Aaaaaaaaaaaaclassa[Ljava.lang.String;classa[Ljava.lang.String;classa[Ljava.lang.String;aaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##" + "'", str3, "...##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################Aaaaaaaaaaaaclassa[Ljava.lang.String;classa[Ljava.lang.String;classa[Ljava.lang.String;aaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##");
    }

    @Test
    public void test09636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09636");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("Hclass[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hclass[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;" + "'", str1, "Hclass[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;");
    }

    @Test
    public void test09637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09637");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test09638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09638");
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray9);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(strArray10);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray10, "hi!#hi!hi!###hi!hi!#");
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray13, ' ');
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.stripAll(strArray13, "!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!");
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence[]) strArray13);
        int int19 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "###    ###", (java.lang.CharSequence[]) strArray13);
        java.lang.String[] strArray20 = null;
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hiiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!!iaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!                                ", strArray13, strArray20);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!       ", (java.lang.CharSequence[]) strArray13);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!", "", "hi!", "", "" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!", "", "hi!", "", "" });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!hi!" + "'", str11, "hi!hi!");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "", "", "", "", "" });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "    " + "'", str15, "    ");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "", "", "", "" });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hiiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!!iaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!                                " + "'", str21, "hiiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!!iaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!                                ");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test09639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09639");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("Class [ljava.lang.string;class [ljava.lang.string;cl      !ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Class [ljava.lang.string;class [ljava.lang.string;cl      !ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!i" + "'", str1, "Class [ljava.lang.string;class [ljava.lang.string;cl      !ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!i");
    }

    @Test
    public void test09640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09640");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("CLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;" + "'", str1, "CLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;");
    }

    @Test
    public void test09641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09641");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!  hi!  ", "#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!######");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!  hi!  " + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!  hi!  ");
    }

    @Test
    public void test09642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09642");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("    ", (int) (short) 1, "    c  aaaaaaaaaaa###############################################################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    " + "'", str3, "    ");
    }

    @Test
    public void test09643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09643");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("HI!       !i   HI!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!       !i   HI!" + "'", str2, "HI!       !i   HI!");
    }

    @Test
    public void test09644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09644");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "Hi!#hi!hi!###hi!hi!#Class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09645");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("###hi!#######hi!##########################!ih!ih", "###hi!#######hi!#######hi!#######hi!#######hi!#hi!hi!###hi!#######hi!#######hi!###############################################################################################   hi!       !i   hi!#");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09646");
        char[] charArray7 = new char[] { '#', '#' };
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "###################################", charArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!#hi!hi!###hi!hi!#", charArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HI!", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "!ih!ih                          hi!hi!    hi!hi!hi!    ", charArray7);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii!h!iiiiiii!HI!HI!HI!HI!HI!HI!iiiiiiiiiiiiiiiii", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '#', '#' });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test09647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09647");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "hi! 44hi!", (java.lang.CharSequence) "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09648");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   IH!IH!IH!IH!LANG.STRING;CLASS[LJAVA.LANG.STRING;CLASS[LJAVA.LANG.STRING;AAAAAAAAA!ih!ih!ih!", '4', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   IH!IH!IH!IH!LANG.STRING;CLASS[LJAVA.LANG.STRING;CLASS[LJAVA.LANG.STRING;AAAAAAAAA!ih!ih!ih!" + "'", str3, "hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   IH!IH!IH!IH!LANG.STRING;CLASS[LJAVA.LANG.STRING;CLASS[LJAVA.LANG.STRING;AAAAAAAAA!ih!ih!ih!");
    }

    @Test
    public void test09649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09649");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "aaaaa", 68);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09650");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("h!ih!ih!ih!ih!ih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h!ih!ih!ih!ih!ih!" + "'", str1, "h!ih!ih!ih!ih!ih!");
    }

    @Test
    public void test09651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09651");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                     hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi                                      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                     hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi                                     " + "'", str1, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                     hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi                                     ");
    }

    @Test
    public void test09652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09652");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("", "                 !ih  !ih                                  !ih  !ih                                  !ih  !ih                                  !ih  !ih                                  !ih  !ih                                  !ih  !ih                                  !ih  !ih                                  !ih  !ih                                  !ih  !ih                                  !ih  !ih                                  !ih  !ih                                  !ih  !ih                                  !ih  !ih                                  !ih  !ih                                  !ih                                                                                      hi!hi!hi!hhi!hi!hhi!hi!hi!hhi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09653");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat('4', 90);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test09654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09654");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "############hi##ih#ih#ih#ihhi##ih#ih#ih#ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09655");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("!i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!i" + "'", str1, "!i");
    }

    @Test
    public void test09656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09656");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09657");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hhhhhhhhhhhhhhhh!hi!hi!...", (java.lang.CharSequence) "HI!AAHI!AAhi!hi!hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test09658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09658");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   IH!IH!IH!IH!LANG.STRING;CLASS[LJAVA.LANG.STRING;CLASS[LJAVA.LANG.STRING;AAAAAAAAA!ih!ih!ih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   IH!IH!IH!IH!LANG.STRING;CLASS[LJAVA.LANG.STRING;CLASS[LJAVA.LANG.STRING;AAAAAAAAA!ih!ih!ih!" + "'", str1, "hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   IH!IH!IH!IH!LANG.STRING;CLASS[LJAVA.LANG.STRING;CLASS[LJAVA.LANG.STRING;AAAAAAAAA!ih!ih!ih!");
    }

    @Test
    public void test09659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09659");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("4444!ih!ih");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "4444", "!", "ih", "!", "ih" });
    }

    @Test
    public void test09660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09660");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "I!    HI!HI!    HI!HI!HI!    HI!HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09661");
        java.lang.CharSequence charSequence1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "hi!hi!hi!hi!hi!", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09662");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "ass [ljava.lang.string;class [ljava.lang.string;!ih!ih       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09663");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test09664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09664");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("I!HI!#I!HI!#I!HI!#I!HI!#I!HI!#I!HI!#!ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih               !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih               !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih               !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih               !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih               !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih               !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih               !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih               !ih!ih !ih!ih !i", 118);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih               !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih               !ih!ih !ih!ih !i" + "'", str2, "!ih               !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih               !ih!ih !ih!ih !i");
    }

    @Test
    public void test09665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09665");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "hi!hi!hi!hi!hi!hHI!AAHI!AAhi!hi!hi!hi!hi!h");
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "   ", (java.lang.CharSequence[]) strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "HI!HI!HI!HI!HI!H");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "AHIA!AHIA!AHIA!AHIA!AHIA!AHIA!A");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "classAHIA!AHIA!AHIA!AHIA!AHIA!AHIA!A AHIA!AHIA!AHIA!AHIA!AHIA!AHIA!A[AHIA!AHIA!AHIA!AHIA!AHIA!AHIA!ALjavaAHIA!AHIA!AHIA!AHIA!AHIA!AHIA!A.AHIA!AHIA!AHIA!AHIA!AHIA!AHIA!AlangAHIA!AHIA!AHIA!AHIA!AHIA!AHIA!A.AHIA!AHIA!AHIA!AHIA!AHIA!AHIA!AStringAHIA!AHIA!AHIA!AHIA!AHIA!AHIA!A;AHIA!AHIA!AHIA!AHIA!AHIA!AHIA!AclassAHIA!AHIA!AHIA!AHIA!AHIA!AHIA!A AHIA!AHIA!AHIA!AHIA!AHIA!AHIA!A[AHIA!AHIA!AHIA!AHIA!AHIA!AHIA!ALjavaAHIA!AHIA!AHIA!AHIA!AHIA!AHIA!A.AHIA!AHIA!AHIA!AHIA!AHIA!AHIA!AlangAHIA!AHIA!AHIA!AHIA!AHIA!AHIA!A.AHIA!AHIA!AHIA!AHIA!AHIA!AHIA!AStringAHIA!AHIA!AHIA!AHIA!AHIA!AHIA!A;AHIA!AHIA!AHIA!AHIA!AHIA!AHIA!AclassAHIA!AHIA!AHIA!AHIA!AHIA!AHIA!A AHIA!AHIA!AHIA!AHIA!AHIA!AHIA!A[AHIA!AHIA!AHIA!AHIA!AHIA!AHIA!ALjavaAHIA!AHIA!AHIA!AHIA!AHIA!AHIA!A.AHIA!AHIA!AHIA!AHIA!AHIA!AHIA!AlangAHIA!AHIA!AHIA!AHIA!AHIA!AHIA!A.AHIA!AHIA!AHIA!AHIA!AHIA!AHIA!AStringAHIA!AHIA!AHIA!AHIA!AHIA!AHIA!A;" + "'", str9, "classAHIA!AHIA!AHIA!AHIA!AHIA!AHIA!A AHIA!AHIA!AHIA!AHIA!AHIA!AHIA!A[AHIA!AHIA!AHIA!AHIA!AHIA!AHIA!ALjavaAHIA!AHIA!AHIA!AHIA!AHIA!AHIA!A.AHIA!AHIA!AHIA!AHIA!AHIA!AHIA!AlangAHIA!AHIA!AHIA!AHIA!AHIA!AHIA!A.AHIA!AHIA!AHIA!AHIA!AHIA!AHIA!AStringAHIA!AHIA!AHIA!AHIA!AHIA!AHIA!A;AHIA!AHIA!AHIA!AHIA!AHIA!AHIA!AclassAHIA!AHIA!AHIA!AHIA!AHIA!AHIA!A AHIA!AHIA!AHIA!AHIA!AHIA!AHIA!A[AHIA!AHIA!AHIA!AHIA!AHIA!AHIA!ALjavaAHIA!AHIA!AHIA!AHIA!AHIA!AHIA!A.AHIA!AHIA!AHIA!AHIA!AHIA!AHIA!AlangAHIA!AHIA!AHIA!AHIA!AHIA!AHIA!A.AHIA!AHIA!AHIA!AHIA!AHIA!AHIA!AStringAHIA!AHIA!AHIA!AHIA!AHIA!AHIA!A;AHIA!AHIA!AHIA!AHIA!AHIA!AHIA!AclassAHIA!AHIA!AHIA!AHIA!AHIA!AHIA!A AHIA!AHIA!AHIA!AHIA!AHIA!AHIA!A[AHIA!AHIA!AHIA!AHIA!AHIA!AHIA!ALjavaAHIA!AHIA!AHIA!AHIA!AHIA!AHIA!A.AHIA!AHIA!AHIA!AHIA!AHIA!AHIA!AlangAHIA!AHIA!AHIA!AHIA!AHIA!AHIA!A.AHIA!AHIA!AHIA!AHIA!AHIA!AHIA!AStringAHIA!AHIA!AHIA!AHIA!AHIA!AHIA!A;");
    }

    @Test
    public void test09666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09666");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "hi! hi                                        hi! hi", (java.lang.CharSequence) "Hi!              ", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09667");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "classAHIA!AHIA!AHIA!AHIA!AHIA!AHIA!A AHIA!AHIA!AHIA!AHIA!AHIA!AHIA!A[AHIA!AHIA!AHIA!AHIA!AHIA!AHIA!ALjavaAHIA!AHIA!AHIA!AHIA!AHIA!AHIA!A.AHIA!AHIA!AHIA!AHIA!AHIA!AHIA!AlangAHIA!AHIA!AHIA!AHIA!AHIA!AHIA!A.AHIA!AHIA!AHIA!AHIA!AHIA!AHIA!AStringAHIA!AHIA!AHIA!AHIA!AHIA!AHIA!A;AHIA!AHIA!AHIA!AHIA!AHIA!AHIA!AclassAHIA!AHIA!AHIA!AHIA!AHIA!AHIA!A AHIA!AHIA!AHIA!AHIA!AHIA!AHIA!A[AHIA!AHIA!AHIA!AHIA!AHIA!AHIA!ALjavaAHIA!AHIA!AHIA!AHIA!AHIA!AHIA!A.AHIA!AHIA!AHIA!AHIA!AHIA!AHIA!AlangAHIA!AHIA!AHIA!AHIA!AHIA!AHIA!A.AHIA!AHIA!AHIA!AHIA!AHIA!AHIA!AStringAHIA!AHIA!AHIA!AHIA!AHIA!AHIA!A;AHIA!AHIA!AHIA!AHIA!AHIA!AHIA!AclassAHIA!AHIA!AHIA!AHIA!AHIA!AHIA!A AHIA!AHIA!AHIA!AHIA!AHIA!AHIA!A[AHIA!AHIA!AHIA!AHIA!AHIA!AHIA!ALjavaAHIA!AHIA!AHIA!AHIA!AHIA!AHIA!A.AHIA!AHIA!AHIA!AHIA!AHIA!AHIA!AlangAHIA!AHIA!AHIA!AHIA!AHIA!AHIA!A.AHIA!AHIA!AHIA!AHIA!AHIA!AHIA!AStringAHIA!AHIA!AHIA!AHIA!AHIA!AHIA!A;", (java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        iIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", 468);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09668");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            HI!HI!H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09669");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("################################################################################################################################################################################################################################################################################################################################################################hI             #################################################################################################################################################################################################################################################################################################################################################################", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444   !i", "!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "################################################################################################################################################################################################################################################################################################################################################################hI#################################################################################################################################################################################################################################################################################################################################################################" + "'", str3, "################################################################################################################################################################################################################################################################################################################################################################hI#################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test09670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09670");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "##########################   ...", (java.lang.CharSequence) "Hi!#hi!hi!###hi!hi!#Class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09671");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahiH hiH", 37, 14);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaa");
    }

    @Test
    public void test09672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09672");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("A", "hiH hiH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A" + "'", str2, "A");
    }

    @Test
    public void test09673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09673");
        java.lang.Object[] objArray0 = null;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(objArray0, 'a', 97, 719);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test09674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09674");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!...", 70, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaa!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!..." + "'", str3, "aaaaaaaaaaaaaaaaaa!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!...");
    }

    @Test
    public void test09675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09675");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#IH#IH#IH#IH#IH#IH", "                                                                                                               !ih!ih!ih!ih!i                                                                                                                                                                                             ", 724, 263);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                               !ih!ih!ih!ih!i                                                                                                                                                                                             " + "'", str4, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                               !ih!ih!ih!ih!i                                                                                                                                                                                             ");
    }

    @Test
    public void test09676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09676");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "Hi!#hi!hi!###hi!hi!#", 40);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '#');
        int int8 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "I!    HI!HI!    HI!HI!HI!    HI!HI!", (int) (byte) 100, 9);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test09677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09677");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("HI! HI! H#HI!HI!###HI!HI!#! HI! HI!", "aaaaaaaaaaaaaac");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HI! HI! H#HI!HI!###HI!HI!#! HI! HI!" });
    }

    @Test
    public void test09678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09678");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "!ih!ih!  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09679");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("                                     hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!                                     ", "hi!hi!   ", "444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                     hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!444444                                  " + "'", str3, "                                     hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!444444                                  ");
    }

    @Test
    public void test09680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09680");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("HI!#HI!HI!###HI!HI!#", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09681");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii!h!iiiiiii!HI!HI!HI!HI!HI!HI!iiiiiiiiiiiiiiiii", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii!h!iiiiiii!HI!HI!HI!HI!HI!HI!iiiiiiiiiiiiiiiii" + "'", str2, "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii!h!iiiiiii!HI!HI!HI!HI!HI!HI!iiiiiiiiiiiiiiiii");
    }

    @Test
    public void test09682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09682");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi!", '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi!" });
    }

    @Test
    public void test09683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09683");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("!ih!ih!  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih!ih!" + "'", str1, "!ih!ih!");
    }

    @Test
    public void test09684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09684");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                                     hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi                                      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi" + "'", str1, "hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi HIhi hi hi hi hi ahi hi hi hi hi  hi hi hi hi hi ahi hi hi hi hi");
    }

    @Test
    public void test09685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09685");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "      ", (java.lang.CharSequence[]) strArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "!ih!ihhhhhhhhhhhhhhhhhhhhhhhhhhhhaaa444444444444444444444444444444444444!ih!ihhhhhhhhhhhhhhhhhhhhhhhhhhhhaaa444444444444444444444444444444444444!ih!ihhhhhhhhhhhhhhhhhhhhhhhhhhhhaaa444444444444444444444444444444444444!ih!ihhhhhhhhhhhhhhhhhhhhhhhhhhhhaaa444444444444444444444444444444444444!ih!ihhhhhhhhhhhhhhhhhhhhhhhhhhhhaaa44444444444444444444hi! h#hi!hi!###hi!hi!#! hi! hi!!ih!ihhhhhhhhhhhhhhhhhhhhhhhhhhhhaaa444444444444444444444444444444444444!ih!ihhhhhhhhhhhhhhhhhhhhhhhhhhhhaaa444444444444444444444444444444444444!ih!ihhhhhhhhhhhhhhhhhhhhhhhhhhhhaaa444444444444444444444444444444444444!ih!ihhhhhhhhhhhhhhhhhhhhhhhhhhhhaaa444444444444444444444444444444444444!ih!ihhhhhhhhhhhhhhhhhhhhhhhhhhhhaaa44444444444444444444", 24, 108);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 24 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test09686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09686");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) ".................................................................................................", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09687");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("444444444444444444444444444444444444444444444444444444444444444444   !i");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "444444444444444444444444444444444444444444444444444444444444444444", "!i" });
    }

    @Test
    public void test09688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09688");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "                                                               hi ! hi...", (java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                             hi! !I hi!");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "                                                               hi ! hi..." + "'", charSequence2, "                                                               hi ! hi...");
    }

    @Test
    public void test09689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09689");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByCharacterType("HI!HI!HI!HI!HI!HI!");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.split("hi!hi!", "hi!hi!", (-1));
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hi!       hi!       hi!       hi!       hi! hi!hi!   hi!       hi!       hi!       hi!       hi!", strArray5, strArray9);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray9, "hi!       hHI!HI!HI!HI!HI!HI!");
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("HI!", "ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!", (int) 'a');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("...    hi...", strArray9, strArray16);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9, "HI!", 0, (int) (byte) 0);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "                                                                        ", (java.lang.CharSequence[]) strArray9);
        java.lang.String[] strArray25 = org.apache.commons.lang3.StringUtils.split("######################    !ih!ih", 'a');
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("!ih!ih!ih!ih!i                                                                              ", strArray9, strArray25);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "HI", "!", "HI", "!", "HI", "!", "HI", "!", "HI", "!", "HI", "!" });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!       hi!       hi!       hi!       hi! hi!hi!   hi!       hi!       hi!       hi!       hi!" + "'", str10, "hi!       hi!       hi!       hi!       hi! hi!hi!   hi!       hi!       hi!       hi!       hi!");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "HI!" });
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "...    hi..." + "'", str17, "...    hi...");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "######################    !ih!ih" });
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "!ih!ih!ih!ih!i                                                                              " + "'", str26, "!ih!ih!ih!ih!i                                                                              ");
    }

    @Test
    public void test09690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09690");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("######################    !ih!ih", "aaaaaaaaaaaaaaaaaaaaaaaaa");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "44444444444444444444", (java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "######################    !ih!ih" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test09691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09691");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!", "              hi!       hi!       hi!       hi!       hi!       hi!       hi###    ###              ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09692");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "Hi! 44hi! ", (java.lang.CharSequence) "        ...    hi...                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09693");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                                                                           hi!hi!", "###hi!#######hi!##########################!ih!ih", (-1));
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                                                                           " });
    }

    @Test
    public void test09694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09694");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "###hi!#######hi!##########################    !ih!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09695");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("#########################################################################################################...", 93, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#########################################################################################################..." + "'", str3, "#########################################################################################################...");
    }

    @Test
    public void test09696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09696");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444444444444444444444444444444444444", "   ", 39);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##A", (java.lang.CharSequence[]) strArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "ng;class [ljava.lang.string;class [ljava.lang.string;!ih!ih         ", (java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "4444444444444444444444444444444444444444" });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test09697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09697");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("!IH !IH!IH !IH !IH !IH !IH !IH                                                     ", "#hi!hi!###hi!hi!#", 721);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "!IH !IH!IH !IH !IH !IH !IH !IH                                                     " });
    }

    @Test
    public void test09698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09698");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "         4                                                                                                                                                                                                                                                                                                                ", (java.lang.CharSequence) "                      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test09699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09699");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "H !IH !IH !IH !IH!IH !IH !IH !IH !IH !IH                                                     ", (java.lang.CharSequence) "        ###hi!#######hi!#######hi!#######hi!#######hi!#hi!hi!###hi!#######hi!#######hi!##        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09700");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIi!    hi!hi!   ######################!ih!ihhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIi!    hi!hi!   ######################!ih!ihhi!" + "'", str1, "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIi!    hi!hi!   ######################!ih!ihhi!");
    }

    @Test
    public void test09701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09701");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("i!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I!" + "'", str1, "I!");
    }

    @Test
    public void test09702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09702");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!HI!HI!HI!HI" + "'", str1, "HI!HI!HI!HI!HI!HI");
    }

    @Test
    public void test09703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09703");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("hi! hi! h#hi!hi!###hi!hi!#! hi! hi!", 35);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi! hi! h#hi!hi!###hi!hi!#! hi! hi!" + "'", str2, "hi! hi! h#hi!hi!###hi!hi!#! hi! hi!");
    }

    @Test
    public void test09704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09704");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("     aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!a                                     ", "HI!AAHI!AA", "###############################################################################################   hi!       !I   hi!    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "     aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!a                                     " + "'", str3, "     aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!a                                     ");
    }

    @Test
    public void test09705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09705");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("IH!IH!IH!IH!IH!IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IH!IH!IH!IH!IH!IH" + "'", str1, "IH!IH!IH!IH!IH!IH");
    }

    @Test
    public void test09706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09706");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("444444444444444444444444444444444444444444444444444444444!ih!ih!ih!ih!i", "hi!#", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                 ih!ih!ih!ih");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test09707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09707");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aHIaHIaaHIaHIaaHI...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test09708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09708");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii!IH!IH!IH!IH!IH!IH!iiiiiii!h!iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii!IH!IH!IH!IH!IH!IH!iiiiiii!h!iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii" + "'", str2, "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii!IH!IH!IH!IH!IH!IH!iiiiiii!h!iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
    }

    @Test
    public void test09709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09709");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("hi!!ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih               !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih               hi!!ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih               !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih               ", "                                   hi!       hHI!HI!HI!HI!HI!HI!                                      hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!     hi!h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09710");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                                                                                                                                                                                                                                                                                                                                                                                                                                             hi! !I hi!", 76, "Hi!#hi!hi!###hi!hi!#Class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                             hi! !I hi!" + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                                                                                             hi! !I hi!");
    }

    @Test
    public void test09711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09711");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clHIclss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;cls", (java.lang.CharSequence) "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!hi!            hiHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", 71);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09712");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                                                                                                                                                                                                                                                             class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;                                                                                                                                                                                                                                                                                                                                                      ", "", 141);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "class", "[Ljava.lang.String;class", "[Ljava.lang.String;class", "[Ljava.lang.String;" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test09713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09713");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "444444444444444                               i!    hi!hi!    hi!hi#######        444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09714");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("###############44###############", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###############44###############" + "'", str2, "###############44###############");
    }

    @Test
    public void test09715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09715");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("c                                                                                           hi!hi!va.lang.string;class [ljava.lang.string;class [ljava.lang.string;", "###HI!#######HI!##########################    !IH!IH###HI!#######HI!##########################    !IH!IH###HI!#######HI!##########################    !IH!IH###HI!#######HI!##########################    !IH!IH###HI!#######HI!##########################    !IH!IH###HI!#######HI!##########################    !IH!IH###HI!#######HI!##########################    !IH!IH###HI!#######HI!##########################    !IH!IH###HI!#######HI!##########################    !IH!IH###HI!#######HI!##########################    !IH!IH###HI!#######HI!##########################    !IH!IH###HI!#######HI!##########################    !IH!IH###HI!#######HI!##########################    !IH!IH###HI!#######HI!################HI!HI!HI!    HI!HI!    HI!HI!HI!    HI!HI!   ", 81);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "c                                                                                           hi!hi!va.lang.string;class [ljava.lang.string;class [ljava.lang.string;" + "'", str3, "c                                                                                           hi!hi!va.lang.string;class [ljava.lang.string;class [ljava.lang.string;");
    }

    @Test
    public void test09716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09716");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("hi!  hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         iIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", 17);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                iIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                iIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
    }

    @Test
    public void test09717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09717");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("########### Ih!ih!ih!i", ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "###########", "Ih!ih!ih!i" });
    }

    @Test
    public void test09718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09718");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "               ", 141);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09719");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                 ", "i!    hi!hi!    hi!hi!hi!    hi!hi!  ");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444   !i", (java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test09720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09720");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "      !ih!ih!!ih!ih!!ih   Hi!Hi!a                                                                 ", "class[LhI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09721");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "HI!HI!HI!H", 9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09722");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!" + "'", str1, "hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!");
    }

    @Test
    public void test09723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09723");
        char[] charArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaa!iH", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09724");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!##HI!##AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str2, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test09725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09725");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "   hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi! ", (java.lang.CharSequence) "!     ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 69 + "'", int2 == 69);
    }

    @Test
    public void test09726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09726");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "hAH            hAH                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ", (java.lang.CharSequence) "IH!IH!IH!IH!LANG.STRING;CLASS[LJAVA.LANG.STRING;CLASS[LJAVA.LANG.STRING;AAAAAAAAA!ih!ih!ih!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09727");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("4444444CLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;", 84);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09728");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "      !ih!ih!!ih!ih!!ih   Hi!Hi!a", (java.lang.CharSequence) "         4                                                                                                                                                                                                                                                                                                                hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09729");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!", "");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "", 10, 3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, ' ', 118, 71);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test09730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09730");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("!ih!ih!ih!", "                                        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih!ih!ih!" + "'", str2, "!ih!ih!ih!");
    }

    @Test
    public void test09731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09731");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "H444444444444444444444444444444HI!HI!HI!H...", (java.lang.CharSequence) "hi!       hi!    ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09732");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("hi!hi!", "   hi!    ", 1);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##", (java.lang.CharSequence[]) strArray6);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.split("Class ...");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("hi!hi!    hi!hi!hi!    ", strArray6, strArray9);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.split("salc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalcIHalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc", "###    ###");
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEach("AAAAAAAAAAAA", strArray9, strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 2 vs 31");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "Class", "..." });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!hi!    hi!hi!hi!    " + "'", str10, "hi!hi!    hi!hi!hi!    ");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "s" + "'", str14, "s");
    }

    @Test
    public void test09733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09733");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!    hi!hi!    hi!hi!hi!    hi!hi!   ##############################", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09734");
        java.lang.CharSequence charSequence8 = null;
        char[] charArray15 = new char[] { '#', '#', ' ', '#', '#', 'a' };
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone(charSequence8, charArray15);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hi!hi!    ", charArray15);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "#######", charArray15);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!", charArray15);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!hi!hi!    hi!hi!    hi!hi!hi!    hi!hi!    ", charArray15);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "            ", charArray15);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!            hi!            ", charArray15);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "i!4444hi!hi!4444hi!hi#######", charArray15);
        int int24 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;Aaaaaaa", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '#', '#', ' ', '#', '#', 'a' });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
    }

    @Test
    public void test09735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09735");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "Class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;claHIclass [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;clas", (java.lang.CharSequence) "444444444444444                               i!    hi!hi!    hi!hi#######        444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09736");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("...444444444", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...444444444" + "'", str2, "...444444444");
    }

    @Test
    public void test09737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09737");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "ih44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09738");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("   hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi!" + "'", str1, "hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi!");
    }

    @Test
    public void test09739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09739");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("  hi!hi!hi!hi!hi!                                                                         ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "  hi!hi!hi!hi!hi!                                                                         " });
    }

    @Test
    public void test09740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09740");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!######", "...##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################Aaaaaaaaaaaaclassa[Ljava.lang.String;classa[Ljava.lang.String;classa[Ljava.lang.String;aaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!######" + "'", str2, "#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!#######IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!######");
    }

    @Test
    public void test09741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09741");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", "                                                  ", 74);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa..." });
    }

    @Test
    public void test09742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09742");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("hi!class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String", 42, 756);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "g.String;class[Ljava.lang.String;class[Ljava.lang.String" + "'", str3, "g.String;class[Ljava.lang.String;class[Ljava.lang.String");
    }

    @Test
    public void test09743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09743");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Hi!", "hi!");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "HIh HIh");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "Hi!" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "i!" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hi!" + "'", str6, "Hi!");
    }

    @Test
    public void test09744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09744");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IH!IH!IH!!IHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaai!hi!#", (java.lang.CharSequence) "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii!h!iiiiiii!HI!HI!HI!HI!HI!HI!iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09745");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("i!h", "!IH!IH!IH!IH!IH!IHH       !IH#######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("!IH!IH!IH!IH!IH!IH", "hi!       hHI!HI!HI!HI!HI!HI!");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, '#', 646, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;             ", strArray3, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 2 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "i", "h" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "!IH!IH!IH!IH!IH!IH" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "!IH!IH!IH!IH!IH!IH" + "'", str7, "!IH!IH!IH!IH!IH!IH");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test09746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09746");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "                                ", (java.lang.CharSequence) "hi!       hi!    ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09747");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("ring;class [Ljava.lang.", "hhhhhhhhhhhhhhh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ring;class [Ljava.lang." + "'", str2, "ring;class [Ljava.lang.");
    }

    @Test
    public void test09748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09748");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("##", "i!    hi!hi!   ######################!ih!ihhi!  ");
        java.lang.String[] strArray4 = null;
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hi!                                             hi!hi!                                                                                           hi!hi!                                              hi!                                             hi!hi!                                                                                           hi!hi!                                              ", strArray3, strArray4);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!                                             hi!hi!                                                                                           hi!hi!                                              hi!                                             hi!hi!                                                                                           hi!hi!                                              " + "'", str5, "hi!                                             hi!hi!                                                                                           hi!hi!                                              hi!                                             hi!hi!                                                                                           hi!hi!                                              ");
    }

    @Test
    public void test09749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09749");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("###hi!#######hi!#######hi!#######hi!#######hi!#hi!hi!###hi!#######hi!#######hi!##", "HI!HI!HI!    HI!HI!    HI!HI!HI!    HI!HI!", 36);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "###hi!#######hi!#######hi!#######hi!#######hi!#hi!hi!###hi!#######hi!#######hi!##" });
    }

    @Test
    public void test09750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09750");
        char[] charArray5 = new char[] { 'a', 'a', ' ', 'a', 'a' };
        char[] charArray11 = new char[] { 'a', 'a', ' ', 'a', 'a' };
        char[][] charArray12 = new char[][] { charArray5, charArray11 };
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(charArray12);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { 'a', 'a', ' ', 'a', 'a' });
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { 'a', 'a', ' ', 'a', 'a' });
        org.junit.Assert.assertNotNull(charArray12);
    }

    @Test
    public void test09751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09751");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##A", (java.lang.CharSequence) "AHIA!AHIA!AHIA!AHIA!AHIA!AHIA!A");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09752");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("i!    hi!hi!   ######################!ih!ihhi! ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i!    hi!hi!   ######################!ih!ihhi!" + "'", str1, "i!    hi!hi!   ######################!ih!ihhi!");
    }

    @Test
    public void test09753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09753");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("hi!              ", "                                     hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!                                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09754");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "...IH    ...", (java.lang.CharSequence) "###hi!##########################    !ih!ihhi!hi!hi!hi!hi!#####################################################################hi!hi!hi!hi!hi!#####################################################################hi!hi!hi!hi!hi!#####################################################################hi!hi!hi!hi!hi!#####################################################################hi!hi!hi!hi!hi!#####################################################################hi!hi!hi!hi!hi!#####################################################################hi!hi!hi!hi!hi!#####################################################################hi!hi!hi!hi!hi!#####################################################################hi!hi!hi!hi!hi!##############################", 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09755");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                                                                 ");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "H ! IH ! IH ! IH ! IH ! IH", (java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                                                 " });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09756");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi!", "444444Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 83);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi!" });
    }

    @Test
    public void test09757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09757");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   ##hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   ##");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test09758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09758");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "hi!hi!hi!h                               i!    hi!hi!    hi!hi!hi!    hi!hi!                                  hi!hi!h", (java.lang.CharSequence) "        ...    hi...                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09759");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("Aaa...", "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIi!    hi!hi!   ######################!ih!ihhi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Aaa..." + "'", str2, "Aaa...");
    }

    @Test
    public void test09760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09760");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "hI             ", (java.lang.CharSequence) ";gnirtS.gnal.avajL[ ssalc;gnirtS.gnal.avajL[ ssalc;gnirtS.gnal.avajL[ ssalc;gnirthi!hi!hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09761");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "i! hi!hi! ######################!ih!ihhi!", (java.lang.CharSequence) "hAH            hAH                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09762");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahiH hiH", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahiH hiH" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahiH hiH");
    }

    @Test
    public void test09763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09763");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii!h!iiiiiii!HI!HI!HI!HI!HI!HI!iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", 965);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii!h!iiiiiii!HI!HI!HI!HI!HI!HI!iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii" + "'", str2, "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii!h!iiiiiii!HI!HI!HI!HI!HI!HI!iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
    }

    @Test
    public void test09764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09764");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                       " + "'", str1, "                       ");
    }

    @Test
    public void test09765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09765");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "###################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!##HI!##AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09766");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("Hi! 44hi! ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi! 44hi! " + "'", str1, "Hi! 44hi! ");
    }

    @Test
    public void test09767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09767");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii!h!iiiiiii!HI!HI!HI!HI!HI!HI!iiiiiiiiiiiiiiiii", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaai!hi!#");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii!h!iiiiiii!HI!HI!HI!HI!HI!HI!iiiiiiiiiiiiiiiii" + "'", str2, "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii!h!iiiiiii!HI!HI!HI!HI!HI!HI!iiiiiiiiiiiiiiiii");
    }

    @Test
    public void test09768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09768");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "444444444444444444444444444444HI!HI!HI!H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09769");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "                                             hi!hi!                     ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09770");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   hi!hi!   ", (java.lang.CharSequence) "!i!i!i", (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09771");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("                                !IH!IH!IH!IH!IH!IHhhhhhhhh!ih              !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih   ###hi!#######hi!##########################    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih   ", 720, 47);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih " + "'", str3, "!ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih ");
    }

    @Test
    public void test09772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09772");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "...##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################Aaaaaaaaaaaaclassa[Ljava.lang.String;classa[Ljava.lang.String;classa[Ljava.lang.String;aaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##", (java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "...##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################Aaaaaaaaaaaaclassa[Ljava.lang.String;classa[Ljava.lang.String;classa[Ljava.lang.String;aaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##" + "'", charSequence2, "...##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################Aaaaaaaaaaaaclassa[Ljava.lang.String;classa[Ljava.lang.String;classa[Ljava.lang.String;aaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##");
    }

    @Test
    public void test09773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09773");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("             ", "             hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   hi!hi!hhi ! hi ! hi ! hi ! hi ! h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   hi!hi!hhi ! hi ! hi ! hi ! hi ! h" + "'", str2, "hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   hi!hi!hhi ! hi ! hi ! hi ! hi ! h");
    }

    @Test
    public void test09774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09774");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                                                          HI!       HI!    ...", "                                        ", 77);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "HI!", "HI!", "..." });
    }

    @Test
    public void test09775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09775");
        char[] charArray9 = new char[] { 'a', '4', 'a' };
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "!ih!ih!ih!ih!ih!ih", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "i!    hi!hi!    hi!hi!hi!    hi!hi!  ", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "   hi!    ", charArray9);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "...IH    ...", charArray9);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hI", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { 'a', '4', 'a' });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test09776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09776");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("hi!ahi!", "                                    !IH!IH!IH!IH!IH!", "...!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test09777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09777");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("hiiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!!iaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!                                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hiiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!!iaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!                                " + "'", str1, "hiiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!!iaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!                                ");
    }

    @Test
    public void test09778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09778");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray10 = new char[] { '#', '#', ' ', '#', '#', 'a' };
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone(charSequence3, charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!       hHI!HI!HI!HI!HI!HI!", charArray10);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "    ", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) ";gnirtS.gnal.avajL[ ssalc;gnirtS.gnal.avajL[ ssalc;gnirtS.gnal.avajL[ ssalc;gnirtS.gnal.avajL[ ssalc;gnirtS.gnal.avajL[ ssalc", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '#', '#', ' ', '#', '#', 'a' });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test09779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09779");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "              hIH            hIH  ", 468, 268);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09780");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", (java.lang.CharSequence) "hi!hi!hHI ! HI ! HI ! HI ! HI ! H    hi!hi!   Clss [Ljv.lng.String;clss [Ljv.lng.String;clss [Ljv.lng.String;           Clss [Ljv.lng.String;clss [Ljv.lng.String;clss [Ljv.lng.String;           Clss [Ljv.lng.String;clss [Ljv.lng.String;clss [Ljv.lng.String;           Clss [Ljv.lng.String;clss [Ljv.lng.String;clss [Ljv.lng.String;           Clss [Ljv.lng.String;clss [Ljv.lng.String;clss [Ljv.lng.String;           Clss [Ljv.lng.String;clss [Ljv.lng.String;clss [Ljv.lng.String;           Clss [Ljv.lng.String;clss [Ljv.lng.String;clss [Ljv.lng.String;           Clss [Ljv.lng.String;clss [Ljv.lng.String;clss [Ljv.lng.String;           Clss [Ljv.lng.String;clss [Ljv.lng.String;clss [Ljv.lng.String;           Clss [Ljv.lng.String;clss [Ljv.lng.String;clss", 14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09781");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII!H!IIIIIII!HI!HI!HI!HI!HI!HI!IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", " !IH!IH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09782");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence) "c                                                                                           hi!hi!va.lang.string;class [ljava.lang.string;class [ljava.lang.string");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09783");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray12 = new char[] { '#', '#', ' ', '#', '#', 'a' };
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone(charSequence5, charArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!       hHI!HI!HI!HI!HI!HI!", charArray12);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "    ", charArray12);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##", charArray12);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "!ih !ih !ih !ih !ih !ih!ih !ih !ih !ih !ih !ih", charArray12);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "              hIH            hIH   ", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '#', '#', ' ', '#', '#', 'a' });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test09784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09784");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Hi!##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", "!ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih               ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "Hi!##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" });
    }

    @Test
    public void test09785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09785");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "HI!HI!HI!HI!HI!Hhi!aahi!aaHI!HI!HI!HI!HI!H", (java.lang.CharSequence[]) strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!!ih!ih!ih!ihhi!!ih!ih!ih!ih");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("4444444444444444444444444444444444444444444444444444", strArray3, strArray6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!!ih!ih!ih!ihhi!!ih!ih!ih!ih" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4444444444444444444444444444444444444444444444444444" + "'", str7, "4444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test09786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09786");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("###!ih#######!ih#######!ih#######!ih#######!ih#!ih!ih###!ih#######!ih#######!ih##", "                                                                                                               !ih!ih!ih!ih!i                                                                                                                                                                                             ", "class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;claHIclass [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;clas");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test09787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09787");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("hi!hi!    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!    " + "'", str1, "hi!hi!    ");
    }

    @Test
    public void test09788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09788");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("       !ihhi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "       !ihhi" + "'", str1, "       !ihhi");
    }

    @Test
    public void test09789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09789");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "H !IH !IH !IH !IH!IH !IH !IH !IH !IH !IH", (java.lang.CharSequence) "aaaaaaaaaaaaclass [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;aaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09790");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "i!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09791");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("   ###########               Ih!ih!ih!i");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!hi!hi!hi!hi!hi!", "HI!HI!HI!HI!HI!HI");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray5);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "C  aaaaaaaaaaaaaa");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("4444444CLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;", strArray2, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 19 vs 7");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "", "", "###########", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "Ih!ih!ih!i" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi", "hi", "hi", "hi", "hi", "hi", "" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi", "hi", "hi", "hi", "hi", "hi", "" });
    }

    @Test
    public void test09792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09792");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("i!4444hi!hi!4444hi!hi#######", 78, "                               i!    hi!hi!    hi!hi!hi!    hi!hi!                                  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                               i!    hi!hi!    hi!i!4444hi!hi!4444hi!hi#######" + "'", str3, "                               i!    hi!hi!    hi!i!4444hi!hi!4444hi!hi#######");
    }

    @Test
    public void test09793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09793");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("      hi!hi!hi!hi!hi!", "hi!  hi!                                ", "hi!            hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      hi!hi!hi!hi!hi!" + "'", str3, "      hi!hi!hi!hi!hi!");
    }

    @Test
    public void test09794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09794");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii!h!iiiiiii!HI!HI!HI!HI!HI!HI!iiiiiiiiiiiiiiiiii", '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii!h!iiiiiii!HI!HI!HI!HI!HI!HI!iiiiiiiiiiiiiiiiii" });
    }

    @Test
    public void test09795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09795");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("   HI!       !i   HI!    ", 84);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   HI!       !i   HI!    " + "'", str2, "   HI!       !i   HI!    ");
    }

    @Test
    public void test09796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09796");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                                     hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!                                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                     HI!HI!HI!HI!HI!AHI!HI!HI!HI!HI!hiHI!HI!HI!HI!HI!AHI!HI!HI!HI!HI!!HI!HI!HI!HI!HI!AHI!HI!HI!HI!HI!hiHI!HI!HI!HI!HI!AHI!HI!HI!HI!HI!!HI!HI!HI!HI!HI!AHI!HI!HI!HI!HI!hiHI!HI!HI!HI!HI!AHI!HI!HI!HI!HI!!HI!HI!HI!HI!HI!AHI!HI!HI!HI!HI!hiHI!HI!HI!HI!HI!AHI!HI!HI!HI!HI!!HI!HI!HI!HI!HI!AHI!HI!HI!HI!HI!hiHI!HI!HI!HI!HI!AHI!HI!HI!HI!HI!!HI!HI!HI!HI!HI!AHI!HI!HI!HI!HI!hiHI!HI!HI!HI!HI!AHI!HI!HI!HI!HI!!HI!HI!HI!HI!HI!AHI!HI!HI!HI!HI!                                     " + "'", str1, "                                     HI!HI!HI!HI!HI!AHI!HI!HI!HI!HI!hiHI!HI!HI!HI!HI!AHI!HI!HI!HI!HI!!HI!HI!HI!HI!HI!AHI!HI!HI!HI!HI!hiHI!HI!HI!HI!HI!AHI!HI!HI!HI!HI!!HI!HI!HI!HI!HI!AHI!HI!HI!HI!HI!hiHI!HI!HI!HI!HI!AHI!HI!HI!HI!HI!!HI!HI!HI!HI!HI!AHI!HI!HI!HI!HI!hiHI!HI!HI!HI!HI!AHI!HI!HI!HI!HI!!HI!HI!HI!HI!HI!AHI!HI!HI!HI!HI!hiHI!HI!HI!HI!HI!AHI!HI!HI!HI!HI!!HI!HI!HI!HI!HI!AHI!HI!HI!HI!HI!hiHI!HI!HI!HI!HI!AHI!HI!HI!HI!HI!!HI!HI!HI!HI!HI!AHI!HI!HI!HI!HI!                                     ");
    }

    @Test
    public void test09797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09797");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray12 = new char[] { '#', '#', ' ', '#', '#', 'a' };
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone(charSequence5, charArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!                                             hi!hi!                                                                                           hi!hi!                                              hi!                                             hi!hi!                                                                                           hi!hi!                                              ", charArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "!ih!ih!ih!ih!ih!ih", charArray12);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "   hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!    ", charArray12);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "HI    ", charArray12);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hi!                                                                  ", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '#', '#', ' ', '#', '#', 'a' });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test09798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09798");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test09799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09799");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clhiclss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;clss[ljv.lng.string;cls");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09800");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("       !i", 633, "             hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   hi!hi!hhi ! hi ! hi ! hi ! hi ! h");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       !i             hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   hi!hi!hhi ! hi ! hi ! hi ! hi ! h             hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   hi!hi!hhi ! hi ! hi ! hi ! hi ! h             hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   hi!hi!hhi ! hi ! hi ! hi ! hi ! h             hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   hi!hi!hhi ! hi ! hi ! hi ! hi ! h             hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   hi!hi!hhi ! hi ! hi ! hi ! hi ! h             hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   hi!hi!hhi ! hi ! hi ! hi ! hi ! h             hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   hi!hi!hhi ! h" + "'", str3, "       !i             hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   hi!hi!hhi ! hi ! hi ! hi ! hi ! h             hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   hi!hi!hhi ! hi ! hi ! hi ! hi ! h             hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   hi!hi!hhi ! hi ! hi ! hi ! hi ! h             hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   hi!hi!hhi ! hi ! hi ! hi ! hi ! h             hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   hi!hi!hhi ! hi ! hi ! hi ! hi ! h             hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   hi!hi!hhi ! hi ! hi ! hi ! hi ! h             hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   hi!hi!hhi ! h");
    }

    @Test
    public void test09801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09801");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "HI!HI                      !hi!h");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: HI!HI                      !hi!h");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 1, (byte) 0 });
    }

    @Test
    public void test09802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09802");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("                                   ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09803");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("...############", "i!    hi!hi!    hi!hi!hi!    hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09804");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("hi!hi!hi!    hi!hi!    hi!hi!hi!    hi!hi!   ##############################", "!H44444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!    hi!hi!    hi!hi!hi!    hi!hi!   ##############################" + "'", str2, "hi!hi!hi!    hi!hi!    hi!hi!hi!    hi!hi!   ##############################");
    }

    @Test
    public void test09805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09805");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "...#######!ih!ih#####################..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09806");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("#IH#IH#IH#IH#IH#IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI#HI#HI#HI#HI#HI#" + "'", str1, "HI#HI#HI#HI#HI#HI#");
    }

    @Test
    public void test09807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09807");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII!H!IIIIIII!HI!HI!HI!HI!HI!HI!IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", 25, "...!Hi!Hi!Hi!Hi!Hi!         4                         ...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII!H!IIIIIII!HI!HI!HI!HI!HI!HI!IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII" + "'", str3, "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII!H!IIIIIII!HI!HI!HI!HI!HI!HI!IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
    }

    @Test
    public void test09808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09808");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("Hi! 44hi! ", 36);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                          Hi! 44hi! " + "'", str2, "                          Hi! 44hi! ");
    }

    @Test
    public void test09809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09809");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("a", "                           ...#######!ih!ih#####################...                           ", "                                                               hi ! hi...", 42);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "a" + "'", str4, "a");
    }

    @Test
    public void test09810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09810");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("HI!HI!HI!HIhi!hi!hi!hi!hi!hi", 4, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!HI!HI!HIhi!hi!hi!hi!hi!hi" + "'", str3, "HI!HI!HI!HIhi!hi!hi!hi!hi!hi");
    }

    @Test
    public void test09811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09811");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "hI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAA   HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI! HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAA", (java.lang.CharSequence) "############################################################################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09812");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("###############44###############", 477);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###############44###############" + "'", str2, "###############44###############");
    }

    @Test
    public void test09813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09813");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("HI!HI!HI!HI!HI!H44444444444444444444444444444444444444444444444444444444444444444###################################");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "HI", "!", "HI", "!", "HI", "!", "HI", "!", "HI", "!", "H", "44444444444444444444444444444444444444444444444444444444444444444", "###################################" });
    }

    @Test
    public void test09814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09814");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                 AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                 ", "hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    4hi4!4                                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                 AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                 " + "'", str3, "                                 AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                 ");
    }

    @Test
    public void test09815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09815");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                               !ih!ih!ih!ih!i                                                                                                                                                                                             ", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test09816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09816");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("HI!HI                      !hi!h", 646, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!HI                      !hi!h                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      " + "'", str3, "HI!HI                      !hi!h                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ");
    }

    @Test
    public void test09817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09817");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("...    hi...", "   hi!       hi!       hi!       hi!       hi! hi!hi!   hi!       hi!       hi!       hi!   hia!aaahia!aaa");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!");
        java.lang.Class<?> wildcardClass5 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "...    hi..." });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "...    hi..." });
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test09818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09818");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                  HIClass ...                                   ", " 4444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09819");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!iclass [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!", 721, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09820");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("I!HI!#4444444444444444444444444444444444444444444444                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I!HI!#4444444444444444444444444444444444444444444444" + "'", str1, "I!HI!#4444444444444444444444444444444444444444444444");
    }

    @Test
    public void test09821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09821");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09822");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                   ", ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
    }

    @Test
    public void test09823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09823");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("hih            hih", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09824");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("                                                                                ", "!ih!ih!ih!ih!ihH444444444444444444444444444444HI!HI!HI!H...H4444444444444444444444", "i!    hi!hi!    hi!hi!hi!    hi!hi!i!    hi!hi!    hi!hi!hi!    hi!hi!i!    hi!hi!    hi!hi!hi!    hi!hi!i!    hi!hi!    hi!hi!hi!    hi!hi!i!    hi!hi!    hi!hi!hi!    hi!hi!i!    hi!hi!    hi!hi!hi!    hi!hi!i!    hi!hi!    hi!hi!hi!    hi!hi!i!    hi!hi!    hi!hi!hi!    hi!hi!", 30);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                                " + "'", str4, "                                                                                ");
    }

    @Test
    public void test09825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09825");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!            hi!            ", "!ih!ih!ih!ih!i");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!            hi!            " });
    }

    @Test
    public void test09826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09826");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("################", 965);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "################" + "'", str2, "################");
    }

    @Test
    public void test09827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09827");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("h!ih!ih...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H!IH!IH..." + "'", str1, "H!IH!IH...");
    }

    @Test
    public void test09828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09828");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "ring;class [Ljava.lang.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09829");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                               ", "                                                                                      hi!hi!hi!hhi!hi!hhi!hi!hi!hhi!hi!h", 314);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.          hi!hi!h", 65, 34);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test09830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09830");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("Class[ljava.lang.string;class[ljava.lang.string;cl!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih", "                                                   aaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "Cl", "ss[lj", "v", ".l", "ng.string;cl", "ss[lj", "v", ".l", "ng.string;cl!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih" });
    }

    @Test
    public void test09831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09831");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaaaaaaa", "HI!HI!HI!    HI!HI!    HI!HI!HI!    HI!HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test09832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09832");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                                                                   HI!HI!HI!HI!HI!H", "       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                   HI!HI!HI!HI!HI!H" + "'", str2, "                                                                   HI!HI!HI!HI!HI!H");
    }

    @Test
    public void test09833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09833");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("   hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi! ", 70);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi! " + "'", str2, "   hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi! ");
    }

    @Test
    public void test09834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09834");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("hi!aaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!aaaaaaaaaaaaa" + "'", str1, "hi!aaaaaaaaaaaaa");
    }

    @Test
    public void test09835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09835");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("s", "                                       aaaaaaaaaaaaaa  c                                         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "s" + "'", str2, "s");
    }

    @Test
    public void test09836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09836");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("hih            hih                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ", 81, "hI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!IH!IH!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hih            hih                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     " + "'", str3, "hih            hih                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
    }

    @Test
    public void test09837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09837");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "i!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test09838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09838");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "     !IH!IH!IH!IH!IH!IHH       !IH!IH!IH", (java.lang.CharSequence) "###hi!#######hi!#######hi!#######hi!#######hi!#hi!hi!###hi!#######hi!#######hi!#####hi!#######hi!#######hi!#######hi!#######hi!#hi!hi!###hi!#######hi!#######hi!#####hi!#######hi!#######hi!#######hi!#######hi!#hi!hi!###hi!#######hi!#######hi!#####hi!#######hi!#######hi!#######hi!#######hi!#hi!hi!###hi!#######hi!#######hi!#####hi!#######hi!#######hi!#######hi!#######hi!#hi!hi!###hi!#######hi!#######hi!#####hi!#######hi!#######hi!#######hi!#######hi!#hi!hi!###hi!#######hi!#######hi!#####hi!#######hi!#######hi!#######hi!#######hi!#hi!hi!###hi!#######hi!#######hi!#####hi!#######hi!#######hi!#######hi!#######hi!#hi!hi!###hi!#######hi!#######hi!#####hi!#######hi!#######hi!#######hi!#######hI!    HI!HI!    HI!HI!HI!    HI!HI!", 39);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09839");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("CLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "cLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;" + "'", str1, "cLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;");
    }

    @Test
    public void test09840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09840");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "                                  ", 0, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09841");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("   hi!       hi!       hi!       hi!       hi! hi!hi!   hi!       hi!       hi!       hi!       hi! ");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("hi!hi!", "hi!hi!", (-1));
        int int8 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray7);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("hi!", strArray3, strArray7);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray7);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, '#');
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.stripAll(strArray7, "HI!HI!HI!HI!HI!HI         HI!HI!HI!HI!HI!HI         HI!HI!HI!HI!HI!HI         HI!HI!HI!HI!HI!HI         HI!HI!HI!HI!HI!HI         HI!HI!HI!HI!HI!HI         HI!HI!HI!HI!HI!HI         HI!HI!HI!HI!HI!HI         HI!HI!HI!HI!HI!HI         HI!HI!HI!HI!HI!HI");
        boolean boolean15 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "hI! 44HI! ", (java.lang.CharSequence[]) strArray7);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test09842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09842");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray7);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(strArray8);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Comparable<java.lang.String>[]) strArray8);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "   hi!    ", (java.lang.CharSequence[]) strArray8);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, ' ', (int) '#', (int) '#');
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "C  aaaaaaaaaaaaaa", (java.lang.CharSequence[]) strArray8);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!", "", "hi!", "", "" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "", "hi!", "", "" });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!hi!" + "'", str9, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!hi!" + "'", str10, "hi!hi!");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "", "hi!", "", "" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test09843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09843");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "aaaaaaaaaa", (java.lang.CharSequence) "4");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09844");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("!ih!ih!ih!ih!ih!ih", "   hi!    ", (-1));
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "...    hi...", (java.lang.CharSequence[]) strArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "                                   hi!       hHI!HI!HI!HI!HI!HI!                                    ", 756, 90);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test09845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09845");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                " + "'", str1, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
    }

    @Test
    public void test09846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09846");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "!ih!ih!ih!ih!ih!ihHHHHHHHH!IH", (java.lang.CharSequence) "4444###################", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09847");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "                                !IH!IH!IH!IH!IH!IHhhhhhhhh!ih              !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih   ###hi!#######hi!##########################    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih   ", (java.lang.CharSequence) "###hi!##########################...", 965);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09848");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray7);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray7, "hi!hi!");
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.split("hi!", "hi!hi!hi!hi!hi!hi!", 100);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEach("HI!HI!HI!    HI!HI!    HI!HI!HI!    HI!HI", strArray7, strArray14);
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("   hi!       hi!       hi!       hi!       hi! hi!hi!   hi!       hi!       hi!       hi!   hia!aaahia!aaa", "HI!       HI!       HI!       HI!       HI! HI!HI!   HI!       HI!       HI!       HI!   ...");
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray7, strArray18);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!", "", "hi!", "", "" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "", "hi!", "", "" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "", "", "", "" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HI!HI!HI!    HI!HI!    HI!HI!HI!    HI!HI" + "'", str15, "HI!HI!HI!    HI!HI!    HI!HI!HI!    HI!HI");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test09849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09849");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray9 = new char[] { 'a', '4', 'a' };
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "!ih!ih!ih!ih!ih!ih", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "!IH!IH!IH!IH!IH!IH", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "!ih!ih!ih!ih!ih!ih", charArray9);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence1, charArray9);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "   hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi!", charArray9);
        java.lang.Class<?> wildcardClass16 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { 'a', '4', 'a' });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25 + "'", int15 == 25);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test09850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09850");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("HI#HI#HI#HI#HI#HI#", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##a");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI#HI#HI#HI#HI#HI#" + "'", str2, "HI#HI#HI#HI#HI#HI#");
    }

    @Test
    public void test09851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09851");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ", "      hi!hi!                                                                                           hi!hi!                                              hi!                                             hi!hi!                                   ", "   hi!    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      " + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ");
    }

    @Test
    public void test09852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09852");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("!IH !IH!IH !IH !IH !IH !IH !IH                                                     ", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!IH !IH !IH !IH !IH !IH!IH !IH" + "'", str2, "!IH !IH !IH !IH !IH !IH!IH !IH");
    }

    @Test
    public void test09853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09853");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("hiAHIA!AHIA!AHIA!AHIA!AHIA!AHIA!A!AHIA!AHIA!AHIA!AHIA!AHIA!AHIA!AhiAHIA!AHIA!AHIA!AHIA!AHIA!AHIA!A!", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hiAHIA!AHIA!AHIA!AHIA!AHIA!AHIA!A!AHIA!AHIA!AHIA!AHIA!AHIA!AHIA!AhiAHIA!AHIA!AHIA!AHIA!AHIA!AHIA!A!" + "'", str2, "hiAHIA!AHIA!AHIA!AHIA!AHIA!AHIA!A!AHIA!AHIA!AHIA!AHIA!AHIA!AHIA!AhiAHIA!AHIA!AHIA!AHIA!AHIA!AHIA!A!");
    }

    @Test
    public void test09854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09854");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 28);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09855");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty(charSequence0, (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", charSequence2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test09856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09856");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("HI!HHI    HI!H", 108, 36);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!HHI    HI!H" + "'", str3, "HI!HHI    HI!H");
    }

    @Test
    public void test09857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09857");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii!IH!IH!IH!IH!IH!IH!iiiiiii!h!iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09858");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("Hi", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHi" + "'", str2, "HiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHi");
    }

    @Test
    public void test09859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09859");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!...", (java.lang.CharSequence) "aaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36 + "'", int2 == 36);
    }

    @Test
    public void test09860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09860");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("ring;             a.lavass [Ljang.String;cla.lavass [Ljang.String;cla.lavass [LjaCl");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "RING;             A.LAVASS [lJANG.sTRING;CLA.LAVASS [lJANG.sTRING;CLA.LAVASS [lJAcL" + "'", str1, "RING;             A.LAVASS [lJANG.sTRING;CLA.LAVASS [lJANG.sTRING;CLA.LAVASS [lJAcL");
    }

    @Test
    public void test09861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09861");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "!IH !IH !IH !IH !IH !IH!IH !IH !IH !IH !IH !IH", (java.lang.CharSequence) "aaa                                                                                                                                                                                                                                                                                                                                                      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09862");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "################" + "'", str1, "################");
    }

    @Test
    public void test09863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09863");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("i!hi!hi!h", 46);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h" + "'", str2, "i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
    }

    @Test
    public void test09864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09864");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty(" hi! h#hi!hi!###hi!hi!#! hi! hi!", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " hi! h#hi!hi!###hi!hi!#! hi! hi!" + "'", str2, " hi! h#hi!hi!###hi!hi!#! hi! hi!");
    }

    @Test
    public void test09865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09865");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "hi!hi!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09866");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("444", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444" + "'", str2, "444");
    }

    @Test
    public void test09867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09867");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("hi!aaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!aaaaaaaaaaaaa" + "'", str1, "hi!aaaaaaaaaaaaa");
    }

    @Test
    public void test09868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09868");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H", (java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                             hi! !I hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09869");
        char[] charArray11 = new char[] { 'a', '4', 'a' };
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "!ih!ih!ih!ih!ih!ih", charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "i!    hi!hi!    hi!hi!hi!    hi!hi!  ", charArray11);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "   hi!    ", charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "...IH    ...", charArray11);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "  hi!hi!hi!hi!hi!                                                                         ", charArray11);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaai!                                aaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray11);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "        !ih!ih    !ih!ih!ih    !ih!ih    !i                               h!ih!ih!ih", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { 'a', '4', 'a' });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 28 + "'", int18 == 28);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test09870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09870");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("class [Ljava.lang.String;!class [Ljava.lang.String;hiclass [Ljava.lang.String;!class [Ljava.lang.String;hiclass [Ljava.lang.String;!class [Ljava.lang.String;hiclass [Ljava.lang.String;!class [Ljava.lang.String;hiclass [Ljava.lang.String;!class [Ljava.lang.String;", 729, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444class [Ljava.lang.String;!class [Ljava.lang.String;hiclass [Ljava.lang.String;!class [Ljava.lang.String;hiclass [Ljava.lang.String;!class [Ljava.lang.String;hiclass [Ljava.lang.String;!class [Ljava.lang.String;hiclass [Ljava.lang.String;!class [Ljava.lang.String;44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444class [Ljava.lang.String;!class [Ljava.lang.String;hiclass [Ljava.lang.String;!class [Ljava.lang.String;hiclass [Ljava.lang.String;!class [Ljava.lang.String;hiclass [Ljava.lang.String;!class [Ljava.lang.String;hiclass [Ljava.lang.String;!class [Ljava.lang.String;44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test09871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09871");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("HI!       !i   HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!       !i   HI!" + "'", str1, "HI!       !i   HI!");
    }

    @Test
    public void test09872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09872");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("              hi!       hi!       hi!       hi!       hi!       hi!       hi###    ###              ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "hi!", "hi###", "###" });
    }

    @Test
    public void test09873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09873");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("i!       4444444444444444444444444444444444444444444444444444444444", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09874");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("Hhi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#", "       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!##HI!##AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#" + "'", str2, "Hhi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#");
    }

    @Test
    public void test09875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09875");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!hi!    hi!hi!hi!    ", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09876");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "!ih!ih!", 1);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "aaaaaaaaaaaaaaaaaaaaaaaaaa                                !iaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "" });
    }

    @Test
    public void test09877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09877");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("#############################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#############################" + "'", str1, "#############################");
    }

    @Test
    public void test09878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09878");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("hi!       hi!    ...", 35, 345);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test09879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09879");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("                        ", 5, 52);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                   " + "'", str3, "                   ");
    }

    @Test
    public void test09880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09880");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("444444Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 758);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  " + "'", str2, "444444Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
    }

    @Test
    public void test09881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09881");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) ";gnirtS.gnal.avajL[ ssalc;gnirtS.gnal.avajL[ ssalc;gnirtS.gnal.avajL[ ssalc;gnirtS.gnal.avajL[ ssalc;gnirtS.gnal.avajL[ ssalc", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test09882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09882");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "hi!  hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         iIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", (java.lang.CharSequence) "HI!AAHI!AA", 31);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09883");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "!IH!IH    !IH!IH!IH    !IH!IH    !Iclss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clHIclss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;clss [ljv.lng.string;cls", (java.lang.CharSequence) "                                                                                           ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09884");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray12 = new char[] { '#', '#', ' ', '#', '#', 'a' };
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone(charSequence5, charArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hi!hi!    ", charArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "#######", charArray12);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!", charArray12);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "###################################", charArray12);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "                                                   ", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '#', '#', ' ', '#', '#', 'a' });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test09885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09885");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "!IH!IH!IH!IH!IH!IHH       !IH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09886");
        java.lang.CharSequence charSequence9 = null;
        char[] charArray16 = new char[] { '#', '#', ' ', '#', '#', 'a' };
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone(charSequence9, charArray16);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hi!hi!    ", charArray16);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "#######", charArray16);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!", charArray16);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!hi!hi!    hi!hi!    hi!hi!hi!    hi!hi!    ", charArray16);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "            ", charArray16);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!            hi!            ", charArray16);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray16);
        int int25 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                ######################!ih!ih#####################", charArray16);
        boolean boolean26 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray16);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '#', '#', ' ', '#', '#', 'a' });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 54 + "'", int25 == 54);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test09887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09887");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                                   ", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09888");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!ih######################!ih!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09889");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("###################################################...", "c4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!hi!va.lang.string;class4[ljava.lang.string;class4[ljava.lang.string;", 81, 263);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "###################################################...c4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!hi!va.lang.string;class4[ljava.lang.string;class4[ljava.lang.string;" + "'", str4, "###################################################...c4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!hi!va.lang.string;class4[ljava.lang.string;class4[ljava.lang.string;");
    }

    @Test
    public void test09890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09890");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "hi!            hi!            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!            hi!            " + "'", str2, "hi!            hi!            ");
    }

    @Test
    public void test09891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09891");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("!IH!IH!IH!IH!IH!IHH       !IH#######################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih!ih!ih!ih!ih!ihh       !ih#######################" + "'", str1, "!ih!ih!ih!ih!ih!ihh       !ih#######################");
    }

    @Test
    public void test09892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09892");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("I!HI!#", "Hi!#hi!hi!###hi!hi!", "!ih!ih!  ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test09893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09893");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("!IH!IH!IH!IH!IH!IHh       !ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!IH!IH!IH!IH!IH!IHh       !ih" + "'", str1, "!IH!IH!IH!IH!IH!IHh       !ih");
    }

    @Test
    public void test09894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09894");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "                                                                                                                                                                                                                                     H !IH !IH !IH !IH!IH !IH !IH !IH !IH !I");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09895");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("   hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi!            ", ' ', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi!            " + "'", str3, "   hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi!            ");
    }

    @Test
    public void test09896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09896");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("h!ih!ih...", 468);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                     h!ih!ih...                                                                                                                                                                                                                                     " + "'", str2, "                                                                                                                                                                                                                                     h!ih!ih...                                                                                                                                                                                                                                     ");
    }

    @Test
    public void test09897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09897");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "!IH!IH!IH!IH!IH!IHH#######!IH####################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09898");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "H!IH!IH...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09899");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                               !ih!ih!ih!ih!i                                                                                                                                                                                             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                             i!hi!hi!hi!hi!                                                                                                               44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "                                                                                                                                                                                             i!hi!hi!hi!hi!                                                                                                               44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test09900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09900");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("I!HI!#4444444444444444444444444444444444444444444444                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                              4444444444444444444444444444444444444444444444#!IH!I" + "'", str1, "                              4444444444444444444444444444444444444444444444#!IH!I");
    }

    @Test
    public void test09901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09901");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "############################################################################################################################################################################################################################################################################hi!hi!hi!    hi!hi!    hi!hi!hi!    hi!hi!    ", (java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi!", 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09902");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "                                                                   HI!HI!HI!HI!HI!H", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                           aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09903");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("", "!IH!IH!IH!IH!IH!IH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09904");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("hi!hi!hi!hi!hi!hi");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "            class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;", (java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi", "!", "hi", "!", "hi", "!", "hi", "!", "hi", "!", "hi" });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09905");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("  ", 2, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  " + "'", str3, "  ");
    }

    @Test
    public void test09906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09906");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("hi!hi!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!hi!", "4444!ih!ih", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "        aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa         " + "'", str3, "        aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa         ");
    }

    @Test
    public void test09907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09907");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "class[ljava.lang.string;class[ljava.lang.string;cl!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!i", (java.lang.CharSequence) "       !ihi!###hi!hi!#! hi! hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09908");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("hi!hi!");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '#', (int) '4', 0);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "AHIA!AHIA!AHIA!AHIA!AHIA!AHIA!A");
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "                       ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "hi", "!", "hi", "!" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi", "!", "hi", "!" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hiAHIA!AHIA!AHIA!AHIA!AHIA!AHIA!A!AHIA!AHIA!AHIA!AHIA!AHIA!AHIA!AhiAHIA!AHIA!AHIA!AHIA!AHIA!AHIA!A!" + "'", str8, "hiAHIA!AHIA!AHIA!AHIA!AHIA!AHIA!A!AHIA!AHIA!AHIA!AHIA!AHIA!AHIA!AhiAHIA!AHIA!AHIA!AHIA!AHIA!AHIA!A!");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi", "!", "hi", "!" });
    }

    @Test
    public void test09909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09909");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("44H44444444444444H44...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...44H44444444444444H44" + "'", str1, "...44H44444444444444H44");
    }

    @Test
    public void test09910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09910");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "############################################################################################################################################################################################################################################################################hi!hi!hi!    hi!hi!    hi!hi!hi!    hi!hi!", (java.lang.CharSequence) "###hi!#######hi!##########################    !ih!ih");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09911");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray12 = new char[] { '#', '#', ' ', '#', '#', 'a' };
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone(charSequence5, charArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!                                             hi!hi!                                                                                           hi!hi!                                              hi!                                             hi!hi!                                                                                           hi!hi!                                              ", charArray12);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray12);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                                                                                 aaa", charArray12);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                             aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray12);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "H!IH!IH...", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '#', '#', ' ', '#', '#', 'a' });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test09912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09912");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;Aaaaaaa#################", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;Aaaaaaa#################" + "'", str2, "class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;Aaaaaaa#################");
    }

    @Test
    public void test09913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09913");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("             hi!hi!va.lang.string;class [ljava.lang.string;class [ljava.lang.string", '#', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "             hi!hi!va.lang.string;class [ljava.lang.string;class [ljava.lang.string" + "'", str3, "             hi!hi!va.lang.string;class [ljava.lang.string;class [ljava.lang.string");
    }

    @Test
    public void test09914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09914");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("            hIH            hIH", 7, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "            hIH            hIH" + "'", str3, "            hIH            hIH");
    }

    @Test
    public void test09915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09915");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "HI!#HI!HI!###HI!HI!#", (java.lang.CharSequence) "hi!hi!                     ...", 13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09916");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", ";gnirtS.gnal.avajL[ssalc;gnirtS.gnal.avajL[ssalc;gnirtS.gnal.avajL[ssalc", "class [ljava.lang.string;class [ljava.lang.string;cl      !ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test09917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09917");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "4444444                                       ", (java.lang.CharSequence) "         4                                                                       Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!         4                                                                       Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!         4                                                                       Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!         4                                                                       Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!         4                                                                       Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!         4                                                                       Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!         4                                                                       Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!         4                                                                      ", 82);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09918");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "ihiihiiihiihiihiihiihiiihiihi", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test09919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09919");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "4                                                                                           hi!hi!44");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test09920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09920");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ", "!ih!ih                           aaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09921");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("hi!hi! hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi! hi!" + "'", str1, "hi!hi! hi!");
    }

    @Test
    public void test09922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09922");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!!ih!ih!ih!", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09923");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "                                     HI!HI!HI!HI!HI!AHI!HI!HI!HI!HI!hiHI!HI!HI!HI!HI!AHI!HI!HI!HI!HI!!HI!HI!HI!HI!HI!AHI!HI!HI!HI!HI!hiHI!HI!HI!HI!HI!AHI!HI!HI!HI!HI!!HI!HI!HI!HI!HI!AHI!HI!HI!HI!HI!hiHI!HI!HI!HI!HI!AHI!HI!HI!HI!HI!!HI!HI!HI!HI!HI!AHI!HI!HI!HI!HI!hiHI!HI!HI!HI!HI!AHI!HI!HI!HI!HI!!HI!HI!HI!HI!HI!AHI!HI!HI!HI!HI!hiHI!HI!HI!HI!HI!AHI!HI!HI!HI!HI!!HI!HI!HI!HI!HI!AHI!HI!HI!HI!HI!hiHI!HI!HI!HI!HI!AHI!HI!HI!HI!HI!!HI!HI!HI!HI!HI!AHI!HI!HI!HI!HI!                                     ", (java.lang.CharSequence) "#######");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09924");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "!IH!IH!IH       a!aih!IH!IH!IH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09925");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;Aaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test09926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09926");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "ih", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09927");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                            hi!hi!va.lang.string;class [ljava.lang.string;class [ljava.lang.string;", 87, "hAH            hAH                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                            hi!hi!va.lang.string;class [ljava.lang.string;class [ljava.lang.string;" + "'", str3, "                                                            hi!hi!va.lang.string;class [ljava.lang.string;class [ljava.lang.string;");
    }

    @Test
    public void test09928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09928");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("H444444444444444444444444444444HI!HI!HI!H...c                                                                                           hi!hi!va.lang.string;class [ljava.lang.string;class [ljava.lang.stringc                                                                                           hi!hi!va.lan", "");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "H444444444444444444444444444444HI!HI!HI!H...c                                                                                           hi!hi!va.lang.string;class [ljava.lang.string;class [ljava.lang.stringc                                                                                           hi!hi!va.lan" });
    }

    @Test
    public void test09929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09929");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("                         hi4hi4hi4hi4hi4h   ", 14, 108);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                         hi4hi4hi4hi4hi4h   " + "'", str3, "                         hi4hi4hi4hi4hi4h   ");
    }

    @Test
    public void test09930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09930");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("I!aI!aI!aI!aI!aI!AAaI!AAaI!aI!aI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H", "#hi!hi!###hi!hi!#", "ng;clss [Ljv.lng.String;");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IcaIcaIcaIcaIcaIcAAaIcAAaIcaIcaIcHIcHIcHc;gc;gcHIcHIcHIcHIcHIcHHIcAAHIcAAHIcHIcHIcHIcHIcHc;gc;gcHIcHIcHIcHIcHIcHHIcAAHIcAAHIcHIcHIcHIcHIcHc;gc;gcHIcHIcHIcHIcHIcHHIcAAHIcAAHIcHIcHIcHIcHIcHc;gc;gcHIcHIcHIcHIcHIcHHIcAAHIcAAHIcHIcHIcHIcHIcHc;gc;gcHIcHIcHIcHIcHIcHHIcAAHIcAAHIcHIcHIcHIcHIcHc;gc;gcHIcHIcHIcHIcHIcHHIcAAHIcAAHIcHIcHIcHIcHIcHc;gc;gcHIcHIcHIcHIcHIcHHIcAAHIcAAHIcHIcHIcHIcHIcHc;gc;gcHIcHIcHIcHIcHIcHHIcAAHIcAAHIcHIcHIcHIcHIcHc;gc;gcHIcHIcHIcHIcHIcHHIcAAHIcAAHIcHIcHIcHIcHIcH" + "'", str3, "IcaIcaIcaIcaIcaIcAAaIcAAaIcaIcaIcHIcHIcHc;gc;gcHIcHIcHIcHIcHIcHHIcAAHIcAAHIcHIcHIcHIcHIcHc;gc;gcHIcHIcHIcHIcHIcHHIcAAHIcAAHIcHIcHIcHIcHIcHc;gc;gcHIcHIcHIcHIcHIcHHIcAAHIcAAHIcHIcHIcHIcHIcHc;gc;gcHIcHIcHIcHIcHIcHHIcAAHIcAAHIcHIcHIcHIcHIcHc;gc;gcHIcHIcHIcHIcHIcHHIcAAHIcAAHIcHIcHIcHIcHIcHc;gc;gcHIcHIcHIcHIcHIcHHIcAAHIcAAHIcHIcHIcHIcHIcHc;gc;gcHIcHIcHIcHIcHIcHHIcAAHIcAAHIcHIcHIcHIcHIcHc;gc;gcHIcHIcHIcHIcHIcHHIcAAHIcAAHIcHIcHIcHIcHIcHc;gc;gcHIcHIcHIcHIcHIcHHIcAAHIcAAHIcHIcHIcHIcHIcH");
    }

    @Test
    public void test09931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09931");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##", (java.lang.CharSequence) "aaahia!aaahia!aaahia!aaahia!a");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##" + "'", charSequence2, "aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##hi!Aahi!##hi!##");
    }

    @Test
    public void test09932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09932");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("#hi!hi!###hi!hi!#");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, 'a', 268, 724);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 268 out of bounds for length 9");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "#", "hi", "!", "hi", "!###", "hi", "!", "hi", "!#" });
    }

    @Test
    public void test09933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09933");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("...hi!h...", 746);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09934");
        char[] charArray10 = new char[] { 'a', '4', 'a' };
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "###################################44444444444444444444444444444444444444444444444444444444444444444", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!#######", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "          ", charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!aahi!aa", charArray10);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi! hi! hi! hi! hiAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi! hi! hi! hi! hi!", charArray10);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                     hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!HIhi!hi!hi!hi!hi!ahi!hi!hi!hi!hi!!hi!hi!hi!hi!hi!ahi!hi!hi!444444                                  ", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { 'a', '4', 'a' });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test09935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09935");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih   ###hi!#######hi!##########################    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih    !ih!ih   ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test09936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09936");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("I!aI!aI!aI!aI!aI!AAaI!AAaI!aI!aI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H!ih!ih!HI!HI!HI!HI!HI!HHI!AAHI!AAHI!HI!HI!HI!HI!H", "hi ! hi...", "###hi!#######hi!#######hi!#######hi!#######hi!#hi!hi!###hi!#######hi!#######hi!###############################################################################################   hi!       !i   hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IhaIhaIhaIhaIhaIhAAaIhAAaIhaIhaIhHIhHIhHh##h##hHIhHIhHIhHIhHIhHHIhAAHIhAAHIhHIhHIhHIhHIhHh##h##hHIhHIhHIhHIhHIhHHIhAAHIhAAHIhHIhHIhHIhHIhHh##h##hHIhHIhHIhHIhHIhHHIhAAHIhAAHIhHIhHIhHIhHIhHh##h##hHIhHIhHIhHIhHIhHHIhAAHIhAAHIhHIhHIhHIhHIhHh##h##hHIhHIhHIhHIhHIhHHIhAAHIhAAHIhHIhHIhHIhHIhHh##h##hHIhHIhHIhHIhHIhHHIhAAHIhAAHIhHIhHIhHIhHIhHh##h##hHIhHIhHIhHIhHIhHHIhAAHIhAAHIhHIhHIhHIhHIhHh##h##hHIhHIhHIhHIhHIhHHIhAAHIhAAHIhHIhHIhHIhHIhHh##h##hHIhHIhHIhHIhHIhHHIhAAHIhAAHIhHIhHIhHIhHIhH" + "'", str3, "IhaIhaIhaIhaIhaIhAAaIhAAaIhaIhaIhHIhHIhHh##h##hHIhHIhHIhHIhHIhHHIhAAHIhAAHIhHIhHIhHIhHIhHh##h##hHIhHIhHIhHIhHIhHHIhAAHIhAAHIhHIhHIhHIhHIhHh##h##hHIhHIhHIhHIhHIhHHIhAAHIhAAHIhHIhHIhHIhHIhHh##h##hHIhHIhHIhHIhHIhHHIhAAHIhAAHIhHIhHIhHIhHIhHh##h##hHIhHIhHIhHIhHIhHHIhAAHIhAAHIhHIhHIhHIhHIhHh##h##hHIhHIhHIhHIhHIhHHIhAAHIhAAHIhHIhHIhHIhHIhHh##h##hHIhHIhHIhHIhHIhHHIhAAHIhAAHIhHIhHIhHIhHIhHh##h##hHIhHIhHIhHIhHIhHHIhAAHIhAAHIhHIhHIhHIhHIhHh##h##hHIhHIhHIhHIhHIhHHIhAAHIhAAHIhHIhHIhHIhHIhH");
    }

    @Test
    public void test09937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09937");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "#########              !ih#########", (java.lang.CharSequence) "... ssalC");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09938");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase(";gnirtS.gnal.avajL[ ssalc;gnirtS.gnal.avajL[ ssalc;gnirtS.gnal.avajL[ ssalc;gnirtS.gnal.avajL[ ssalc;gnirtS.gnal.avajL[ ssalc");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ";GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC" + "'", str1, ";GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC");
    }

    @Test
    public void test09939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09939");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("         4                                                                ...44444444444444444444", "Aaaaaaaaaaaaclass[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;aaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##", "ng;class [Ljava.lang.String;aaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "         4                                                                ...44444444444444444444" + "'", str3, "         4                                                                ...44444444444444444444");
    }

    @Test
    public void test09940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09940");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI         HI!IH!IH                           AAA444444444444444444444444444444444444", (java.lang.CharSequence) "!ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih !ih!ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09941");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09942");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!       hHI!HI!HI!HI!HI!HI!", "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "   ");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "hi!i!hi!hi!######################!ih!ihhi!i!hi!hi!######################!ih!ihhi!i!hi!hi!######################!ih!ihhi!i!hi!hi!######################!ih!ihhi!i!hi!hi!######################!ih!ihhi!i!hi!hi!######################!ih!ihhi!i!hi!hi!######################!ih!ihhi!i!hi!hi!######################!ih!ihhi!i!hi!hi!######################!ih!ihhi!i!hi!hi!######################!ih!ihhi!i!hi!hi!######################!ih!ihhi!i!hi!hi!######################!ih!ihhi!i!hi!hi!######################!ih!ihhi!i!hi!hi!######################!ih!ihhi!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!       hHI!HI!HI!HI!HI!HI!" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!       hHI!HI!HI!HI!HI!HI!" + "'", str4, "hi!       hHI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "       hHI!HI!HI!HI!HI!HI" });
    }

    @Test
    public void test09943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09943");
        java.lang.CharSequence charSequence6 = null;
        char[] charArray13 = new char[] { '#', '#', ' ', '#', '#', 'a' };
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone(charSequence6, charArray13);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hi!hi!    ", charArray13);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "#######", charArray13);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!", charArray13);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "####################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray13);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "i!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!", charArray13);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '#', '#', ' ', '#', '#', 'a' });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 42 + "'", int20 == 42);
    }

    @Test
    public void test09944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09944");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("HI!HI!HI!HI!HI!Hhi!aahi!aaHI!HI!HI!HI!HI!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!HI!HI!HI!Hhi!aahi!aaHI!HI!HI!HI!HI!H" + "'", str1, "HI!HI!HI!HI!HI!Hhi!aahi!aaHI!HI!HI!HI!HI!H");
    }

    @Test
    public void test09945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09945");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("               ", "I!HI!#4444444444444444444444444444444444444444444444                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "               " + "'", str2, "               ");
    }

    @Test
    public void test09946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09946");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("iaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!", "...##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################Aaaaaaaaaaaaclass [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;aaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##", "!ih  !ih");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test09947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09947");
        char[] charArray4 = new char[] { 'a' };
        boolean boolean5 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "#######", charArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "HI", charArray4);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "...##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################Aaaaaaaaaaaaclassa[Ljava.lang.String;classa[Ljava.lang.String;classa[Ljava.lang.String;aaaaaaaaaaaaaaaaaaaaaaaaahi!##hi!##", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { 'a' });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test09948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09948");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "c  aaaaaaaaaaaaaa", "hi!hi!   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09949");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!", "hi!hi!hi!    hi!hi!    hi!hi!hi!    hi!hi!    ");
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "Hi!       ", (java.lang.CharSequence[]) strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                         i!    hi!hi!    hi!hi#######                                   ", (java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test09950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09950");
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray0 = new java.lang.reflect.GenericDeclaration[] {};
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray1 = new java.lang.reflect.GenericDeclaration[] {};
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray2 = new java.lang.reflect.GenericDeclaration[] {};
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray3 = new java.lang.reflect.GenericDeclaration[] {};
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray4 = new java.lang.reflect.GenericDeclaration[][] { genericDeclarationArray0, genericDeclarationArray1, genericDeclarationArray2, genericDeclarationArray3 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(genericDeclarationArray4);
        java.lang.Class<?> wildcardClass6 = genericDeclarationArray4.getClass();
        org.junit.Assert.assertNotNull(genericDeclarationArray0);
        org.junit.Assert.assertArrayEquals(genericDeclarationArray0, new java.lang.reflect.GenericDeclaration[] {});
        org.junit.Assert.assertNotNull(genericDeclarationArray1);
        org.junit.Assert.assertArrayEquals(genericDeclarationArray1, new java.lang.reflect.GenericDeclaration[] {});
        org.junit.Assert.assertNotNull(genericDeclarationArray2);
        org.junit.Assert.assertArrayEquals(genericDeclarationArray2, new java.lang.reflect.GenericDeclaration[] {});
        org.junit.Assert.assertNotNull(genericDeclarationArray3);
        org.junit.Assert.assertArrayEquals(genericDeclarationArray3, new java.lang.reflect.GenericDeclaration[] {});
        org.junit.Assert.assertNotNull(genericDeclarationArray4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test09951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09951");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("HI ! HI...", "4444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI ! HI..." + "'", str2, "HI ! HI...");
    }

    @Test
    public void test09952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09952");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaa                                !iaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09953");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaa...h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih", "    c  aaaaaaaaaaa###############################################################################");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aaa...h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih" });
    }

    @Test
    public void test09954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09954");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "HI!", 720, 1000);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09955");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################   hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi! ", "i!                    ", "      !ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!                                                                                                                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################   hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi! " + "'", str3, "#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################   hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi! ");
    }

    @Test
    public void test09956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09956");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("hi!hi! hi!   ", "  HI!HI!HI!HI!HI!                                                                         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi! hi!   " + "'", str2, "hi!hi! hi!   ");
    }

    @Test
    public void test09957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09957");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Hi!#hi!hi!###hi!hi!#", "HI!HI!HI!HI!HI!Hclass[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '4');
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##44444444444444444444444444444444444444444444444444444444444444444444444444444hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##hi!##h");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "Hi!#hi!hi!###hi!hi!#" });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "Hi!#hi!hi!###hi!hi!#" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Hi!#hi!hi!###hi!hi!#" + "'", str5, "Hi!#hi!hi!###hi!hi!#");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "H" });
    }

    @Test
    public void test09958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09958");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("                                                                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test09959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09959");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "salc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalcIHalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssal", (java.lang.CharSequence) "Ih!ih!i...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09960");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("4444444                                       ", "HI!HI!HI!HI!HI!HI         HI!IH!IH                           AAA444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444                                       " + "'", str2, "4444444                                       ");
    }

    @Test
    public void test09961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09961");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("                                             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test09962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09962");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("Class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;claHIclass [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;clas", "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;claHIclass [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;clas" + "'", str2, "Class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;claHIclass [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;clas");
    }

    @Test
    public void test09963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09963");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("                                       ");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test09964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09964");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat('#', 965);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#####################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str2, "#####################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test09965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09965");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################   hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi! ", "!IH!IH!IH!IH!IH!IH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################   hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi! " + "'", str2, "#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################   hi!       hi!       hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!       hi!       hi! ");
    }

    @Test
    public void test09966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09966");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("##!ih#######!ih#######!ih###!ih!ih#!ih#######!ih#######!ih#######!ih#######!ih###", "HIhhhh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##!ih#######!ih#######!ih###!ih!ih#!ih#######!ih#######!ih#######!ih#######!ih###" + "'", str2, "##!ih#######!ih#######!ih###!ih!ih#!ih#######!ih#######!ih#######!ih#######!ih###");
    }

    @Test
    public void test09967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09967");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("                                                                    ", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                 IH!IH!IH!IH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                    " + "'", str2, "                                                                    ");
    }

    @Test
    public void test09968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09968");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("HI! HI! HI! HI! HI! HI!HI! HI! HI! HI! HI! HI!", "hI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAA   HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI! HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!       HI!       HI!HI!       HI!       HIAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI! HI! HI! HI! HI! HI!HI! HI! HI! HI! HI! HI!" + "'", str2, "HI! HI! HI! HI! HI! HI!HI! HI! HI! HI! HI! HI!");
    }

    @Test
    public void test09969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09969");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "I!", (java.lang.CharSequence) "!ih!ih!ih!ih!ih", 263);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09970");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("Class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;" + "'", str1, "class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;");
    }

    @Test
    public void test09971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09971");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("Class[ljava.lang.string;class[ljava.lang.string;cl!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih", 15);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Class[ljava.lang.string;class[ljava.lang.string;cl!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih" + "'", str2, "Class[ljava.lang.string;class[ljava.lang.string;cl!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih");
    }

    @Test
    public void test09972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09972");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444", "H !IH !IH !IH !IH!IH !IH !IH !IH !IH !IH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09973");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("hi!i!    aaa!ihhi!  ", 26, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!i!    aaa!ihhi!  aaaaaa" + "'", str3, "hi!i!    aaa!ihhi!  aaaaaa");
    }

    @Test
    public void test09974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09974");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "hi!hi!ih!ih!ih!ih                                                                               hi!hi!                                              hi!                                             hi!hi!", (java.lang.CharSequence) "   hi!       hi!       hi!       hi!       hi! hi!hi!   hi!       hi!       hi!       hi!       hi! ", 42);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09975");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("Hi!");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!a", (java.lang.CharSequence[]) strArray3);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "###################################");
        boolean boolean12 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "hi!       ", (java.lang.CharSequence[]) strArray11);
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                             hi!hi!                                              ", "Hi!#hi!hi!###hi!hi!#", (int) (short) -1);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hia!aaahia!aaa", strArray11, strArray16);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "!IH!IH!IH!IH!IH!IHh       !ih", (java.lang.CharSequence[]) strArray11);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("... ssalC", strArray5, strArray11);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray11);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "Hi!" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "Hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "                                             ", "", "", "", "", "", "                                              " });
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hia!aaahia!aaa" + "'", str17, "hia!aaahia!aaa");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "... ssalC" + "'", str19, "... ssalC");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test09976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09976");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("HI!HI                      !hi!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI                      !hi!h" + "'", str1, "HI!HI                      !hi!h");
    }

    @Test
    public void test09977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09977");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("         i!    hi!hi!    hi!hi!hi!    hi!hi!                                  hi!hi!h", "class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;Aaaaaaa", " !ihhi!hi!######################   !ih!ih    !i");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "         i!    hi!hi!    hi!hi!hi!    hi!hi!                                  hi!hi!h" + "'", str3, "         i!    hi!hi!    hi!hi!hi!    hi!hi!                                  hi!hi!h");
    }

    @Test
    public void test09978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09978");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray11);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(strArray12);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Comparable<java.lang.String>[]) strArray12);
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.stripAll(strArray12);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "   hi!    ", (java.lang.CharSequence[]) strArray12);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!                                             hi!hi!                                                                                           hi!hi!                                              hi!                                             hi!hi!                                                                                           hi!hi!                                              ", (java.lang.CharSequence[]) strArray12);
        int int18 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "Hi!#hi!hi!###hi!hi!#", (java.lang.CharSequence[]) strArray12);
        java.lang.String[] strArray19 = null;
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.replaceEach("hi!       ", strArray12, strArray19);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444   !i", (java.lang.CharSequence[]) strArray12);
        int int22 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence[]) strArray12);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "", "hi!", "", "" });
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!", "", "hi!", "", "" });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!hi!" + "'", str13, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!hi!" + "'", str14, "hi!hi!");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "", "hi!", "", "" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 20 + "'", int18 == 20);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!       " + "'", str20, "hi!       ");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 720 + "'", int22 == 720);
    }

    @Test
    public void test09979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09979");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", 79);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                   ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...                   " + "'", str2, "                   ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...                   ");
    }

    @Test
    public void test09980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09980");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("aaaaaaaaaaaaclass.[Ljava.lang.String;class.[Ljava.lang.String;class.[Ljava.lang.String;aaaaaaaaaaaaaaaaaaaaaaaaahi.##hi.##", "###       ###################");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test09981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09981");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "I44444", (java.lang.CharSequence) "ih!ih!ih", 718);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09982");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", 46, 90);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test09983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09983");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("                                ######################!ih!ih#####################", "########################################################################################################################################################################################################################################################################################################################################################!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih!##################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                ######################!ih!ih#####################" + "'", str2, "                                ######################!ih!ih#####################");
    }

    @Test
    public void test09984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09984");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "         4                                                                ...", (java.lang.CharSequence) "Class [ljava.lang.string;class [ljava.lang.string;cl      !ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09985");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#hi!#Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!", 120);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                            Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#hi!#Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!" + "'", str2, "                            Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#hi!#Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!");
    }

    @Test
    public void test09986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09986");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aHIaaaaaaaaaaaaaaaaaaaaa################################!ih!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIa!", "Class[ljava.lang.string;class[ljava.lang.string;cl!ih!ih!!ih!ih!!ih!ih!!ih!ih!!ih!ih           ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test09987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09987");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("HI!HI!HI!HI!HI!H");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '#', 10, 10);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, ' ');
        int int8 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "HI", "!", "HI", "!", "HI", "!", "HI", "!", "HI", "!", "H" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HI ! HI ! HI ! HI ! HI ! H" + "'", str7, "HI ! HI ! HI ! HI ! HI ! H");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test09988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09988");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("aaaaaaaaaaaaaaaaaaaa################################!ih!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaa################################!ih!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaa################################!ih!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test09989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09989");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "class [ljava.langclass [ljava.lang", (java.lang.CharSequence) "hi!  hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         iIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", 68);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09990");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("               ####################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", 141);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str2, "######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test09991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09991");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                 ih!ih!ih!ih", "hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#hi!#hi!hi!###hi!hi!#");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                 " });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09992");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("###############################################hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!################################################", "iii...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###############################################hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!################################################" + "'", str2, "###############################################hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi!################################################");
    }

    @Test
    public void test09993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09993");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hi!hi!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!hi!", "hi!  hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         iIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test09994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09994");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   ##hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   ##", "hi! !I hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   ##hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   ##" + "'", str2, "hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   ##hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   hi!hi!hhi ! hi ! hi ! hi ! hi ! h    hi!hi!   ##");
    }

    @Test
    public void test09995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09995");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "               ####################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09996");
        java.lang.CharSequence charSequence1 = null;
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!hi!hi!hi!hi!hHI!AAHI!AAhi!hi!hi!hi!hi!h", "h!ih!ih!ih!ih!ih!");
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny(charSequence1, (java.lang.CharSequence[]) strArray4);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("######################    !ih!ih", 'a');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", strArray4, strArray8);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, "hi! h#hi!hi!###hi!hi!#! hi! hi!", 59, (int) (byte) 0);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!hi!hi!hi!hi!hHI!AAHI!AAhi!hi!hi!hi!hi!h" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "######################    !ih!ih" });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str9, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test09997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09997");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "I!HI!#I!HI!#I!HI!#I!HI!#I!HI!#I!HI!#", 34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09998");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("HI#HI#HI#HI#HI#HI#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI#HI#HI#HI#HI#HI" + "'", str1, "HI#HI#HI#HI#HI#HI");
    }

    @Test
    public void test09999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09999");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "Clss [Ljv.lng.String;clss [Ljv.lng.String;clss [Ljv.lng.String;            ", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaclass [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;aaaaaaaaaaaaaaaaaaaaaaaaahi!aahi!aa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test10000");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("   ###########               iH!IH!IH!I");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "   ###########               IH!IH!IH!I" + "'", str1, "   ###########               IH!IH!IH!I");
    }
}

