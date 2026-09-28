package org.apache.commons.lang3;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest15 {

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
    public void test07501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07501");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("i                         ...", "I                         ...");
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.split("", ' ');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray12);
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!       ", "HHI");
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEach("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", strArray12, strArray16);
        java.lang.String[] strArray18 = new java.lang.String[] {};
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray18);
        java.lang.String[] strArray21 = org.apache.commons.lang3.StringUtils.stripAll(strArray18, "hi!");
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray21, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", (-1), (int) (short) -1);
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("HH", strArray16, strArray21);
        boolean boolean27 = org.apache.commons.lang3.StringUtils.startsWithAny("    H     ", strArray21);
        java.lang.String[] strArray29 = org.apache.commons.lang3.StringUtils.stripAll(strArray21, "I                                  ");
        java.lang.String[] strArray32 = org.apache.commons.lang3.StringUtils.split("HHI", "hi!");
        java.lang.String[] strArray34 = org.apache.commons.lang3.StringUtils.stripAll(strArray32, "I!i!");
        java.lang.String str35 = org.apache.commons.lang3.StringUtils.replaceEach("HHI", strArray21, strArray32);
        java.lang.String str37 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray21, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String[] strArray40 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("HHI", "I                                  II                                  II                                  II                                  II                                  II                                  II                                  II                                  II                                  II                                  ");
        java.lang.String str41 = org.apache.commons.lang3.StringUtils.replaceEach("           ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###           ", strArray21, strArray40);
        java.lang.String[] strArray42 = org.apache.commons.lang3.StringUtils.stripAll(strArray21);
        java.lang.String str43 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!i!...HI!HI!HI!HI!HI!HI!HI!HI!", strArray4, strArray42);
        java.lang.String[] strArray46 = org.apache.commons.lang3.StringUtils.split("I                         ...", ' ');
        java.lang.String[] strArray47 = org.apache.commons.lang3.StringUtils.stripAll(strArray46);
        java.lang.String str48 = org.apache.commons.lang3.StringUtils.replaceEach("       ", strArray42, strArray46);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!       " });
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI" + "'", str17, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HH" + "'", str26, "HH");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "HHI" });
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "HH" });
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "HHI" + "'", str35, "HHI");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] { "HHI" });
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "           ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###           " + "'", str41, "           ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###           ");
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!i!...HI!HI!HI!HI!HI!HI!HI!HI!" + "'", str43, "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!i!...HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertArrayEquals(strArray46, new java.lang.String[] { "I", "..." });
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] { "I", "..." });
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "       " + "'", str48, "       ");
    }

    @Test
    public void test07502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07502");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("##############################################################################################################################################################HI!IIIIIIIIIIIIIIIIIIIIIIIIIIIIHI!H###############################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##############################################################################################################################################################HI!IIIIIIIIIIIIIIIIIIIIIIIIIIIIHI!H##############################################################################################################################################################" + "'", str1, "##############################################################################################################################################################HI!IIIIIIIIIIIIIIIIIIIIIIIIIIIIHI!H##############################################################################################################################################################");
    }

    @Test
    public void test07503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07503");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07504");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("Hi !                                                                                             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi !                                                                                             " + "'", str1, "Hi !                                                                                             ");
    }

    @Test
    public void test07505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07505");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("###hhi####                 ###hhi####                 ###hhi####                 ###hhi####                 ###hhi####                 ###hhi####                 ###hhi####                 ###hhi####                 ###hhi####");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###hhi####                 ###hhi####                 ###hhi####                 ###hhi####                 ###hhi####                 ###hhi####                 ###hhi####                 ###hhi####                 ###hhi####" + "'", str1, "###hhi####                 ###hhi####                 ###hhi####                 ###hhi####                 ###hhi####                 ###hhi####                 ###hhi####                 ###hhi####                 ###hhi####");
    }

    @Test
    public void test07506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07506");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###", ".hiI4....hi", "aaaaaihHI!H");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "####aHH###                 ####aHH###                 ####aHH###                 ####aHH###                 ####aHH###                 ####aHH###                 ####aHH###                 ####aHH###                 ####aHH###" + "'", str3, "####aHH###                 ####aHH###                 ####aHH###                 ####aHH###                 ####aHH###                 ####aHH###                 ####aHH###                 ####aHH###                 ####aHH###");
    }

    @Test
    public void test07507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07507");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####", "Hi#                             ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07508");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("Hi!", "           ###HHI####", 96);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "HHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHH                         ", 19, 158);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 19 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "Hi!" });
    }

    @Test
    public void test07509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07509");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("I                           HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################", "          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!        HI#!           ###HHI####           ...           ###HHI####           ...           ###HHI####            hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I                           HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################" + "'", str2, "I                           HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################");
    }

    @Test
    public void test07510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07510");
        java.lang.String[] strArray1 = null;
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("...       ...", '4');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.replaceEach(".I..I..", strArray1, strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "...       ..." });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ".I..I.." + "'", str5, ".I..I..");
    }

    @Test
    public void test07511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07511");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("       ...       ...       ...       ...       ..", 153);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                           ...       ...       ...       ...       ..                                                    " + "'", str2, "                                                           ...       ...       ...       ...       ..                                                    ");
    }

    @Test
    public void test07512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07512");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("AhAhAhAhAhAhAhAhAhAhAhAhA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AhAhAhAhAhAhAhAhAhAhAhAhA" + "'", str1, "AhAhAhAhAhAhAhAhAhAhAhAhA");
    }

    @Test
    public void test07513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07513");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("I4...");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "I4..." });
    }

    @Test
    public void test07514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07514");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("", ' ');
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("                                                                                          HI!HI!H...", strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
    }

    @Test
    public void test07515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07515");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!        HI#!           ###HHI####           ...           ###HHI####           ...           ###HHI####            hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!         ", 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "          hi", "!          hi", "!          hi", "!          hi", "!          hi", "!          hi", "!          hi", "!          hi", "!          hi", "!          hi", "!        HI#!           ###HHI####           ...           ###HHI####           ...           ###HHI####            hi", "!          hi", "!          hi", "!          hi", "!          hi", "!          hi", "!          hi", "!          hi", "!          hi", "!          hi", "!         " });
    }

    @Test
    public void test07516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07516");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("hi!", "hi!", 3);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("i!HI!H...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "HHIHHHHHHHHHHHHHHHHIHHHHHHHHHHHHHH");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("!H                    4ih                !H                    4ih                !H    ", strArray4, strArray7);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "i!HI!H...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "!H                    4ih                !H                    4ih                !H    " + "'", str8, "!H                    4ih                !H                    4ih                !H    ");
    }

    @Test
    public void test07517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07517");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                                          hhhhhhhhhhhhhhh", '4', 31);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07518");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("4           ###HHI####           44           ###HHI####           44           ###HHI####           44           ###HHI####           44           ######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH##", 104);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH##" + "'", str2, "HH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH##");
    }

    @Test
    public void test07519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07519");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("   hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!i!...", "HI#!hhhhhhhhhhhhhhhhhhhhhhhhhHI444444444444444444444444444444444444444444HHI!I!444444444444444444444444444444444444444444hhhhhhhhhhhhhhhhhhHI#!hhhhhhhhhhhhhhhhhhhhhhhhhHI#!hhhhhhhhhhhhhhhhhhhhhhhhhHI#!hhhhhhhhhhhhhhhhhhhhhhhhhHI#!hhhhhhhhhhhhhhhhhhhhhhhhhHI#!hhhhhhhhhhhhhhhhhhhhhhhhhHI#!hhhhhhhhhhhhhhhhhhhhhhhhhHI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 223 + "'", int2 == 223);
    }

    @Test
    public void test07520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07520");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("HI#!HHHHHHHHHHHHHHHHHHHHHHHH", 335, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI#!HHHHHHHHHHHHHHHHHHHHHHHH###################################################################################################################################################################################################################################################################################################################" + "'", str3, "HI#!HHHHHHHHHHHHHHHHHHHHHHHH###################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test07521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07521");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("I!!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "I!!" });
    }

    @Test
    public void test07522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07522");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("4                           H4!   HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH4!4!44", "HI!IIIIIIIIIIIIIIIIIIIIIIIIIIIIHI!H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4                           H4!   HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH4!4!44" + "'", str2, "4                           H4!   HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH4!4!44");
    }

    @Test
    public void test07523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07523");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("          hia", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "          ", "", "a" });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test07524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07524");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("HI!HI!H...", "                           HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07525");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("##############!4ih##############", 62, 19);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...ih##############" + "'", str3, "...ih##############");
    }

    @Test
    public void test07526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07526");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("I                    ###HHI####              ", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 44 + "'", int2 == 44);
    }

    @Test
    public void test07527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07527");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("HHI    ...", 394, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test07528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07528");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("hi!      ....H!IH!IHhhhhhhhhhh", "hi!       aaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07529");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("aaaHhi!I!       aaa");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07530");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace(" H!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07531");
        char[] charArray6 = new char[] { 'a', ' ' };
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("hi!", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsOnly("HHH", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny("hi#!", charArray6);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("hi#!                           HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { 'a', ' ' });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test07532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07532");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("      ###44I####           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "      ###44I####           " + "'", str1, "      ###44I####           ");
    }

    @Test
    public void test07533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07533");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("I                                  II                                  II                                  II                                  II                                  II                                  II                                  II                                  II                                  II                                  ", "                         HI!HI!H...");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaahi#");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEach("ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh###", strArray3, strArray5);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "I                                  II                                  II                                  II                                  II                                  II                                  II                                  II                                  II                                  II                                  " });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaahi#" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh###" + "'", str6, "ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh###");
    }

    @Test
    public void test07534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07534");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aaaaaihHI!H", "  ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aaaaaihHI!H" });
    }

    @Test
    public void test07535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07535");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                               #...", ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "#..." });
    }

    @Test
    public void test07536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07536");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("           ####IHH###     ...", "                                                                  4           ####ihh###...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "           ####IHH###     ..." + "'", str2, "           ####IHH###     ...");
    }

    @Test
    public void test07537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07537");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("                            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07538");
        char[] charArray10 = new char[] { '4', 'a', '#', '#', 'a', '4' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("", charArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("hi!       ", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone("###HHI####", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny("I !II ! !       I !II ! !                               HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', 'a', '#', '#', 'a', '4' });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 91 + "'", int14 == 91);
    }

    @Test
    public void test07539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07539");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("HHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI" + "'", str1, "HHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI");
    }

    @Test
    public void test07540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07540");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####", "hi!aaaaaaaaaaaaaaaaaaaI                                  II                                  II ", 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07541");
        char[] charArray11 = new char[] { '4', 'a', '#', '#', 'a', '4' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("", charArray11);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("hi!       ", charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("i", charArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny("                               ###HHI####           ", charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("                                        ...  hia...  hia...  hia...  hia...  hia...  hia...  hia...  hia...  h.       ...       ...       ..                                        ", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', 'a', '#', '#', 'a', '4' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 31 + "'", int15 == 31);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test07542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07542");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################                                                                                                                                                        aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", ' ', 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test07543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07543");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace("                                        ...  hia...  hia...  hia...  hia...  hia...  hia...  hia...  hia...  h.       ...       ...       ..                                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07544");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("!HHHHHHI!I!.i!HI!H...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi4!hi4!hi4!hi4!hi4!hi4hi", 24, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!HHHHHHI!I!.i!HI!H...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi4!hi4!hi4!hi4!hi4!hi4hi" + "'", str3, "!HHHHHHI!I!.i!HI!H...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi4!hi4!hi4!hi4!hi4!hi4hi");
    }

    @Test
    public void test07545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07545");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("#######                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ", "                                                                                                                                                                                                                                                                              ", 0, 8);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       " + "'", str4, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ");
    }

    @Test
    public void test07546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07546");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444I...44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "                HHHHHHHHHHHHHH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07547");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("a", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test07548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07548");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhh                           HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################", "hi!hhi!i!       hi!hhi!i!                               HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################", 21);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '4');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhh                           HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhh                           HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################" + "'", str5, "HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhh                           HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################");
    }

    @Test
    public void test07549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07549");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                                     ", 336, "!H    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H                                                                      " + "'", str3, "!H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H                                                                      ");
    }

    @Test
    public void test07550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07550");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("                   ###HHI####    .", "444444444444444444444444444444444444444444HHI!I!       444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07551");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "44444HI!4444444444HI!4444444444HI!4444444444HI!4444444444HI!4444444444HI!4444444444HI!4444444444HI!4444444444HI!4444444444HIi!i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07552");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric("           ####IHH###                      ####IHH###                      ####IHH###                  HH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###            ###HHI####           ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07553");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("aaaaaaaaaaaaaaaaaaaaaaaaa!i!IH", "I!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07554");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase("AhAhAhAhAhAhAhAhAhAhAhAhAAhAhAhAhAhAhAhAhAhAhAhAhAAhAhAhAhAhAhAhAhAhAhAhAhAAhAhAh444444444444444444444444444444444444444444hHI!i!       444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07555");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("#######", '4', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07556");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("                               ...hhi....    ...", "aaaahi#!aaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07557");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase("           ####IHH###     ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07558");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!HHHHHHI!I!.i!HI!H...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi4!hi4!hi4!hi4!hi4!hi4hi");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "!HHHHHHI!I!.i!HI!H...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi4!hi4!hi4!hi4!hi4!hi4hi" });
    }

    @Test
    public void test07559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07559");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("i", "    H     ", 3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "I                                  ", (int) 'a', (int) (byte) 10);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "i" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "i" + "'", str9, "i");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "i" + "'", str10, "i");
    }

    @Test
    public void test07560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07560");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      ...###hi!       ####           4                                                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                  4           ####       !ih###...      HHHHHHHHHHHHHHHHHHHHHHHHH!#IH      HHHHHHHHHHHHHHHHHHHHHHHHH!#IH      HHHHHHHHHHHHHHHHHHHHHHHHH!#IH      HHHHHHHHHHHHHHHHHHHHHHHHH!#IH      HHHHHHHHHHHHHHHHHHHHHHHHH!#IH      HHHHHHHHHHHHHHHHHHHHHHHHH!#IH      HHHHHHHHHHHHHHHHHHHHHHHHH!#IH      HHHHHHHHHHHHHHHHHHHHHHHHH!" + "'", str1, "                                                                  4           ####       !ih###...      HHHHHHHHHHHHHHHHHHHHHHHHH!#IH      HHHHHHHHHHHHHHHHHHHHHHHHH!#IH      HHHHHHHHHHHHHHHHHHHHHHHHH!#IH      HHHHHHHHHHHHHHHHHHHHHHHHH!#IH      HHHHHHHHHHHHHHHHHHHHHHHHH!#IH      HHHHHHHHHHHHHHHHHHHHHHHHH!#IH      HHHHHHHHHHHHHHHHHHHHHHHHH!#IH      HHHHHHHHHHHHHHHHHHHHHHHHH!");
    }

    @Test
    public void test07561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07561");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("4444444                                                                                                                                                                                      444444444444444444444444444444444444444444HHI!I!       444444444444444444444444444444444444444444", "...aaaaa", 19);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "4444444                                                                                                                                                                                      444444444444444444444444444444444444444444HHI!I!       444444444444444444444444444444444444444444" });
    }

    @Test
    public void test07562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07562");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("iih", "I                         ...aa###HHI####aaaaaaaaaaa...", "I                                  II                                  II                                  II                                  II                                  II                                  II                                  II                          ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "iih" + "'", str3, "iih");
    }

    @Test
    public void test07563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07563");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("!h", "################################################################################################################################################################################################################################                               ###HHI####    ...#################################################################################################################################################################################################################################", "..");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!h" + "'", str3, "!h");
    }

    @Test
    public void test07564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07564");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                                                                                                                                                                                                                                           ...       ", 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                                                                                                                                                                                                                                           ...       " });
    }

    @Test
    public void test07565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07565");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H !H", "Hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 192 + "'", int2 == 192);
    }

    @Test
    public void test07566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07566");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################", "                                                                                                                                                                 #                            #                            #                            #                            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################" + "'", str2, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################");
    }

    @Test
    public void test07567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07567");
        char[] charArray14 = new char[] { '4', 'a', '#', '#', 'a', '4' };
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("", charArray14);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("hi!       ", charArray14);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly("HI!", charArray14);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("4444444", charArray14);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone("hi#                             ", charArray14);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsNone("                                              44444", charArray14);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444I...44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray14);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("####I           ####I           ####I           ####I           ####I           ####I...", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4', 'a', '#', '#', 'a', '4' });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 136 + "'", int21 == 136);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
    }

    @Test
    public void test07568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07568");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("       ...       ...       ...       ...       ...       .....       ...       ...       ...       ...       ...       ..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "....................................." + "'", str1, ".....................................");
    }

    @Test
    public void test07569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07569");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("          ...           ###HHI####           ...           ###HHI####  ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "...", "###HHI####", "...", "###HHI####" });
    }

    @Test
    public void test07570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07570");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4iHi!                          ", "!H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H                                                                      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07571");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("i                                  ################################################################", "##############################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07572");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("hi####IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH###!", '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test07573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07573");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!        HI#!           ###HHI####           ...           ###HHI####           ...           ###HHI####            hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!         ", "HI!i!aa...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07574");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...hhi.......", "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!...hi!hi!hi!hi!hi!hi!hi!hi!");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("h!", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "", "", "", "", "", "", "", "", "", "", "", "", "" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
    }

    @Test
    public void test07575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07575");
        char[] charArray7 = new char[] {};
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny("HI!HI!H...", charArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny("i                           hi!hi!hi!hi!hi!hi!hi!hi!hi!hihhi   #################################################################", charArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny("hia!###HHI", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly("HI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaa", charArray7);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("I      ...", charArray7);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly("           ###HHI####           4", charArray7);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test07576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07576");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("I!HIhi#!", "hHI!i!");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "#########################################################################################################################################################44444hi!44444i!hi!h44444hi!44444                                                                 ##########################################################################################################################################################", 257, 0);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "I!HIhi#!" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test07577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07577");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("a                                                                                                                                                ", "!H#!H...", 30);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07578");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric("hi!aaaaaaaaaaaaaaaaaaaI4444444444444444444444444444444444II4444444444444444444444444444444444II4");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07579");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                ..................                                                                ", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07580");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("Hi ", '#', (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07581");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("          hia!          hia!  ", "Hi#                             ", 126);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07582");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric("                                                                                                                                               HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07583");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                          hi!                                  ", "####ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh###", 25);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                          hi!                                  " });
    }

    @Test
    public void test07584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07584");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("                            444444444444444444444444444444444444444444444444444444444444444444444444", "               hhhhhhhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07585");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace("!HHHHHHHHHHHHHHHHHHHHHHHHH444444HI#!HHHHHHHHHHHHHHHHHHHHHHHHH444444HI#!HHHHHHHHHHHHHHHHHHHHHHHHH444444HI#!HHHHHHHHHHHHHHHHHHHHHHHHH444444HI#!HHHHHHHHHHHHHHHHHHHHHHHHH444444HI#!HHHHHHHHHHHHHHHHHHHHHHHHH444444HI#!HHHHHHHHHHHHHHHHHHHHHHHHH444444HI#!HHHHHHHHHHHHHHHHHHHHHHHHH444444...###hi!4444444####444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07586");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("...       .#hhi#       ...", 2, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444HHIHHHHHHHHHHHHHHHHIHHHHHHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...       .#hhi#       ..." + "'", str3, "...       .#hhi#       ...");
    }

    @Test
    public void test07587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07587");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("i!HI!H...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" + "'", str1, "i!hi!h...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
    }

    @Test
    public void test07588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07588");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("     hHI!i     ", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...hi##...", 23);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07589");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase("                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07590");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("hI!i!aaaaaaaaaaaaaaaaaaaaaaaaa", "       ...       ...       ...       ...       ...       .....       ...       ...       ...       ...       ...       ..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hI!i!aaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "hI!i!aaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test07591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07591");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("", "hHI!i!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07592");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA###HHI####    ...", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 142 + "'", int2 == 142);
    }

    @Test
    public void test07593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07593");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("...hi##...", 34);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...hi##...                        " + "'", str2, "...hi##...                        ");
    }

    @Test
    public void test07594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07594");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("##############################################################################################################################################################HI!IIIIIIIIIIIIIIIIIIIIIIIIIIIIHI!H##############################################################################################################################################################", "                                                                                                                                                        HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################                                                                                                                                                        aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07595");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("  I                                                                          ...                                  444444", 106, (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "        444444" + "'", str3, "        444444");
    }

    @Test
    public void test07596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07596");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("   ##", " HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                            ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                            ..." + "'", str2, "HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                            ...");
    }

    @Test
    public void test07597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07597");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("      HI#!", "iaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "      HI#!" + "'", str2, "      HI#!");
    }

    @Test
    public void test07598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07598");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("...       ...       ...       haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.       ..", "      ...       ...      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07599");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i       ...       #ihh#.       ...                   !i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i", "                     hhhhhhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07600");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "###hhi####                 ###hhi####                 ###hhi####                 ###hhi####                 ###hhi####                 ###hhi####                 ###hhi####                 ###hhi####                 ###hhi####");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07601");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                                                                                                                                                                                                                                                                                    ...           ###HHI####           ...           ###HHI####  ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 100);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test07602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07602");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("                                                                                                                                                                                                                                                                                                                                                                             ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07603");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("aaaaaih##################################", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHHIHHHHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07604");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "HI!HI!H...  I                         ...   HI!HI!H...  I                         ...   HI!HI!H...  I                         ...   HI!HI!H...  I                         ...   HI!HI!H...  I                         ...   HI!HI!H...  I                         ...   HI!HI!H...  I                         ...   HI!HI!H...  I                         ...   HI!HI!H...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07605");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("", ' ');
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("                                                                                          HI!HI!H...", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray6);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("i", "    H     ", 3);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray12, "I                                  ", (int) 'a', (int) (byte) 10);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray6, strArray12);
        java.lang.String[] strArray21 = org.apache.commons.lang3.StringUtils.split("hHI!i!aaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 9);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.replaceEach("                          ", strArray6, strArray21);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.startsWithAny("  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH", strArray21);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "i" });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "hHI!i!" });
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "                          " + "'", str22, "                          ");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test07606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07606");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("HHHHHHI#!HHHHHHHHHHHHHHHHHHHHHHHHHHI#!HHHHHHHHHHHHHHHHHHHHHHHHHHI#!HHHHHHHHHHHHHHHHHHHHHHHHHHI#!HHHHHHHHHHHHHHHHHHHHHHHHHHI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IHHHHHHHHHHHHHHHHHHHHHHHHHH!#IHHHHHHHHHHHHHHHHHHHHHHHHHH!#IHHHHHHHHHHHHHHHHHHHHHHHHHH!#IHHHHHHHHHHHHHHHHHHHHHHHHHH!#IHHHHHH" + "'", str1, "IHHHHHHHHHHHHHHHHHHHHHHHHHH!#IHHHHHHHHHHHHHHHHHHHHHHHHHH!#IHHHHHHHHHHHHHHHHHHHHHHHHHH!#IHHHHHHHHHHHHHHHHHHHHHHHHHH!#IHHHHHH");
    }

    @Test
    public void test07607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07607");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("I!HI..#!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!HI..#!" + "'", str2, "I!HI..#!");
    }

    @Test
    public void test07608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07608");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test07609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07609");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("####aHH###                 ####aHH###                 ####aHH###                 ####aHH###                 ####aHH###                 ####aHH###                 ####aHH###                 ####aHH###                 ####aHH###", "    h!    hHI!HI!H...    h!    h");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07610");
        char[] charArray8 = new char[] { 'a', ' ' };
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("hi!", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly("HHH", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("44444HI!44444", charArray8);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny("                                                                                          HI!HI!H...", charArray8);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(".", charArray8);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny("", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { 'a', ' ' });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test07611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07611");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("hi#!                           HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "hi", "#!", "                           ", "HI", "!", "HI", "!", "HI", "!", "HI", "!", "HI", "!", "HI", "!", "HI", "!", "HI", "!", "HI", "!", "HIHHI", "   ", "#################################################################" });
    }

    @Test
    public void test07612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07612");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("I !II ! !       I !II ! !                               HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I !II ! !       I !II ! !                               HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################" + "'", str1, "I !II ! !       I !II ! !                               HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################");
    }

    @Test
    public void test07613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07613");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("44444HI!4ih4444I!HI!H...44444HI!44444                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07614");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("HI!   HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!...", "                                                                ..................                                                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!   HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!..." + "'", str2, "HI!   HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!...");
    }

    @Test
    public void test07615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07615");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("HHHHHHI#!HHHHHHHHHHHHHHHHHHHHHHHHHHI#!HHHHHHHHHHHHHHHHHHHHHHHHHHI#!HHHHHHHHHHHHHHHHHHHHHHHHHHI#!HHHHHHHHHHHHHHHHHHHHHHHHHHI", "HI!HI!H...  I                         ...   HI!HI!H...  I                         ...   HI!HI!H...  I                         ...   HI!HI!H...  I                         ...   HI!HI!H...  I                         ...   HI!HI!H...  I                         ...   HI!HI!H...  I                         ...   HI!HI!H...  I                         ...   HI!HI!H...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!HI!H...  I                         ...   HI!HI!H...  I                         ...   HI!HI!H...  I                         ...   HI!HI!H...  I                         ...   HI!HI!H...  I                         ...   HI!HI!H...  I                         ...   HI!HI!H...  I                         ...   HI!HI!H...  I                         ...   HI!HI!H..." + "'", str2, "I!HI!H...  I                         ...   HI!HI!H...  I                         ...   HI!HI!H...  I                         ...   HI!HI!H...  I                         ...   HI!HI!H...  I                         ...   HI!HI!H...  I                         ...   HI!HI!H...  I                         ...   HI!HI!H...  I                         ...   HI!HI!H...");
    }

    @Test
    public void test07616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07616");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("Hhhhhhhhhh44444HI!44444", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA###HHI####    ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07617");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("HHHHHHHHHHHHHHH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07618");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", " HI!HI!H", 142);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07619");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("hi!aaaaaaaaaaaaaaaaaaaI44444444...", "              hi !Hi!                          hi !Hi!                          hi !Hi!                          hi !Hi!                          hi !Hi!                          hi !");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!aaaaaaaaaaaaaaaaaaaI44444444..." + "'", str2, "hi!aaaaaaaaaaaaaaaaaaaI44444444...");
    }

    @Test
    public void test07620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07620");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                                                                             aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###hhi####    ...                                                                                                 ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "                                                                                             ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "###", "hhi", "####", "    ", "...", "                                                                                                 " });
    }

    @Test
    public void test07621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07621");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("       ...       .#hhi#       ...                                                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "       ...       .#hhi#       ...                                                              " + "'", str1, "       ...       .#hhi#       ...                                                              ");
    }

    @Test
    public void test07622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07622");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("aaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaa###HHI####aaaaaaaaaaa...", "Hhi!I!       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaa###HHI####aaaaaaaaaaa..." + "'", str2, "aaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaa###HHI####aaaaaaaaaaa...");
    }

    @Test
    public void test07623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07623");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("                4ih                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4ih" + "'", str1, "4ih");
    }

    @Test
    public void test07624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07624");
        java.lang.String[] strArray1 = new java.lang.String[] {};
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "hi!");
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("4444444", strArray4);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test07625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07625");
        char[] charArray12 = new char[] { '4', 'a', '#', '#', 'a', '4' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("", charArray12);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("hi!       ", charArray12);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", charArray12);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("HHI", charArray12);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny("i!i!", charArray12);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("i                                                                                                                                                                                                                                                                                    ", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '4', 'a', '#', '#', 'a', '4' });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test07626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07626");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("    HI!HHI!I!       HI!HHI!I!  ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07627");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("HHHHHHHHHHHHHHHHHHHHH      hi4!HHHHHHHHHHHHHHHHHHHHHHHHH      hi4!HHHHHHHHHHHHHHHHHHHHHHHHH      hi4!HHHHHHHHHHHHHHHHHHHHHHHHH      hi4!HHHHHHHHHHHHHHHHHHHHHHHHH      hi4!HHHHHHHHHHHHHHHHHHHHHHHHH      hi4!HHHHHHHHHHHHHHHHHHHHHHHHH      hi4!HHHHHHHHHHHHHHHHHHHHHHHHH      hi4!HHHHHHHHHHHHHHHHHHHHHHHHH", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07628");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("4444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#444444444################################################################ i4444444444444444444444444444444444#44444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                             ", "###hhi###");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###hhi###" + "'", str2, "###hhi###");
    }

    @Test
    public void test07629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07629");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...4444444...");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.startsWithAny("          ...           444HHI4444           ...           444HHI4444  ", strArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444!i!444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "...4444444..." });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "...4444444..." + "'", str5, "...4444444...");
    }

    @Test
    public void test07630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07630");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("##############!ih##############");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "##############!ih##############" });
    }

    @Test
    public void test07631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07631");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("44444!IH44444...H!IH!I44444!IH44444", 63, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444!IH44444...H!IH!I44444!IH44444" + "'", str3, "444444444444444444444444444444444!IH44444...H!IH!I44444!IH44444");
    }

    @Test
    public void test07632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07632");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi", "...           ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi" + "'", str2, "hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi");
    }

    @Test
    public void test07633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07633");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "##########################################################################################################################################################4HI!4I!HI!H4HI!4#########################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07634");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "HI!IIIIIIIIIIIIIIIIIIIIIIIIIIIIHI!H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07635");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("...4444444####ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...4444444####ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh" + "'", str1, "...4444444####ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh");
    }

    @Test
    public void test07636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07636");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!aaaaaaaaaaaaaaaaaaaI4444444444444444444444444444444444II4444444444444444444444444444444444II4", "I!HIhi#", 31);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!aaaaaaaaaaaaaaaaaaaI4444444444444444444444444444444444II4444444444444444444444444444444444II4" });
    }

    @Test
    public void test07637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07637");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("H..!I!       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H..!I!" + "'", str1, "H..!I!");
    }

    @Test
    public void test07638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07638");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("!");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("#################################################################   ihhih!ih!ih!ih!ih!ih!ih!ih!ih!ih                           i", "           ###HHI####           ...", 48);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny("HI#", strArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.startsWithAny("...H!IH!I", strArray8);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("HHHHHHHHHHHHHHHHHHHHHHHHH", strArray2, strArray8);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "#################################################################   ihhih!ih!ih!ih!ih!ih!ih!ih!ih!ih                           i" });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HHHHHHHHHHHHHHHHHHHHHHHHH" + "'", str11, "HHHHHHHHHHHHHHHHHHHHHHHHH");
    }

    @Test
    public void test07639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07639");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("##############################HI!########################### HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI", "    hHHHHHHHHH     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    hHHHHHHHHH     " + "'", str2, "    hHHHHHHHHH     ");
    }

    @Test
    public void test07640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07640");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("", 403, "hiH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHh" + "'", str3, "hiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHh");
    }

    @Test
    public void test07641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07641");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("HH", "###i###");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07642");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("    H     ", "    H     ", 3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test07643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07643");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("HI!", "", (int) (byte) 100);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray6);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByCharacterType("I");
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray9);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray9, "I                           HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################");
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray9);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("!H#!H...", strArray6, strArray13);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", strArray13);
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", 'a');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("       ...       .#hhi#       ...      ", strArray13, strArray18);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray13);
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" });
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "       ...       .#hhi#       ...      " + "'", str19, "       ...       .#hhi#       ...      ");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "I" + "'", str20, "I");
    }

    @Test
    public void test07644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07644");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("IH      HHHHHHHHHHHHHHHHHHHHHHHHH!#IH      HHHHHHHHHHHHHHHHHHHHHHHHH!#IH      HHHHHHHHHHHHHHHHHHHHHHHHH!#IH      HHHHHHHHHHHHHHHHHHHHHHHHH!#IH      HHHHHHHHHHHHHHHHHHHHHHHHH!#IH      HHHHHHHHHHHHHHHHHHHHHHHHH!#IH      HHHHHHHHHHHHHHHHHHHHHHHHH!#IH      HHHHHHHHHHHHH", "#########################################################################################################################################################                                                                 44444 ih44444h ih i44444 ih44444#########################################################################################################################################################");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "IH      HHHHHHHHHHHHHHHHHHHHHHHHH!#IH      HHHHHHHHHHHHHHHHHHHHHHHHH!#IH      HHHHHHHHHHHHHHHHHHHHHHHHH!#IH      HHHHHHHHHHHHHHHHHHHHHHHHH!#IH      HHHHHHHHHHHHHHHHHHHHHHHHH!#IH      HHHHHHHHHHHHHHHHHHHHHHHHH!#IH      HHHHHHHHHHHHHHHHHHHHHHHHH!#IH      HHHHHHHHHHHHH" });
    }

    @Test
    public void test07645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07645");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!...HI!HI!HI!HI!HI!HI!HI!HI!               ", " HHHHHHHHHHHHH", 234);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test07646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07646");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("       ...       .#HHI#       ...       ");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07647");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("iaaa######################");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "iaaa######################" });
    }

    @Test
    public void test07648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07648");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("hI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI", 'a', 404);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07649");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("IHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "iHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH" + "'", str1, "iHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH");
    }

    @Test
    public void test07650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07650");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("##############################HI!########################### HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI", "                                                                                                h                                                                                                h                                                                                                h                                                                                                h                  .hi!hi!hi!hi!hi!hihI!i!                         i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07651");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI", "hi!       aaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI" });
    }

    @Test
    public void test07652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07652");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric("aaaaaaaaaaahia!###HHIaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07653");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("################################################################################################################################################################################################################################                               ###HHI####    ...#################################################################################################################################################################################################################################", "               HHHHHHHHHHHHHHH", "HHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "################################################################################################################################################################################################################################HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH###HHI####HHHH...#################################################################################################################################################################################################################################" + "'", str3, "################################################################################################################################################################################################################################HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH###HHI####HHHH...#################################################################################################################################################################################################################################");
    }

    @Test
    public void test07654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07654");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI" });
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI" });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI" });
    }

    @Test
    public void test07655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07655");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!...", "!AIH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "..." + "'", str2, "...");
    }

    @Test
    public void test07656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07656");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("  I                                                                          ...                                  444444", "aaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaa###HHI####aaaaaaaaaaa...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  I                                                                          ...                                  444444" + "'", str2, "  I                                                                          ...                                  444444");
    }

    @Test
    public void test07657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07657");
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
        java.lang.String str28 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray26, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test07658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07658");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("...       ###hhi####    ...       ...       .", "  I                                                                          ...                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...       ###hhi####    ...       ...       ." + "'", str2, "...       ###hhi####    ...       ...       .");
    }

    @Test
    public void test07659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07659");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("HI!I!       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 92, 23);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test07660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07660");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("aaaaaaaaai", "4444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#44444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07661");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace("    ...       ...       .hI!I!I!I!I!I!I!I!I!IIhI!I!I!I!I!I!I!I!I!IIhI!I!I!I!I!I!I!I!I!IIhI!I!I!I!I!I!I!I!I!IIhI!I!I!I!I!I!I!I!I!II       ...       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07662");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace("             HH              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07663");
        java.lang.String[] strArray2 = null;
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("HH", 'a');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEach("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!...", strArray2, strArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("...hhi....    ..", strArray2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "HH" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!..." + "'", str6, "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!...");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test07664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07664");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4iHi!                          ", 121, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                              4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4iHi!                          " + "'", str3, "                              4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4iHi!                          ");
    }

    @Test
    public void test07665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07665");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("hi4!HHHHHHI!I!.i!HI!H...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi#!hi#!hi#!hi#!hi#!hi#hi", 277, "                             ...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi4!HHHHHHI!I!.i!HI!H...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi#!hi#!hi#!hi#!hi#!hi#hi" + "'", str3, "hi4!HHHHHHI!I!.i!HI!H...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi#!hi#!hi#!hi#!hi#!hi#hi");
    }

    @Test
    public void test07666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07666");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("       ...       .#hhi#       ...       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07667");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("...      ...       ", 256, "hiH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiH...      ...       " + "'", str3, "hiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiH...      ...       ");
    }

    @Test
    public void test07668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07668");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("444444444444444444444444444444444444444444HHI!I!       444444444444444444444444444444444444444444         ", "         ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444HHI!I!       444444444444444444444444444444444444444444         " + "'", str2, "444444444444444444444444444444444444444444HHI!I!       444444444444444444444444444444444444444444         ");
    }

    @Test
    public void test07669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07669");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("hi#!                                                                                                                                                                                                                                                                                                                                            ", "HIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIH", 69);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07670");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("HI!", "HI!", (int) (short) -1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "                         HI!HI!H...");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "hi#!", 25, 2);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "");
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!");
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny("i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!                   ...       .#hhi#       ...       i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test07671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07671");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip(" H!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H!" + "'", str1, "H!");
    }

    @Test
    public void test07672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07672");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("################################################################################################################################################################################################################################                               ###HHI####    ...#################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07673");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("HHI    ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHI    ..." + "'", str1, "HHI    ...");
    }

    @Test
    public void test07674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07674");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444HHIHHHHHHHHHHHHHHHHIHHHHHHHHHHHHHH", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHIHHHHHHHHHHHHHHHHIHHHHHHHHHHHHHH" + "'", str2, "HHIHHHHHHHHHHHHHHHHIHHHHHHHHHHHHHH");
    }

    @Test
    public void test07675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07675");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("     HI!   HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!...      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!   HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!..." + "'", str1, "HI!   HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!...");
    }

    @Test
    public void test07676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07676");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("###HHI####...", 153, "                     HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                     HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################HHI####...                     HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   ##############" + "'", str3, "                     HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################HHI####...                     HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   ##############");
    }

    @Test
    public void test07677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07677");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("I!HI..#!", "    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07678");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("hI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IHHIH!IH!IH!IH!IH!IH!IH!IH!IH!Ih" + "'", str1, "IHHIH!IH!IH!IH!IH!IH!IH!IH!IH!Ih");
    }

    @Test
    public void test07679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07679");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    " + "'", str1, "!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    ");
    }

    @Test
    public void test07680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07680");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("                                                                                                                                ###H", "!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    " + "'", str2, "!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    ");
    }

    @Test
    public void test07681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07681");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("H!H...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H!H..." + "'", str1, "H!H...");
    }

    @Test
    public void test07682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07682");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("... !  !", "                                                                                                                     HHHHHHHHHHHHHHH                                                                                                      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "... !  !" + "'", str2, "... !  !");
    }

    @Test
    public void test07683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07683");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("I                         ...", "hHI!i!       ");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test07684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07684");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                                                           ...       ...       ...       ...       ..                                                    ", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".. ... ... ... ..." + "'", str2, ".. ... ... ... ...");
    }

    @Test
    public void test07685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07685");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("             ###HHI####    .", "hi!       aaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07686");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("...ih##############", "!4ih!4ih!4ih!4ih!4ihHHI    ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07687");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("44444444444444444444444444a                                              a!aHa#!aHa...a", "######################################################################################################################################################################...       ...       ...       ...       .....       ...       ...       ...       ...       ...       ..", 240);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "44444444444444444444444444a", "a!aHa", "!aHa", "a" });
    }

    @Test
    public void test07688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07688");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("...hhi....    ..", "                                                      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI444444444444444444444444444444444444444444HHI!I!       444444444444444444444444444444444444444444hhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...hhi....    .." + "'", str2, "...hhi....    ..");
    }

    @Test
    public void test07689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07689");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!hhi!i!       hi!hhi!i!                               HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################", "i!i!...", 352);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!hhi!i!       hi!hhi!i!                               HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!hhi!i!       hi!hhi!i!                               HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################" + "'", str4, "hi!hhi!i!       hi!hhi!i!                               HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################");
    }

    @Test
    public void test07690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07690");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4iHi!                          ", 95, 281);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4iHi!                          " + "'", str3, "4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4iHi!                          ");
    }

    @Test
    public void test07691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07691");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("HH", "4           ###HHI####           4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07692");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!        HI!           HHI           ...           HHI           ...           HHI            hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test07693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07693");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("HIH", "                          hi!                                  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07694");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("I                         ...aa###HHI####aaaaaaaaaaa...", "HHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I                         ...aa###HHI####aaaaaaaaaaa..." + "'", str2, "I                         ...aa###HHI####aaaaaaaaaaa...");
    }

    @Test
    public void test07695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07695");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("############################################################################################################################################################################################################################################################################################################i                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "############################################################################################################################################################################################################################################################################################################I                                  " + "'", str1, "############################################################################################################################################################################################################################################################################################################I                                  ");
    }

    @Test
    public void test07696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07696");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("          HHHHHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHHHHHHHHHH" + "'", str1, "HHHHHHHHHHHHH");
    }

    @Test
    public void test07697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07697");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("###hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi####", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi####" + "'", str2, "###hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi####");
    }

    @Test
    public void test07698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07698");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("hhhhhhhhhhhhhh");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07699");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("...hhi.......");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...hhi......." + "'", str1, "...hhi.......");
    }

    @Test
    public void test07700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07700");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("               HHHHHHHHHHHHHHH", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "...#####");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "               HHHHHHHHHHHHHHH" + "'", str3, "               HHHHHHHHHHHHHHH");
    }

    @Test
    public void test07701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07701");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...       .#hhi#       ...      ", '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "...       .#hhi#       ...      " });
    }

    @Test
    public void test07702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07702");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("hI#                                                  HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################", "                                              !H#!H...                                              ", 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hI", "I", "I", "I", "I", "I", "I", "I", "I", "I", "I", "I" });
    }

    @Test
    public void test07703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07703");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaa.hi!hi!hi!hi!hi!hihHI!i!aaaaaaaaaaaaaaaaaaaaaaaaai!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaa.hi!hi!hi!hi!hi!hihHI!i!aaaaaaaaaaaaaaaaaaaaaaaaai!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07704");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("44444HI!4ih4444I!HI!H...44444HI!44444", "44444444444444444444444444444444444444444444444444444444i#!HHHHHHHHHHHHHHHHHHHHHHHHHHI#!HHHHHHHHHHHHHHHHHHHHHHHHHHI#!HHHHHHHHHHHHHHHHHHHHHHHHHHI#!HHHHHHHHHHHHHHHHHHHHHHHHHHI#!HHHHHHHHHHHHHHHHHHHHHHHHHHI#!HHHHHHHHHHHHHHHHHHHHHHHHHHI#!HHHHHHHHHHHHHHHHHHHHHHHHHHI#!HHHHHHHHHHHHHHHHHHHHHHHHHHI444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07705");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "44444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07706");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase(".i..i.", "...aaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07707");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("####ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh###");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, ' ', 0, 4);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "####", "ihh", "#######", "ihh", "#######", "ihh", "#######", "ihh", "#######", "ihh", "#######", "ihh", "#######", "ihh", "#######", "ihh", "#######", "ihh", "###" });
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "####", "ihh", "#######", "ihh", "#######", "ihh", "#######", "ihh", "#######", "ihh", "#######", "ihh", "#######", "ihh", "#######", "ihh", "#######", "ihh", "###" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#### ihh ####### ihh" + "'", str6, "#### ihh ####### ihh");
    }

    @Test
    public void test07708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07708");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("                          hi!                                  ", "...       ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                          hi!                                  " + "'", str2, "                          hi!                                  ");
    }

    @Test
    public void test07709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07709");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi4!hi4!hi4!hi4!hi4!hi4!HHHHHHI!I!...", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi4!hi4!hi4!hi4!hi4!hi4!HHHHHHI!I!..." });
    }

    @Test
    public void test07710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07710");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi", 137);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH   " + "'", str2, "hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH   ");
    }

    @Test
    public void test07711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07711");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("!4ih!4ih!4ih!4ih!4ihHHI    ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!4ih!4ih!4ih!4ih!4ihHHI    ..." + "'", str1, "!4ih!4ih!4ih!4ih!4ihHHI    ...");
    }

    @Test
    public void test07712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07712");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("haih", '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "haih" });
    }

    @Test
    public void test07713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07713");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("!i!#########");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!i!#########" + "'", str1, "!i!#########");
    }

    @Test
    public void test07714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07714");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("...       ...       ...       ...       .....       ...       ...       ...       ...       ...       ..");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "...", "       ", "...", "       ", "...", "       ", "...", "       ", ".....", "       ", "...", "       ", "...", "       ", "...", "       ", "...", "       ", "...", "       ", ".." });
    }

    @Test
    public void test07715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07715");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("", "                                    ##IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH###", "       ...       ...       ...       ...       .....       ...       ...       ...       ...       ...       ..");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
    }

    @Test
    public void test07716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07716");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("      ...       ...      ", "I                                  #################################################################");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test07717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07717");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase(".hiI4....hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".hii4....hi" + "'", str1, ".hii4....hi");
    }

    @Test
    public void test07718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07718");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("hi!       ", "...h!ih!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!       " + "'", str2, "hi!       ");
    }

    @Test
    public void test07719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07719");
        char[] charArray6 = new char[] {};
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsAny("HI!HI!H...", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny("                                                 h                                                  ", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone("I", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone("###HHI####    ...", charArray6);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone("aaaaaaaaaaaaaaaaaaaaaaaaa!i!IH", charArray6);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly("    hHHHHHHHHH     ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test07720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07720");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("!H!H...                                             ", "    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!H!H...                                             " + "'", str2, "!H!H...                                             ");
    }

    @Test
    public void test07721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07721");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("...    ####ihh###aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa########!4ih#########", '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test07722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07722");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("                               ###hhi####    ...", "                                                      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI", "...       .#hhi#       ...      ", 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                               ###hhi####    ..." + "'", str4, "                               ###hhi####    ...");
    }

    @Test
    public void test07723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07723");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("aaaaaaaaaaaaaaaaaaaa4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4aaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                    ", "!4ih", "4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test07724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07724");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("               hhhhhhhhhhhhhhh", 180, "4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih               hhhhhhhhhhhhhhh4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih" + "'", str3, "4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih               hhhhhhhhhhhhhhh4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih");
    }

    @Test
    public void test07725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07725");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("IHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH" + "'", str2, "IHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH");
    }

    @Test
    public void test07726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07726");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("...       ...       ...       haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.       ..", "###hhi####    ...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...       ...       ...       haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.       .." + "'", str2, "...       ...       ...       haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.       ..");
    }

    @Test
    public void test07727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07727");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("4444444                                                                                                                                                                                      444444444444444444444444444444444444444444HHI!I!       444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444                                                                                                                                                                                      444444444444444444444444444444444444444444hhi!i!       444444444444444444444444444444444444444444" + "'", str1, "4444444                                                                                                                                                                                      444444444444444444444444444444444444444444hhi!i!       444444444444444444444444444444444444444444");
    }

    @Test
    public void test07728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07728");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!...HI!HI!HI!HI!HI!HI!HI!HI!                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!i!...hi!hi!hi!hi!hi!hi!hi!hi!                " + "'", str1, "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!i!...hi!hi!hi!hi!hi!hi!hi!hi!                ");
    }

    @Test
    public void test07729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07729");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("###hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi####", "hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!      ...", 10, 14);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "###hhi####hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!      ...hi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi####" + "'", str4, "###hhi####hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!      ...hi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi####");
    }

    @Test
    public void test07730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07730");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                                                                                                                                                                                               ...hhi......                                                                                                                                                                                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...hhi......" + "'", str1, "...hhi......");
    }

    @Test
    public void test07731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07731");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad(" H!", 158, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!H H!" + "'", str3, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!H H!");
    }

    @Test
    public void test07732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07732");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("i!hi!h...            ", 7, "HHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHH                         ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "i!hi!h...            " + "'", str3, "i!hi!h...            ");
    }

    @Test
    public void test07733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07733");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("44444444444444444444444444a                                              a!aHa#!aHa...a", "                                             ia!###HHI                                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444a                                              a!aHa#!aHa...a" + "'", str2, "44444444444444444444444444a                                              a!aHa#!aHa...a");
    }

    @Test
    public void test07734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07734");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("  ...                                                                                                                                                                                                                                                                                                                                      ...", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07735");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("hi!      .I..I..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07736");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("hi#!           ###HHI####           ...           ###HHI####           ...           ###HHI####  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi#!           ###HHI####           ...           ###HHI####           ...           ###HHI####  " + "'", str1, "hi#!           ###HHI####           ...           ###HHI####           ...           ###HHI####  ");
    }

    @Test
    public void test07737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07737");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("hiah", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...H!IH!IH aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test07738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07738");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("       ...       ...       ...       ...       .....       ...       ...       ...       ...       ...       ..", 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07739");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("      ...       ...      ", "Hi!                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "      ...       ...      " + "'", str2, "      ...       ...      ");
    }

    @Test
    public void test07740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07740");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip(" !", "                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!" + "'", str2, "!");
    }

    @Test
    public void test07741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07741");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                            #...", 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07742");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("      ...       ...      ", "", "HHI");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test07743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07743");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                hhhhhhhhhhhhhhh", 132);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07744");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                           HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################", 0, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                           HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################" + "'", str3, "                           HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################");
    }

    @Test
    public void test07745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07745");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("HI!I!HI!H...HI!", "h                                                                                                h                                                                                                h                                                                                                h                  .hi!hi!hi!hi!hi!hihHI!i!                         i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", 106, 273);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HI!I!HI!H...HI!h                                                                                                h                                                                                                h                                                                                                h                  .hi!hi!hi!hi!hi!hihHI!i!                         i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h" + "'", str4, "HI!I!HI!H...HI!h                                                                                                h                                                                                                h                                                                                                h                  .hi!hi!hi!hi!hi!hihHI!i!                         i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
    }

    @Test
    public void test07746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07746");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("!H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H                                                                      ", "Hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H                                                                      " + "'", str2, "!H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H                                                                      ");
    }

    @Test
    public void test07747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07747");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("################################################################################################################################################################################################################################HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH###HHI####HHHH...#################################################################################################################################################################################################################################", '4', 16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07748");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("hHHHHHHHHHHHHH", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test07749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07749");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("          hia!", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07750");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("...hi##...                        ", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test07751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07751");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test07752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07752");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                         HI!HI!H...", "!H");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny(" HHHHHHHHHHHHH", strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "HHIHHHHHHHHHHHHHHHHIHHHHHHHHHHHHHH");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                         HI", "I", "..." });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "                         HIHHIHHHHHHHHHHHHHHHHIHHHHHHHHHHHHHHIHHIHHHHHHHHHHHHHHHHIHHHHHHHHHHHHHH..." + "'", str6, "                         HIHHIHHHHHHHHHHHHHHHHIHHHHHHHHHHHHHHIHHIHHHHHHHHHHHHHHHHIHHHHHHHHHHHHHH...");
    }

    @Test
    public void test07753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07753");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("", 90);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                          " + "'", str2, "                                                                                          ");
    }

    @Test
    public void test07754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07754");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("         ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "####IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH###" + "'", str1, "####IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH###");
    }

    @Test
    public void test07755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07755");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H..." + "'", str1, "i!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...");
    }

    @Test
    public void test07756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07756");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                            #...");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "                            ", "#..." });
    }

    @Test
    public void test07757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07757");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace("################################################################# HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI I");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07758");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("hi4!hi4!hi4!hi4!hi4!hi4!HHHHHHI!I!.i!HI!H...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi                                                            ", 153, 596);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi                                                            " + "'", str3, "i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi                                                            ");
    }

    @Test
    public void test07759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07759");
        char[] charArray12 = new char[] { '4', 'a', '#', '#', 'a', '4' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("", charArray12);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("hi!       ", charArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly("HI!", charArray12);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny("I                                  #################################################################", charArray12);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone("########!4ih#########", charArray12);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("HHHHHHHHHHHHH", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '4', 'a', '#', '#', 'a', '4' });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test07760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07760");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###hhi####    ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07761");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase(".       ...       ...       ..                                                                                                                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07762");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("I!HI!H...            ", "###hhi", 56, 256);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "I!HI!H...            ###hhi" + "'", str4, "I!HI!H...            ###hhi");
    }

    @Test
    public void test07763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07763");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("hhhhhhhhhhhhhhh", "###hhi###");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07764");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("ihi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!i!..");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "ihi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!i!.." });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ihi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!i!.." + "'", str2, "ihi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!i!..");
    }

    @Test
    public void test07765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07765");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("...                             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...                            " + "'", str1, "...                            ");
    }

    @Test
    public void test07766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07766");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("!H!H..");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "!H!H.." });
    }

    @Test
    public void test07767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07767");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                                             aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###hhi####    ...                                                                                                 ", '#', 394);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07768");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("", "44444444444444444444444444                                              !H#!H...     ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07769");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("", "hhhHI#!hhhhhhhhhhhhhhhhhhhhhhhhhHI#!hhhhhhhhhhhhhhhhhhhhhhhhhHI", 338);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07770");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("A");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A" + "'", str1, "A");
    }

    @Test
    public void test07771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07771");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA###HHI####    ...", "hia!###hh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07772");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("...hhi....    ...", 9, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...hhi....    ..." + "'", str3, "...hhi....    ...");
    }

    @Test
    public void test07773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07773");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid(".       ...       ...       ..", 14, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test07774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07774");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("4444444444444444444444444444444444444444!AIH                                                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444!AIH                                               " + "'", str1, "4444444444444444444444444444444444444444!AIH                                               ");
    }

    @Test
    public void test07775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07775");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                              4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4iHi!                          ", "hHHHHHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                              4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4iHi!                          " + "'", str2, "                              4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4iHi!                          ");
    }

    @Test
    public void test07776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07776");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace("HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07777");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("    ...       ...       .#hhi#       ...       ", "hia!###HH");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray3);
        java.lang.String[] strArray6 = null;
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                 HHHHHHHHHHHHHHH", strArray3, strArray6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "    ...       ...       .", "", "", "", "", "       ...       " });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                 HHHHHHHHHHHHHHH" + "'", str7, "                 HHHHHHHHHHHHHHH");
    }

    @Test
    public void test07778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07778");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("iaaa", "##############################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "iaaa" + "'", str2, "iaaa");
    }

    @Test
    public void test07779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07779");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("aaaaaaaaaaaaaaaaaaaaaaaaaahi#", 103, "###hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...#");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###hhi...####hhi...####hhi...####hhi.aaaaaaaaaaaaaaaaaaaaaaaaaahi####hhi...####hhi...####hhi...####hhi." + "'", str3, "###hhi...####hhi...####hhi...####hhi.aaaaaaaaaaaaaaaaaaaaaaaaaahi####hhi...####hhi...####hhi...####hhi.");
    }

    @Test
    public void test07780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07780");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "!I!...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07781");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("hi#!           ###HHI####           ...           ###HHI####           ...           ###HHI####  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi#!           ###hhi####           ...           ###hhi####           ...           ###hhi####  " + "'", str1, "hi#!           ###hhi####           ...           ###hhi####           ...           ###hhi####  ");
    }

    @Test
    public void test07782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07782");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Hi", " ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "Hi" });
    }

    @Test
    public void test07783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07783");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("44444HI!44444", ".I..I..4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test07784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07784");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("       ...       .#hhi#       ...                                                               ", 'a', 11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07785");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("hhhhhhhhhh", 3);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhh" + "'", str2, "hhh");
    }

    @Test
    public void test07786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07786");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("!H!H...", "  I                         ...   ", (int) (short) 10);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "!H!H" });
    }

    @Test
    public void test07787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07787");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("..", "HHI!I!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07788");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("i!");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH", "hia!###HHI");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray2, strArray5);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "i", "!" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test07789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07789");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("4444444                                                                                                                                                                                                                                                                                      ", "4444444444444444444444444444444444444444!AIH                                                ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a', (int) (byte) 1, 95);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "4444444                                                                                                                                                                                                                                                                                      " });
    }

    @Test
    public void test07790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07790");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("                                                            aaaaaih                                                             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaih" + "'", str1, "aaaaaih");
    }

    @Test
    public void test07791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07791");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("hi!aaaaaaaaaaaaaaaaaaaI                                  II                                  II hhhh", ".I..I...I..I......I..I...I..I..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!aaaaaaaaaaaaaaaaaaaI                                  II                                  II hhhh" + "'", str2, "hi!aaaaaaaaaaaaaaaaaaaI                                  II                                  II hhhh");
    }

    @Test
    public void test07792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07792");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("4                ", "#######                                                                                                                                                                                                                                                                                                                                             ", 285);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "4                " });
    }

    @Test
    public void test07793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07793");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!...hi!hi!hi!hi!hi!hi!hi!hi!", "##############################################################################################################################################################HI!IIIIIIIIIIIIIIIIIIIIIIIIIIIIHI!H##############################################################################################################################################################", "44444444444444444444444444                                              !H#!H...     ...");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test07794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07794");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("hH4444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#444444444################################################################ i4444444444444444444444444444444444#44444444444444444444444444!i!       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hH4444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#444444444################################################################i4444444444444444444444444444444444#44444444444444444444444444!i!" + "'", str1, "hH4444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#444444444################################################################i4444444444444444444444444444444444#44444444444444444444444444!i!");
    }

    @Test
    public void test07795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07795");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("      ###hhi####                 ###hhi####                 ###hhi####                 ###hhi####                 ###hhi####                 ###hhi####                 ###hhi####                 ###hhi####                 ###hhi####           ", "...       ...       ...       ...       .");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test07796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07796");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("", 0, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test07797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07797");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("   ", 137);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                         " + "'", str2, "                                                                                                                                         ");
    }

    @Test
    public void test07798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07798");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("i                                  ################################################################", "################################################################################################################################################################################################################################                               ###HHI####    ...#################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07799");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("                HHHHHHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHHHHHHHHHHH" + "'", str1, "HHHHHHHHHHHHHH");
    }

    @Test
    public void test07800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07800");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("####IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH###", "!#hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "####IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH###" + "'", str2, "####IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH###");
    }

    @Test
    public void test07801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07801");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444I...44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "i!HI!H...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444I...44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" });
    }

    @Test
    public void test07802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07802");
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
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray14, "             hh              ");
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
    public void test07803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07803");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHiiiiiiiiiiiiiiiiiiiiihi!h", "   ##");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07804");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   ################################################################", "!Ha!H...");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "", "I", "", "I", "", "I", "", "I", "", "I", "", "I", "", "I", "", "I", "", "I", "", "I   ################################################################" });
    }

    @Test
    public void test07805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07805");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("4444444444444444444444444444444444444444!AIH                                               ", "hi#!           ###hhi####           ...           ###hhi####           ...           ###hhi####  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444!AIH                                               " + "'", str2, "4444444444444444444444444444444444444444!AIH                                               ");
    }

    @Test
    public void test07806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07806");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("...H!IH!IH                         ", "#######");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "           HHI           ...");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "...H!IH!IH                         " });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "!IH!" });
    }

    @Test
    public void test07807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07807");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("...                             ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07808");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("I                                  #################################################################                           HI!   HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I#################################################################HI!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!..." + "'", str1, "I#################################################################HI!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!...");
    }

    @Test
    public void test07809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07809");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("####IHH###           ...           ####IHH###           ...           ####IHH###           !#IH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07810");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07811");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("###", "hi4!hi4!hi4!hi4!hi4!hi4!HHHHHHI!I!.i!HI!H...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "          ...           444HHI4444           ...           444HHI4444  ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test07812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07812");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!!" + "'", str1, "!!");
    }

    @Test
    public void test07813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07813");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("", ' ');
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("                                                                                          HI!HI!H...", strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("#### ihh ####### ihh", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test07814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07814");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable("           HHI           ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07815");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("                 ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07816");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07817");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("hi#!                           HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################", "!H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H    !H                                                                      ", "..I..I...I..I......I..I...I..I.");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test07818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07818");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test07819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07819");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hHI!i!       ", "aaaaaihaaaaaihaaaaaihaaaaaihaaaaaaaaihaaaaaihaaaaaihaaaaaihaaaa", 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hHI!i!       " });
    }

    @Test
    public void test07820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07820");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "hi!");
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("hi!", strArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, "");
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, "###hhi####", (int) '#', (int) (byte) 0);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray6);
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("      HI#!", "           ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###           ");
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("ia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hi", strArray6, strArray17);
        int int19 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("444444444444i...4444444444444", strArray6);
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
    public void test07821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07821");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("...hhi....    ...", "H I####           I####           I####           I####           I####           I####           I####           I####           I####           ", 99);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "...hhi....", "..." });
    }

    @Test
    public void test07822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07822");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                   ");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.startsWithAny("HI#!HHHHHHHHHHHHHHHHHHHHHHHHH     ", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                   " });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test07823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07823");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("    hi!hhi!i!       hi!hhi!i!  ", "                                                                                                                                        !H                                                                                                                                             ", 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07824");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast(".               HHHHHHHHHHHHHHH", "aaaaaaaaai");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07825");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("####I           ####I           ####I           ####I           ####I           ####I           ####I           ####I           ####I H");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07826");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("!H!H...                                             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!H!H..." + "'", str1, "!H!H...");
    }

    @Test
    public void test07827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07827");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("HIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIH");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "HIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIH" });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIH" + "'", str2, "HIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIH");
    }

    @Test
    public void test07828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07828");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("44444444444444444444444444444444444444444444444444444444###hhi###44444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444444444444444444###hhi###44444444444444444444444444444444444444444444444444444444" + "'", str1, "44444444444444444444444444444444444444444444444444444444###hhi###44444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test07829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07829");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf(".I..I..", "###I###");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07830");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("IH###hhi...");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "IH", "###", "hhi", "..." });
    }

    @Test
    public void test07831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07831");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi#", "hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi444444444444444444444444444444444444444444hhi!i!       444444444444444444444444444444444444444444hhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi#" });
    }

    @Test
    public void test07832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07832");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("             ###HHI####    .");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###HHI####    ." + "'", str1, "###HHI####    .");
    }

    @Test
    public void test07833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07833");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("         ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###      ", "...hhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhh...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07834");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("#                             #####################################", "");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "#                             #####################################" });
    }

    @Test
    public void test07835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07835");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H..." + "'", str1, "I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...");
    }

    @Test
    public void test07836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07836");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("Hi");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "Hi" });
    }

    @Test
    public void test07837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07837");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("####ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######", "#########################################################################################################################################################44444hi 44444i hi h44444hi 44444                                                                 #########################################################################################################################################################", 328);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "####ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######" });
    }

    @Test
    public void test07838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07838");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("      .....", "hHI!i!       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "      ....." + "'", str2, "      .....");
    }

    @Test
    public void test07839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07839");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("!H HI!HHI!I!       HI!HHI!I!       HI!HHI!I!       HI!HHI!I!       HI!HHI!I!       HI!HHI!I!       HI!H", 'a', 90);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07840");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("HHI    ...", 596);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHI    ..." + "'", str2, "HHI    ...");
    }

    @Test
    public void test07841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07841");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("I                    ###HHI####             ", "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!H!H...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07842");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("..", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07843");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("h!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h!" + "'", str1, "h!");
    }

    @Test
    public void test07844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07844");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("Hi#                             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi#" + "'", str1, "Hi#");
    }

    @Test
    public void test07845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07845");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                                                                          HI!HI!H...");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "HHIIIIIIIIIIIIIIIIIIIIIHI!H");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "                                                                                          ", "HI", "!", "HI", "!", "H", "..." });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                                                                          ", "", "", "", "", "", "..." });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test07846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07846");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("44444444444444444444444444444444", 281);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444" + "'", str2, "44444444444444444444444444444444");
    }

    @Test
    public void test07847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07847");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("                                                                                                                     HHHHHHHHHHHHHHH                                                                                                     ", "###HHI#######HHI#######HHI#######HHI#######HHI#######HHI#######HHI#######HHI#######HHI#######HHI#######HHI#######HHI#######HHI####");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                     HHHHHHHHHHHHHHH                                                                                                     " + "'", str2, "                                                                                                                     HHHHHHHHHHHHHHH                                                                                                     ");
    }

    @Test
    public void test07848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07848");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("...         ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07849");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("4           ###HHI####           44           ###HHI####           44           ###HHI####           44           ###HHI####           44           ######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH##", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444!i!444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07850");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("    ###HHI####           ...", 24);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###HHI####           ..." + "'", str2, "###HHI####           ...");
    }

    @Test
    public void test07851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07851");
        char[] charArray14 = new char[] { '4', 'a', '#', '#', 'a', '4' };
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("", charArray14);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("hi!       ", charArray14);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly("HI!", charArray14);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("4444444", charArray14);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsAny("   ", charArray14);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly("..", charArray14);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly("                                                                                          ", charArray14);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsOnly("..", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4', 'a', '#', '#', 'a', '4' });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test07852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07852");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("                                        ...  hia...  hia...  hia...  hia...  hia...  hia...  hia...  hia...  h.       ...       ...       ..                                        ", "###HHI####    .");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 45 + "'", int2 == 45);
    }

    @Test
    public void test07853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07853");
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
        java.lang.String[] strArray28 = org.apache.commons.lang3.StringUtils.stripAll(strArray18, "i!i!...");
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
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] {});
    }

    @Test
    public void test07854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07854");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("I#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07855");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("##################################################################################################################################################", 24);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##################################################################################################################################################" + "'", str2, "##################################################################################################################################################");
    }

    @Test
    public void test07856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07856");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("!", "                                                           ...       ...       ...       ...       ..                                                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07857");
        char[] charArray10 = new char[] { '4', 'a', '#', '#', 'a', '4' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("hi!       ", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("44444HI!44444I!HI!H44444HI!44444", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', 'a', '#', '#', 'a', '4' });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test07858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07858");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("aaaHhi!I!       aaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaHhi!I!       aaa" + "'", str1, "aaaHhi!I!       aaa");
    }

    @Test
    public void test07859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07859");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("...4444444####ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...4444444####ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh" + "'", str1, "...4444444####ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh");
    }

    @Test
    public void test07860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07860");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "HI!I!       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07861");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH", "#################################################################ihhih!ih!ih!ih!ih!ih!ih!ih!ih!ihi", 39, 30);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHHHHHHHHHHHHHHHHHHHHHHH     #################################################################ihhih!ih!ih!ih!ih!ih!ih!ih!ih!ihiHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH" + "'", str4, "HHHHHHHHHHHHHHHHHHHHHHHHH     #################################################################ihhih!ih!ih!ih!ih!ih!ih!ih!ih!ihiHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH");
    }

    @Test
    public void test07862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07862");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("aaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaa###HHI####aaaaaaaaaaa...", "                               ###hhi####    ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11 + "'", int2 == 11);
    }

    @Test
    public void test07863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07863");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("...H!IH!IH ", 114, 93);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test07864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07864");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("#################################################################   IHHIH!IH!IH!IH!IH!IH!IH!IH!IH!IH                           I", "...hhi....    ..!AIH##################################hiaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07865");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("4           ###HHI####           4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4           ###hhi####           4" + "'", str1, "4           ###hhi####           4");
    }

    @Test
    public void test07866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07866");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!IHHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!IH", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07867");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("   hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!i!...", "hi!      ....H!IH!IH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07868");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("i           ###HHI####              ", "                                                                                                                     HHHHHHHHHHHHHHH                                                                                                      ");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("###i###", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
    }

    @Test
    public void test07869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07869");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4iHi!                          ", 345, "...  hia...  hia...  hia...  hia...  hia...  hia...  hia...  hia...  h.       ...       ...       ..");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...  hia...  hia...  hia...  hia...  hia...  hia...  hia...  hia...  h.       ...       ...       .....  hia...  hia...  hia...  hia...  hia...  hia...  hia...  hia...  h.       ...       ...       .....  hia...  hia...  hia...  hia...  hia...  hia...  h4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4iHi!                          " + "'", str3, "...  hia...  hia...  hia...  hia...  hia...  hia...  hia...  hia...  h.       ...       ...       .....  hia...  hia...  hia...  hia...  hia...  hia...  hia...  hia...  h.       ...       ...       .....  hia...  hia...  hia...  hia...  hia...  hia...  h4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4iHi!                          ");
    }

    @Test
    public void test07870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07870");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("##############################################################   ihhih!ih!ih!ih!ih!ih!ih!ih!ih!ih                           i");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "##############################################################", "   ", "ihhih", "!", "ih", "!", "ih", "!", "ih", "!", "ih", "!", "ih", "!", "ih", "!", "ih", "!", "ih", "!", "ih", "                           ", "i" });
    }

    @Test
    public void test07871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07871");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric("###hhi...#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07872");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!H hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!h");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test07873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07873");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("4HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H..hi!       aaaaaaaaaaaaaaaaaaa4HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H..hi!       aaaaaaaaaaaaaaaaaaa4HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H.." + "'", str1, "4HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H..hi!       aaaaaaaaaaaaaaaaaaa4HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H..");
    }

    @Test
    public void test07874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07874");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("I                           HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   ################################################################", "                             ...", 45, 129);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "I                           HI!HI!HI!HI!HI!HI                             ..." + "'", str4, "I                           HI!HI!HI!HI!HI!HI                             ...");
    }

    @Test
    public void test07875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07875");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("              ################################################################", "                                                                                                                                                                                                                                                                                                                                                                                    ...           ###HHI####           ...           ###HHI####  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07876");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("                                                                                                             aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###hhi####    ...                                                                                                 ", "                            ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 324 + "'", int2 == 324);
    }

    @Test
    public void test07877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07877");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH", "i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07878");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("  HI...", "!H    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  HI..." + "'", str2, "  HI...");
    }

    @Test
    public void test07879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07879");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("!I!...        ###HHI####           ...", "Hi !                                                                                               !aih                                                                                    ", "!#hi", 126);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "!I!...        ###HHI####           ..." + "'", str4, "!I!...        ###HHI####           ...");
    }

    @Test
    public void test07880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07880");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("I                         ...", "hHI!i!       ");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "4444444");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "..." + "'", str6, "...");
    }

    @Test
    public void test07881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07881");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric("IHI!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07882");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("##############################################################################################################################################################HI!IIIIIIIIIIIIIIIIIIIIIIIIIIIIHI!H###############################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##############################################################################################################################################################HI!IIIIIIIIIIIIIIIIIIIIIIIIIIIIHI!H###############################################################################################################################################################" + "'", str1, "##############################################################################################################################################################HI!IIIIIIIIIIIIIIIIIIIIIIIIIIIIHI!H###############################################################################################################################################################");
    }

    @Test
    public void test07883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07883");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("      ###44I####           ", "       ...       ...       ...       ...       .....       ...       ...       ...       ...       ...       ..");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07884");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("Hi !                                                                                             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07885");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI", "hiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiH...      ...       ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07886");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "HI#!           ###HHI####           ...           ###HHI####           ...           ###HHI####  ");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "i!i!...");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str4, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test07887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07887");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("   HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!..." + "'", str1, "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!...");
    }

    @Test
    public void test07888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07888");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("hi!aaaaaaaaaaaaaaaaaaaI                                  II                                  II hhhh", (int) 'a', "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!aaaaaaaaaaaaaaaaaaaI                                  II                                  II hhhh" + "'", str3, "hi!aaaaaaaaaaaaaaaaaaaI                                  II                                  II hhhh");
    }

    @Test
    public void test07889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07889");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("aaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaa###HHI####aaaaaaaaaaa...");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07890");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("44444444444444444444444444                                              !H#!H...     ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07891");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace("...4444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07892");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase(".               HHHHHHHHHHHHHHH", "                                                                                                                     HHHHHHHHHHHHHHH                                                                                                      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".               HHHHHHHHHHHHHHH" + "'", str2, ".               HHHHHHHHHHHHHHH");
    }

    @Test
    public void test07893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07893");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih               hhhhhhhhhhhhhhh4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih", "HI#", "                                                                ..................                                                                ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test07894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07894");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("H", "hi!", (int) (short) 0);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '4', 10, 0);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny("!h", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "H" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test07895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07895");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("...h!ih!ih", "HHhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######Hhi!I!#######");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...h!ih!ih" + "'", str2, "...h!ih!ih");
    }

    @Test
    public void test07896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07896");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("4           ###HHI####           4", "!AIH                                                ", 45);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "4           ###HHI####           4" });
    }

    @Test
    public void test07897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07897");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("###################HHI#######HHI#######HHI#######HHI#######HHI#######HHI#######HHI#######HHI#######HHI#######HHI#######HHI#######HHI#######HHI####", "!i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###################HHI#######HHI#######HHI#######HHI#######HHI#######HHI#######HHI#######HHI#######HHI#######HHI#######HHI#######HHI#######HHI####" + "'", str2, "###################HHI#######HHI#######HHI#######HHI#######HHI#######HHI#######HHI#######HHI#######HHI#######HHI#######HHI#######HHI#######HHI####");
    }

    @Test
    public void test07898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07898");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("i#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi", "##############!ih##############");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test07899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07899");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "                                                                    444444444444444444444444444444444444444444hhi!i!       444444444444444444444444444444444444444444                                                                     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07900");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("...       ...", "             hh              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...       ..." + "'", str2, "...       ...");
    }

    @Test
    public void test07901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07901");
        char[] charArray12 = new char[] { '4', 'a', '#', '#', 'a', '4' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("", charArray12);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("hi!       ", charArray12);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny("###hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi####", charArray12);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly("                               ###HHI####    ...", charArray12);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly("                                                                                                                                                                                                                                                                                                                                              hia!", charArray12);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone("hhhhhhhiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '4', 'a', '#', '#', 'a', '4' });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test07902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07902");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("aaaaaih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaih" + "'", str1, "aaaaaih");
    }

    @Test
    public void test07903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07903");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("4HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H..hi!       aaaaaaaaaaaaaaaaaaa4HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07904");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("I                                  #################################################################", "");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "I                                  #################################################################" });
    }

    @Test
    public void test07905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07905");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("..       ...       ...       ...       ...       ...       .....       ...       ...       ...       ...       ...", 129);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "..       ...       ...       ...       ...       ...       .....       ...       ...       ...       ...       ..." + "'", str2, "..       ...       ...       ...       ...       ...       .....       ...       ...       ...       ...       ...");
    }

    @Test
    public void test07906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07906");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("hI!I!I!I!I!I!I!I!I!II");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07907");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI", ' ');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "HI!i!aaaaaaaaaaaaaaaaaaaaaaaaa", 0, (int) (byte) 10);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str6, "HI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "                                                      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI" + "'", str8, "                                                      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI");
    }

    @Test
    public void test07908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07908");
        char[] charArray16 = new char[] { '4', 'a', '#', '#', 'a', '4' };
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("", charArray16);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("hi!       ", charArray16);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly("HI!", charArray16);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny("I                                  #################################################################", charArray16);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsNone("########!4ih#########", charArray16);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsNone("HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!", charArray16);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsNone("                     HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################", charArray16);
        int int24 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!HIhi#!", charArray16);
        int int25 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("HI!i!aaaaaaaaaaaaaaaaaaaaaaaaa", charArray16);
        int int26 = org.apache.commons.lang3.StringUtils.indexOfAny("HI#!HHHHHHHHHHHHHHHHHHHHHHHH###################################################################################################################################################################################################################################################################################################################", charArray16);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '4', 'a', '#', '#', 'a', '4' });
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 91 + "'", int24 == 91);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
    }

    @Test
    public void test07909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07909");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("###HHI#######HHI#######HHI#######HHI#######HHI#######HHI#######HHI#######HHI#######HHI#######HHI#######HHI#######HHI#######HHI####");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###HHI#######HHI#######HHI#######HHI#######HHI#######HHI#######HHI#######HHI#######HHI#######HHI#######HHI#######HHI#######HHI####" + "'", str1, "###HHI#######HHI#######HHI#######HHI#######HHI#######HHI#######HHI#######HHI#######HHI#######HHI#######HHI#######HHI#######HHI####");
    }

    @Test
    public void test07910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07910");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("###i###", "                4ih                ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07911");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("HHIHHHHHHHHHHHHHHHHHHHHHHHHH", '#');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH");
        boolean boolean8 = org.apache.commons.lang3.StringUtils.startsWithAny("I                         ...", strArray5);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.startsWithAny("hi4!hi4!hi4!hi4!hi4!hi4!HHHHHHI!I!.i!HI!H...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", strArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny("ih", strArray10);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "HHIHHHHHHHHHHHHHHHHHHHHHHHHH" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HHIHHHHHHHHHHHHHHHHHHHHHHHHH" + "'", str7, "HHIHHHHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "HHIHHHHHHHHHHHHHHHHHHHHHHHHH" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "HHIHHHHHHHHHHHHHHHHHHHHHHHHH" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test07912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07912");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "                             ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07913");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi444444444444444444444444444444444444444444hhi!i!       444444444444444444444444444444444444444444hhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi", "444444444444444444444444444444444444444444########!4ih#########", 25, 352);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi#!hhhhhhhhhhhhhhhhhhhhh444444444444444444444444444444444444444444########!4ih#########hhhhhhhhhh      hi" + "'", str4, "hi#!hhhhhhhhhhhhhhhhhhhhh444444444444444444444444444444444444444444########!4ih#########hhhhhhhhhh      hi");
    }

    @Test
    public void test07914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07914");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("44444HI!4ih4444I!HI!H...44444HI!44444", "hi#!           ###HHI####           ...           ###HHI####           ...           ###HHI####  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test07915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07915");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String[] strArray6 = new java.lang.String[] {};
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray6);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray5, strArray6);
        int int9 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                               ###hhi####    ...", strArray6);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("IH", strArray6, strArray11);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444I...44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", strArray6);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "IH" + "'", str12, "IH");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test07916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07916");
        char[] charArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("!!", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07917");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("44444HI!44444I!HI!H44444HI!44444                                                                 ", "                                        ...  hia...  hia...  hia...  hia...  hia...  hia...  hia...  hia...  h.       ...       ...       ..                                        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07918");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("aaaaaaaaaaaaaaaaaaaaahi#!aaaaaaaaaaaaaaaaaaa.I..I...I..I...I..I...I..I...I..I...I..I...I..I...I..I..");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test07919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07919");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "################################################################################################################################################################################################################################HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH###HHI####HHHH...#################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07920");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("       ...       ###hhi####    ...       ...       .                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "       ...       ###hhi####    ...       ...       .                                                                                                                                                                                                                                                                                                                                                                                                                                                             " + "'", str1, "       ...       ###hhi####    ...       ...       .                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
    }

    @Test
    public void test07921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07921");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("444444444444444444hHI!i!       444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "444444444444444444", "h", "HI", "!", "i", "!", "       ", "444444444444444444444444444444444444444444" });
    }

    @Test
    public void test07922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07922");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("   ###");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###" + "'", str1, "###");
    }

    @Test
    public void test07923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07923");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i       ...       #ihh#.       ...                   !i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i       ...       #ihh#.       ...                   !i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i" + "'", str1, "i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i       ...       #ihh#.       ...                   !i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i");
    }

    @Test
    public void test07924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07924");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("hi !");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI !" + "'", str1, "HI !");
    }

    @Test
    public void test07925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07925");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "4444444       4ih###############################4444444       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07926");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("...       ...", "!hi!hi!hi!hi!hi!hi!hi!hi!hihhi   ################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07927");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("###HHI####    ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###HHI####    ..." + "'", str1, "###HHI####    ...");
    }

    @Test
    public void test07928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07928");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("ia!HHHHHHHHHHHHHHHHHHHHHHHHH      hia!HHHHHHHHHHHHHHHHHHHHHHHHH      hia!HHHHHHHHHHHHHHHHHHHHHHHHH      hia!HHHHHHHHHHHHHHHHHHHHHHHHH      hia!HHHHHHHHHHHHHHHHHHHHHHHHH      hia!HHHHHHHHHHHHHHHHHHHHHHHHH      hia!HHHHHHHHHHHHHHHHHHHHHHHHH      hia!HHHHHHHHHHHHHHHHHHHHHHHHH      hi", "aaaaaaaaaaaaaaaaaaaaahi#!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07929");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("!H!H...                                             ", 121, 328);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test07930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07930");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("       ...       .#HHI#       ...       ", "           ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####           ", 404);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "...", ".", "..." });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test07931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07931");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("hi4!hi4!hi4!hi4!hi4!hi4!HHHHHHI!I!.i!HI!H...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi                                                            ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07932");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("HHHHHHHHHHHHHHHHHHHHHHH      hi!HHHHHHHHHHHHHHHHHHHHHHHHH      hi!HHHHHHHHHHHHHHHHHHHHHHHHH      hi!HHHHHHHHHHHHHHHHHH                         ", "                     hhhhhhhhhhhhhh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHHHHHHHHHHHHHHHHHHHH      hi!HHHHHHHHHHHHHHHHHHHHHHHHH      hi!HHHHHHHHHHHHHHHHHHHHHHHHH      hi!HHHHHHHHHHHHHHHHHH                         " + "'", str2, "HHHHHHHHHHHHHHHHHHHHHHH      hi!HHHHHHHHHHHHHHHHHHHHHHHHH      hi!HHHHHHHHHHHHHHHHHHHHHHHHH      hi!HHHHHHHHHHHHHHHHHH                         ");
    }

    @Test
    public void test07933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07933");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("I!HI!H...", 178, "H!IH!IH ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H!IH!IH H!IH!IH H!IH!IH H!IH!IH H!IH!IH H!IH!IH H!IH!IH H!IH!IH H!IH!IH H!IH!IH H!IH!IH H!IH!IH H!IH!IH H!IH!IH H!IH!IH H!IH!IH H!IH!IH H!IH!IH H!IH!IH H!IH!IH H!IH!IH HI!HI!H..." + "'", str3, "H!IH!IH H!IH!IH H!IH!IH H!IH!IH H!IH!IH H!IH!IH H!IH!IH H!IH!IH H!IH!IH H!IH!IH H!IH!IH H!IH!IH H!IH!IH H!IH!IH H!IH!IH H!IH!IH H!IH!IH H!IH!IH H!IH!IH H!IH!IH H!IH!IH HI!HI!H...");
    }

    @Test
    public void test07934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07934");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                 h                                                  ", 'a');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                 h                                                  " });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                 h                                                  " + "'", str3, "                                                 h                                                  ");
    }

    @Test
    public void test07935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07935");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("                                                                                                                          ###H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07936");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("         ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###      ", "aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H !H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###      " + "'", str2, "         ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###      ");
    }

    @Test
    public void test07937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07937");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("       ...", 281);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       ..." + "'", str2, "       ...");
    }

    @Test
    public void test07938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07938");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("i           ###HHI####              ", '4');
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "i           ###HHI####              " });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "i           ###HHI####" });
    }

    @Test
    public void test07939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07939");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!i!...HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07940");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa           ####I           ####I           ####I           ####I           ####I           ####I...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07941");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("H", "hi!", (int) (short) 0);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "HI######################################");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "H" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
    }

    @Test
    public void test07942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07942");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...###HHI####           4                                                                  44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "..       ...       ...       ...       ...       ...       .....       ...       ...       ...       ...       ...                                                                                                                                                                                                                              ", "I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...            I!HI!H...            ", 56);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...###HHI####           4                                                                  44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str4, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...###HHI####           4                                                                  44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test07943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07943");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("   ", "      hi!h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   " + "'", str2, "   ");
    }

    @Test
    public void test07944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07944");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("...                          ...", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07945");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "##############################################################   ihhih!ih!ih!ih!ih!ih!ih!ih!ih!ih                           i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07946");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "hi!");
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("hi!", strArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.startsWithAny("I                                  ", strArray6);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray6);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny("I                                  II                                  II                                  II                                  II                                  II                                  II                                  II                          ", strArray6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test07947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07947");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih               hhhhhhhhhhhhhhh4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih", "");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih               hhhhhhhhhhhhhhh4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih" });
    }

    @Test
    public void test07948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07948");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("                                                                                                                                                                                                                                                                                                                                                                             ", 394, 26);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test07949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07949");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07950");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("hhhhhhhhhh", 2);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hh" + "'", str2, "hh");
    }

    @Test
    public void test07951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07951");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H !H", "aaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H aaaaa!H !H", 255);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "" });
    }

    @Test
    public void test07952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07952");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("hi!aaaaaaaaaaaaaaaaaaaI                                  II                                  II ", 'a', 30);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 21 + "'", int3 == 21);
    }

    @Test
    public void test07953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07953");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("HI#", "IIIIIIIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07954");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    ", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test07955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07955");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("HHHHHHHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHHHHHHHHHHHH" + "'", str1, "hHHHHHHHHHHHHHH");
    }

    @Test
    public void test07956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07956");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("############################################################################################################################################################################################################################################################################################################i                                  ", 279);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "####################################################################################################################################################################################################################################################i                                  " + "'", str2, "####################################################################################################################################################################################################################################################i                                  ");
    }

    @Test
    public void test07957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07957");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("   hhhhhhhhhhhhhhhhhhhhhhhhh    ", "                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   hhhhhhhhhhhhhhhhhhhhhhhhh    " + "'", str2, "   hhhhhhhhhhhhhhhhhhhhhhhhh    ");
    }

    @Test
    public void test07958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07958");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("####I           ####I           ####I           ####I           ####I           ####I           ####I           ####I           ####I H", 'a');
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!HIhi#!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "####I           ####I           ####I           ####I           ####I           ####I           ####I           ####I           ####I H" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "           ####I           ####I           ####I           ####I           ####I           ####I           ####I           ####I " });
    }

    @Test
    public void test07959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07959");
        char[] charArray15 = new char[] { '4', 'a', '#', '#', 'a', '4' };
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("", charArray15);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("hi!       ", charArray15);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", charArray15);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsAny("                                                 h                                                  ", charArray15);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly("hi#!", charArray15);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("4           ###HHI####           4                                                                  ", charArray15);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsOnly("                                                 h                                                 ", charArray15);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsOnly("4444444                                                                                                                                                                                      444444444444444444444444444444444444444444hhi!i!       444444444444444444444444444444444444444444", charArray15);
        int int24 = org.apache.commons.lang3.StringUtils.indexOfAny("IHHIH!IH!IH!IH!IH!IH!IH!IH!IH!Ih", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '4', 'a', '#', '#', 'a', '4' });
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test07960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07960");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("...           ...", "##############!4ih#####...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07961");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("             ", "###############################################################################################################################################################################################################################################################Hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!i!...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07962");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", 15, 16);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!hi!hi!hi!hi!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" + "'", str4, "hi!hi!hi!hi!hi!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
    }

    @Test
    public void test07963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07963");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("###hhi####hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!      ...hi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi####", "44444HI!44444I!HI!H...44444HI!44444                                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###hhi####hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!      ...hi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi####" + "'", str2, "###hhi####hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!      ...hi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi####");
    }

    @Test
    public void test07964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07964");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("HI!HI!HI!H", "...h!ih!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07965");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("i                         ..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i                         .." + "'", str1, "i                         ..");
    }

    @Test
    public void test07966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07966");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase(".I..I...I..I...I..I...I..I...I..I...I..I...I..I...I..I..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".i..i...i..i...i..i...i..i...i..i...i..i...i..i...i..i.." + "'", str1, ".i..i...i..i...i..i...i..i...i..i...i..i...i..i...i..i..");
    }

    @Test
    public void test07967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07967");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("hHI!i", "haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHI!i" + "'", str2, "hHI!i");
    }

    @Test
    public void test07968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07968");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "...hhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhhhhhhhhhhhhhhhhhhhhhh      hi#!hhhhh...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07969");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "IHI!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" + "'", str2, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
    }

    @Test
    public void test07970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07970");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("AAAAAAAAAI", "...hhi.......", "Hhi!I!       ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test07971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07971");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("HI!HI!HI!H", "####IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH###    ...");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HI!HI!HI!H" });
    }

    @Test
    public void test07972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07972");
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
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi#                             " + "'", str25, "hi#                             ");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi#                             " + "'", str26, "hi#                             ");
    }

    @Test
    public void test07973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07973");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("##############!ih##############", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##############!ih##############" + "'", str2, "##############!ih##############");
    }

    @Test
    public void test07974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07974");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("#######");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("HI!", "HI!", (int) (short) -1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("           ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####           ", strArray3, strArray7);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "HHH");
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitByCharacterType("...44444444444444444444444444444444444444444444444444444444444");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEach("I                           HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################", strArray3, strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "#######" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "           ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####           " + "'", str8, "           ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####           ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#######" + "'", str10, "#######");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "...", "44444444444444444444444444444444444444444444444444444444444" });
    }

    @Test
    public void test07975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07975");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("44444HI!44444I!HI!H...44444HI!4444", "HI!");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hHI!i!       ", "I                           HI!   HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!...", (int) (short) -1);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.startsWithAny("...       ...", strArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("                                                 h                                                 ", strArray3, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 13 vs 12");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "44444", "", "", "44444", "", "", "", "", "", "...44444", "", "", "4444" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "h", "", "", "i", "", "", "", "", "", "", "", "" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test07976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07976");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("       #                            #                            #                            #                            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#                            #                            #                            #" + "'", str1, "#                            #                            #                            #");
    }

    @Test
    public void test07977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07977");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("HI!HI!HI!H", "I                         ...", (int) (short) 100);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "HI!HI!HI!H" });
    }

    @Test
    public void test07978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07978");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("!H HI!HHI!I!       HI!HHI!I!       HI!HHI!I!       HI!HHI!I!       HI!HHI!I!       HI!HHI!I!       HI!H", 25, 77);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!I!       HI!HHI!I!       HI!HHI!I!       HI!HHI!I!       HI!HHI!I!       HI!" + "'", str3, "!I!       HI!HHI!I!       HI!HHI!I!       HI!HHI!I!       HI!HHI!I!       HI!");
    }

    @Test
    public void test07979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07979");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("444444444444444444444444444444444444444444########!4aaaaaaaaaaaaaaaaaaa       !ih                                                               ", "i", "####I           ####I           ####I           ####I           ####I           ####I           ####I           ####I           ####I H", 231);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "444444444444444444444444444444444444444444########!4aaaaaaaaaaaaaaaaaaa       !####I           ####I           ####I           ####I           ####I           ####I           ####I           ####I           ####I Hh                                                               " + "'", str4, "444444444444444444444444444444444444444444########!4aaaaaaaaaaaaaaaaaaa       !####I           ####I           ####I           ####I           ####I           ####I           ####I           ####I           ####I Hh                                                               ");
    }

    @Test
    public void test07980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07980");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("hi !Hi!                          hi !Hi!                          hi !Hi!                          hi !Hi!                          hi !Hi!                          hi !Hi!                          hi !Hi!                          hi !");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI !hI!                          HI !hI!                          HI !hI!                          HI !hI!                          HI !hI!                          HI !hI!                          HI !hI!                          HI !" + "'", str1, "HI !hI!                          HI !hI!                          HI !hI!                          HI !hI!                          HI !hI!                          HI !hI!                          HI !hI!                          HI !");
    }

    @Test
    public void test07981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07981");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("4           ###hhi####           4                                                                  ", "             HH              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4           ###hhi####           4                                                                  " + "'", str2, "4           ###hhi####           4                                                                  ");
    }

    @Test
    public void test07982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07982");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("a                                                                                                                                                ", "#########################################################################################################################################################44444hi!44444i!hi!h44444hi!44444                                                                 ##########################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a                                                                                                                                                " + "'", str2, "a                                                                                                                                                ");
    }

    @Test
    public void test07983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07983");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("...H!IH!IH ", "...       .#hhi#       ...      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07984");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("I                                  ################################################################", 8);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I       " + "'", str2, "I       ");
    }

    @Test
    public void test07985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07985");
        java.lang.String[] strArray0 = null;
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray0, "           ####IHH###                      ####IHH###                      ####IHH###                  HH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###            ###HHI####           ...");
        org.junit.Assert.assertNull(strArray2);
    }

    @Test
    public void test07986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07986");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("  I                         ...   ", 93, "      ...       ...      ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  I                         ...         ...       ...            ...       ...            ..." + "'", str3, "  I                         ...         ...       ...            ...       ...            ...");
    }

    @Test
    public void test07987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07987");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("hHI!i!aaaaaaaaaaaaaaaaaaaaaaaaa", 270, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hHI!i!aaaaaaaaaaaaaaaaaaaaaaaaa###############################################################################################################################################################################################################################################" + "'", str3, "hHI!i!aaaaaaaaaaaaaaaaaaaaaaaaa###############################################################################################################################################################################################################################################");
    }

    @Test
    public void test07988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07988");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("HiI                    ###HHI####              I                    ###HHI####              I                    ###HHI####              I                    ###HHI####              I                    ###HHI####              I      ");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07989");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("HHIHHHHHHHHHHHHHHHHHHHHHHHHH", '#');
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HHIHHHHHHHHHHHHHHHHHHHHHHHHH" });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07990");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("#######", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07991");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("           ###HHI####              ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "###HHI####" });
    }

    @Test
    public void test07992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07992");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("                   ...       .#hhi#       ...       ", "!h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07993");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                           HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   ##############################hi!###########################", 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                           HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   ##############################hi!###########################" });
    }

    @Test
    public void test07994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07994");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", "aaaaaaaaaaaaaaaaaaa       !ih");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07995");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("           ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###      ", "aaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaa###HHI####aaaaaaaaaaa...");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "           ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###      " });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "           ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###      " + "'", str3, "           ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###      ");
    }

    @Test
    public void test07996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07996");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray2);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "###hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi####");
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("!aih", strArray5);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test07997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07997");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("HHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH4ihHHIHHHHHHHHHHHHHHHHHHHHHH", "###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####", "I!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test07998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07998");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("I#################################################################HI!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!...");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "I", "#################################################################", "HI", "!", "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI", "!", "I", "!..." });
    }

    @Test
    public void test07999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07999");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hHHHHHHHHHHHHH", "       ...", 136);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hHHHHHHHHHHHHH" });
    }

    @Test
    public void test08000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test08000");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("HHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHH                         ", "hhhhhhhhhh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHH                         " + "'", str2, "HHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHH                         ");
    }
}

