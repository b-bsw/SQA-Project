package org.apache.commons.lang3;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest13 {

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
    public void test06501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06501");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi#                             ", "I           ");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray3);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("IIIIIIIIIIIIIIIIIIIIIIIIIIII", "", 32);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.split("", ' ');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray13);
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.stripAll(strArray13);
        java.lang.String[] strArray19 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hia!###HHI", "HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH", (int) (short) 1);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray19);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.replaceEach("#######", strArray15, strArray19);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("Hi !", strArray9, strArray15);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray9);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("...###hhi####           4                                                                  ", strArray3, strArray9);
        java.lang.String str28 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9, '#', 273, 11);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi#                             " });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "IIIIIIIIIIIIIIIIIIIIIIIIIIII" });
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hia!###HHI" });
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hia!###HHI" + "'", str20, "hia!###HHI");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#######" + "'", str21, "#######");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hi !" + "'", str22, "Hi !");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "IIIIIIIIIIIIIIIIIIIIIIIIIIII" + "'", str23, "IIIIIIIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "...###hhi####           4                                                                  " + "'", str24, "...###hhi####           4                                                                  ");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test06502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06502");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("hia", "                     hhhhhhhhhhhhhh", 39);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06503");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("#########################################################################################################################################################44444hi!44444i!hi!h44444hi!44444                                                                 #########################################################################################################################################################", "44444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 180 + "'", int2 == 180);
    }

    @Test
    public void test06504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06504");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("ia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!        HI#!           ###HHI####           ...           ###HHI####           ...           ###HHI####            hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!         ", 114, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!        HI#!           ###HHI####           ...           ###HHI####           ...           ###HHI####            hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!         " + "'", str3, "ia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!        HI#!           ###HHI####           ...           ###HHI####           ...           ###HHI####            hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!         ");
    }

    @Test
    public void test06505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06505");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("   !I!...        ###HHI####           ...", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06506");
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
        java.lang.Class<?> wildcardClass23 = strArray5.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test06507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06507");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("4444444444444444444444444444444444444444!aih                                                ", "           ###HHI####           4");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "4444444444444444444444444444444444444444!aih                                                " });
    }

    @Test
    public void test06508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06508");
        char[] charArray10 = new char[] { '4', 'a', '#', '#', 'a', '4' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("", charArray10);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("H!H...", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("aaai", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', 'a', '#', '#', 'a', '4' });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test06509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06509");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("             HH              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HH" + "'", str1, "HH");
    }

    @Test
    public void test06510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06510");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("               HHHHHHHHHHHHHHH", "########!4ih#########", 433);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06511");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444HHIHHHHHHHHHHHHHHHHIHHHHHHHHHHHHHH");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
    }

    @Test
    public void test06512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06512");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("##############!4ih##############", 26);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##############!4ih#####..." + "'", str2, "##############!4ih#####...");
    }

    @Test
    public void test06513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06513");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("                     !aih          ");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06514");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("###", "       ...       .#hhi#       ...       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06515");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("...HHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHH", "... !  !... !  !... !  !... !  !... !  !... !  !... !  !... !  !... !  !... !  !... !  !... !  !... !  !... !  !... !  !... !  !... !  !... !  !... !  !... !  !... !  !... !  !... !  !... !  !... !  !... !  !... !  !... !  !... !  !... !  !... !  !... !  !... !  !... !  !", 21);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "...HHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHH" });
    }

    @Test
    public void test06516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06516");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                                                                                                h                                                                                                h                                                                                                h                                                                                                h                  .hi!hi!hi!hi!hi!hihHI!i!                         i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h                                                                                                h                                                                                                h                                                                                                h                  .hi!hi!hi!hi!hi!hihHI!i!                         i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h" + "'", str1, "h                                                                                                h                                                                                                h                                                                                                h                  .hi!hi!hi!hi!hi!hihHI!i!                         i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
    }

    @Test
    public void test06517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06517");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("I                    ###HHI####             ", 'a', 17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06518");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("...4444444####ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh", 69, "       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...4444444####ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh" + "'", str3, "...4444444####ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh");
    }

    @Test
    public void test06519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06519");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("######################################################################hI!I!I!I!I!I!I!I!I!II", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "######################################################################hI!I!I!I!I!I!I!I!I!II" + "'", str2, "######################################################################hI!I!I!I!I!I!I!I!I!II");
    }

    @Test
    public void test06520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06520");
        java.lang.String[] strArray1 = null;
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("    H     ", "    H     ", 3);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HHHHHHHHHHHHHHHHHHHHHHHHH");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hHI!i!", strArray7, strArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.startsWithAny("                HHHHHHHHHHHHHHH", strArray7);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("            ...H!IH!I", strArray1, strArray7);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "HHHHHHHHHHHHHHHHHHHHHHHHH" });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hHI!i!" + "'", str10, "hHI!i!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "            ...H!IH!I" + "'", str12, "            ...H!IH!I");
    }

    @Test
    public void test06521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06521");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("                                                                                                                                                                                                                         ", "   !I!...        ###HHI####           ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06522");
        int int1 = org.apache.commons.lang3.StringUtils.length("       ...       .#HHI#       ...       ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 40 + "'", int1 == 40);
    }

    @Test
    public void test06523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06523");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("hi!                          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06524");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("4444444444444", "44444444444444444444444444                                              !H#!H...                                              ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06525");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                                 h                                                  ", "", 215);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test06526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06526");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                                                    444444444444444444444444444444444444444444hhi!i!       444444444444444444444444444444444444444444                                                                     ", "                    HH              ...             HH                                  HH              ...             HH                                  HH              ...             HH                                  HH              ...             HH                                  HH              ...             HH                                  HH              .....             HH                                  HH              ...             HH                                  HH              ...             HH                                  HH              ...             HH                                  HH              ...             HH                                  HH              ...             HH                                  HH              ..", 336);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "444444444444444444444444444444444444444444hhi!i!", "444444444444444444444444444444444444444444" });
    }

    @Test
    public void test06527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06527");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("       #                            #                            #                            #                            ", "444444444444444444444444444444444444444444########!4ih#########");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06528");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase("                            444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06529");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("##############################################################   ihhih!ih!ih!ih!ih!ih!ih!ih!ih!ih                           i");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06530");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("hiah", "hi!      ....H!IH!IHhhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06531");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("4", ".hiI4....hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06532");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("IIIIIIIIIIIIIIIIIIIIIII", 69);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                              IIIIIIIIIIIIIIIIIIIIIII" + "'", str2, "                                              IIIIIIIIIIIIIIIIIIIIIII");
    }

    @Test
    public void test06533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06533");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("I");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06534");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("       ...       ###hhi####    ...       ...       .                                                                                                                                                                                                                                                                                                                                                                                                                                                             ", 132);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                             " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                             ");
    }

    @Test
    public void test06535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06535");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("                HHHHHHHHHHHHHH", "       ...       ...       ...       ...       ..");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06536");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("hhhhhhhhhh", "hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!h");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test06537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06537");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("HHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH" + "'", str1, "HHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH");
    }

    @Test
    public void test06538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06538");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("hi!");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "HH", 3, 0);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray8, "HHHHHHHHHHHHHHH");
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny("hi####IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH###!", strArray8);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi", "!" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi", "!" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi", "!" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi", "!" });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test06539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06539");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "HHHHHHHHHHHHHH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test06540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06540");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("###");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "###" });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06541");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("hi!aaaaaaaaaaaaaaaaaaaI                                  II                                  II ", 128, 88);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test06542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06542");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("444hhi4444", "hHI!i!       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444hhi4444" + "'", str2, "444hhi4444");
    }

    @Test
    public void test06543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06543");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("4444444       4ih###############################4444444       ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "4444444", "4ih###############################4444444" });
    }

    @Test
    public void test06544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06544");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06545");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("HI!HI!HI!HI!HI!HI!HI!H           ####I           ####I           ####I           ####I           ####I           ####I...", "I                                  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06546");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaai", "hi#!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aaa", "" });
    }

    @Test
    public void test06547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06547");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("       .I..I...I..I...I..I...I..I...I..I...I..I...I..I...I..I..");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { ".I..I...I..I...I..I...I..I...I..I...I..I...I..I...I..I.." });
    }

    @Test
    public void test06548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06548");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace("hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06549");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("Hhi!I!", 99, 146);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test06550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06550");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("                                                                                                                                                                                                                                                                                                                                                                             ", "           ####I           ####I");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06551");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("h                                                                                                h                                                                                                h                                                                                                h                  .hi!hi!hi!hi!hi!hihHI!i!                         i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###hhi####    ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06552");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("ia!###HHI", "hi####IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH###!", 394, 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi####IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH###!" + "'", str4, "hi####IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH###!");
    }

    @Test
    public void test06553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06553");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("                               ###hhi####    ...", 596, 126);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test06554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06554");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("      ###HHI####                 ###HHI####                 ###HHI####                 ###HHI####                 ###HHI####                 ###HHI####                 ###HHI####                 ###HHI####                 ###HHI####           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06555");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("           ####I           ####I           ####I           ####I           ####I           ####I           ####I           ####I           ####I H", "4           ###HHI####           4", "44444444444444444444444444444444");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test06556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06556");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI", "#################################################################" });
    }

    @Test
    public void test06557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06557");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop(".i..i.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".i..i" + "'", str1, ".i..i");
    }

    @Test
    public void test06558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06558");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("hi####IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH###!", "aaaHhi!I!       aaa", 31);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06559");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad(".I..I..", 215, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".I..I..4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, ".I..I..4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test06560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06560");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("      ###44I####           ", "###hhi...#");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06561");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!...hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06562");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("HHIHHHHHHHHHHHHHHHHIHHHHHHHHHHHHHH", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06563");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("44444444444444444444444444                                              !H#!H...                                              ", 88);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444                                              !H#!H...     ..." + "'", str2, "44444444444444444444444444                                              !H#!H...     ...");
    }

    @Test
    public void test06564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06564");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("   ", '4');
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, ' ', 0, 215);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "   " });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "" });
    }

    @Test
    public void test06565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06565");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("          HI#!", "HHHHHHHHHHHHHH");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test06566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06566");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("hi4a", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06567");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("aaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaa###HHI####aaaaaaaaaaa...", "                                                                 ##########################################################################################################################################################4HI!4I!HI!H4HI!4#########################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaa###HHI####aaaaaaaaaaa..." + "'", str2, "aaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaa###HHI####aaaaaaaaaaa...");
    }

    @Test
    public void test06568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06568");
        char[] charArray7 = new char[] {};
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny("HI!HI!H...", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny("                                                 h                                                  ", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone("I", charArray7);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("", charArray7);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone("HI#", charArray7);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny("...H!IH!IH44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray7);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test06569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06569");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("####IHH###", "HHHHHHHHHHHHHHHHHHHHHHH      hi!HHHHHHHHHHHHHHHHHHHHHHHHH      hi!HHHHHHHHHHHHHHHHHHHHHHHHH      hi!HHHHHHHHHHHHHHHHHH                         ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!HIhi#!", 178);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "####IHH###" + "'", str4, "####IHH###");
    }

    @Test
    public void test06570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06570");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("                                                                                                                                                                                                                                                                              ", 90);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                          " + "'", str2, "                                                                                          ");
    }

    @Test
    public void test06571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06571");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("HHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH", "################################################################# HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI I", "HHHHHHHHHHHHHHHHHHHHHHHHH      hi4!HHHHHHHHHHHHHHHHHHHHHHHHH      hi4!HHHHHHHHHHHHHHHHHHHHHHHHH      hi4!HHHHHHHHHHHHHHHHHHHHHHHHH      hi4!HHHHHHHHHHHHHHHHHHHHHHHHH      hi4!HHHHHHHHHHHHHHHHHHHHHHHHH      hi4!HHHHHHHHHHHHHHHHHHHHHHHHH      hi4!HHHHHHHHHHHHHHHHHHHHHHHHH      hi4!HHHHHHHHHHHHHHHHHHHHHHHHH      hi4!HHHHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH" + "'", str3, "HHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH");
    }

    @Test
    public void test06572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06572");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("444444444444444444444444444444444444444444HHI!I!       444444444444444444444444444444444444444444         ", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06573");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", ' ');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "         ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###      ");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" + "'", str3, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" + "'", str5, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" + "'", str7, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
    }

    @Test
    public void test06574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06574");
        char[] charArray10 = new char[] { '4', 'a', '#', '#', 'a', '4' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("44444444444444444444444444444444", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly("I!I!...", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("                                                                                                                                ###H", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', 'a', '#', '#', 'a', '4' });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test06575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06575");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("####IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH###", 23);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH###" + "'", str2, "#IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH###");
    }

    @Test
    public void test06576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06576");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################" + "'", str1, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################");
    }

    @Test
    public void test06577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06577");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("H", "hi!", (int) (short) 0);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "H" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "H" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "H" });
    }

    @Test
    public void test06578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06578");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("HHIHHHHHHHHHHHHHHHHIHHHHHHHHHHHHHH", "                 HHHHHHHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06579");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("#################################################################ihhih!ih!ih!ih!ih!ih!ih!ih!ih!ihi", 215, 106);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#################################################################ihhih!ih!ih!ih!ih!ih!ih!ih!ih!ihi" + "'", str3, "#################################################################ihhih!ih!ih!ih!ih!ih!ih!ih!ih!ihi");
    }

    @Test
    public void test06580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06580");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!        HI#!           ###HHI####           ...           ###HHI####           ...           ###HHI####            hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test06581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06581");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("...       ...       ...       ...       ...       ...       ..", 6, "HI");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...       ...       ...       ...       ...       ...       .." + "'", str3, "...       ...       ...       ...       ...       ...       ..");
    }

    @Test
    public void test06582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06582");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("       ...       .#hhi#       ...      ", "###hhi...#");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06583");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", "hI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06584");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("       ...       ...       ...       ...       .....       ...       ...       ...       ...       ...       ..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "       ...       ...       ...       ...       .....       ...       ...       ...       ...       ...       .." + "'", str1, "       ...       ...       ...       ...       .....       ...       ...       ...       ...       ...       ..");
    }

    @Test
    public void test06585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06585");
        char[] charArray13 = new char[] { '4', 'a', '#', '#', 'a', '4' };
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("", charArray13);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("hi!       ", charArray13);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly("HI!", charArray13);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("4444444", charArray13);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone("hi#                             ", charArray13);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone("                                              44444", charArray13);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsNone("", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '4', 'a', '#', '#', 'a', '4' });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test06586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06586");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("44444444444444444444444444444444444444444444444444444444###hhi###44444444444444444444444444444444444444444444444444444444", "", "HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444444444444444444###hhi###44444444444444444444444444444444444444444444444444444444" + "'", str3, "44444444444444444444444444444444444444444444444444444444###hhi###44444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test06587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06587");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("Hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!h", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444      HI#!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06588");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("4ih", "hhi!i!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06589");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("  ...                                                                                                                                                                                                                                                                                                                                      ...", "####IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH##");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "  ...                                                                                                                                                                                                                                                                                                                                      ..." });
    }

    @Test
    public void test06590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06590");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("hi!");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "HH", 3, 0);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray1);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "hi4!");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray8);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "hi", "!" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "" });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test06591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06591");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace(".", "444444444444I...4444444444444", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
    }

    @Test
    public void test06592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06592");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("!H!H...", '#', 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06593");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("!H!H..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!H!H.." + "'", str1, "!H!H..");
    }

    @Test
    public void test06594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06594");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("I!HI!H...hi!hi!hi!hi!hi!hihHI!i!aaaaaaaaaaaaaaaaaaaaaaaaai!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06595");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("hI#                             ", "                     HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################", 128, (int) '4');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hI#                                                  HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################" + "'", str4, "hI#                                                  HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################");
    }

    @Test
    public void test06596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06596");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("                                             ia!###HHI                                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                             ia!###HHI                                              " + "'", str1, "                                             ia!###HHI                                              ");
    }

    @Test
    public void test06597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06597");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("HI#!HHHHHHHHHHHHHHHHHHHHHHHH", "hi!I!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06598");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("H!H...", "HI#                             #####################################", 279);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06599");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("hhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06600");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("4444444                                                                                                                                                                                                                                                                                      ", 13, "hi!      ....H!IH!IHhhhhhhhhhh##########################################################################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444                                                                                                                                                                                                                                                                                      " + "'", str3, "4444444                                                                                                                                                                                                                                                                                      ");
    }

    @Test
    public void test06601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06601");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("!H hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!H HI!HHI!I!       HI!HHI!I!       HI!HHI!I!       HI!HHI!I!       HI!HHI!I!       HI!HHI!I!       HI!H" + "'", str1, "!H HI!HHI!I!       HI!HHI!I!       HI!HHI!I!       HI!HHI!I!       HI!HHI!I!       HI!HHI!I!       HI!H");
    }

    @Test
    public void test06602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06602");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("", "Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06603");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("       ...       ...       ...       ...       ...       .....       ...       ...       ...       ...       ...       ..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06604");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("      HI#!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI#!" + "'", str1, "HI#!");
    }

    @Test
    public void test06605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06605");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                         HI!HI!H...", "!H");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny(" HHHHHHHHHHHHH", strArray3);
        java.lang.Class<?> wildcardClass5 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                         HI", "I", "..." });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test06606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06606");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "hi!");
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("hi!", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "");
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "###hhi####", (int) '#', (int) (byte) 0);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray5);
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("      HI#!", "           ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###           ");
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("ia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hi", strArray5, strArray16);
        java.lang.Class<?> wildcardClass18 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "      HI#!" });
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hi" + "'", str17, "ia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hi");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test06607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06607");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("4444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#44444444444444444444444444", "aaaHhi!I!       aaa", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06608");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("    ...       ...       .#HHI#       ...       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "    ...       ...       .#hhi#       ...       " + "'", str1, "    ...       ...       .#hhi#       ...       ");
    }

    @Test
    public void test06609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06609");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!...", "...hhi....    ..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!..." + "'", str2, "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!...");
    }

    @Test
    public void test06610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06610");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                                                                 ##########################################################################################################################################################4HI!4I!HI!H4HI!4#########################################################################################################################################################", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                 ##########################################################################################################################################################4HI!4I!HI!H4HI!4#########################################################################################################################################################" + "'", str2, "                                                                 ##########################################################################################################################################################4HI!4I!HI!H4HI!4#########################################################################################################################################################");
    }

    @Test
    public void test06611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06611");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("4H!H!###H!HHIH!####H!H!4", 51, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444H!H!###H!HHIH!####H!H!4" + "'", str3, "4444444444444444444444444444H!H!###H!HHIH!####H!H!4");
    }

    @Test
    public void test06612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06612");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("  ...                                                                                                                                                                                                                                                                                                                                      ...", 'a', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  ...                                                                                                                                                                                                                                                                                                                                      ..." + "'", str3, "  ...                                                                                                                                                                                                                                                                                                                                      ...");
    }

    @Test
    public void test06613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06613");
        char[] charArray11 = new char[] { '4', 'a', '#', '#', 'a', '4' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("", charArray11);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("hi!       ", charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly("HI!", charArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("4444444", charArray11);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny("i!i!...  ", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', 'a', '#', '#', 'a', '4' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test06614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06614");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase("#######                                                                                                                                                                                                                                                                                                                                             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06615");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("I4...", "    HI!HHI!I!       HI!HHI!I!  ", 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06616");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" });
    }

    @Test
    public void test06617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06617");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("#################################################################   IHHIH!IH!IH!IH!IH!IH!IH!IH!IH!IH                           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06618");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                                                                                                          hhhhhhhhhhhhhhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhhhhhhhhhhhh" + "'", str1, "hhhhhhhhhhhhhhh");
    }

    @Test
    public void test06619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06619");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("", 9, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#########" + "'", str3, "#########");
    }

    @Test
    public void test06620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06620");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", 'a', 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06621");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("Hhi!I!       ", "###");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void test06622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06622");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("!4ih", '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!", "ih" });
    }

    @Test
    public void test06623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06623");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("i#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi", "          hia");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06624");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("", 12);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06625");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "!H", "44444!H", "44444!H", "44444!H", "44444!H", "44444!H", "44444!H", "44444!H", "44444!H", "44444!H", "44444!H", "44444!H", "44444!H", "44444!H", "44444!H", "44444!H", "44444!H", "44444!H", "44444!H", "44444!H", "44444!H", "44444!H", "44444!H", "44444!H", "44444!H" });
    }

    @Test
    public void test06626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06626");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("aaaaaaaaaaa###HHI####aaaaaaaaaaa...", 11);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaa###HHI####aaaaaaaaaaa..." + "'", str2, "aaaaaaaaaaa###HHI####aaaaaaaaaaa...");
    }

    @Test
    public void test06627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06627");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("#########################################################################################################################################################44444hi 44444i hi h44444hi 44444                                                                 #########################################################################################################################################################", "... !  !... !  !... !  !... !  !... !  !... !  !... !  !... !  !... !  !... !  !... !  !... !  !... !  !... !  !... !  !... !  !... !  !... !  !... !  !... !  !... !  !... !  !... !  !... !  !... !  !... !  !... !  !... !  !... !  !... !  !... !  !... !  !... !  !... !  !", "hhhhhhhhhh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#########################################################################################################################################################44444hi 44444i hi h44444hi 44444                                                                 #########################################################################################################################################################" + "'", str3, "#########################################################################################################################################################44444hi 44444i hi h44444hi 44444                                                                 #########################################################################################################################################################");
    }

    @Test
    public void test06628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06628");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       ", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       " + "'", str2, "Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       Hhi!I!       ");
    }

    @Test
    public void test06629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06629");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("       ...       ###hhi####    ...       ...       .                                                                                                                                                                                                                                                                                                                                                                                                                                                             ", "4444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#444444444################################################################ i4444444444444444444444444444444444#44444444444444444444444444", (int) (byte) -1, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#444444444################################################################ i4444444444444444444444444444444444#44444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                             " + "'", str4, "4444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#444444444################################################################ i4444444444444444444444444444444444#44444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                             ");
    }

    @Test
    public void test06630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06630");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("!AIH          ", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06631");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("          hia!", "                                                                                                                          ###H");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06632");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("4444444                                                                                                                                                                                                                                                                                      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444                                                                                                                                                                                                                                                                                      " + "'", str1, "4444444                                                                                                                                                                                                                                                                                      ");
    }

    @Test
    public void test06633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06633");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#" + "'", str1, "#");
    }

    @Test
    public void test06634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06634");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("...###hhi####           4                                                                  ", 145);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                           ...###hhi####           4                                                                                             " + "'", str2, "                           ...###hhi####           4                                                                                             ");
    }

    @Test
    public void test06635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06635");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("...       .#hhi#       ...", "ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh###");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06636");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("hi", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06637");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("   ", "       ...       .#hhi#       ...                                                               ");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "   " });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "   " + "'", str4, "   ");
    }

    @Test
    public void test06638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06638");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                   ...       .#hhi#       ...       ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                   ...       .#hhi#       ...       " + "'", str2, "                   ...       .#hhi#       ...       ");
    }

    @Test
    public void test06639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06639");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace("#####ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh##HHI####");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06640");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("#########################################################################################################################################################44444HI!44444I!HI!H44444HI!44444                                                                 ##########################################################################################################################################################", "... ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06641");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("444444444444444444hHI!i!       444444444444444444444444444444444444444444", "...H!IH!IH ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06642");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("ihh###                 ####ihh###                 ####ihh###                 ####ihh###                 ####ihh###                 ####ihh###                 ####ihh###                 ####ihh###", 497, 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...#ihh###" + "'", str3, "...#ihh###");
    }

    @Test
    public void test06643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06643");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("   hhhhhhhhhhhhhhhhhhhhhhhhh    ", "          ...           444HHI4444           ...           444HHI4444  ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test06644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06644");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("hi4!", "#########################################################################################################################################################44444hi 44444i hi h44444hi 44444                                                                 #########################################################################################################################################################", "HHI", 96);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi4!" + "'", str4, "hi4!");
    }

    @Test
    public void test06645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06645");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###hhi####    ...", "Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hh...       ###hhi####    ...       ...       .");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###hhi####    ..." + "'", str2, "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###hhi####    ...");
    }

    @Test
    public void test06646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06646");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("HI!I!HI!H...HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06647");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("444444444444444444444444444444444444444444hHI!i!       444444444444444444444444444444444444444444", "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!i!...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06648");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                            444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test06649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06649");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("IIIIIIIIIIIIIIIIIIIIIHI!H", "4444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#444444444################################################################ i4444444444444444444444444444444444#44444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                             ", 255);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06650");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("hi#!           ###HHI####           ...           ###HHI####           ...           ###HHI####  ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06651");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("##################################", "!i");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06652");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("                                                                                                                                                                                                                                                                           ...       ", "...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       " + "'", str2, "       ");
    }

    @Test
    public void test06653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06653");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("!AIH", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###hhi####    ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06654");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("i", "Hi !");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06655");
        java.lang.String[] strArray1 = null;
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("           ####I           ####I", " HHHHHHHHHHHHH", 279);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("H#ih", strArray1, strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "", "", "", "", "", "", "", "", "", "####I", "", "", "", "", "", "", "", "", "", "", "####I" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H#ih" + "'", str6, "H#ih");
    }

    @Test
    public void test06656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06656");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("...       ...       ...       ...       .....       ...       ...       ...       ...       ...       ..", "HHI    ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06657");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("hi!       aaaaaaaaaaaaaaaaaaa", "44444!IH44444...H!IH!I44444!IH44444", 48);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("  ####ihh###           ...           ####ihh###           ...           ####ihh###           !#ih", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi", "       aaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test06658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06658");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("hi####IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH###!", 'a', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi####IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH###!" + "'", str3, "hi####IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH###!");
    }

    @Test
    public void test06659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06659");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                           HI!   HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!   HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!..." + "'", str1, "HI!   HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!...");
    }

    @Test
    public void test06660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06660");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi#!           ###HHI####           ...           ###HHI####           ...           ###HHI####  ", '4');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("####IHH###", strArray2, strArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny("44444444444444444444444444a                                              a!aHa#!aHa...a                                             ", strArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, ' ', 0, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi#!           ###HHI####           ...           ###HHI####           ...           ###HHI####  " });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "####IHH###" + "'", str8, "####IHH###");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test06661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06661");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("I                                  #################################################################", "                           HI!   HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!...", 106, 340);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "I                                  #################################################################                           HI!   HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!..." + "'", str4, "I                                  #################################################################                           HI!   HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!...");
    }

    @Test
    public void test06662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06662");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("          hia!", ' ');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        java.lang.Class<?> wildcardClass4 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hia!" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hia!" + "'", str3, "hia!");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test06663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06663");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("4H!H!###H!HHIH!####H!H!4", "                                                44444444444444444444444444444444                                                ", "hia#          hia#");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test06664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06664");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                                              !H#!H...                                              ", "44444444444444444444444444a                                              a!aHa#!aHa...a                                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                              !H#!H...                                              " + "'", str2, "                                              !H#!H...                                              ");
    }

    @Test
    public void test06665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06665");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("...H!IH!IH                         ", "I                                                                          ...                                  444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06666");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("aaaaaaaaaaaaaaaaaaaa4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4aaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                    ", "i!h...i!hi!h...i!hi!h...i!hi!h...i!hi!h...i!hi!h...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06667");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("", "HHHHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06668");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("...hhi......");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...hhi......" + "'", str1, "...hhi......");
    }

    @Test
    public void test06669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06669");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("aaaaaaaaaaaaaaaaaaaaaaaaa!i!IH", "Hi !                                                                                               !aih                                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06670");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("aaaaaaaaaaa###HHI####aaaaaaaaaaa...", "...       .#hhi#       ...      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06671");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI444444444444444444444444444444444444444444HHI!I!       444444444444444444444444444444444444444444hhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI", "                                                 h                                                 ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HI#!", "HI444444444444444444444444444444444444444444HHI!I!", "444444444444444444444444444444444444444444", "HI#!", "HI#!", "HI#!", "HI#!", "HI#!", "HI#!", "HI" });
    }

    @Test
    public void test06672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06672");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("444444444444444444444444444444444444444444########!4aaaaaaaaaaaaaaaaaaa       !ih                                                               ", "   hhi    ", 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "444444444444444444444444444444444444444444########!4aaaaaaaaaaaaaaaaaaa       !ih                                                               " });
    }

    @Test
    public void test06673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06673");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("                                                                                                                     HHHHHHHHHHHHHHH                                                                                                     ", (int) 'a', 17);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...           ..." + "'", str3, "...           ...");
    }

    @Test
    public void test06674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06674");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("      ###hhi####                 ###hhi####                 ###hhi####                 ###hhi####                 ###hhi####                 ###hhi####                 ###hhi####                 ###hhi####                 ###hhi####           ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06675");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("I!HI!H...", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06676");
        char[] charArray13 = new char[] { '4', 'a', '#', '#', 'a', '4' };
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("", charArray13);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("hi!       ", charArray13);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny("###hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi####", charArray13);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone("44444444444444444444444444444444", charArray13);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny("i!i!", charArray13);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsAny("                             ...", charArray13);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly("   hhhhhhhhhhhhhhhhhhhhhhhhh    ", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '4', 'a', '#', '#', 'a', '4' });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test06677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06677");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("HI!   HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!...", "                                              44444");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HI!   HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!..." });
    }

    @Test
    public void test06678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06678");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("...                             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06679");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("       ...       ...       ...       ...       .....       ...       ...       ...       ...       ...       ..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...       ...       ...       ...       .....       ...       ...       ...       ...       ...       .." + "'", str1, "...       ...       ...       ...       .....       ...       ...       ...       ...       ...       ..");
    }

    @Test
    public void test06680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06680");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.stripAll(strArray0);
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray0);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray0, "    H     ");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray0, '4');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertArrayEquals(strArray0, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test06681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06681");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("Hhhhhhhhhh", 19);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    Hhhhhhhhhh     " + "'", str2, "    Hhhhhhhhhh     ");
    }

    @Test
    public void test06682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06682");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("HH", "###hhi###");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HH" + "'", str2, "HH");
    }

    @Test
    public void test06683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06683");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("HHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH", "#######");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH" + "'", str2, "HHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH");
    }

    @Test
    public void test06684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06684");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("", "4444444444444444444444444444444444444444!aih                                                ", "                                                                              HI!HI!H...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test06685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06685");
        int int1 = org.apache.commons.lang3.StringUtils.length(" HHHHHHHHHHHHH");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 14 + "'", int1 == 14);
    }

    @Test
    public void test06686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06686");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("      hi!h", "                                                                                                h                                                                                                h                                                                                                h                                                                                                h                  .hi!hi!hi!hi!hi!hihHI!i!                         i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "      hi!h" + "'", str2, "      hi!h");
    }

    @Test
    public void test06687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06687");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("###hhi###", 596);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###hhi###" + "'", str2, "###hhi###");
    }

    @Test
    public void test06688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06688");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "i           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06689");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("HHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH", 16);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH" + "'", str2, "HHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH");
    }

    @Test
    public void test06690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06690");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("####IHH###           ...           ####IHH###           ...           ####IHH###           !#IH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06691");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("                                                                                                                                                                                                                                                              HHIIIIIIIIIIIIIIIIIIIIIHI!H", 97, 30);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                              " + "'", str3, "                              ");
    }

    @Test
    public void test06692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06692");
        char[] charArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("...hhi....    ..!AIH##################################hiaaaaa", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06693");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("...       ...", "I                                  I  ...       ...       ...       ...       ...       ...       ..");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06694");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("                                              !H#!H...                                              ", "I!I!...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                              !H#!H...                                              " + "'", str2, "                                              !H#!H...                                              ");
    }

    @Test
    public void test06695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06695");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("           ", 104);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                        " + "'", str2, "                                                                                                        ");
    }

    @Test
    public void test06696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06696");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("444hhi4444", "####IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH###    ...");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "444hhi4444" });
    }

    @Test
    public void test06697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06697");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("####IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH###", "IIIIIIIIIIIIIIIIIIIIIHI!H");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06698");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("", "       ...       ...       ...       ...       .");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06699");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("           I", "      HI#!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06700");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                          HI!HI!H...", "aaaaaihHI!H");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                                                          HI!HI!H..." });
    }

    @Test
    public void test06701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06701");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa           ####I           ####I           ####I           ####I           ####I           ####I...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 35, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa           ####I           ####I           ####I           ####I           ####I           ####I...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa           ####I           ####I           ####I           ####I           ####I           ####I...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test06702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06702");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("#######                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ", "...           ...", 121);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06703");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("   ##", "      hi#!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   ##" + "'", str2, "   ##");
    }

    @Test
    public void test06704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06704");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("hi !", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaa.hi!hi!hi!hi!hi!hihHI!i!aaaaaaaaaaaaaaaaaaaaaaaaai!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06705");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                           ...###hhi####           4                                                                                             ", "   HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                           ...###hhi####           4                                                                                             " + "'", str2, "                           ...###hhi####           4                                                                                             ");
    }

    @Test
    public void test06706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06706");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H..." + "'", str1, "I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...");
    }

    @Test
    public void test06707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06707");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "...###hhi####           4                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test06708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06708");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("hi!");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "HH", 3, 0);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        int int8 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("########!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#########", strArray2);
        java.lang.Class<?> wildcardClass9 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi", "!" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi", "!" });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 596 + "'", int8 == 596);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test06709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06709");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!        HI#!           ###HHI####           ...           ###HHI####           ...           ###HHI####            hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!         ", 352, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!        HI#!           ###HHI####           ...           ###HHI####           ...           ###HHI####            hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!         " + "'", str3, "          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!        HI#!           ###HHI####           ...           ###HHI####           ...           ###HHI####            hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!         ");
    }

    @Test
    public void test06710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06710");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                                                                                                             aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###hhi####    ...                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###hhi####    ..." + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###hhi####    ...");
    }

    @Test
    public void test06711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06711");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("########################################################################################################################################################################################################################################################################################                                                                                                                                                                                                                         ", "                                                                                                        ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 393 + "'", int2 == 393);
    }

    @Test
    public void test06712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06712");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp(" HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#       ", "                                                                                                                                                                                                                                                              HHIIIIIIIIIIIIIIIIIIIIIHI!H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#       " + "'", str2, " HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#       ");
    }

    @Test
    public void test06713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06713");
        char[] charArray7 = new char[] {};
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny("HI!HI!H...", charArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny("i                           hi!hi!hi!hi!hi!hi!hi!hi!hi!hihhi   #################################################################", charArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny("hia!###HHI", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly("HI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaa", charArray7);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny("      hi#!                           HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################", charArray7);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny("####I####I####I####I####I####I...", charArray7);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly("################################################################ i", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test06714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06714");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("###hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...#" + "'", str1, "###hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...#");
    }

    @Test
    public void test06715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06715");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("    IHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH   ", "ia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH" + "'", str2, "IHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH");
    }

    @Test
    public void test06716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06716");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "hiah");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test06717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06717");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaaaaaa###HHI####aaaaaaaaaaa...", "###hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi##");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("    ...       ...       .hI!I!I!I!I!I!I!I!I!IIhI!I!I!I!I!I!I!I!I!IIhI!I!I!I!I!I!I!I!I!IIhI!I!I!I!I!I!I!I!I!IIhI!I!I!I!I!I!I!I!I!II       ...       ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aaaaaaaaaaa###HHI####aaaaaaaaaaa..." });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test06718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06718");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("hia                                ", "HH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hia                                " + "'", str2, "hia                                ");
    }

    @Test
    public void test06719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06719");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("###hhi...#", 25);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06720");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("!i!", 'a', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!i!" + "'", str3, "!i!");
    }

    @Test
    public void test06721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06721");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric(".i..i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06722");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("444444444444I...4444444444444", "                                                                                            !aih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444I...4444444444444" + "'", str2, "444444444444I...4444444444444");
    }

    @Test
    public void test06723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06723");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("44444HI!44444", "###HHI####    ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06724");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("IHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06725");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("                                                                 ##########################################################################################################################################################4HI!4I!HI!H4HI!4#########################################################################################################################################################", "hia!###HHI##############################################################################", "i", (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                 ##########################################################################################################################################################4HI!4I!HI!H4HI!4#########################################################################################################################################################" + "'", str4, "                                                                 ##########################################################################################################################################################4HI!4I!HI!H4HI!4#########################################################################################################################################################");
    }

    @Test
    public void test06726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06726");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("...       ...       ...       ...       ...       .....       ...       ...       ...       ...       ...       ..", "");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "...", "...", "...", "...", "...", ".....", "...", "...", "...", "...", "...", ".." });
    }

    @Test
    public void test06727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06727");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444I", "hi!hi!hi!hi!hi!hi!hi!h           ####i           ####i           ####i           ####i           ####i           ####i...", 2, 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4hi!hi!hi!hi!hi!hi!hi!h           ####i           ####i           ####i           ####i           ####i           ####i...44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444I" + "'", str4, "4hi!hi!hi!hi!hi!hi!hi!h           ####i           ####i           ####i           ####i           ####i           ####i...44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444I");
    }

    @Test
    public void test06728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06728");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("I4...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I4..." + "'", str1, "I4...");
    }

    @Test
    public void test06729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06729");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("44444HI!44444I!HI!H...44444HI!4444", "      ###HHI####           ");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, ' ', 10, 0);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "44444", "!44444", "!", "!", "...44444", "!4444" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test06730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06730");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("h", 234);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h" + "'", str2, "h");
    }

    @Test
    public void test06731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06731");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("HHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHH", 255, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "HHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test06732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06732");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06733");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "hi!");
        int int8 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("hi!", strArray7);
        java.lang.String[] strArray10 = new java.lang.String[] {};
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray10);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray10, "");
        java.lang.String[] strArray14 = new java.lang.String[] {};
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray14);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray14, "");
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.replaceEach("hi!", strArray10, strArray14);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.replaceEach("HI!", strArray7, strArray14);
        java.lang.String[] strArray20 = org.apache.commons.lang3.StringUtils.stripAll(strArray7);
        int int21 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...", strArray20);
        java.lang.String[] strArray23 = org.apache.commons.lang3.StringUtils.stripAll(strArray20, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah");
        int int24 = org.apache.commons.lang3.StringUtils.indexOfAny("                              ", strArray20);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HI!" + "'", str19, "HI!");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test06734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06734");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("hia    ...       ...       .hI!I!I!I!I!I!I!I!I!IIhI!I!I!I!I!I!I!I!I!IIhI!I!I!I!I!I!I!I!I!IIhI!I!I!I!", 234);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hia    ...       ...       .hI!I!I!I!I!I!I!I!I!IIhI!I!I!I!I!I!I!I!I!IIhI!I!I!I!I!I!I!I!I!IIhI!I!I!I!" + "'", str2, "hia    ...       ...       .hI!I!I!I!I!I!I!I!I!IIhI!I!I!I!I!I!I!I!I!IIhI!I!I!I!I!I!I!I!I!IIhI!I!I!I!");
    }

    @Test
    public void test06735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06735");
        char[] charArray7 = new char[] { 'a', ' ' };
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("hi!", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly("HHH", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny("hi#!", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHiiiiiiiiiiiiiiiiiiiiihi!h", charArray7);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone("                HHHHHHHHHHHHHHH", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { 'a', ' ' });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test06736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06736");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("hi4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi4" + "'", str1, "hi4");
    }

    @Test
    public void test06737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06737");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("                                                                                                                                                                                                                         ", 26, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test06738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06738");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                               ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
    }

    @Test
    public void test06739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06739");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA###HHI####    ...", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06740");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "");
        java.lang.String[] strArray7 = new java.lang.String[] {};
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray7);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, "");
        java.lang.String[] strArray11 = new java.lang.String[] {};
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray11);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray11, "");
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEach("hi!", strArray7, strArray11);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray2, strArray7);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, ' ', (int) '4', (int) (short) 1);
        java.lang.String[] strArray21 = new java.lang.String[] {};
        java.lang.String[] strArray22 = org.apache.commons.lang3.StringUtils.stripAll(strArray21);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.replaceEach("HI!HI!H...", strArray7, strArray22);
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, "hi!       ");
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, "#######");
        java.lang.String str31 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, '#', 255, 51);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "HI!HI!H..." + "'", str23, "HI!HI!H...");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test06741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06741");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Hhhhhhhhhh");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "Hhhhhhhhhh" });
    }

    @Test
    public void test06742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06742");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("#####ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh##HHI####", ".I..I...I..I...I..I...I..I...I..I...I..I...I..I...I..I..");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06743");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable("i#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test06744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06744");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("          hia!          hia!  ", "", 63);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "", "", "", "", "", "", "", "", "", "hia!", "", "", "", "", "", "", "", "", "", "hia!", "", "" });
    }

    @Test
    public void test06745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06745");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("HHHHHHHHHHHHHH", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHHHHHHHHHHH" + "'", str2, "HHHHHHHHHHHHHH");
    }

    @Test
    public void test06746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06746");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("...", "           !H#!H...            ", 17, 14);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "...           !H#!H...            " + "'", str4, "...           !H#!H...            ");
    }

    @Test
    public void test06747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06747");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("I                           HI!   HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I                           HI!   HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!..." + "'", str1, "I                           HI!   HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!...");
    }

    @Test
    public void test06748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06748");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test06749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06749");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                                                 ##########################################################################################################################################################4HI!4I!HI!H4HI!4#########################################################################################################################################################");
        java.lang.String[] strArray4 = null;
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("I                                  ################################################################", strArray3, strArray4);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("ia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hi", "hi !Hi!                          hi !Hi!                          hi !Hi!                          hi !Hi!                          hi !Hi!                          hi !Hi!                          hi !Hi!                          hi !", 158);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("!I!...", strArray4, strArray9);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                                                 ", "##########################################################################################################################################################", "4", "HI", "!", "4", "I", "!", "HI", "!", "H", "4", "HI", "!", "4", "#########################################################################################################################################################" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "I                                  ################################################################" + "'", str5, "I                                  ################################################################");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "ia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hi" });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "!I!..." + "'", str10, "!I!...");
    }

    @Test
    public void test06750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06750");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("i                                                                                                                                                                                                                                                                                    ", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i                                                                                                                                                                                                                                                                                    " + "'", str2, "i                                                                                                                                                                                                                                                                                    ");
    }

    @Test
    public void test06751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06751");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI444444444444444444444444444444444444444444HHI!I!       444444444444444444444444444444444444444444hhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI", "############################################################################################################################################################################################################################################################################################################i                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI444444444444444444444444444444444444444444HHI!I!       444444444444444444444444444444444444444444hhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI" + "'", str2, "HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI444444444444444444444444444444444444444444HHI!I!       444444444444444444444444444444444444444444hhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI");
    }

    @Test
    public void test06752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06752");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("      ###HHI####           ", "I                           HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   ################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test06753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06753");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("I                                  #################################################################                           HI!   HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I                                  #################################################################                           HI!   HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!.." + "'", str1, "I                                  #################################################################                           HI!   HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!..");
    }

    @Test
    public void test06754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06754");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###hhi####    ...                                                                                                 ", "...                          ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06755");
        char[] charArray11 = new char[] { '4', 'a', '#', '#', 'a', '4' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("", charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("HI!HI!H...", charArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny("...       ...       ...       ...       ...       ...       ..", charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly("#", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', 'a', '#', '#', 'a', '4' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test06756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06756");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("   HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!...", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444      HI#!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06757");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("###aaa###");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06758");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase("####ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06759");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("...H!IH!I", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...H!IH!I" + "'", str2, "...H!IH!I");
    }

    @Test
    public void test06760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06760");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("...hhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhh...", "####ihh###           ...           ####ihh###           ...           ####ihh###           !#ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06761");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("", 13);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "             " + "'", str2, "             ");
    }

    @Test
    public void test06762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06762");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                               ###H", "H!IH!IH", 21);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                               ###H" });
    }

    @Test
    public void test06763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06763");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("44444HI!4ih4444I!HI!H...44444HI!44444                                                                 ", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06764");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("HIH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HIH" + "'", str1, "HIH");
    }

    @Test
    public void test06765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06765");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("           !H#!H...            ", "       ...       .#HHI#       ...       ");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a', 132, (int) '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "           !H#!H...            " });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test06766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06766");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("           ###HHI####              ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "           ###HHI####              " });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "           ###HHI####              " + "'", str3, "           ###HHI####              ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "           ###HHI####              " + "'", str5, "           ###HHI####              ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "           ###HHI####              " + "'", str7, "           ###HHI####              ");
    }

    @Test
    public void test06767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06767");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "HHHHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06768");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("444444444444444444444444444444444444444444HI!!       444444444444444444444444444444444444444444", "i", "HIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444HI!!       444444444444444444444444444444444444444444" + "'", str3, "444444444444444444444444444444444444444444HI!!       444444444444444444444444444444444444444444");
    }

    @Test
    public void test06769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06769");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "           ####IHH###     ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06770");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("aHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaa" + "'", str1, "aHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaa");
    }

    @Test
    public void test06771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06771");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", '#');
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("!4ih", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test06772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06772");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("I!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...", "HI!i!aaa!H!H...Hhi!I!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06773");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("4H!H!###H!HHIH!####H!H!4", "!aih", "Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hh...       ###hhi####    ...       ...       .");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test06774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06774");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("..I..I...I..I......I..I...I..I.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..I..I...I..I......I..I...I..I." + "'", str1, "..I..I...I..I......I..I...I..I.");
    }

    @Test
    public void test06775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06775");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("Hhhhhhhhhh44444HI!44444", 92, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hhhhhhhhhh44444HI!44444                                                                     " + "'", str3, "Hhhhhhhhhh44444HI!44444                                                                     ");
    }

    @Test
    public void test06776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06776");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("#################################################################   ihhih!ih!ih!ih!ih!ih!ih!ih!ih!ih                           i", "HHHHHHHHHHHHHHHHHHHHHHHHH      hi4!HHHHHHHHHHHHHHHHHHHHHHHHH      hi4!HHHHHHHHHHHHHHHHHHHHHHHHH      hi4!HHHHHHHHHHHHHHHHHHHHHHHHH      hi4!HHHHHHHHHHHHHHHHHHHHHHHHH      hi4!HHHHHHHHHHHHHHHHHHHHHHHHH      hi4!HHHHHHHHHHHHHHHHHHHHHHHHH      hi4!HHHHHHHHHHHHHHHHHHHHHHHHH      hi4!HHHHHHHHHHHHHHHHHHHHHHHHH      hi4!HHHHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "#################################################################   ihhih!ih!ih!ih!ih!ih!ih!ih!ih!ih                           i" });
    }

    @Test
    public void test06777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06777");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("hi!      ....H!IH!IHhhhhhhhhhh", "I                                  ", ".hiI4....hi");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test06778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06778");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06779");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("I                           HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06780");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                                                                                                    ", "4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                    " + "'", str2, "                                                                                                    ");
    }

    @Test
    public void test06781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06781");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("aHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaa", 256);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaa..." + "'", str2, "aHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
    }

    @Test
    public void test06782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06782");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("I                         ...", "hHI!i!       ");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "4444444");
        boolean boolean8 = org.apache.commons.lang3.StringUtils.startsWithAny("Hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!i!...", strArray5);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("hi#!");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray5, strArray10);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi", "#!" });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test06783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06783");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("!H hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!h", "                                                44444444444444444444444444444444                                                ", 433);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "!H hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!h" });
    }

    @Test
    public void test06784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06784");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("Hi !                                                                                             ", "...       ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 90 + "'", int2 == 90);
    }

    @Test
    public void test06785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06785");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI", 334);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI" + "'", str2, "HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI");
    }

    @Test
    public void test06786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06786");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("i!hi!h...            ", "    h!    hHI!HI!H...    h!    h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!hi!h...            " + "'", str2, "i!hi!h...            ");
    }

    @Test
    public void test06787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06787");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("   ###", "#################################################################   ihhih!ih!ih!ih!ih!ih!ih!ih!ih!ih                           i");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06788");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("i                                  ################################################################", "hi4!hi4!hi4!hi4!hi4!hi4!HHHHHHI!I!.i!HI!H...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi                                                            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i                                  ################################################################" + "'", str2, "i                                  ################################################################");
    }

    @Test
    public void test06789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06789");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("I                           HI!   HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!...", 69, 48);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test06790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06790");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06791");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", "hia!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "I                         ...", 77, 334);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 77 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" });
    }

    @Test
    public void test06792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06792");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("Hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!h", "I!I!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!h" + "'", str2, "Hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!h");
    }

    @Test
    public void test06793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06793");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("I                         ...aa###HHI####aaaaaaaaaaa...", "       ...       .#hhi#       ...       ", "HI!HI!H...  I                         ...   HI!HI!H...  I                         ...   HI!HI!H...  I                         ...   HI!HI!H...  I                         ...   HI!HI!H...  I                         ...   HI!HI!H...  I                         ...   HI!HI!H...  I                         ...   HI!HI!H...  I                         ...   HI!HI!H...");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test06794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06794");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("44444          ...           ###HHI####           ...           ###HHI####  HI          ...           ###HHI####           ...           ###HHI####  !          ...           ###HHI####           ...           ###HHI####  44444          ...           ###HHI####           ...           ###HHI####  I          ...           ###HHI####           ...           ###HHI####  !          ...           ###HHI####           ...           ###HHI####  HI          ...           ###HHI####           ...           ###HHI####  !          ...           ###HHI####           ...           ###HHI####  H          ...           ###HHI####           ...           ###HHI####  44444          ...           ###HHI####           ...           ###HHI####  HI          ...           ###HHI####           ...           ###HHI####  !          ...           ###HHI####           ...           ###HHI####  44444          ...           ###HHI####           ...           ###HHI####  ", 132, "IHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444          ...           ###HHI####           ...           ###HHI####  HI          ...           ###HHI####           ...           ###HHI####  !          ...           ###HHI####           ...           ###HHI####  44444          ...           ###HHI####           ...           ###HHI####  I          ...           ###HHI####           ...           ###HHI####  !          ...           ###HHI####           ...           ###HHI####  HI          ...           ###HHI####           ...           ###HHI####  !          ...           ###HHI####           ...           ###HHI####  H          ...           ###HHI####           ...           ###HHI####  44444          ...           ###HHI####           ...           ###HHI####  HI          ...           ###HHI####           ...           ###HHI####  !          ...           ###HHI####           ...           ###HHI####  44444          ...           ###HHI####           ...           ###HHI####  " + "'", str3, "44444          ...           ###HHI####           ...           ###HHI####  HI          ...           ###HHI####           ...           ###HHI####  !          ...           ###HHI####           ...           ###HHI####  44444          ...           ###HHI####           ...           ###HHI####  I          ...           ###HHI####           ...           ###HHI####  !          ...           ###HHI####           ...           ###HHI####  HI          ...           ###HHI####           ...           ###HHI####  !          ...           ###HHI####           ...           ###HHI####  H          ...           ###HHI####           ...           ###HHI####  44444          ...           ###HHI####           ...           ###HHI####  HI          ...           ###HHI####           ...           ###HHI####  !          ...           ###HHI####           ...           ###HHI####  44444          ...           ###HHI####           ...           ###HHI####  ");
    }

    @Test
    public void test06795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06795");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("hii", "i!hi!h...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06796");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("          ...           ###HHI####           ...           ###HHI####  ", 433, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                    ...           ###HHI####           ...           ###HHI####  " + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                    ...           ###HHI####           ...           ###HHI####  ");
    }

    @Test
    public void test06797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06797");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("hi!");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "HH", 3, 0);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.split("########!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#########");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHiiiiiiiiiiiiiiiiiiiiihi!h", strArray8, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 2 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi", "!" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi", "!" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi", "!" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "########!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#########" });
    }

    @Test
    public void test06798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06798");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("aaaHhi!I!       aaa", "HI#!HHHHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaHhi!I!       aaa" + "'", str2, "aaaHhi!I!       aaa");
    }

    @Test
    public void test06799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06799");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("i!h...i!hi!h...i!hi!h...i!hi!h...i!hi!h...i!hi!h...", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!h...i!hi!h...i!hi!h...i!hi!h...i!hi!h...i!hi!h..." + "'", str2, "i!h...i!hi!h...i!hi!h...i!hi!h...i!hi!h...i!hi!h...");
    }

    @Test
    public void test06800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06800");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("#####ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh##HHI####", ".hi!hi!hi!hi!hi!hihHI!i!aaaaaaaaaaaaaaaaaaaaaaaaai!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "4");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#####ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh##HHI####" + "'", str3, "#####ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh##HHI####");
    }

    @Test
    public void test06801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06801");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("I           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06802");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("", "                                             ia!###HHI                                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06803");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test06804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06804");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("hi4!hi4!hi4!hi4!hi4!hi4!HHHHHHI!I!...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi4!hi4!hi4!hi4!hi4!hi4!HHHHHHI!I!..." + "'", str1, "hi4!hi4!hi4!hi4!hi4!hi4!HHHHHHI!I!...");
    }

    @Test
    public void test06805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06805");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!        HI!           HHI           ...           HHI           ...           HHI            hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!         ", "hi!aaaaaaaaaaaaaaaaaaaI                                  II                                  II ", 99);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!        HI!           HHI           ...           HHI           ...           HHI            hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!         " });
    }

    @Test
    public void test06806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06806");
        char[] charArray10 = new char[] { '4', 'a', '#', '#', 'a', '4' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("hi!       ", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("I!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', 'a', '#', '#', 'a', '4' });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test06807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06807");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!IHHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!IH", 'a', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!IHHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!IH" + "'", str3, "...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!IHHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!IH");
    }

    @Test
    public void test06808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06808");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("########!4ih#########", (int) 'a', "...    ####ihh###aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...    ####ihh###aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa########!4ih#########" + "'", str3, "...    ####ihh###aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa########!4ih#########");
    }

    @Test
    public void test06809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06809");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("i#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi", "");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "i#!hhhhhhhhhhhhhhhhhhhhhhhhh", "hi#!hhhhhhhhhhhhhhhhhhhhhhhhh", "hi#!hhhhhhhhhhhhhhhhhhhhhhhhh", "hi#!hhhhhhhhhhhhhhhhhhhhhhhhh", "hi#!hhhhhhhhhhhhhhhhhhhhhhhhh", "hi#!hhhhhhhhhhhhhhhhhhhhhhhhh", "hi#!hhhhhhhhhhhhhhhhhhhhhhhhh", "hi#!hhhhhhhhhhhhhhhhhhhhhhhhh", "hi" });
    }

    @Test
    public void test06810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06810");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                                h                                                                                                h                                                                                                h                                                                                                h                  .hi!hi!hi!hi!hi!hihI!i!                         i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", '#', 90);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06811");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!...HI!HI!HI!HI!HI!HI!HI!HI!", "hi!       aaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06812");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("           ####I           ####I           ####I           ####I           ####I           ####I           ####I           ####I           ####I H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H I####           I####           I####           I####           I####           I####           I####           I####           I####           " + "'", str1, "H I####           I####           I####           I####           I####           I####           I####           I####           I####           ");
    }

    @Test
    public void test06813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06813");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("HI!HI!HI!H", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06814");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("...      ...       ", "hi!hi!hi!hi!hi!hi!hi!h           ####i           ####i           ####i           ####i           ####i           ####i...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06815");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("################################################################ i", ' ', 114);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06816");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("i!hi!h...", "...H!IH!IH4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "####ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh###");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "i!hi!h..." + "'", str3, "i!hi!h...");
    }

    @Test
    public void test06817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06817");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06818");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("44444HI!44444I!HI!H...44444HI!44444");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "44444HI!44444I!HI!H...44444HI!44444" });
    }

    @Test
    public void test06819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06819");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("4444444444444", "HI!H", (int) (byte) 10);
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "4444444444444" });
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test06820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06820");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06821");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("!i", "!H#!H...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!i" + "'", str2, "!i");
    }

    @Test
    public void test06822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06822");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("             ", "...HHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHH", "", 394);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "             " + "'", str4, "             ");
    }

    @Test
    public void test06823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06823");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("44444HI!44444I!HI!H...44444HI!4444", "#########################################################################################################################################################44444hi 44444i hi h44444hi 44444                                                                 #########################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06824");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444I...44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "", 28);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444I...44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" });
    }

    @Test
    public void test06825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06825");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("hi4", 34);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "               hi4                " + "'", str2, "               hi4                ");
    }

    @Test
    public void test06826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06826");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("hI#                             ", 2);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hI#                             " + "'", str2, "hI#                             ");
    }

    @Test
    public void test06827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06827");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("     H    ", "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###hhi####    ...", 255);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "", "", "", "", "H", "", "", "", "" });
    }

    @Test
    public void test06828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06828");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "");
        java.lang.String[] strArray7 = new java.lang.String[] {};
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray7);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, "");
        java.lang.String[] strArray11 = new java.lang.String[] {};
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray11);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray11, "");
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEach("hi!", strArray7, strArray11);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray2, strArray7);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, ' ', (int) '4', (int) (short) 1);
        java.lang.String[] strArray21 = new java.lang.String[] {};
        java.lang.String[] strArray22 = org.apache.commons.lang3.StringUtils.stripAll(strArray21);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.replaceEach("HI!HI!H...", strArray7, strArray22);
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, "hi!       ");
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, "#######");
        java.lang.Class<?> wildcardClass28 = strArray7.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "HI!HI!H..." + "'", str23, "HI!HI!H...");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test06829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06829");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("############################################################################################################################################################################################################################################################################################################i                                  ", 120, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "############################################################################################################################################################################################################################################################################################################i                                  " + "'", str3, "############################################################################################################################################################################################################################################################################################################i                                  ");
    }

    @Test
    public void test06830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06830");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("                           HI!   HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!...", "                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06831");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("      hi#!                           HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################", 69, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      hi#!                           HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################" + "'", str3, "      hi#!                           HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################");
    }

    @Test
    public void test06832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06832");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("                         HI!HI!H...", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06833");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("...!H...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...!H...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h..." + "'", str1, "...!H...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h...");
    }

    @Test
    public void test06834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06834");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("iaaa", "hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi", "                               #...", 2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "iaaa" + "'", str4, "iaaa");
    }

    @Test
    public void test06835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06835");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("I!HI!H...            ", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06836");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad(".I..I...I..I...I..I...I..I...I..I...I..I...I..I...I..I..", (int) (short) 100, "aaaaaaaaaaaaaaaaaaaaahi#!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaahi#!aaaaaaaaaaaaaaaaaaa.I..I...I..I...I..I...I..I...I..I...I..I...I..I...I..I.." + "'", str3, "aaaaaaaaaaaaaaaaaaaaahi#!aaaaaaaaaaaaaaaaaaa.I..I...I..I...I..I...I..I...I..I...I..I...I..I...I..I..");
    }

    @Test
    public void test06837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06837");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("       ...       ...       ...       ...       ...       .....       ...       ...       ...       ...       ...       ..", "Hih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       ...       ...       ...       ...       ...       .....       ...       ...       ...       ...       ...       .." + "'", str2, "       ...       ...       ...       ...       ...       .....       ...       ...       ...       ...       ...       ..");
    }

    @Test
    public void test06838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06838");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("i!i!...", "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!...");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "i", "i", "", "", "", "" });
    }

    @Test
    public void test06839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06839");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                             ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..." + "'", str1, "...");
    }

    @Test
    public void test06840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06840");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                                                                 ##########################################################################################################################################################4HI!4I!HI!H4HI!4#########################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##########################################################################################################################################################4HI!4I!HI!H4HI!4#########################################################################################################################################################" + "'", str1, "##########################################################################################################################################################4HI!4I!HI!H4HI!4#########################################################################################################################################################");
    }

    @Test
    public void test06841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06841");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("HHHHHHHHHHHHH", 100, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test06842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06842");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("!H hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!h", 285);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!H hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!h" + "'", str2, "!H hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!h");
    }

    @Test
    public void test06843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06843");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("4444444       4ih###############################4444444       ");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.startsWithAny("4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4iHi!                          ", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "4444444", "       ", "4", "ih", "###############################", "4444444", "       " });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test06844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06844");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("###hhi###");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06845");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("                                                                  4           ####ihh###...");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06846");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("    h!", "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06847");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("iaaa", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i" + "'", str2, "i");
    }

    @Test
    public void test06848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06848");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("", 334, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##############################################################################################################################################################################################################################################################################################################################################" + "'", str3, "##############################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test06849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06849");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "####ihh###                 ####ihh###                 ####ihh###                 ####ihh###                 ####ihh###                 ####ihh###                 ####ihh###                 ####ihh###                 ####ihh###" + "'", str1, "####ihh###                 ####ihh###                 ####ihh###                 ####ihh###                 ####ihh###                 ####ihh###                 ####ihh###                 ####ihh###                 ####ihh###");
    }

    @Test
    public void test06850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06850");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable(".               HHHHHHHHHHHHHHH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test06851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06851");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase("hI!i!aaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06852");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("!H    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06853");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("i           ###HHI####              ", "!H!H...                                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i           ###HHI####              " + "'", str2, "i           ###HHI####              ");
    }

    @Test
    public void test06854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06854");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("...#################...", "I                                  I  ...       ...       ...       ...       ...       ...       ..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I                                  I  ...       ...       ...       ...       ...       ...       .." + "'", str2, "I                                  I  ...       ...       ...       ...       ...       ...       ..");
    }

    @Test
    public void test06855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06855");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("                                                      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI444444444444444444444444444444444444444444HHI!I!       444444444444444444444444444444444444444444hhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI444444444444444444444444444444444444444444HHI!I!       444444444444444444444444444444444444444444hhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      H" + "'", str1, "                                                      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI444444444444444444444444444444444444444444HHI!I!       444444444444444444444444444444444444444444hhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      H");
    }

    @Test
    public void test06856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06856");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("hi4!hi4!hi4!hi4!hi4!hi4!HHHHHHI!I!.i!HI!H...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi                                                            ", "HI#");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06857");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("I !II ! !       I !II ! !                               HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################", "", "I!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test06858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06858");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("####ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh###");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        java.lang.Class<?> wildcardClass3 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "####", "ihh", "#######", "ihh", "#######", "ihh", "#######", "ihh", "#######", "ihh", "#######", "ihh", "#######", "ihh", "#######", "ihh", "#######", "ihh", "###" });
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "####", "ihh", "#######", "ihh", "#######", "ihh", "#######", "ihh", "#######", "ihh", "#######", "ihh", "#######", "ihh", "#######", "ihh", "#######", "ihh", "###" });
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test06859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06859");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("###HHI####           ...", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###HHI####           ..." + "'", str2, "###HHI####           ...");
    }

    @Test
    public void test06860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06860");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("44444", "###hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi####");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06861");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable("##############!4ih#####...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test06862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06862");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("I                           HI!   HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I                           HI!   HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!..." + "'", str1, "I                           HI!   HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!...");
    }

    @Test
    public void test06863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06863");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("###aaa###", "iaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06864");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("Hi!                          ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "H", "i", "!", "                          " });
    }

    @Test
    public void test06865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06865");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###hhi####    ...", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###hhi####    ..." + "'", str2, "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###hhi####    ...");
    }

    @Test
    public void test06866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06866");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("HI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06867");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!...HI!HI!HI!HI!HI!HI!HI!HI!", 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!...HI!HI!HI!HI!HI!HI!HI!HI!" });
    }

    @Test
    public void test06868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06868");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("I      ...", 234);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I      ..." + "'", str2, "I      ...");
    }

    @Test
    public void test06869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06869");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "i!i!...  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06870");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "!AIH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06871");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("  I                         ...   ", (int) (short) -1, "                               ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  I                         ...   " + "'", str3, "  I                         ...   ");
    }

    @Test
    public void test06872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06872");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("######################################################################hI!I!I!I!I!I!I!I!I!II", 9, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "######################################################################hI!I!I!I!I!I!I!I!I!II" + "'", str3, "######################################################################hI!I!I!I!I!I!I!I!I!II");
    }

    @Test
    public void test06873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06873");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("44444444444444444444444444                                              !H#!H...     ...", "####ihh###                 ####ihh###                 ####ihh###                 ####ihh###                 ####ihh###                 ####ihh###                 ####ihh###                 ####ihh###                 ####ihh###");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444                                              !H#!H...     ..." + "'", str2, "44444444444444444444444444                                              !H#!H...     ...");
    }

    @Test
    public void test06874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06874");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("I!I!...", "          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!        HI#!           ###HHI####           ...           ###HHI####           ...           ###HHI####            hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!         ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 388 + "'", int2 == 388);
    }

    @Test
    public void test06875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06875");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("                HHHHHHHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                HHHHHHHHHHHHHHH" + "'", str1, "                HHHHHHHHHHHHHHH");
    }

    @Test
    public void test06876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06876");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("Hih", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06877");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("...#####", "IIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06878");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("HHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH", "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!i!...HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH" + "'", str2, "HHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH");
    }

    @Test
    public void test06879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06879");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("                                                                                                          hhhhhhhhhhhhhhh", "hi4!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06880");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###");
    }

    @Test
    public void test06881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06881");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("                                                                                                                                ###H", "i           ###HHI####              ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06882");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("HI!I!HI!H...HI!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06883");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("4444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#44444444444444444444444444", "                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#44444444444444444444444444" + "'", str2, "4444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#44444444444444444444444444");
    }

    @Test
    public void test06884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06884");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                               ###hhi####    ...", "!H#!H...");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                               ###hhi####    ..." });
    }

    @Test
    public void test06885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06885");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("                                                                                                                                                                                                                                                                           ...       ", 96);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                      ...       " + "'", str2, "                                                                                      ...       ");
    }

    @Test
    public void test06886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06886");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH", "4HI!44444I!HI!H...44444HI!44444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH" + "'", str2, "HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH");
    }

    @Test
    public void test06887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06887");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("IHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH", "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!...hi!hi!hi!hi!hi!hi!hi!hi!", 63);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                        ", "                        ", "                        ", "                        ", "                        ", "                        ", "                        ", "                        " });
    }

    @Test
    public void test06888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06888");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("", "                                                                                            !aih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06889");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...            ", 23);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...            " + "'", str2, "I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...            ");
    }

    @Test
    public void test06890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06890");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("           ####IHH###     ...", "Hi#                             ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06891");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("H!IH!IH ", 'a', 388);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06892");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("4444444       4ih###############################4444444       ", "  ...                                                                                                                                                                                                                                                                                                                                      ...", 19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06893");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("  ####ihh###           ...           ####ihh###           ...           ####ihh###           !#ih", 497, 234);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test06894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06894");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                          HI!HI!H...", "                         HI!HI!H...", 11);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "#################################################################   ihhih!ih!ih!ih!ih!ih!ih!ih!ih!ih                           i");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                                                 ", "" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "" });
    }

    @Test
    public void test06895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06895");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("IIIIIIIIIIIIIIIIIIIIIHI!H", "I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IIIIIIIIIIIIIIIIIIIIIHI!H" + "'", str2, "IIIIIIIIIIIIIIIIIIIIIHI!H");
    }

    @Test
    public void test06896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06896");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("aHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaa", "hhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06897");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("hHI!i!       ", "I4...", 12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06898");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "...H!IH!IH                                                                                                                                                                                                                                                                                                                                                                                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test06899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06899");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!i!...", "H!IH!IH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!i!..." + "'", str2, "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!i!...");
    }

    @Test
    public void test06900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06900");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("iaaaaaaaaaaaaaaaaaaaaaaaaa", "                ###hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi####", "      ###HHI####                 ###HHI####                 ###HHI####                 ###HHI####                 ###HHI####                 ###HHI####                 ###HHI####                 ###HHI####                 ###HHI####           ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "iaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "iaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test06901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06901");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("hi !", "4           ###HHI####           4                                                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi !" + "'", str2, "hi !");
    }

    @Test
    public void test06902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06902");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("       ...       ...       ...       ...       .", "i!h...i!hi!h...i!hi!h...i!hi!h...i!hi!h...i!hi!h...", 394, 335);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "       ...       ...       ...       ...       .i!h...i!hi!h...i!hi!h...i!hi!h...i!hi!h...i!hi!h..." + "'", str4, "       ...       ...       ...       ...       .i!h...i!hi!h...i!hi!h...i!hi!h...i!hi!h...i!hi!h...");
    }

    @Test
    public void test06903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06903");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("i!h...i!hi!h...i!hi!h...i!hi!h...i!hi!h...i!hi!h...", "i#!HHHHHHHHHHHHHHHHHHHHHHHHHhi#!HHHHHHHHHHHHHHHHHHHHHHHHHhi#!HHHHHHHHHHHHHHHHHHHHHHHHHhi#!HHHHHHHHHHHHHHHHHHHHHHHHHhi#!HHHHHHHHHHHHHHHHHHHHHHHHHhi#!HHHHHHHHHHHHHHHHHHHHHHHHHhi#!HHHHHHHHHHHHHHHHHHHHHHHHHhi#!HHHHHHHHHHHHHHHHHHHHHHHHHhi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 212 + "'", int2 == 212);
    }

    @Test
    public void test06904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06904");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("hia!", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06905");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("hi4!hi4!hi4!hi4!hi4!hi4!HHHHHHI!I!.i!HI!H...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "hi !Hi!                          hi !Hi!        hi4!hi4!hi4!hi4!hi4!hi4!HHHHHHI!I!...                          hi !Hi!                          hi !Hi!                          hi !Hi!                          hi !");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi4!hi4!hi4!hi4!hi4!hi4!HHHHHHI!I!.i!HI!H...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" + "'", str2, "hi4!hi4!hi4!hi4!hi4!hi4!HHHHHHI!I!.i!HI!H...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
    }

    @Test
    public void test06906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06906");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                     hhhhhhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test06907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06907");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("           ###HHI####           ...", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06908");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("i");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '#');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "i" });
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "i" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "i" + "'", str4, "i");
    }

    @Test
    public void test06909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06909");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("!H!H...");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "!H!H..." });
    }

    @Test
    public void test06910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06910");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace("h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test06911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06911");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h...", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h..." + "'", str2, "i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h...");
    }

    @Test
    public void test06912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06912");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("h", 180, 136);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test06913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06913");
        char[] charArray12 = new char[] { '4', 'a', '#', '#', 'a', '4' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("", charArray12);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("hi!       ", charArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("i", charArray12);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("h", charArray12);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("I!I!", charArray12);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly("...#################...", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '4', 'a', '#', '#', 'a', '4' });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test06914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06914");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("I                                  I  ...       ...       ...       ...       ...       ...       ..", (-1), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06915");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                                                                                                                                                                                                                         ", 9);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                         " + "'", str2, "                                                                                                                                                                                                                         ");
    }

    @Test
    public void test06916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06916");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("HHHHHHHHHH");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06917");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("44444", "44444HI!44444I!HI!H44444HI!44444", 243);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "44444" });
    }

    @Test
    public void test06918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06918");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("44444          ...           ###HHI####           ...           ###HHI####  HI          ...           ###HHI####           ...           ###HHI####  !          ...           ###HHI####           ...           ###HHI####  44444          ...           ###HHI####           ...           ###HHI####  I          ...           ###HHI####           ...           ###HHI####  !          ...           ###HHI####           ...           ###HHI####  HI          ...           ###HHI####           ...           ###HHI####  !          ...           ###HHI####           ...           ###HHI####  H          ...           ###HHI####           ...           ###HHI####  44444          ...           ###HHI####           ...           ###HHI####  HI          ...           ###HHI####           ...           ###HHI####  !          ...           ###HHI####           ...           ###HHI####  44444          ...           ###HHI####           ...           ###HHI####  ", "hi4");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "", "", "", "", "          ...           ###HHI####           ...           ###HHI####  HI          ...           ###HHI####           ...           ###HHI####  !          ...           ###HHI####           ...           ###HHI####  ", "", "", "", "", "          ...           ###HHI####           ...           ###HHI####  I          ...           ###HHI####           ...           ###HHI####  !          ...           ###HHI####           ...           ###HHI####  HI          ...           ###HHI####           ...           ###HHI####  !          ...           ###HHI####           ...           ###HHI####  H          ...           ###HHI####           ...           ###HHI####  ", "", "", "", "", "          ...           ###HHI####           ...           ###HHI####  HI          ...           ###HHI####           ...           ###HHI####  !          ...           ###HHI####           ...           ###HHI####  ", "", "", "", "", "          ...           ###HHI####           ...           ###HHI####  " });
    }

    @Test
    public void test06919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06919");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("##############################################################   ihhih!ih!ih!ih!ih!ih!ih!ih!ih!ih                           i", "          HI#!", "!I!...", 240);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "##############################################################   ihhih!ih!ih!ih!ih!ih!ih!ih!ih!ih                           i" + "'", str4, "##############################################################   ihhih!ih!ih!ih!ih!ih!ih!ih!ih!ih                           i");
    }

    @Test
    public void test06920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06920");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("!hi!hi!hi!hi!hi!hi!hi!hi!hihhi   ################################################################", 338);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!hi!hi!hi!hi!hi!hi!hi!hi!hihhi   ################################################################" + "'", str2, "!hi!hi!hi!hi!hi!hi!hi!hi!hihhi   ################################################################");
    }

    @Test
    public void test06921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06921");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!...");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("#######");
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("HI!", "HI!", (int) (short) -1);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("           ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####           ", strArray7, strArray11);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEach("                           HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################", strArray4, strArray11);
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                          HI!HI!H...", "                         HI!HI!H...", 11);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = org.apache.commons.lang3.StringUtils.replaceEach("######################################################################hI!I!I!I!I!I!I!I!I!II", strArray4, strArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "#######" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "           ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####           " + "'", str12, "           ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####           ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "                           HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################" + "'", str13, "                           HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "                                                                 ", "" });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test06922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06922");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("444444444444444444444444444444444444444444444444444444444444444444444444", "       ...       .#HHI#       ...       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06923");
        char[] charArray12 = new char[] { '4', 'a', '#', '#', 'a', '4' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("", charArray12);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("hi!       ", charArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("H", charArray12);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("I                           HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################", charArray12);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone("                               ###H", charArray12);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("i!i!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '4', 'a', '#', '#', 'a', '4' });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test06924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06924");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("", "...       ###hhi####    ...       ...       .");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...       ###hhi####    ...       ...       ." + "'", str2, "...       ###hhi####    ...       ...       .");
    }

    @Test
    public void test06925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06925");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("           ####I           ####I           ####I           ####I           ####I           ####I...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "####I           ####I           ####I           ####I           ####I           ####I..." + "'", str1, "####I           ####I           ####I           ####I           ####I           ####I...");
    }

    @Test
    public void test06926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06926");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("       ...", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06927");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                     II                                  II                                  II                                  II ", "I!HI!H...");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                     II                                  II                                  II                                  II " });
    }

    @Test
    public void test06928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06928");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaai", 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "", "", "i" });
    }

    @Test
    public void test06929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06929");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("###hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi####", "                                    ##IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH###");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06930");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("...hhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhh...", "          hia!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
    }

    @Test
    public void test06931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06931");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("!i!#########");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06932");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("HHIHHHHHHHHHHHHHHHHHHHHHHHHH", "      hi#!", 3);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "HI!IIIIIIIIIIIIIIIIIIIIIIIIIIIIHI!H");
        int int7 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "HHIHHHHHHHHHHHHHHHHHHHHHHHHH" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "HHIHHHHHHHHHHHHHHHHHHHHHHHHH" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test06933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06933");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("I!HI..#!", "####IHH###");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06934");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaaaaaaaaaaaaaaaahi#!aaaaaaaaaaaaaaaaaaa.I..I...I..I...I..I...I..I...I..I...I..I...I..I...I..I..", 'a', 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test06935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06935");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("##############!4ih##############", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06936");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("...           ###HHI####           ...           ###HHI####");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...           ###HHI####           ...           ###HHI####" + "'", str1, "...           ###HHI####           ...           ###HHI####");
    }

    @Test
    public void test06937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06937");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("HI!H", ' ', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!H" + "'", str3, "HI!H");
    }

    @Test
    public void test06938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06938");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!        HI#!           ###HHI####           ...           ###HHI####           ...           ###HHI####            hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!         ", ".       ...       ...       ..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!        HI#!           ###HHI####           ...           ###HHI####           ...           ###HHI####            hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!         " + "'", str2, "          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!        HI#!           ###HHI####           ...           ###HHI####           ...           ###HHI####            hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!         ");
    }

    @Test
    public void test06939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06939");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("...H!IH!IH", "hi4!hi4!hi4!hi4!hi4!hi4!HHHHHHI!I!.i!HI!H...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06940");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("###################HHI#######HHI#######HHI#######HHI#######HHI#######HHI#######HHI#######HHI#######HHI#######HHI#######HHI#######HHI#######HHI####");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test06941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06941");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("HI!", ' ');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "... ...");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HI!" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HI!" + "'", str4, "HI!");
    }

    @Test
    public void test06942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06942");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("Hih", "i#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI", 30);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, ' ', 15, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 15 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "h" });
    }

    @Test
    public void test06943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06943");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("                   ###HHI####    .", 6, 340);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "             ###HHI####    ." + "'", str3, "             ###HHI####    .");
    }

    @Test
    public void test06944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06944");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("               hi4                ", "44444HI!44444I!HI!H...44444HI!44444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "               hi4                " + "'", str2, "               hi4                ");
    }

    @Test
    public void test06945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06945");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!        HI!           HHI           ...           HHI           ...           HHI            hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!", "           ####I           ####I           ####I           ####I           ####I           ####I           ####I           ####I           ####I H", 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06946");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("IIIIIIIIIIIIIIIIIIIIIHI!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "iIIIIIIIIIIIIIIIIIIIIHI!H" + "'", str1, "iIIIIIIIIIIIIIIIIIIIIHI!H");
    }

    @Test
    public void test06947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06947");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("", 63, "aaaaaih");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaihaaaaaihaaaaaihaaaaaihaaaaaaaaihaaaaaihaaaaaihaaaaaihaaaa" + "'", str3, "aaaaaihaaaaaihaaaaaihaaaaaihaaaaaaaaihaaaaaihaaaaaihaaaaaihaaaa");
    }

    @Test
    public void test06948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06948");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("", "hi#", 56);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06949");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("I      ...", "!H#!H...", "hi!aaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test06950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06950");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("I!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI", 'a', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06951");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hia!###HHI", "          hia!", (int) (byte) 1);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.split("", ' ');
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny("                                                                                          HI!HI!H...", strArray10);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray10);
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("i", "    H     ", 3);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray16, "I                                  ", (int) 'a', (int) (byte) 10);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray10, strArray16);
        java.lang.String[] strArray25 = org.apache.commons.lang3.StringUtils.split("hHI!i!aaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 9);
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.replaceEach("                          ", strArray10, strArray25);
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.replaceEach("ia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hi", strArray4, strArray25);
        int int28 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hia!###HHI" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "i" });
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "hHI!i!" });
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "                          " + "'", str26, "                          ");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hi" + "'", str27, "ia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hi");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test06952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06952");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                           HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   ##############################HI!###########################", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##############################HI!########################### HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI" + "'", str2, "##############################HI!########################### HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI");
    }

    @Test
    public void test06953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06953");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("", "###############################################################################################################################################################################################################################################################Hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!i!...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06954");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!H" + "'", str1, "!H");
    }

    @Test
    public void test06955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06955");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("...H!IH!IH                         ", ".       ...       ...       ..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06956");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("HI!i!aaaaaaaaaaaaaaaaaaaaaaaaa", "###I           ##");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!i!aaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "HI!i!aaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test06957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06957");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("      ###HHI####                 ###HHI####                 ###HHI####                 ###HHI####                 ###HHI####                 ###HHI####                 ###HHI####                 ###HHI####                 ###HHI####           ", 5, 14);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " ###HHI####   " + "'", str3, " ###HHI####   ");
    }

    @Test
    public void test06958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06958");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("...H!IH!IH");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "!aih ! Hi");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "...", "H", "!", "IH", "!", "IH" });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "...", "", "", "I", "", "I" });
    }

    @Test
    public void test06959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06959");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhh                           HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06960");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!        HI!           HHI           ...           HHI           ...           HHI            hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!        HI!           HHI           ...           HHI           ...           HHI            hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!" + "'", str2, "hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!        HI!           HHI           ...           HHI           ...           HHI            hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!");
    }

    @Test
    public void test06961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06961");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("!H!H...Hhi!I!", "", 51);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "!H!H...Hhi!I!" });
    }

    @Test
    public void test06962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06962");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                          HI!HI!H...");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny(" ###HHI####   ", strArray3);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 14 + "'", int4 == 14);
    }

    @Test
    public void test06963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06963");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("i                                                                                                                                                                                                                                                                                    ", "########!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#########");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06964");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad(" HHHHHHHHHHHHH", 23);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "          HHHHHHHHHHHHH" + "'", str2, "          HHHHHHHHHHHHH");
    }

    @Test
    public void test06965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06965");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("                                                                                                h                                                                                                h                                                                                                h                                                                                                h                  .hi!hi!hi!hi!hi!hihHI!i!                         i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06966");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("", ' ', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test06967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06967");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!", "hhi");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HIA!", "I#                             HIA!", "I#                             HIA!", "I#                             HIA!", "I#                             HIA!", "I#                             HIA!", "I#                             HIA!", "I#                             HIA!", "I#                             HIA!", "I#                             HIA!", "I#                             HIA!", "I#                             HIA!", "I#                             HIA!" });
    }

    @Test
    public void test06968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06968");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("44444HI!4ih4444I!HI!H...44444HI!44444                                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444HI!4ih4444I!HI!H...44444HI!44444" + "'", str1, "44444HI!4ih4444I!HI!H...44444HI!44444");
    }

    @Test
    public void test06969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06969");
        int int1 = org.apache.commons.lang3.StringUtils.length("hi!I!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test06970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06970");
        char[] charArray6 = new char[] {};
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsAny("HI!HI!H...", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny("                                                 h                                                  ", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly("Hi!                          ", charArray6);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny("!aih", charArray6);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone("I                    ###HHI####              ", charArray6);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny("          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!        HI#!           ###HHI####           ...           ###HHI####           ...           ###HHI####            hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!         ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test06971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06971");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("!H    ");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "!", "H", "    " });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!H    " + "'", str2, "!H    ");
    }

    @Test
    public void test06972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06972");
        char[] charArray14 = new char[] { '4', 'a', '#', '#', 'a', '4' };
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("", charArray14);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny("hHI!i!       ", charArray14);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("hHI!i!", charArray14);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("HHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH", charArray14);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("I                                  ################################################################", charArray14);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny("                                   ", charArray14);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsNone(" HI#!HHHHHHHHHHHHHHHHHHHHHHHHH     ", charArray14);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsOnly("i!hi!h...            ", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4', 'a', '#', '#', 'a', '4' });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test06973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06973");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("4444444", "!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   ################################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06974");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                                                                                            !aih", "                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                            !aih" + "'", str2, "                                                                                            !aih");
    }

    @Test
    public void test06975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06975");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("hia!Hi#                             hia!Hi#                             hia!Hi#                             hia!Hi#                             hia!Hi#                             hia!Hi#                             hia!Hi#                             hia!Hi#                             hia!Hi#                             hia!Hi#                             hia!Hi#                             hia!Hi#                             hia!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hia!Hi#                             hia!Hi#                             hia!Hi#                             hia!Hi#                             hia!Hi#                             hia!Hi#                             hia!Hi#                             hia!Hi#                             hia!Hi#                             hia!Hi#                             hia!Hi#                             hia!Hi#                             hia!" + "'", str1, "hia!Hi#                             hia!Hi#                             hia!Hi#                             hia!Hi#                             hia!Hi#                             hia!Hi#                             hia!Hi#                             hia!Hi#                             hia!Hi#                             hia!Hi#                             hia!Hi#                             hia!Hi#                             hia!");
    }

    @Test
    public void test06976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06976");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "hhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06977");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("!HHHHHHI!I!.i!HI!H...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi#!hi#!hi#!hi#!hi#!hi#hi", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06978");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444      HI#!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 328 + "'", int2 == 328);
    }

    @Test
    public void test06979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06979");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hh...       ###hhi####    ...       ...       .", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06980");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("                           HI!   HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!...", "       ...       ...       ...       ...       .");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06981");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("...       ...", "      HI#!");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "#IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH###", 497, 0);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "...       ..." });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test06982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06982");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh###", "HI!I!       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh###" + "'", str2, "ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh###");
    }

    @Test
    public void test06983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06983");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!                   ...       .#hhi#       ...       i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i       ...       #ihh#.       ...                   !i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i" + "'", str1, "i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i       ...       #ihh#.       ...                   !i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i");
    }

    @Test
    public void test06984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06984");
        java.lang.String[] strArray1 = new java.lang.String[] {};
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "hi!");
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("hi!", strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test06985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06985");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("i           ###HHI####              ", '4');
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "i           ###HHI####              " });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06986");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("hi4!HHHHHHI!I!.i!HI!H...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi#!hi#!hi#!hi#!hi#!hi#hi", 352, 11);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test06987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06987");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("hi!I!", "####IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH###    ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06988");
        char[] charArray14 = new char[] { '4', 'a', '#', '#', 'a', '4' };
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("", charArray14);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny("hHI!i!       ", charArray14);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("hHI!i!", charArray14);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("HHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH", charArray14);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("I                                  ################################################################", charArray14);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsNone("I#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI", charArray14);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny("44444", charArray14);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsAny("  ####IHH###           ...           ####IHH###           ...           ####IHH###           !#IH", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4', 'a', '#', '#', 'a', '4' });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test06989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06989");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("HHI!I!       ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "HHI", "!", "I", "!", "       " });
    }

    @Test
    public void test06990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06990");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("4HI!44444I!HI!H...44444HI!44444", "aaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaa###HHI####aaaaaaaaaaa...", "                                                              ...                                  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4  !44444 !  ! 44444  !44444" + "'", str3, "4  !44444 !  ! 44444  !44444");
    }

    @Test
    public void test06991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06991");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("###HHI####", "      ###HHI####                 ###HHI####                 ###HHI####                 ###HHI####                 ###HHI####                 ###HHI####                 ###HHI####                 ###HHI####                 ###HHI####           ", (int) (short) 100);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("h!", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "###HHI####" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test06992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06992");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("I                                  #################################################################                           HI!   HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!...", 17);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I                                  #################################################################                           HI!   HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!..." + "'", str2, "I                                  #################################################################                           HI!   HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!...");
    }

    @Test
    public void test06993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06993");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("I!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...", "                                                      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI444444444444444444444444444444444444444444HHI!I!       444444444444444444444444444444444444444444hhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI", 106);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test06994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06994");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("Hi ", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test06995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06995");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("HH", 14, (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test06996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06996");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("hhi!i!", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06997");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!", "I#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "A", "h", "A", "h", "A", "h", "A", "h", "A", "h", "A", "h", "A", "h", "A", "h", "A", "h", "A", "h", "A", "h", "A", "h", "A" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "AhAhAhAhAhAhAhAhAhAhAhAhA" + "'", str4, "AhAhAhAhAhAhAhAhAhAhAhAhA");
    }

    @Test
    public void test06998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06998");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("         ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###      ", "44444HI!44444I!HI!H...44444HI!44444                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06999");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("44444444444444444444444444444444444444444444444444444444i#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI444444444444444444444444444444444444444444444444444444444", ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "44444444444444444444444444444444444444444444444444444444i#!HHHHHHHHHHHHHHHHHHHHHHHHH", "HI#!HHHHHHHHHHHHHHHHHHHHHHHHH", "HI#!HHHHHHHHHHHHHHHHHHHHHHHHH", "HI#!HHHHHHHHHHHHHHHHHHHHHHHHH", "HI#!HHHHHHHHHHHHHHHHHHHHHHHHH", "HI#!HHHHHHHHHHHHHHHHHHHHHHHHH", "HI#!HHHHHHHHHHHHHHHHHHHHHHHHH", "HI#!HHHHHHHHHHHHHHHHHHHHHHHHH", "HI444444444444444444444444444444444444444444444444444444444" });
    }

    @Test
    public void test07000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test07000");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                   ###HHI####    .");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###HHI####    ." + "'", str1, "###HHI####    .");
    }
}

