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
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("4", "4444HI!44");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4" + "'", str2, "4");
    }

    @Test
    public void test04502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04502");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("...H!IH!I", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...H!IH!I" + "'", str2, "...H!IH!I");
    }

    @Test
    public void test04503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04503");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace("...H!IH!IH                                                                                                                                                                                                                                                                                                                                                                                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04504");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("!AIH                                                ", "I!HI!H...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!AIH                                                " + "'", str2, "!AIH                                                ");
    }

    @Test
    public void test04505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04505");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    ", "...       .#hhi#       ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04506");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("...h!ih!ih", 340, 99);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...h!ih!ih" + "'", str3, "...h!ih!ih");
    }

    @Test
    public void test04507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04507");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) ".i..i.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04508");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("I                                  ################################################################", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 24);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "I                                  ################################################################" });
    }

    @Test
    public void test04509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04509");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("Hi !                                                                                             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi !" + "'", str1, "Hi !");
    }

    @Test
    public void test04510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04510");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric(".");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04511");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("4ih", "...       ...       ...       ...       ...       .....       ...       ...       ...       ...       ...       ..");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04512");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("i!HI!H...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i!HI!H...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" + "'", str1, "i!HI!H...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
    }

    @Test
    public void test04513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04513");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric("I                                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04514");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable("hi!       aaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04515");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("HHHHHHHHHH", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHHHHHHH" + "'", str2, "HHHHHHHHHH");
    }

    @Test
    public void test04516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04516");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("                                                               hi!       aaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!aaaaaaaaaaaaaaaaaaa" + "'", str1, "hi!aaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test04517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04517");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("I!HI!H...", "I                                  ", (int) ' ');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByCharacterType("hi!");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("Hi!                          ", strArray4, strArray7);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "444444444444444444444444444444444444444444hHI!i!       444444444444444444444444444444444444444444");
        java.lang.Class<?> wildcardClass11 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "!H", "!H..." });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "!H" + "'", str5, "!H");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi", "!" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hi!                          " + "'", str8, "Hi!                          ");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "..." });
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test04518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04518");
        int int1 = org.apache.commons.lang3.StringUtils.length("hii");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test04519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04519");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("...       ...       ...       haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.       ..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04520");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("   hhi    ", "haih");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("hia                                ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "   ", "", "", "    " });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test04521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04521");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("44444HI!4444444444HI!4444444444HI!4444444444HI!4444444444HI!4444444444HI!4444444444HI!4444444444HI!4444444444HI!4444444444HIi!i!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444HI!4444444444HI!4444444444HI!4444444444HI!4444444444HI!4444444444HI!4444444444HI!4444444444HI!4444444444HI!4444444444HIi!i!" + "'", str1, "44444HI!4444444444HI!4444444444HI!4444444444HI!4444444444HI!4444444444HI!4444444444HI!4444444444HI!4444444444HI!4444444444HIi!i!");
    }

    @Test
    public void test04522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04522");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    ", '4', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    " + "'", str3, "!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    ");
    }

    @Test
    public void test04523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04523");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04524");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04525");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                                                                                          HI!HI!H...", 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04526");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("                                                               hi!       aaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaa       !ih                                                               " + "'", str1, "aaaaaaaaaaaaaaaaaaa       !ih                                                               ");
    }

    @Test
    public void test04527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04527");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("I                           HI!   HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04528");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("##############################################################################################################################################################HI!IIIIIIIIIIIIIIIIIIIIIIIIIIIIHI!H###############################################################################################################################################################", "#################################################################   ihhih!ih!ih!ih!ih!ih!ih!ih!ih!ih                           i", "i                         ...");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test04529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04529");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("IIIIIIIIIIIIIIIIIIIIIII", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IIIIIIIIIIIIIIIIIIIIIII" + "'", str3, "IIIIIIIIIIIIIIIIIIIIIII");
    }

    @Test
    public void test04530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04530");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                          HI!HI!H...", "       ...       ...       ...       ...       ...       .....       ...       ...       ...       ...       ...       ..", 15);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "", "", "", "", "", "", "", "", "", "", "", "", "", "                                                                            HI!HI!H..." });
    }

    @Test
    public void test04531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04531");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("...hi##...", "Hhi!I!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04532");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04533");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("", "               HHHHHHHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "               HHHHHHHHHHHHHHH" + "'", str2, "               HHHHHHHHHHHHHHH");
    }

    @Test
    public void test04534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04534");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("HHHHHHHHHHHHHHHHHHHHHHHHH", 352);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHHHHHHHHHHHHHHHHHHHHHH" + "'", str2, "HHHHHHHHHHHHHHHHHHHHHHHHH");
    }

    @Test
    public void test04535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04535");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("aaaaaaaaaaaaaaaaaaaa4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4aaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                    ", ".       ...       ...       ..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaa4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4aaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                    " + "'", str2, "aaaaaaaaaaaaaaaaaaaa4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4aaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                    ");
    }

    @Test
    public void test04536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04536");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("           ####IHH###     ...", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "           ####IHH###     ..." + "'", str2, "           ####IHH###     ...");
    }

    @Test
    public void test04537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04537");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", "HHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHH                         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" + "'", str2, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
    }

    @Test
    public void test04538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04538");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("I!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...", '#', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04539");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "4444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04540");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("AAAAAAAAAI", "       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAI" + "'", str2, "AAAAAAAAAI");
    }

    @Test
    public void test04541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04541");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("           ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###            ###HHI####           ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04542");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                               #...", "444444444444444444444444444444444444444444hHI!i!       444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                               #..." + "'", str2, "                               #...");
    }

    @Test
    public void test04543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04543");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("hi !Hi!                          hi !Hi!                          hi !Hi!                          hi !Hi!                          hi !Hi!                          hi !Hi!                          hi !Hi!                          hi !", "hi4!hi4!hi4!hi4!hi4!hi4!HHHHHHI!I!...", 106, 48);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi !Hi!                          hi !Hi!        hi4!hi4!hi4!hi4!hi4!hi4!HHHHHHI!I!...                          hi !Hi!                          hi !Hi!                          hi !Hi!                          hi !" + "'", str4, "hi !Hi!                          hi !Hi!        hi4!hi4!hi4!hi4!hi4!hi4!HHHHHHI!I!...                          hi !Hi!                          hi !Hi!                          hi !Hi!                          hi !");
    }

    @Test
    public void test04544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04544");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhh                           HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################", "Hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test04545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04545");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("44444HI!4ih4444I!HI!H...44444HI!44444                                                                 ", "                        ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04546");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   ################################################################", 6);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   ################################################################" + "'", str2, "!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   ################################################################");
    }

    @Test
    public void test04547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04547");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("i!HI!H...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "HHI    ...");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "i!", "", "!", "", "", "", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" });
    }

    @Test
    public void test04548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04548");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("...", "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!...", 285, 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!..." + "'", str4, "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!...");
    }

    @Test
    public void test04549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04549");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!", "...4444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!" + "'", str2, "HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!");
    }

    @Test
    public void test04550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04550");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                                                                                                                                                         ", 497, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "########################################################################################################################################################################################################################################################################################                                                                                                                                                                                                                         " + "'", str3, "########################################################################################################################################################################################################################################################################################                                                                                                                                                                                                                         ");
    }

    @Test
    public void test04551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04551");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test04552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04552");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("###HHI####    ...", "       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###HHI####    ..." + "'", str2, "###HHI####    ...");
    }

    @Test
    public void test04553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04553");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("HI!HI!H...  I                         ...   HI!HI!H...  I                         ...   HI!HI!H...  I                         ...   HI!HI!H...  I                         ...   HI!HI!H...  I                         ...   HI!HI!H...  I                         ...   HI!HI!H...  I                         ...   HI!HI!H...  I                         ...   HI!HI!H...", "       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...", 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test04554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04554");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("                               #...", 32);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                            #..." + "'", str2, "                            #...");
    }

    @Test
    public void test04555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04555");
        int int1 = org.apache.commons.lang3.StringUtils.length("I                                  ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 35 + "'", int1 == 35);
    }

    @Test
    public void test04556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04556");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "I                                  II                                  II                                  II                                  II                                  II                                  II                                  II                                  II                                  II                                  ", "                4ih                ", 338);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str4, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test04557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04557");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("i!i!...", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04558");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("HH      ", "I!I!", 29);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04559");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "!AIH                                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04560");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  ", "  ...       ", 281);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04561");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("###hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi##");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi##" + "'", str1, "###hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi##");
    }

    @Test
    public void test04562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04562");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("###############################################################################################################################################################################################################################################################Hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!i!...", (int) ' ', 23);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...#################..." + "'", str3, "...#################...");
    }

    @Test
    public void test04563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04563");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("  ", "                                                      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI", "");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test04564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04564");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("HHHHHHHHHH", "HH      ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test04565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04565");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("i#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test04566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04566");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA###HHI####    ...", "HHIHHHHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04567");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "      HI#!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04568");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("         ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###" + "'", str1, "####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###");
    }

    @Test
    public void test04569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04569");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("!H!H...Hhi!I!", "hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04570");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                                                44444444444444444444444444444444                                                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                44444444444444444444444444444444                                                " + "'", str1, "                                                44444444444444444444444444444444                                                ");
    }

    @Test
    public void test04571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04571");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("      HI#!", "I                                  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04572");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("HHHHHHHHHHHHHHH", "  I                         ...   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 34 + "'", int2 == 34);
    }

    @Test
    public void test04573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04573");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("", (int) (byte) 1, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test04574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04574");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04575");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("!i!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!i" + "'", str1, "!i");
    }

    @Test
    public void test04576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04576");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("########!4IH#########", '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test04577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04577");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("HHHHHHI#!HHHHHHHHHHHHHHHHHHHHHHHHHHI#!HHHHHHHHHHHHHHHHHHHHHHHHHHI#!HHHHHHHHHHHHHHHHHHHHHHHHHHI#!HHHHHHHHHHHHHHHHHHHHHHHHHHI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04578");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("       ...       .#hhi#       ...       ", 96);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       ...       .#hhi#       ...                                                               " + "'", str2, "       ...       .#hhi#       ...                                                               ");
    }

    @Test
    public void test04579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04579");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hia!###HHI", "          hia!", (int) (byte) 1);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("hi4!hi4!hi4!hi4!hi4!hi4!HHHHHHI!I!.i!HI!H...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hia!###HHI" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test04580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04580");
        char[] charArray8 = new char[] { '#', 'a', ' ', '4', '#' };
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("hia!", charArray8);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny("HIH", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '#', 'a', ' ', '4', '#' });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test04581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04581");
        char[] charArray4 = new char[] {};
        boolean boolean5 = org.apache.commons.lang3.StringUtils.containsAny("HI!HI!H...", charArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI", charArray4);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("4444HI!44444I!HI!H...44444HI!44444", charArray4);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsOnly("hi#!           ###HHI####           ...           ###HHI####           ...           ###HHI####  ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test04582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04582");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("4ih", "       ...       ...       ...       ...       ...       .....       ...       ...       ...       ...       ...       ..", "I!I!...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4ih" + "'", str3, "4ih");
    }

    @Test
    public void test04583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04583");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("Hi", 234, "I                    ###HHI####              ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HiI                    ###HHI####              I                    ###HHI####              I                    ###HHI####              I                    ###HHI####              I                    ###HHI####              I      " + "'", str3, "HiI                    ###HHI####              I                    ###HHI####              I                    ###HHI####              I                    ###HHI####              I                    ###HHI####              I      ");
    }

    @Test
    public void test04584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04584");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("!i", "      ...       ...      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04585");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace("    H!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04586");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("      ###HHI####                 ###HHI####                 ###HHI####                 ###HHI####                 ###HHI####                 ###HHI####                 ###HHI####                 ###HHI####                 ###HHI####           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "      ###hhi####                 ###hhi####                 ###hhi####                 ###hhi####                 ###hhi####                 ###hhi####                 ###hhi####                 ###hhi####                 ###hhi####           " + "'", str1, "      ###hhi####                 ###hhi####                 ###hhi####                 ###hhi####                 ###hhi####                 ###hhi####                 ###hhi####                 ###hhi####                 ###hhi####           ");
    }

    @Test
    public void test04587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04587");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("I                           HI!   HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!..", "hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I                           HI!   HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!.." + "'", str2, "I                           HI!   HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!..");
    }

    @Test
    public void test04588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04588");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("HI!i!aaa!H!H...Hhi!I!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "HI", "!", "i", "!", "aaa", "!", "H", "!", "H", "...", "H", "hi", "!", "I", "!" });
    }

    @Test
    public void test04589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04589");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "I!HI!H...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test04590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04590");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("hi!");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "HH", 3, 0);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "####IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH###");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, ' ', (int) '4', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "hi", "!" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi", "!" });
    }

    @Test
    public void test04591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04591");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("HI!i!aaaaaaaaaaaaaaaaaaaaaaaaa", 23);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!i!aaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "HI!i!aaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test04592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04592");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("HI!i!aaa!H!H...Hhi!I!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!I!ihH...H!H!aaa!i!IH" + "'", str1, "!I!ihH...H!H!aaa!i!IH");
    }

    @Test
    public void test04593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04593");
        char[] charArray10 = new char[] { '4', 'a', '#', '#', 'a', '4' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("", charArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("hi!       ", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone("###HHI####", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny("hHI!i!aaaaaaaaaaaaaaaaaaaaaaaaa", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', 'a', '#', '#', 'a', '4' });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
    }

    @Test
    public void test04594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04594");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...", "HH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04595");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("hia!###HH", "H!H...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04596");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("hHI!i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHI!i" + "'", str1, "hHI!i");
    }

    @Test
    public void test04597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04597");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("                                                      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI444444444444444444444444444444444444444444HHI!I!       444444444444444444444444444444444444444444hhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04598");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                               #...", 'a', 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04599");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                              !H#!H...                                              ", "    ###HHI####           ...", 336);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04600");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!        HI!           HHI           ...           HHI           ...           HHI            hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!        hi!           hhi           ...           hhi           ...           hhi            hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!         " + "'", str1, "          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!        hi!           hhi           ...           hhi           ...           hhi            hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!         ");
    }

    @Test
    public void test04601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04601");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("   hhi    ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   hhi    " + "'", str2, "   hhi    ");
    }

    @Test
    public void test04602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04602");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("Hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!i!...   ", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!i!...   " + "'", str2, "Hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!i!...   ");
    }

    @Test
    public void test04603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04603");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("...###hhi####           4                                                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                  4           ####ihh###..." + "'", str1, "                                                                  4           ####ihh###...");
    }

    @Test
    public void test04604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04604");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("           ####IHH###     ...", 146);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "           ####IHH###     ..." + "'", str2, "           ####IHH###     ...");
    }

    @Test
    public void test04605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04605");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("", "...HI##...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04606");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("4444HI!44444I!HI!H...44444HI!44444", ".i..i.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04607");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("      HI#!", 497);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "      HI#!" + "'", str2, "      HI#!");
    }

    @Test
    public void test04608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04608");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "H#ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04609");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("..       ...       ...       ...       ...       ...       .....       ...       ...       ...       ...       ...", 336, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "..       ...       ...       ...       ...       ...       .....       ...       ...       ...       ...       ...                                                                                                                                                                                                                              " + "'", str3, "..       ...       ...       ...       ...       ...       .....       ...       ...       ...       ...       ...                                                                                                                                                                                                                              ");
    }

    @Test
    public void test04610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04610");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("###", (int) (byte) 100, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###");
    }

    @Test
    public void test04611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04611");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("...H!IH!IH4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 26, "I!HIhi#!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...H!IH!IH4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "...H!IH!IH4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test04612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04612");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("Hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!i!...   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!i!..." + "'", str1, "Hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!i!...");
    }

    @Test
    public void test04613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04613");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!...HI!HI!HI!HI!HI!HI!HI!HI!", "!H!H..");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "hi");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!...HI!HI!HI!HI!HI!HI!HI!HI!" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!...HI!HI!HI!HI!HI!HI!HI!HI!" + "'", str4, "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!...HI!HI!HI!HI!HI!HI!HI!HI!");
    }

    @Test
    public void test04614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04614");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                                                                                                                                                                                                                                                                                                                                              hia!", "44444HI!44444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                              hia!" + "'", str2, "                                                                                                                                                                                                                                                                                                                                              hia!");
    }

    @Test
    public void test04615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04615");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("4444444                                                                                                                                                                                                                                                                                      ", "                                                                    444444444444444444444444444444444444444444HHI!I!       444444444444444444444444444444444444444444                                                                     ", 338, 121);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4444444                                                                                                                                                                                      444444444444444444444444444444444444444444HHI!I!       444444444444444444444444444444444444444444                                                                     " + "'", str4, "4444444                                                                                                                                                                                      444444444444444444444444444444444444444444HHI!I!       444444444444444444444444444444444444444444                                                                     ");
    }

    @Test
    public void test04616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04616");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("", "hhhHI#!hhhhhhhhhhhhhhhhhhhhhhhhhHI#!hhhhhhhhhhhhhhhhhhhhhhhhhHI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04617");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("                    HH              ...             HH                                  HH              ...             HH                                  HH              ...             HH                                  HH              ...             HH                                  HH              ...             HH                                  HH              .....             HH                                  HH              ...             HH                                  HH              ...             HH                                  HH              ...             HH                                  HH              ...             HH                                  HH              ...             HH                                  HH              ..", "HI!i!aaa!H!H...Hhi!I!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04618");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("IHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH" + "'", str2, "IHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH");
    }

    @Test
    public void test04619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04619");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...", "!i!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04620");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaaaaaa###HHI####aaaaaaaaaaa...", "hi!      ....H!IH!IHhhhhhhhhhh");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aaaaaaaaaaa###HHI####aaaaaaaaaaa..." });
    }

    @Test
    public void test04621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04621");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("           ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####           ", "!AIH          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "           ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####           " + "'", str2, "           ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####           ");
    }

    @Test
    public void test04622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04622");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("!HHHHHHI!I!.i!HI!H...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi4!hi4!hi4!hi4!hi4!hi4hi", 13);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!HHHHHHI!I!.i!HI!H...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi4!hi4!hi4!hi4!hi4!hi4hi" + "'", str2, "!HHHHHHI!I!.i!HI!H...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi4!hi4!hi4!hi4!hi4!hi4hi");
    }

    @Test
    public void test04623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04623");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("                     HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################", "    ...       ...       .#hhi#       ...       ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04624");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "          ...           ###HHI####           ...           ###HHI####  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04625");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("Hi#                             ", "HI!i!aaa!H!H...Hhi!I!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04626");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("   hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!i!...", "                                                                    444444444444444444444444444444444444444444HHI!I!       444444444444444444444444444444444444444444                                                                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!i!..." + "'", str2, "   hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!i!...");
    }

    @Test
    public void test04627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04627");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("!H!H...Hhi!I!       ", "HI#");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!H!H...Hhi!I!       " + "'", str2, "!H!H...Hhi!I!       ");
    }

    @Test
    public void test04628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04628");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                                      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI444444444444444444444444444444444444444444HHI!I!       444444444444444444444444444444444444444444hhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI", "aaaaaaaaaaa###HHI####aaaaaaaaaaa...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI444444444444444444444444444444444444444444HHI!I!       444444444444444444444444444444444444444444hhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI" + "'", str2, "                                                      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI444444444444444444444444444444444444444444HHI!I!       444444444444444444444444444444444444444444hhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI");
    }

    @Test
    public void test04629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04629");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("hhi!i!", "", 51);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
    }

    @Test
    public void test04630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04630");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("  I                                                                          ...                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "  I                                                                          ...                                  " + "'", str1, "  I                                                                          ...                                  ");
    }

    @Test
    public void test04631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04631");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("4444444444444", "####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04632");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("...                             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..." + "'", str1, "...");
    }

    @Test
    public void test04633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04633");
        int int1 = org.apache.commons.lang3.StringUtils.length("hia!###HH");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test04634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04634");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                          hi!                                  ", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                          hi!                                  " + "'", str2, "                          hi!                                  ");
    }

    @Test
    public void test04635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04635");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("i!HI!H...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "hHI!i!       ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test04636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04636");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("hi!aaaaaaaaaaaaaaaaaaaI                                  II                                  II ", "###HHI####");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04637");
        int int1 = org.apache.commons.lang3.StringUtils.length("###HHI####    ...");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 17 + "'", int1 == 17);
    }

    @Test
    public void test04638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04638");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "                                                                                                                                                                                                                                                                           ...       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04639");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("", "                                                                                                                                ###H");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04640");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "...H!IH!IH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04641");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("hi!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!H" + "'", str1, "HI!H");
    }

    @Test
    public void test04642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04642");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("i#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi", "!HHHHHHI!I!.i!HI!H...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi#!hi#!hi#!hi#!hi#!hi#hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04643");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!        hi!           hhi           ...           hhi           ...           hhi            hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!         ", "                                                                  4           ####ihh###...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!        hi!           hhi           ...           hhi           ...           hhi            hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!         " + "'", str2, "          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!        hi!           hhi           ...           hhi           ...           hhi            hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!         ");
    }

    @Test
    public void test04644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04644");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("!hi!hi!hi!hi!hi!hi!hi!hi!hihhi   ################################################################", "          hia");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04645");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("...hhi....    ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...hhi....    .." + "'", str1, "...hhi....    ..");
    }

    @Test
    public void test04646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04646");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("...        ...", ' ', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test04647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04647");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("HHHHHHI#!HHHHHHHHHHHHHHHHHHHHHHHHHHI#!HHHHHHHHHHHHHHHHHHHHHHHHHHI#!HHHHHHHHHHHHHHHHHHHHHHHHHHI#!HHHHHHHHHHHHHHHHHHHHHHHHHHI", "####ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04648");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("...                             ", "!AIH                                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...                             " + "'", str2, "...                             ");
    }

    @Test
    public void test04649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04649");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "###hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi##");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04650");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("I!i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04651");
        java.lang.String[] strArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("                                                                                                             aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###hhi####    ...                                                                                                 ", strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04652");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                                                                                                                                                                                                                                                                              hia!", 'a', 404);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04653");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("444444444444444444444444444444444444444444########!4ih#########", "hHHHHHHHHHHHHH", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04654");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("...4444444####ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh", "###hhi####    ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04655");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("########!4ih#########");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "########!4ih#########" + "'", str1, "########!4ih#########");
    }

    @Test
    public void test04656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04656");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("    hi!hhi!i!       hi!hhi!i!                                                                                                                                                                                                                                                                                                                                                                                                                    ", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04657");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                                                                                                                                                                                                                                                                              hia!", "                               ###H", 394);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04658");
        int int1 = org.apache.commons.lang3.StringUtils.length("###hhi...#");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test04659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04659");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("I           ", "####ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04660");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("          ...           ###HHI####           ...           ###HHI####            ...           ###HHI####           ...           ###HHI####            ...           ###HHI####           ...           ###HHI####            ...           ###HHI####           ...          hi####IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH###!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test04661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04661");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", "hI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04662");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("!H", ' ');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!H" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "!H" + "'", str4, "!H");
    }

    @Test
    public void test04663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04663");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("", "             hh              ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04664");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace("hi!                          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04665");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("HHHHHHHHHHHHHH", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04666");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                               #...", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                               #..." + "'", str2, "                               #...");
    }

    @Test
    public void test04667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04667");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                                                                                                                                                                                                                                                                                    ", '#', 352);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04668");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4", 17, "                     !aih          ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4" + "'", str3, "4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4");
    }

    @Test
    public void test04669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04669");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("", ' ');
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("                                                                                          HI!HI!H...", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny("###i###", strArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "HI!IIIIIIIIIIIIIIIIIIIIIIIIIIIIHI!H");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test04670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04670");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("44444HI!44444I!HI!H...44444HI!44444                                                                 ", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444HI!44444I!HI!H...44444HI!44444                                                                 " + "'", str2, "44444HI!44444I!HI!H...44444HI!44444                                                                 ");
    }

    @Test
    public void test04671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04671");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("hi!hhi!i!       hi!hhi!i!                               HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################", "i!i!...");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test04672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04672");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("hi!aaaaaaaaaaaaaaaaaaaI                                  II                                  II ", (int) (byte) 100, "h");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!aaaaaaaaaaaaaaaaaaaI                                  II                                  II hhhh" + "'", str3, "hi!aaaaaaaaaaaaaaaaaaaI                                  II                                  II hhhh");
    }

    @Test
    public void test04673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04673");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("                                                                                                             aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###hhi####    ...                                                                                                 ", "HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                             aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###hhi####    ...                                                                                                 " + "'", str2, "                                                                                                             aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###hhi####    ...                                                                                                 ");
    }

    @Test
    public void test04674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04674");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("hi#       ...       ", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04675");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("                                                                                                                                                                                                                                                                           ...       ", "################################################################################################################################################################################################################################                               ###HHI####    ...#################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04676");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("...###HHI####           4                                                                  ", "i!i!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...###HHI####           4                                                                  " + "'", str2, "...###HHI####           4                                                                  ");
    }

    @Test
    public void test04677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04677");
        char[] charArray4 = new char[] {};
        boolean boolean5 = org.apache.commons.lang3.StringUtils.containsAny("HI!HI!H...", charArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsAny("                                                 h                                                  ", charArray4);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsOnly("Hi!                          ", charArray4);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny("IHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test04678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04678");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("i                                  ", "HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04679");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaa.hi!hi!hi!hi!hi!hihHI!i!aaaaaaaaaaaaaaaaaaaaaaaaai!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", 'a', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                h                                                                                                h                                                                                                h                                                                                                h                  .hi!hi!hi!hi!hi!hihHI!i!                         i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h" + "'", str3, "                                                                                                h                                                                                                h                                                                                                h                                                                                                h                  .hi!hi!hi!hi!hi!hihHI!i!                         i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
    }

    @Test
    public void test04680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04680");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "#######                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04681");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4HI!44444I!HI!H...44444HI!44444");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "4HI!44444I!HI!H...44444HI!44444" });
    }

    @Test
    public void test04682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04682");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator(" HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#       ", "HI#!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { " HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#       " });
    }

    @Test
    public void test04683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04683");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace("                                                                                                                                               HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04684");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("                                                                                                                                                        HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################                                                                                                                                                        ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                        HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################                                                                                                                                                        " + "'", str2, "                                                                                                                                                        HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################                                                                                                                                                        ");
    }

    @Test
    public void test04685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04685");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("", "           ###HHI####           ...", 0);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA###HHI####    ...");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
    }

    @Test
    public void test04686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04686");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("hi!aaaaaaaaaaaaaaaaaaaI                                  II                                  II ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!aaaaaaaaaaaaaaaaaaaI                                  II                                  II" + "'", str1, "hi!aaaaaaaaaaaaaaaaaaaI                                  II                                  II");
    }

    @Test
    public void test04687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04687");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("!HHHHHHI!I!.i!HI!H...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi4!hi4!hi4!hi4!hi4!hi4hi", "I                         ...aa###HHI####aaaaaaaaaaa...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!HHHHHHI!I!.i!HI!H...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi4!hi4!hi4!hi4!hi4!hi4hi" + "'", str2, "!HHHHHHI!I!.i!HI!H...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi4!hi4!hi4!hi4!hi4!hi4hi");
    }

    @Test
    public void test04688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04688");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("  ...       ", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04689");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi" + "'", str2, "hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi");
    }

    @Test
    public void test04690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04690");
        int int1 = org.apache.commons.lang3.StringUtils.length("HI#");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test04691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04691");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace("           ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04692");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("###hhi###", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###hhi###" + "'", str2, "###hhi###");
    }

    @Test
    public void test04693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04693");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "                           HI!   HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04694");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("HHI", "hi!");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "I!i!");
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.split("", ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray10);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!       ", "HHI");
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEach("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", strArray10, strArray14);
        java.lang.String[] strArray16 = new java.lang.String[] {};
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray16);
        java.lang.String[] strArray19 = org.apache.commons.lang3.StringUtils.stripAll(strArray16, "hi!");
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray19, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", (-1), (int) (short) -1);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("HH", strArray14, strArray19);
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray14);
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray14);
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.replaceEach("...###HHI####           4                                                                  ", strArray3, strArray14);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "HHI" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "HH" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!       " });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI" + "'", str15, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HH" + "'", str24, "HH");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!       " + "'", str25, "hi!       ");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!       " + "'", str26, "hi!       ");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "...###hi!       ####           4                                                                  " + "'", str27, "...###hi!       ####           4                                                                  ");
    }

    @Test
    public void test04695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04695");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("I                    ###HHI####              ", "aaaaaaaaai");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I                    ###HHI####              " + "'", str2, "I                    ###HHI####              ");
    }

    @Test
    public void test04696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04696");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("                                                                                                                                ###H", "                          hi!                                  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04697");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace(".I..I..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04698");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI", "...  hia", 335);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                                      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI" });
    }

    @Test
    public void test04699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04699");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("    IHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH   ", "                            #...", "");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test04700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04700");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("           ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###            ###HHI####           ...", ' ', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaa###HHI####aaaaaaaaaaa..." + "'", str3, "aaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaaaaaaaaaaaa####IHH###aaaaaaaaaaaa###HHI####aaaaaaaaaaa...");
    }

    @Test
    public void test04701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04701");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                                      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi", "          ...           444HHI4444           ...           444HHI4444  ", 23);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04702");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("h", 34, 91);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test04703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04703");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("i                         ...", "444444444444I...4444444444444");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      ", 100, 394);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "i                         ..." });
    }

    @Test
    public void test04704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04704");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad(".       ...       ...       ..", 158);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".       ...       ...       ..                                                                                                                                " + "'", str2, ".       ...       ...       ..                                                                                                                                ");
    }

    @Test
    public void test04705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04705");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04706");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("                            ", "    h!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04707");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("I!HIhi#!", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04708");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("I#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI", 129, "4           ###HHI####           4");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI" + "'", str3, "I#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI");
    }

    @Test
    public void test04709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04709");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("HI!HI!H...  I                         ...   HI!HI!H...  I                         ...   HI!HI!H...  I                         ...   HI!HI!H...  I                         ...   HI!HI!H...  I                         ...   HI!HI!H...  I                         ...   HI!HI!H...  I                         ...   HI!HI!H...  I                         ...   HI!HI!H...", "ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!H...  I                         ...   HI!HI!H...  I                         ...   HI!HI!H...  I                         ...   HI!HI!H...  I                         ...   HI!HI!H...  I                         ...   HI!HI!H...  I                         ...   HI!HI!H...  I                         ...   HI!HI!H...  I                         ...   HI!HI!H..." + "'", str2, "HI!HI!H...  I                         ...   HI!HI!H...  I                         ...   HI!HI!H...  I                         ...   HI!HI!H...  I                         ...   HI!HI!H...  I                         ...   HI!HI!H...  I                         ...   HI!HI!H...  I                         ...   HI!HI!H...  I                         ...   HI!HI!H...");
    }

    @Test
    public void test04710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04710");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("       ...       ###hhi####    ...       ...       .", "HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       ...       ###hhi####    ...       ...       ." + "'", str2, "       ...       ###hhi####    ...       ...       .");
    }

    @Test
    public void test04711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04711");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!        HI#!           ###HHI####           ...           ###HHI####           ...           ###HHI####            hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!         ", 30);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "          hia!          hia!  " + "'", str2, "          hia!          hia!  ");
    }

    @Test
    public void test04712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04712");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", 34, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI" + "'", str3, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
    }

    @Test
    public void test04713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04713");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                                                                                                    ", 63);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                    " + "'", str2, "                                                                                                    ");
    }

    @Test
    public void test04714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04714");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("####I           ####I           ####I           ####I           ####I           ####I           ####I           ####I           ####I H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04715");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter(".       ...       ...       ..", "    H     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04716");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("...       ...       ...       ...       ...       ...       ..", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test04717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04717");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("hI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04718");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("hI#                             #####################################", "hi!I!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#                             #####################################" + "'", str2, "#                             #####################################");
    }

    @Test
    public void test04719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04719");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("", "I                                  II                                  II                                  II                                  II                                  II                                  II                                  II                          ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04720");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("ih", 7, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaih" + "'", str3, "aaaaaih");
    }

    @Test
    public void test04721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04721");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("          hia!          hia!  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hia!          hia!" + "'", str1, "hia!          hia!");
    }

    @Test
    public void test04722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04722");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("hi!aaaaaaaaaaaaaaaaaaaI                                  II                                  II ", ' ', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!aaaaaaaaaaaaaaaaaaaI4444444444444444444444444444444444II4444444444444444444444444444444444II4" + "'", str3, "hi!aaaaaaaaaaaaaaaaaaaI4444444444444444444444444444444444II4444444444444444444444444444444444II4");
    }

    @Test
    public void test04723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04723");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("                                              !H#!H...                                              ", "...                             ", 14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04724");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("i!i!...", "hi!      ....H!IH!IHhhhhhhhhhh", 234);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "i!i!..." });
    }

    @Test
    public void test04725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04725");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("haih", ' ', 352);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04726");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("I!HI!H...", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("HHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "I!HI!H..." });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test04727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04727");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("!H!H...Hhi!I!       ", "44444", 285, 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "44444" + "'", str4, "44444");
    }

    @Test
    public void test04728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04728");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa           ####I           ####I           ####I           ####I           ####I           ####I...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 340);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa           ####I           ####I           ####I           ####I           ####I           ####I...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa           ####I           ####I           ####I           ####I           ####I           ####I...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test04729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04729");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited(" HI#!HHHHHHHHHHHHHHHHHHHHHHHHH     ", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI#!HHHHHHHHHHHHHHHHHHHHHHHHH" + "'", str2, "HI#!HHHHHHHHHHHHHHHHHHHHHHHHH");
    }

    @Test
    public void test04730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04730");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("      ###HHI####                 ###HHI####                 ###HHI####                 ###HHI####                 ###HHI####                 ###HHI####                 ###HHI####                 ###HHI####                 ###HHI####           ", "HHHHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04731");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("           ###HHI####           ...", "IH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04732");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("HI#!HHHHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI#!HHHHHHHHHHHHHHHHHHHHHHHHH" + "'", str1, "HI#!HHHHHHHHHHHHHHHHHHHHHHHHH");
    }

    @Test
    public void test04733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04733");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                          hi!                                  ", "...H!IH!I", (int) (byte) 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                          hi!                                  " });
    }

    @Test
    public void test04734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04734");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("#########################################################################################################################################################44444hi!44444i!hi!h44444hi!44444                                                                 ##########################################################################################################################################################", "                                                 h                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#########################################################################################################################################################44444hi!44444i!hi!h44444hi!44444                                                                 ##########################################################################################################################################################" + "'", str2, "#########################################################################################################################################################44444hi!44444i!hi!h44444hi!44444                                                                 ##########################################################################################################################################################");
    }

    @Test
    public void test04735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04735");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("i#!HHHHHHHHHHHHHHHHHHHHHHHHHhi#!HHHHHHHHHHHHHHHHHHHHHHHHHhi#!HHHHHHHHHHHHHHHHHHHHHHHHHhi#!HHHHHHHHHHHHHHHHHHHHHHHHHhi#!HHHHHHHHHHHHHHHHHHHHHHHHHhi#!HHHHHHHHHHHHHHHHHHHHHHHHHhi#!HHHHHHHHHHHHHHHHHHHHHHHHHhi#!HHHHHHHHHHHHHHHHHHHHHHHHHhi", "!Ha!H...", " HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#       ", 497);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "i#!HHHHHHHHHHHHHHHHHHHHHHHHHhi#!HHHHHHHHHHHHHHHHHHHHHHHHHhi#!HHHHHHHHHHHHHHHHHHHHHHHHHhi#!HHHHHHHHHHHHHHHHHHHHHHHHHhi#!HHHHHHHHHHHHHHHHHHHHHHHHHhi#!HHHHHHHHHHHHHHHHHHHHHHHHHhi#!HHHHHHHHHHHHHHHHHHHHHHHHHhi#!HHHHHHHHHHHHHHHHHHHHHHHHHhi" + "'", str4, "i#!HHHHHHHHHHHHHHHHHHHHHHHHHhi#!HHHHHHHHHHHHHHHHHHHHHHHHHhi#!HHHHHHHHHHHHHHHHHHHHHHHHHhi#!HHHHHHHHHHHHHHHHHHHHHHHHHhi#!HHHHHHHHHHHHHHHHHHHHHHHHHhi#!HHHHHHHHHHHHHHHHHHHHHHHHHhi#!HHHHHHHHHHHHHHHHHHHHHHHHHhi#!HHHHHHHHHHHHHHHHHHHHHHHHHhi");
    }

    @Test
    public void test04736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04736");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("HHH", "HI!", "hi#!");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test04737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04737");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("###hhi###", "hi !Hi!                          hi !Hi!                          hi !Hi!                          hi !Hi!                          hi !Hi!                          hi !Hi!                          hi !Hi!                          hi !", "aaaaaaaaaaa###HHI####aaaaaaaaaaa...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###aaa###" + "'", str3, "###aaa###");
    }

    @Test
    public void test04738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04738");
        char[] charArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("HI#!", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04739");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("I!i!", "I                    ###HHI####              ", 28);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "hi !");
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("###HHI####    ...", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "!i!" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "!i!" + "'", str6, "!i!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test04740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04740");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("           ####I           ####I           ####I           ####I           ####I           ####I...", 121, "HI!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!H           ####I           ####I           ####I           ####I           ####I           ####I..." + "'", str3, "HI!HI!HI!HI!HI!HI!HI!H           ####I           ####I           ####I           ####I           ####I           ####I...");
    }

    @Test
    public void test04741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04741");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) " HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04742");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("                                                                    444444444444444444444444444444444444444444HHI!I!       444444444444444444444444444444444444444444                                                                     ", "                                                                                                                                                                                                                                                                                                                                                    ", 126);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04743");
        char[] charArray10 = new char[] { '4', 'a', '#', '#', 'a', '4' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("", charArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("hi!       ", charArray10);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly(" H!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', 'a', '#', '#', 'a', '4' });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test04744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04744");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace("HH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04745");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("...H!IH!IH4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...H!IH!IH4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "...H!IH!IH4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test04746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04746");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                                                  4           ####ihh###...", "###HHI####");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                  4           ####ihh###..." + "'", str2, "                                                                  4           ####ihh###...");
    }

    @Test
    public void test04747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04747");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!...", "                     !aih          ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04748");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("AAAAAAAAAI", "##################################", 29, 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "##################################" + "'", str4, "##################################");
    }

    @Test
    public void test04749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04749");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("44444444444444444444444444                                              !H#!H...                                              ", "                                                 h                                                  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04750");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("i", 277);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i                                                                                                                                                                                                                                                                                    " + "'", str2, "i                                                                                                                                                                                                                                                                                    ");
    }

    @Test
    public void test04751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04751");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "                                                                    444444444444444444444444444444444444444444HHI!I!       444444444444444444444444444444444444444444                                                                     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04752");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("444444444444444444444444444444444444444444HI!!       444444444444444444444444444444444444444444", "!aih", (int) ' ');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "                           HI!   HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!...", 15, (int) (short) 1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "444444444444444444444444444444444444444444HI", "       444444444444444444444444444444444444444444" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test04753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04753");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                             ...", "hi!       aaaaaaaaaaaaaaaaaaaaaa", 13);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                             ..." });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test04754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04754");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("                         HI!HI!H...", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04755");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("I!HI!H...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04756");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("HHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH", "              hi !Hi!                          hi !Hi!                          hi !Hi!                          hi !Hi!                          hi !Hi!                          hi !", "44444444444444444444444444444444444444444444444444444444i#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#44444444444444444444444444" + "'", str3, "4444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#44444444444444444444444444");
    }

    @Test
    public void test04757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04757");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "!HHHHHHI!I!.i!HI!H...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi#!hi#!hi#!hi#!hi#!hi#hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04758");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "hi!");
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("hi!", strArray6);
        java.lang.String[] strArray9 = new java.lang.String[] {};
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray9);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9, "");
        java.lang.String[] strArray13 = new java.lang.String[] {};
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray13);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray13, "");
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEach("hi!", strArray9, strArray13);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.replaceEach("HI!", strArray6, strArray13);
        java.lang.String[] strArray19 = org.apache.commons.lang3.StringUtils.stripAll(strArray6);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny("      ...       ...      ", strArray19);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray19, "I!HI!H...hi!hi!hi!hi!hi!hihHI!i!aaaaaaaaaaaaaaaaaaaaaaaaai!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", 255, 10);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HI!" + "'", str18, "HI!");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test04759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04759");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("           ###HHI####           ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###HHI####           ..." + "'", str1, "###HHI####           ...");
    }

    @Test
    public void test04760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04760");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("i                                                                                                                                                                                                                                                                                    ", "4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4iHi!                          ", "                                                                                                                     HHHHHHHHHHHHHHH                                                                                                     ", 340);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "i                                                                                                                                                                                                                                                                                    " + "'", str4, "i                                                                                                                                                                                                                                                                                    ");
    }

    @Test
    public void test04761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04761");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###HHI####    ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04762");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", 96, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI" + "'", str3, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
    }

    @Test
    public void test04763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04763");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("#################################################################   ihhih!ih!ih!ih!ih!ih!ih!ih!ih!ih                           i", "I!i!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04764");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("    H!", 28, 13);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    H!" + "'", str3, "    H!");
    }

    @Test
    public void test04765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04765");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("I!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...", "hi4!hi4!hi4!hi4!hi4!hi4!HHHHHHI!I!.i!HI!H...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04766");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("I                         ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04767");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("           ###HHI####           ...");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "           ", "###", "HHI", "####", "           ", "..." });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04768");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("4HI!44444I!HI!H...44444HI!44444", "I!HI..#!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04769");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("##IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH###", 104);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                    ##IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH###" + "'", str2, "                                    ##IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH###");
    }

    @Test
    public void test04770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04770");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("    ...       ...       .#hhi#       ...       ", "###i###", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test04771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04771");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!hI#                             HIA!", 104);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
    }

    @Test
    public void test04772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04772");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("HI!IIIIIIIIIIIIIIIIIIIIIIIIIIIIHI!H", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04773");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("i           ###HHI####              ", "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!i!...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04774");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", 'a');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" + "'", str4, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
    }

    @Test
    public void test04775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04775");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("hia!          hia!", "HHHHHHI#!HHHHHHHHHHHHHHHHHHHHHHHHHHI#!HHHHHHHHHHHHHHHHHHHHHHHHHHI#!HHHHHHHHHHHHHHHHHHHHHHHHHHI#!HHHHHHHHHHHHHHHHHHHHHHHHHHI", "###hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi####");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hia#          hia#" + "'", str3, "hia#          hia#");
    }

    @Test
    public void test04776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04776");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("hHHHHHHHHHHHHH");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "h", "HHHHHHHHHHHHH" });
    }

    @Test
    public void test04777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04777");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("HHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IH      HHHHHHHHHHHHHHHHHHHHHHHHH!#IH      HHHHHHHHHHHHHHHHHHHHHHHHH!#IH      HHHHHHHHHHHHHHHHHHHHHHHHH!#IH      HHHHHHHHHHHHHHHHHHHHHHHHH!#IH      HHHHHHHHHHHHHHHHHHHHHHHHH!#IH      HHHHHHHHHHHHHHHHHHHHHHHHH!#IH      HHHHHHHHHHHHHHHHHHHHHHHHH!#IH      HHHHHHHHHHHHH" + "'", str1, "IH      HHHHHHHHHHHHHHHHHHHHHHHHH!#IH      HHHHHHHHHHHHHHHHHHHHHHHHH!#IH      HHHHHHHHHHHHHHHHHHHHHHHHH!#IH      HHHHHHHHHHHHHHHHHHHHHHHHH!#IH      HHHHHHHHHHHHHHHHHHHHHHHHH!#IH      HHHHHHHHHHHHHHHHHHHHHHHHH!#IH      HHHHHHHHHHHHHHHHHHHHHHHHH!#IH      HHHHHHHHHHHHH");
    }

    @Test
    public void test04778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04778");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase(".I..I...I..I...I..I...I..I...I..I...I..I...I..I...I..I..", "                               #...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04779");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("...H!IH!IH ", 100, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...H!IH!IH aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...H!IH!IH aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test04780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04780");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("####IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH###");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04781");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444      HI#!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444      HI#!" + "'", str1, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444      HI#!");
    }

    @Test
    public void test04782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04782");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("!H!H..", "hi!aaaaaaaaaaaaaaaaaaaI4444444444444444444444444444444444II4444444444444444444444444444444444II4");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04783");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!        HI!           HHI           ...           HHI           ...           HHI            hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!         ", 336, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test04784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04784");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("...H!IH!IH ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...H!IH!IH" + "'", str1, "...H!IH!IH");
    }

    @Test
    public void test04785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04785");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                                                              ...                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..." + "'", str1, "...");
    }

    @Test
    public void test04786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04786");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric(".hiI4....hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04787");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("...hhi.......", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...hhi......." + "'", str2, "...hhi.......");
    }

    @Test
    public void test04788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04788");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("HHHHHHHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHHHHHHHHHHHH" + "'", str1, "HHHHHHHHHHHHHHH");
    }

    @Test
    public void test04789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04789");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                                44444444444444444444444444444444                                                ", "       ...       .#hhi#       ...       ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04790");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast(".       ...       ...       ..", "################################################################ i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04791");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull(" ");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test04792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04792");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("####ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh###", "    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!44444    H!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04793");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    aaaaa!H    ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaa.hi!hi!hi!hi!hi!hihHI!i!aaaaaaaaaaaaaaaaaaaaaaaaai!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04794");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("####ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04795");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("#################################################################ihhih!ih!ih!ih!ih!ih!ih!ih!ih!ihi", "4444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#44444444444444444444444444", (int) (short) 100, 3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "###4444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#44444444444444444444444444" + "'", str4, "###4444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#44444444444444444444444444");
    }

    @Test
    public void test04796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04796");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("", "444444444444I...4444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04797");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("hi!      ....H!IH!IHhhhhhhhhhh", 255);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04798");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("HH", "...       ...       ...       haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.       ..");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04799");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("i#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi", "Hhi!I!       ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test04800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04800");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!...hi!hi!hi!hi!hi!hi!hi!hi!", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04801");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("  ", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA###HHI####    ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04802");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                          HI!HI!H...", '#', 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04803");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("I!HI..#!", "Hih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!HI..#!" + "'", str2, "I!HI..#!");
    }

    @Test
    public void test04804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04804");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("hHI!i!aaaaaaaaaaaaaaaaaaaaaaaaa", "I!i!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHI!i!aaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "hHI!i!aaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test04805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04805");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace("         ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04806");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("       ...       .#hhi#       ...      ", " HI#!HHHHHHHHHHHHHHHHHHHHHHHHH     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04807");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("HHIHHHHHHHHHHHHHHHHIHHHHHHHHHHHHHH", "HI#!", (int) (byte) -1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
    }

    @Test
    public void test04808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04808");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test04809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04809");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("HI!i!aaa!H!H...Hhi!I!", "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04810");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("I                                  ################################################################", "hii", (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04811");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("           ####I           ####I           ####I           ####I           ####I           ####I           ####I           ####I           ####I H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "####I           ####I           ####I           ####I           ####I           ####I           ####I           ####I           ####I H" + "'", str1, "####I           ####I           ####I           ####I           ####I           ####I           ####I           ####I           ####I H");
    }

    @Test
    public void test04812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04812");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("                                                                                            !aih", "           ###HHI####           ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04813");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04814");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("", ' ');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!       ", "HHI");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", strArray3, strArray7);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, "###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!       " });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI" + "'", str8, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!       " + "'", str10, "hi!       ");
    }

    @Test
    public void test04815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04815");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace("    hi!hhi!i!       hi!hhi!i!  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04816");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("                                                      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04817");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("...h!ih!ih", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04818");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("################################################################ i", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444      HI#!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04819");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04820");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hHI!i", "IH");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hHI!i" });
    }

    @Test
    public void test04821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04821");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("                                    ##IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH###", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04822");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("...hhi.......", "HH", 2);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("ia!###HHI");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("          ...           444HHI4444           ...           444HHI4444  ", strArray4, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "...hhi......." });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "ia", "!###", "HHI" });
    }

    @Test
    public void test04823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04823");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("H#ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H#ih" + "'", str1, "H#ih");
    }

    @Test
    public void test04824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04824");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "44444444444HI!i!aaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04825");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("", "", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test04826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04826");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("Hi!                          ", "                                                               hi!       aaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!                          " + "'", str2, "Hi!                          ");
    }

    @Test
    public void test04827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04827");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test04828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04828");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!Hhi!I!       HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04829");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp(".");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
    }

    @Test
    public void test04830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04830");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!                                                                                                                              ", "           I");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!                                                                                                                              " + "'", str2, "hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!                                                                                                                              ");
    }

    @Test
    public void test04831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04831");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                               ###HHI####    ...");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "I                           HI!   HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!...", 14, 285);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 14 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "                               ", "###", "HHI", "####", "    ", "..." });
    }

    @Test
    public void test04832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04832");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("HHI", "I!I!...");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HH" });
    }

    @Test
    public void test04833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04833");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("Hhhhhhhhhh", "                            #...", "HI!i!aaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hhhhhhhhhh" + "'", str3, "Hhhhhhhhhh");
    }

    @Test
    public void test04834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04834");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "...    ####ihh###aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04835");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith(".I..I.", "I            ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04836");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("...hhi....    ..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...hhi......" + "'", str1, "...hhi......");
    }

    @Test
    public void test04837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04837");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                                                                                                             aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###hhi####    ...                                                                                                 ", "##############################################################   ihhih!ih!ih!ih!ih!ih!ih!ih!ih!ih                           i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                             aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###hhi####    ...                                                                                                 " + "'", str2, "                                                                                                             aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###hhi####    ...                                                                                                 ");
    }

    @Test
    public void test04838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04838");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("HI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "HI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaaHI!i!aaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test04839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04839");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!        HI#!           ###HHI####           ...           ###HHI####           ...           ###HHI####            hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!         ", "HHHHHHHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!        HI#!           ###HHI####           ...           ###HHI####           ...           ###HHI####            hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!         " + "'", str2, "          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!        HI#!           ###HHI####           ...           ###HHI####           ...           ###HHI####            hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!          hia!         ");
    }

    @Test
    public void test04840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04840");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("", 234);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                          " + "'", str2, "                                                                                                                                                                                                                                          ");
    }

    @Test
    public void test04841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04841");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!IHHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!IH", "...       ###hhi####    ...       ...       .");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04842");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("I!i!", "I                    ###HHI####              ", 28);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "hi !");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "!i!" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "!i!" + "'", str5, "!i!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "!i!" + "'", str6, "!i!");
    }

    @Test
    public void test04843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04843");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("hI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI" + "'", str2, "I!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI");
    }

    @Test
    public void test04844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04844");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("#################################################################   ihhih!ih!ih!ih!ih!ih!ih!ih!ih!ih                           i", "hi !Hi!                          hi !Hi!        hi4!hi4!hi4!hi4!hi4!hi4!HHHHHHI!I!...                          hi !Hi!                          hi !Hi!                          hi !Hi!                          hi !");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04845");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                               ###H", ".I..I..");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04846");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("                                                                                                                                                                                                                                                                                                                                                    ", "          hia");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hia" + "'", str2, "hia");
    }

    @Test
    public void test04847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04847");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###", "  ...       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###" + "'", str2, "IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###");
    }

    @Test
    public void test04848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04848");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "...  hia");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test04849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04849");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("hi4!hi4!hi4!hi4!hi4!hi4!HHHHHHI!I!...", "                                                                                            !aih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                            !aih" + "'", str2, "                                                                                            !aih");
    }

    @Test
    public void test04850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04850");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("!H!H...                                             ", "    hi!hhi!i!       hi!hhi!i!  ", 10);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, ' ');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "H", "H..." });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H H..." + "'", str5, "H H...");
    }

    @Test
    public void test04851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04851");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("I");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "I" });
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "I" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I" + "'", str3, "I");
    }

    @Test
    public void test04852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04852");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("hia                                ", "4           ###HHI####           44           ###HHI####           44           ###HHI####           44           ###HHI####           44           ######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04853");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("hi#!", 336);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi#!                                                                                                                                                                                                                                                                                                                                            " + "'", str2, "hi#!                                                                                                                                                                                                                                                                                                                                            ");
    }

    @Test
    public void test04854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04854");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "...H!IH!IH ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04855");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("   hhi    ", "hHI!i");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04856");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("           ###HHI####           ...");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "                           HI!   HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!...", 126, 255);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 126 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "           ", "###", "HHI", "####", "           ", "..." });
    }

    @Test
    public void test04857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04857");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("           ####I           ####I           ####I           ####I           ####I           ####I...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04858");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("                                                                                                    ", "           ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###            ###HHI####           ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                    " + "'", str2, "                                                                                                    ");
    }

    @Test
    public void test04859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04859");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!...", "                               ###HHI####    ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!..." + "'", str2, "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!...");
    }

    @Test
    public void test04860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04860");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("!i!", 12, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!i!#########" + "'", str3, "!i!#########");
    }

    @Test
    public void test04861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04861");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 99 + "'", int2 == 99);
    }

    @Test
    public void test04862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04862");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("                                                                  4           ####ihh###...", "########!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#################!4ih#########");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                  4           ####ihh###..." + "'", str2, "                                                                  4           ####ihh###...");
    }

    @Test
    public void test04863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04863");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("#######                                                                                                                                                                                                                                                                                                                                             ", 'a');
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a', 3, (int) (byte) 0);
        int int9 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("           ###HHI####              ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "#######                                                                                                                                                                                                                                                                                                                                             " });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "#######" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test04864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04864");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("4444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04865");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("...H!IH!IH4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "...hhi....    ...", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04866");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "4           ###HHI####           4");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04867");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("HI#!HHHHHHHHHHHHHHHHHHHHHHHHH", "...hhi.......");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI#!HHHHHHHHHHHHHHHHHHHHHHHHH" + "'", str2, "HI#!HHHHHHHHHHHHHHHHHHHHHHHHH");
    }

    @Test
    public void test04868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04868");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("44444444444444444444444444                                              !H#!H...                                              ");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, 'a');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "44444444444444444444444444", "                                              ", "!", "H", "#!", "H", "...", "                                              " });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444a                                              a!aHa#!aHa...a                                              " + "'", str3, "44444444444444444444444444a                                              a!aHa#!aHa...a                                              ");
    }

    @Test
    public void test04869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04869");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("##################################################################################################################################################", "Hi !");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test04870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04870");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("              hi !Hi!                          hi !Hi!                          hi !Hi!                          hi !Hi!                          hi !Hi!                          hi !", "##################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "              hi !Hi!                          hi !Hi!                          hi !Hi!                          hi !Hi!                          hi !Hi!                          hi !" + "'", str2, "              hi !Hi!                          hi !Hi!                          hi !Hi!                          hi !Hi!                          hi !Hi!                          hi !");
    }

    @Test
    public void test04871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04871");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("HHI!I!", "HH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHI!I!" + "'", str2, "HHI!I!");
    }

    @Test
    public void test04872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04872");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("H!IH!IH ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " HI!HI!H" + "'", str1, " HI!HI!H");
    }

    @Test
    public void test04873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04873");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("HI!HI!HI!HI!HI!HI!HI!H           ####I           ####I           ####I           ####I           ####I           ####I...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!H           ####I           ####I           ####I           ####I           ####I           ####I..." + "'", str1, "HI!HI!HI!HI!HI!HI!HI!H           ####I           ####I           ####I           ####I           ####I           ####I...");
    }

    @Test
    public void test04874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04874");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("HHI    ...", "####IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH###", (int) (byte) -1, 3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "####IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH###    ..." + "'", str4, "####IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH###    ...");
    }

    @Test
    public void test04875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04875");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("...###hi!       ####           4                                                                  ", "                                                                                                                                                                                                                                                                                                                               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04876");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("       ...       .#hhi#       ...       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "       ...       .#HHI#       ...       " + "'", str1, "       ...       .#HHI#       ...       ");
    }

    @Test
    public void test04877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04877");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("HIH", 51);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIH" + "'", str2, "HIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIHHIH");
    }

    @Test
    public void test04878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04878");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("                           HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04879");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("hia!###HHI", "I                           HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   ################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hia!###HHI" + "'", str2, "hia!###HHI");
    }

    @Test
    public void test04880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04880");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("HI#", "...H!IH!IH ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04881");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("44444444444444444444444444444444444444444444444444444444i#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI#!HHHHHHHHHHHHHHHHHHHHHHHHH      HI444444444444444444444444444444444444444444444444444444444", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444444444444444444i#!HHHHHHHHHHHHHHHHHHHHHHHHHHI#!HHHHHHHHHHHHHHHHHHHHHHHHHHI#!HHHHHHHHHHHHHHHHHHHHHHHHHHI#!HHHHHHHHHHHHHHHHHHHHHHHHHHI#!HHHHHHHHHHHHHHHHHHHHHHHHHHI#!HHHHHHHHHHHHHHHHHHHHHHHHHHI#!HHHHHHHHHHHHHHHHHHHHHHHHHHI#!HHHHHHHHHHHHHHHHHHHHHHHHHHI444444444444444444444444444444444444444444444444444444444" + "'", str2, "44444444444444444444444444444444444444444444444444444444i#!HHHHHHHHHHHHHHHHHHHHHHHHHHI#!HHHHHHHHHHHHHHHHHHHHHHHHHHI#!HHHHHHHHHHHHHHHHHHHHHHHHHHI#!HHHHHHHHHHHHHHHHHHHHHHHHHHI#!HHHHHHHHHHHHHHHHHHHHHHHHHHI#!HHHHHHHHHHHHHHHHHHHHHHHHHHI#!HHHHHHHHHHHHHHHHHHHHHHHHHHI#!HHHHHHHHHHHHHHHHHHHHHHHHHHI444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test04882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04882");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("hi!      ....H!IH!IH", 1, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test04883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04883");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("       ...       .#hhi#       ...                                                               ", "###hhi###", "                                                                                                                                                        HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################                                                                                                                                                        ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test04884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04884");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty(".       ...       ...       ..                                                                                                                                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".       ...       ...       .." + "'", str1, ".       ...       ...       ..");
    }

    @Test
    public void test04885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04885");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("h", "           ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####           ", (int) (short) 1);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!H!H...                                             ", "hi4!hi4!hi4!hi4!hi4!hi4!HHHHHHI!I!.i!HI!H...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("HI#                             #####################################", strArray4, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "h" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "", "", "", "", "", "", "                                             " });
    }

    @Test
    public void test04886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04886");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("hi#!                                                                                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi#!                                                                                                                                                                                                                                                                                                                                            " + "'", str1, "hi#!                                                                                                                                                                                                                                                                                                                                            ");
    }

    @Test
    public void test04887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04887");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("", "       ...");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test04888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04888");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####" + "'", str2, "###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####                      ###HHI####");
    }

    @Test
    public void test04889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04889");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("           ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###      ", "IIIIIIIIIIIIIIIIIIIIIHI!H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04890");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("i!HI!H...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "i!HI!H...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" });
    }

    @Test
    public void test04891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04891");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("HI!HI!H...", (int) ' ', "    h!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    h!    hHI!HI!H...    h!    h" + "'", str3, "    h!    hHI!HI!H...    h!    h");
    }

    @Test
    public void test04892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04892");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###                 ####IHH###", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test04893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04893");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("Hi!                          ", "hHI!i!aaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test04894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04894");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("aaaaaaaaaaaaaaaaaaa       !ih                                                               ", "       ...       .#hhi#       ...      ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 19 + "'", int2 == 19);
    }

    @Test
    public void test04895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04895");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("!H!H...Hhi!I!       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!H!H...Hhi!I!" + "'", str1, "!H!H...Hhi!I!");
    }

    @Test
    public void test04896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04896");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("4           ###HHI####           44           ###HHI####           44           ###HHI####           44           ###HHI####           44           ######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH##", "    hi!hhi!i!       hi!hhi!i!  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4           ###HHI####           44           ###HHI####           44           ###HHI####           44           ###HHI####           44           ######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH##" + "'", str2, "4           ###HHI####           44           ###HHI####           44           ###HHI####           44           ###HHI####           44           ######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH##");
    }

    @Test
    public void test04897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04897");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("hhi", "aaaaaaaaaaaaaaaaaaaaaaaaaahi#");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04898");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("###hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...#", (int) (short) 10, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...#" + "'", str3, "###hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...#");
    }

    @Test
    public void test04899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04899");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("                                                      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI", "hi4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI" + "'", str2, "                                                      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI#!hhhhhhhhhhhhhhhhhhhhhhhhh      HI");
    }

    @Test
    public void test04900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04900");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase(".               HHHHHHHHHHHHHHH", "I!HI..#!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".               HHHHHHHHHHHHHHH" + "'", str2, ".               HHHHHHHHHHHHHHH");
    }

    @Test
    public void test04901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04901");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("HHI    ...", 30, "!4ih");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!4ih!4ih!4ih!4ih!4ihHHI    ..." + "'", str3, "!4ih!4ih!4ih!4ih!4ihHHI    ...");
    }

    @Test
    public void test04902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04902");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("!i!#########");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!i!#########" + "'", str1, "!i!#########");
    }

    @Test
    public void test04903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04903");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("hi!aaaaaaaaaaaaaaaaaaa", "                HHHHHHHHHHHHHH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04904");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("#########################################################################################################################################################44444HI!44444I!HI!H44444HI!44444                                                                 ##########################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#########################################################################################################################################################44444HI!44444I!HI!H44444HI!44444                                                                 ##########################################################################################################################################################" + "'", str1, "#########################################################################################################################################################44444HI!44444I!HI!H44444HI!44444                                                                 ##########################################################################################################################################################");
    }

    @Test
    public void test04905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04905");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("H");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, ' ', 100, 48);
        java.lang.Class<?> wildcardClass6 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "H" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test04906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04906");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("hI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI", "                           HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04907");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("", 69);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04908");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("I!HI!H...", "...hhi......");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04909");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("...       ###hhi####    ...       ...       .", "####I           ####I           ####I           ####I           ####I           ####I           ####I           ####I           ####I H");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "...       ###hhi####    ...       ...       ." });
    }

    @Test
    public void test04910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04910");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("    IHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH   ", "I                         ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04911");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("aaaaaaaaaaaaaaaaaaaa4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4aaaaaaaaaaaaaaaaaaaaa", "hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04912");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("H#ih", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04913");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!" + "'", str1, "hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!hhi!i!       hi!");
    }

    @Test
    public void test04914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04914");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("hia!", "####ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######ihh#######");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04915");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("###HHI####", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04916");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("I");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "                HHHHHHHHHHHHHHH");
        java.lang.Class<?> wildcardClass5 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "I" });
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "I" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "I" });
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test04917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04917");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("hi!");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test04918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04918");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("!hi!hi!hi!hi!hi!hi!hi!hi!hihhi   ################################################################", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04919");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("H#ih");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "H", "#", "ih" });
    }

    @Test
    public void test04920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04920");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("hhi!i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04921");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("HI!i!aaa!H!H...Hhi!I!", 128);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!i!aaa!H!H...Hhi!I!" + "'", str2, "HI!i!aaa!H!H...Hhi!I!");
    }

    @Test
    public void test04922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04922");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase("HI!H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04923");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("       ...       ###hhi####    ...       ...       .", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04924");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("!H#!H...", "###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####                      ###hhi####");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04925");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("i                           hi!hi!hi!hi!hi!hi!hi!hi!hi!hihhi   #################################################################", "#################################################################   IHHIH!IH!IH!IH!IH!IH!IH!IH!IH!IH                           I");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04926");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("...4444444444", "...    ####ihh###aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("HI!i!aaaaaaaaaaaaaaaaaaaaaaaaa", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "...4444444444" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test04927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04927");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("       #                            #                            #                            #                            ", 277);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                 #                            #                            #                            #                            " + "'", str2, "                                                                                                                                                                 #                            #                            #                            #                            ");
    }

    @Test
    public void test04928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04928");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("", "i                         ...", 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04929");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("!4ih!4ih!4ih!4ih!4ihHHI    ...", "I!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...I!HI!H...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!4ih!4ih!4ih!4ih!4ihHHI    ..." + "'", str2, "!4ih!4ih!4ih!4ih!4ihHHI    ...");
    }

    @Test
    public void test04930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04930");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("      ###44I####           ", "4444444                                                                                                                                                                                      444444444444444444444444444444444444444444HHI!I!       444444444444444444444444444444444444444444                                                                     ", "###hhi...#", 24);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "      ###44I####           " + "'", str4, "      ###44I####           ");
    }

    @Test
    public void test04931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04931");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "                                                 h                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04932");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("################################################################ i", "    ...       ...       .#HHI#       ...       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "################################################################ i" + "'", str2, "################################################################ i");
    }

    @Test
    public void test04933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04933");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("HI", "          ...           ###HHI####           ...           ###HHI####            ...           ###HHI####           ...           ###HHI####            ...           ###HHI####           ...           ###HHI####            ...           ###HHI####           ...          hi####IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH###!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI" + "'", str2, "HI");
    }

    @Test
    public void test04934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04934");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("", " HI!HI!H", "", 48);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test04935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04935");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("4", "I!I!...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04936");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("###hhi####    ...", 497, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###hhi####    ...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                " + "'", str3, "###hhi####    ...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
    }

    @Test
    public void test04937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04937");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("HHI!I!", 285);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04938");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("AAAAAAAAAI", "HIH", "Hi !");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test04939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04939");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("###");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "###" });
    }

    @Test
    public void test04940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04940");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("HI!HI!HI!HI!HI!HI!HI!H           ####I           ####I           ####I           ####I           ####I           ####I...", "hi !");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 120 + "'", int2 == 120);
    }

    @Test
    public void test04941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04941");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("44444HI!4444444444HI!4444444444HI!4444444444HI!4444444444HI!4444444444HI!4444444444HI!4444444444HI!4444444444HI!4444444444HIi!i!", 120);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444HI!4444444444HI!4444444444HI!4444444444HI!4444444444HI!4444444444HI!4444444444HI!4444444444HI!4444444444HI!4444444444HIi!i!" + "'", str2, "44444HI!4444444444HI!4444444444HI!4444444444HI!4444444444HI!4444444444HI!4444444444HI!4444444444HI!4444444444HI!4444444444HIi!i!");
    }

    @Test
    public void test04942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04942");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("           I", "                            #...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "           I" + "'", str2, "           I");
    }

    @Test
    public void test04943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04943");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("HHII!HII!H!HIIIIIIII!HII!H!HIIIIIIII!HII!H!HIIIIIIII!HII!H!HIIIIIIII!HII!H!HIIIIIIII!HII!H!HIIIIIIII!HI", "hI#                             ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test04944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04944");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("I                           HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################", "I            ", 352);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "               HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################" });
    }

    @Test
    public void test04945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04945");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("!H!H...                                             ", "44444444444HI!i!aaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04946");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("HHIHHHHHHHHHHHHHHHHHHHHHH", "Hi !");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04947");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("HHHHHHI#!HHHHHHHHHHHHHHHHHHHHHHHHHHI#!HHHHHHHHHHHHHHHHHHHHHHHHHHI#!HHHHHHHHHHHHHHHHHHHHHHHHHHI#!HHHHHHHHHHHHHHHHHHHHHHHHHHI", 6, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HHHHHHI#!HHHHHHHHHHHHHHHHHHHHHHHHHHI#!HHHHHHHHHHHHHHHHHHHHHHHHHHI#!HHHHHHHHHHHHHHHHHHHHHHHHHHI#!HHHHHHHHHHHHHHHHHHHHHHHHHHI" + "'", str3, "HHHHHHI#!HHHHHHHHHHHHHHHHHHHHHHHHHHI#!HHHHHHHHHHHHHHHHHHHHHHHHHHI#!HHHHHHHHHHHHHHHHHHHHHHHHHHI#!HHHHHHHHHHHHHHHHHHHHHHHHHHI");
    }

    @Test
    public void test04948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04948");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("aaaaaih", "##################################", 352, 281);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaaaaih##################################" + "'", str4, "aaaaaih##################################");
    }

    @Test
    public void test04949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04949");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("#########################################################################################################################################################44444hi!44444i!hi!h44444hi!44444                                                                 ##########################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#########################################################################################################################################################44444hi!44444i!hi!h44444hi!44444                                                                 #########################################################################################################################################################" + "'", str1, "#########################################################################################################################################################44444hi!44444i!hi!h44444hi!44444                                                                 #########################################################################################################################################################");
    }

    @Test
    public void test04950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04950");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull(".hi!hi!hi!hi!hi!hihHI!i!aaaaaaaaaaaaaaaaaaaaaaaaai!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".hi!hi!hi!hi!hi!hihHI!i!aaaaaaaaaaaaaaaaaaaaaaaaai!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h" + "'", str1, ".hi!hi!hi!hi!hi!hihHI!i!aaaaaaaaaaaaaaaaaaaaaaaaai!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
    }

    @Test
    public void test04951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04951");
        char[] charArray8 = new char[] {};
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny("HI!HI!H...", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny("                                                 h                                                  ", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly("Hi!                          ", charArray8);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny("!aih", charArray8);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone("I                    ###HHI####              ", charArray8);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray8);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("hHI!i!aaaaaaaaaaaaaaaaaaaaaaaaa", charArray8);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone("               HHHHHHHHHHHHHHH", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test04952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04952");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("4           ###HHI####           4                                                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4           ###hhi####           4                                                                  " + "'", str1, "4           ###hhi####           4                                                                  ");
    }

    @Test
    public void test04953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04953");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("", "ia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hia!hhhhhhhhhhhhhhhhhhhhhhhhh      hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04954");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                            #...", "444444444444444444444444444444444444444444hHI!i!       444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test04955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04955");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByCharacterType("...H!IH!IH                         ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.replaceEach("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!...HI!HI!HI!HI!HI!HI!HI!HI!", strArray2, strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 55 vs 7");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "...", "H", "!", "IH", "!", "IH", "                         " });
    }

    @Test
    public void test04956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04956");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04957");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("                                                                                                                                                                                                                                                                                                                                              hia!", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04958");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI" + "'", str2, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI");
    }

    @Test
    public void test04959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04959");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("44444HI!44444I!HI!H44444HI!44444                                                                 ");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "       ...       ###hhi####    ...       ...       .");
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("4           ###hhi####           4                                                                  ", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "44444", "HI", "!", "44444", "I", "!", "HI", "!", "H", "44444", "HI", "!", "44444", "                                                                 " });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "44444", "HI", "!", "44444", "I", "!", "HI", "!", "H", "44444", "HI", "!", "44444", "" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 34 + "'", int5 == 34);
    }

    @Test
    public void test04960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04960");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###hhi####    ...                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###hhi####    ...                                                                                                 " + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###hhi####    ...                                                                                                 ");
    }

    @Test
    public void test04961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04961");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("!AIH                                                ", 92, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444!AIH                                                " + "'", str3, "4444444444444444444444444444444444444444!AIH                                                ");
    }

    @Test
    public void test04962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04962");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("444444444444444444444444444444444444444444########!4ih#########", "!H#!H...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test04963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04963");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("       ...       .#hhi#       ...       ", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       ...       #hhi#       ...       ." + "'", str2, "       ...       #hhi#       ...       .");
    }

    @Test
    public void test04964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04964");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("...H!IH!IH", "           ###HHI####           ", "                        ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test04965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04965");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("hi", 106);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi" + "'", str2, "hi");
    }

    @Test
    public void test04966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04966");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                               " + "'", str1, "                               ");
    }

    @Test
    public void test04967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04967");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (-1), 12);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test04968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04968");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("i                                                                                                                                                                                                                                                                                    ", "i#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04969");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("hia");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "hia" });
    }

    @Test
    public void test04970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04970");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("                                                      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi", "hhhHI#!hhhhhhhhhhhhhhhhhhhhhhhhhHI#!hhhhhhhhhhhhhhhhhhhhhhhhhHI", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04971");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("4           ###HHI####           4                                                                  ", "       ...       ...       ...       ...       ...       .....       ...       ...       ...       ...       ...       ..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4           ###HHI####           4                                                                  " + "'", str2, "4           ###HHI####           4                                                                  ");
    }

    @Test
    public void test04972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04972");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("...H!IH!IH                                                                                                                                                                                                                                                                                                                                                                                                ", "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!...hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test04973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04973");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("    ...       ...       .#hhi#       ...       ", "   ##");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04974");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("aaaaaaaaaaaaaaaaaaa       !ih                                                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaa       !ih                                                               " + "'", str1, "aaaaaaaaaaaaaaaaaaa       !ih                                                               ");
    }

    @Test
    public void test04975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04975");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...H!IH!IH aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...H!IH!IH aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...H!IH!IH aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test04976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04976");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("i                                  ", 29, "hhi!i!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "i                                  " + "'", str3, "i                                  ");
    }

    @Test
    public void test04977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04977");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast(".", "HHIHHHHHHHHHHHHHHHHIHHHHHHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "." + "'", str2, ".");
    }

    @Test
    public void test04978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04978");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("##############################################################################################################################################################HI!IIIIIIIIIIIIIIIIIIIIIIIIIIIIHI!H###############################################################################################################################################################", "hi####IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH###!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04979");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("HHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHH                         ", "...H!IH!IH                                                                                                                                                                                                                                                                                                                                                                                                ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04980");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!i!...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!i!..." + "'", str1, "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!i!...");
    }

    @Test
    public void test04981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04981");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("HI#                             #####################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI#                             #####################################" + "'", str1, "HI#                             #####################################");
    }

    @Test
    public void test04982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04982");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("!AIH          ", "...H!IH!IH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04983");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "hi!");
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("hi!", strArray6);
        java.lang.String[] strArray9 = new java.lang.String[] {};
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray9);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9, "");
        java.lang.String[] strArray13 = new java.lang.String[] {};
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray13);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray13, "");
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEach("hi!", strArray9, strArray13);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.replaceEach("HI!", strArray6, strArray13);
        int int19 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                         HI!HI!H...", strArray13);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray13);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HI!" + "'", str18, "HI!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test04984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04984");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hh...       ###hhi####    ...       ...       .");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hh...       ###hhi####    ...       ...       ." + "'", str1, "Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hhi!I!Hh...       ###hhi####    ...       ...       .");
    }

    @Test
    public void test04985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04985");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("HHI!I!", "##############!4ih##############");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04986");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("hii");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04987");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("#                             #####################################", "HHH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#                             #####################################" + "'", str2, "#                             #####################################");
    }

    @Test
    public void test04988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04988");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("hi!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04989");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("!H    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!H    " + "'", str1, "!H    ");
    }

    @Test
    public void test04990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04990");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("4", '#', 29);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04991");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("hHHHHHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHHHHHHHHHHH" + "'", str1, "hHHHHHHHHHHHHH");
    }

    @Test
    public void test04992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04992");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("hHI!i!aaaaaaaaaaaaaaaaaaaaaaaaa", 336, (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hHI!i!aaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "hHI!i!aaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test04993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04993");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("...hhi......", 394);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                               ...hhi......                                                                                                                                                                                               " + "'", str2, "                                                                                                                                                                                               ...hhi......                                                                                                                                                                                               ");
    }

    @Test
    public void test04994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04994");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("!4ih!4ih!4ih!4ih!4ihHHI    ...", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!4ih!4ih!4ih!4ih!4ihHHI    ..." + "'", str2, "!4ih!4ih!4ih!4ih!4ihHHI    ...");
    }

    @Test
    public void test04995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04995");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("###############################################################################################################################################################################################################################################################Hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!i!...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###############################################################################################################################################################################################################################################################Hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!i!..." + "'", str1, "###############################################################################################################################################################################################################################################################Hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!i!...");
    }

    @Test
    public void test04996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04996");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("########!4ih#########", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04997");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("               HHHHHHHHHHHHHHH", "                                                                 ##########################################################################################################################################################4HI!4I!HI!H4HI!4#########################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04998");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("I...", '#', 338);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04999");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                                 h                                                  ", 34, "      ...       ...      ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                 h                                                  " + "'", str3, "                                                 h                                                  ");
    }

    @Test
    public void test05000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test05000");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("HHHHHHHHHHHHHHHHHHHHHHHHH      hi4!HHHHHHHHHHHHHHHHHHHHHHHHH      hi4!HHHHHHHHHHHHHHHHHHHHHHHHH      hi4!HHHHHHHHHHHHHHHHHHHHHHHHH      hi4!HHHHHHHHHHHHHHHHHHHHHHHHH      hi4!HHHHHHHHHHHHHHHHHHHHHHHHH      hi4!HHHHHHHHHHHHHHHHHHHHHHHHH      hi4!HHHHHHHHHHHHHHHHHHHHHHHHH      hi4!HHHHHHHHHHHHHHHHHHHHHHHHH      hi4!HHHHHHHHHHHHHHHHHHHHHHHHH", "IIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }
}

