package org.apache.commons.lang3;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest10 {

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
    public void test05001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05001");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "                      hi############################################################################", (java.lang.CharSequence) "hhhhhhhhhhhhhhhhhhhhhhhhhhhH!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05002");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("                                    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !", (-1), 117);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test05003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05003");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################  !!          HI!    !!                                    !!                                    !!                                           !!  ", (java.lang.CharSequence) "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!IH                         hi######");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################  !!          HI!    !!                                    !!                                    !!                                           !!  " + "'", charSequence2, "################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################  !!          HI!    !!                                    !!                                    !!                                           !!  ");
    }

    @Test
    public void test05004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05004");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", (java.lang.CharSequence) "                      HI!                             HI!                           ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05005");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("hi!hi!hi!hi!hi!h", "                                HI                             hi                             hi ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05006");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("..        ", "!IH       hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "..        " + "'", str2, "..        ");
    }

    @Test
    public void test05007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05007");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("HI!hhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhh", 42, "Hi!hi!hi!hi!hi!hi!hi!hi!hi!                                                                                     hiHI!HI!HI!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!hhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhHi!h" + "'", str3, "HI!hhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhHi!h");
    }

    @Test
    public void test05008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05008");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("   !iHHi!                                       !iHHi!       !iHHi!              !iHHi!       HHHHHHHHHHHHHHHHHHHHHHHHHHi!       !iH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "   !iHHi!                                       !iHHi!       !iHHi!              !iHHi!       HHHHHHHHHHHHHHHHHHHHHHHHHHi!       !iH" + "'", str1, "   !iHHi!                                       !iHHi!       !iHHi!              !iHHi!       HHHHHHHHHHHHHHHHHHHHHHHHHHi!       !iH");
    }

    @Test
    public void test05009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05009");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("!IHHI!                         ...", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!IHHI!                         ...!IHHI!                         ...!IHHI!                         ...!IHHI!                         ...!IHHI!                         ...!IHHI!                         ...!IHHI!                         ...!IHHI!                         ...!IHHI!                         ...!IHHI!                         ..." + "'", str2, "!IHHI!                         ...!IHHI!                         ...!IHHI!                         ...!IHHI!                         ...!IHHI!                         ...!IHHI!                         ...!IHHI!                         ...!IHHI!                         ...!IHHI!                         ...!IHHI!                         ...");
    }

    @Test
    public void test05010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05010");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("   HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!" + "'", str1, "HI!");
    }

    @Test
    public void test05011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05011");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray7 = new char[] {};
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "!!!!!!!!!!!!!!!!!!!!!!!!!", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "       hi!", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", charArray7);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "                         hi!", charArray7);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!IH           !ih   ##########       ", charArray7);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence0, charArray7);
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
    public void test05012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05012");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("!iHHi!                                       !iHHi!       !iHHi!              !iHHi!       HHHHHHHHHHHHHHHHHHHHHHHHHHi!       !iH", "       #HI#");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!iHHi!                                       !iHHi!       !iHHi!              !iHHi!       HHHHHHHHHHHHHHHHHHHHHHHHHHi!       !i" + "'", str2, "!iHHi!                                       !iHHi!       !iHHi!              !iHHi!       HHHHHHHHHHHHHHHHHHHHHHHHHHi!       !i");
    }

    @Test
    public void test05013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05013");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("       #hi#!#hi#!#hi#!#hi#!!!!!!!!!!!!!!!!!!!!!!!!!!#hi#!!#ih#              #hi#!#hi#!#hi#!                      hi       #hi#!!#ih#              #hi#!!#ih#       #!!!!!!!!!!!!!!!!!!!!!!!!!!#ih#       #hi#!", "HI! hi! hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05014");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("!!          HI!    !!                                    !!                                    !!                                           !!", "                                                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!          HI!    !!                                    !!                                    !!                                           !!" + "'", str2, "!!          HI!    !!                                    !!                                    !!                                           !!");
    }

    @Test
    public void test05015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05015");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "hI!hi!##############################################################################################", (java.lang.CharSequence) "##############################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05016");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "                                                                                                  HI !");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05017");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                              HI!HI!HI!HI!!!!!!!!!!!!!!!!!!!!!!!!!!HI!                              ", " HI!HI!HI!HI!HI!HI!HI!HI!HI", (int) (short) 10);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
    }

    @Test
    public void test05018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05018");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("i!ahi!ahi!ahi!a!!!!!!!!!!!!!!!!!!!!!!!!!ahi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i!ahi!ahi!ahi!a!!!!!!!!!!!!!!!!!!!!!!!!!ahi" + "'", str1, "i!ahi!ahi!ahi!a!!!!!!!!!!!!!!!!!!!!!!!!!ahi");
    }

    @Test
    public void test05019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05019");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("HI!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!" + "'", str1, "hi!hi!");
    }

    @Test
    public void test05020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05020");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test05021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05021");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("                            hi!hi!hi!                             hi!hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                            hi!hi!hi!                             hi!hi" + "'", str1, "                            hi!hi!hi!                             hi!hi");
    }

    @Test
    public void test05022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05022");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                                       ", "          !iHHi! ", "...4444 hI!hI!hI!hI!hI!hI!hI!hI!hI");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test05023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05023");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "                                hi!                             hi!                             hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05024");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05025");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("#hi#!#hi#!#hi#!#hi#!!!!!!!!!!!!!!!!!!!!!!!!!!#hi#!!#ih# #hi#!#hi#!#hi#!#hi#!!!!!!!!!!!!!!!!!!!!!!!!!!#hi#!!#ih# #hi#!!#ih# #hi#!!#ih# #!!!!!!!!!!!!!!!!!!!!!!!!!!#ih# #hi#!", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#hi#! #!!!!!!!!!!!!!!!!!!!!!!!!!!#ih# #hi#!!#ih# #hi#!!#ih# #hi#!#hi#!#hi#!#hi#!!!!!!!!!!!!!!!!!!!!!!!!!!#hi#!!#ih# #hi#!#hi#!#hi#!#hi#!!!!!!!!!!!!!!!!!!!!!!!!!!#hi#!!#ih#" + "'", str2, "#hi#! #!!!!!!!!!!!!!!!!!!!!!!!!!!#ih# #hi#!!#ih# #hi#!!#ih# #hi#!#hi#!#hi#!#hi#!!!!!!!!!!!!!!!!!!!!!!!!!!#hi#!!#ih# #hi#!#hi#!#hi#!#hi#!!!!!!!!!!!!!!!!!!!!!!!!!!#hi#!!#ih#");
    }

    @Test
    public void test05026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05026");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("IH                                                 ", "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH...H!IH!IH!IH!IH!IH!IH!IH!IH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IH                                                 " + "'", str2, "IH                                                 ");
    }

    @Test
    public void test05027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05027");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 22);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "!    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !", (java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test05028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05028");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("    HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "    hi" + "'", str1, "    hi");
    }

    @Test
    public void test05029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05029");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "   hi!           HI!", "  hi!!ihhi!!ihhi!!ihhi!!ihhi!!ih   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test05030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05030");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                         hi!", '#');
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                         hi!" });
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test05031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05031");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "  !!                                           !!                                    !!                                    !!                                    !!  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test05032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05032");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                         hi!HI!hi!                             hi!hi!hi!                             hi!hi!", 291, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                         hi!HI!hi!                             hi!hi!hi!                             hi!hi!44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                         hi!HI!hi!                             hi!hi!hi!                             hi!hi!44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test05033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05033");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("  ...     ", 286, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test05034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05034");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("!                             hi!                             hi!", "  hi!!ihhi!!ihhi!!ihhi!!ihhi!!ih   ", "       HI!       HI!       HI!       HI!       HI!       HI!       HI!IH", 687);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "!                             hi!                             hi!" + "'", str4, "!                             hi!                             hi!");
    }

    @Test
    public void test05035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05035");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "aaaaaaaaaaaaaaaaahi!hi!hi!hi!   hi!    hi!hi!hi!hi!!", (java.lang.CharSequence) "HI!    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test05036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05036");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("HI                                HI!                             HI!                             HI!", 27, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05037");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "##########hi!HI!#################################################################################!!!!!####################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05038");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("Aaaaaaaaaaaaaaaa", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A" + "'", str2, "A");
    }

    @Test
    public void test05039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05039");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("           IhHI!HI!HI!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "           IhHI!HI!HI!" + "'", str2, "           IhHI!HI!HI!");
    }

    @Test
    public void test05040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05040");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "                             hi!                             hi!", (java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05041");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "hi!ahi!ahi!ahi!a!!!!!!!!!!!!!!!!!!!!!!!!!ahi!", (java.lang.CharSequence) "HI!                             HI!                             HI!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test05042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05042");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("hi!ihhi!ihhi!!!ihhi!ihhi!HI!ihhi!ihhi!!", "hI! hi! hi!", "                                                                                                 hi!!ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!ihhi!ihhi!!!ihhi!ihhi!HI!ihhi!ihhi!!" + "'", str3, "hi!ihhi!ihhi!!!ihhi!ihhi!HI!ihhi!ihhi!!");
    }

    @Test
    public void test05043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05043");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", (java.lang.CharSequence) "   HI ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05044");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test05045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05045");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!HI!                             hi!                             hi!  HI!", "hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih              hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!", 35);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '4', 146, 22);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test05046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05046");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hhhhhhhhhh                      hi!!IHHI!                                       !IHHI!       !IHHI!              !IHHI!       HHHHHHHHHHHHHHHHHHHHHHHHHHI!       !IH", "hi!                             hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05047");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("  HI!!IHHI!!IHHI!!IHHI!!IHHI!!IH   ", "hi!##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test05048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05048");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("                                HI                                hi!                             hi!                             hi! ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HIhi!hi!hi!" + "'", str1, "HIhi!hi!hi!");
    }

    @Test
    public void test05049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05049");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("!!!!!!!!!!!!!!!!!!!!!!!!", "                            HI                                                                            ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!!!!!!!!!!!!!!!!!!!!!!!!" });
    }

    @Test
    public void test05050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05050");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "      ", (java.lang.CharSequence) "                             !i...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05051");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("HI!HI!HI!HI!   HI!    HI!HI!HI!HI!!", "         ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!HI!HI!   HI!    HI!HI!HI!HI!!" + "'", str2, "HI!HI!HI!HI!   HI!    HI!HI!HI!HI!!");
    }

    @Test
    public void test05052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05052");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                hi!!ih                                       hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                             hi!", (java.lang.CharSequence[]) strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "!!!!!!!!!!!!!!!!!!!!!!!!!");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '4');
        int int9 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!IHaaaaaaaaaaa!ihaaa#########", (java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                ", "hi", "!!", "ih", "                                       ", "hi", "!!", "ih", "       ", "hi", "!!", "ih", "              ", "hi", "!!", "ih", "       ", "!!!!!!!!!!!!!!!!!!!!!!!!!!", "ih", "       ", "hi", "!" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "                                ", "hi", "", "ih", "                                       ", "hi", "", "ih", "       ", "hi", "", "ih", "              ", "hi", "", "ih", "       ", "", "ih", "       ", "hi", "" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "                                4hi4!!4ih4                                       4hi4!!4ih4       4hi4!!4ih4              4hi4!!4ih4       4!!!!!!!!!!!!!!!!!!!!!!!!!!4ih4       4hi4!" + "'", str8, "                                4hi4!!4ih4                                       4hi4!!4ih4       4hi4!!4ih4              4hi4!!4ih4       4!!!!!!!!!!!!!!!!!!!!!!!!!!4ih4       4hi4!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 705 + "'", int9 == 705);
    }

    @Test
    public void test05053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05053");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                           aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                           aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                           aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test05054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05054");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                           hi", "hi!ih       !ih       !ih    ...", 0);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "Hhhhhhhhhhhhhhhhhhhhhhhhh hI!hI!hI!hI!hI!hI!hI!hI!hI");
        boolean boolean7 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "                           hi" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "i" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test05055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05055");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "IH    IH", (java.lang.CharSequence) "!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05056");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("", 126);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                              " + "'", str2, "                                                                                                                              ");
    }

    @Test
    public void test05057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05057");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("ih                         ", 696);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ih                         " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ih                         ");
    }

    @Test
    public void test05058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05058");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("!ihhi!ihhi!", 373, "#########################################################################################...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#########################################################################################...#########################################################################################...#########################################################################################...######################################################################################!ihhi!ihhi!" + "'", str3, "#########################################################################################...#########################################################################################...#########################################################################################...######################################################################################!ihhi!ihhi!");
    }

    @Test
    public void test05059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05059");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "hi!!ih                                hi!!ih                                hi!!ih                                hi!!ih                                       hi!!ih                             HI                                HI!                             HI!                             HI! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05060");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("!!!!!!!!!!!!!!!!!!!!!!!!!#hi#!!#ih# HI  #hi#!!#ih#       #!!!!!!!!!!!!!!!!!!!!!!!!!!#ih#       #hi#!", 28);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#!!#ih# HI  #hi#!!#ih#       #!!!!!!!!!!!!!!!!!!!!!!!!!!#ih#       #hi#!" + "'", str2, "#!!#ih# HI  #hi#!!#ih#       #!!!!!!!!!!!!!!!!!!!!!!!!!!#ih#       #hi#!");
    }

    @Test
    public void test05061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05061");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "!IHHIHI!!IHH", (java.lang.CharSequence) "                4HI4!!4IH4       4HI4!!4IH4              4HI4!!4IH4       4!!!!!!!!!!!!!!!!!!!!!!!!!!4IH4       4HI4!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05062");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                                hi!    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test05063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05063");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "...hi!!ih...", 75);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05064");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "hi!           HI", (java.lang.CharSequence) "hi!                         hi!                         hi!                         hi!                                hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05065");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny(charSequence0, (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!Hi!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!Hi!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05066");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                           hi", "hi!!ih                                hi!!ih                                hi!!ih                                hi!!ih                                       hi!!ih      ", 157);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                           hi" });
    }

    @Test
    public void test05067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05067");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                  !ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!" + "'", str1, "                  !ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!");
    }

    @Test
    public void test05068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05068");
        char[] charArray10 = new char[] {};
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "!!!!!!!!!!!!!!!!!!!!!!!!!", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "       hi!", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "                         hi!", charArray10);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!IH           !ih   ##########       ", charArray10);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "HI!HI!HI!HI       HI!!HI!", charArray10);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ", charArray10);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!IH           !ih   ##########       ", charArray10);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "aaaaaaaaaa!iHHiHI!!iHHiaaaaaaaaa", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test05069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05069");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "                                                                          !!!!!!!!!!!!!!!!!!!!!!!", (int) (byte) 100, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05070");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("aaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaa..." + "'", str2, "aaaaaaa...");
    }

    @Test
    public void test05071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05071");
        java.lang.CharSequence charSequence0 = null;
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf(charSequence0, (java.lang.CharSequence) "#########################################################################################...#########################################################################################...#########################################################################################...######################################################################################!ihhi!ihhi!", 24);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05072");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator(" hI!hI!hI!hI!hI!hI!hI!hI!hI", "A", 10);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { " hI!hI!hI!hI!hI!hI!hI!hI!hI" });
    }

    @Test
    public void test05073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05073");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                         hi", "...          ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi" });
    }

    @Test
    public void test05074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05074");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("HI!        ", "!ih                      hhhhhhhhhh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!        " + "'", str2, "HI!        ");
    }

    @Test
    public void test05075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05075");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "HI!hi!hi!                             hi!hi!", 62, 11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05076");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase(charSequence0, (java.lang.CharSequence) "Hhhhhhhhhhhhhhhhhhhhhhhhh hI!hI!hI!hI!hI!hI!hI!hI!hI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05077");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray7 = new char[] {};
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "!!!!!!!!!!!!!!!!!!!!!!!!!", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                hi!", charArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "       hi!", charArray7);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence3, charArray7);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                         hi", charArray7);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                         hi", charArray7);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "...      hi!!ih       ......      hi!!ih       ......      hi!!ih       ......      hi!!ih       ......      hi!!ih       ......      hi!!ih       ......      hi!!ih       ......      hi!!ih       ......      hi!!ih       ......      hi!!ih       ......      hi!!ih       ......      hi!!ih       ......      hi!!ih       ...", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test05078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05078");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd(" !IH                   !", "                             HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05079");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("HIhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", 296, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HIhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "HIhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test05080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05080");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "                          !!                                           !!  ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 75 + "'", int1 == 75);
    }

    @Test
    public void test05081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05081");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("  ;   ", "                         #################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  ;   " + "'", str2, "  ;   ");
    }

    @Test
    public void test05082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05082");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("a", 22);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a" + "'", str2, "a");
    }

    @Test
    public void test05083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05083");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "!ih hhhhhhhhhh", (java.lang.CharSequence) "!ihhi!ihhi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05084");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("  !!          HI!    !!                                    !!                                    !!                                           !!  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "  !!          HI!    !!                                    !!                                    !!                                           !!  " + "'", str1, "  !!          HI!    !!                                    !!                                    !!                                           !!  ");
    }

    @Test
    public void test05085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05085");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "ih                         ", (java.lang.CharSequence) "Hi!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!Hi!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!Hi!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05086");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05087");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                      hi############################################################################", 16);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                      hi############################################################################" + "'", str2, "                      hi############################################################################");
    }

    @Test
    public void test05088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05088");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("HI!HI!HI!HI       HI!!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!HI!HI       HI!!HI!" + "'", str1, "HI!HI!HI!HI       HI!!HI!");
    }

    @Test
    public void test05089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05089");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("hi!HI!                             hi!                             hi!  HI!                hi!HI!hi!                             hi!hi!hi!                             hi!hi!", ";", "                         hi!ih       !ih       !ih       !ih       !ih       !ih       !ih       ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test05090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05090");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "   IH    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05091");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "HIhi!hi!hi!", (java.lang.CharSequence) "hI!hI!hI!hI!hI!hI!hI!hI!hIaAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05092");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("         ...4444 hI!hI!hI!hI!hI!hI!hI!hI!hI", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         ...4444 hI!hI!hI!hI!hI!hI!hI!hI!hI" + "'", str2, "         ...4444 hI!hI!hI!hI!hI!hI!hI!hI!hI");
    }

    @Test
    public void test05093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05093");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("           hi!", "!ih");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "           ", "", "", "" });
    }

    @Test
    public void test05094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05094");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("HI!hiHI", "i!ahi!ahi!ahi!a!!!!!!!!!!!!!!!!!!!!!!!!!ahi");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '4');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HI!hiHI" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HI!hiHI" + "'", str4, "HI!hiHI");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HI!hiHI" + "'", str6, "HI!hiHI");
    }

    @Test
    public void test05095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05095");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                         HI                                HI!                             HI!                             HI!                               ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "                         ", "HI", "                                ", "HI", "!", "                             ", "HI", "!", "                             ", "HI", "!", "                               " });
    }

    @Test
    public void test05096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05096");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "", 51);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05097");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                        IH    IH", "hi!                             HI!                             HI!", (int) ' ');
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test05098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05098");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("HI!HI!                           HI!HI!", 0, "                                HI!                   HI!hhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhh                     hi!                             ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!HI!                           HI!HI!" + "'", str3, "HI!HI!                           HI!HI!");
    }

    @Test
    public void test05099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05099");
        java.lang.String[][][][] strArray0 = null;
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.join(strArray0);
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test05100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05100");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("           !IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I            ", 25);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I            " + "'", str2, "H!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I            ");
    }

    @Test
    public void test05101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05101");
        java.lang.Object[] objArray0 = null;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(objArray0, "hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!h", 86, 158);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test05102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05102");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IH" + "'", str1, "IH");
    }

    @Test
    public void test05103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05103");
        char[] charArray6 = new char[] {};
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "!!!!!!!!!!!!!!!!!!!!!!!!!", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "       hi!", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", charArray6);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "..        ", charArray6);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "H!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I            ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test05104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05104");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "                       HI  ", (java.lang.CharSequence) "hiHI!HI!HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05105");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh   ", (java.lang.CharSequence) "!IhhI!!!!!!!!!!!!!!!!!!!!", 289);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05106");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                     !ih                         HI!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test05107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05107");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!", "       hi!");
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        java.lang.Class<?> wildcardClass6 = strArray5.getClass();
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        java.lang.Class<?> wildcardClass9 = strArray8.getClass();
        java.lang.CharSequence charSequence10 = null;
        char[] charArray14 = new char[] {};
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "!!!!!!!!!!!!!!!!!!!!!!!!!", charArray14);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                hi!", charArray14);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "       hi!", charArray14);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence10, charArray14);
        java.lang.Class<?> wildcardClass19 = charArray14.getClass();
        java.lang.String[] strArray24 = org.apache.commons.lang3.StringUtils.split("", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (int) (short) 10);
        java.lang.String[] strArray25 = org.apache.commons.lang3.StringUtils.stripAll(strArray24);
        boolean boolean26 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "!!!", (java.lang.CharSequence[]) strArray25);
        java.lang.String str30 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray25, "hi!                         hi!                         hi!                         hi!                                hi!", (int) (short) 100, 2);
        java.lang.String str32 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray25, "!!!!!!!!!hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!");
        java.lang.Class<?> wildcardClass33 = strArray25.getClass();
        java.lang.Class[] classArray34 = new java.lang.Class[] { wildcardClass3, wildcardClass6, wildcardClass9, wildcardClass19, wildcardClass33 };
        java.lang.String[] strArray37 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!", "       hi!");
        java.lang.Class<?> wildcardClass38 = strArray37.getClass();
        java.lang.String[] strArray40 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        java.lang.Class<?> wildcardClass41 = strArray40.getClass();
        java.lang.String[] strArray43 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        java.lang.Class<?> wildcardClass44 = strArray43.getClass();
        java.lang.CharSequence charSequence45 = null;
        char[] charArray49 = new char[] {};
        boolean boolean50 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "!!!!!!!!!!!!!!!!!!!!!!!!!", charArray49);
        boolean boolean51 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                hi!", charArray49);
        int int52 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "       hi!", charArray49);
        int int53 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence45, charArray49);
        java.lang.Class<?> wildcardClass54 = charArray49.getClass();
        java.lang.String[] strArray59 = org.apache.commons.lang3.StringUtils.split("", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (int) (short) 10);
        java.lang.String[] strArray60 = org.apache.commons.lang3.StringUtils.stripAll(strArray59);
        boolean boolean61 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "!!!", (java.lang.CharSequence[]) strArray60);
        java.lang.String str65 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray60, "hi!                         hi!                         hi!                         hi!                                hi!", (int) (short) 100, 2);
        java.lang.String str67 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray60, "!!!!!!!!!hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!");
        java.lang.Class<?> wildcardClass68 = strArray60.getClass();
        java.lang.Class[] classArray69 = new java.lang.Class[] { wildcardClass38, wildcardClass41, wildcardClass44, wildcardClass54, wildcardClass68 };
        java.lang.Class[][] classArray70 = new java.lang.Class[][] { classArray34, classArray69 };
        java.lang.String str71 = org.apache.commons.lang3.StringUtils.join(classArray70);
        java.lang.String str72 = org.apache.commons.lang3.StringUtils.join((java.lang.reflect.Type[][]) classArray70);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" });
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" });
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(classArray34);
        org.junit.Assert.assertArrayEquals(classArray34, new java.lang.Class[] { java.lang.String[].class, java.lang.String[].class, java.lang.String[].class, char[].class, java.lang.String[].class });
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] { "############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" });
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] { "############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" });
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertArrayEquals(charArray49, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertArrayEquals(strArray59, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertArrayEquals(strArray60, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertNotNull(wildcardClass68);
        org.junit.Assert.assertNotNull(classArray69);
        org.junit.Assert.assertArrayEquals(classArray69, new java.lang.Class[] { java.lang.String[].class, java.lang.String[].class, java.lang.String[].class, char[].class, java.lang.String[].class });
        org.junit.Assert.assertNotNull(classArray70);
    }

    @Test
    public void test05108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05108");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) ". hi!..", (java.lang.CharSequence) "44444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05109");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("    HI");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "", "", "", "", "HI" });
    }

    @Test
    public void test05110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05110");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!H   hi!    HI!!IH       hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444hi!!IH       hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih4444444444444...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI", (java.lang.CharSequence) "   hi!HI!                             hi!                             hi!  HI!!ih                         HI!", 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05111");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "HI!IH       !IH       !IH       !IH       !IH       !IH       !IH", 116);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05112");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                      HI!                             HI!                             HI! ", "!!hi!!ih              hi!h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                      HI!                             HI!                             HI! " + "'", str2, "                      HI!                             HI!                             HI! ");
    }

    @Test
    public void test05113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05113");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test05114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05114");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "                      hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test05115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05115");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "######ih                         HI!##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", 12);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05116");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("hi! hhhhhhhhhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI! HHHHHHHHHH" + "'", str1, "HI! HHHHHHHHHH");
    }

    @Test
    public void test05117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05117");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("hhhhhhhhhhhhhhhhhhhhhhhhhhhH!!", 222, 285);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test05118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05118");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("!                             hi!                             hi!!                             hi!                             hi!!                             hi!                             hi!!                             hi!                             hi!!                             hi!                             hi!!                             hi!                             hi!!                             hi!                             hi!!                             hi!                             hi!!                             hi!                             hi!!                             hi!                             hi!", "hI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!                             hi!                             hi!!                             hi!                             hi!!                             hi!                             hi!!                             hi!                             hi!!                             hi!                             hi!!                             hi!                             hi!!                             hi!                             hi!!                             hi!                             hi!!                             hi!                             hi!!                             hi!                             hi!" });
    }

    @Test
    public void test05119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05119");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) " i!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! i!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! i!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "hhhhhhhhhh                      hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05120");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("aaaaaaaaaaaaaaaaa!ih       ", "                                                !IH                                                 ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test05121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05121");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                           ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "                           " });
    }

    @Test
    public void test05122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05122");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) " hI!hI...", 727, 727);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05123");
        char[] charArray3 = new char[] {};
        boolean boolean4 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "!!!!!!!!!!!!!!!!!!!!!!!!!", charArray3);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                hi!", charArray3);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "!    ", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test05124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05124");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "hi!    ", (java.lang.CharSequence) "hi!!ih                                       hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!######################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05125");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("...HI!!IHHI!!IHHI!!IH...", "hi!!ih                                       hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...HI!!IHHI!!IHHI!!IH..." + "'", str2, "...HI!!IHHI!!IHHI!!IH...");
    }

    @Test
    public void test05126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05126");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("    HI!  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!" + "'", str1, "HI!");
    }

    @Test
    public void test05127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05127");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("                         hi!", 96, 34);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test05128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05128");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                         hi HI hi                              hi hi hi                              hi hi", "!ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                         hi HI" + "'", str2, "                         hi HI");
    }

    @Test
    public void test05129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05129");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("!ih                                                                                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih                                                                                     " + "'", str1, "!ih                                                                                     ");
    }

    @Test
    public void test05130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05130");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("hi!!ih                                hi!!ih                                hi!!ih                                hi!!ih                                       hi!!ih                             HI                                HI!                             HI!                             HI!", 13, 875);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!!ih                                hi!!ih                                hi!!ih                                hi!!ih                                       hi!!ih                             HI                                HI!                             HI!                             HI!" + "'", str3, "hi!!ih                                hi!!ih                                hi!!ih                                hi!!ih                                       hi!!ih                             HI                                HI!                             HI!                             HI!");
    }

    @Test
    public void test05131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05131");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "                                                                                                       !IHHI!       !IHHI!              !IHHI!       HHHHHHHHHHHHHHHHHHHHHHHHHHI!       !IH                                                                                                  ", (java.lang.CharSequence) "##########hi!HI!#################################################################################!!!!!####################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05132");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "4444 hI!hI!hI!hI!hI!hI!hI!hI!hI", 32, 146);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
    }

    @Test
    public void test05133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05133");
        java.lang.CharSequence charSequence3 = null;
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "hi!");
        int int8 = org.apache.commons.lang3.StringUtils.lastIndexOfAny(charSequence3, (java.lang.CharSequence[]) strArray5);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.split("                                                                                                 hi!", "!ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       ", 96);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                                                                                 HI!", strArray5, strArray12);
        java.lang.String[] strArray14 = null;
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly(".                             hi!..", strArray12, strArray14);
        java.lang.String[] strArray16 = null;
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEach("##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!IH                         hi######", strArray14, strArray16);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "                                                                                                 HI!" + "'", str13, "                                                                                                 HI!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ".                             hi!.." + "'", str15, ".                             hi!..");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!IH                         hi######" + "'", str17, "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!IH                         hi######");
    }

    @Test
    public void test05134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05134");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "HIhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", (java.lang.CharSequence) "##########hi!HI!####################################################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 98 + "'", int2 == 98);
    }

    @Test
    public void test05135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05135");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("##", "hi!ih       !ih       !ih    ...#...", "                                    !    !    !    !    !    !    !4444444444                                    !    !    !    !    !    !    ! ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test05136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05136");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                              HI  ", '4', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                              HI  " + "'", str3, "                              HI  ");
    }

    @Test
    public void test05137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05137");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "!iHHi!                             ", (java.lang.CharSequence) "HI!hi!                             hi!hi!hi!                             hi!hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05138");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "   hi!           h", (java.lang.CharSequence) "hI!hI!hI!hI!hI!hI!hI!hI!h", 12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05139");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("                                HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                H" + "'", str1, "                                H");
    }

    @Test
    public void test05140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05140");
        char[] charArray3 = new char[] {};
        boolean boolean4 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "!!!!!!!!!!!!!!!!!!!!!!!!!", charArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!   hi!    hi!hi!hi!hi!!", charArray3);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                           hi", charArray3);
        java.lang.Class<?> wildcardClass7 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test05141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05141");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "hi! HI!", (java.lang.CharSequence) "!    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !                                    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05142");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("44444444444444444444444444444444", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444" + "'", str2, "44444444444444444444444444444444");
    }

    @Test
    public void test05143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05143");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "!IH !IH !IH !IH !IH !IH HI!IH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05144");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "                         HI                                HI!                             HI!                             HI!                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test05145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05145");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "################################################################################################!!!!!!!!!hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!################################################################################################", (java.lang.CharSequence) "hhhhhhhhhh                      hi!!IHHI!                                       !IHHI!       !IHHI!              !IHHI!       HHHHHHHHHHHHHHHHHHHHHHHHHHI!       !IH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05146");
        char[] charArray5 = new char[] {};
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "!!!!!!!!!!!!!!!!!!!!!!!!!", charArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", charArray5);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hI!hI!hI!hI!hI!hI!hI!hI!hI", charArray5);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi", charArray5);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test05147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05147");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("HI!HI!HI!HI       HI!!HI!", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!!HI! HI!HI!HI!HI" + "'", str2, "HI!!HI! HI!HI!HI!HI");
    }

    @Test
    public void test05148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05148");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "ang.String;class [Ljava.lang.String;", (java.lang.CharSequence) "HI!HI!HI!HI                                HI                                HI!                             HI!                             HI!                                 HI                                HI!                             HI!                             HI!                                 HI                                HI!                             HI!                             HI!                                 HI                                HI!                             HI!                             HI!                                 HI                                HI!                             HI!                             HI! !HI!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05149");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                                                          hi", 36, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                          hi" + "'", str3, "                                                                                          hi");
    }

    @Test
    public void test05150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05150");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "... hi!!ih hi!!ih hi!!ih ... ... hi!!ih hi!!ih hi!!ih ... ... hi!!ih hi!!ih hi!!ih ... ... hi!!ih hi!!ih hi!!ih ... ... hi!!ih hi!!ih hi!!ih ...", "!ihhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05151");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("HI!HI!HI!HI!!!!!!!!!!!!!!!!!!!!!!!!!!HI!", 0, 700);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!HI!HI!HI!!!!!!!!!!!!!!!!!!!!!!!!!!HI!" + "'", str3, "HI!HI!HI!HI!!!!!!!!!!!!!!!!!!!!!!!!!!HI!");
    }

    @Test
    public void test05152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05152");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "4444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05153");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("HI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!" + "'", str2, "HI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!");
    }

    @Test
    public void test05154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05154");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("", "HI!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05155");
        char[] charArray5 = new char[] {};
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "!!!!!!!!!!!!!!!!!!!!!!!!!", charArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                hi!", charArray5);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "       hi!", charArray5);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "!ih       HI!                                       ", charArray5);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!Hi!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!Hi!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test05156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05156");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hi!!ih                                hi!!ih                                hi!!ih                                hi!!ih                                       hi!!ih", "                                hi!  hi!           HI!                                hi!  hi!           HI!hi!  hi!           HI!       hi!  hi!           HI!!!!!!!!!!!!!!!!!!!!!!!!!!  hi!           HI!hi!");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05157");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("    HI", 46);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    HI                                        " + "'", str2, "    HI                                        ");
    }

    @Test
    public void test05158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05158");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "#!!#ih# HI  #hi#!!#ih#       #!!!!!!!!!!!!!!!!!!!!!!!!!!#ih#       #hi#!", (java.lang.CharSequence) "                                hi!!ih                                       hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test05159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05159");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence1 = null;
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf(charSequence0, charSequence1, 79);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05160");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("...hi!!ihhi!!ihhi!!ih......hi!!ihhi!!ihhi!!ih......hi!!ihhi!!ihhi!!ih......hi!!ihhi!!ihhi!!ih......hi!!ihhi!!ihhi!!ih...", 727, 46);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...!!ihhi!!ihhi!!ih......hi!!ihhi!!ihhi!!ih..." + "'", str3, "...!!ihhi!!ihhi!!ih......hi!!ihhi!!ihhi!!ih...");
    }

    @Test
    public void test05161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05161");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "!!                                           !!                                    !!                                    !!                                    !!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05162");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("                     ... hi!!ih hi!!ih hi!!ih ...            ", (int) (short) 1, 16);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                " + "'", str3, "                ");
    }

    @Test
    public void test05163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05163");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "       HI!                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05164");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "  hi!           HI!", (java.lang.CharSequence) "...       hi!!ih       hi!!ih   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05165");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "                       HI  ", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05166");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("hi!HI!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!HI!hi!hi!hi!hi!hi!hi!" + "'", str1, "hi!HI!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test05167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05167");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat('#', 727);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str2, "#######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test05168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05168");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("HI!HI!HI!hi", "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH...H!IH!IH!IH!IH!IH!IH!IH!IH", "... HI!!IH HI!!IH HI!!IH ...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!HI!HI!hi" + "'", str3, "HI!HI!HI!hi");
    }

    @Test
    public void test05169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05169");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "HI!HI!HI!HI                                HI                                HI!                             HI!                             HI!                                 HI                                HI!                             HI!                             HI!                                 HI                                HI!                             HI!                             HI!                                 HI                                HI!                             HI!                             HI!                                 HI                                HI!                             HI!                             HI! !HI!", "                                         hi!                                                                                          ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test05170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05170");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                      hi############################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                      hi############################################################################" + "'", str1, "                      hi############################################################################");
    }

    @Test
    public void test05171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05171");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("!IHHI!                         ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ihhi!                         ..." + "'", str1, "!ihhi!                         ...");
    }

    @Test
    public void test05172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05172");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "                                       ", (java.lang.CharSequence) " !ih                             !ih                             !ih                                IH                                ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test05173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05173");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "4444444444444444444444444444444444444444444444444444!iHHiHI!!iHHi", "HI");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH" + "'", str3, "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
    }

    @Test
    public void test05174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05174");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!", "   HI ");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "44444444444444444444444444444444", (java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!" + "'", str4, "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test05175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05175");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "...                                                      ;   ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05176");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("hI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", 19);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" + "'", str2, "hI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
    }

    @Test
    public void test05177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05177");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "                       HI  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test05178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05178");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("hi!!ihhi!!ihhi!!ihhi!!ihhi!!ih", "                             hi!                                                                    ", "                     4444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444" + "'", str3, "444444444444444444444444444444");
    }

    @Test
    public void test05179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05179");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05180");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "!iHHi!                                       !iHHi!       !iHHi!              !iHHi!       HHHHHHHHHHHHHHHHHHHHHHHHHHi!       !iH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05181");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                           aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "Hi!hi!hi!hi!hi!hi!hi!hi!hi!                                                                                     hiHI!HI!HI!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                           aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                           aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test05182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05182");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("           HI!", "  hi!!ihhi!!ihhi!!ihhi!!ihhi!!ih   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "           HI!" + "'", str2, "           HI!");
    }

    @Test
    public void test05183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05183");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("################################################################################################!!!!       HI!  ", "HI!HI!HI!HI                                HI                                HI!                             HI!                             HI!                                 HI                                HI!                             HI!                             HI!                                 HI                                HI!                             HI!                             HI!                                 HI                                HI!                             HI!                             HI!                                 HI                                HI!                             HI!                             HI! !HI!", 282);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "################################################################################################!!!!       HI!  " + "'", str3, "################################################################################################!!!!       HI!  ");
    }

    @Test
    public void test05184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05184");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("                         hi hi hi                              hi hi hi                              hi hi", "!!!!!!!!!hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!", "hI!hI!hI!hI!hI!hhI!hI!hI!hI!hI!h");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                         hi hi hi                              hi hi hi                              hi hi" + "'", str3, "                         hi hi hi                              hi hi hi                              hi hi");
    }

    @Test
    public void test05185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05185");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("                      hi############################################################################", "              hi!        ", "  hi!!ihhi!!ihhi!!ihhi!!ihhi!!ih   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                      hi############################################################################" + "'", str3, "                      hi############################################################################");
    }

    @Test
    public void test05186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05186");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("4HI4!!4IH4                                       4HI4!!4IH4       4HI4!!4IH4              4HI4!!4IH4       4!!!!!!!!!!!!!!!!!!!!!!!!!!4IH4       4HI4!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4HI4!!4IH4                                       4HI4!!4IH4       4HI4!!4IH4              4HI4!!4IH4       4!!!!!!!!!!!!!!!!!!!!!!!!!!4IH4       4HI4!" + "'", str1, "4HI4!!4IH4                                       4HI4!!4IH4       4HI4!!4IH4              4HI4!!4IH4       4!!!!!!!!!!!!!!!!!!!!!!!!!!4IH4       4HI4!");
    }

    @Test
    public void test05187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05187");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "ih                         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05188");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                         HI!IH ", "                         HI!hi!HI!                             HI!HI!HI!                             HI!HI", 6);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '4');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                         HI!IH " });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                         HI!IH " + "'", str5, "                         HI!IH ");
    }

    @Test
    public void test05189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05189");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "ih", (java.lang.CharSequence) "                                                     hhhhhhhhhhhhhhhhhhhhhhhh hI!hI!hI!hI!hI!hI!hI!hI!hI                                                      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05190");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "  !!          HI!    !!                                    !!                                    !!                                           !!  !hI!hI!hI!hIa###################################################################################################################################################################################################", (java.lang.CharSequence) "##########hi!HI!#################################################################################!!!!!####################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05191");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("#######hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih##############hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih#######hi!!ih##############hi!!ih#######!!!!!!!!!!!!!!!!!!!!!!!!!!ih#######hi!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05192");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                hi!!ih                                       hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!", "       HI!                                                                                          ", (int) (byte) 10);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                hi!!ih                                       hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!!ih                                       hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!" });
    }

    @Test
    public void test05193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05193");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "hi!ahi!ahi!ahi!a!!!!!!!!!!!!!!!!!!!!!!!!!ahi!", (java.lang.CharSequence) "!IH                                                                                     ", 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05194");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "                             HI!hhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhh", 12);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05195");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("####################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "####################################################" + "'", str1, "####################################################");
    }

    @Test
    public void test05196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05196");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "#########################################################################################...#########################################################################################...#########################################################################################...######################################################################################!ihhi!ihhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05197");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "HI!hi!                             hi!hi!hi!                             hi!hi!", (java.lang.CharSequence) "!ihhi!                         ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05198");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!H   hi!    HI!!IH       hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444hi!!IH       hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih4444444444444...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI", (java.lang.CharSequence) "HI!        ", 727);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05199");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "...                               ", (java.lang.CharSequence) "!ih       ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test05200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05200");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "...       hi!!ih       hi!!ih                                       hi!!ih                       ...", (java.lang.CharSequence) "44444444444444444444444444444444hi!44444444444444444444444444444hi!44444444444444444444444444444hi!4");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05201");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("                         hi HI", 87, 16);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test05202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05202");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("HI!!HI! HI!HI!HI!HI", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05203");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "... hi!!ih hi!!ih hi!!ih ...                                ... hi!!ih hi!!ih hi!!ih ...                         ... hi!!ih hi!!ih hi!!ih ...                         ... hi!!ih hi!!ih hi!!ih ...                         ... hi!!ih hi!!ih hi!!ih ...                                      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05204");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("...HI!!IHHI!!IHHI!!IH...", "hi! hhhhhhhhhh", "hi!ih       !ih       !ih       !ih       !ih       !ih       !ih                                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...HI!!IHHI!!IHHI!!IH..." + "'", str3, "...HI!!IHHI!!IHHI!!IH...");
    }

    @Test
    public void test05205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05205");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "   ih    ih           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test05206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05206");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05207");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                                                                                                 ", ".....................................................................................................................");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                 " + "'", str2, "                                                                                                 ");
    }

    @Test
    public void test05208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05208");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test05209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05209");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("   hi!HI!                             hi!                             hi!  HI!!ih                         HI!", 12, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   hi!HI!                             hi!                             hi!  HI!!ih                         HI!" + "'", str3, "   hi!HI!                             hi!                             hi!  HI!!ih                         HI!");
    }

    @Test
    public void test05210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05210");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa !IH                         hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "###########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!IHaaaaaaaaaaa!ihaaa#########", 65);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05211");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "HI!hi!                             hi!hi!hi!                             hi!hi!", (java.lang.CharSequence) "       #HI#!#                                                                                          ", (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05212");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) ".....................................................................................................................");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test05213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05213");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "    ...   444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05214");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("         ", "!ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
    }

    @Test
    public void test05215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05215");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) " HI!HI!HI!HI!HI!HI!HI!HI!HI                                                            ", (java.lang.CharSequence) "##");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05216");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                                                                                 hi!");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "HI!HI!HI!", (java.lang.CharSequence[]) strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "...                       hi!!ih                                       hi!!ih       hi!!ih       ...");
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", (java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test05217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05217");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("   hi!HI!                             hi!                             hi!  HI!", 36, "HI! hi! hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   hi!HI!                             hi!                             hi!  HI!" + "'", str3, "   hi!HI!                             hi!                             hi!  HI!");
    }

    @Test
    public void test05218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05218");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains(charSequence0, 146);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05219");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray5 = new char[] {};
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "!!!!!!!!!!!!!!!!!!!!!!!!!", charArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "", charArray5);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "", charArray5);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone(charSequence1, charArray5);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi       HI!!hi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test05220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05220");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "HI!        ", (java.lang.CharSequence) "!ihhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05221");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test05222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05222");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("A444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A444444444444444444444444444444444444444444444444444" + "'", str1, "A444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test05223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05223");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "HI!    ", "                         hi HI hi                              hi hi hi                              hi hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05224");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence) "                                hi        ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05225");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "                         hi!    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05226");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "!IH                         hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05227");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("HI!                             HI!                             HI! ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!                             HI!                             HI!" + "'", str1, "HI!                             HI!                             HI!");
    }

    @Test
    public void test05228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05228");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "       hi!a!!!!!!!!!!!!!!!!!!!!!!!!!a                                hi!a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence) "HI! HHHHHHHHHH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05229");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("                                HI", "                                                                                                                                                                 !ih                         HI!                                                                                            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                HI" + "'", str2, "                                HI");
    }

    @Test
    public void test05230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05230");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!" + "'", str1, "!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test05231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05231");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "           HI!", (java.lang.CharSequence) "  ;   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test05232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05232");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("   hi!HI!                             hi!                             hi!  HI!!ih                         HI!", 36, 46);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  hi!                             hi!  HI!!ih " + "'", str3, "  hi!                             hi!  HI!!ih ");
    }

    @Test
    public void test05233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05233");
        char[] charArray6 = new char[] {};
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "!!!!!!!!!!!!!!!!!!!!!!!!!", charArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", charArray6);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                HI!", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hi!HI!hi!hi!hi!hi!hi!hi!", charArray6);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                           ", charArray6);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "   hi!HI!                             hi!                             hi!  HI!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test05234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05234");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "                              HI  ", 90, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05235");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "hI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", (java.lang.CharSequence) "           IhHI!HI!HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05236");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                hi!!ih                                       hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!", '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                hi!!ih                                       hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!" });
    }

    @Test
    public void test05237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05237");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hi!ih!ih!ih!ih!ih!ih!ih", "                         hi HI");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!", "!", "!", "!", "!", "!", "!" });
    }

    @Test
    public void test05238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05238");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("hi!!ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih", "HI!       HI!       HI!       HI!       HI!       HI!       HI!IH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!!ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih" + "'", str2, "hi!!ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih");
    }

    @Test
    public void test05239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05239");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "#################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05240");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test05241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05241");
        java.lang.String[] strArray1 = null;
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                 hi!");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("...       hi!!ih       hi!!ih                                       hi!!ih                       ...", strArray1, strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "...       hi!!ih       hi!!ih                                       hi!!ih                       ..." + "'", str4, "...       hi!!ih       hi!!ih                                       hi!!ih                       ...");
    }

    @Test
    public void test05242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05242");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "                         hi HI hi                              hi hi hi                              hi hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05243");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("!ih hhhhhhhhhh");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                          !!!!!!!!!!!!!!!!!!!!!!!", (java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!ih", "hhhhhhhhhh" });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05244");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("...4444444444444444444444...44444444444444444444444444444444...4444444444444444444444...4444444444444444444444444...4444444444444444444444...4444444444444444444444444...4444444444444444444444...4444444444444444444444444...4444444444444444444444..", 123, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...4444444444444444444444...44444444444444444444444444444444...4444444444444444444444...4444444444444444444444444...4444444444444444444444...4444444444444444444444444...4444444444444444444444...4444444444444444444444444...4444444444444444444444.." + "'", str3, "...4444444444444444444444...44444444444444444444444444444444...4444444444444444444444...4444444444444444444444444...4444444444444444444444...4444444444444444444444444...4444444444444444444444...4444444444444444444444444...4444444444444444444444..");
    }

    @Test
    public void test05245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05245");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "hi!    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test05246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05246");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "                         hi!", "                         hi!", "                         hi!", "                                hi!", "" };
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray7, "");
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray9, "hi!");
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray11, '#', (int) (byte) 0, (int) (byte) 1);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray11, "... hi!!ih hi!!ih hi!!ih ...");
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                          !!!!!!!!!!!!!!!!!!!!!!!", (java.lang.CharSequence[]) strArray11);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!", "                         hi!", "                         hi!", "                         hi!", "                                hi!", "" });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!", "                         hi!", "                         hi!", "                         hi!", "                                hi!", "" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "", "                         ", "                         ", "                         ", "                                ", "" });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "... hi!!ih hi!!ih hi!!ih ...                         ... hi!!ih hi!!ih hi!!ih ...                         ... hi!!ih hi!!ih hi!!ih ...                         ... hi!!ih hi!!ih hi!!ih ...                                ... hi!!ih hi!!ih hi!!ih ..." + "'", str17, "... hi!!ih hi!!ih hi!!ih ...                         ... hi!!ih hi!!ih hi!!ih ...                         ... hi!!ih hi!!ih hi!!ih ...                         ... hi!!ih hi!!ih hi!!ih ...                                ... hi!!ih hi!!ih hi!!ih ...");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test05247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05247");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("       HI!  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!" + "'", str1, "HI!");
    }

    @Test
    public void test05248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05248");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa !IH                         hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05249");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("... hi!!ih hi!!ih hi!!ih ...                         ... hi!!ih hi!!ih hi!!ih ...                         ... hi!!ih hi!!ih hi!!ih ...                         ... hi!!ih hi!!ih hi!!ih ...                                ... hi!!ih hi!!ih hi!!ih ...", 7);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih ..." + "'", str2, "!ih ...");
    }

    @Test
    public void test05250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05250");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaaaaaaaaaaaa!ih       ", "... hi!!ih hi!!ih hi!!ih ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 17 + "'", int2 == 17);
    }

    @Test
    public void test05251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05251");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("4444 hI!hI!hI!hI!hI!hI!hI!hI!hI", "#########################################################################################...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444 hI!hI!hI!hI!hI!hI!hI!hI!hI" + "'", str2, "4444 hI!hI!hI!hI!hI!hI!hI!hI!hI");
    }

    @Test
    public void test05252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05252");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "HI!hi!hi!hi!hi!hi!hi!", 22, 61);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaHI!hi!hi!hi!hi!hi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str4, "aaaaaaaaaaaaaaaaaaaaaaHI!hi!hi!hi!hi!hi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test05253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05253");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "       ", (java.lang.CharSequence) "hhhhhhhhhh                      hi!", 36);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05254");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("       #hi#!#hi#!#hi#!#hi#!!!!!!!!!!!!!!!!!!!!!!!!!!#hi#!!#ih# HI  #hi#!!#ih#       #!!!!!!!!!!!!!!!!!!!!!!!!!!#ih#       #hi#!", "!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       #hi#!#hi#!#hi#!#hi#!!!!!!!!!!!!!!!!!!!!!!!!!!#hi#!!#ih# HI  #hi#!!#ih#       #!!!!!!!!!!!!!!!!!!!!!!!!!!#ih#       #hi#!" + "'", str2, "       #hi#!#hi#!#hi#!#hi#!!!!!!!!!!!!!!!!!!!!!!!!!!#hi#!!#ih# HI  #hi#!!#ih#       #!!!!!!!!!!!!!!!!!!!!!!!!!!#ih#       #hi#!");
    }

    @Test
    public void test05255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05255");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("   hi!    HI!!IH       hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444hi!!IH       hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih4444444444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "   hi!    HI!!IH       hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444hi!!IH       hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih4444444444444..." + "'", str1, "   hi!    HI!!IH       hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444hi!!IH       hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih4444444444444...");
    }

    @Test
    public void test05256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05256");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!!ih                                       hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!######################################################################################################################################################################", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test05257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05257");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("hi!ihhi!ihhi!!!ihhi!ihhi!HI!ihhi!ihhi!!", "   !    !    !  ", "#");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!ihhi!ihhi!!!ihhi!ihhi!HI!ihhi!ihhi!!" + "'", str3, "hi!ihhi!ihhi!!!ihhi!ihhi!HI!ihhi!ihhi!!");
    }

    @Test
    public void test05258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05258");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "                                                    ", (java.lang.CharSequence) "################################################################################################!!!!       HI!  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05259");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                     hi!", "                                                                                                 hi!!ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test05260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05260");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "                         HI!IH       !IH       !IH       !IH       !IH       !I", 696);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
    }

    @Test
    public void test05261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05261");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("         ...", "       HI!       HI!       HI!       HI!       HI!       HI!       HI!IH");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "                          !!                                           !!  ", (java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "         ..." });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test05262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05262");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("hI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", 34, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test05263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05263");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("                         hi!HI!hi!                             hi!hi!hi!                             hi!hi", "...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...                         hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!hi!                             hi!hi!hi!                             hi!hi" + "'", str2, "HI!hi!                             hi!hi!hi!                             hi!hi");
    }

    @Test
    public void test05264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05264");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                hi!                             hi!                             hi", (int) '4', "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                hi!                             hi!                             hi" + "'", str3, "                                hi!                             hi!                             hi");
    }

    @Test
    public void test05265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05265");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "I!hI!hI!hI!hI!hI!hI!hI!hI", (java.lang.CharSequence) "    HI!  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05266");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("hi!HI!                             hi!                             hi!  HI!", "                         HI!IH       !IH       !IH       !IH       !IH       !I");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05267");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("!IH  !                             !                             !IH!", 22);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!IH  !             ..." + "'", str2, "!IH  !             ...");
    }

    @Test
    public void test05268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05268");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("   hi!HI!                             hi!                             hi!  HI!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test05269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05269");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                4HI4!!4IH4       4HI4!!4IH4              4HI4!!4IH4       4!!!!!!!!!!!!!!!!!!!!!!!!!!4IH4       4HI4!", "!!!!!!!!!!!!!!!!!!!!!!!!", "iH                                                 ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                4HI4ii4IH4       4HI4ii4IH4              4HI4ii4IH4       4iiiiiiiiiiiiiiiiiiiiiiiiii4IH4       4HI4i" + "'", str3, "                4HI4ii4IH4       4HI4ii4IH4              4HI4ii4IH4       4iiiiiiiiiiiiiiiiiiiiiiiiii4IH4       4HI4i");
    }

    @Test
    public void test05270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05270");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "                         HI!IH ", (java.lang.CharSequence) ". hi!..", 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05271");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "!ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       ", (java.lang.CharSequence) "HI!hi!                             hi!hi!hi!                             hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05272");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                         hi!HI!hi!                             hi!hi!hi!                             hi!hi!44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 42);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                         hi!HI!hi!                             hi!hi!hi!                             hi!hi!44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                         hi!HI!hi!                             hi!hi!hi!                             hi!hi!44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test05273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05273");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                         hi hi hi                              hi hi hi                              hi hi", "ang.String;class [Ljava.lang.String;", "hi! hhhhhhhhhh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                         hi hi hi                              hi hi hi                              hi hi" + "'", str3, "                         hi hi hi                              hi hi hi                              hi hi");
    }

    @Test
    public void test05274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05274");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("#############", "hi!                             hi!", 145);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "                      hi############################################################################", (java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "#############" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test05275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05275");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("################", 6, "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH...H!IH!IH!IH!IH!IH!IH!IH!IH  hi!           HI!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "################" + "'", str3, "################");
    }

    @Test
    public void test05276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05276");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "                                HI", (java.lang.CharSequence) "Hi!hi!hi!hi!   hi!    hi!hi!hi!hi!!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05277");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "aaaaaaaaaaaaaaaa", (java.lang.CharSequence) "                                    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05278");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("", "                         #################################################################", "hI!hI!hI!hI!hI!hhI!hI!hI!hI!hI!h");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test05279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05279");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("#################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################ih############", 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "#################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################ih############" });
    }

    @Test
    public void test05280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05280");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                                                                                                                                                                                                                                                                        ", ' ', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                        " + "'", str3, "                                                                                                                                                                                                                                                                                                        ");
    }

    @Test
    public void test05281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05281");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", 24);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" + "'", str2, "!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
    }

    @Test
    public void test05282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05282");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("444444444444444444444444444444", 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "444444444444444444444444444444" });
    }

    @Test
    public void test05283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05283");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("I!hI!hI!hI!hI!hI!hI!hI!hI", 700);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05284");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("######ih                         HI!##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05285");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "...hi!!ih...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05286");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                hi!!ih                                       hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) " hi! hi!", (java.lang.CharSequence[]) strArray2);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "...                       hi!!ih                                       hi!!ih       hi!!ih       ...");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!!ih", "hi!!ih", "hi!!ih", "hi!!ih", "!!!!!!!!!!!!!!!!!!!!!!!!!!ih", "hi!" });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "", "", "", "" });
    }

    @Test
    public void test05287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05287");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("                            hi! ", "   HI                                                                                                                                                                                                         ", (int) 'a', 282);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                            hi!    HI                                                                                                                                                                                                         " + "'", str4, "                            hi!    HI                                                                                                                                                                                                         ");
    }

    @Test
    public void test05288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05288");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", "... HI!!IH HI!!IH HI!!IH ...       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str2, "############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test05289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05289");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "hhhhhhhhhh                      hi!!IHHI!                                       !IHHI!       !IHHI!              !IHHI!       HHHHHHHHHHHHHHHHHHHHHHHHHHI!       !IH", (java.lang.CharSequence) "                                hi!                             hi!                             hi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05290");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("HI! HI! ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI! HI! ..." + "'", str1, "HI! HI! ...");
    }

    @Test
    public void test05291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05291");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                         hi!HI!hi!                             hi!hi!hi!                             hi!hi", "!                             hi!                             hi!");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        java.lang.Class<?> wildcardClass5 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test05292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05292");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!IH           !ih   ##########       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05293");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 19);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444" + "'", str2, "4444444444444444444");
    }

    @Test
    public void test05294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05294");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "...HI!!IHHI!!IHHI!!IH...", 127);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05295");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "...       hi!!ih       hi!!ih                                       hi!!ih                       ......       hi!!ih       hi!!ih                                       hi!!ih                       ...", (java.lang.CharSequence) "!IH !IH !IH !IH !IH !IH HI!IH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05296");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "... hi!!ih hi!!ih hi!!ih ...                                ... hi!!ih hi!!ih hi!!ih ...                         ... hi!!ih hi!!ih hi!!ih ...                         ... hi!!ih hi!!ih hi!!ih ...                         ... hi!!ih hi!!ih hi!!ih ...                                      ", (java.lang.CharSequence) "...!!!!!!!!!!!!!!!!!!!!!!!!!ahi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05297");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "                              HI  ", 291);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05298");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "  ", 284, 61);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05299");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!" + "'", str1, "hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!");
    }

    @Test
    public void test05300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05300");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "##########hi!HI!####################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test05301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05301");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("!ihhi!", "aaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaa");
    }

    @Test
    public void test05302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05302");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "444444444444444444444444444444", (java.lang.CharSequence) "...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test05303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05303");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                             hi!", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                             hi!" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                             hi!" + "'", str3, "                             hi!");
    }

    @Test
    public void test05304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05304");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("hi!", "                         hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test05305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05305");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("hI! hi! hi!", "############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hI! hi! hi!" + "'", str2, "hI! hi! hi!");
    }

    @Test
    public void test05306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05306");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05307");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "    ...   444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test05308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05308");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "HIhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05309");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("          ", 2, 18);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "        " + "'", str3, "        ");
    }

    @Test
    public void test05310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05310");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!IH                         hi######", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!IH                         hi######" + "'", str2, "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!IH                         hi######");
    }

    @Test
    public void test05311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05311");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                                hi                                HI!                             HI!                             HI!", (java.lang.CharSequence) "       hi!                                                                                          ", 123);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test05312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05312");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", "hi!hi!hi!hi       HI!!hi!");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str4, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test05313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05313");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("####################################################", "  !!          HI!    !!                                    !!                                    !!                                           !!  !hI!hI!hI!hIa###################################################################################################################################################################################################");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test05314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05314");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("                         HI!hi!HI!                             HI!HI!HI!                             HI!HI", "                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05315");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "4444444444444444444444444444444444444444!    44444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05316");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test05317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05317");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("... hi!!ih hi!!ih hi!!ih ... ... hi!!ih hi!!ih hi!!ih ... ... hi!!ih hi!!ih hi!!ih ... ... hi!!ih hi!!ih hi!!ih ... ... hi!!ih hi!!ih hi!!ih ...");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test05318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05318");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("HI                                HI!                             HI!                             HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI                                HI!                             HI!                             HI!" + "'", str1, "HI                                HI!                             HI!                             HI!");
    }

    @Test
    public void test05319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05319");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("hi!!ih                                hi!!ih                                hi!!ih                                hi!!ih                                       hi!!ih       ", 373, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!!ih                                hi!!ih                                hi!!ih                                hi!!ih                                       hi!!ih       #########################################################################################################################################################################################################" + "'", str3, "hi!!ih                                hi!!ih                                hi!!ih                                hi!!ih                                       hi!!ih       #########################################################################################################################################################################################################");
    }

    @Test
    public void test05320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05320");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "    HI", (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05321");
        java.lang.CharSequence charSequence1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "hhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhh", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05322");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "hi                                HI!                             HI!                             HI!", (java.lang.CharSequence) "  HI!           hi!", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05323");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH...H!IH!IH!IH!IH!IH!IH!IH!IH  hi!           HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05324");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("!                             hi!                             hi!", "...hi!!ih...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!                             hi!                             hi!" + "'", str2, "!                             hi!                             hi!");
    }

    @Test
    public void test05325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05325");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!", "hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!" + "'", str2, "hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!");
    }

    @Test
    public void test05326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05326");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric(charSequence0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05327");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "                                                                                                 HI!", (java.lang.CharSequence) "hI!hI!hI!hI!hI!hI!hI!hI!h");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05328");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "         .#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05329");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "4444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test05330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05330");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Hi!hi!hi!hi!hi!hi!hi!hi!hi!!", ' ');
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                         ci HI ci                              ci ci ci                              ci ci");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                                                                     hiHI!HI!HI!", strArray3, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 91");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "Hi!hi!hi!hi!hi!hi!hi!hi!hi!!" });
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test05331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05331");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "                         #################################################################", (java.lang.CharSequence) "HI!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05332");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("                           hi      #                           hi      #                           hi      #                           hi      #                           hi      #                           hi      #                           hi      #                           hi      #                           hi      #                           hi      #                           hi      #                           hi      #                           hi      #                           hi      #                           hi      #                           hi", "                             !iHHi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                           hi      #                           hi      #                           hi      #                           hi      #                           hi      #                           hi      #                           hi      #                           hi      #                           hi      #                           hi      #                           hi      #                           hi      #                           hi      #                           hi      #                           hi      #                           hi" + "'", str2, "                           hi      #                           hi      #                           hi      #                           hi      #                           hi      #                           hi      #                           hi      #                           hi      #                           hi      #                           hi      #                           hi      #                           hi      #                           hi      #                           hi      #                           hi      #                           hi");
    }

    @Test
    public void test05333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05333");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("                                hi                                hi!                             hi!                             hi!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                hi                                hi!                             hi!                             hi!" + "'", str2, "                                hi                                hi!                             hi!                             hi!");
    }

    @Test
    public void test05334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05334");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("!!          HI!    !!                                    !!                                    !!                                           !!", "4hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!          HI!    !!                                    !!                                    !!                                           !!" + "'", str2, "!!          HI!    !!                                    !!                                    !!                                           !!");
    }

    @Test
    public void test05335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05335");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("HI                                HI!                             HI!                             HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HIHI!HI!HI!" + "'", str1, "HIHI!HI!HI!");
    }

    @Test
    public void test05336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05336");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "################################################################################################!!!!!!!!!hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!################################################################################################", 1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
    }

    @Test
    public void test05337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05337");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("hi!##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "hi", "!##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" });
    }

    @Test
    public void test05338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05338");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("HI! HI! HI! ", "HI!HI!HI!HI       HI!!HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI! HI! HI! " + "'", str2, "HI! HI! HI! ");
    }

    @Test
    public void test05339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05339");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "44444444444444444444444                                                                                                 hi4");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test05340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05340");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("HI!hiHI", "                                                                                                  HI!       !IHHHHHHHHHHHHHHHHHHHHHHHHHH       !IHHI!              !IHHI!       !IHHI!                                                                                                       ", "hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444hi44" + "'", str3, "444hi44");
    }

    @Test
    public void test05341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05341");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("HI!HI!hiHI!HI!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!hiHI!HI!HI!" + "'", str1, "HI!HI!hiHI!HI!HI!");
    }

    @Test
    public void test05342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05342");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("...hi!!ihhi!!ihhi!!ih......hi!!ihhi!!ihhi!!ih......hi!!ihhi!!ihhi!!ih......hi!!ihhi!!ihhi!!ih......hi!!ihhi!!ihhi!!ih...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...HI!!IHHI!!IHHI!!IH......HI!!IHHI!!IHHI!!IH......HI!!IHHI!!IHHI!!IH......HI!!IHHI!!IHHI!!IH......HI!!IHHI!!IHHI!!IH..." + "'", str1, "...HI!!IHHI!!IHHI!!IH......HI!!IHHI!!IHHI!!IH......HI!!IHHI!!IHHI!!IH......HI!!IHHI!!IHHI!!IH......HI!!IHHI!!IHHI!!IH...");
    }

    @Test
    public void test05343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05343");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("                           hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ih                           " + "'", str1, "ih                           ");
    }

    @Test
    public void test05344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05344");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "       hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih              hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05345");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("HI! HHHHHHHHHH", "...                             ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05346");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "HI!IH       !IH       !IH       !IH       !IH       !IH       !IH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05347");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!h" + "'", str1, "hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!h");
    }

    @Test
    public void test05348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05348");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("", "I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!H   hi!    HI!!IH       hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444hi!!IH       hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih4444444444444...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05349");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "... hi!!ih hi!!ih hi!!ih ...                                ... hi!!ih hi!!ih hi!!ih ...                         ... hi!!ih hi!!ih hi!!ih ...                         ... hi!!ih hi!!ih hi!!ih ...                         ... hi!!ih hi!!ih hi!!ih ...", " !IH                         hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test05350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05350");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!", "!!!!!!!!!!!!!!!!!!!!!!!!!");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "       HI!");
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!!ihhi!!ihhi!!ihhi!!ih!!!!!!!!!!!!!!!!!!!!!!!!!!ihhi!", (java.lang.CharSequence[]) strArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!hi!hi!hi", "!hi!" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!hi!hi!hi       HI!!hi!" + "'", str5, "hi!hi!hi!hi       HI!!hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test05351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05351");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("44444444444", "a");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444" + "'", str2, "44444444444");
    }

    @Test
    public void test05352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05352");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("                                 ci HI ci                              ci ci ci                              ci ci         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ci HI ci                              ci ci ci                              ci ci" + "'", str1, "ci HI ci                              ci ci ci                              ci ci");
    }

    @Test
    public void test05353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05353");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("", "hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05354");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) " !ih                             !ih                             !ih                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05355");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("I!hI!hI!hI!hI!hI!hI!hI!hI", "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", "I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test05356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05356");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("                                                                     !IH                         hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                     !IH                         hi!" + "'", str1, "                                                                     !IH                         hi!");
    }

    @Test
    public void test05357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05357");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("                                                                                                 hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                 hi!" + "'", str1, "                                                                                                 hi!");
    }

    @Test
    public void test05358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05358");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "hi                                hi!                             hi!                             hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05359");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!IHaaaaaaaaaaa!ihaaa#########", (java.lang.CharSequence) "hi!HI!                             hi!                             hi!  HI!", 134);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05360");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("#########################################################################################################################################################################################################################################################################################################                         HI hi HI                              HI HI HI                              HI HI#########################################################################################################################################################################################################################################################################################################", 296);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#########################################################################################################################################################################################################################################################################################################                         HI hi HI                              HI HI HI                              HI HI#########################################################################################################################################################################################################################################################################################################" + "'", str2, "#########################################################################################################################################################################################################################################################################################################                         HI hi HI                              HI HI HI                              HI HI#########################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test05361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05361");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("                     ... hi!!ih hi!!ih hi!!ih ...            ", "Aaaaaaaaaaaaaaaa     ", "HI HI! HI! HI!", 687);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                     ... hi!!ih hi!!ih hi!!ih ...            " + "'", str4, "                     ... hi!!ih hi!!ih hi!!ih ...            ");
    }

    @Test
    public void test05362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05362");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence) "  HI!!IHHI!!IHHI!!IHHI!!IHHI!!IH   ", 579);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05363");
        java.lang.CharSequence charSequence8 = null;
        char[] charArray12 = new char[] {};
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "!!!!!!!!!!!!!!!!!!!!!!!!!", charArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                hi!", charArray12);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "       hi!", charArray12);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence8, charArray12);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                hi!!ih                                       hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!", charArray12);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "                      hi!", charArray12);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "##########hi!HI!###################################################################################", charArray12);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                   ", charArray12);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "... HI!!IH HI!!IH HI!!IH ...       ", charArray12);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "...4444444444444", charArray12);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) " ...                       hi!!ih                                       hi!!ih       hi!!ih       ...", charArray12);
        int int24 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test05364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05364");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                               ...", "hi!ih       !ih       !ih    ...");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                               ..." });
    }

    @Test
    public void test05365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05365");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("  ", 285, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test05366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05366");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("!ih                         HI!", "                4HI4!!4IH4       4HI4!!4IH4              4HI4!!4IH4       4!!!!!!!!!!!!!!!!!!!!!!!!!!4IH4       4HI4!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05367");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "                                                                     !IH                         hi!", 98, 24);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05368");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) ".                             hi!..                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ", "hI!hI!hI!hI!hI!hI!hI!hI!hIa###################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05369");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterType("          hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih ");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "hi                                hi!                             hi!                             hi!", (java.lang.CharSequence[]) strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "##########hi!HI!##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", (java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "          ", "hi", "!!", "ih", "       ", "!!!!!!!!!!!!!!!!!!!!!!!!!!", "ih", " " });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test05370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05370");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("hI!hi!##############################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!hi!##############################################################################################" + "'", str1, "HI!hi!##############################################################################################");
    }

    @Test
    public void test05371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05371");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!H...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", (java.lang.CharSequence) "HI!HI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 272 + "'", int2 == 272);
    }

    @Test
    public void test05372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05372");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("!IHHI!                                       !IHHI!       !IHHI!              !IHHI!       HHHHHHHHHHHHHHHHHHHHHHHHHHI!       !IH", "I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", "                                                                                                  HI !");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                 " + "'", str3, "                                                                                                                                 ");
    }

    @Test
    public void test05373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05373");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test05374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05374");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("444", '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "444" });
    }

    @Test
    public void test05375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05375");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("Aaaaaaaaaaaaaaaa", "                                HI!                             hi!                             hi!                                 HI!                             hi!                             hi!                                 HI!                             hi!                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Aaaaaaaaaaaaaaaa" + "'", str2, "Aaaaaaaaaaaaaaaa");
    }

    @Test
    public void test05376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05376");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "HI!HI!HI!HI       HI!!HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05377");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!                  ", 'a', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!                  " + "'", str3, "!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!                  ");
    }

    @Test
    public void test05378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05378");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                         hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi" + "'", str1, "hi");
    }

    @Test
    public void test05379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05379");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("                                hi!", 705, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width with offset is 7");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05380");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("                     ... hi!!ih hi!!ih hi!!ih ...            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                     ... hi!!ih hi!!ih hi!!ih ...            " + "'", str1, "                     ... hi!!ih hi!!ih hi!!ih ...            ");
    }

    @Test
    public void test05381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05381");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("!ih                                                                                     ", "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih                                                                                     " + "'", str2, "!ih                                                                                     ");
    }

    @Test
    public void test05382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05382");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("hi!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!Hi!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!Hi!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!Hi!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!Hi!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str2, "hi!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!Hi!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!Hi!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test05383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05383");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "                         hi!", "                         hi!", "                         hi!", "                                hi!", "" };
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray7, "");
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray9, "hi!");
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray11, '#', (int) (byte) 0, (int) (byte) 1);
        int int16 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "       hi!a!!!!!!!!!!!!!!!!!!!!!!!!!a                                hi!a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence[]) strArray11);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!", "                         hi!", "                         hi!", "                         hi!", "                                hi!", "" });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!", "                         hi!", "                         hi!", "                         hi!", "                                hi!", "" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "", "                         ", "                         ", "                         ", "                                ", "" });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 173 + "'", int16 == 173);
    }

    @Test
    public void test05384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05384");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "                                HI!                             hi!                             hi!                                 HI!                             hi!                             hi!                                 HI!                             hi!                             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05385");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                             HI!HHHI!!IHHI!!IHHI!!IHHI!!IHHI!!IHHHH");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "HI!HHHI!!IHHI!!IHHI!!IHHI!!IHHI!!IHHHH" });
    }

    @Test
    public void test05386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05386");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "!ih       ", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaih            hi!HI!hi!                             hi!hi!hi!                             hi!hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05387");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("hhhhhhhhhh                      hi!!IHHI!                                       !IHHI!       !IHHI!              !IHHI!       HHHHHHHHHHHHHHHHHHHHHHHHHHI!       !IH", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05388");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("   hi!HI!                             hi!                             hi!  HI!", "!hi!hi!444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   hi!HI!                             hi!                             hi!  HI!" + "'", str2, "   hi!HI!                             hi!                             hi!  HI!");
    }

    @Test
    public void test05389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05389");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "!IHHI!                                       !IHHI!       !IHHI!              !IHHI!       HHHHHHHHHHHHHHHHHHHHHHHHHHI!       !IH", "!hi!hi!!hi!!hi!!ih              hi!h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05390");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "HI!!IH       hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444hi!!IH       hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih4444444444444...", (java.lang.CharSequence) "HI!hi!                             hi!hi!hi!                             hi!hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05391");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) " !ih                             !ih                             !ih                                IH                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05392");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "hI!hI!hI!hI!hI!hI!hI!hI!hIa###################################################################################################################################################################################################", (java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                      hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test05393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05393");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!IHaaaaaaaaaaa!ihaaa#########");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05394");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi", (java.lang.CharSequence) "#################################################################################################### #################################################################################################### #################################################################################################### HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05395");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", "                         HI                                HI!                             HI!                             HI!                               ", 285);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" });
    }

    @Test
    public void test05396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05396");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("hhhhhhhhhh hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhhhhhhh hi!" + "'", str1, "hhhhhhhhhh hi!");
    }

    @Test
    public void test05397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05397");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("                                HI!                   HI!hhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhh                     hi!                             ", "!                             hi!                             hi!!                             hi!                             hi!!                             hi!                             hi!!                             hi!                             hi!!                             hi!                             hi!!                             hi!                             hi!!                             hi!                             hi!!                             hi!                             hi!!                             hi!                             hi!!                             hi!                             hi!", "hi!ih       !ih       !ih       !ih       !ih       !ih       !ih                                ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test05398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05398");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "HI!HI!HI!hi", (java.lang.CharSequence) "                        IH    IH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test05399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05399");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("!IH                             !IH                             !IH                                IH                             hi!!ih                                       hi!!ih                                hi!!ih                                hi!!ih                                hi!!ih", ";", "aaaaaaaaaa!iHHiHI!!iHHiaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!IH                             !IH                             !IH                                IH                             hi!!ih                                       hi!!ih                                hi!!ih                                hi!!ih                                hi!!ih" + "'", str3, "!IH                             !IH                             !IH                                IH                             hi!!ih                                       hi!!ih                                hi!!ih                                hi!!ih                                hi!!ih");
    }

    @Test
    public void test05400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05400");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("HI!                             hi!                             hi!", "       ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!                             hi!                             hi!" + "'", str2, "HI!                             hi!                             hi!");
    }

    @Test
    public void test05401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05401");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("   hi!           H");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "   ", "hi", "!", "           ", "H" });
    }

    @Test
    public void test05402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05402");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "Hhhhhhhhhhhhhhhhhhhhhhhhh hI!hI!hI!hI!hI!hI!hI!hI!hI", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test05403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05403");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("HI!!IH       hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444hi!!IH       hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih4444444444444...", "hI!", "hi!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!Hi!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!Hi!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 34);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HI!!IH       hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444hi!!IH       hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih4444444444444..." + "'", str4, "HI!!IH       hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444hi!!IH       hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih4444444444444...");
    }

    @Test
    public void test05404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05404");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("                                hi!!ih                                       hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05405");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("hhhhhhh#hi#h#hi#h#hi#h#hi#hhhhhhhhhhhhhhhhhhhhhhhhhh#hi#hh#ih#hi!hh#hi#hh#ih#hhhhhhh#hhhhhhhhhhhhhhhhhhhhhhhhhh#ih#hhhhhhh#hi#h", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhhhh#hi#h#hi#h#hi#h#hi#hhhhhhhhhhhhhhhhhhhhhhhhhh#hi#hh#ih#hi!hh#hi#hh#ih#hhhhhhh#hhhhhhhhhhhhhhhhhhhhhhhhhh#ih#hhhhhhh#hi#h" + "'", str2, "hhhhhhh#hi#h#hi#h#hi#h#hi#hhhhhhhhhhhhhhhhhhhhhhhhhh#hi#hh#ih#hi!hh#hi#hh#ih#hhhhhhh#hhhhhhhhhhhhhhhhhhhhhhhhhh#ih#hhhhhhh#hi#h");
    }

    @Test
    public void test05406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05406");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "   hi!    HI!!IH       hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444hi!!IH       hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih4444444444444...", "HI!HI!HI!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test05407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05407");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "HI!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!H   hi!    HI!!IH       hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444hi!!IH       hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih4444444444444...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05408");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("", 2);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05409");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("Aaaaaaaaaaaaaaaa", "HI!HI!hiHI!HI!HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Aaaaaaaaaaaaaaaa" + "'", str2, "Aaaaaaaaaaaaaaaa");
    }

    @Test
    public void test05410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05410");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", 283);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" + "'", str2, "...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
    }

    @Test
    public void test05411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05411");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05412");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("!IH       ", 157, 727);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test05413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05413");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "... hi##ih hi##ih hi##ih ...                         ... hi##ih hi##ih hi##ih ...                         ... hi##ih hi##ih hi##ih ...                         ... hi##ih hi##ih hi##ih ...                                ... hi##ih hi##ih hi##ih ...", (java.lang.CharSequence) "                                hi                                hi!                             hi!                             hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05414");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH...H!IH!IH!IH!IH!IH!IH!IH!IH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test05415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05415");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("                                                                                                       !IHHI!       !IHHI!              !IHHI!       HHHHHHHHHHHHHHHHHHHHHHHHHHI!       !IH                                                                                                  ", "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH...H!IH!IH!IH!IH!IH!IH!IH!IH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH...H!IH!IH!IH!IH!IH!IH!IH!IH" + "'", str2, "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH...H!IH!IH!IH!IH!IH!IH!IH!IH");
    }

    @Test
    public void test05416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05416");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim(" hi! hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi! hi!" + "'", str1, "hi! hi!");
    }

    @Test
    public void test05417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05417");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("  HI!           hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "  HI!           HI!" + "'", str1, "  HI!           HI!");
    }

    @Test
    public void test05418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05418");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", "!    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !" + "'", str2, "!    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !");
    }

    @Test
    public void test05419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05419");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!ih" + "'", str1, "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!ih");
    }

    @Test
    public void test05420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05420");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("hi!                             HI!                             HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!                             hi!                             hi!" + "'", str1, "HI!                             hi!                             hi!");
    }

    @Test
    public void test05421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05421");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "                                                                                                  HI!       !IHHHHHHHHHHHHHHHHHHHHHHHHHH       !IHHI!              !IHHI!       !IHHI!                                                                                                       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05422");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", (java.lang.CharSequence) "##########   hi!           HI!##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", 116);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05423");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "                         hi HI hi                              hi hi hi                              hi hi", (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05424");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("####################################################################################################", "!IH       ", 0);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "IH", (java.lang.CharSequence[]) strArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, "hi!                             hi!");
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray6);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray6);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "####################################################################################################" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "####################################################################################################" + "'", str5, "####################################################################################################");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "####################################################################################################" });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "####################################################################################################" + "'", str9, "####################################################################################################");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "####################################################################################################" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "####################################################################################################" });
    }

    @Test
    public void test05425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05425");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("                            hi!hi!hi!                             hi!hi", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05426");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("!ih       HI!                                       ", "Hi!hi!hi!hi!   hi!    hi!hi!hi!hi!!", 100);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray6, "hi!");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray6);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray6);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray10, '#');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("...                             ...", strArray4, strArray10);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "!ih       HI!                                       " });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "...                             ..." + "'", str13, "...                             ...");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "!ih       HI!                                       " + "'", str15, "!ih       HI!                                       ");
    }

    @Test
    public void test05427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05427");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "!    ", 87);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05428");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat('#', 75);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###########################################################################" + "'", str2, "###########################################################################");
    }

    @Test
    public void test05429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05429");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("...          ", "HI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!", "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test05430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05430");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                hi!  hi!           HI!                                hi!  hi!           HI!hi!  hi!           HI!       hi!  hi!           HI!!!!!!!!!!!!!!!!!!!!!!!!!!  hi!           HI!hi!", "...!!!!!!!!!!!!!!!!!!!!!!!!!ahi");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                ", "  ", "           HI", "                                ", "  ", "           HI", "  ", "           HI", "       ", "  ", "           HI", "  ", "           HI" });
    }

    @Test
    public void test05431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05431");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", "hi!!ih                                       hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test05432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05432");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "!ihHI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05433");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence) "                         #################################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05434");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.hi!                             hi!class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.S", (java.lang.CharSequence) "!ih       HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05435");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "   hi!HI!                             hi!                             hi!  HI!", 126);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05436");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) " HI!HI!HI!HI!HI!HI!HI!HI!HI                                                            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05437");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "... HI!!IH HI!!IH HI!!IH ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05438");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("...!!!!!!!!!!!!!!!!!!!!!hi!!ih  ...", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05439");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip(" ...                       hi!!ih                                       hi!!ih       hi!!ih       ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...                       hi!!ih                                       hi!!ih       hi!!ih       ..." + "'", str1, "...                       hi!!ih                                       hi!!ih       hi!!ih       ...");
    }

    @Test
    public void test05440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05440");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("hi!HI!                             hi!                             hi!  HI!                hi!HI!hi!                             hi!hi!hi!                             hi!hi!", "                                                !IH                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!HI!                             hi!                             hi!  HI!                hi!HI!hi!                             hi!hi!hi!                             hi!hi!" + "'", str2, "hi!HI!                             hi!                             hi!  HI!                hi!HI!hi!                             hi!hi!hi!                             hi!hi!");
    }

    @Test
    public void test05441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05441");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("       #hi#!#hi#!#hi#!#hi#!!!!!!!!!!!!!!!!!!!!!!!!!!#hi#!!#ih#              #hi#!#hi#!#hi#!#hi#!!!!!!!!!!!!!!!!!!!!!!!!!!#hi#!!#ih#       #hi#!!#ih#              #hi#!!#ih#       #!!!!!!!!!!!!!!!!!!!!!!!!!!#ih#       #hi#!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "       #hi#!#hi#!#hi#!#hi#!!!!!!!!!!!!!!!!!!!!!!!!!!#hi#!!#ih#              #hi#!#hi#!#hi#!#hi#!!!!!!!!!!!!!!!!!!!!!!!!!!#hi#!!#ih#       #hi#!!#ih#              #hi#!!#ih#       #!!!!!!!!!!!!!!!!!!!!!!!!!!#ih#       #hi#!" + "'", str1, "       #hi#!#hi#!#hi#!#hi#!!!!!!!!!!!!!!!!!!!!!!!!!!#hi#!!#ih#              #hi#!#hi#!#hi#!#hi#!!!!!!!!!!!!!!!!!!!!!!!!!!#hi#!!#ih#       #hi#!!#ih#              #hi#!!#ih#       #!!!!!!!!!!!!!!!!!!!!!!!!!!#ih#       #hi#!");
    }

    @Test
    public void test05442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05442");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("####################################################################################################", "!IH       ", 0);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "##########hi!HI!##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", (java.lang.CharSequence[]) strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "####################################################################################################" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "####################################################################################################" + "'", str5, "####################################################################################################");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 16 + "'", int6 == 16);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "####################################################################################################" });
    }

    @Test
    public void test05443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05443");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ", "aaaaaaa...", 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              " });
    }

    @Test
    public void test05444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05444");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "i!ahi!ahi!ahi!a!!!!!!!!!!!!!!!!!!!!!!!!!ahi", 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05445");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("", " !ih                             !ih                             !ih                                IH                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05446");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("hi", "iii!ih                                hi!!ih                                hi!!ih                                       hi!!ih       ", "!IH                         hi!");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test05447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05447");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!", 90);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05448");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!!ih                                hi!!ih                                hi!!ih                                hi!!ih                                       hi!!ih       ", "hi!!ih                                       hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!", 296);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!!ih                                hi!!ih                                hi!!ih                                hi!!ih                                       hi!!ih       " });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!!ih                                hi!!ih                                hi!!ih                                hi!!ih                                       hi!!ih       " + "'", str4, "hi!!ih                                hi!!ih                                hi!!ih                                hi!!ih                                       hi!!ih       ");
    }

    @Test
    public void test05449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05449");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("hhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhh" + "'", str1, "Hhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhh");
    }

    @Test
    public void test05450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05450");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "                                             4!ih44444444444444444444444444444!ih44444444444444444444444444444!IH44444444444444444444444444444444", 75, 117);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05451");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "hi! hI!hI!hI!hI!hI!hI!hI!hI!hI                         hi! hI!hI!hI!hI!hI!hI!hI!hI!hI                         hi! hI!hI!hI!hI!hI!hI!hI!hI!hI                         hi! hI!hI!hI!hI!hI!hI!hI!hI!hI                                hi! hI!hI!hI!hI!hI!hI!hI!hI!hI", 79);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05452");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.join(charSequenceArray0);
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(charSequenceArray0);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) charSequenceArray0, "hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(charSequenceArray0);
        org.junit.Assert.assertNotNull(charSequenceArray0);
        org.junit.Assert.assertArrayEquals(charSequenceArray0, new java.lang.CharSequence[][] {});
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test05453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05453");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "Hi!hi!hi!hi!   hi!    hi!hi!hi!hi!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05454");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                         hi!HI!hi!                             hi!hi!hi!                             hi!hi!44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444!ih!ih                             !ih!ih!ih                             !ih!IH!ih                         44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444!ih!ih                             !ih!ih!ih                             !ih!IH!ih                         44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test05455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05455");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "hi!");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "                                                    ", 126, 12);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test05456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05456");
        java.lang.CharSequence charSequence1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "    hi!HI!                             hi!                             hi!  HI!                hi!HI!hi!                             hi!hi!hi!                             hi!hi!", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test05457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05457");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("HI!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI" + "'", str1, "HI!HI");
    }

    @Test
    public void test05458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05458");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("hi!                             hi!", "                        IH    IH", "       #hi#!#hi#!#hi#!#hi#!!!!!!!!!!!!!!!!!!!!!!!!!!#hi#!!#ih#              #hi#!#hi#!#hi#!#hi#!!!!!!!!!!!!!!!!!!!!!!!!!!#hi#!!#ih#       #hi#!!#ih#              #hi#!!#ih#       #!!!!!!!!!!!!!!!!!!!!!!!!!!#ih#       #hi#!", 75);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!                             hi!" + "'", str4, "hi!                             hi!");
    }

    @Test
    public void test05459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05459");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH...H!IH!IH!IH!IH!IH!IH!IH!IH", "... hi!!ih hi!!ih hi!!ih ...                                ... hi!!ih hi!!ih hi!!ih ...                         ... hi!!ih hi!!ih hi!!ih ...                         ... hi!!ih hi!!ih hi!!ih ...                         ... hi!!ih hi!!ih hi!!ih ...                                      ", "I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test05460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05460");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "hI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", (java.lang.CharSequence) "...hi!!ih...                                                                                                                                                                                                                                                                                     ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05461");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("!ih       HI!", "!ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       ", 39);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!ih       !ih       !ih       !ih       !ih       !ih       !ih                                ", " HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI!                             HI!                             HI! ", 18);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hI!hI!hI!hI!hI!hI!hI!hI!hIaAAAAAAA", strArray4, strArray8);
        java.lang.Class<?> wildcardClass10 = strArray8.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "!ih       HI!" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!ih       !ih       !ih       !ih       !ih       !ih       !ih                                " });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hI!hI!hI!hI!hI!hI!hI!hI!hIaAAAAAAA" + "'", str9, "hI!hI!hI!hI!hI!hI!hI!hI!hIaAAAAAAA");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test05462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05462");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase(charSequence0, (java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05463");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                         hi!", "                                                                     !IH                         hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                         hi!" + "'", str2, "                         hi!");
    }

    @Test
    public void test05464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05464");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "!hi!hi!", 0, 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05465");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("hI!", "44444444444444444444444444444444HI!44444444444444444444444444444hi!44444444444444444444444444444hi!4", "hi!!ih                                       hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hI!" + "'", str3, "hI!");
    }

    @Test
    public void test05466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05466");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "                         hi!", "                         hi!", "                         hi!", "                                hi!", "" };
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray7, "");
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray9, "hi!");
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray11, '#', (int) (byte) 0, (int) (byte) 1);
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!");
        java.lang.String[] strArray19 = org.apache.commons.lang3.StringUtils.stripAll(strArray17, "hi!");
        java.lang.String[] strArray20 = org.apache.commons.lang3.StringUtils.stripAll(strArray17);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray11, strArray20);
        java.lang.String[] strArray22 = org.apache.commons.lang3.StringUtils.stripAll(strArray20);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!", "                         hi!", "                         hi!", "                         hi!", "                                hi!", "" });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!", "                         hi!", "                         hi!", "                         hi!", "                                hi!", "" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "", "                         ", "                         ", "                         ", "                                ", "" });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test05467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05467");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("##########hi!HI!###################################################################################", "...   ##     ##     ##   ...                         ...   ##     ##     ##   ...                         ...   ##     ##     ##   ...                         ...   ##     ##     ##   ...                                ...   ##     ##     ##   ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...   ##     ##     ##   ...                         ...   ##     ##     ##   ...                         ...   ##     ##     ##   ...                         ...   ##     ##     ##   ...                                ...   ##     ##     ##   ..." + "'", str2, "...   ##     ##     ##   ...                         ...   ##     ##     ##   ...                         ...   ##     ##     ##   ...                         ...   ##     ##     ##   ...                                ...   ##     ##     ##   ...");
    }

    @Test
    public void test05468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05468");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "       #hi#!#hi#!#hi#!#hi#!!!!!!!!!!!!!!!!!!!!!!!!!!#hi#!!#ih# HI  #hi#!!#ih#       #!!!!!!!!!!!!!!!!!!!!!!!!!!#ih#       #hi#!       #hHI! HI! HI!        #hi#!#hi#!#hi#!#hi#!!!!!!!!!!!!!!!!!!!!!!!!!!#hi#!!#ih# HI  #hi#!!#ih#       #!!!!!!!!!!!!!!!!!!!!!!!!!!#ih#       #hi#!       #hi");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 285 + "'", int1 == 285);
    }

    @Test
    public void test05469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05469");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("...   ", "###########################################################################I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", 0, 705);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "###########################################################################I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI" + "'", str4, "###########################################################################I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
    }

    @Test
    public void test05470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05470");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444!ih!ih                             !ih!ih!ih                             !ih!IH!ih                         44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "!", "ih", "!", "ih", "                             ", "!", "ih", "!", "ih", "!", "ih", "                             ", "!", "ih", "!", "IH", "!", "ih", "                         ", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" });
    }

    @Test
    public void test05471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05471");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("HI!                             hi!                             hi! ", 52);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                hi!                             hi! " + "'", str2, "                hi!                             hi! ");
    }

    @Test
    public void test05472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05472");
        char[] charArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) " hI!hI...", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05473");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "IH                         ", (java.lang.CharSequence) "                                                !IH                                                 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05474");
        java.lang.CharSequence charSequence0 = null;
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf(charSequence0, (java.lang.CharSequence) "ih                         ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05475");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("       HI!  ", "       #hi#!#hi#!#hi#!#hi#!!!!!!!!!!!!!!!!!!!!!!!!!!#hi#!!#ih# HI  #hi#!!#ih#       #!!!!!!!!!!!!!!!!!!!!!!!!!!#ih#       #hi#!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       HI!  " + "'", str2, "       HI!  ");
    }

    @Test
    public void test05476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05476");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("ci HI ci                              ci ci ci                              ci ci", "hi!hI!hi!hI!hi!hI!hi!hI!!!!!!!!!!!!!!!!!!!!!!!!!!hI!hi!", 2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "ci HI ci                              ci ci ci                              ci ci" });
    }

    @Test
    public void test05477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05477");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString(" hI!hI...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " hI!hI..." + "'", str1, " hI!hI...");
    }

    @Test
    public void test05478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05478");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("                                 ci HI ci                              ci ci ci                              ci ci         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ciHIcicicicicici" + "'", str1, "ciHIcicicicicici");
    }

    @Test
    public void test05479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05479");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("#################################################################################################hi#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#################################################################################################hi#" + "'", str1, "#################################################################################################hi#");
    }

    @Test
    public void test05480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05480");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "                         HI!IH       !IH       !IH       !IH       !IH       !IH       !IH       ", (java.lang.CharSequence) "######ih                         HI!##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05481");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("...HI!!IHHI!!IHHI!!IH......HI!!IHHI!!IHHI!!IH......HI!!IHHI!!IHHI!!IH......HI!!IHHI!!IHHI!!IH......HI!!IHHI!!IHHI!!IH...", "HI!!IH       hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444hi!!IH       hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444hi!");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test05482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05482");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("hi!hi!hi!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI" + "'", str1, "HI!HI!HI!HI!HI!HI!HI!HI!HI");
    }

    @Test
    public void test05483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05483");
        char[] charArray4 = new char[] {};
        boolean boolean5 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "                         hi!", charArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray4);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                                                                                 HI!", charArray4);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "####################################################################################################", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test05484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05484");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                              ", (java.lang.CharSequence) "                hi!                             hi! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 16 + "'", int2 == 16);
    }

    @Test
    public void test05485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05485");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("!ihhi!ihhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ihhi!ihhi!" + "'", str1, "!ihhi!ihhi!");
    }

    @Test
    public void test05486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05486");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("ci HI ci                              ci ci ci                              ci ci", "!ih       HI!                                      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ci HI ci                              ci ci ci                              ci c" + "'", str2, "ci HI ci                              ci ci ci                              ci c");
    }

    @Test
    public void test05487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05487");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "                                  hi", (java.lang.CharSequence) "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05488");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("hi!HI!hi!hi!HI!", "HI! HI! HI! ", 52, 127);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!HI!hi!hi!HI!HI! HI! HI! " + "'", str4, "hi!HI!hi!hi!HI!HI! HI! HI! ");
    }

    @Test
    public void test05489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05489");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "ih", "###############################################################################!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05490");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("###############################################################################!hi!hi!", "hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih              hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###############################################################################!hi!hi!" + "'", str2, "###############################################################################!hi!hi!");
    }

    @Test
    public void test05491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05491");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "4       4HI4!!4IH4              4HI4!!4IH4       4!!!!!!!!!!!!!!!!!!!!!!!!!!4IH4       4HI4!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05492");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "hi!HI!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05493");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("####################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "####################################################" + "'", str1, "####################################################");
    }

    @Test
    public void test05494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05494");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                   !iHHi!                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05495");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "                         HI hi HI                              HI HI HI                              HI HI", 96, 39);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05496");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                                                                     !ih                         HI!", "!    ", "HI HI! HI! HI!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                     !ih                         HI!" + "'", str3, "                                                                     !ih                         HI!");
    }

    @Test
    public void test05497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05497");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "44444444444444444444444                                                                                                 hi4", (java.lang.CharSequence) "###########################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05498");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("!ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       ", "IH                         ", "...      hi!!ih       ...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       " + "'", str3, "!ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       ");
    }

    @Test
    public void test05499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05499");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                H", "HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test05500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05500");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty(charSequence0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }
}

