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
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "                      hi!", 46);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09002");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("aaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!", "        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!");
    }

    @Test
    public void test09003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09003");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("...hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "hi!  hi!           HI!                                hi!  hi!           HI!hi!  hi!           HI!       hi!  hi!           HI!!!!!!!!!!!!!!!!!!!!!!!!!!  hi!           HI!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!" + "'", str3, "...hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!");
    }

    @Test
    public void test09004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09004");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("HI!IH!IH!IH!IH!IH!IH!IH", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09005");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!                             HI!                             HI!", "                        IH    IH", 36);
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!                             HI!                             HI!" });
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test09006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09006");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("  hi!                             hi!  HI!!ih ", "                                hi!                             hi!                             hi", "                             hi!");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test09007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09007");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("...hi  ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...hi  ih" + "'", str1, "...hi  ih");
    }

    @Test
    public void test09008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09008");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "  hi!                             hi!  HI!!ih ", "...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...                         hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09009");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", "...4444444444444444444444...44444444444444444444444444444444...4444444444444444444444...4444444444444444444444444...4444444444444444444444...4444444444444444444444444...4444444444444444444444...4444444444444444444444444...4444444444444444444444...");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "                         hi!HI!hi!                             hi!hi!hi!                             hi!hi");
        boolean boolean7 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "...hi  ih", (java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test09010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09010");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("hi!           HI                                    ", "aaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!           HI                                    " + "'", str2, "hi!           HI                                    ");
    }

    @Test
    public void test09011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09011");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                         hi", "hi!hI!hi!hI!hi!hI!hi!hI!!!!!!!!!!!!!!!!!!!!!!!!!!hI!hi!", 8);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                         hi" });
    }

    @Test
    public void test09012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09012");
        java.lang.String[] strArray1 = null;
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                 hi!");
        java.lang.String[] strArray5 = null;
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEach("!ih       HI!", strArray4, strArray5);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("HI!HI!HI!       HI!A!!!!!!!!!!!!!!!!!!!!!!!!!A                                HI!A4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444!HI!HI!", strArray1, strArray5);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "!ih       HI!" + "'", str6, "!ih       HI!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HI!HI!HI!       HI!A!!!!!!!!!!!!!!!!!!!!!!!!!A                                HI!A4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444!HI!HI!" + "'", str7, "HI!HI!HI!       HI!A!!!!!!!!!!!!!!!!!!!!!!!!!A                                HI!A4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444!HI!HI!");
    }

    @Test
    public void test09013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09013");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "hi!!ih                                       hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09014");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "!IHHI!                         ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09015");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                         hi!    ", '4', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                         hi!    " + "'", str3, "                         hi!    ");
    }

    @Test
    public void test09016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09016");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                         hi!    ", '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                         hi!    " });
    }

    @Test
    public void test09017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09017");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" });
    }

    @Test
    public void test09018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09018");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09019");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "Aaaaaaaaaaaaaaaa##########################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09020");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat(' ', (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                    " + "'", str2, "                                                                                                    ");
    }

    @Test
    public void test09021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09021");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "! hi! hi!", (java.lang.CharSequence) "!hi!hi!!hi!!hi!!ih              hi!h", 836);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09022");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "HI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!", 150);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09023");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!ihhi!ihhi!!!ihhi!ihhi!HI!ihhi!ihhi!!      !IH                         hi!                                           ", "    !             !", 1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!ihhi!ihhi!!!ihhi!ihhi!HI!ihhi!ihhi!!      !IH                         hi!                                           " });
    }

    @Test
    public void test09024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09024");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("!    !    !    !    !    !    !    !    !    !    !    !    ! ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "! ! ! ! ! ! ! ! ! ! ! ! ! ..." + "'", str1, "! ! ! ! ! ! ! ! ! ! ! ! ! ...");
    }

    @Test
    public void test09025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09025");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("!ihhi!ihhi!", 150, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#####################################################################!ihhi!ihhi!######################################################################" + "'", str3, "#####################################################################!ihhi!ihhi!######################################################################");
    }

    @Test
    public void test09026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09026");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                         hi!", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                         hi!" + "'", str2, "                         hi!");
    }

    @Test
    public void test09027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09027");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "hi!           HI                                    ", (java.lang.CharSequence) "Hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!", 96);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09028");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "HIhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09029");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("                             hi!", "hi!!ih hi!!ih hi!!ih hi!!ih !!!!!!!!!!!!!!!!!!!!!!!!!!ih hi!#######################################################################################################################################################################", "HI!!IH       !IH       !IH       !IH       !IH       !IH       !IH       !IH       !IH       !IH       !IH       !IH       !IH       !IH       !IH       !IH       !IH       !IH       !IH       !IH######################################################################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                             hi!" + "'", str3, "                             hi!");
    }

    @Test
    public void test09030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09030");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09031");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                      HI!                             HI!                             HI! ", '4');
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!                             hi!", (java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                      HI!                             HI!                             HI! " });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test09032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09032");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("                                hi                                HI!                             HI!                             HI!", "                     4444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                hi                                HI!                             HI!                             HI!" + "'", str2, "                                hi                                HI!                             HI!                             HI!");
    }

    @Test
    public void test09033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09033");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("                             !iHHi!", "##########   hi!           HI!##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09034");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "hi!!ihhi!!ihhi!!ihhi!!ihhi!!ihHIHI!HI!HI!", (java.lang.CharSequence) "#hi#!#hi#!#hi...!IHhi!#hi#!#hi#!#hi");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "hi!!ihhi!!ihhi!!ihhi!!ihhi!!ihHIHI!HI!HI!" + "'", charSequence2, "hi!!ihhi!!ihhi!!ihhi!!ihhi!!ihHIHI!HI!HI!");
    }

    @Test
    public void test09035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09035");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("", '#', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test09036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09036");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hhhhhhhhhhhhhhhhhhhhhhhhhhi!Ih!hi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!hi!hi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!hi!44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "...      hi!!ih       ......      hi!!ih       ......      hi!!ih       ......      hi!!ih       ......      hi!!ih       ......      hi!!ih       ......      hi!!ih       ......      hi!!ih       ......      hi!!ih       ......      hi!!ih       ......      hi!!ih       ......      hi!!ih       ......      hi!!ih       ...", 685);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hhhhhhhhhhhhhhhhhhhhhhhhhhi!Ih!hi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!hi!hi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!hi!44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" });
    }

    @Test
    public void test09037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09037");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("  HI!########################################################", "HI!        ######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "  HI!########################################################" });
    }

    @Test
    public void test09038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09038");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!!ih                                hi!!ih                                hi!!ih                                hi!!ih                                       hi!!ih       ", "       ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09039");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...      hi!!ih       ...", "...4444444444444444444444...44444444444444444444444444444444...4444444444444444444444...4444444444444444444444444...4444444444444444444444...4444444444444444444444444...4444444444444444444444...4444444444444444444444444...4444444444444444444444...");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "", "", "      hi!!ih       ", "", "", "" });
    }

    @Test
    public void test09040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09040");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("           HI!HI!", "!i...", 119);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "           HI", "HI", "" });
    }

    @Test
    public void test09041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09041");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("... hi!!ih hi!!ih hi!!ih ...                                    HI!... hi!!ih hi!!ih hi!!ih ...     ", 138, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "######################################... hi!!ih hi!!ih hi!!ih ...                                    HI!... hi!!ih hi!!ih hi!!ih ...     " + "'", str3, "######################################... hi!!ih hi!!ih hi!!ih ...                                    HI!... hi!!ih hi!!ih hi!!ih ...     ");
    }

    @Test
    public void test09042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09042");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("hI!!IHhi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444hi!!IHhi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hI!!IHhi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444hi!!IHhi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444hi!" + "'", str1, "hI!!IHhi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444hi!!IHhi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444hi!");
    }

    @Test
    public void test09043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09043");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "                                                                                                 hi!!ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih   ", (java.lang.CharSequence) "444444444", 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09044");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "hI!hI!hI!hI!hI!hI!h", 206);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09045");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("!i...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!I..." + "'", str1, "!I...");
    }

    @Test
    public void test09046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09046");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "4444 hI!hI!hI!hI!hI!hI!hI!hI!hI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09047");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                                                                                                                                 ", "               !                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                 " + "'", str2, "                                                                                                                                 ");
    }

    @Test
    public void test09048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09048");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "HI", (java.lang.CharSequence) "hi! hhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09049");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "                         #################################################################", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09050");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("! ! ! ! ! ! ! ! ! ! ! ! ! ...", "!IHHI!", "                                                                                                                        !iHHi! ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test09051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09051");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "                            !IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH", (int) (byte) 10, 282);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09052");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                hi!!ih                                       hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "                                ", "hi", "!!", "ih", "                                       ", "hi", "!!", "ih", "       ", "hi", "!!", "ih", "              ", "hi", "!!", "ih", "       ", "!!!!!!!!!!!!!!!!!!!!!!!!!!", "ih", "       ", "hi", "!" });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09053");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("       #hi#!#hi#!#hi#!#hi#!!!!!!!!!!!!!!!!!!!!!!!!!!#hi#!!#ih#              #hi#!#hi#!#hi#!#hi#!!!!!!!!!!!!!!!!!!!!!!!!!!#hi#!!#ih#       #hi#!!#ih#              #hi#!!#ih#       #!!!!!!!!!!!!!!!!!!!!!!!!!!#ih#       #hi#!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       #hi#!#hi#!#hi#!#hi#!!!!!!!!!!!!!!!!!!!!!!!!!!#hi#!!#ih#              #hi#!#hi#!#hi#!#hi#!!!!!!!!!!!!!!!!!!!!!!!!!!#hi#!!#ih#       #hi#!!#ih#              #hi#!!#ih#       #!!!!!!!!!!!!!!!!!!!!!!!!!!#ih#       #hi#!" + "'", str2, "       #hi#!#hi#!#hi#!#hi#!!!!!!!!!!!!!!!!!!!!!!!!!!#hi#!!#ih#              #hi#!#hi#!#hi#!#hi#!!!!!!!!!!!!!!!!!!!!!!!!!!#hi#!!#ih#       #hi#!!#ih#              #hi#!!#ih#       #!!!!!!!!!!!!!!!!!!!!!!!!!!#ih#       #hi#!");
    }

    @Test
    public void test09054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09054");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                                                                                                              !    !    !  ", (java.lang.CharSequence) "hi!!ih                                       hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!                                                                                                                                                                      ", 197);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 175 + "'", int3 == 175);
    }

    @Test
    public void test09055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09055");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "IH!!!!!!!4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence) "hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09056");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                hi!                             hi!                             hi", '#', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                hi!                             hi!                             hi" + "'", str3, "                                hi!                             hi!                             hi");
    }

    @Test
    public void test09057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09057");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("... HI!!IH HI!!IH HI!!IH ...       ", "!iHHiHI!!iHHi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "... HI!!IH HI!!IH HI!!IH ...       " + "'", str2, "... HI!!IH HI!!IH HI!!IH ...       ");
    }

    @Test
    public void test09058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09058");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!...", "...   ##     ##     ##   ...                         ...   ##     ##     ##   ...                         ...   ##     ##     ##   ...                         ...   ##     ##     ##   ...                                ...   ##     ##     ##   ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!..." + "'", str2, "Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!...");
    }

    @Test
    public void test09059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09059");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("!!          HI!    !!                                    !!                                    !!                                           !!", '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!!          HI!    !!                                    !!                                    !!                                           !!" });
    }

    @Test
    public void test09060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09060");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "hiHI!HI!HI!Hi!hi!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09061");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay(" hi! hi!", "hi!hi!hi!hi!   hi!    hi!hi!hi!hi!!", 289, 273);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + " hi! hi!hi!hi!hi!hi!   hi!    hi!hi!hi!hi!!" + "'", str4, " hi! hi!hi!hi!hi!hi!   hi!    hi!hi!hi!hi!!");
    }

    @Test
    public void test09062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09062");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("!ih       HI!                                                                                                                                                                                                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!IH       hi!                                                                                                                                                                                                                                                                                    " + "'", str1, "!IH       hi!                                                                                                                                                                                                                                                                                    ");
    }

    @Test
    public void test09063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09063");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH" + "'", str1, "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH");
    }

    @Test
    public void test09064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09064");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "...                       hi!!ih                                       hi!!ih       hi!!ih       ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09065");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "                                HI                                        HI                                        HI                                        HI                                        HI                                        HI                                       ! hi! hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09066");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "HI! HI! ..", 35, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09067");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                             hi!", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "HIhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        int int7 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray6);
        int int8 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "hi!ih       !ih       !ih    ...", (java.lang.CharSequence[]) strArray6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                             hi!" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "i!" });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test09068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09068");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "!ihhi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!!HI! ! ! HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09069");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("!ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       ", 39, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09070");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("hi!ih       !ih       !ih       !ih       !ih       !ih       !ih                                ", 300);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!ih       !ih       !ih       !ih       !ih       !ih       !ih                                " + "'", str2, "hi!ih       !ih       !ih       !ih       !ih       !ih       !ih                                ");
    }

    @Test
    public void test09071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09071");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("...hi!!ih...                                                                                                                                                                                                                                                                                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...hi!!ih...                                                                                                                                                                                                                                                                                     " + "'", str1, "...hi!!ih...                                                                                                                                                                                                                                                                                     ");
    }

    @Test
    public void test09072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09072");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("4!ih44444444444444444444444444444!ih44444444444444444444444444444!ih44444444444444444444444444444444", "                                                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4!ih44444444444444444444444444444!ih44444444444444444444444444444!ih44444444444444444444444444444444" + "'", str2, "4!ih44444444444444444444444444444!ih44444444444444444444444444444!ih44444444444444444444444444444444");
    }

    @Test
    public void test09073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09073");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                      ", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09074");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("", " hI!hI!hI!hI!hI!hI!hI!hI!hI");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '4', 373, 38);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test09075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09075");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("hi!ih       !ih       !ih    ......hi!ih       !ih       !ih    ......hi!ih       !ih       !ih    ......hi!ih       !ih       !ih    ......hi!ih       !ih       !ih    ......hi!ih       !ih       !ih    ......hi!ih       !ih       !ih    ......hi!ih       !ih       !ih    ......hi!ih       !ih       !ih    ......hi!ih       !ih       !ih    ......");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!ih       !ih       !ih    ......hi!ih       !ih       !ih    ......hi!ih       !ih       !ih    ......hi!ih       !ih       !ih    ......hi!ih       !ih       !ih    ......hi!ih       !ih       !ih    ......hi!ih       !ih       !ih    ......hi!ih       !ih       !ih    ......hi!ih       !ih       !ih    ......hi!ih       !ih       !ih    ......" + "'", str1, "hi!ih       !ih       !ih    ......hi!ih       !ih       !ih    ......hi!ih       !ih       !ih    ......hi!ih       !ih       !ih    ......hi!ih       !ih       !ih    ......hi!ih       !ih       !ih    ......hi!ih       !ih       !ih    ......hi!ih       !ih       !ih    ......hi!ih       !ih       !ih    ......hi!ih       !ih       !ih    ......");
    }

    @Test
    public void test09076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09076");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) " !IH                         hi!", "IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I            ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09077");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("", 39, 158);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test09078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09078");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("HI!HI!HI!HI!HI!HI!HI!HI!HI", "HI!HI!HI!HI!HI!HI!HI4444 hI!hI!hI!hI!hI!hI!hI!hI!hIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", 27, 718);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI4444 hI!hI!hI!hI!hI!hI!hI!hI!hIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" + "'", str4, "HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI4444 hI!hI!hI!hI!hI!hI!hI!hI!hIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
    }

    @Test
    public void test09079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09079");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("HI!hi!hi!hi!hi!hi!hi!", "i! hi! hi! H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI" + "'", str2, "HI");
    }

    @Test
    public void test09080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09080");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("4444 hI!hI!hI!hI!hI!hI!hI!hI!hI", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09081");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "            IH IH IH IH IH IH IH IH IH IH IH IH IH IH IH IH IH IH IH IH IH IH IH IH IH IH IH IH IH IH IH IH IH IH IH IH IH IH IH IH IH IH IH IH IH IH IH IH IH IH IH IH IH IH IH IH IH IH IH IH IH IH IH IH IH IH IH IH IH IH IH IH IH IH IH IH IH IH IH IH IH IH IH IH IH IH I            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09082");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("                                                                                                                                                                                                                                                                                                                                                                                                                                    ", (int) (short) 10, 24);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...                  ..." + "'", str3, "...                  ...");
    }

    @Test
    public void test09083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09083");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "Hhhhhhhhhhhhhhhhhhhhhhhhh hI!hI!hI!hI!hI!hI!hI!hI!hI", 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09084");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("iH                                                 ", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09085");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                                                                                     ", ' ', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#####################################################################################################################" + "'", str3, "#####################################################################################################################");
    }

    @Test
    public void test09086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09086");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "hhhhhhhhhh                      hi!!IHHI!    !hi!hi!hhhhhhhhhh                      hi!!IHHI!    ", (java.lang.CharSequence) "                  !ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09087");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray8 = new char[] {};
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "!!!!!!!!!!!!!!!!!!!!!!!!!", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                hi!", charArray8);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "       hi!", charArray8);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence4, charArray8);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                hi!!ih                                       hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!", charArray8);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "HIhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", charArray8);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                             !iHHi!", charArray8);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "######ih                         HI!##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test09088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09088");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444444444444444       #hi#!#hi#!#hi#!#hi#!!!!!!!!!!!!!!!!!!!!!!!!!!#hi#!!#ih# HI  #hi#!!#ih#       #!!!!!!!!!!!!!!!!!!!!!!!!!!#ih#       #hi#!4444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09089");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!IH !ih #########", "!ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI!", 64);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!IH !ih #########" + "'", str3, "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!IH !ih #########");
    }

    @Test
    public void test09090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09090");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("hhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhh", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhh" + "'", str2, "hhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhh");
    }

    @Test
    public void test09091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09091");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray6 = new char[] {};
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "                         hi!", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny(charSequence4, charArray6);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) " ", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "HI!", charArray6);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                            hi!hi!hi!                             hi!hi", charArray6);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "#######################################################################################################################################################################################################################################################################################...", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test09092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09092");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("                                                                                                                                                                                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                    " + "'", str1, "                                                                                                                                                                                                                                                                    ");
    }

    @Test
    public void test09093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09093");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "HI!hi                                 !                             hi!                             hi!", (java.lang.CharSequence) "#hi#!#hi#!#hi#!#hi#!!!!!!!!!!!!!!!!!!!!!!!!!!#hi#!!#                           hi      #!!!!!!!!!!!!!!!!!!!!!!!!!!#ih#       #hi#!    ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09094");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "!hi!hi!444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09095");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("ih            hi!HI!hi!                             hi!hi!hi!                             hi!hi", "...                                                      ;   ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ih            hi!HI!hi!                             hi!hi!hi!                             hi!hi" + "'", str2, "ih            hi!HI!hi!                             hi!hi!hi!                             hi!hi");
    }

    @Test
    public void test09096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09096");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "hi!           HI###################################################...", (java.lang.CharSequence) "                                                                                                                                                                                                  HI!hi                                                                                                 HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09097");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("HI!HI!HI!HI!HI!HI!HI4444 hI!hI!hI!hI!hI!hI!hI!hI!hIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", 18, 39);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI4444 hI!hI!hI!hI!hI!hI!hI!hI!hIHI!HI!" + "'", str3, "HI4444 hI!hI!hI!hI!hI!hI!hI!hI!hIHI!HI!");
    }

    @Test
    public void test09098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09098");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!ih       HI!", "!iHHi!                                       !iHHi!       !iHHi!              !iHHi!       HHHHHHHHHHHHHHHHHHHHHHHHHHi!       !iH", 0);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "                             hi!                                                                    ", (java.lang.CharSequence[]) strArray4);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "", "h", "", "", "", "", "", "", "", "I", "" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "", "h", "", "", "", "", "", "", "", "I", "" });
    }

    @Test
    public void test09099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09099");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                HI                                HI!                             HI!                             HI! ", 126, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                HI                                HI!                             HI!                             HI! " + "'", str3, "                                HI                                HI!                             HI!                             HI! ");
    }

    @Test
    public void test09100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09100");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("!!                                           !!                                    !!                                    !!                                    !!", "hi!ihhi!ihhi!!!ihhi!ihhi!HI!ihhi!ihhi!!      !IH                         hi!                                           ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09101");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("...hi!!ihhi!!ihhi!!ih......hi!!ihhi!!ihhi!!ih......hi!!ihhi!!ihhi!!ih......hi!!ihhi!!ihhi!!ih......hi!!ihhi!!ihhi!!ih...", 284);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09102");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test09103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09103");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "!ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09104");
        char[] charArray5 = new char[] {};
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "!!!!!!!!!!!!!!!!!!!!!!!!!", charArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!   hi!    hi!hi!hi!hi!!", charArray5);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "HI!HI!HI!HI!!!!!!!!!!!!!!!!!!!!!!!!!!HI!", charArray5);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!hI!hi!hI!hi!hI!hi!hI!!!!!!!!!!!!!!!!!!!!!!!!!!hI!hi!", charArray5);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "44444444444444444444444444444444HI!44444444444444444444444444444hi!44444444444444444444444444444hi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test09105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09105");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("                4HI4ii4IH4       4HI4ii4IH4              4HI4ii4IH4       4iiiiiiiiiiiiiiiiiiiiiiiiii4IH4       4HI4i", "hi                                HI!                             HI!                             HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09106");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("                         ci HI ci                              ci ci ci                              ci ci");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                         ci HI ci                              ci ci ci                              ci ci" + "'", str1, "                         ci HI ci                              ci ci ci                              ci ci");
    }

    @Test
    public void test09107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09107");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "!iHHi!!!!!!!!!!!!!!!!!!!!", (java.lang.CharSequence) "!ihhi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!!HI! ! ! HI!", 18);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09108");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!!ihhi!!ihhi!!ihhi!!ihhi!!ih", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test09109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09109");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "HI!hi!hi!       hi!a!!!!!!!!!!!!!!!!!!!!!!!!!a                                hi!a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444!hi!hi!", (java.lang.CharSequence) "H");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "HI!hi!hi!       hi!a!!!!!!!!!!!!!!!!!!!!!!!!!a                                hi!a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444!hi!hi!" + "'", charSequence2, "HI!hi!hi!       hi!a!!!!!!!!!!!!!!!!!!!!!!!!!a                                hi!a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444!hi!hi!");
    }

    @Test
    public void test09110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09110");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "hi!ih       !ih       !ih       !ih       !ih       !ih       !ih                                ", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!Hi!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!Hi!hi!hi!hi!hi!hi!hi!hi!h...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09111");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split(" HI!HI!HI!HI!HI!HI!HI!HI!HI", "HI hi HI                              HI HI HI                              HI HI");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!", "!", "!", "!", "!", "!", "!", "!" });
    }

    @Test
    public void test09112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09112");
        char[] charArray8 = new char[] {};
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "!!!!!!!!!!!!!!!!!!!!!!!!!", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "", charArray8);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "       hi!", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "!!!!!!!!!!!!!!!!!!!!!!!!!", charArray8);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "!", charArray8);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "#######hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih##############hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih#######hi!!ih##############hi!!ih#######!!!!!!!!!!!!!!!!!!!!!!!!!!ih#######hi!", charArray8);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "!IHHIHI!!IHHI", charArray8);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test09113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09113");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "hi!aaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "HI hi HI HI HI HI HI HI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09114");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" });
    }

    @Test
    public void test09115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09115");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "HI!hhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhHi!h", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test09116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09116");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("HI!HI!HI!hi", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09117");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09118");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "!ihhi!                         ...!ihhi!                         ...!ihhi!                         ...!ihhi!                         ...!ihhi!                         ...!ihhi!                         ...!ihhi!                         ...!ihhi!                         ...!ihhi!                         ...!ihhi!                         ...!ihhi!                         ...!ihhi!                         ...!ihhi!                         ...!ihhi!                         ...!ihhi!                         ...!ihhi!                         ...!ihhi!                         ...!ihhi!                         ...!ihhi!                         ...!ihhi!                         !IH                         ", (java.lang.CharSequence) "... hi!!ih hi!!ih hi!!ih ... ... hi!!ih hi!!ih hi!!ih ... ... hi!!ih hi!!ih hi!!ih ... ... hi!!ih hi!!ih hi!!ih ... ... hi!!ih hi!!ih hi!!ih ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 603 + "'", int2 == 603);
    }

    @Test
    public void test09119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09119");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("IhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIh", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIh" + "'", str2, "IhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIh");
    }

    @Test
    public void test09120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09120");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "               HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! ", 2, 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09121");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hHI!###########################################################################################################################################################hi!HI!hi!                             hi!hi!hi!                             hi!hi!############...", "                                                     hhhhhhhhhhhhhhhhhhhhhhhh hI!hI!hI!hI!hI!hI!hI!h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hHI!###########################################################################################################################################################hi!HI!hi!                             hi!hi!hi!                             hi!hi!############..." + "'", str2, "hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hHI!###########################################################################################################################################################hi!HI!hi!                             hi!hi!hi!                             hi!hi!############...");
    }

    @Test
    public void test09122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09122");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "...!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhh", (java.lang.CharSequence) "hi! hi! hi!! hi! hi!! hi! hi!! hi! hi!! hi! hi!! hi! hi!! hi! hi!! hi! hi!! hi! hi!! hi! !");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09123");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("...!!!!!!!l.avajl[!ssalc", 300);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...!!!!!!!l.avajl[!ssalc" + "'", str2, "...!!!!!!!l.avajl[!ssalc");
    }

    @Test
    public void test09124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09124");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "###########################################################################I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", (java.lang.CharSequence) "                          !!                                           !!  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09125");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                  ", "  hi!                             hi!  HI!!ih ", 727);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test09126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09126");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih              hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!", 71);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih              hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!" + "'", str2, "hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih              hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!");
    }

    @Test
    public void test09127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09127");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "hi!    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09128");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove(" HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI!                             HI!                             HI! ", "Hi!hi!hi!hi!hi!hi!hi!hi!hi!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI!                             HI!                             HI! " + "'", str2, " HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI HI!HI!HI!HI!HI!HI!HI!HI!HI!                             HI!                             HI! ");
    }

    @Test
    public void test09129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09129");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("####################################################################################################", "HI!    ");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "   !    !    !  ", (java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "####################################################################################################" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "####################################################################################################" });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test09130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09130");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                         hi HI hi                              hi hi hi                              hi hi", "                         hi!", (int) (byte) 1);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                         hi HI hi                              hi hi hi                              hi hi" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test09131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09131");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("444", "                                                                                                                                                                                                                                                                                          ...!ih...", "                                                                                                  ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test09132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09132");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                4HI4!!4IH4                                       4HI4!!4IH4       4HI4!!4IH4              4HI4!!4IH4       4!!!!!!!!!!!!!!!!!!!!!!!!!!4IH4       4HI4!", "hi!");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", (java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                4HI4!!4IH4                                       4HI4!!4IH4       4HI4!!4IH4              4HI4!!4IH4       4!!!!!!!!!!!!!!!!!!!!!!!!!!4IH4       4HI4!" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test09133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09133");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                                HI!                   HI!hhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhh                     hi!                             ", 294);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                HI!                   HI!hhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhh                     hi!                             " + "'", str2, "                                HI!                   HI!hhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhh                     hi!                             ");
    }

    @Test
    public void test09134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09134");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                hi", "!iHHi!");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("       #hi#!#hi#!#hi#!#hi#!!!!!!!!!!!!!!!!!!!!!!!!!!#hi#!!#ih#              #hi#!#hi#!#hi#!#hi#!!!!!!!!!!!!!!!!!!!!!!!!!!#hi#!!#ih#       #hi#!!#ih#              #hi#!!#ih#       #!!!!!!!!!!!!!!!!!!!!!!!!!!#ih#       #hi#!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                           ", strArray3, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 48");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                hi" });
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test09135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09135");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("       #HI#!#HI#!#HI#!#HI#!!!!!!!!!!!!!!!!!!!!!!!!!!#HI#!!#IH#              #HI#!#HI#!#HI#!                      HI       #HI#!!#IH#              #HI#!!#IH#       #!!!!!!!!!!!!!!!!!!!!!!!!!!#IH#       #HI#!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       #HI#!#HI#!#HI#!#HI#!!!!!!!!!!!!!!!!!!!!!!!!!!#HI#!!#IH#              #HI#!#HI#!#HI#!                      HI       #HI#!!#IH#              #HI#!!#IH#       #!!!!!!!!!!!!!!!!!!!!!!!!!!#IH#       #HI#!" + "'", str2, "       #HI#!#HI#!#HI#!#HI#!!!!!!!!!!!!!!!!!!!!!!!!!!#HI#!!#IH#              #HI#!#HI#!#HI#!                      HI       #HI#!!#IH#              #HI#!!#IH#       #!!!!!!!!!!!!!!!!!!!!!!!!!!#IH#       #HI#!");
    }

    @Test
    public void test09136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09136");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate(" hI!hI!hI!hI!hI!hI!hI!hI!hI", 177);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " hI!hI!hI!hI!hI!hI!hI!hI!hI" + "'", str2, " hI!hI!hI!hI!hI!hI!hI!hI!hI");
    }

    @Test
    public void test09137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09137");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip(";");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ";" + "'", str1, ";");
    }

    @Test
    public void test09138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09138");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test09139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09139");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("", 64, 21);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test09140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09140");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "hi!hi!hi!hi#######HI!!hi!", (java.lang.CharSequence) "hI!                                                                                                                                       ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09141");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("hi! hi! HI!!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI! HI! HI!!IH" + "'", str1, "HI! HI! HI!!IH");
    }

    @Test
    public void test09142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09142");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("ih");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "###########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!IHaaaaaaaaaaa!ihaaa#########");
        java.lang.Class<?> wildcardClass4 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "ih" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ih" + "'", str3, "ih");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test09143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09143");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hi!44hi!44444444444HI!44444444444444444444444444444444hi!44hi!44444444444HI!hi!44hi!44444444444HI!4444444hi!44hi!44444444444HI!!!!!!!!!!!!!!!!!!!!!!!!!!44hi!44444444444HI!hi!", "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!IH                         hi######");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "44", "44444444444", "44444444444444444444444444444444", "44", "44444444444", "44", "44444444444", "4444444", "44", "44444444444", "44", "44444444444" });
    }

    @Test
    public void test09144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09144");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("HI!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!" + "'", str1, "HI!HI!HI!HI!HI!HI!HI!");
    }

    @Test
    public void test09145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09145");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "                         #################################################################", 161);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09146");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, 'a', 6, 289);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
    }

    @Test
    public void test09147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09147");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("HI! hi! hi!", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09148");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                         hi!HI!hi!                             hi!hi!hi!                             hi!h", (java.lang.CharSequence) "   !    !    !  ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                         hi!HI!hi!                             hi!hi!hi!                             hi!h" + "'", charSequence2, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                         hi!HI!hi!                             hi!hi!hi!                             hi!h");
    }

    @Test
    public void test09149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09149");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("###############################################################################!hi!hi!", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!", 8);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "###############################################################################!hi!hi!" });
    }

    @Test
    public void test09150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09150");
        char[] charArray5 = new char[] {};
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "!!!!!!!!!!!!!!!!!!!!!!!!!", charArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", charArray5);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hI!hI!hI!hI!hI!hI!hI!hI!hI", charArray5);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi", charArray5);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "...                         HI HI########################################################...", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test09151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09151");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                    HI! HI!                                                                                                                                                                                                                                                                                                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09152");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "   hi!HI!                             hi!                             hi!  HI!", "                                                     hhhhhhhhhhhhhhhhhhhhhhhh hI!hI!hI!hI!hI!hI!hI!h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09153");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("!!          HI!    !!                                    !!                                    !!                                           !!", 42);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                        !!" + "'", str2, "                                        !!");
    }

    @Test
    public void test09154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09154");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "!ihhi!ihhi!", (java.lang.CharSequence) "                           hi", 22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09155");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "44                                                                                                                                                                                             ...                       hi!!ih                                       hi!!ih       hi!!ih       ...", (java.lang.CharSequence) "hi!                         hi!                         hi!                         hi!                                hi!");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "44                                                                                                                                                                                             ...                       hi!!ih                                       hi!!ih       hi!!ih       ..." + "'", charSequence2, "44                                                                                                                                                                                             ...                       hi!!ih                                       hi!!ih       hi!!ih       ...");
    }

    @Test
    public void test09156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09156");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "Hhhhhhhhhhhhhhhhhhhhhhhhh hI!hI!hI!hI!hI!hI!hI!hI!hI");
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test09157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09157");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("... HI!!IH HI!!IH HI!!IH ...       ");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, ".                             hi!..", 291, (int) (byte) 1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "...", " ", "HI", "!!", "IH", " ", "HI", "!!", "IH", " ", "HI", "!!", "IH", " ", "...", "       " });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test09158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09158");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "HI!hi!                             hi!hi!hi!                             hi!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09159");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split(" !IH                         hi!", "!ihHI!", 35);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { " ", "                         " });
    }

    @Test
    public void test09160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09160");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("hi!                             hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi! hi!" + "'", str1, "hi! hi!");
    }

    @Test
    public void test09161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09161");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", (java.lang.CharSequence) "HI!    hi!!ih       HI!!IH44444444444444444444444444444444HI!!IH44444444444444444444444444444444HI!!IH44444444444444444444444444444444HI!!IH444444444444444444444444444444444444444HI!!IH4444444HI!!ih       HI!!IH44444444444444444444444444444444HI!!IH44444444444444444444444444444444HI!!IH4444444444444...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09162");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("               !                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!" + "'", str1, "!");
    }

    @Test
    public void test09163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09163");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444!IH444444444444444444444444444444444444444444444444444444444444444444444444", "IH!!!!!!!4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 7);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "                         #################################################################", (java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test09164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09164");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                ", "... hi!!ih hi!!ih hi!!ih ...                                ... hi!!ih hi!!ih hi!!ih ...                         ... hi!!ih hi!!ih hi!!ih ...                         ... hi!!ih hi!!ih hi!!ih ...                         ... hi!!ih hi!!ih hi!!ih ...", (int) ' ');
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                " });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "" });
    }

    @Test
    public void test09165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09165");
        java.lang.CharSequence charSequence1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "hi!HI!hi!hi!hi!hi!hi!hi!", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09166");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("aaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!");
    }

    @Test
    public void test09167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09167");
        java.lang.String[] strArray7 = new java.lang.String[] { "                                hi!", "                                hi!", "hi!", "       hi!", "!!!!!!!!!!!!!!!!!!!!!!!!!", "hi!" };
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "                         hi!", "                         hi!", "                         hi!", "                                hi!", "" };
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.stripAll(strArray14, "");
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray7, strArray16);
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.stripAll(strArray7);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(strArray18);
        java.lang.String[] strArray21 = org.apache.commons.lang3.StringUtils.stripAll(strArray18, "hi!");
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray21);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "                                hi!", "                                hi!", "hi!", "       hi!", "!!!!!!!!!!!!!!!!!!!!!!!!!", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "                         hi!", "                         hi!", "                         hi!", "                                hi!", "" });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "                         hi!", "                         hi!", "                         hi!", "                                hi!", "" });
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "!!!!!!!!!!!!!!!!!!!!!!!!!", "hi!" });
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!" + "'", str19, "hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "", "", "", "", "" });
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test09168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09168");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("hi!ih!ih!ih!ih!ih!ih!ih", 175, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                        hi!ih!ih!ih!ih!ih!ih!ih" + "'", str3, "                                                                                                                                                        hi!ih!ih!ih!ih!ih!ih!ih");
    }

    @Test
    public void test09169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09169");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("####################################################...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "####################################################.." + "'", str1, "####################################################..");
    }

    @Test
    public void test09170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09170");
        java.lang.CharSequence charSequence1 = null;
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "                             HI", charSequence1, 133);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09171");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "h4!4h!4h!4h!4h!4h!4h!4h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09172");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray4 = new char[] {};
        boolean boolean5 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "                         hi!", charArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsAny(charSequence2, charArray4);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "!ih       HI!", charArray4);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi! hi! HI!!ih", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test09173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09173");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("###################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", "hi!!ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih", 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test09174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09174");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("IhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIh", "ci HI ci                              ci ci ci                              ci c", 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test09175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09175");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("aaaaaaaaaaaaaaaaa!ih       ", (int) (short) 0, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaa!ih       " + "'", str3, "aaaaaaaaaaaaaaaaa!ih       ");
    }

    @Test
    public void test09176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09176");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "!ih!ih", (java.lang.CharSequence) "                    iH             HI!HI!HI!                    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09177");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "hhhhhhhhhh hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09178");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa..", 300, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09179");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("   hi!HI!                             hi!                             hi!  HI!", "                                !                             HI!                             HI! ", "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   hi!HI!                             hi!                             hi!  HI!" + "'", str3, "   hi!HI!                             hi!                             hi!  HI!");
    }

    @Test
    public void test09180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09180");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                      hi############################################################################", 420);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                      hi############################################################################" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                      hi############################################################################");
    }

    @Test
    public void test09181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09181");
        char[] charArray9 = new char[] {};
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "!!!!!!!!!!!!!!!!!!!!!!!!!", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "", charArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "       hi!", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "!!!!!!!!!!!!!!!!!!!!!!!!!", charArray9);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "!", charArray9);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "                         hi", charArray9);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                                                          !IH                         hi!        ", charArray9);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                         hi!HI!hi!                             hi!hi!hi!                             hi!hi", charArray9);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hhhhhhhhhh                      hi!!IHHI!                                       !IHHI!       !IHHI!              !IHHI!       HHHHHHHHHHHHHHHHHHHHHHHHHHI!       !IH", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test09182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09182");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                      hi!                             hi!  HI!                hi!HI!hi!                             hi!hi!hi!                             hi!hi!", 6, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                      hi!                             hi!  HI!                hi!HI!hi!                             hi!hi!hi!                             hi!hi!" + "'", str3, "                      hi!                             hi!  HI!                hi!HI!hi!                             hi!hi!hi!                             hi!hi!");
    }

    @Test
    public void test09183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09183");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("                         HI!hi!HI!                             HI!HI!HI!                             HI!HI", 291);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                         HI!hi!HI!                             HI!HI!HI!                             HI!HI" + "'", str2, "                         HI!hi!HI!                             HI!HI!HI!                             HI!HI");
    }

    @Test
    public void test09184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09184");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                    " + "'", str1, "                                                                                                    ");
    }

    @Test
    public void test09185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09185");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "hi!ih       !ih       !ih    ...#...", (java.lang.CharSequence) "!IHHIHI!!IHHI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09186");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("Hi!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!Hi!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!Hi!hi!hi!hi!hi!hi!hi!hi!h...", "...          ", "Hi!hi!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hi!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!Hi!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!Hi!hi!hi!hi!hi!hi!hi!hi!h..." + "'", str3, "Hi!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!Hi!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!Hi!hi!hi!hi!hi!hi!hi!hi!h...");
    }

    @Test
    public void test09187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09187");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "   hi!           H", 20, 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09188");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "hi!!ihhi!!ihhi!!ihhi!!ih!!!!!!!!!!!!!!!!!!!!!!!!!!ihhi!######################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09189");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("!    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !", 26);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !" + "'", str2, "    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !");
    }

    @Test
    public void test09190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09190");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("####################################################################################################", '#');
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("HI!", "hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444", (-1));
        java.lang.Class<?> wildcardClass8 = strArray7.getClass();
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator(" ", "                                                !IH                                                ", (int) 'a');
        java.lang.Class<?> wildcardClass13 = strArray12.getClass();
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!", "       hi!");
        java.lang.Class<?> wildcardClass17 = strArray16.getClass();
        java.lang.String[] strArray19 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        java.lang.Class<?> wildcardClass20 = strArray19.getClass();
        java.lang.reflect.Type[] typeArray21 = new java.lang.reflect.Type[] { wildcardClass3, wildcardClass8, wildcardClass13, wildcardClass17, wildcardClass20 };
        java.lang.reflect.Type[][] typeArray22 = new java.lang.reflect.Type[][] { typeArray21 };
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(typeArray22);
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) typeArray22, '#', 173, 0);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "HI" });
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { " " });
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" });
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test09191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09191");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "hi!");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, '#');
        boolean boolean9 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "!!!!!!!!!!!!!!!!!!!!!!!", (java.lang.CharSequence[]) strArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test09192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09192");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat('#', 119);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#######################################################################################################################" + "'", str2, "#######################################################################################################################");
    }

    @Test
    public void test09193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09193");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) " hi! hi!hi!hi!hi!hi!   hi!    hi!hi!hi!hi!!", 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09194");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "   hi!HI!                             hi!                             hi!  HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09195");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) " ...                       HI!!IH                                       HI!!IH       HI!!IH       ...", "!IH                         HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09196");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith(charSequence0, charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test09197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09197");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!!ih hi!!ih hi!!ih hi!!ih hi!!ih", "HI!IH       !IH       !IH       !IH       !IH       !IH       !IH       ", 286);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi", "", "ih", "hi", "", "ih", "hi", "", "ih", "hi", "", "ih", "hi", "", "ih" });
    }

    @Test
    public void test09198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09198");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" + "'", str1, "!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
    }

    @Test
    public void test09199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09199");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                                hi!    ", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                hi!    " + "'", str2, "                                hi!    ");
    }

    @Test
    public void test09200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09200");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("       #hi#!#hi#!#hi#!#hi#!!!!!!!!!!!!!!!!!!!!!!!!!!#hi#!!#ih#              #hi#!#hi#!#hi#!#hi#!!!!!!!!!!!!!!!!!!!!!!!!!!#hi#!!#ih#       #hi#!!#ih#              #hi#!!#ih#       #!!!!!!!!!!!!!!!!!!!!!!!!!!#ih#       #hi#!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "       #hi#!#hi#!#hi#!#hi#!!!!!!!!!!!!!!!!!!!!!!!!!!#hi#!!#ih#              #hi#!#hi#!#hi#!#hi#!!!!!!!!!!!!!!!!!!!!!!!!!!#hi#!!#ih#       #hi#!!#ih#              #hi#!!#ih#       #!!!!!!!!!!!!!!!!!!!!!!!!!!#ih#       #hi#!" + "'", str1, "       #hi#!#hi#!#hi#!#hi#!!!!!!!!!!!!!!!!!!!!!!!!!!#hi#!!#ih#              #hi#!#hi#!#hi#!#hi#!!!!!!!!!!!!!!!!!!!!!!!!!!#hi#!!#ih#       #hi#!!#ih#              #hi#!!#ih#       #!!!!!!!!!!!!!!!!!!!!!!!!!!#ih#       #hi#!");
    }

    @Test
    public void test09201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09201");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "44444444444444444444444444444444HI!44444444444444444444444444444hi!44444444444444444444444444444hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ", (java.lang.CharSequence) "Hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 822 + "'", int2 == 822);
    }

    @Test
    public void test09202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09202");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("hi!!ih                                hi!!ih                                hi!!ih                                hi!!ih                                       hi!!ih      ", "                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!!ih" + "'", str2, "hi!!ih");
    }

    @Test
    public void test09203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09203");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("!IH                         hi!        ", "!!!!!!!!!!!!!!!!!!!!!!!!", 1);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "                                hi!");
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "hiHI!HI!HI!", (java.lang.CharSequence[]) strArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '#', 17, 34);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 17 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "IH                         hi!        " });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "IH" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test09204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09204");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("... hi!!ih hi!!ih hi!!ih ...       ", "hi!           HI###################################################...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "... hi!!ih hi!!ih hi!!ih ...       " + "'", str2, "... hi!!ih hi!!ih hi!!ih ...       ");
    }

    @Test
    public void test09205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09205");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "HI!    hi!!ih       HI!!IH44444444444444444444444444444444HI!!IH44444444444444444444444444444444HI!!IH44444444444444444444444444444444HI!!IH444444444444444444444444444444444444444HI!!IH4444444HI!!ih       HI!!IH44444444444444444444444444444444HI!!IH44444444444444444444444444444444HI!!IH4444444444444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09206");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "HI!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "i!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 207 + "'", int2 == 207);
    }

    @Test
    public void test09207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09207");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str1, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test09208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09208");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("hi!                                  HI!                             HI!                             !", "!hi!hi!!hi!!hi!!ih              hi!h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!                                  HI!                             HI!                             !" + "'", str2, "hi!                                  HI!                             HI!                             !");
    }

    @Test
    public void test09209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09209");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("   HI ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI" + "'", str1, "HI");
    }

    @Test
    public void test09210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09210");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) " !ih                             !ih                             !ih                                IH                                ", (java.lang.CharSequence) "4444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09211");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("               HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "               HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! " + "'", str1, "               HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! ");
    }

    @Test
    public void test09212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09212");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "HI!HI!HI!HI                                HI                                HI!                             HI!                             HI!                                 HI                                HI!                             HI!                             HI!                                 HI                                HI!                             HI!                             HI!                                 HI                                HI!                             HI!                             HI!                                 HI                                HI!                             HI!                             HI! !HI!", (java.lang.CharSequence) "#hi#!#hi#!#hi#!#hi#!!!!!!!!!!!!!!!!!!!!!!!!!!#hi#!!#ih#HI#hi#!!#ih##!!!!!!!!!!!!!!!!!!!!!!!!!!#ih##hi#!...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09213");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("HI!hiHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hihi!!" + "'", str1, "hi!hihi!!");
    }

    @Test
    public void test09214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09214");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "...                       ", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 207);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09215");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "!IHHIHI!!IHH", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaahi!hi!hi!hi!   hi!    hi!hi!hi!hi!!", 690);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09216");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "HI hi HI HI HI HI HI HI", (java.lang.CharSequence) "!IHHI!", 161);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09217");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("hI!hI!hI!hI!hI!hI!hI!hI!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hI!hI!hI!hI!hI!hI!hI!hI!h" + "'", str1, "hI!hI!hI!hI!hI!hI!hI!hI!h");
    }

    @Test
    public void test09218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09218");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate(" ", 51);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " " + "'", str2, " ");
    }

    @Test
    public void test09219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09219");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("!HI!                             !                             !  HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!HI!                             !                             !  HI!" + "'", str1, "!HI!                             !                             !  HI!");
    }

    @Test
    public void test09220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09220");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    ", (int) (byte) -1, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    " + "'", str3, "                                    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    ");
    }

    @Test
    public void test09221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09221");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType(" !ih       !ih                                ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { " ", "!", "ih", "       ", "!", "ih", "                                " });
    }

    @Test
    public void test09222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09222");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("HI!!IH       !IH       !IH       !IH       !IH       !IH       !IH       !IH       !IH       !IH       !IH       !IH       !IH       !IH       !IH       !IH       !IH       !IH       !IH       !IH######################################################################################", "                   ", " hI!hI!hI!hI!hI!hI!hI!hI!hI                                                            ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test09223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09223");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaih            hi!HI!hi!                             hi!hi!hi!                             hi!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09224");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("hi#!#ih#       #!#ih#       #!#ih#       #!#ih#       #!#ih#       #!#ih#       #!#ih", 28, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi#!#ih#       #!#ih#       #!#ih#       #!#ih#       #!#ih#       #!#ih#       #!#ih" + "'", str3, "hi#!#ih#       #!#ih#       #!#ih#       #!#ih#       #!#ih#       #!#ih#       #!#ih");
    }

    @Test
    public void test09225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09225");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "!IH  !             ...", (java.lang.CharSequence) "#########################################################################################...#########################################################################################...#########################################################################################...######################################################################################!ihhi!ihhi!", 31);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09226");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp(".                             hi!..                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".                             hi!..                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         " + "'", str1, ".                             hi!..                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
    }

    @Test
    public void test09227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09227");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "                                hi!  hi!           HI!                                hi!  hi!           HI!hi!  hi!           HI!       hi!  hi!           HI!!!!!!!!!!!!!!!!!!!!!!!!!!  hi!           HI!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09228");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!", 127);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!h" + "'", str2, "hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!h");
    }

    @Test
    public void test09229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09229");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "                                hi", (java.lang.CharSequence) "hi!hihi!!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09230");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("HIhhhhhhhhhh                      hi!!IHHI!                                       !IHHI!       !IHHI!              !IHHI!       HHHHHHHHHHHHHHHHHHHHHHHHHHI!       !IH!hhhhhhhhhh                      hi!!IHHI!                                       !IHHI!       !IHHI!              !IHHI!       HHHHHHHHHHHHHHHHHHHHHHHHHHI!       !IH        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HIhhhhhhhhhh                      hi!!IHHI!                                       !IHHI!       !IHHI!              !IHHI!       HHHHHHHHHHHHHHHHHHHHHHHHHHI!       !IH!hhhhhhhhhh                      hi!!IHHI!                                       !IHHI!       !IHHI!              !IHHI!       HHHHHHHHHHHHHHHHHHHHHHHHHHI!       !IH" + "'", str1, "HIhhhhhhhhhh                      hi!!IHHI!                                       !IHHI!       !IHHI!              !IHHI!       HHHHHHHHHHHHHHHHHHHHHHHHHHI!       !IH!hhhhhhhhhh                      hi!!IHHI!                                       !IHHI!       !IHHI!              !IHHI!       HHHHHHHHHHHHHHHHHHHHHHHHHHI!       !IH");
    }

    @Test
    public void test09231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09231");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "...4444444444444444444444...44444444444444444444444444444444...4444444444444444444444...4444444444444444444444444...4444444444444444444444...4444444444444444444444444...4444444444444444444444...4444444444444444444444444...4444444444444444444444..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09232");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!Hi!hi!hi!hi!hi!hi!hi!hi!hi!!", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09233");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "      #", 46, 42);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa      #aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str4, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa      #aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test09234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09234");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!                  ", "                                                                                                !                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!                  " + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!                  ");
    }

    @Test
    public void test09235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09235");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "hi! hi! hi! HI", (java.lang.CharSequence) "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh##############################", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09236");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("...  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...  " + "'", str1, "...  ");
    }

    @Test
    public void test09237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09237");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Hi!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!Hi!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!Hi!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "Hi!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!Hi!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!Hi!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" });
    }

    @Test
    public void test09238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09238");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09239");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                             HI", "hi!ih!ih!ih!ih!ih!ih!ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                             HI" + "'", str2, "                             HI");
    }

    @Test
    public void test09240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09240");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("!!!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!!!!!" + "'", str1, "!!!!!");
    }

    @Test
    public void test09241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09241");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "                                                                          !!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09242");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "!!HI!!IH              HI!H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09243");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                ", "       HI!                            HI!           ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                " + "'", str2, "                ");
    }

    @Test
    public void test09244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09244");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("44444444444", 30, 286);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444" + "'", str3, "44444444444");
    }

    @Test
    public void test09245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09245");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "!ihhhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09246");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("##########hi!HI!####################################################################################", "HI!IH!IH!IH!IH!IH!IH!IH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##########hi!HI!####################################################################################" + "'", str2, "##########hi!HI!####################################################################################");
    }

    @Test
    public void test09247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09247");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("!    ", "...                                                                        !IH                         hi!", 177);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "!    " });
    }

    @Test
    public void test09248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09248");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "!IHHI!                         ...", (java.lang.CharSequence) "                                                                                     hiHI!HI!HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09249");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("HI!!IH                                       HI!!IH       HI!!IH              HI!!IH       !!!!!!!!!!!!!!!!!!!!!!!!!!IH       HI", "!IH                         hi!                                                                ", 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test09250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09250");
        java.lang.CharSequence charSequence6 = null;
        char[] charArray10 = new char[] {};
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "!!!!!!!!!!!!!!!!!!!!!!!!!", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                hi!", charArray10);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "       hi!", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence6, charArray10);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                hi!!ih                                       hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!", charArray10);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "!!!!!!!!!!!!!!!!!!!!!!!!!", charArray10);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444HI!44444444444444444444444444444hi!44444444444444444444444444444hi!", charArray10);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "HI!HI!HI!", charArray10);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I", charArray10);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "  ;   ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test09251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09251");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                                                                                                              !    !    !  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                              !    !    !  " + "'", str1, "                                                                                                              !    !    !  ");
    }

    @Test
    public void test09252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09252");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("hi!hi!hi!4hi!hi", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hhhhhhhh                       HI  hi!Ih!hi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!hi!hi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!hi!44444444444444444444444444444444444444444444444444444444444444444444444                         HI                                HI!                             HI!                             HI!                               44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hhhhhhhh                       HI  hi!Ih!hi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!hi!hi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!hi!444444444444444444444444444444444444444444444444444444444444444444444444", "hhhhhhhhhh ...       hi!!ih       hi!!ih                                       hi!!ih                       ...hhhhhhhhhh h");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!4hi!hi" + "'", str3, "hi!hi!hi!4hi!hi");
    }

    @Test
    public void test09253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09253");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("HI hi HI HI HI HI HI HI", "   hi!    ", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HIHIHIHIHIHIHI" + "'", str3, "HIHIHIHIHIHIHI");
    }

    @Test
    public void test09254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09254");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test09255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09255");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "HI! HI!", (java.lang.CharSequence) "!!                                           !!                                    !!                                    !!                                    !!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09256");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                         hi!ih       !ih       !ih       !ih       !ih       !ih       !ih       ", "!ih hi!!ih ...");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#################################################################################################" + "'", str4, "#################################################################################################");
    }

    @Test
    public void test09257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09257");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "########################", (java.lang.CharSequence) "hi! hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09258");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) " hI!hI!hI!hI!hI!hI!hI!hI!hI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09259");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "ih                           ", (java.lang.CharSequence) "                                HI", 274);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
    }

    @Test
    public void test09260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09260");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("hi! hi! HI!!ih", 42, "       hi                         ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       hi                   hi! hi! HI!!ih" + "'", str3, "       hi                   hi! hi! HI!!ih");
    }

    @Test
    public void test09261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09261");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!" + "'", str1, "hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!");
    }

    @Test
    public void test09262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09262");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("HI!        ######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!        ######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str2, "HI!        ######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test09263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09263");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                4HI4!!4IH4       4HI4!!4IH4              4HI4!!4IH4       4!!!!!!!!!!!!!!!!!!!!!!!!!!4IH4       4HI4!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test09264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09264");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hHI!###########################################################################################################################################################hi!HI!hi!hi!hi!hi!hi!hi!##################################################################################################################!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!", (java.lang.CharSequence) "... hi!!ih hi!!ih hi!!ih ... ... hi!!ih hi!!ih hi!!ih ... ... hi!!ih hi!!ih hi!!ih ... ... hi!!ih hi!!ih hi!!ih ... ... hi!!ih hi!!ih hi!!ih ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09265");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("       hi                   hi! hi! HI!!ih", "###########################################################################################################################################!hi!hi!############################################################################################################################################", "    ...   444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       hi                   hi! hi! HI!!ih" + "'", str3, "       hi                   hi! hi! HI!!ih");
    }

    @Test
    public void test09266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09266");
        char[] charArray6 = new char[] {};
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "!!!!!!!!!!!!!!!!!!!!!!!!!", charArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!   hi!    hi!hi!hi!hi!!", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                           hi", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "  hi!           HI!", charArray6);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!                         hi!                         hi!                         hi!                                hi!", charArray6);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "4444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih4444444hi!!ih444444444444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ihIH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih4444444hi!!ih444444444444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test09267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09267");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "HI! HI! HI! ", (java.lang.CharSequence) "ih                         hi!        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09268");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "       HI!       HI!       HI!       HI!       HI!       HI!       HI!IH                         ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 97 + "'", int1 == 97);
    }

    @Test
    public void test09269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09269");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("hI!hI!hI!hI!hI!hI!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!Hi!Hi!Hi!Hi!Hi!H" + "'", str1, "Hi!Hi!Hi!Hi!Hi!Hi!H");
    }

    @Test
    public void test09270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09270");
        char[] charArray3 = new char[] {};
        boolean boolean4 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "                         hi!", charArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray3);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test09271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09271");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("  !!                                    !!                                    !!                                    !!                                           !!  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                             hi!                                                                    ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "  !!                                    !!                                    !!                                    !!                                           !!  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test09272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09272");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("44444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444" + "'", str1, "4444444444444444444444444444444");
    }

    @Test
    public void test09273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09273");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("                     hi! hi!hi!", "!ih HI! !ih HI! !ih HI! !ih HI! !ih HI! !ih HI! !ih HI! !ih HI! !ih HI! !ih HI! !ih HI! !ih HI! !ih HI! !ih HI! !ih HI! !ih HI! !ih HI! !ih HI! !ih HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09274");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("hi!HI!", "44444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!HI!" + "'", str2, "hi!HI!");
    }

    @Test
    public void test09275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09275");
        char[] charArray6 = new char[] {};
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "                         hi!", charArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HIhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "   ", charArray6);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "ang.String;class [Ljava.lang.String;", charArray6);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "!ih hhhhhhhhhh", charArray6);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hI!!IHhi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444hi!!IHhi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444hi", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test09276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09276");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("Hi!       !iHHHHHHHHHHHHHHHHHHHHHHHHHH       !iHHi!              !iHHi!       !iHHi!                                       !iHHi!   ", 1, "IH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hi!       !iHHHHHHHHHHHHHHHHHHHHHHHHHH       !iHHi!              !iHHi!       !iHHi!                                       !iHHi!   " + "'", str3, "Hi!       !iHHHHHHHHHHHHHHHHHHHHHHHHHH       !iHHi!              !iHHi!       !iHHi!                                       !iHHi!   ");
    }

    @Test
    public void test09277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09277");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence0, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09278");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("iH", 272, "ciHIcicicicicici");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "iHciHIciciciciciciciHIciciciciciciciHIciciciciciciciHIciciciciciciciHIciciciciciciciHIciciciciciciciHIciciciciciciciHIciciciciciciciHIciciciciciciciHIciciciciciciciHIciciciciciciciHIciciciciciciciHIciciciciciciciHIciciciciciciciHIciciciciciciciHIciciciciciciciHIcicicicici" + "'", str3, "iHciHIciciciciciciciHIciciciciciciciHIciciciciciciciHIciciciciciciciHIciciciciciciciHIciciciciciciciHIciciciciciciciHIciciciciciciciHIciciciciciciciHIciciciciciciciHIciciciciciciciHIciciciciciciciHIciciciciciciciHIciciciciciciciHIciciciciciciciHIciciciciciciciHIcicicicici");
    }

    @Test
    public void test09279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09279");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                         HI hi HI                              HI HI HI                              HI HI", "                           ", (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '4', 0, 64);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                         HI hi HI", "   HI HI HI", "   HI HI" });
    }

    @Test
    public void test09280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09280");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "Hi!                         hi!                         hi!                         hi!       ", (java.lang.CharSequence) "IH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09281");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "hI!!IHhi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444hi!!IHhi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444hi", 0, 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09282");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "hi!hi!hi!4hi!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09283");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!!ih                                hi!!ih                                hi!!ih                                hi!!ih                                       hi!!ih                             HI                                HI!                             HI!                             HI! ", "!ih       HI!                                      ");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "... hi##ih hi##ih hi##ih ...                         ... hi##ih hi##ih hi##ih ...                         ... hi##ih hi##ih hi##ih ...                         ... hi##ih hi##ih hi##ih ...                                ... hi##ih hi##ih hi##ih ...", (java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!!ih                                hi!!ih                                hi!!ih                                hi!!ih                                       hi!!ih                             HI                                HI!                             HI!                             HI! " });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test09284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09284");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                                                                              !    !    !  ", ' ', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##############################################################################################################!####!####!##" + "'", str3, "##############################################################################################################!####!####!##");
    }

    @Test
    public void test09285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09285");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("                      hi############################################################################", "hhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                      hi############################################################################" + "'", str2, "                      hi############################################################################");
    }

    @Test
    public void test09286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09286");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "hi!ih!ih!ih!ih!ih!ih!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09287");
        char[] charArray8 = new char[] {};
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "!!!!!!!!!!!!!!!!!!!!!!!!!", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "       hi!", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", charArray8);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "..        ", charArray8);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "####################################################################################################", charArray8);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "  ;   ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray8);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                HI", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test09288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09288");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("                                                                                                                                                                                                                                                                                                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                        " + "'", str1, "                                                                                                                                                                                                                                                                                                        ");
    }

    @Test
    public void test09289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09289");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444" + "'", str1, "444444444444444444444444444444");
    }

    @Test
    public void test09290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09290");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###############################################################################################" + "'", str1, "###############################################################################################");
    }

    @Test
    public void test09291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09291");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("                         ", "IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I            ", "....  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                         " + "'", str3, "                         ");
    }

    @Test
    public void test09292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09292");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "4444444444444444444444444444444444444444!44444444444444444444444444444444444444444", (java.lang.CharSequence) "##############################################################################################################################################################", 875);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09293");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "hi!ih!ih!ih...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09294");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("....  ", "                         HI hi HI                              HI HI HI                              HI HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "....  " + "'", str2, "....  ");
    }

    @Test
    public void test09295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09295");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "################################################################################################!!!!       HI!  ", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09296");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("... HI!!IH HI!!IH HI!!IH ...       ", "...       hi!!ih       hi!!ih   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "... HI!!IH HI!!IH HI!!IH ...       " + "'", str2, "... HI!!IH HI!!IH HI!!IH ...       ");
    }

    @Test
    public void test09297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09297");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "                                H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09298");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("                      hi!", " !ih       !ih                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                      hi!" + "'", str2, "                      hi!");
    }

    @Test
    public void test09299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09299");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "!ih                                                                                     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09300");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "...       hi!!ih       hi!!ih                                       hi!!ih                       ...", (java.lang.CharSequence) "    HI!  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09301");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("  !!                                    !!                                    !!                                    !!                                           !!  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "################################################################################################!!!!HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  !!                                    !!                                    !!                                    !!                                           !!  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "  !!                                    !!                                    !!                                    !!                                           !!  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test09302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09302");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                                                                                                        !iHHi! ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "                                                                                                                        ", "!", "i", "H", "Hi", "!", " " });
    }

    @Test
    public void test09303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09303");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("HI", "          !iHHi! ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI" + "'", str2, "HI");
    }

    @Test
    public void test09304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09304");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("!ih       HI!                                       ");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "!", "ih", "       ", "HI", "!", "                                       " });
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!", "ih", "", "HI", "!", "" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test09305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09305");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("ih", "44444444444444444444444hi!44444444444444444444444444444hi!44444444444444444444444444444hi!4", "       #HI#");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ih" + "'", str3, "ih");
    }

    @Test
    public void test09306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09306");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                            hi!hi!hi!                             hi!hi", "a");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "...HI");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                            hi!hi!hi!                             hi!hi" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                            hi!hi!hi!                             hi!hi" + "'", str4, "                            hi!hi!hi!                             hi!hi");
    }

    @Test
    public void test09307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09307");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!!ih                                hi!!ih                                hi!!ih                                hi!!ih                                       hi!!ih       ", (java.lang.CharSequence) "                                !                             HI!                             HI! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09308");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("I!hI!hI!hI!hI!hI!hI!hI!hIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) 'a', 24);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test09309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09309");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "hi!ih       !ih       !ih    ...#######");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09310");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("HI!!IH       hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444hi!!IH       hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih4444444444444...", "!IH                         hi!        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!!IH       hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444hi!!IH       hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih4444444444444..." + "'", str2, "HI!!IH       hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444hi!!IH       hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih4444444444444...");
    }

    @Test
    public void test09311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09311");
        java.lang.CharSequence charSequence1 = null;
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "hi!");
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny(charSequence1, (java.lang.CharSequence[]) strArray3);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.split("                                                                                                 hi!", "!ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       ", 96);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                                                                                 HI!", strArray3, strArray10);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray10, "HI!HI!HI!HI!HI!HI!HI!HI!HI");
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray10, "!IHHI!", (int) ' ', 8);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                                                                                                 HI!" + "'", str11, "                                                                                                 HI!");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test09312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09312");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("44444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444" + "'", str1, "44444444444");
    }

    @Test
    public void test09313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09313");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("Hi!       !iHHHHHHHHHHHHHHHHHHHHHHHHHH       !iHHi!              !iHHi!       !iHHi!                                       !iHHi!   ", "   hi!           HI!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "Hi!       !iHHHHHHHHHHHHHHHHHHHHHHHHHH       !iHHi!              !iHHi!       !iHHi!                                       !iHHi!   " });
    }

    @Test
    public void test09314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09314");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hhhhhhhhhh hi!", "!!          HI!    !!                                    !!                                    !!                                           !!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test09315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09315");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "i!ahi!ahi!ahi!a!!!!!!!!!!!!!!!!!!!!!!!!!ahi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09316");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "IH                         ", (java.lang.CharSequence) "HI!                             hi!                             hi! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09317");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("hi! HI!", "!HI!                             !                             !  HI!", "       HI!       HI!       HI!       HI!       HI!       HI!       HI!IH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! HI!" + "'", str3, "hi! HI!");
    }

    @Test
    public void test09318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09318");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "...       ", 201);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
    }

    @Test
    public void test09319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09319");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center(".....................................................................................................................         HI!IH ", 86);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".....................................................................................................................         HI!IH " + "'", str2, ".....................................................................................................................         HI!IH ");
    }

    @Test
    public void test09320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09320");
        java.lang.String[] strArray0 = null;
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray0, "                      HI!                             HI!                           ...");
        org.junit.Assert.assertNull(strArray2);
    }

    @Test
    public void test09321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09321");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!                             hi!                             hi!", "                                                                                                !                                                                                                    ", "###########################################################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!                             hi!                             hi!" + "'", str3, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!                             hi!                             hi!");
    }

    @Test
    public void test09322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09322");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("HIhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HIhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "HIhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test09323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09323");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I", "       hi                         ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I" });
    }

    @Test
    public void test09324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09324");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("#######hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih##############hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih#######hi!!ih##############hi!!ih#######!!!!!!!!!!!!!!!!!!!!!!!!!!ih#######hi!", "hi!HI!                             hi!                             hi!  HI!                hi!HI!hi!                             hi!hi!hi!                             hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#######hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih##############hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih#######hi!!ih##############hi!!ih#######!!!!!!!!!!!!!!!!!!!!!!!!!!ih#######hi!" + "'", str2, "#######hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih##############hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!!ih#######hi!!ih##############hi!!ih#######!!!!!!!!!!!!!!!!!!!!!!!!!!ih#######hi!");
    }

    @Test
    public void test09325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09325");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "hhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhh", 14);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09326");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "   hi!HI!                             hi!                             hi!  HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09327");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!!ih                                hi!!ih                                hi!!ih                                hi!!ih                                       hi!!ih                             HI                                HI!                             HI!                             HI! ", (java.lang.CharSequence) "      #");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09328");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", "                                HI                                HI!                             HI!                             HI! ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test09329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09329");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("                                                                                                                                                                                                                                                                                                        ", "HI!HI!HI!hi                                                                     !IH                         hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                        " + "'", str2, "                                                                                                                                                                                                                                                                                                        ");
    }

    @Test
    public void test09330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09330");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("IhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIh", "  HI!           hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIh" + "'", str2, "IhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIh");
    }

    @Test
    public void test09331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09331");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Aaaaaaaaaaaaaaaa", "hi!ih       !ih       !ih       !ih       !ih       !ih       !ih                                ", 687);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "Aaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "Aaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test09332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09332");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hI!hI!hI!hI!hI!hI!hI!hI!hIaAAAAAAA", "HIhi!hi!hi!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aAAAAAAA" });
    }

    @Test
    public void test09333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09333");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("hi!!ih                                       hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!!ih                                       hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi" + "'", str2, "hi!!ih                                       hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi");
    }

    @Test
    public void test09334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09334");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("                                hi                                        hi                                        hi        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "        ih                                        ih                                        ih                                " + "'", str1, "        ih                                        ih                                        ih                                ");
    }

    @Test
    public void test09335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09335");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "hI!hI!hI!hI!hI!hI!hI!hI!hIaAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09336");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("Hi!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!Hi!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!Hi!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (int) (short) 100, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hi!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!Hi!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!Hi!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "Hi!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!Hi!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!Hi!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test09337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09337");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                  hi!       !ihhhhhhhhhhhhhhhhhhhhhhhhhh       !ihhi!              !ihhi!       !ihhi!                                                                                                       ", "!", 830);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                                                                                  hi", "       ", "ihhhhhhhhhhhhhhhhhhhhhhhhhh       ", "ihhi", "              ", "ihhi", "       ", "ihhi", "                                                                                                       " });
    }

    @Test
    public void test09338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09338");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "#######################################################################################################################", (java.lang.CharSequence) "!ih                             !ih                             !ih                                IH                                ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09339");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!hi!", "...!ih...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09340");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence3 = null;
        char[] charArray10 = new char[] {};
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "                         hi!", charArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "HI!IH       !IH       !IH       !IH       !IH       !IH       !IH", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                hi!!ih                                       hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi!", charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "!ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       ", charArray10);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hI!", charArray10);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence3, charArray10);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "IH    IH", charArray10);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "h", charArray10);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsAny(charSequence0, charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test09341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09341");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "... hi!!ih hi!!ih hi!!ih ... ... hi!!ih hi!!ih hi!!ih ... ... hi!!ih hi!!ih hi!!ih ... ... hi!!ih hi!!ih hi!!ih ... ... hi!!ih hi!!ih hi!!ih ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 71, 687);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09342");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("hi!HI!                             hi!                             hi!  HI!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!HI!                             hi!                             hi!  HI!" + "'", str2, "hi!HI!                             hi!                             hi!  HI!");
    }

    @Test
    public void test09343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09343");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!                  ", 206);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                             !hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!                  " + "'", str2, "                                                             !hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!                  ");
    }

    @Test
    public void test09344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09344");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "... hi!!ih hi!!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09345");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) " hi! hi!hi!hi!hi!hi!   hi!    hi!hi!hi!hi!!", (java.lang.CharSequence) ".                             hi!..                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ", 88);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09346");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih4444444444444...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444hi!!IH HI!!IH hi! I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09347");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("aaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAA" + "'", str1, "AAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test09348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09348");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!..." + "'", str1, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!...");
    }

    @Test
    public void test09349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09349");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("########################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "########################" + "'", str1, "########################");
    }

    @Test
    public void test09350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09350");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("HIhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "HI!HI!HI!", "hi!hi!hi!hi!!!!!!!!!!!!!!!                                       ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HIhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "HIhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test09351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09351");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "444444444444444444444444444444444HI4!4444444444444444444444444444444hi4!4444444444444444444444444444444hi4!44", (java.lang.CharSequence) "hi! hi! HI!!ih");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 104 + "'", int2 == 104);
    }

    @Test
    public void test09352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09352");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", (int) (byte) 10, "...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" + "'", str3, "I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
    }

    @Test
    public void test09353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09353");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "hi#!#ih#       #!#ih#       #!#ih#       #!#ih#       #!#ih#       #!#ih#       #!#ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09354");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp(" !ih       !ih                                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " !ih       !ih                                " + "'", str1, " !ih       !ih                                ");
    }

    @Test
    public void test09355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09355");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("...!IHhi!", "hi!!ihhi!!ihhi!!ihhi!!ihhi!!ihHIHI!HI!HI!", 30);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "..." });
    }

    @Test
    public void test09356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09356");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                                                                                     hi!", (java.lang.CharSequence) "                       HI  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09357");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                                4HI4!!4IH4                                       4HI4!!4IH4       4HI4!!4IH4              4HI4!!4IH4       4!!!!!!!!!!!!!!!!!!!!!!!!!!4IH4       4HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4HI4!!4IH4                                       4HI4!!4IH4       4HI4!!4IH4              4HI4!!4IH4       4!!!!!!!!!!!!!!!!!!!!!!!!!!4IH4       4HI" + "'", str1, "4HI4!!4IH4                                       4HI4!!4IH4       4HI4!!4IH4              4HI4!!4IH4       4!!!!!!!!!!!!!!!!!!!!!!!!!!4IH4       4HI");
    }

    @Test
    public void test09358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09358");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "hi! hi!!ihhi!                         ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09359");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("HI!hi!hi!hi!hi!hi!hi!", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", 31, 26);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HI!hi!hi!hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str4, "HI!hi!hi!hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test09360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09360");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "#hi#!#hi#!#hi#!#hi#!!!!!!!!!!!!!!!!!!!!!!!!!!#hi#!!#ih# HI  #hi#!!#ih#       #!!!!!!!!!!!!!!!!!!!!!!!!!!#ih#       #hi#!    ...", (java.lang.CharSequence) "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", 17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09361");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "4444444444444444444444444444444444444444!    44444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09362");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("!ih HI! !ih HI! !ih HI! !ih HI! !ih HI! !ih HI! !ih HI! !ih HI! !ih HI! !ih HI! !ih HI! !ih HI! !ih HI! !ih HI! !ih HI! !ih HI! !ih HI! !ih HI! !ih HI", "!ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI! !ih                         HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09363");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("                                                                                                                                      ...   444                                                                                                                                   ", "hhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhh", "                                                                                                                                                                                                                                                                                              ", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                                                                                      ...   444                                                                                                                                   " + "'", str4, "                                                                                                                                      ...   444                                                                                                                                   ");
    }

    @Test
    public void test09364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09364");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("h4!4h!4h!4h!4h!4h!4h4       4HI4!!4IH4              4HI4!!4IH4       4!!!!!!!!!!!!!!!!!!!!!!!!!!4IH4       4HI4!", "!ihhi!                         ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h4!4h!4h!4h!4h!4h!4h4       4HI4!!4IH4              4HI4!!4IH4       4!!!!!!!!!!!!!!!!!!!!!!!!!!4IH4       4HI4!" + "'", str2, "h4!4h!4h!4h!4h!4h!4h4       4HI4!!4IH4              4HI4!!4IH4       4!!!!!!!!!!!!!!!!!!!!!!!!!!4IH4       4HI4!");
    }

    @Test
    public void test09365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09365");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("4444444444444444444444444444444444444444444444444444444444                         hi!HI!hi!                             hi!hi!hi!                             hi!hi!44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444444444444444444                         hi!HI!hi!                             hi!hi!hi!                             hi!hi!44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "4444444444444444444444444444444444444444444444444444444444                         hi!HI!hi!                             hi!hi!hi!                             hi!hi!44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test09366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09366");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa..", "444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.." + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa..");
    }

    @Test
    public void test09367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09367");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "hhi!                     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09368");
        java.lang.CharSequence[] charSequenceArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "                         hi!", charSequenceArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09369");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence) "#hi#! #!!!!!!!!!!!!!!!!!!!!!!!!!!#ih# #hi#!!#ih# #hi#!!#ih# #hi#!#hi#!#hi#!#hi#!!!!!!!!!!!!!!!!!!!!!!!!!!#hi#!!#ih# #hi#!#hi#!#hi#!#hi#!!!!!!!!!!!!!!!!!!!!!!!!!!#hi#!!#ih#", 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09370");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("hi!hi!hi!hi!!!!!!!!!!!!!!!                                       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!hi!!!!!!!!!!!!!!!                                      " + "'", str1, "hi!hi!hi!hi!!!!!!!!!!!!!!!                                      ");
    }

    @Test
    public void test09371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09371");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hI! hi! hi!", 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hI! hi! hi!" });
    }

    @Test
    public void test09372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09372");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("HIhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", ' ', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HIhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "HIhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test09373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09373");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                          ...!ih...", 98);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09374");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp(" HI!HI!HI!HI!HI!HI!HI!HI!HI                                                            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " HI!HI!HI!HI!HI!HI!HI!HI!HI                                                            " + "'", str1, " HI!HI!HI!HI!HI!HI!HI!HI!HI                                                            ");
    }

    @Test
    public void test09375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09375");
        java.lang.CharSequence charSequence1 = null;
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "                                HI!                             hi!                             hi!                                 HI!                             hi!                             hi!                                 HI!                             hi!                             ", charSequence1, 161);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09376");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty(charSequence0, (java.lang.CharSequence) "I!hI!hI!h");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "I!hI!hI!h" + "'", charSequence2, "I!hI!hI!h");
    }

    @Test
    public void test09377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09377");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hi!HI", '4');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!HI" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!HI" + "'", str4, "hi!HI");
    }

    @Test
    public void test09378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09378");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "", 133);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09379");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                             HI!", 685);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          HI!" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          HI!");
    }

    @Test
    public void test09380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09380");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "44444444444444444444444                                                                                                 hi4");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09381");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat('a', 579);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test09382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09382");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "                                4hi4!!4ih4                                       4hi4!!4ih4       4hi4!!4ih4              4hi4!!4ih4       4!!!!!!!!!!!!!!!!!!!!!!!!!!4ih4       4hi4!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09383");
        java.lang.CharSequence charSequence0 = null;
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                             hi!", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray6, "HIhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        int int9 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "   hi!           HI!", (java.lang.CharSequence[]) strArray8);
        int int11 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "...  ", (java.lang.CharSequence[]) strArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.startsWithAny(charSequence0, (java.lang.CharSequence[]) strArray8);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "                             hi!" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "i!" });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test09384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09384");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("HI!hi!                             hi!hi!hi!                             hi!hi", "4!ih44444444444444444444444444444!ih44444444444444444444444444444!IH44444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!hi!                             hi!hi!hi!                             hi!hi" + "'", str2, "HI!hi!                             hi!hi!hi!                             hi!hi");
    }

    @Test
    public void test09385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09385");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "... hi!!ih hi!!ih hi!!ih ...                         ... hi!!ih hi!!ih hi!!ih ...                         ... hi!!ih hi!!ih hi!!ih ...                         ... hi!!ih hi!!ih hi!!ih ...                                ... hi!!ih hi!!ih hi!!ih ...", (java.lang.CharSequence) "...                               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09386");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444", "A444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444" + "'", str2, "hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih444444444444444444444444444444444444444hi!!ih4444444");
    }

    @Test
    public void test09387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09387");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("                                                                                                 ", "444444444444444444444444", 133, 6);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "      444444444444444444444444" + "'", str4, "      444444444444444444444444");
    }

    @Test
    public void test09388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09388");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "Hi!Hi!Hi!Hi!Hi!Hi!H", "       #HI#       #HI#       #HI#       #HI#       #HI#       #HI# Hi!ih       !ih       !ih    ...#######       #HI#       #HI#       #HI#       #HI#       #HI#       #HI# ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09389");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "  HI!########################################################", "!!                                           !!                                    !!                                    !!                                    !!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09390");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("#################################################################", "###################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09391");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("         ...4444 hI!hI!hI!hI!hI!hI!hI!hI!hI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "         ...4444 hI!hI!hI!hI!hI!hI!hI!hI!hI" + "'", str1, "         ...4444 hI!hI!hI!hI!hI!hI!hI!hI!hI");
    }

    @Test
    public void test09392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09392");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("aAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aAAAAAAA" + "'", str1, "aAAAAAAA");
    }

    @Test
    public void test09393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09393");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat(' ', 146);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                  " + "'", str2, "                                                                                                                                                  ");
    }

    @Test
    public void test09394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09394");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("hi!ih!ih!ih!ih!ih!ih!ih", "hi!ih       !ih       !ih    ...", 34);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("####################################################################################################", "!IH       ", 0);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "##########hi!HI!##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", (java.lang.CharSequence[]) strArray9);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi", strArray4, strArray9);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "####################################################################################################" });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "####################################################################################################" + "'", str10, "####################################################################################################");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 16 + "'", int11 == 16);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi" + "'", str12, "!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi!iHHiHI!!iHHi");
    }

    @Test
    public void test09395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09395");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "                                                                                                                                                                                                                      HI!HI!HI!HI!HI!HI!HI!HI!H...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                                                                                                                                                                                                                      ", (java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09396");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("hi!hi!hi!hi!hi!hi!hi!hi!hi", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09397");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("44444444444444444444444444444444HI!44444444444444444444444444444hi!44444444444444444444444444444hi!4", '#');
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) " ", (java.lang.CharSequence[]) strArray5);
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh   ", (java.lang.CharSequence[]) strArray5);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("#", 'a');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray10, '#', 126, 22);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                         HI", strArray5, strArray10);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "44444444444444444444444444444444HI!44444444444444444444444444444hi!44444444444444444444444444444hi!4" });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "#" });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "                         HI" + "'", str15, "                         HI");
    }

    @Test
    public void test09398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09398");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("HI!hi!                             hi!hi!hi!                             hi!hi!", "                                 ", (int) (short) 10);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "HI!hi!", "hi!hi!hi!", "hi!hi!" });
    }

    @Test
    public void test09399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09399");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("       HI!       HI!       HI!       HI!       HI!       HI!       HI!IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!       HI!       HI!       HI!       HI!       HI!       HI!IH" + "'", str1, "HI!       HI!       HI!       HI!       HI!       HI!       HI!IH");
    }

    @Test
    public void test09400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09400");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("       HI!                            HI!           ", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hhhhhhhh                       HI  hi!Ih!hi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!hi!hi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!hi!44444444444444444444444444444444444444444444444444444444444444444444444                         HI                                HI!                             HI!                             HI!                               44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hhhhhhhh                       HI  hi!Ih!hi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!hi!hi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!hi!444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       HI!                            HI!           " + "'", str2, "       HI!                            HI!           ");
    }

    @Test
    public void test09401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09401");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "                            hi!hi!hi!                             hi!hi", (java.lang.CharSequence) " i!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! i!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! i!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09402");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "...HI!!IHHI!!IHHI!!IH...", 6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09403");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("hi!hi!       hi!4!!!!!!!!!!!!!!!!!!!!!!!!!4                                hi!44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444!hi!hi", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!       hi!!!!!!!!!!!!!!!!!!!!!!!!!!                                hi!!hi!hi" + "'", str2, "hi!hi!       hi!!!!!!!!!!!!!!!!!!!!!!!!!!                                hi!!hi!hi");
    }

    @Test
    public void test09404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09404");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "...                                                      ;   ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "                                                                                                  ", 274);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 43 + "'", int3 == 43);
    }

    @Test
    public void test09405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09405");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("hI!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hI!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        " + "'", str2, "hI!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ");
    }

    @Test
    public void test09406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09406");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "Hi!hi!hi!hi!hi!hi!hi!hi!hi!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09407");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                HI!", '4');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, ' ');
        boolean boolean8 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "hi!", (java.lang.CharSequence[]) strArray5);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "!!!!!!!!!!!!!!!!!!!!!!!!!");
        boolean boolean12 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "                      hi############################################################################", (java.lang.CharSequence[]) strArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "                                                                                                                        !iHHi! ", (java.lang.CharSequence[]) strArray11);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "                                HI!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                HI!" + "'", str7, "                                HI!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "HI!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "                                HI" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test09408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09408");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                                                                                                  HI!       !IHHHHHHHHHHHHHHHHHHHHHHHHHH       !IHHI!              !IHHI!       !IHHI!                                                                                                       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!       !IHHHHHHHHHHHHHHHHHHHHHHHHHH       !IHHI!              !IHHI!       !IHHI!" + "'", str1, "HI!       !IHHHHHHHHHHHHHHHHHHHHHHHHHH       !IHHI!              !IHHI!       !IHHI!");
    }

    @Test
    public void test09409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09409");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("HI!HI!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "HI", "!", "HI", "!" });
    }

    @Test
    public void test09410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09410");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("    ...   444", '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "    ...   " });
    }

    @Test
    public void test09411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09411");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "IH                         hi!        ", 24);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09412");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "##########hi!HI!####################################################################################", 22, 96);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09413");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("HI!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09414");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("  !!                                           !!                                    !!                                    !!                                    !!  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "  !!                                           !!                                    !!                                    !!                                    !!  " + "'", str1, "  !!                                           !!                                    !!                                    !!                                    !!  ");
    }

    @Test
    public void test09415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09415");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09416");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("hi                                HI!                             HI!                             HI!", "...       hi!!ih       hi!!ih   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi                                HI!                             HI!                             HI!" + "'", str2, "hi                                HI!                             HI!                             HI!");
    }

    @Test
    public void test09417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09417");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("i!hi!hi!hi!hi!hi!hi!hi!h!!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09418");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("hI!hi!##############################################################################################", "                                                                                                                                                                                                                                                                                                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                 " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                 ");
    }

    @Test
    public void test09419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09419");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("... hi##ih hi##ih hi##ih ...                         ... hi##ih hi##ih hi##ih ...                         ... hi##ih hi##ih hi##ih ...                         ... hi##ih hi##ih hi##ih ...                                ... hi##ih hi##ih hi##ih ...", ' ');
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!IH", '4');
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray7, "          ");
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("####################################################################################################", "!IH       ", 0);
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.split("############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", "   hi!    ");
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                HI!                             HI!                             HI! ", strArray14, strArray17);
        java.lang.String[] strArray20 = org.apache.commons.lang3.StringUtils.stripAll(strArray17, "!iHHi!                                       !iHHi!       !iHHi!              !iHHi!       HHHHHHHHHHHHHHHHHHHHHHHHHHi!       !iH");
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("!    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !                                    ", strArray7, strArray20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("!HI!                             !                             !  HI!", strArray3, strArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 128 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!IH" });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!IH" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "####################################################################################################" });
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "                                HI!                             HI!                             HI! " + "'", str18, "                                HI!                             HI!                             HI! ");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" });
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "!    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !                                    " + "'", str21, "!    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !    !                                    ");
    }

    @Test
    public void test09420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09420");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("HI!HI!hiHI!HI!HI", "            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!hiHI!HI!HI" + "'", str2, "HI!HI!hiHI!HI!HI");
    }

    @Test
    public void test09421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09421");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", 42, 98);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##################################################################################################" + "'", str3, "##################################################################################################");
    }

    @Test
    public void test09422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09422");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  !    ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09423");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaaaaaaaaaaaa                         HI!hi!HI!          ", "       ...", (int) '#');
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, ' ');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aaaaaaaaaaaaaaaaa                         HI!hi!HI!          " });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "aaaaaaaaaaaaaaaaa                         HI!hi!HI!" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "aaaaaaaaaaaaaaaaa                         HI!hi!HI!" + "'", str7, "aaaaaaaaaaaaaaaaa                         HI!hi!HI!");
    }

    @Test
    public void test09424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09424");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                HI!                             hi!                             hi! ");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09425");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "hi!           HI", (java.lang.CharSequence) "                                hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09426");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("                                                                                                          !IH                         hi!        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                          !IH                         hi!        " + "'", str1, "                                                                                                          !IH                         hi!        ");
    }

    @Test
    public void test09427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09427");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444!IH444444444444444444444444444444444444444444444444444444444444444444444444", "4HI4!!4IH4                                       4HI4!!4IH4       4HI4!!4IH4              4HI4!!4IH4       4!!!!!!!!!!!!!!!!!!!!!!!!!!4IH4       4HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09428");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("A444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A444444444444444444444444444444444444444444444444444" + "'", str1, "A444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test09429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09429");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("4444444444444444444444444444444", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444   HI ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
    }

    @Test
    public void test09430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09430");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "... hi!!ih hi!!ih hi!!ih ...                                ... hi!!ih hi!!ih hi!!ih ...                         ... hi!!ih hi!!ih hi!!ih ...                         ... hi!!ih hi!!ih hi!!ih ...                         ... hi!!ih hi!!ih hi!!ih ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09431");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("!IHHI!                                       !IHHI!       !IHHI!              !IHHI!       HHHHHHHHHHHHHHHHHHHHHHHHHHI!       !IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!IHHI!                                       !IHHI!       !IHHI!              !IHHI!       HHHHHHHHHHHHHHHHHHHHHHHHHHI!       !IH" + "'", str1, "!IHHI!                                       !IHHI!       !IHHI!              !IHHI!       HHHHHHHHHHHHHHHHHHHHHHHHHHI!       !IH");
    }

    @Test
    public void test09432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09432");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "hI!HI!HI!HI!HI!HI!HI!HI!H...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!hI!HI!HI!HI!HI!HI!HI!HI!H...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!hI!HI!HI!HI!HI!HI!HI!HI!H...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", (java.lang.CharSequence) "####################################################..", 577);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09433");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI! " + "'", str1, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI! ");
    }

    @Test
    public void test09434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09434");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!", 116);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!" + "'", str2, "hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!");
    }

    @Test
    public void test09435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09435");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                         #################################################################", 201, " !IH                         hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " !IH                         hi! !IH                         hi! !IH                         hi! !IH                                    #################################################################" + "'", str3, " !IH                         hi! !IH                         hi! !IH                         hi! !IH                                    #################################################################");
    }

    @Test
    public void test09436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09436");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("hhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhh", "HI!IH!IH!IH!IH!IH!IH!IH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhh" + "'", str2, "hhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhh");
    }

    @Test
    public void test09437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09437");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("...4444 hI!hI!hI!hI!hI!hI!hI!hI!hI", "...!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhhhhhi!!ihhi!!ihhi!!ihhi!!ihhi!!ihhhh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...4444 hI!hI!hI!hI!hI!hI!hI!hI!hI" + "'", str2, "...4444 hI!hI!hI!hI!hI!hI!hI!hI!hI");
    }

    @Test
    public void test09438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09438");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "       HI!                                                                                          ", (java.lang.CharSequence) "####################################################", 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09439");
        char[] charArray7 = new char[] {};
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "!!!!!!!!!!!!!!!!!!!!!!!!!", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "", charArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "       hi!", charArray7);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "       HI!", charArray7);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "!!!!!!!!!!!!!!!!!!!!!!!!", charArray7);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "HI!    ", charArray7);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                HI                                HI!                             HI!                             HI! ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test09440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09440");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                                 ", "hhhhhhhhhh ...       hi!!ih       hi!!ih                                       hi!!ih                       ...hhhhhhhhhh h");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                                                                 " });
    }

    @Test
    public void test09441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09441");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "ci HI ci                              ci ci ci", (java.lang.CharSequence) "                           hi      #                           hi      #                           hi      #                           hi      #                           hi      #                           hi      #                           hi      #                           hi      #                           hi      #                           hi      #                           hi      #                           hi      #                           hi      #                           hi      #                           hi      #                           hi", 98);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09442");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!", "   HI ");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "!hi!hi!444444444444", (java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test09443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09443");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("       HI!  HI!hi!hi!       hi!a!!!!!!!!!!!!!!!!!!!!!!!!!a                                hi!a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444!hi!hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "HI!", "HI!hi!hi!", "hi!a!!!!!!!!!!!!!!!!!!!!!!!!!a", "hi!a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444!hi!hi!" });
    }

    @Test
    public void test09444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09444");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "!! !! !! !! !!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09445");
        java.lang.String[] strArray1 = null;
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("HI!hi!                             hi!hi!hi!                             hi!hi!");
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "!IHHI!                         ...!IHHI!                         ...!IHHI!                         ...!IHHI!                         ...!IHHI!                         ...!IHHI!                         ...!IHHI!                         ...!IHHI!                         ...!IHHI!                         ...!IHHI!                         ...", (java.lang.CharSequence[]) strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("         ...4444 HI!HI!HI!HI!HI!HI!HI!HI!HI", strArray1, strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "HI", "!", "hi", "!", "                             ", "hi", "!", "hi", "!", "hi", "!", "                             ", "hi", "!", "hi", "!" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "         ...4444 HI!HI!HI!HI!HI!HI!HI!HI!HI" + "'", str6, "         ...4444 HI!HI!HI!HI!HI!HI!HI!HI!HI");
    }

    @Test
    public void test09446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09446");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("##############################################################################################################################################################");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "##############################################################################################################################################################" });
    }

    @Test
    public void test09447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09447");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("hi!hi!hi!hi#######HI!!hi!", "   IH                           ", 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test09448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09448");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test09449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09449");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("4444444444444444444", "...4444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih       HI!!ih4444444hi!!ih444444444444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih44444444444444444444444444444444hi!!ih       HI!!IH    !ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444" + "'", str2, "4444444444444444444");
    }

    @Test
    public void test09450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09450");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh##############################", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh##############################" + "'", str2, "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh##############################");
    }

    @Test
    public void test09451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09451");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "!IH       ", (java.lang.CharSequence) "I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test09452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09452");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "4444  HI!           HI!", (java.lang.CharSequence) "!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test09453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09453");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("", 39, 117);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test09454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09454");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                       !IHHI!       !IHHI!              !IHHI!       HHHHHHHHHHHHHHHHHHHHHHHHHHI!       !IH                                                                                                  ", "#hi#!#hi#!#hi...!IHhi!#hi#!#hi#!#hi", (int) (short) 100);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test09455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09455");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("444444444", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "444444444" });
    }

    @Test
    public void test09456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09456");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                                                                                                              !    !    !  ", (java.lang.CharSequence) "iHciHIciciciciciciciHIciciciciciciciHIciciciciciciciHIciciciciciciciHIciciciciciciciHIciciciciciciciHIciciciciciciciHIciciciciciciciHIciciciciciciciHIciciciciciciciHIciciciciciciciHIciciciciciciciHIciciciciciciciHIciciciciciciciHIciciciciciciciHIciciciciciciciHIcicicicici");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 272 + "'", int2 == 272);
    }

    @Test
    public void test09457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09457");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "hi!!ih                                hi!!ih                                hi!!ih                                hi!!ih                                       hi!!ih                             HI                                HI!                             HI!                             HI! ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 296 + "'", int1 == 296);
    }

    @Test
    public void test09458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09458");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("4444444444444444444444444444444444444444!44444444444444444444444444444444444444444", "HI!        ######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "4444444444444444444444444444444444444444!44444444444444444444444444444444444444444" });
    }

    @Test
    public void test09459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09459");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "                                                                                                 hi!", (java.lang.CharSequence) "!IH                                                                                     ", 19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09460");
        char[] charArray7 = new char[] {};
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "!!!!!!!!!!!!!!!!!!!!!!!!!", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "       hi!", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", charArray7);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "..        ", charArray7);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "i!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! i!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! i!hi!hi!hi!hi!hi!hi!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray7);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hi!ih       !ih       !ih    ...#...", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test09461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09461");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("...hi  ih", "hi!a!!!!!!!!!!!!!!!!!!!!!!!!!a                                hi!a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test09462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09462");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "HI!        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test09463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09463");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "                                hi!!ih                                       hi!!ih       hi!!ih              hi!!ih       !!!!!!!!!!!!!!!!!!!!!!!!!!ih       hi", 17, 197);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09464");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" });
    }

    @Test
    public void test09465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09465");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "!ih                      hhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09466");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I            ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09467");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "##########hi!HI!##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", (java.lang.CharSequence) "                                                                                                    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09468");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "    ...   444", (java.lang.CharSequence) "hi!ihhi!ihhi!!!ihhi!ihhi!HI!ihhi!ihhi!!                                                                                                                                                                                                                                                    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09469");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "hi! HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09470");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "HI!hi!##############################################################################################", (java.lang.CharSequence) "hi!HI!hi!                             hi!hi!hi!                             hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09471");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "                           hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09472");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09473");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "###################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", (int) (short) 10, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09474");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("!ih!ih !ih                     ", 'a', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!ih!ih !ih                     " + "'", str3, "!ih!ih !ih                     ");
    }

    @Test
    public void test09475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09475");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "         " + "'", str1, "         ");
    }

    @Test
    public void test09476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09476");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("4444444444444444444444444444444444444444!44444444444444444444444444444444444444444", 'a', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444!44444444444444444444444444444444444444444" + "'", str3, "4444444444444444444444444444444444444444!44444444444444444444444444444444444444444");
    }

    @Test
    public void test09477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09477");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "I!hI!hI!hI!hI!hI!hI!hI!hIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "!!!!!!!!!!!!!!!!!!!!!!!!!!!hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09478");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI4444 hI!hI!hI!hI!hI!hI!hI!hI!hIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09479");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "                                hi!    ", (java.lang.CharSequence) "hi!#################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", 296);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09480");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "#########################################################################################...#########################################################################################...#########################################################################################...######################################################################################!ihhi!ihhi!", (java.lang.CharSequence) "hi!!ihhi!!ihhi!!ihhi!!ihhi!!ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test09481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09481");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "hI!hI!hI!hI!hI!hI!hI!hI!hI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09482");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "                         #################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09483");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                                                                  HI                              HI                              HI  ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '4', 177, 197);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 177 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "HI", "HI", "HI" });
    }

    @Test
    public void test09484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09484");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("  !!          HI!    !!                                    !!                                    !!                                           !!  !hI!hI!hI!hIa##################################################################################################################################################################################################", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  !!          HI!    !!                                    !!                                    " + "'", str2, "  !!          HI!    !!                                    !!                                    ");
    }

    @Test
    public void test09485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09485");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("!                             hi!                             hi!!                             hi!                             hi!!                             hi!                             hi!!                             hi!                             hi!!                             hi!                             hi!!                             hi!                             hi!!                             hi!                             hi!!                             hi!                             hi!!                             hi!                             hi!!                             hi!                             hi!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test09486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09486");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("                                                                                                 hi!", "!ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       ", 96);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                HI!", '4');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray11, ' ');
        boolean boolean14 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "hi!", (java.lang.CharSequence[]) strArray11);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "       HI!", (java.lang.CharSequence[]) strArray11);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Comparable<java.lang.String>[]) strArray11);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "HI!hi!                             hi!hi!hi!                             hi!hi!", (java.lang.CharSequence[]) strArray11);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray11);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.replaceEach("h", strArray4, strArray11);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "Hi!hi!hi!hi!hi!hi!hi!hi!hi!!");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "                                HI!" });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "                                HI!" + "'", str13, "                                HI!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "                                HI!" + "'", str16, "                                HI!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "h" + "'", str19, "h");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test09487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09487");
        char[] charArray4 = new char[] {};
        boolean boolean5 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "                         hi!", charArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray4);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "HI!IH       !IH       !IH       !IH       !IH       !IH       !IH", charArray4);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hi!ihhi!ihhi!!!ihhi!ihhi!HI!ihhi!ihhi!!                                                                                                                                                                                                                                                    ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test09488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09488");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                              ", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test09489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09489");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("!                             hi!                             hi!!                             hi!                             hi!!                             hi!                             hi!!                             hi!                             hi!!                             hi!                             hi!!                             hi!                             hi!!                             hi!                             hi!!                             hi!                             hi!!                             hi!                             hi!!                             hi!                             hi!", "                           HI!", (int) (short) 1);
        java.lang.String[] strArray5 = null;
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                HI!                             hi!                             hi! ", strArray4, strArray5);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "!                             hi!                             hi!!                             hi!                             hi!!                             hi!                             hi!!                             hi!                             hi!!                             hi!                             hi!!                             hi!                             hi!!                             hi!                             hi!!                             hi!                             hi!!                             hi!                             hi!!                             hi!                             hi!" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "                                HI!                             hi!                             hi! " + "'", str6, "                                HI!                             hi!                             hi! ");
    }

    @Test
    public void test09490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09490");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("Hi!ih!ih!ih!ih!ih!ih!ih");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "Hi", "!", "ih", "!", "ih", "!", "ih", "!", "ih", "!", "ih", "!", "ih", "!", "ih" });
    }

    @Test
    public void test09491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09491");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!IH           !ih   ##########      ", 97, 87);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...#################################################################################..." + "'", str3, "...#################################################################################...");
    }

    @Test
    public void test09492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09492");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!IH           !ih   ##########      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!IH           !ih   ##########      " + "'", str1, "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!IH           !ih   ##########      ");
    }

    @Test
    public void test09493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09493");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "hi!HI!hi!hi!HI!HI! HI! HI! ", (java.lang.CharSequence) "i!hi!hi!hi!hi!hi!hi!hi!h!!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09494");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!!!!!!!!!!!!!!!!!!!!!!!!!");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByCharacterType("################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################  !!          HI!    !!                                    !!                                    !!                                           !!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("H                                                                                                                                                                                                                                                                                           ", strArray2, strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 14");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!!!!!!!!!!!!!!!!!!!!!!!!!" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", "  ", "!!", "          ", "HI", "!", "    ", "!!", "                                    ", "!!", "                                    ", "!!", "                                           ", "!!" });
    }

    @Test
    public void test09495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09495");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("", "!iHHi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!iHHi!" + "'", str2, "!iHHi!");
    }

    @Test
    public void test09496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09496");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "Class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;", (java.lang.CharSequence) "hi!           HI###################################################...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09497");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "HI!hi!                             hi!hi!hi!                             ", (java.lang.CharSequence) "!IH                         hi!        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09498");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "HI! HI! ...", 177);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 92 + "'", int3 == 92);
    }

    @Test
    public void test09499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09499");
        java.lang.CharSequence charSequence0 = null;
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf(charSequence0, (java.lang.CharSequence) "aaa!ihaaa#########", 289);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09500");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("", "iH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }
}

