package org.apache.commons.lang3;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest21 {

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
    public void test10501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10501");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase("                     !aih          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10502");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("HHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10503");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "44444HI!44444I!HI!H...44444HI!44444                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10504");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("Hhhhhhhhhh44444HI!44444", "HHI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhhhhhhh44444HI!44444" + "'", str2, "Hhhhhhhhhh44444HI!44444");
    }

    @Test
    public void test10505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10505");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("#######              iHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test10506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10506");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("...                            ", 270, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...                            44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "...                            44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test10507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10507");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("44444HI!4444", '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HI!" });
    }

    @Test
    public void test10508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10508");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("..       ...       ...       ...       ...       ...       .....       ...       ...       ...       ...       ...", "44444444444444444444444444                                              !H#!H...                                              ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10509");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("...H!IH!IH                                                                                                                                                                                                                                                                                                                                                                                                ");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10510");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("!H                    4ih                !H                    4ih                !H    ", "iiiiiiiiiiiiiiiiiiiiihi!h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!H                    4ih                !H                    4ih                !H    " + "'", str2, "!H                    4ih                !H                    4ih                !H    ");
    }

    @Test
    public void test10511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10511");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace("                                                                                                                                                                                                                                                                                                                 I!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10512");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("", "I                           HI!HI!HI!HI!HI!HI                             ...I                           HI!HI!HI!HI!HI!HI                             ...I                           HI!HI!HI!HIaaaaaihaaaaaihaaaaaihaaaaaihaaaaaaaaihaaaaaihaaaaaihaaaaaihaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10513");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!H!H...", (int) (byte) 100, 123);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test10514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10514");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("    h!", 223);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    h!" + "'", str2, "    h!");
    }

    @Test
    public void test10515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10515");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable("                ###hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi####");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10516");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("ia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hi", "aaaaaihaaaaaihaaaaaihaaaaaihaaaaaaaaihaaaaaihaaaaaihaaaaaihaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10517");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("######################################################################hI!I!I!I!I!I!I!I!I!II", ".....44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!4444...", 24);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10518");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###", "         ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###      ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###" });
    }

    @Test
    public void test10519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10519");
        char[] charArray13 = new char[] { '4', 'a', '#', '#', 'a', '4' };
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("", charArray13);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("", charArray13);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("HI!HI!H...", charArray13);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny("...       ...       ...       ...       ...       ...       ..", charArray13);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny("HHII!HII!H!HIIIIIIII!HII!H!HIIIIIIII!HII!H!HIIIIIIII!HII!H!HIIIIIIII!HII!H!HIIIIIIII!HII!H!HIIIIIIII!HI", charArray13);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsAny("    hi!hhi!i!       hi!hhi!i!                                                                                                                                                                                                                                                                                                                                                                                                                    ", charArray13);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsNone("aaaahi#!aaaaa                                                                                    ", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '4', 'a', '#', '#', 'a', '4' });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test10520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10520");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi#!           ###HHI####           ...           ###HHI####           ...           ###HHI####  ", "I                                  #################################################################");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi#!           ###HHI####           ...           ###HHI####           ...           ###HHI####  " });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi#!           ###HHI####           ...           ###HHI####           ...           ###HHI####  " + "'", str3, "hi#!           ###HHI####           ...           ###HHI####           ...           ###HHI####  ");
    }

    @Test
    public void test10521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10521");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("###hhi####    ...", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", 338);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        java.lang.String[] strArray8 = new java.lang.String[] {};
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray8);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray8, "hi!");
        int int12 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("hi!", strArray11);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.startsWithAny("hI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI", strArray11);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray11);
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.stripAll(strArray11);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray4, strArray16);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "###hhi####    ..." });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "###hhi####    ..." + "'", str5, "###hhi####    ...");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str17, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10522");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                              ####################################################################################", "               hi4                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                              ####################################################################################" + "'", str2, "                              ####################################################################################");
    }

    @Test
    public void test10523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10523");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("    hHHHHHHHHH     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "    hHHHHHHHHH    " + "'", str1, "    hHHHHHHHHH    ");
    }

    @Test
    public void test10524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10524");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("iHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH", "                                                                                                                                                                                                                         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "iHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH" + "'", str2, "iHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH");
    }

    @Test
    public void test10525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10525");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("                                                                                                                                                        HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################                                                                                                                                                        aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "4           ###HHI####           44           ###HHI####           44           ###HHI####           44           ###HHI####           44           ######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH##");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10526");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("HI#                             #####################################", "##############################################################################################################################################################HI!IIIIIIIIIIIIIIIIIIIIIIIIIIIIHI!H###############################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI#                             #####################################" + "'", str2, "HI#                             #####################################");
    }

    @Test
    public void test10527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10527");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("hH4444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#444444444################################################################ i4444444444444444444444444444444444#44444444444444444444444444!i!       ", "I!HI!H...  I                         ...   HI!HI!H...  I                         ...   HI!HI!H...  I                         ...   HI!HI!H...  I                         ...   HI!HI!H...  I                         ...   HI!HI!H...  I                         ...   HI!HI!H...  I                         ...   HI!HI!H...  I                         ...   HI!HI!H...", "hi.I..I...I..I......I..I...I..I..!");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test10528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10528");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("44444HI!44444", "...       ...", (int) '4');
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("444444444444444444444444444444444444444444hHI!i!       444444444444444444444444444444444444444444", "Hi!                          ", 132);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("444444444444444444hHI!i!       444444444444444444444444444444444444444444", strArray4, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 12");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "44444HI!44444" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "444444444444444444444444444444444444444444h", "I", "", "", "", "", "", "", "", "", "", "444444444444444444444444444444444444444444" });
    }

    @Test
    public void test10529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10529");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("I!i!", "I                    ###HHI####              ", 28);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "!i!" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test10530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10530");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("!H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H                                                                      ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test10531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10531");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("HHI!I!", "    H!", 178);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10532");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("###hhi###", 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10533");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("HI#!HHHHHHHHHHHHHHHHHHHHHHHHH", "I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10534");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("    ...       ...       .hI!I!I!I!I!I!I!I!I!IIhI!I!I!I!I!I!I!I!I!IIhI!I!I!I!I!I!I!I!I!IIhI!I!I!I!I!I!I!I!I!IIhI!I!I!I!I!I!I!I!I!II       ...       ", "########################################################################################################################################################################################################################################################################################                                                                                                                                                                                                                         ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10535");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...4444444444444444444444II4", "        ...        ...HHHHHHHHHHHHH", 198);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "", "", "4444444444444444444444II4" });
    }

    @Test
    public void test10536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10536");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("... !  !... !  !... !  !... !  !... !  !... !  !... !  !... !  !... !  !... !  !... !  !... !  !... !  !... !  !... !  !... !  !... !  !... !  !... !  !... !  !... !  !... !  !... !  !... !  !... !  !... !  !... !  !... !  !... !  !... !  !... !  !... !  !... !  !... !  !", "i!", "                                                                                                                                                                                                                                                                                                                                                                                    ####IHH###           ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     " + "'", str3, "...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ");
    }

    @Test
    public void test10537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10537");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("I!!", "hHI!i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!!" + "'", str2, "I!!");
    }

    @Test
    public void test10538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10538");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("###hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi####");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi####" + "'", str1, "###hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi####");
    }

    @Test
    public void test10539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10539");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("              HH                           H###########aaaaaaaaaaaaaaaaaaa       !ih############", "aaaaaaaaaaaaaaaaaaaaahi#!aaaaaaaaaaaaaaaaaaa.I..I...I..I...I..I...I..I...I..I...I..I...I..I...I..I..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "              HH                           H###########aaaaaaaaaaaaaaaaaaa       !ih############" + "'", str2, "              HH                           H###########aaaaaaaaaaaaaaaaaaa       !ih############");
    }

    @Test
    public void test10540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10540");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("                                                                                                                                                                    ...       ", "##############################################################################################################################################################HI!IIIIIIIIIIIIIIIIIIIIIIIIIIIIHI!H##############################################################", 144, 6);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "      ##############################################################################################################################################################HI!IIIIIIIIIIIIIIIIIIIIIIIIIIIIHI!H##############################################################                    ...       " + "'", str4, "      ##############################################################################################################################################################HI!IIIIIIIIIIIIIIIIIIIIIIIIIIIIHI!H##############################################################                    ...       ");
    }

    @Test
    public void test10541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10541");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                     II                                  II                                  II                                  II ", "!hi!hi!hi!hi!hi!hi!hi!hi!hihhi   ################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                     II                                  II                                  II                                  II " + "'", str2, "                     II                                  II                                  II                                  II ");
    }

    @Test
    public void test10542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10542");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "hia!###HHI##############################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10543");
        int int1 = org.apache.commons.lang3.StringUtils.length("hi####IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH###!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 133 + "'", int1 == 133);
    }

    @Test
    public void test10544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10544");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                ###hh...", "Hi ", 11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10545");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("444444444444444444444444444444444444444444########!4ih#########", "Hi ", 5);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "444444444444444444444444444444444444444444########!4ih#########" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test10546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10546");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("A", "hi !Hi!                          hi !Hi!                          hi !Hi!                          hi !Hi!                          hi !Hi!                          hi !Hi!                          hi !Hi!                          hi !");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10547");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("!H");
        java.lang.String[] strArray5 = new java.lang.String[] {};
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray5);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "hi!");
        int int9 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("hi!", strArray8);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, "");
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!...hi!hi!hi!hi!hi!hi!hi!hi!", 35, 0);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("4444444       4ih###############################4444444       ", strArray3, strArray8);
        java.lang.String[] strArray19 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaa       !ih", '#');
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.replaceEach("       .I..I...I..I...I..I...I..I...I..I...I..I...I..I...I..I..", strArray8, strArray19);
        java.lang.Class<?> wildcardClass21 = strArray8.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "!H" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "4444444       4ih###############################4444444       " + "'", str16, "4444444       4ih###############################4444444       ");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaa       !ih" });
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "       .I..I...I..I...I..I...I..I...I..I...I..I...I..I...I..I.." + "'", str20, "       .I..I...I..I...I..I...I..I...I..I...I..I...I..I...I..I..");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test10548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10548");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("HHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHIHHHHHHHHHHHHHHHHHHHHHH4IHHHIHHHHHHHHHHHHHHHHHHHHHH4IHHHIHHHHHHHHHHHHHHHHHHHHHH4IHHHIHHHHHHHHHHHHHHHHHHHHHH4IHHHIHHHHHHHHHHHHHHHHHHHHHH4IHHHIHHHHHHHHHHHHHHHHHHHHHH4IHHHIHHHHHHHHHHHHHHHHHHHHHH4IHHHIHHHHHHHHHHHHHHHHHHHHHH4IHHHIHHHHHHHHHHHHHHHHHHHHHH4IHHHIHHHHHHHHHHHHHHHHHHHHHH" + "'", str1, "HHIHHHHHHHHHHHHHHHHHHHHHH4IHHHIHHHHHHHHHHHHHHHHHHHHHH4IHHHIHHHHHHHHHHHHHHHHHHHHHH4IHHHIHHHHHHHHHHHHHHHHHHHHHH4IHHHIHHHHHHHHHHHHHHHHHHHHHH4IHHHIHHHHHHHHHHHHHHHHHHHHHH4IHHHIHHHHHHHHHHHHHHHHHHHHHH4IHHHIHHHHHHHHHHHHHHHHHHHHHH4IHHHIHHHHHHHHHHHHHHHHHHHHHH4IHHHIHHHHHHHHHHHHHHHHHHHHHH");
    }

    @Test
    public void test10549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10549");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("4444HI!44444I!HI!H...44444HI!44444", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 33 + "'", int2 == 33);
    }

    @Test
    public void test10550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10550");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("I!I!", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10551");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("I!HI!H...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10552");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("##################################################################################################################################################", "#####################################################################################################44444HI!44444I!HI!H44444HI!44444                                                                 ##########################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10553");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("...H!IH!IH44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "I                         ...44444444444444444444444", 105);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "...H!IH!IH44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" });
    }

    @Test
    public void test10554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10554");
        java.lang.String[] strArray1 = new java.lang.String[] {};
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10555");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("##################################################################################################################################################", "hHI!i!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##################################################################################################################################################" + "'", str2, "##################################################################################################################################################");
    }

    @Test
    public void test10556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10556");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("I                    ###HHI####             ", "a...       .#hhi#       ...");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test10557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10557");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("...H!IH!IH44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 393, "IHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...H!IH!IH44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444IHH                        IHH                        IHH                        IHH                        IHH   " + "'", str3, "...H!IH!IH44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444IHH                        IHH                        IHH                        IHH                        IHH   ");
    }

    @Test
    public void test10558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10558");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("         ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###      ", 375, "       ...       ###hhi####    ...       ...       .                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "         ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###             ...       ###hhi####    ...       ...       .                                                                                                             " + "'", str3, "         ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###             ...       ###hhi####    ...       ...       .                                                                                                             ");
    }

    @Test
    public void test10559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10559");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("h!", (int) 'a', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                               h!                                                " + "'", str3, "                                               h!                                                ");
    }

    @Test
    public void test10560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10560");
        char[] charArray13 = new char[] { '4', 'a', '#', '#', 'a', '4' };
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("", charArray13);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("hi!       ", charArray13);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly("HI!", charArray13);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny("I                                  #################################################################", charArray13);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone("########!4ih#########", charArray13);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone("HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!", charArray13);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly("!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '4', 'a', '#', '#', 'a', '4' });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test10561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10561");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("!h", "HiI                    ###HHI####              I                    ###HHI####              I                    ###HHI####              I                    ###HHI####              I                    ###HHI####              I      ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10562");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                                                     HHHHHHHHHHHHHHH                                                                                                     ", "I!HI..#!");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                                                                                     HHHHHHHHHHHHHHH                                                                                                     " });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                                                                     HHHHHHHHHHHHHHH                                                                                                     " + "'", str4, "                                                                                                                     HHHHHHHHHHHHHHH                                                                                                     ");
    }

    @Test
    public void test10563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10563");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("##########################################################################################################################################################4HI!4I!HI!H4HI!4#########################################################################################################################################################", "    HI!HHI!I!       HI!HHI!I!  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10564");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("                               ###hhi####    ...", "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!i!...");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test10565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10565");
        int int1 = org.apache.commons.lang3.StringUtils.length("          HI#!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 14 + "'", int1 == 14);
    }

    @Test
    public void test10566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10566");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("4444444444444444444444444444444444444444!aih                                                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444!AIH                                                " + "'", str1, "4444444444444444444444444444444444444444!AIH                                                ");
    }

    @Test
    public void test10567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10567");
        char[] charArray10 = new char[] { '4', 'a', '#', '#', 'a', '4' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("HI!HI!H...", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny("          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!        hi!           hhi           ...           hhi           ...           hhi            hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!         ", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', 'a', '#', '#', 'a', '4' });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 12 + "'", int14 == 12);
    }

    @Test
    public void test10568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10568");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("                                                                                                                  ", "!aih                                                ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10569");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("hhhhhhhhhhI                                  #################################################################                           HI!   HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!..", "HI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhhhhhhhI                                  #################################################################                           HI!   HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!.." + "'", str2, "hhhhhhhhhhI                                  #################################################################                           HI!   HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!..");
    }

    @Test
    public void test10570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10570");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("###HHI####    ...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###HHI####    ..." + "'", str1, "###HHI####    ...");
    }

    @Test
    public void test10571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10571");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("I!i!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i!I!" + "'", str1, "i!I!");
    }

    @Test
    public void test10572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10572");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "hi!");
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("hi!", strArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, "");
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, "###hhi####", (int) '#', (int) (byte) 0);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray6);
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("      HI#!", "           ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###           ");
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("ia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hi", strArray6, strArray17);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny("hi!       ", strArray17);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "      HI#!" });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hi" + "'", str18, "ia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hi");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test10573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10573");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("", 334, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10574");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("!#IH      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!#IH      " + "'", str1, "!#IH      ");
    }

    @Test
    public void test10575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10575");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("i                                  ################################################################");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "i", "                                  ", "################################################################" });
    }

    @Test
    public void test10576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10576");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "...  hia...  hia...  hia...  hia...  hia...  hia...  hia...  hia...  h.       ...       ...       ..", 352);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
    }

    @Test
    public void test10577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10577");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("     H    ", '#', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "     H    " + "'", str3, "     H    ");
    }

    @Test
    public void test10578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10578");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     " + "'", str2, "...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ...     ");
    }

    @Test
    public void test10579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10579");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String[] strArray6 = new java.lang.String[] {};
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray6);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray5, strArray6);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "HI#");
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitByCharacterType("hi!");
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray12);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray12, 'a');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray12);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEach("44444HI!44444I!HI!H...44444HI!4444", strArray5, strArray12);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny("hhhHI#!hhhhhhhhhhhhhhhhhhhhhhhhhHI#!hhhhhhhhhhhhhhhhhhhhhhhhhHI", strArray5);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny("########!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#########", strArray5);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi", "!" });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hia!" + "'", str15, "hia!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "44444HI!44444I!HI!H...44444HI!4444" + "'", str17, "44444HI!44444I!HI!H...44444HI!4444");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test10580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10580");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("HHIHHHHHHHHHHHHHHHHIHHHHHHHHHHHHHH", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHIHHHHHHHHHHHHHHHHIHHHHHHHHHHHHHH" + "'", str2, "HHIHHHHHHHHHHHHHHHHIHHHHHHHHHHHHHH");
    }

    @Test
    public void test10581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10581");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  ", "##############################HI!########################### HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##############################HI!########################### HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI" + "'", str2, "##############################HI!########################### HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI");
    }

    @Test
    public void test10582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10582");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###", "44444HI!44444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10583");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!", "444444444444444444444444444444444444444444hHI!i!       444444444444444444444444444444444444444444", 10);
        java.lang.String[] strArray8 = new java.lang.String[] {};
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray8);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray8, "hi!");
        int int12 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("hi!", strArray11);
        java.lang.String[] strArray14 = new java.lang.String[] {};
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray14);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray14, "");
        java.lang.String[] strArray18 = new java.lang.String[] {};
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray18);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray18, "");
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.replaceEach("hi!", strArray14, strArray18);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.replaceEach("HI!", strArray11, strArray18);
        int int24 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                         HI!HI!H...", strArray18);
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.replaceEach("hia!", strArray4, strArray18);
        java.lang.String[] strArray26 = org.apache.commons.lang3.StringUtils.stripAll(strArray18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray18, "hi!aaaaaaaaaaaaaaaaaaaI44444444...", 44, 338);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 44 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "HI!" + "'", str23, "HI!");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hia!" + "'", str25, "hia!");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] {});
    }

    @Test
    public void test10584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10584");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA###HHI####    ...", 26, 29);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...AAAAAAAAAAAAAAAAAAAAAAA..." + "'", str3, "...AAAAAAAAAAAAAAAAAAAAAAA...");
    }

    @Test
    public void test10585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10585");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("!AIH          ", "ia!          hia!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!AIH          " + "'", str2, "!AIH          ");
    }

    @Test
    public void test10586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10586");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("#################################################################IIIIIH!IH!IH!IH!IH!IH!IH                           I", 270, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#################################################################IIIIIH!IH!IH!IH!IH!IH!IH                           Iaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "#################################################################IIIIIH!IH!IH!IH!IH!IH!IH                           Iaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10587");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("                                                44444444444444444444444444444444                                                ", 5);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "     " + "'", str2, "     ");
    }

    @Test
    public void test10588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10588");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("AAAAAAAAAI", "hIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIH");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "AAAAAAAAAI" });
    }

    @Test
    public void test10589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10589");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("hi!hi!h...  i                         ...   hi!hi!h...  i                         ...   hi!hi!h...  i                         ...   hi!hi!h...  i                         ...   hi!hi!h...  i                         ...   hi!hi!h...  i                         ...   hi!hi!h...  i                         ...   hi!hi!h...  i                         ...   hi!hi!h...", "      hia!HHHHHHHHHHHHHHHHHHHHHHHHH      hia!HHHHHHHHHHHHHHHHHHHHHHHHH      hia!HHHHHHHHHHHHHHHHHHHHHHHHH      hia!HHHHHHHHHHHHHHHHHHHHHHHHH      hia!HHHHHHHHHHHHHHHHHHHHHHHHH      hia!HHHHHHHHHHHHHHHHHHHHHHHHH      hia!HHHHHHHHHHHHHHHHHHHHHHHHH      hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10590");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("IH", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA###hhi####    ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10591");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("HI!HI!H...", "                               ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10592");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) ".. ... ... ... ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10593");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!4ih");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "!4ih" });
    }

    @Test
    public void test10594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10594");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("###############IHH#############################IHH#############################IHH#############################IHH#############################IHH#############################IHH#############################IHH#############################IHH#############################IHH#############################IHH#############################IHH#############################IHH#############################IHH##################HHI###############...", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###############IHH#############################IHH#############################IHH#############################IHH#############################IHH#############################IHH#############################IHH#############################IHH#############################IHH#############################IHH#############################IHH#############################IHH#############################IHH##################HHI###############..." + "'", str2, "###############IHH#############################IHH#############################IHH#############################IHH#############################IHH#############################IHH#############################IHH#############################IHH#############################IHH#############################IHH#############################IHH#############################IHH#############################IHH##################HHI###############...");
    }

    @Test
    public void test10595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10595");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("                                                                                                                     HHHHHHHHHHHHHHH                                                                                                      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10596");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("                                                                                                                                         aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah", 48);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                " + "'", str2, "                                                ");
    }

    @Test
    public void test10597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10597");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!        HI!           HHI           ...           HHI           ...           HHI            hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10598");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("4444444                                                                                                                                                                                      444444444444444444444444444444444444444444HHI!I!       444444444444444444444444444444444444444444", 145, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test10599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10599");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("i", "    H     ", 3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray4);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("       ...       ...       ...       ...       .....       ...       ...       ...       ...       ...       ..", "hi4!hi4!hi4!hi4!hi4!hi4!HHHHHHI!I!.i!HI!H...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray8);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                                                                                                                                                                  .....................................                                                                                                                                                                                  ", strArray4, strArray9);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "i" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "       ...       ...       ...       ...       .....       ...       ...       ...       ...       ...       .." });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "...       ...       ...       ...       .....       ...       ...       ...       ...       ...       .." });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "                                                                                                                                                                                  .....................................                                                                                                                                                                                  " + "'", str10, "                                                                                                                                                                                  .....................................                                                                                                                                                                                  ");
    }

    @Test
    public void test10600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10600");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 279, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10601");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("###I           ##", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 17 + "'", int2 == 17);
    }

    @Test
    public void test10602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10602");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("aaaaaaaaaaahia!###HHIaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaahia!###HHIaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaahia!###HHIaaaaaaaaaaa");
    }

    @Test
    public void test10603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10603");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("hI#                             #####################################", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hI#                             #####################################" + "'", str2, "hI#                             #####################################");
    }

    @Test
    public void test10604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10604");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("Hi#                             ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10605");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!H!H...                                             ", "hi4!hi4!hi4!hi4!hi4!hi4!HHHHHHI!I!.i!HI!H...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "", "", "", "", "", "", "                                             " });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test10606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10606");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("Hhhhhhhhhh44444HI!44444                                                                     ", "4H!H!###H!HHIH!####H!H!4", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10607");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..." + "'", str1, "...");
    }

    @Test
    public void test10608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10608");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("I", "                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                    " + "'", str2, "                    ");
    }

    @Test
    public void test10609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10609");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA###hhi####    ...", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA###hhi####    ..." + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA###hhi####    ...");
    }

    @Test
    public void test10610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10610");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("44444!IH44444...H!IH!I44444!IH44444", 334, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444!IH44444...H!IH!I44444!IH44444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "44444!IH44444...H!IH!I44444!IH44444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10611");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("           HHI           ...");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "           ", "HHI", "           ", "..." });
    }

    @Test
    public void test10612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10612");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable("####ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10613");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith(".I..I.", "HI!HI!H");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10614");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("####IHH###...####IHH###...####IHH###!#IH", "      hi#!                           HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "####IHH###...####IHH###...####IHH###!#IH" + "'", str2, "####IHH###...####IHH###...####IHH###!#IH");
    }

    @Test
    public void test10615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10615");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi###");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi###" + "'", str1, "###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi###");
    }

    @Test
    public void test10616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10616");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                                           ...       ...       ...       ...       ..                                                    ", 103, "####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                           ...       ...       ...       ...       ..                                                    " + "'", str3, "                                                           ...       ...       ...       ...       ..                                                    ");
    }

    @Test
    public void test10617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10617");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("         ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###      ", 223, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                  ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###      " + "'", str3, "                  ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###      ");
    }

    @Test
    public void test10618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10618");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("4           ###HHI####           4                                                                 ", 663, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4           ###HHI####           4                                                                 ####################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str3, "4           ###HHI####           4                                                                 ####################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test10619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10619");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("##############################################################   ihhih!ih!ih!ih!ih!ih!ih!ih!ih!ih                           i", "##################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10620");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("H..!I!       ", "                                                                                                                                                                                                                                                                                                                                                                                                     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10621");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("           ###HHI####           ", "  hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10622");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi#!                           HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test10623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10623");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace("444444444444444444444444444444444444444444hhi!i!       444444444444444444444444444444444444444444                                                                                                     HH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10624");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("   hhi    ", "####################################IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH###################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10625");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("", "####IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH##");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10626");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty(".HII4....HI", "I!HI!H...  I                         ...   HI!HI!H...  I                         ...   HI!HI!H...  I                         ...   HI!HI!H...  I                         ...   HI!HI!H...  I                         ...   HI!HI!H...  I                         ...   HI!HI!H...  I                         ...   HI!HI!H...  I                         ...   HI!HI!H...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".HII4....HI" + "'", str2, ".HII4....HI");
    }

    @Test
    public void test10627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10627");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("...h!ih!ih", "    hi!hhi!i!       hi!hhi!i!  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10628");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("IIIIIIIIIIIIIIIIIIIIIIIIIIII", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10629");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("           ###HHI####           ");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("I                                  ################################################################", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "           ", "###", "HHI", "####", "           " });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 96 + "'", int3 == 96);
    }

    @Test
    public void test10630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10630");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("############################################################################################################################################################################################################################################################################################################I                                  ", '4', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "############################################################################################################################################################################################################################################################################################################I                                  " + "'", str3, "############################################################################################################################################################################################################################################################################################################I                                  ");
    }

    @Test
    public void test10631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10631");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("...AAAAAAAAAAAAAAAAAAAAAAA...", "...       ...       ...       ...       ...       .....       ...       ...       ...       ...       ...       ..");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 108 + "'", int2 == 108);
    }

    @Test
    public void test10632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10632");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("!H!H...                                             ", " HI!HI!H");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10633");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("4444444444444444444444444444H!H!###H!HHIH!####H!H!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444H!H!###H!HHIH!####H!H!" + "'", str1, "4444444444444444444444444444H!H!###H!HHIH!####H!H!");
    }

    @Test
    public void test10634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10634");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("#########################################################################################################################################################44444hi!44444i!hi!h44444hi!44444    ...       .#hhi#       ...                      #########################################################################################################################################################", 9);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#########" + "'", str2, "#########");
    }

    @Test
    public void test10635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10635");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("###HHI####    .", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10636");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("####I           ####I           ####I           ####I           ####I           ####I...", "   HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10637");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!      ...", "i           ###HHI####              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!      ..." + "'", str2, "hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!      ...");
    }

    @Test
    public void test10638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10638");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("i                                  ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i                                  " + "'", str2, "i                                  ");
    }

    @Test
    public void test10639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10639");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("##############################################################################################################################################################HI!IIIIIIIIIIIIIIIIIIIIIIIIIIIIHI!H###############################################################################################################################################################", "H!IH!IH");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "##############################################################################################################################################################HI!IIIIIIIIIIIIIIIIIIIIIIIIIIIIHI!H###############################################################################################################################################################" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##############################################################################################################################################################HI!IIIIIIIIIIIIIIIIIIIIIIIIIIIIHI!H###############################################################################################################################################################" + "'", str3, "##############################################################################################################################################################HI!IIIIIIIIIIIIIIIIIIIIIIIIIIIIHI!H###############################################################################################################################################################");
    }

    @Test
    public void test10640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10640");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("                     HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################4444444", 334, 33);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test10641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10641");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("           ####IHH###                      ####IHH###                      ####IHH###                  HH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###            ###HHI####           ...");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10642");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("...HHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "...", "HHHHH", "      ", "hi", "#!", "HHHHHHHHHHHHHHHHHHHHHHHHH", "      ", "hi", "#!", "HHHHHHHHHHHHHHHHHHHHHHHH" });
    }

    @Test
    public void test10643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10643");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("HI#!           ###HHI####           ...           ###HHI####           ...           ###HHI####  ", "..       ...       ...       ...       ...       ...       .....       ...       ...       ...       ...       ...                                                                                                                                                                                                                              ");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    ", strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "HI#!           ###HHI####           ...           ###HHI####           ...           ###HHI####  " });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HI#!           ###HHI####           ...           ###HHI####           ...           ###HHI####  " + "'", str4, "HI#!           ###HHI####           ...           ###HHI####           ...           ###HHI####  ");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HI#!           ###HHI####           ...           ###HHI####           ...           ###HHI####  " + "'", str6, "HI#!           ###HHI####           ...           ###HHI####           ...           ###HHI####  ");
    }

    @Test
    public void test10644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10644");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("#", "hi!                          ", "    hHHHHHHHHH     ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test10645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10645");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("###hhi...####hhi...####hhi...####hhi.aaaaaaaaaaaaaaaaaaaaaaaaaahi####hhi...####hhi...####hhi...####hhi.", "hHI!#!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###hhi...####hhi...####hhi...####hhi.aaaaaaaaaaaaaaaaaaaaaaaaaahi####hhi...####hhi...####hhi...####hhi." + "'", str2, "###hhi...####hhi...####hhi...####hhi.aaaaaaaaaaaaaaaaaaaaaaaaaahi####hhi...####hhi...####hhi...####hhi.");
    }

    @Test
    public void test10646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10646");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("hi!aaaaaaaaaaaaaaaaaaaI                                  II                                  II hhhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!aaaaaaaaaaaaaaaaaaaI                                  II                                  II hhhh" + "'", str1, "hi!aaaaaaaaaaaaaaaaaaaI                                  II                                  II hhhh");
    }

    @Test
    public void test10647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10647");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("I!HI!H...            ###hhi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I!HI!H...            ###hhi" + "'", str1, "I!HI!H...            ###hhi");
    }

    @Test
    public void test10648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10648");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "...           ####IHH###           !#IH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10649");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("####ihh###                 ####ihh###                 ####ihh###                 ####ihh###                 ####ihh###                 ####ihh###                 ####ihh###                 ####ihh###                 ####ihh###");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10650");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("          hia!          hia!  ", ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test10651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10651");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable("H!H...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10652");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("       ...", "###H");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10653");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("44444HI!44444I!HI!H...44444HI!44444", "hh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444HI!44444I!HI!H...44444HI!44444" + "'", str2, "44444HI!44444I!HI!H...44444HI!44444");
    }

    @Test
    public void test10654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10654");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("                               ...hhi....    ...", "####I           ####I           ####I           ####I           ####I           ####I...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10655");
        char[] charArray7 = new char[] { 'a', ' ' };
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("hi!", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly("HHH", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny("44444HI!44444", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone("4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4iHi!                          ", charArray7);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny("          ...           ###HHI####           ...           ###HHI####            ...           ###HHI####           ...           ###HHI####            ...           ###HHI####           ...           ###HHI####            ...           ###HHI####           ...          hi####IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH###!", charArray7);
        java.lang.Class<?> wildcardClass13 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { 'a', ' ' });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test10656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10656");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("i", "#################################################################   IHHIH!IH!IH!IH!IH!IH!IH!IH!IH!IH                           ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10657");
        int int1 = org.apache.commons.lang3.StringUtils.length("                   ###hhi####    .");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 34 + "'", int1 == 34);
    }

    @Test
    public void test10658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10658");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("########!4IH#########", "  I                                                                          ...                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "########!4IH#########" + "'", str2, "########!4IH#########");
    }

    @Test
    public void test10659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10659");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("            ...H!IH!", ' ', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaa...H!IH!" + "'", str3, "aaaaaaaaaaaa...H!IH!");
    }

    @Test
    public void test10660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10660");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("###hhi####    ...", "   hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!i!...");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI444444444444444444444444444444444444444444HHI!I!       444444444444444444444444444444444444444444hhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI", "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!...hi!hi!hi!hi!hi!hi!hi!hi!", 497);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("###hhi####    ...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ", strArray5, strArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny("aaaaaaaaaaaaaaaaaaaa4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4aaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                    !44444", strArray5);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.startsWithAny("hi       ...       ...       ...       ...       .....       ...       ...       ...       ...       ...       ..!", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "###hhi####    ..." });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI444444444444444444444444444444444444444444HHI!I!       444444444444444444444444444444444444444444hhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI" });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI444444444444444444444444444444444444444444HHI!I!       444444444444444444444444444444444444444444hhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                " + "'", str10, "HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI444444444444444444444444444444444444444444HHI!I!       444444444444444444444444444444444444444444hhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test10661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10661");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###hhi####    ...", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahhi    ..." + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahhi    ...");
    }

    @Test
    public void test10662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10662");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("           ", "H!IH!IH ", (int) (short) 0);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "           " });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test10663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10663");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                                                              ...                                  ", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       ..." + "'", str2, "       ...");
    }

    @Test
    public void test10664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10664");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                                                      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi", "HI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaa", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!H H!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi" + "'", str3, "                                                      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi");
    }

    @Test
    public void test10665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10665");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!", "HIH", "...                             ", 23);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!" + "'", str4, "hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!");
    }

    @Test
    public void test10666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10666");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("hHI!i!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "Hi!                          ", "                                                                                                                ...hhi....    ...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h I   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "h I   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10667");
        char[] charArray4 = new char[] {};
        boolean boolean5 = org.apache.commons.lang3.StringUtils.containsAny("HI!HI!H...", charArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsAny("                                                 h                                                  ", charArray4);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsOnly("Hi!                          ", charArray4);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsOnly("4444444444444444444444444", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test10668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10668");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("...       ###hhi####    ...       ...       .", ".. ... ... ... ...               ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10669");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("####.HH###aaaaaaaaaaaaaaaaa####.HH###aaaaaaaaaaaaaaaaa####.HH###aaaaaaaaaaaaaaaaa####.HH###aaaaaaaaaaaaaaaaa####.HH###aaaaaaaaaaaaaaaaa####.HH###aaaaaaaaaaaaaaaaa####.HH###aaaaaaaaaaaaaaaaa####.HH###aaaaaaaaaaaaaaaaa####.HH###");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10670");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test10671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10671");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H !H", "     ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aaaaa!H", "aaaaa!H", "aaaaa!H", "aaaaa!H", "aaaaa!H", "aaaaa!H", "aaaaa!H", "aaaaa!H", "aaaaa!H", "aaaaa!H", "aaaaa!H", "aaaaa!H", "aaaaa!H", "aaaaa!H", "aaaaa!H", "aaaaa!H", "aaaaa!H", "aaaaa!H", "aaaaa!H", "aaaaa!H", "aaaaa!H", "aaaaa!H", "aaaaa!H", "aaaaa!H", "!H" });
    }

    @Test
    public void test10672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10672");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                          #####################################################################################################44444HI!44444I!HI!H44444HI!44444                                                                 ##########################################################################################################################################################                          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#####################################################################################################44444HI!44444I!HI!H44444HI!44444                                                                 ##########################################################################################################################################################" + "'", str1, "#####################################################################################################44444HI!44444I!HI!H44444HI!44444                                                                 ##########################################################################################################################################################");
    }

    @Test
    public void test10673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10673");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace("hhhhhhhhhhhhhhhhhhhhh      HI444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10674");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("hhi!i!       hi!hhi!i!       hi!h          ", "   hhi    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test10675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10675");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("aaai", "I                                  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10676");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("hia!###HH", 'a', 121);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
    }

    @Test
    public void test10677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10677");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                                                                                        HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################                                                                                                                                                        ", "4           ###HHI####           44           ###HHI####           44           ###HHI####           44           ###HHI####           44           ######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#", 16);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                                                                                                                                        HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################                                                                                                                                                        " });
    }

    @Test
    public void test10678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10678");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("               HHHHHHHHHHHHHHH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10679");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("H!IH!IH ", "...         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H!IH!IH" + "'", str2, "H!IH!IH");
    }

    @Test
    public void test10680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10680");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("  ####IHH###           ...           ####IHH###           ...           ####IHH###           !#IH", "44444HI!4ih4444I!HI!H...44444HI!44444", 273);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10681");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       ", 257);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       " + "'", str2, "HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       ");
    }

    @Test
    public void test10682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10682");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("I!HI!H...", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "I!HI!H..." });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I!HI!H..." + "'", str3, "I!HI!H...");
    }

    @Test
    public void test10683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10683");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("#################################################################   IHHIH!IH!IH!IH!IH!IH!IH!IH!IH!IH                           IHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!.", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444I");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 191 + "'", int2 == 191);
    }

    @Test
    public void test10684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10684");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp(" HI#!HHHHHHHHHHHHHHHHHHHHHHHHH     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " HI#!HHHHHHHHHHHHHHHHHHHHHHHHH     " + "'", str1, " HI#!HHHHHHHHHHHHHHHHHHHHHHHHH     ");
    }

    @Test
    public void test10685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10685");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!IHHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!IH", "!aih          !aih          !aih          !aih          !aih          !aih          !aih          !aih          !aih          !aih            IHH           ...           IHH           ...           IHH           !IH        !aih          !aih          !aih          !aih          !aih          !aih          !aih          !aih          !aih          !aih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test10686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10686");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi#                             ", "I           ");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("hhi", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi#                             " });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test10687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10687");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("AhAhAhAhAhAhAhAhAhAhAhAhA", 29, 40);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AhAhAhAhAhAhAhAhAhAhAhAhA" + "'", str3, "AhAhAhAhAhAhAhAhAhAhAhAhA");
    }

    @Test
    public void test10688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10688");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                          ###H", '4');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                                                                                          ###H" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                          ###H" + "'", str3, "                                                                                                                          ###H");
    }

    @Test
    public void test10689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10689");
        char[] charArray9 = new char[] { '#', '#', '#', '4', '4', 'a' };
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny("hi#!           ###HHI####           ...           ###HHI####           ...           ###HHI####", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone("hi#       ...       ", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone("4444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#444444444################################################################ i4444444444444444444444444444444444#44444444444444444444444444", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', '#', '#', '4', '4', 'a' });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test10690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10690");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                                                ", "44444444444HI!i!aaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10691");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("HHHHHHHHHHHHHHHHHHH      hi#!HHHHHH###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ", "           ####I           ####I           ####I           ####I           ####I           ####I           ####I           ####I           ####I H");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10692");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("H I####           I####           I####           I####           I####           I####           I####           I####           I####           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H I####           I####           I####           I####           I####           I####           I####           I####           I####" + "'", str1, "H I####           I####           I####           I####           I####           I####           I####           I####           I####");
    }

    @Test
    public void test10693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10693");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("44444hi !HIhi !!hi !44444                                                 h                                                                                                   h   ", "444444444444444444444444444444              HH             4444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10694");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("   ###", 375);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10695");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("!44444I!HI!H...44444HI!44444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!44444I!HI!H...44444HI!44444" + "'", str1, "!44444I!HI!H...44444HI!44444");
    }

    @Test
    public void test10696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10696");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("#################################################################   IHHIH!IH!IH!IH!IH!IH!IH!IH!IH!IH                           I", 6);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#################################################################   IHHIH!IH!IH!IH!IH!IH!IH!IH!IH!IH                           I" + "'", str2, "#################################################################   IHHIH!IH!IH!IH!IH!IH!IH!IH!IH!IH                           I");
    }

    @Test
    public void test10697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10697");
        java.lang.String[] strArray1 = new java.lang.String[] {};
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "hi!");
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("hi!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '4', 336, (int) (short) 0);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray4);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '4');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, 'a');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test10698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10698");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("hi                            #...!", "i           ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi                            #...!" + "'", str2, "hi                            #...!");
    }

    @Test
    public void test10699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10699");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi4");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "hi4" });
    }

    @Test
    public void test10700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10700");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("i#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!HI!H...            ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10701");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...", "haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H..." + "'", str2, "I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...");
    }

    @Test
    public void test10702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10702");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...", 0, "                                                              ...                                  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ..." + "'", str3, "       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...");
    }

    @Test
    public void test10703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10703");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("", "! IH                          !Ih! IH                          !Ih! IH                          !Ih! IH                          !Ih! IH                          !Ih! IH                          !Ih! IH                          !Ih! IH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10704");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.substringsBetween("", "###hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi####", "HI!IIIIIIIIIIIIIIIIIIIIIIIIIIIIHI!H");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "                hhhhhhhhhhhhhhh");
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "HHHHHHHHHHHHHH");
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("               HHHHHHHHHHHHHHH");
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("  I                                                                          ...                                  444444", strArray10, strArray12);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("HH                        IHH   ", strArray4, strArray10);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "HHHHHHHHHHHHHHH" });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "  I                                                                          ...                                  444444" + "'", str13, "  I                                                                          ...                                  444444");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HH                        IHH   " + "'", str14, "HH                        IHH   ");
    }

    @Test
    public void test10705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10705");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIHI!i!aaa!H!H...Hhi!I!IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", "                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIHI!i!aaa!H!H...Hhi!I!IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII" + "'", str2, "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIHI!i!aaa!H!H...Hhi!I!IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
    }

    @Test
    public void test10706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10706");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("I#                             ####################", "Hhhhhhhhhh44444HI!44444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10707");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("                                                                                                                              aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                              ", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test10708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10708");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("", ' ');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!       ", "HHI");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", strArray4, strArray8);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray8);
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.split("I!HI!H...", "I                                  ", (int) ' ');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray16);
        java.lang.String[] strArray19 = org.apache.commons.lang3.StringUtils.splitByCharacterType("hi!");
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("Hi!                          ", strArray16, strArray19);
        java.lang.String[] strArray22 = org.apache.commons.lang3.StringUtils.stripAll(strArray16, "444444444444444444444444444444444444444444hHI!i!       444444444444444444444444444444444444444444");
        boolean boolean23 = org.apache.commons.lang3.StringUtils.startsWithAny("...#ihh###", strArray16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = org.apache.commons.lang3.StringUtils.replaceEach("                    HH              ...             HH                                  HH              ...             HH                                  HH              ...             HH                                  HH              ...             HH                                  HH              ...             HH                                  HH              .....             HH                                  HH              ...             HH                                  HH              ...             HH                                  HH              ...             HH                                  HH              ...             HH                                  HH              ...             HH                                  HH              ..", strArray10, strArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!       " });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI" + "'", str9, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "!H", "!H..." });
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "!H" + "'", str17, "!H");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi", "!" });
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hi!                          " + "'", str20, "Hi!                          ");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "", "..." });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test10709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10709");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("...    ####ihh###aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 103, (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...aaaaaaaaaaaaaaaaaaaaaaaaaaaaa..." + "'", str3, "...aaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
    }

    @Test
    public void test10710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10710");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("                         ...                         ...                             ...                         ...    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10711");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("I                           HI!   HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!..");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny("##############################HI!########################### HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "I", "                           ", "HI", "!", "   ", "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI", "!", "I", "!.." });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 30 + "'", int3 == 30);
    }

    @Test
    public void test10712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10712");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                                                                                                          ###H", "4444444444444444444444444", 198);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                                                                                                          ###H" });
    }

    @Test
    public void test10713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10713");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("...H!IH!IH4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10714");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(" HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                            ...", "I           ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test10715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10715");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace("       ...       ...       ...       ...       ..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10716");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("hi!");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "HH", 3, 0);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray2);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "hi4!");
        boolean boolean10 = org.apache.commons.lang3.StringUtils.startsWithAny("HI", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi", "!" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test10717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10717");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("", "H  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10718");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "##############################################################   ihhih!ih!ih!ih!ih!ih!ih!ih!ih!ih                           i");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
    }

    @Test
    public void test10719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10719");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("#######", "H", "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!i!...hi!hi!hi!hi!hi!hi!hi!hi!                ", 314);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#######" + "'", str4, "#######");
    }

    @Test
    public void test10720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10720");
        char[] charArray14 = new char[] { '4', 'a', '#', '#', 'a', '4' };
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("", charArray14);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("hi!       ", charArray14);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny("###hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi####", charArray14);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly("                               ###HHI####    ...", charArray14);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("!H hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!h", charArray14);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly("..       ...       ...       ...       ...       ...       .....       ...       ...       ...       ...       ...", charArray14);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("########!4ih#########", charArray14);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsAny("hi4!HHHHHHI!I!.i!HI!H...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi#!hi#!hi#!hi#!hi#!hi#hi", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4', 'a', '#', '#', 'a', '4' });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test10721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10721");
        char[] charArray8 = new char[] { 'a', ' ' };
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("hi!", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly("HHH", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("44444HI!44444", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone("4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4iHi!                          ", charArray8);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny("hi#!           ###hhi####           ...           ###hhi####           ...           ###hhi####  ", charArray8);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone("4", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { 'a', ' ' });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test10722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10722");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("aaaaaaaaaaaaaaaaaaaa4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4aaaaaaaaaaaaaaaaaaaaa", "4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4iHi!                          ", 243);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10723");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("4HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H..hi!       aaaaaaaaaaaaaaaaaaa4HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H..", 324, 33);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44HI!44444I!HI!H...44444HI!444444" + "'", str3, "44HI!44444I!HI!H...44444HI!444444");
    }

    @Test
    public void test10724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10724");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                ..................                                                                                ", "hi!4aaaaaaaaaaaaaaaaaaaaaa", 20);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                                                                ..................                                                                                " });
    }

    @Test
    public void test10725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10725");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("444hhi4444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10726");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                                             H!IH!IH                                             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H!IH!IH" + "'", str1, "H!IH!IH");
    }

    @Test
    public void test10727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10727");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!                                                                                                                              ", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hhi!i!hi!hhi!i!hi!hhi!i!hi!hhi!i!hi!hhi!i!hi!hhi!i!hi!hhi!i!hi!hhi!i!hi!hhi!i!hi!" + "'", str2, "hi!hhi!i!hi!hhi!i!hi!hhi!i!hi!hhi!i!hi!hhi!i!hi!hhi!i!hi!hhi!i!hi!hhi!i!hi!hhi!i!hi!");
    }

    @Test
    public void test10728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10728");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("                HHHHHHHHHHHHHHH", ".....44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!4444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10729");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("I!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...", (int) (byte) 10, 93);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H..." + "'", str3, "!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...");
    }

    @Test
    public void test10730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10730");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("...4444444444444444444444II4hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!i!..", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 27 + "'", int2 == 27);
    }

    @Test
    public void test10731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10731");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                HHHHHHHHHHHHHH", "#IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH###", 243);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10732");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("                            #...", "hi4");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10733");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                                                                                ...hhi....    ...", 103, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                ...hhi....    ..." + "'", str3, "                                                                                                                ...hhi....    ...");
    }

    @Test
    public void test10734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10734");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("!AIH##################################hiaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!AIH##################################hiaaaaa" + "'", str1, "!AIH##################################hiaaaaa");
    }

    @Test
    public void test10735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10735");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("hi                    !", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10736");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween(" !", "...                            ", "44444444444444444444444444                                              !H#!H...     ...");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test10737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10737");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("hi#!                                                                                                                                                                                                                                                                                                                                            ", "                                                                                             aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###hhi####    ...                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test10738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10738");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("I                                  II                                  II                                  II                                  II                                  II                                  II                                  II                                  II                                  II                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I                                  II                                  II                                  II                                  II                                  II                                  II                                  II                                  II                                  II" + "'", str1, "I                                  II                                  II                                  II                                  II                                  II                                  II                                  II                                  II                                  II");
    }

    @Test
    public void test10739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10739");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("ih", "          ...           ###HHI####           ...           ###HHI####            ...           ###HHI####           ...           ###HHI####            ...           ###HHI####           ...           ###HHI####            ...           ###HHI####           ...          hi####IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH###!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ih" + "'", str2, "ih");
    }

    @Test
    public void test10740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10740");
        char[] charArray10 = new char[] { '4', 'a', '#', '#', 'a', '4' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("", charArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("hi!       ", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("i", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', 'a', '#', '#', 'a', '4' });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test10741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10741");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("HI4!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI4!" + "'", str1, "HI4!");
    }

    @Test
    public void test10742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10742");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("                                                                              HI!HI!H...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...H!IH!IH                                                                              " + "'", str1, "...H!IH!IH                                                                              ");
    }

    @Test
    public void test10743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10743");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI##############################HI!###########################", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10744");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                                           ...       ...       ...       ...       ..                                                    ", ' ', 126);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 126 + "'", int3 == 126);
    }

    @Test
    public void test10745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10745");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("I                         ...", "Hi#...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10746");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("", "...hI!                ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10747");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI", "HI!HI!H...", 91);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '#', 89, 255);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 89 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI" });
    }

    @Test
    public void test10748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10748");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase("...#################...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10749");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("                     HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################HHI####...                     HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   ##############");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                     HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################HHI####...                     HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   ##############" + "'", str1, "                     HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################HHI####...                     HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   ##############");
    }

    @Test
    public void test10750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10750");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("!H!H...Hhi!I!", "                         hhi!i!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10751");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!      ...", "                                I                         ...aa###HHI####aaaaaaaaaaa...                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test10752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10752");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("i                                  ################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10753");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("HHHHHHHHHHHHHH", 5, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HHHHHHHHHHHHHH" + "'", str3, "HHHHHHHHHHHHHH");
    }

    @Test
    public void test10754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10754");
        int int1 = org.apache.commons.lang3.StringUtils.length("Hi !                                                                                               !aih                                                                                    ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 187 + "'", int1 == 187);
    }

    @Test
    public void test10755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10755");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("Hhi!I!", "                                             HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI444444444444444444444444444444444444444444HHI!I!       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10756");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("HI#!", "                                                                  4           ####IHH###...");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HI#!" });
    }

    @Test
    public void test10757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10757");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("h I   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10758");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("I                                                                          ...", "HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA###HHI####    ...", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "I                                                                          ..." });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "I                                                                          ..." });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test10759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10759");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("IIIIIIIIIIIIIIIIIIIIIIIIIIII", "", 32);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.split("", ' ');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray9);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray9);
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hia!###HHI", "HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH", (int) (short) 1);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray15);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEach("#######", strArray11, strArray15);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("Hi !", strArray5, strArray11);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray5);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5);
        java.lang.String[] strArray23 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("###hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi####", '4');
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                                      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI444444444444444444444444444444444444444444HHI!I!       444444444444444444444444444444444444444444hhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI", strArray5, strArray23);
        java.lang.String[] strArray26 = org.apache.commons.lang3.StringUtils.stripAll(strArray23, "HI!HI!HI!HI!HI!HI!HI!H           ####I           ####I           ####I           ####I           ####I           ####I...");
        java.lang.String str28 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray23, "!HHHHHHI!I!.i!HI!H...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi#!hi#!hi#!hi#!hi#!hi#hi");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "IIIIIIIIIIIIIIIIIIIIIIIIIIII" });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hia!###HHI" });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hia!###HHI" + "'", str16, "hia!###HHI");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#######" + "'", str17, "#######");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hi !" + "'", str18, "Hi !");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "IIIIIIIIIIIIIIIIIIIIIIIIIIII" + "'", str19, "IIIIIIIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "IIIIIIIIIIIIIIIIIIIIIIIIIIII" + "'", str20, "IIIIIIIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "###hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi####" });
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "                                                      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI444444444444444444444444444444444444444444HHI!I!       444444444444444444444444444444444444444444hhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI" + "'", str24, "                                                      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI444444444444444444444444444444444444444444HHI!I!       444444444444444444444444444444444444444444hhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi" });
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "###hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi####" + "'", str28, "###hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi####");
    }

    @Test
    public void test10760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10760");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("     HI!   HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!...      ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "     HI!   HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!...      " + "'", str2, "     HI!   HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!...      ");
    }

    @Test
    public void test10761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10761");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                          HI!HI!H...");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test10762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10762");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!iaaaaaaaaaaaaaaaaaaaaaaaaa!i!IHhih!ih!ih!ih!ih!ih...H!IH!I");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!iaaaaaaaaaaaaaaaaaaaaaaaaa!i!IHhih!ih!ih!ih!ih!ih...H!IH!I" });
    }

    @Test
    public void test10763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10763");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("HHHHHHHHHHHHHHHHHHHHHHH      hi!HHHHHHHHHHHHHHHHHHHHHHHHH      hi!HHHHHHHHHHHHHHHHHHHHHHHHH      hi!HHHHHHHHHHHHHHHHHH                         ", "###########aaaaaaaaaaaaaaaaaaa       !ih############");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHHHHHHHHHHHHHHHHHHHH      hi!HHHHHHHHHHHHHHHHHHHHHHHHH      hi!HHHHHHHHHHHHHHHHHHHHHHHHH      hi!HHHHHHHHHHHHHHHHHH                         " + "'", str2, "HHHHHHHHHHHHHHHHHHHHHHH      hi!HHHHHHHHHHHHHHHHHHHHHHHHH      hi!HHHHHHHHHHHHHHHHHHHHHHHHH      hi!HHHHHHHHHHHHHHHHHH                         ");
    }

    @Test
    public void test10764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10764");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  ", "      hi#!                           HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10765");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!iaaaaaaaaaaaaaaaaaaaaaaaaa!i!IHhih!ih!ih!ih!ih!ih...H!IH!I", '#', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!iaaaaaaaaaaaaaaaaaaaaaaaaa!i!IHhih!ih!ih!ih!ih!ih...H!IH!I" + "'", str3, "ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!iaaaaaaaaaaaaaaaaaaaaaaaaa!i!IHhih!ih!ih!ih!ih!ih...H!IH!I");
    }

    @Test
    public void test10766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10766");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("...hhi....    ..", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...hhi....    .." + "'", str2, "...hhi....    ..");
    }

    @Test
    public void test10767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10767");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("hhi!i!       hi!hhi!i!       hi!h          ", "HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       ", 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10768");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("HI!I!       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "...    ###");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test10769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10769");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("44444444444444444444444444a                                              a!aHa#!aHa...a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444aa!aHa#!aHa...a" + "'", str1, "44444444444444444444444444aa!aHa#!aHa...a");
    }

    @Test
    public void test10770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10770");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("iH      HHHHHHHHHHHHHHHHHHHHHHHHH!#iH      HHHHHHHHHHHHHHHHHHHHHHHHH!#iH      HHHHHHHHHHHHHHHHHHHHHHHHH!#iH      HHHHHHHHHHHHHHHHHHHHHHHHH!#iH      HHHHHHHHHHHHHHHHHHHHHHHHH!#iH      HHHHHHHHHHHHHHHHHHHHHHHHH!#iH      HHHHHHHHHHHHHHHHHHHHHHHHH!#iH      HHHHHHHHHHHHH", 30, 497);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "iH      HHHHHHHHHHHHHHHHHHHHHHHHH!#iH      HHHHHHHHHHHHHHHHHHHHHHHHH!#iH      HHHHHHHHHHHHHHHHHHHHHHHHH!#iH      HHHHHHHHHHHHHHHHHHHHHHHHH!#iH      HHHHHHHHHHHHHHHHHHHHHHHHH!#iH      HHHHHHHHHHHHHHHHHHHHHHHHH!#iH      HHHHHHHHHHHHHHHHHHHHHHHHH!#iH      HHHHHHHHHHHHH" + "'", str3, "iH      HHHHHHHHHHHHHHHHHHHHHHHHH!#iH      HHHHHHHHHHHHHHHHHHHHHHHHH!#iH      HHHHHHHHHHHHHHHHHHHHHHHHH!#iH      HHHHHHHHHHHHHHHHHHHHHHHHH!#iH      HHHHHHHHHHHHHHHHHHHHHHHHH!#iH      HHHHHHHHHHHHHHHHHHHHHHHHH!#iH      HHHHHHHHHHHHHHHHHHHHHHHHH!#iH      HHHHHHHHHHHHH");
    }

    @Test
    public void test10771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10771");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("I                    ###HHI####            ", "#####ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh##HHI####");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                    ", "            " });
    }

    @Test
    public void test10772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10772");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "444444444444444444444444444444444444444444HI!!       444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10773");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("###hhi###", "HIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###hhi###" + "'", str2, "###hhi###");
    }

    @Test
    public void test10774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10774");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid(" HHHHHHHHHHHHH", 45, 24);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test10775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10775");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("I!HIhi#!", "hHI!i!");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "I!HIhi#!" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "I!HIhi#!" + "'", str4, "I!HIhi#!");
    }

    @Test
    public void test10776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10776");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###", ".       ...       ...       ..");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10777");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("                         HIHHIHHHHHHHHHHHHHHHHIHHHHHHHHHHHHHHIHHIHHHHHHHHHHHHHHHHIHHHHHHHHHHHHHH...", "                ###hh...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10778");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("#########################################################################################################################################################44444hi!44444i!hi!h44444hi!44444                                                                 ##########################################################################################################################################################", "####IHH###           ...           ####IHH###           ...           ####IHH###           !#IH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10779");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("Hi", "IHHHHHHHHHHHHHHHHHHHHHHHHHH!#IHHHHHHHHHHHHHHHHHHHHHHHHHH!#IHHHHHHHHHHHHHHHHHHHHHHHHHH!#IHHHHHHHHHHHHHHHHHHHHHHHHHH!#IHHHHHH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test10780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10780");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###" + "'", str1, "####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###");
    }

    @Test
    public void test10781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10781");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HH");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "HH" });
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HH" });
    }

    @Test
    public void test10782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10782");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                               ...hhi....    ...", 22, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                               ...hhi....    ..." + "'", str3, "                               ...hhi....    ...");
    }

    @Test
    public void test10783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10783");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "       ...       ###hhi####    ...       ...       .");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10784");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("####IHH###           ...           ####IHH###           ...           ####IHH###           !#IH", "!aih          !aih          !aih          !aih          !aih          !aih          !aih          !aih          !aih          !aih            IHH           ...           IHH           ...           IHH           !IH        !aih          !aih          !aih          !aih          !aih          !aih          !aih          !aih          !aih          !aih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "####IHH###           ...           ####IHH###           ...           ####IHH###           !#IH" + "'", str2, "####IHH###           ...           ####IHH###           ...           ####IHH###           !#IH");
    }

    @Test
    public void test10785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10785");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("...         ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "...", "         " });
    }

    @Test
    public void test10786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10786");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                             ...", "                                                           ...       ...       ...       ...       ..                                                    ", 92);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                             ..." });
    }

    @Test
    public void test10787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10787");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("444444444444444444444444444444444444444444444444444444HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test10788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10788");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace("hi!      ....H!IH!IH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10789");
        char[] charArray10 = new char[] { '4', 'a', '#', '#', 'a', '4' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("", charArray10);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("H!H...", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly("####I           ####I           ####I           ####I           ####I           ####I...", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', 'a', '#', '#', 'a', '4' });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test10790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10790");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("aHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaa", "aaaaaaaaaaaaaaaaaaaaahi#!aaaaaaaaaaaaaaaaaaa.I..I...I..I...I..I...I..I...I..I...I..I...I..I...I..I..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA" + "'", str2, "aHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA");
    }

    @Test
    public void test10791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10791");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("#", "hI#                          ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10792");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("!I!       HI!HHI!I!       HI!HHI!I!       HI!HHI!I!       HI!HHI!I!       HI!", "                                                                                              HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   ##############################HI!###########################                                                                   ", 215, 182);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "!I!       HI!HHI!I!       HI!HHI!I!       HI!HHI!I!       HI!HHI!I!       HI!                                                                                              HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   ##############################HI!###########################                                                                   " + "'", str4, "!I!       HI!HHI!I!       HI!HHI!I!       HI!HHI!I!       HI!HHI!I!       HI!                                                                                              HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   ##############################HI!###########################                                                                   ");
    }

    @Test
    public void test10793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10793");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("HHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "HHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10794");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("i!hi!h...", '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "i!hi!h..." });
    }

    @Test
    public void test10795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10795");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("...4444444444444444444444II4hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!i!..", 34, 27);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test10796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10796");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("I                                  #################################################################                           HI!   HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!..", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 198 + "'", int3 == 198);
    }

    @Test
    public void test10797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10797");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("...                            ", 87);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...                            " + "'", str2, "...                            ");
    }

    @Test
    public void test10798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10798");
        java.lang.Object[] objArray0 = null;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(objArray0, 'a');
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test10799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10799");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("####ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh", "                                                                                                                                                                                                                                                                                                                                                                                                             IHI!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!..", 314);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "####ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh" });
    }

    @Test
    public void test10800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10800");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("4                           H4!   HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH4!4!44");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44!4!4HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH   !4H                           4" + "'", str1, "44!4!4HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH   !4H                           4");
    }

    @Test
    public void test10801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10801");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("hi4!hi4!hi4!hi4!hi4!hi4!HHHHHHI!I!.i!HI!H...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi                                                            ");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test10802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10802");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("           ####IHH###     ...", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10803");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("4444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#444444444################################################################ i4444444444444444444444444444444444#44444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10804");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("           ####I           ####I", "I           ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test10805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10805");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "44444444444444444444444444a                                              a!aHa#!aHa...a");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test10806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10806");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("...###hi!       ####           4                                                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...###HI!       ####           4                                                                  " + "'", str1, "...###HI!       ####           4                                                                  ");
    }

    @Test
    public void test10807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10807");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("", "i#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi", 6, 119);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "i#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi" + "'", str4, "i#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi");
    }

    @Test
    public void test10808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10808");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("  ...                                                                                                                                                                                                                                                                                                                                                                                                                                            ", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test10809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10809");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...            ", "           ####I           ####I", "  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...            " + "'", str3, "I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...            ");
    }

    @Test
    public void test10810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10810");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("hhhhhhhiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", "                         ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhhhhiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii" + "'", str2, "hhhhhhhiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
    }

    @Test
    public void test10811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10811");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace("HHHHHHHHHHHHH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10812");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("HI#", '#');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "I!I!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HI" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HI" + "'", str4, "HI");
    }

    @Test
    public void test10813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10813");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("44444HI!4ih4444I!HI!H...44444HI!44444", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444HI!4ih4444I!HI!H...44444HI!44444" + "'", str2, "44444HI!4ih4444I!HI!H...44444HI!44444");
    }

    @Test
    public void test10814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10814");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                                                                                                                                       H                                                                                                                                                                       ", '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                                                                                                                                       H                                                                                                                                                                       " });
    }

    @Test
    public void test10815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10815");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                               ###HHI####    ...", "aaai", 99);
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                               ###HHI####    ..." });
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test10816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10816");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("HHI", "I                                  II                                  II                                  II                                  II                                  II                                  II                                  II                                  II                                  II                                  ");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("44444!IH44444...H!IH!I44444!IH44444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "HHI" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test10817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10817");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("", "###hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi####");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10818");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("II                                  II                                  II                                  II", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10819");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "hi !Hi!                          hi !Hi!        hi4!hi4!hi4!hi4!hi4!hi4!HHHHHHI!I!...                          hi !Hi!                          hi !Hi!                          hi !Hi!                          hi !");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10820");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("", "hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByCharacterType("i");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hi!hhi!i!       hi!hhi!i!       hI!I!...", strArray3, strArray5);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "i" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "i" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hi!hhi!i!       hi!hhi!i!       hI!I!..." + "'", str7, "hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hi!hhi!i!       hi!hhi!i!       hI!I!...");
    }

    @Test
    public void test10821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10821");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("...     ...", "HHHHHHHHHHHHHHHHHHH      hi#!HHHHHH###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10822");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hi!       ");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                               ###hhi####    ...", "HI!HI!H...");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("           !hi!hi!hi!hi!hi!hi!hi!hi!hihhi   ################################################################          ", strArray2, strArray6);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "                               ###hhi####    ..." });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "           !                               ###hhi####    ...                               ###hhi####    ...                               ###hhi####    ...                               ###hhi####    ...                               ###hhi####    ...                               ###hhi####    ...                               ###hhi####    ...                               ###hhi####    ...hihhi   ################################################################          " + "'", str7, "           !                               ###hhi####    ...                               ###hhi####    ...                               ###hhi####    ...                               ###hhi####    ...                               ###hhi####    ...                               ###hhi####    ...                               ###hhi####    ...                               ###hhi####    ...hihhi   ################################################################          ");
    }

    @Test
    public void test10823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10823");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("###hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...#    h!", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10824");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("HHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH" + "'", str1, "HHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH");
    }

    @Test
    public void test10825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10825");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("hI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hI" + "'", str1, "hI");
    }

    @Test
    public void test10826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10826");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("     ####IHH###      ", "         ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###             ...       ###hhi####    ...       ...       .                                                                                                             ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test10827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10827");
        char[] charArray10 = new char[] { '4', 'a', '#', '#', 'a', '4' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("", charArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("hi!       ", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("#################################################################   ihhih!ih!ih!ih!ih!ih!ih!ih!ih!ih                           i", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("HHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', 'a', '#', '#', 'a', '4' });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test10828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10828");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("44444HI!4444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444HI!4444" + "'", str1, "44444HI!4444");
    }

    @Test
    public void test10829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10829");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("4                                 ", ".       ...       ...       ..                                                                                                                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4                                 " + "'", str2, "4                                 ");
    }

    @Test
    public void test10830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10830");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("...        ...");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10831");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("      .....");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.startsWithAny("hi!      ....H!IH!IHhhhhhhhhhh##########################################################################################", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "      ", "....." });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test10832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10832");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("I");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I" + "'", str1, "I");
    }

    @Test
    public void test10833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10833");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("...4444444444444444444444II4", "hia!Hi#                             hia!Hi#                             hia!Hi#                             hia!Hi#                             hia!Hi#                             hia!Hi#                             hia!Hi#                             hia!Hi#                             hia!Hi#                             hia!Hi#                             hia!Hi#                             hia!Hi#                             hia!", 189);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "...4444444444444444444444II4" });
    }

    @Test
    public void test10834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10834");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("...###HHI####           ...H###HHI####           ...!###HHI####           ...IH###HHI####           ...!###HHI####           ...IH", "       ...       ###hhi####    ...       ...       .", "!44444I!HI!H...44444HI!44444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...###HHI####           ...H###HHI####           ...!###HHI####           ...IH###HHI####           ...!###HHI####           ...IH" + "'", str3, "...###HHI####           ...H###HHI####           ...!###HHI####           ...IH###HHI####           ...!###HHI####           ...IH");
    }

    @Test
    public void test10835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10835");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("hI#", "iiihh!hhhiiiihh!hhhiiiihh!hhhiiiihh!hhhiiiihh!hhhiiiihh!hhhiiiihh!hhhiiiihh!hhhiiiihh!hhhiiiihh!hhhiiiihh!hhhiiiihh!hhhiiiihh!hhhiiiihh!hhhiiiihh!hhhiiiihh!hhhiiiihh!hhhiiiihh!hhhiiiihh!hhhiiiihh!hhhiiiihh!hhhiiiihh!hhhiiiihh!hhhiiiihh!hhhiiiihh!hhhiiiihh!hhhiiiihh!hhhiiiihh!hhhiiiihh!hhhiiiihh!hhhiiiihh!hhhiiiihh!hhhiiiihh!hhhiiiihh!hhhiiiihh!hhhiiiihh!hhhiiiihh!hhhiiiihh!hhhiiiihh!hhhiiiihh!hhhiiiihh!hhhiiiihh!hhhiiiihh!hhhiiiihh!hhhiiiihh!hhhiiiihh!hhhiiiihh!hhhiiiihh!hhhiiiihh!hhhiiiihh!hhhiiiihh!hhhiiiihh!hhhi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hI#" + "'", str2, "hI#");
    }

    @Test
    public void test10836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10836");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("...4444444...");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "...4444444..." });
    }

    @Test
    public void test10837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10837");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("H!IH!IH ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "H", "!", "IH", "!", "IH", " " });
    }

    @Test
    public void test10838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10838");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444!i!444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444!i!444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" });
    }

    @Test
    public void test10839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10839");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("..", "      hia!HHHHHHHHHHHHHHHHHHHHHHHHH      hia!HHHHHHHHHHHHHHHHHHHHHHHHH      hia!HHHHHHHHHHHHHHHHHHHHHHHHH      hia!HHHHHHHHHHHHHHHHHHHHHHHHH      hia!HHHHHHHHHHHHHHHHHHHHHHHHH      hia!HHHHHHHHHHHHHHHHHHHHHHHHH      hia!HHHHHHHHHHHHHHHHHHHHHHHHH      hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10840");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10841");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("ia!HHHHHHHHHHHHHHHHHHHHHHHHH      hia!HHHHHHHHHHHHHHHHHHHHHHHHH      hia!HHHHHHHHHHHHHHHHHHHHHHHHH      hia!HHHHHHHHHHHHHHHHHHHHHHHHH      hia!HHHHHHHHHHHHHHHHHHHHHHHHH      hia!HHHHHHHHHHHHHHHHHHHHHHHHH      hia!HHHHHHHHHHHHHHHHHHHHHHHHH      hia!HHHHHHHHHHHHHHHHHHHHHHHHH      hi", "!H#!H...", 96);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "ia!HHHHHHHHHHHHHHHHHHHHHHHHH      hia!HHHHHHHHHHHHHHHHHHHHHHHHH      hia!HHHHHHHHHHHHHHHHHHHHHHHHH      hia!HHHHHHHHHHHHHHHHHHHHHHHHH      hia!HHHHHHHHHHHHHHHHHHHHHHHHH      hia!HHHHHHHHHHHHHHHHHHHHHHHHH      hia!HHHHHHHHHHHHHHHHHHHHHHHHH      hia!HHHHHHHHHHHHHHHHHHHHHHHHH      hi" });
    }

    @Test
    public void test10842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10842");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("", 26, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444" + "'", str3, "44444444444444444444444444");
    }

    @Test
    public void test10843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10843");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("    hHHHHHHHHH    ", "hi4!hi4!hi4!hi4!hi4!hi4!HHHHHHI!I!.i!HI!H...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "    ", "    " });
    }

    @Test
    public void test10844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10844");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("44444HI!44444", "                                                                                                                                                                                                                                                              HHIIIIIIIIIIIIIIIIIIIIIHI!H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444HI!44444" + "'", str2, "44444HI!44444");
    }

    @Test
    public void test10845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10845");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("###hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi####", "aaaaaaaaaaaaaaaaaaa       !ih", (int) (byte) 10);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "###hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi####" });
    }

    @Test
    public void test10846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10846");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                               ###HHI####           ", 2, "                                                                                                                                         ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                               ###HHI####           " + "'", str3, "                               ###HHI####           ");
    }

    @Test
    public void test10847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10847");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace("                                                                                                                                         aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10848");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("!I!       HI!HHI!I!       HI!HHI!I!       HI!HHI!I!       HI!HHI!I!       HI!                                                                                              HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   ##############################HI!###########################                                                                   ", "hhh", 104);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "!I!       HI!HHI!I!       HI!HHI!I!       HI!HHI!I!       HI!HHI!I!       HI!                                                                                              HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   ##############################HI!###########################                                                                   " });
    }

    @Test
    public void test10849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10849");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("    ###HHI####           ...                                    ##IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######", "hi!      ....H!IH!IHhhhhhhhhhh##########################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10850");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("", "HHI!I!", "...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test10851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10851");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..." + "'", str1, "...");
    }

    @Test
    public void test10852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10852");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("I                           HI!HI!HI!HI!HI!HI                             ...", "H  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH", 31);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "I                           HI!HI!HI!HI!HI!HI                             ..." });
    }

    @Test
    public void test10853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10853");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("  hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10854");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("hia#          hia#", "h!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hia#          hia#" + "'", str2, "hia#          hia#");
    }

    @Test
    public void test10855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10855");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "HHH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10856");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("########################################################i!i!...#########################################################", "4444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#444444444################################################################ i4444444444444444444444444444444444#44444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                             ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!", "!..." });
    }

    @Test
    public void test10857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10857");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("##############################################################   ihhih!ih!ih!ih!ih!ih!ih!ih!ih!ih                           i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10858");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("4ih###############################", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10859");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("!4ih!4ih!4ih!4ih!4ihHHI    ...", "!i!IH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10860");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("####IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH###", "444444444444444444444444444444444444444444HHI!I!       444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test10861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10861");
        char[] charArray11 = new char[] { '4', 'a', '#', '#', 'a', '4' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("", charArray11);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("hi!       ", charArray11);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", charArray11);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly("I                           HI!   HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!..", charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly("haih", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', 'a', '#', '#', 'a', '4' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test10862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10862");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi444444444444444444444444444444444444444444hhi!i!       444444444444444444444444444444444444444444hhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi", 388);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi444444444444444444444444444444444444444444hhi!i!       444444444444444444444444444444444444444444hhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi         " + "'", str2, "         hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi444444444444444444444444444444444444444444hhi!i!       444444444444444444444444444444444444444444hhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi         ");
    }

    @Test
    public void test10863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10863");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("hia!###HHI##############################################################################", "    ###HHI####           ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hia!###HHI##############################################################################" + "'", str2, "hia!###HHI##############################################################################");
    }

    @Test
    public void test10864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10864");
        char[] charArray17 = new char[] { '4', 'a', '#', '#', 'a', '4' };
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("", charArray17);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("hi!       ", charArray17);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly("HI!", charArray17);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny("I                                  #################################################################", charArray17);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsNone("########!4ih#########", charArray17);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsNone("HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!", charArray17);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsNone("                     HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################", charArray17);
        int int25 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!HIhi#!", charArray17);
        boolean boolean26 = org.apache.commons.lang3.StringUtils.containsNone("44444444444444444444444444a                                              a!aHa#!aHa...a                                             ", charArray17);
        boolean boolean27 = org.apache.commons.lang3.StringUtils.containsAny("HHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHH", charArray17);
        int int28 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###hhi####    ...", charArray17);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '4', 'a', '#', '#', 'a', '4' });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 91 + "'", int25 == 91);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test10865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10865");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("############################################################################################################################################################################################################################################################################################################i                                  ", "        ...        ...HHHHHHHHHHHHH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10866");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                                                                                                                                                                                                                                                                                             ", "###I           ##", 26);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                                                                                                                                                                                                                                                                                                                                                             " });
    }

    @Test
    public void test10867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10867");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("HHIHHHHHHHHHHHHHHHHHHHHHHHHH", '#');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH");
        boolean boolean8 = org.apache.commons.lang3.StringUtils.startsWithAny("I                         ...", strArray5);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray9);
        int int11 = org.apache.commons.lang3.StringUtils.lastIndexOfAny(".               HHHHHHHHHHHHHHH", strArray9);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9, 'a');
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HH");
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray16, "                               ###HHI####    ...");
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray16);
        java.lang.String[] strArray23 = org.apache.commons.lang3.StringUtils.split("HI!", ' ');
        int int24 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("!4ih", strArray23);
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray23);
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.replaceEach("...H!IH!IH                                                                                                                                                                                                                                                                                                                                                                                                ", strArray16, strArray23);
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.replaceEach("                                                                                ..................                                                                                ", strArray9, strArray16);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "HHIHHHHHHHHHHHHHHHHHHHHHHHHH" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HHIHHHHHHHHHHHHHHHHHHHHHHHHH" + "'", str7, "HHIHHHHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "HHIHHHHHHHHHHHHHHHHHHHHHHHHH" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "HHIHHHHHHHHHHHHHHHHHHHHHHHHH" });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HHIHHHHHHHHHHHHHHHHHHHHHHHHH" + "'", str13, "HHIHHHHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "HH" });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HH" + "'", str18, "HH");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HH" + "'", str19, "HH");
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "HI!" });
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "HI!" + "'", str25, "HI!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "...H!IH!IH                                                                                                                                                                                                                                                                                                                                                                                                " + "'", str26, "...H!IH!IH                                                                                                                                                                                                                                                                                                                                                                                                ");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "                                                                                ..................                                                                                " + "'", str27, "                                                                                ..................                                                                                ");
    }

    @Test
    public void test10868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10868");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("h                                                                                                h                                                                                                h                                                                                                h                  .hi!hi!hi!hi!hi!hihHI!i!                         i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10869");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!i!...HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!i!...HI!HI!HI!HI!HI!HI!HI!HI!" + "'", str1, "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!i!...HI!HI!HI!HI!HI!HI!HI!HI!");
    }

    @Test
    public void test10870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10870");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("44444!IH44444...H!IH!I44444!IH44444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "hi#!hhhhhhhhhhhhhhhhhhhhh444444444444444444444444444444444444444444########!4ih#########hhhhhhhhhh      hi", "          hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!h          ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test10871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10871");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("       ...#########################################################################################################################################################44444hi!44444i!hi!h44444hi!44444    ...       .#hhi#       ...                      #########################################################################################################################################################", 91, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       ...#########################################################################################################################################################44444hi!44444i!hi!h44444hi!44444    ...       .#hhi#       ...                      #########################################################################################################################################################" + "'", str3, "       ...#########################################################################################################################################################44444hi!44444i!hi!h44444hi!44444    ...       .#hhi#       ...                      #########################################################################################################################################################");
    }

    @Test
    public void test10872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10872");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4", "i                                                                                                                                                                                                                                                                                    ", (int) 'a');
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "4" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "4" });
    }

    @Test
    public void test10873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10873");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric("hhi!i!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10874");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("#######              iHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH", "I                                  II                                  II                                  II                                  II                                  II                                  II                                  II                          ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test10875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10875");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("...       ...       ...       ...       ...       ...       ..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...       ...       ...       ...       ...       ...       .." + "'", str1, "...       ...       ...       ...       ...       ...       ..");
    }

    @Test
    public void test10876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10876");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("i                         ...", "hhhhhhhhhhI#################################################################HI!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!..", "         hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi444444444444444444444444444444444444444444hhi!i!       444444444444444444444444444444444444444444hhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi         ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test10877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10877");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("Hi", "################################################################################################################################################################################################################################                               ###HHI####    ...#################################################################################################################################################################################################################################");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '4', 340, 100);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "i" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test10878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10878");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("   hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!i!...", "!!H                             ", 144);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10879");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                     HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################HHI####...                     HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   ##############", "H..!I!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10880");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("                         hhi!i!", "                                                                                                                                                                                               ...hhi......                                                                                                                                                                                               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10881");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("aaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaai", "###hhi...#");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test10882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10882");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test10883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10883");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA###hhi####...", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10884");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("HHI    ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHI    ..." + "'", str1, "HHI    ...");
    }

    @Test
    public void test10885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10885");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("###HHI####    .", 338, "haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###HHI####    .haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "###HHI####    .haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10886");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("   !I!...        ###HHI####           ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "   !I!...        ###HHI####           ..." + "'", str1, "   !I!...        ###HHI####           ...");
    }

    @Test
    public void test10887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10887");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("44HI!44444I!HI!H...44444HI!444444");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "44HI!44444I!HI!H...44444HI!444444" });
    }

    @Test
    public void test10888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10888");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("hi!      ...", 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10889");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("44444444444444444444444444                                              !H#!H...     ...", 277, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                             44444444444444444444444444                                              !H#!H...     ..." + "'", str3, "                                                                                                                                                                                             44444444444444444444444444                                              !H#!H...     ...");
    }

    @Test
    public void test10890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10890");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                                                                      ...       ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "                                                                                      ", "...", "       " });
    }

    @Test
    public void test10891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10891");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("!hi!hi!hi!hi!hi!hi!hi!hi!hihhi   ################################################################", "aaaaaih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10892");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("hiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihii", "  ####ihh###           ...           ####ihh###           ...           ####ihh###           !#ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10893");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                                        ...  hia...  hia...  hia...  hia...  hia...  hia...  hia...  hia...  h.       ...       ...       ..                                        ", "                hhhhhhhhhhhhhhh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                        ...  hia...  hia...  hia...  hia...  hia...  hia...  hia...  hia...  h.       ...       ...       .." + "'", str2, "                                        ...  hia...  hia...  hia...  hia...  hia...  hia...  hia...  hia...  h.       ...       ...       ..");
    }

    @Test
    public void test10894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10894");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("aaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaai", "444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaai" + "'", str2, "aaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaaiaaaaaaaaai");
    }

    @Test
    public void test10895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10895");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...###HHI####           4                                                                  44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "#######", 93);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "                                                                                                                                                                                                                                                                                                                 I!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI", 277, 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...###HHI####           4                                                                  44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test10896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10896");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("  !       aaaaaaaaaaaaaaaaaaa", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  !       aaaaaaaaaaaaaaaaaaa" + "'", str2, "  !       aaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10897");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("h!", "444444444444444444444444444444444444444444HHI!I!       444444444444444444444444444444444444444444         ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test10898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10898");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("hi#!                                                                                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI#!                                                                                                                                                                                                                                                                                                                                            " + "'", str1, "HI#!                                                                                                                                                                                                                                                                                                                                            ");
    }

    @Test
    public void test10899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10899");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("HI!HHI!I!       HI!HHI!I!                               hi!hi!hi!hi!hi!hi!hi!hi!hi!hihhi   #################################################################           ####ihh###                      ####ihh###                      ####ihh###                      ####ihh###                      ####ihh###                      ####ihh##", ".I..I..");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HI!HHI!I!       HI!HHI!I!                               hi!hi!hi!hi!hi!hi!hi!hi!hi!hihhi   #################################################################           ####ihh###                      ####ihh###                      ####ihh###                      ####ihh###                      ####ihh###                      ####ihh##" });
    }

    @Test
    public void test10900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10900");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...H!IH!IH", '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "...H!IH!IH" });
    }

    @Test
    public void test10901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10901");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("AhAhAhAhAhAhAhAhAhAhAhAhA", "!HIHHI   #################################################################4444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10902");
        java.lang.String[] strArray2 = null;
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("#########################################################################################################################################################44444hi!44444i!hi!h44444hi!44444                                                                 ##########################################################################################################################################################", "IIIIIIIIIIIIIIIIIIIIIHI!H");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!IHHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!IH", strArray2, strArray5);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.split("###");
        boolean boolean10 = org.apache.commons.lang3.StringUtils.startsWithAny("          hia!", strArray9);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9, "I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...");
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray9);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEach("!H HI!HHI!I!       HI!HHI!I!       HI!HHI!I!       HI!HHI!I!       HI!HHI!I!       HI!HHI!I!       HI!H", strArray5, strArray13);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "#########################################################################################################################################################44444hi!44444i!hi!h44444hi!44444                                                                 ##########################################################################################################################################################" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!IHHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!IH" + "'", str6, "...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!IHHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!IH");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "###" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "###" + "'", str12, "###");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "###" });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "!H HI!HHI!I!       HI!HHI!I!       HI!HHI!I!       HI!HHI!I!       HI!HHI!I!       HI!HHI!I!       HI!H" + "'", str14, "!H HI!HHI!I!       HI!HHI!I!       HI!HHI!I!       HI!HHI!I!       HI!HHI!I!       HI!HHI!I!       HI!H");
    }

    @Test
    public void test10903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10903");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("aHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA!hI#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Ahia!Hi#AAAAAAAAAAAAAAAAAAAAAAAAAAAAAhia!Hi#AAAAAAAAAAAAAAAAAAAAAAAAAAAAAhia!Hi#AAAAAAAAAAAAAAAAAAAAAAAAAAAAAhia!Hi#AAAAAAAAAAAAAAAAAAAAAAAAAAAAAhia!Hi#AAAAAAAAAAAAAAAAAAAAAAAAAAAAAhia!Hi#AAAAAAAAAAAAAAAAAAAAAAAAAAAAAhia!Hi#AAAAAAAAAAAAAAAAAAAAAAAAAAAAAhia!Hi#AAAAAAAAAAAAAAAAAAAAAAAAAAAAAhia" + "'", str1, "Ahia!Hi#AAAAAAAAAAAAAAAAAAAAAAAAAAAAAhia!Hi#AAAAAAAAAAAAAAAAAAAAAAAAAAAAAhia!Hi#AAAAAAAAAAAAAAAAAAAAAAAAAAAAAhia!Hi#AAAAAAAAAAAAAAAAAAAAAAAAAAAAAhia!Hi#AAAAAAAAAAAAAAAAAAAAAAAAAAAAAhia!Hi#AAAAAAAAAAAAAAAAAAAAAAAAAAAAAhia!Hi#AAAAAAAAAAAAAAAAAAAAAAAAAAAAAhia!Hi#AAAAAAAAAAAAAAAAAAAAAAAAAAAAAhia");
    }

    @Test
    public void test10904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10904");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone(" II                                  II                                  Iaaaaaaaaaaaaaaaaaaa!ih", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test10905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10905");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("HHI       ", "###########aaaaaaaaaaaaaaaaaaa       !ih############");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHI       " + "'", str2, "HHI       ");
    }

    @Test
    public void test10906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10906");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("####aHH###                 ####aHH###                 ####aHH###                 ####aHH###                 ####aHH###                 ####aHH###                 ####aHH###                 ####aHH###                 ####aHH##", "                     444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10907");
        char[] charArray6 = new char[] {};
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsAny("HI!HI!H...", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsOnly("...4444444...", charArray6);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny("###hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi####", charArray6);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("H H...", charArray6);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("             hh              ", charArray6);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly("IIIIIIIIIIIIIIIIIIIIIIIIIIII", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test10908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10908");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "HI#!HHHHHHHHHHHHHHHHHHHHHHHHH     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10909");
        java.lang.String[] strArray1 = null;
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Hi!", "                                                 h                                                 ", 285);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("#################################################################   IHHIH!IH!IH!IH!IH!IH!IH!IH!IH!IH                           I", strArray1, strArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, 'a', 8, 192);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "Hi!" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#################################################################   IHHIH!IH!IH!IH!IH!IH!IH!IH!IH!IH                           I" + "'", str6, "#################################################################   IHHIH!IH!IH!IH!IH!IH!IH!IH!IH!IH                           I");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test10910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10910");
        char[] charArray12 = new char[] { '4', 'a', '#', '#', 'a', '4' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("", charArray12);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("hi!       ", charArray12);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny("###hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi####", charArray12);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny("###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####", charArray12);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone("                                                44444444444444444444444444444444                                                ", charArray12);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("44444hi !HIhi !!hi !44444", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '4', 'a', '#', '#', 'a', '4' });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
    }

    @Test
    public void test10911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10911");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("I####                      ###");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I####                      ##" + "'", str1, "I####                      ##");
    }

    @Test
    public void test10912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10912");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("", "HHI       ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test10913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10913");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(".I..I..", "I!HI!H...hi!hi!hi!hi!hi!hihHI!i!aaaaaaaaaaaaaaaaaaaaaaaaai!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "", "", "", "", "", "", "" });
    }

    @Test
    public void test10914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10914");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("###H", "                                                44444444444444444444444444444444                                                ", 324);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "###H" });
    }

    @Test
    public void test10915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10915");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H..." + "'", str1, "I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...");
    }

    @Test
    public void test10916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10916");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("...###hi!       ####           4                                                                  ", "aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H !H");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "...###hi!       ####           4                                                                  " });
    }

    @Test
    public void test10917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10917");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("hi4a", "HHHHHHHHHHHHHHHHHHHHHHHHH      hi4!HHHHHHHHHHHHHHHHHHHHHHHHH      hi4!HHHHHHHHHHHHHHHHHHHHHHHHH      hi4!HHHHHHHHHHHHHHHHHHHHHHHHH      hi4!HHHHHHHHHHHHHHHHHHHHHHHHH      hi4!HHHHHHHHHHHHHHHHHHHHHHHHH      hi4!HHHHHHHHHHHHHHHHHHHHHHHHH      hi4!HHHHHHHHHHHHHHHHHHHHHHHHH      hi4!HHHHHHHHHHHHHHHHHHHHHHHHH      hi4!HHHHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi4a" + "'", str2, "hi4a");
    }

    @Test
    public void test10918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10918");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("4                           H4!   HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH4!4!44", 91, "      hia!HHHHHHHHHHHHHHHHHHHHHHHHH      hia!HHHHHHHHHHHHHHHHHHHHHHHHH      hia!HHHHHHHHHHHHHHHHHHHHHHHHH      hia!HHHHHHHHHHHHHHHHHHHHHHHHH      hia!HHHHHHHHHHHHHHHHHHHHHHHHH      hia!HHHHHHHHHHHHHHHHHHHHHHHHH      hia!HHHHHHHHHHHHHHHHHHHHHHHHH      hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4                           H4!   HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH4!4!44" + "'", str3, "4                           H4!   HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH4!4!44");
    }

    @Test
    public void test10919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10919");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("      hia                                .....", 115, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      hia                                .....aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "      hia                                .....aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10920");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!        HI#!           ###HHI####           ...           ###HHI####           ...           ###HHI####            hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!        HI#!           ###HHI####           ...           ###HHI####           ...           ###HHI####            hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!         " + "'", str1, "          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!        HI#!           ###HHI####           ...           ###HHI####           ...           ###HHI####            hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!         ");
    }

    @Test
    public void test10921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10921");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("444444444444444444444444444444444444444444hhi!i!       444444444444444444444444444444444444444444");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("HI#!           ###HHI####           ...           ###HHI####           ...           ###HHI####  ", strArray3);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "444444444444444444444444444444444444444444", "hhi", "!", "i", "!", "       ", "444444444444444444444444444444444444444444" });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "444444444444444444444444444444444444444444", "hhi", "!", "i", "!", "", "444444444444444444444444444444444444444444" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test10922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10922");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "           ###HHI####           ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10923");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("                                                                                                                ...hhi....    ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10924");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("                                                      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI444444444444444444444444444444444444444444HHI!I!       444444444444444444444444444444444444444444hhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      H", "HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI444444444444444444444444444444444444444444HHI!I!       444444444444444444444444444444444444444444HHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10925");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("                                                      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi" + "'", str1, "hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi");
    }

    @Test
    public void test10926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10926");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                                                ", "HHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10927");
        char[] charArray12 = new char[] { '4', 'a', '#', '#', 'a', '4' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("", charArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("44444444444444444444444444444444", charArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly("I!I!...", charArray12);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly("             hh              ", charArray12);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("hi!hhi!i!hi!hhi!i!hi!hhi!i!hi!hhi!i!hi!hhi!i!hi!hhi!i!hi!hhi!i!hi!hhi!i!hi!hhi!i!hi!", charArray12);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("hi!hhi!i!       hi!hhi!i!                               HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################           ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH##", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '4', 'a', '#', '#', 'a', '4' });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test10928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10928");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("                 HHHHHHHHHHHHHHH", "################################################################################################################");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test10929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10929");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("                                                                                                                                                                                                                                                                                                                                                                                     I!HI!H...            ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10930");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("                            #...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10931");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("hhi!i!", "i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaa", 89);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hh" });
    }

    @Test
    public void test10932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10932");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10933");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("######################################################################hI!I!I!I!I!I!I!I!I!II", "   hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!i!...", 99);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("...H!IH!IH ", "   ###");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                                                                                                                                                                                                                                                                                                                                                                    ####IHH###           ", strArray4, strArray7);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "######################################################################hI!I!I!I!I!I!I!I!I!II" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "...H!IH!IH " });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                    ####IHH###           " + "'", str8, "                                                                                                                                                                                                                                                                                                                                                                                    ####IHH###           ");
    }

    @Test
    public void test10934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10934");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("####I####I####I####I####I####I...", (int) (short) 0, "                                                                           HI#!HHHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "####I####I####I####I####I####I..." + "'", str3, "####I####I####I####I####I####I...");
    }

    @Test
    public void test10935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10935");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "!#IH      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10936");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace("                           ...###hhi####           4                                                                                             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10937");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("           ###HHI####                                                                                                                                                                                                                                                                                                                                                                                    ", "...H!IH!IH ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "           ###HHI####                                                                                                                                                                                                                                                                                                                                                                                    " });
    }

    @Test
    public void test10938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10938");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("    H     ", "    H     ", 3);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HHHHHHHHHHHHHHHHHHHHHHHHH");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hHI!i!", strArray5, strArray7);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray7, "          hia!");
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.startsWithAny("       ...       .#hhi#       ...      ", strArray10);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "HHHHHHHHHHHHHHHHHHHHHHHHH" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hHI!i!" + "'", str8, "hHI!i!");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "HHHHHHHHHHHHHHHHHHHHHHHHH" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "HHHHHHHHHHHHHHHHHHHHHHHHH" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test10939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10939");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("####IHH###     ...", "hI#");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "####IHH###     ..." + "'", str2, "####IHH###     ...");
    }

    @Test
    public void test10940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10940");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444I...44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 39);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444..." + "'", str2, "444444444444444444444444444444444444...");
    }

    @Test
    public void test10941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10941");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("    ###HHI####           ...", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    ###HHI####           ..." + "'", str2, "    ###HHI####           ...");
    }

    @Test
    public void test10942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10942");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("4                                 ", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10943");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("i                                  ################################################################", "i!HI!H...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10944");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      ", "            hia!Hi#                             hia!Hi#                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test10945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10945");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("HI !");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI !" + "'", str1, "HI !");
    }

    @Test
    public void test10946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10946");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("hI!i!aaaaaaaaaaaaaaaaaaaaaaaaa", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10947");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("i           ###HHI####              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I           ###HHI####              " + "'", str1, "I           ###HHI####              ");
    }

    @Test
    public void test10948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10948");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI", "", "                                                                                                                                        !H                                                                                                                                             ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test10949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10949");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("!#IH      ", "444444444444I...4444444444444", "..................");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!#.H      " + "'", str3, "!#.H      ");
    }

    @Test
    public void test10950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10950");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10951");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("IIIIIIIIIIIIIIIIIIIIIII", 142, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###########################################################IIIIIIIIIIIIIIIIIIIIIII############################################################" + "'", str3, "###########################################################IIIIIIIIIIIIIIIIIIIIIII############################################################");
    }

    @Test
    public void test10952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10952");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) ".I..I..4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10953");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("", "      ###hhi####           ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test10954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10954");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4           ###HHI####           44           ###HHI####           44           ###HHI####           44           ###HHI####           44           ######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH##");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test10955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10955");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("################################################################################################################################################################################################################################HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH###HHI####HHHH...#################################################################################################################################################################################################################################", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 496 + "'", int2 == 496);
    }

    @Test
    public void test10956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10956");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("####IHH###...####IHH###...####IHH###!#IH", "HI!HI!H...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "####IHH###...####IHH###...####IHH###!#" + "'", str2, "####IHH###...####IHH###...####IHH###!#");
    }

    @Test
    public void test10957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10957");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("!h", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!h" + "'", str2, "!h");
    }

    @Test
    public void test10958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10958");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("hi!aaaaaaaaaaaaaaaaaaaI                                  II                                  II hhhh", 189);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                         hi!aaaaaaaaaaaaaaaaaaaI                                  II                                  II hhhh" + "'", str2, "                                                                                         hi!aaaaaaaaaaaaaaaaaaaI                                  II                                  II hhhh");
    }

    @Test
    public void test10959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10959");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("444444444444444444hHI!i!       444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444       !i!IHh444444444444444444" + "'", str1, "444444444444444444444444444444444444444444       !i!IHh444444444444444444");
    }

    @Test
    public void test10960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10960");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("4444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#444444444################################################################ i4444444444444444444444444444444444#44444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#444444444################################################################ i4444444444444444444444444444444444#44444444444444444444444444" + "'", str1, "4444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#444444444################################################################ i4444444444444444444444444444444444#44444444444444444444444444");
    }

    @Test
    public void test10961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10961");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("HI!i!aa...                           HI!i!aa...                           HI!i!aa...                           HI!i!aa...          hHHHHHHHHHHHHHHI!i!aa...                           HI!i!aa...                           HI!i!aa...                           HI!i!aa...           ", "i!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HI!i!aa...                           HI!i!aa...                           HI!i!aa...                           HI!i!aa...          hHHHHHHHHHHHHHHI!i!aa...                           HI!i!aa...                           HI!i!aa...                           HI!i!aa...           " });
    }

    @Test
    public void test10962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10962");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("...#################...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...#################..." + "'", str1, "...#################...");
    }

    @Test
    public void test10963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10963");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("      hi4!HHHHHHHHHHHHHHHHHHHHHHHHH      hi4!HHHHHHHHHHHHHHHHHHHHHHHHH      hi4!HHHHHHHHHHHHHHHHHHHHHHHHH      hi4!HHHHHHHHHHHHHHHHHHHHHHHHH      hi4!HHHHHHHHHHHHHHHHHHHHHHHHH      hi4!HHHHHHHHHHHHHHHHHHHHHHHHH      hi4!HHHHHHHHHHHHHHHHHHHHHHHHH      hi4!HHHHHHHHHHHHHHHHHHHHHHHHH      hi4", "4444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#44444444444444444444444444", 6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "      hi4!HHHHHHHHHHHHHHHHHHHHHHHHH      hi4!HHHHHHHHHHHHHHHHHHHHHHHHH      hi4!HHHHHHHHHHHHHHHHHHHHHHHHH      hi4!HHHHHHHHHHHHHHHHHHHHHHHHH      hi4!HHHHHHHHHHHHHHHHHHHHHHHHH      hi4!HHHHHHHHHHHHHHHHHHHHHHHHH      hi4!HHHHHHHHHHHHHHHHHHHHHHHHH      hi4!HHHHHHHHHHHHHHHHHHHHHHHHH      hi4" });
    }

    @Test
    public void test10964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10964");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("!4ih", "hi!hhi!i!       hi!hhi!i!                               HI!H...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10965");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("hh", 223, 58);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test10966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10966");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("I!!", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10967");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10968");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("hi#!", "                                                                                              HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   ##############################HI!###########################                                                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10969");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("hI#                                                  HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10970");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("hi!");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "HH", 3, 0);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String[] strArray8 = new java.lang.String[] {};
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray8);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray8, "hi!");
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("i", strArray2, strArray11);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "...        ...");
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi...        ...!" + "'", str14, "hi...        ...!");
    }

    @Test
    public void test10971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10971");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("   hhi    ", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   hhi    " + "'", str2, "   hhi    ");
    }

    @Test
    public void test10972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10972");
        java.lang.String[] strArray1 = new java.lang.String[] {};
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray2, strArray3);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "                                                                                         hi!aaaaaaaaaaaaaaaaaaaI                                  II                                  II hhhh");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
    }

    @Test
    public void test10973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10973");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("", ' ');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!       ", "HHI");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", strArray3, strArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray7);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray7, "");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!       " });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI" + "'", str8, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!       " });
    }

    @Test
    public void test10974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10974");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("hi!hhi!i!       hi!hhi!i!                               HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################", "4444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#444444444################################################################ i4444444444444444444444444444444444#44444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                             ", "                            444444444444444444444444444444444444444444444444444444444444444444444444", 210);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!hhi!i!       hi!hhi!i!                               HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################" + "'", str4, "hi!hhi!i!       hi!hhi!i!                               HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################");
    }

    @Test
    public void test10975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10975");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("I...", "HI!IIIIIIIIIIIIIIIIIIIIIIIIIIIIHI!H", "hi!      ....H!IH!IHhhhhhhhhhh##########################################################################################", 115);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "I..." + "'", str4, "I...");
    }

    @Test
    public void test10976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10976");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse(" HI#!HHHHHHHHHHHHHHHHHHHHHHHHH     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "     HHHHHHHHHHHHHHHHHHHHHHHHH!#IH " + "'", str1, "     HHHHHHHHHHHHHHHHHHHHHHHHH!#IH ");
    }

    @Test
    public void test10977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10977");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("!I!       HI!HHI!I!       HI!HHI!I!       HI!HHI!I!       HI!HHI!I!       HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!" + "'", str1, "!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!");
    }

    @Test
    public void test10978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10978");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("      hia!HHHHHHHHHHHHHHHHHHHHHHHHH      hia!HHHHHHHHHHHHHHHHHHHHHHHHH      hia!HHHHHHHHHHHHHHHHHHHHHHHHH      hia!HHHHHHHHHHHHHHHHHHHHHHHHH      hia!HHHHHHHHHHHHHHHHHHHHHHHHH      hia!HHHHHHHHHHHHHHHHHHHHHHHHH      hia!HHHHHHHHHHHHHHHHHHHHHHHHH      hi", "4444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#444444444################################################################ i4444444444444444444444444444444444#44444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                             ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10979");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hHI!i!aaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaih", 234);
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test10980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10980");
        java.lang.Object[] objArray0 = null;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(objArray0, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...H!IH!IH aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test10981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10981");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaahi#!", "                         hhi!i!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaa", "", "#", "" });
    }

    @Test
    public void test10982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10982");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444HHIHHHHHHHHHHHHHHHHIHHHHHHHHHHHHHH", "###4444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#44444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444HHIHHHHHHHHHHHHHHHHIHHHHHHHHHHHHHH" + "'", str2, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444HHIHHHHHHHHHHHHHHHHIHHHHHHHHHHHHHH");
    }

    @Test
    public void test10983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10983");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("hI!I!I!I!I!I!I!I!I!II");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "hI!I!I!I!I!I!I!I!I!II" });
    }

    @Test
    public void test10984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10984");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("hi!      ....H!IH!IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!      ....H!IH!IH" + "'", str1, "hi!      ....H!IH!IH");
    }

    @Test
    public void test10985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10985");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("...###hi!       ####           4", "                                                                                                                ...hhi....    ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10986");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("      hi#!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi#!" + "'", str1, "hi#!");
    }

    @Test
    public void test10987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10987");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("    hHHHHHHHHH     ", 145, "#################################################################                                  I");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#################################################################                                  I##########################    hHHHHHHHHH     " + "'", str3, "#################################################################                                  I##########################    hHHHHHHHHH     ");
    }

    @Test
    public void test10988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10988");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("hi#!                           HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################", "###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10989");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("                4ih                ", "##################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10990");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "              HH                           H###########aaaaaaaaaaaaaaaaaaa       !ih############");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10991");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("!#.H      ", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test10992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10992");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("", ' ', 136);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10993");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("HHHHHHHHHHHHHHH", "########################################################################################################################################################################################################################################################################################                                                                                                                                                                                                                         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHHHHHHHHHHHH" + "'", str2, "HHHHHHHHHHHHHHH");
    }

    @Test
    public void test10994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10994");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("..", "hi !");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".." + "'", str2, "..");
    }

    @Test
    public void test10995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10995");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("...H!IH!IH");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String[] strArray5 = new java.lang.String[] {};
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny("hi#!           ###HHI####           ...           ###HHI####           ...           ###HHI####", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("#####################################################", strArray3, strArray5);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "...", "H", "!", "IH", "!", "IH" });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "...", "H", "!", "IH", "!", "IH" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#####################################################" + "'", str8, "#####################################################");
    }

    @Test
    public void test10996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10996");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("           ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###            ###HHI####           ...", "                          hi!                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "               hi!                                  " + "'", str2, "               hi!                                  ");
    }

    @Test
    public void test10997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10997");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("HI!", "", (int) (byte) 100);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray6);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByCharacterType("I");
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray9);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray9, "I                           HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################");
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray9);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("!H#!H...", strArray6, strArray13);
        int int15 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("4444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#444444444################################################################ i4444444444444444444444444444444444#44444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                             ", strArray6);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.startsWithAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHHHHHHHHHHHHHHHHHH!#ih      HHHHHHHHHHHHHHHHHHHHHHHHH!#ih      HHHHHHHHHHHHHHHHHHHHHHHHH!#ih      HHHHHHHHHHHHHHHHHHHHHHH", strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "HI!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "HI!" });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "I" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "I" });
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "I" });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "!H#!H..." + "'", str14, "!H#!H...");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test10998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10998");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("############################################################################################################################################################################################################################################################################################################I                                  ", 26, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444I...44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "############################################################################################################################################################################################################################################################################################################I                                  " + "'", str3, "############################################################################################################################################################################################################################################################################################################I                                  ");
    }

    @Test
    public void test10999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10999");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("##############################################################################################################################################################HI!IIIIIIIIIIIIIIIIIIIIIIIIIIIIHI!H###############################################################################################################################################################", "H!IH!IH");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "##############################################################################################################################################################HI!IIIIIIIIIIIIIIIIIIIIIIIIIIIIHI!H###############################################################################################################################################################" });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "##############################################################################################################################################################HI!IIIIIIIIIIIIIIIIIIIIIIIIIIIIHI!H###############################################################################################################################################################" + "'", str4, "##############################################################################################################################################################HI!IIIIIIIIIIIIIIIIIIIIIIIIIIIIHI!H###############################################################################################################################################################");
    }

    @Test
    public void test11000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test11000");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("ihi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!i!..", "                                                                                                                                                                                                                                                                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ihi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!i!.." + "'", str2, "ihi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!i!..");
    }
}

