package org.apache.commons.lang;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest11 {

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
    public void test05501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05501");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceOnce("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!IHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "hAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa############       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!########################", " !ih                                                 !ih");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!IHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!IHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test05502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05502");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.leftPad("444444", (int) (short) 1, "                                                 ...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444" + "'", str3, "444444");
    }

    @Test
    public void test05503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05503");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.leftPad("...AAAAAAAAAAAAAAAAAAAAAAAAAAAAA...", 87, "############aaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "############aaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...AAAAAAAAAAAAAAAAAAAAAAAAAAAAA..." + "'", str3, "############aaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...AAAAAAAAAAAAAAAAAAAAAAAAAAAAA...");
    }

    @Test
    public void test05504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05504");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.stripEnd("#########", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                     hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#########" + "'", str2, "#########");
    }

    @Test
    public void test05505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05505");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.abbreviate("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi", (int) ' ', 43);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa..." + "'", str3, "...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
    }

    @Test
    public void test05506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05506");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAsciiPrintable("...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test05507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05507");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.mid("...AAAAAAAAAAAAAAAAAAAAAAAAAAAAA..", 88, 34);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test05508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05508");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.center("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!", 96, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!");
    }

    @Test
    public void test05509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05509");
        int int3 = org.apache.commons.lang.StringUtils.indexOf("                                                                    ", 'a', 50);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05510");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("                                                   ", "", (int) (byte) 10);
        java.lang.String[] strArray6 = org.apache.commons.lang.StringUtils.stripAll(strArray4, "hi!");
        boolean boolean7 = org.apache.commons.lang.StringUtils.startsWithAny("!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!i", strArray6);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test05511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05511");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeEnd("...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI", "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa...IH!I...Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI" + "'", str2, "...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI");
    }

    @Test
    public void test05512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05512");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNumeric("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05513");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNotBlank((java.lang.CharSequence) "h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test05514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05514");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.swapCase(" hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H  " + "'", str1, " HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H  ");
    }

    @Test
    public void test05515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05515");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.split("", "############################################################", (int) (byte) -1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
    }

    @Test
    public void test05516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05516");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.remove("################################IHH", " HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "################################IHH" + "'", str2, "################################IHH");
    }

    @Test
    public void test05517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05517");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.remove("HIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!...aaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!...aaaaaaaaaaa" + "'", str2, "HIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!...aaaaaaaaaaa");
    }

    @Test
    public void test05518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05518");
        boolean boolean2 = org.apache.commons.lang.StringUtils.endsWith("44444444444HI!                      AAA444444444444", "                         !ih                                                 !ih                   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05519");
        int int2 = org.apache.commons.lang.StringUtils.indexOf("HI!                      AAA       ", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05520");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAllLowerCase("        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05521");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.substringBetween("       hi!#       hi!#       hi!#       hi!#       hi!#       hi!#       hi!#hAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "    ...aaaaaaaaaaaaaa##########################...", "...                                                                                    h!ih!ih!i");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test05522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05522");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("!HI!HI!H  ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "!HI!HI!H", "", "" });
    }

    @Test
    public void test05523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05523");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeStartIgnoreCase("AAAAAAAAAAAAA", "                   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!hi!                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAA" + "'", str2, "AAAAAAAAAAAAA");
    }

    @Test
    public void test05524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05524");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isBlank((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa       hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05525");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                         hi                       ...h", "hi!                      ...h", 100);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                                                         hi                       ...h" });
    }

    @Test
    public void test05526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05526");
        boolean boolean2 = org.apache.commons.lang.StringUtils.endsWithIgnoreCase("                  HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                  ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA               haaa                      !ih                                         haaa                      !ih                                         haaa                      !ih                                         ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05527");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphanumericSpace("hi!#########################hi!####Hhi!aaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05528");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("HI! aaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "IH", (int) (byte) 1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "HI! aaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test05529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05529");
        int int2 = org.apache.commons.lang.StringUtils.indexOfAnyBut("...                                                                   ", "hI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test05530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05530");
        boolean boolean2 = org.apache.commons.lang.StringUtils.startsWithIgnoreCase("                                                                      ", "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA..");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05531");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trim("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   HI!      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   HI!" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   HI!");
    }

    @Test
    public void test05532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05532");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNotEmpty((java.lang.CharSequence) "#AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test05533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05533");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOf("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaa", " HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H  ", 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05534");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("A", " HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H  ", (int) ' ');
        java.lang.String str4 = org.apache.commons.lang.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "A" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A" + "'", str4, "A");
    }

    @Test
    public void test05535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05535");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isWhitespace("HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05536");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOf("                                                                                         ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05537");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBefore("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                       ", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                       " + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                       ");
    }

    @Test
    public void test05538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05538");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAllUpperCase("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test05539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05539");
        boolean boolean2 = org.apache.commons.lang.StringUtils.startsWith("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "HI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05540");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBefore("i!#########################", "                                                                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!#########################" + "'", str2, "i!#########################");
    }

    @Test
    public void test05541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05541");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.upperCase("                                                                                                                                                                     !IHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                     !IHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "                                                                                                                                                                     !IHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test05542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05542");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.overlay("       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaa!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!aaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa", "44444444444   HI!       ...aaaaaaaaaaaaaa##########################...   HI!   444444444444", 20, (int) '4');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "       hi!aaaaaaaaaa44444444444   HI!       ...aaaaaaaaaaaaaa##########################...   HI!   444444444444aaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaa!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!aaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str4, "       hi!aaaaaaaaaa44444444444   HI!       ...aaaaaaaaaaaaaa##########################...   HI!   444444444444aaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaa!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!aaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test05543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05543");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substring("hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa", 2);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test05544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05544");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.capitalize("hi!                      ... ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!                      ... " + "'", str1, "Hi!                      ... ");
    }

    @Test
    public void test05545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05545");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.substringsBetween("###################...   HI!             ######444444444", "Hi!                      ...h", "aaaaa aaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test05546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05546");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.deleteWhitespace("!IH!IH!IH!                                                                                    ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!IH!IH!IH!..." + "'", str1, "!IH!IH!IH!...");
    }

    @Test
    public void test05547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05547");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa", "H!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih       hi!aaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray2, "aaaaaaaaaaaaaa################################IHh");
        java.lang.Class<?> wildcardClass5 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str4, "hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test05548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05548");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOf("!ih    !IH   A", "                                                                       aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA..", 119);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05549");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trimToEmpty("...                                             ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...                                             ..." + "'", str1, "...                                             ...");
    }

    @Test
    public void test05550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05550");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.substringsBetween("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!aaaaaaaaaa", "i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "                                         hi                       ...h");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test05551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05551");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.substringsBetween("4444444hi!#########################", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...                                             ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test05552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05552");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlpha("       HI!                 HI!                 HI!          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05553");
        char[] charArray11 = new char[] { 'a', 'a', '4' };
        boolean boolean12 = org.apache.commons.lang.StringUtils.containsAny("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", charArray11);
        boolean boolean13 = org.apache.commons.lang.StringUtils.containsAny("                                                                                       ...", charArray11);
        boolean boolean14 = org.apache.commons.lang.StringUtils.containsOnly("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH", charArray11);
        boolean boolean15 = org.apache.commons.lang.StringUtils.containsAny("HA...", charArray11);
        boolean boolean16 = org.apache.commons.lang.StringUtils.containsOnly("                                                           aaaaaaaaa", charArray11);
        boolean boolean17 = org.apache.commons.lang.StringUtils.containsNone("", charArray11);
        boolean boolean18 = org.apache.commons.lang.StringUtils.containsAny("    ...aaaaaaaaaaaaaa##########################...", charArray11);
        boolean boolean19 = org.apache.commons.lang.StringUtils.containsOnly("i!...", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { 'a', 'a', '4' });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test05554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05554");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.substring("hi!#########################       hi!####        H", 50, 214);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H" + "'", str3, "H");
    }

    @Test
    public void test05555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05555");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trimToNull("...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!" + "'", str1, "...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!");
    }

    @Test
    public void test05556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05556");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.leftPad("aaaaaaaaaaaaaaaa aaaaaaaaaaaaaaa", 91, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaa");
    }

    @Test
    public void test05557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05557");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isEmpty((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hiI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05558");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAllLowerCase("aaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05559");
        int int2 = org.apache.commons.lang.StringUtils.indexOf("...aaaaaaaaaaaaaaaaaaaaaaaaaaaaa", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05560");
        java.lang.String[] strArray1 = null;
        boolean boolean2 = org.apache.commons.lang.StringUtils.startsWithAny("A...                     ", strArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05561");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.remove("                                                                                              ...", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "..." + "'", str2, "...");
    }

    @Test
    public void test05562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05562");
        int int3 = org.apache.commons.lang.StringUtils.ordinalIndexOf("I!HI!HI!HI!HI!HI", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05563");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsIgnoreCase("aaaaaaaaa", "...A");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05564");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceChars("#########################!ih       #########################!ih       #########################!ih       #########################!ih       #########################!ih       #########################!ih       #########################!ih       #########################!ih       #########################!ih", '4', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#########################!ih       #########################!ih       #########################!ih       #########################!ih       #########################!ih       #########################!ih       #########################!ih       #########################!ih       #########################!ih" + "'", str3, "#########################!ih       #########################!ih       #########################!ih       #########################!ih       #########################!ih       #########################!ih       #########################!ih       #########################!ih       #########################!ih");
    }

    @Test
    public void test05565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05565");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNumeric("                         ...aaaaaaaaaaaaaa################################IHh                      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05566");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBefore("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...                                             ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!");
    }

    @Test
    public void test05567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05567");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.reverse("hi!#########################       hi!####        Hhi!#########################       hi!####        Hhi!#########################       hi!####        Hhi!#########################       hi!####        Hhi!#########################       hi!####        Hhi!#########################       hi!####        Hhi!#########################       hi!####        Hhi!#########################       hi!####        Hhi!#########################       hi!####        Hhi!#########################       hi!####        H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H        ####!ih       #########################!ihH        ####!ih       #########################!ihH        ####!ih       #########################!ihH        ####!ih       #########################!ihH        ####!ih       #########################!ihH        ####!ih       #########################!ihH        ####!ih       #########################!ihH        ####!ih       #########################!ihH        ####!ih       #########################!ihH        ####!ih       #########################!ih" + "'", str1, "H        ####!ih       #########################!ihH        ####!ih       #########################!ihH        ####!ih       #########################!ihH        ####!ih       #########################!ihH        ####!ih       #########################!ihH        ####!ih       #########################!ihH        ####!ih       #########################!ihH        ####!ih       #########################!ihH        ####!ih       #########################!ihH        ####!ih       #########################!ih");
    }

    @Test
    public void test05568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05568");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphaSpace("...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Haaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05569");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.abbreviate("aaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaa", 171);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test05570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05570");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa h aaaaaaaaaaaaaaaaaaaaaaaaa ", "Hi!                                hi!                                hi!                                hi!                                hi!                                hi!                                hi!                                hi!                                hi!                                hi!                        ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa h aaaaaaaaaaaaaaaaaaaaaaaaa " });
    }

    @Test
    public void test05571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05571");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.replace("                                              hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!", "hi!", "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   HI!    ", 3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                              Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   HI!    Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   HI!    Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   HI!    hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!" + "'", str4, "                                              Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   HI!    Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   HI!    Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   HI!    hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!");
    }

    @Test
    public void test05572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05572");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.defaultIfEmpty("i! i! aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!i! i! i", "       hi!                      ...hihi!                      ...!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i! i! aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!i! i! i" + "'", str2, "i! i! aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!i! i! i");
    }

    @Test
    public void test05573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05573");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeEndIgnoreCase("Hi!hi!hi!h...", "                                                                                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!hi!hi!h..." + "'", str2, "Hi!hi!hi!h...");
    }

    @Test
    public void test05574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05574");
        boolean boolean2 = org.apache.commons.lang.StringUtils.contains("                     hi!                      ...hihi!                      ...!              ", '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05575");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang.StringUtils.lowerCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!IHaaaaaaaaaaaaaaaaaaaaaaa", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05576");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNumericSpace("hi!                                hi!                                hi!                                hi!                                hi!                                hi!                                hi!                                hi!                                hi!                                hi!                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05577");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.overlay("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "I", 128, (int) 'a');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hI" + "'", str4, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hI");
    }

    @Test
    public void test05578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05578");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBeforeLast("                         ...aaaaaaaaaaaaaa################################IHh                      ", "##########################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                         ...aaaaaaaaaaaaaa################################IHh                      " + "'", str2, "                         ...aaaaaaaaaaaaaa################################IHh                      ");
    }

    @Test
    public void test05579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05579");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.split("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", "I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", 20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray3, "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaa", 102, 229);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 102 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
    }

    @Test
    public void test05580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05580");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.substringsBetween("!HI!HI!HI!HI!HI!HI!HI!H  hi HI!HI!HI!HI!HI!HI!HI!H444444444444444                                                          aaaaaaaaaa", "...                                                                                    h!ih!ih!i", "HA...                                                                                                                    ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test05581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05581");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.stripToEmpty("aaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test05582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05582");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOf("...aaaa...", 'a', (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
    }

    @Test
    public void test05583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05583");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.defaultString("!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa", "hi!                                hi!                                hi!                                hi!                                hi!                                hi!                                hi!                                hi!                                hi!                                hi!                        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test05584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05584");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNumeric("HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05585");
        int int2 = org.apache.commons.lang.StringUtils.indexOfDifference("   HI!    aaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   HI!", "I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test05586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05586");
        char[] charArray10 = new char[] { '#', 'a', 'a', ' ' };
        boolean boolean11 = org.apache.commons.lang.StringUtils.containsAny("", charArray10);
        int int12 = org.apache.commons.lang.StringUtils.indexOfAny("HI!", charArray10);
        int int13 = org.apache.commons.lang.StringUtils.indexOfAnyBut("   HI!    ", charArray10);
        boolean boolean14 = org.apache.commons.lang.StringUtils.containsNone("H!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih", charArray10);
        boolean boolean15 = org.apache.commons.lang.StringUtils.containsAny("h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih", charArray10);
        int int16 = org.apache.commons.lang.StringUtils.indexOfAnyBut("hI!", charArray10);
        java.lang.Class<?> wildcardClass17 = charArray10.getClass();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '#', 'a', 'a', ' ' });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test05587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05587");
        boolean boolean2 = org.apache.commons.lang.StringUtils.equals("44444444444   HI!       ...aaaaaaaaaaaaaa##########################...   HI!   444444444444", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05588");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.substringBetween("                                                                                                                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...                                             ", "    ...aaaaaaaaaaaaaa##########################...", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   HI!      ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test05589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05589");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitByCharacterType("    A   HI!    ");
        int int2 = org.apache.commons.lang.StringUtils.indexOfDifference(strArray1);
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.stripAll(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "    ", "A", "   ", "HI", "!", "    " });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "A", "", "HI", "!", "" });
    }

    @Test
    public void test05590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05590");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trimToNull("                                                 ");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test05591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05591");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.lowerCase("!aaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!aaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "!aaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test05592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05592");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceChars("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!", 'a', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!" + "'", str3, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!");
    }

    @Test
    public void test05593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05593");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.upperCase("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test05594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05594");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.chomp("I!AAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I!AAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "I!AAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test05595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05595");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("                                                   ", "                                                    ");
        int int5 = org.apache.commons.lang.StringUtils.indexOfAny("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", strArray4);
        java.lang.String[] strArray10 = org.apache.commons.lang.StringUtils.split("", "                                                                                          ", 100);
        boolean boolean11 = org.apache.commons.lang.StringUtils.startsWithAny("H!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih", strArray10);
        java.lang.String[] strArray12 = org.apache.commons.lang.StringUtils.stripAll(strArray10);
        java.lang.String str13 = org.apache.commons.lang.StringUtils.replaceEach("    I!   ", strArray4, strArray10);
        java.lang.String str14 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "                                                   " });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "    I!   " + "'", str13, "    I!   ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                                                   " + "'", str14, "                                                   ");
    }

    @Test
    public void test05596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05596");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                                                                                     !IHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "4444444444444444444444444444444444444444444444444444444444444444444444444hi!                      ...h");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                                                                                                                                     !IHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" });
    }

    @Test
    public void test05597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05597");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.chop("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" + "'", str1, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
    }

    @Test
    public void test05598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05598");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substring("...aaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 121);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05599");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeEnd("       hi!#########################       hi!###################################################IHh                                                                                                                                                                                                                                       ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                        hi!                         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       hi!#########################       hi!###################################################IHh                                                                                                                                                                                                                                       " + "'", str2, "       hi!#########################       hi!###################################################IHh                                                                                                                                                                                                                                       ");
    }

    @Test
    public void test05600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05600");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.abbreviate("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI..." + "'", str2, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...");
    }

    @Test
    public void test05601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05601");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.stripEnd("###################################################################################################       hi!                      ...hihi!                      ...!####################################################################################################", "hi!                      ...################                                                    aaaaaaaaaa################hi!                      ...################                                                    aaaaaaaaaa################hi!                      ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05602");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBetween("hi!aaaaaaaaaaaaaaaaaaaaaaaaa", "    !IH   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test05603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05603");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphaSpace("aaaaaaaaaaaaaaaaaaaaaaaaaaaaA...I!HI...aaaaaaaaaaaaaaaaaaaaaaaaaaaaA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05604");
        int int2 = org.apache.commons.lang.StringUtils.indexOfDifference("...aaaa...", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...                                             ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test05605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05605");
        boolean boolean2 = org.apache.commons.lang.StringUtils.contains("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA     HI !     ", "       hi!#########################       hi!###################################################IHh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05606");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.remove("AAAAAAAAAAAAAA################################IHH", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAA################################IHH" + "'", str2, "AAAAAAAAAAAAAA################################IHH");
    }

    @Test
    public void test05607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05607");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("aaaaaaaaaa...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "aaaaaaaaaa...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH", "" });
    }

    @Test
    public void test05608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05608");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.defaultString("..H!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..H!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih" + "'", str1, "..H!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
    }

    @Test
    public void test05609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05609");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.mid("aaaaaaaaaa################################IH", 970, 19);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test05610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05610");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.deleteWhitespace("A   HI!    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AHI!" + "'", str1, "AHI!");
    }

    @Test
    public void test05611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05611");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.uncapitalize("hHI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!          " + "'", str1, "hHI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!          ");
    }

    @Test
    public void test05612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05612");
        int int1 = org.apache.commons.lang.StringUtils.length("...                                                                                    h!ih!ih!iH");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 97 + "'", int1 == 97);
    }

    @Test
    public void test05613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05613");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.rightPad("aaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa         ", 0, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa         " + "'", str3, "aaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa         ");
    }

    @Test
    public void test05614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05614");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceChars("aaaaa", "                      ...h", "                                                                                                                       ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaa" + "'", str3, "aaaaa");
    }

    @Test
    public void test05615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05615");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAsciiPrintable("                                                           aaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test05616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05616");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceChars("                                                                          aaaaaaaaaa", "...       ", "aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test05617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05617");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.chop("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH" + "'", str1, "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH");
    }

    @Test
    public void test05618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05618");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.stripToNull("hi!                      aaa                         ...aaaaaaaaaaaaaa#############################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!                      aaa                         ...aaaaaaaaaaaaaa#############################" + "'", str1, "hi!                      aaa                         ...aaaaaaaaaaaaaa#############################");
    }

    @Test
    public void test05619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05619");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeStart("Hi!                      ...haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaaaaaaaa", "               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!                      ...haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "Hi!                      ...haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test05620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05620");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.split("i!                      ..", "HI", (int) (short) 100);
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "i!                      .." });
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05621");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitByCharacterType("A##################################");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "A", "##################################" });
    }

    @Test
    public void test05622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05622");
        int int2 = org.apache.commons.lang.StringUtils.indexOfAny("aaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaa", "                                                HI!                                                 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 25 + "'", int2 == 25);
    }

    @Test
    public void test05623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05623");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphanumeric("Hi!                                hi!                                hi!                                hi!                                hi!                                hi!                                hi!                                hi!                                hi!                                hi!                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05624");
        boolean boolean2 = org.apache.commons.lang.StringUtils.contains("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test05625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05625");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.right("...                                                                   ", 15);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "               " + "'", str2, "               ");
    }

    @Test
    public void test05626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05626");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.replace("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa !IH", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...", 29);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa !IH" + "'", str4, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa !IH");
    }

    @Test
    public void test05627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05627");
        java.lang.String[] strArray1 = null;
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByCharacterType("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!    ");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.replaceEachRepeatedly("hi!#########################       hi!####        H", strArray1, strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "   ", "HI", "!", "    " });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!#########################       hi!####        H" + "'", str4, "hi!#########################       hi!####        H");
    }

    @Test
    public void test05628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05628");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBetween("!IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", "hi!                      aaa                         ...aaaaaaaaaaaaaa#############################");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test05629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05629");
        int int2 = org.apache.commons.lang.StringUtils.indexOf("###", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test05630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05630");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.repeat("aaaaaaa...hi!#########################       hi!", 8);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaa...hi!#########################       hi!aaaaaaa...hi!#########################       hi!aaaaaaa...hi!#########################       hi!aaaaaaa...hi!#########################       hi!aaaaaaa...hi!#########################       hi!aaaaaaa...hi!#########################       hi!aaaaaaa...hi!#########################       hi!aaaaaaa...hi!#########################       hi!" + "'", str2, "aaaaaaa...hi!#########################       hi!aaaaaaa...hi!#########################       hi!aaaaaaa...hi!#########################       hi!aaaaaaa...hi!#########################       hi!aaaaaaa...hi!#########################       hi!aaaaaaa...hi!#########################       hi!aaaaaaa...hi!#########################       hi!aaaaaaa...hi!#########################       hi!");
    }

    @Test
    public void test05631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05631");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("", "                                                                                    ", 56);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
    }

    @Test
    public void test05632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05632");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.center("hi!#########################hi!#########################hi!#########################hi!#########################hi!#########################hi!#########################hi!#########################hi!#########################hi!#########################hi!########################", 171);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!#########################hi!#########################hi!#########################hi!#########################hi!#########################hi!#########################hi!#########################hi!#########################hi!#########################hi!########################" + "'", str2, "hi!#########################hi!#########################hi!#########################hi!#########################hi!#########################hi!#########################hi!#########################hi!#########################hi!#########################hi!########################");
    }

    @Test
    public void test05633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05633");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.split("                                                                   ...", "##########", 128);
        java.lang.String[] strArray7 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                   ", "HI!");
        java.lang.String str8 = org.apache.commons.lang.StringUtils.getCommonPrefix(strArray7);
        java.lang.String str9 = org.apache.commons.lang.StringUtils.replaceEach("                                                                                                                                     ...", strArray4, strArray7);
        int int10 = org.apache.commons.lang.StringUtils.indexOfDifference(strArray4);
        java.lang.String[] strArray12 = org.apache.commons.lang.StringUtils.stripAll(strArray4, "##########################################################");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray12, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) (short) 10, 19);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "                                                                   ..." });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "                                                   " });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "                                                   " + "'", str8, "                                                   ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                                                                                                     " + "'", str9, "                                                                                                                     ");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "                                                                   ..." });
    }

    @Test
    public void test05634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05634");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeEnd("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!    ", "4444444444444444                                                          aaaaaaaaaa ...hi!###################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!    " + "'", str2, "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!    ");
    }

    @Test
    public void test05635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05635");
        int int2 = org.apache.commons.lang.StringUtils.indexOfAny("                                              hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHI!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 46 + "'", int2 == 46);
    }

    @Test
    public void test05636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05636");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.center("haaAAAAAAAAAAAAAAAAAAAAAAaaa", 171, "#########################!ih       #########################!ih       #########################!ih       #########################!ih       #########################!ih       #########################!ih       #########################!ih       #########################!ih       ##############");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#########################!ih       #########################!ih       #haaAAAAAAAAAAAAAAAAAAAAAAaaa#########################!ih       #########################!ih       ##" + "'", str3, "#########################!ih       #########################!ih       #haaAAAAAAAAAAAAAAAAAAAAAAaaa#########################!ih       #########################!ih       ##");
    }

    @Test
    public void test05637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05637");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.abbreviate("aaaaaaaaaaaaaa################################ihh", 102, 276);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaa################################ihh" + "'", str3, "aaaaaaaaaaaaaa################################ihh");
    }

    @Test
    public void test05638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05638");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.left("...                                                                   ", 98);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...                                                                   " + "'", str2, "...                                                                   ");
    }

    @Test
    public void test05639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05639");
        boolean boolean2 = org.apache.commons.lang.StringUtils.contains("#####       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test05640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05640");
        int int2 = org.apache.commons.lang.StringUtils.indexOfAnyBut("I!                      ...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!... HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!... HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!...HI! HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!... HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!... HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!... HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05641");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlpha("H!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05642");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAllUpperCase("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05643");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.left("                                                hi!                                                 ", 93);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                hi!                                          " + "'", str2, "                                                hi!                                          ");
    }

    @Test
    public void test05644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05644");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.mid("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...                                             ", 214, 42);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test05645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05645");
        boolean boolean2 = org.apache.commons.lang.StringUtils.endsWith("i!       ####################################################################################################", "#########");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test05646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05646");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.stripToEmpty("       hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test05647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05647");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeStart("       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!", "..                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!" + "'", str2, "       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!");
    }

    @Test
    public void test05648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05648");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.abbreviate("I!AAAAAAAAAAAAAAAAAAAAAAAAA", 171);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!AAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "I!AAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test05649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05649");
        int int2 = org.apache.commons.lang.StringUtils.lastIndexOf(" HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H  ", "##############       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05650");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringAfterLast("hi!                      aaa                         ...aaaaaaaaaaaaaa############################", "I!                      ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05651");
        char[] charArray13 = new char[] { '#', 'a', 'a', ' ' };
        boolean boolean14 = org.apache.commons.lang.StringUtils.containsAny("", charArray13);
        int int15 = org.apache.commons.lang.StringUtils.indexOfAnyBut("                                                    ", charArray13);
        boolean boolean16 = org.apache.commons.lang.StringUtils.containsAny("HI!", charArray13);
        boolean boolean17 = org.apache.commons.lang.StringUtils.containsNone("                                                   ", charArray13);
        boolean boolean18 = org.apache.commons.lang.StringUtils.containsAny("                                                                                                    ", charArray13);
        boolean boolean19 = org.apache.commons.lang.StringUtils.containsOnly("                                                                                       ...", charArray13);
        boolean boolean20 = org.apache.commons.lang.StringUtils.containsOnly("       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!", charArray13);
        boolean boolean21 = org.apache.commons.lang.StringUtils.containsOnly("...#################       hi!###################################################IHh", charArray13);
        int int22 = org.apache.commons.lang.StringUtils.indexOfAnyBut("                         !ih                                                 !ih                   ", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '#', 'a', 'a', ' ' });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 25 + "'", int22 == 25);
    }

    @Test
    public void test05652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05652");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.chop("       HI!                 HI!                 HI!          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "       HI!                 HI!                 HI!         " + "'", str1, "       HI!                 HI!                 HI!         ");
    }

    @Test
    public void test05653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05653");
        boolean boolean2 = org.apache.commons.lang.StringUtils.equalsIgnoreCase("HHHHHH", "                     hi!                      ...hihi!                      ...!              ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05654");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trim("          ##########                                                                                                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##########" + "'", str1, "##########");
    }

    @Test
    public void test05655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05655");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.right("                                                                                                                                                                                                                                                                                                                                                                                                                                                               ih                                                  ih                   ", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05656");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.overlay("         ", "################################", 265, 16);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "         ################################" + "'", str4, "         ################################");
    }

    @Test
    public void test05657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05657");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("                                                    ", "HI!");
        java.lang.String str5 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray3, "HI!");
        java.lang.String str9 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray3, 'a', (int) (byte) 1, 0);
        java.lang.String str10 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray3);
        int int11 = org.apache.commons.lang.StringUtils.indexOfAny("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!    i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h!IH", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                                    " });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                                                    " + "'", str5, "                                                    ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "                                                    " + "'", str10, "                                                    ");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test05658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05658");
        boolean boolean2 = org.apache.commons.lang.StringUtils.startsWithIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "AAAAAAAAAAAAAAAAAAAAAAA...aaaaaaaaaaaaaa###");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05659");
        boolean boolean2 = org.apache.commons.lang.StringUtils.endsWithIgnoreCase(" HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H  ", "                         ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05660");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphanumeric("                                                    hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!aaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05661");
        int int2 = org.apache.commons.lang.StringUtils.indexOfAnyBut("               HI            aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa               HI             ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!                                                              ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
    }

    @Test
    public void test05662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05662");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("##########", "                                                                                     HI!", 88);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "##########" });
    }

    @Test
    public void test05663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05663");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                  ", "aaaaaaaaaa                                                                                       ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                  " });
    }

    @Test
    public void test05664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05664");
        int int2 = org.apache.commons.lang.StringUtils.lastIndexOf("###################...   HI!             ######444444444", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05665");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("", "         hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!aa");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
    }

    @Test
    public void test05666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05666");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("aaaaaaaaaa################################IH", "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aaaaaaaaaa################################IH" });
    }

    @Test
    public void test05667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05667");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("...                                             ...", "...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Haaa", (int) (byte) 100);
        java.lang.String str6 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray4, "                        hi!                         ");
        boolean boolean7 = org.apache.commons.lang.StringUtils.startsWithAny("...aaaaaaaaaaaaaa################################IHh", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "...                                             ..." });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "...                                             ..." + "'", str6, "...                                             ...");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test05668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05668");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.center("               I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H                               ", 1, "                                                                                 hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "               I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H                               " + "'", str3, "               I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H                               ");
    }

    @Test
    public void test05669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05669");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hiI", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hiI", 70);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
    }

    @Test
    public void test05670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05670");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.defaultString("AAAAAAAAAAAAAA################################IHH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAA################################IHH" + "'", str1, "AAAAAAAAAAAAAA################################IHH");
    }

    @Test
    public void test05671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05671");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trim(" ... ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..." + "'", str1, "...");
    }

    @Test
    public void test05672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05672");
        boolean boolean2 = org.apache.commons.lang.StringUtils.equalsIgnoreCase("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "I");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05673");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaa ");
        java.lang.String str5 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray1, '#', 48, (int) (short) 10);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test05674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05674");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.substringsBetween("                         ...aaaaaaaaaaaaaa################################IHh                      ", "aaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaa################################IH");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test05675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05675");
        char[] charArray1 = null;
        int int2 = org.apache.commons.lang.StringUtils.indexOfAnyBut("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05676");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.substring("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI", 7, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test05677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05677");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.leftPad("aaaaaaaaaaaaaa################################ih", 970);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          aaaaaaaaaaaaaa################################ih" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          aaaaaaaaaaaaaa################################ih");
    }

    @Test
    public void test05678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05678");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replace("aaaaaaaaaa                                                                                       ", "!hi!hi!hi!hi!hi!hi", "       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaa...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaa                                                                                       " + "'", str3, "aaaaaaaaaa                                                                                       ");
    }

    @Test
    public void test05679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05679");
        int int2 = org.apache.commons.lang.StringUtils.indexOf("!HI!HI!H", "                                         HI                       ...H");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05680");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.stripStart("                                                                                                 HI!", "aaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!" + "'", str2, "HI!");
    }

    @Test
    public void test05681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05681");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isEmpty((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAA...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05682");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceChars("aaaaaaaaaa                   ", '4', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaa                   " + "'", str3, "aaaaaaaaaa                   ");
    }

    @Test
    public void test05683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05683");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphanumericSpace("IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05684");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlpha("A...                                                             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05685");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.upperCase("HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!" + "'", str1, "HI!");
    }

    @Test
    public void test05686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05686");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isBlank((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHi!                      aaah");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05687");
        boolean boolean2 = org.apache.commons.lang.StringUtils.endsWith("   !IH   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa   ", "hi!...hihi!...!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05688");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNotBlank((java.lang.CharSequence) "aaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test05689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05689");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.defaultString("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA               haaa                      !ih                                         haaa                      !ih                                         haaa                      !ih                                         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA               haaa                      !ih                                         haaa                      !ih                                         haaa                      !ih                                         " + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA               haaa                      !ih                                         haaa                      !ih                                         haaa                      !ih                                         ");
    }

    @Test
    public void test05690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05690");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.stripStart("", "       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05691");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.mid("   HI!                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!", 87, 93);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I!" + "'", str3, "I!");
    }

    @Test
    public void test05692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05692");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substring("                                                    hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!aaaaaaaaaa", 32);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                    hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!aaaaaaaaaa" + "'", str2, "                    hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!aaaaaaaaaa");
    }

    @Test
    public void test05693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05693");
        boolean boolean2 = org.apache.commons.lang.StringUtils.endsWith("                                              Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   HI!    Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   HI!    Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   HI!    hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!", "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   HI!    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05694");
        int int2 = org.apache.commons.lang.StringUtils.indexOfDifference("                 hi!                 hi!                 hi!                                        ", "haaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test05695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05695");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAllLowerCase("aaaaaaaaaaaaaaa aaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05696");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isWhitespace("hi                       ...h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05697");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!                      ...hihi!                      ...!         ", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!                      ...hihi!                      ...!         " });
    }

    @Test
    public void test05698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05698");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("h!ih!", "...#################       hi!###################################################IHh", 3);
        java.lang.String str7 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                     hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!", 29, (int) (byte) -1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "h!ih!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test05699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05699");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.difference("       hi!                 hi!                 hi!          ", "...aaaaaaaaaaaaaa################################IH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...aaaaaaaaaaaaaa################################IH" + "'", str2, "...aaaaaaaaaaaaaa################################IH");
    }

    @Test
    public void test05700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05700");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.overlay("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", "################################IH", 48, (int) ' ');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI################################IH" + "'", str4, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI################################IH");
    }

    @Test
    public void test05701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05701");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAsciiPrintable("...#################       hi!###################################################IHh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test05702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05702");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.chop("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!hi" + "'", str1, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!hi");
    }

    @Test
    public void test05703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05703");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeEnd(" aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                  HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, " aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test05704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05704");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitByCharacterType("                         ...aaaaaaaaaaaaaa################################IHh                      ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "                         ", "...", "aaaaaaaaaaaaaa", "################################", "IH", "h", "                      " });
    }

    @Test
    public void test05705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05705");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.swapCase("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!hi!" + "'", str1, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!hi!");
    }

    @Test
    public void test05706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05706");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.split("                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                                  HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 ", "#");
        java.lang.String[] strArray5 = org.apache.commons.lang.StringUtils.stripAll(strArray3, "                                                    hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!aaaaaaaaaa");
        java.lang.String[] strArray10 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("hi!", "aaaaaaaaaa", (int) (short) 1);
        java.lang.String[] strArray11 = null;
        java.lang.String str12 = org.apache.commons.lang.StringUtils.replaceEachRepeatedly("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", strArray10, strArray11);
        java.lang.String str14 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray10, "");
        java.lang.String str15 = org.apache.commons.lang.StringUtils.replaceEach("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", strArray3, strArray10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray3, '#', 43, 82);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 43 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                                  HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 " });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h" + "'", str12, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str15, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test05707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05707");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceOnce("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444", "hi!#########################hi!####Hhi!aaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaa", "                                                                                     HI!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444");
    }

    @Test
    public void test05708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05708");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceChars("#########################!ih       #########################!ih       #########################!ih       #########################!ih       #########################!ih       #########################!ih       #########################!ih       #########################!ih       #########################!ih", "    ...", "!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAhaaa!ihhaaa!ihhaaa!ih");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#########################!ih!!!!!!!#########################!ih!!!!!!!#########################!ih!!!!!!!#########################!ih!!!!!!!#########################!ih!!!!!!!#########################!ih!!!!!!!#########################!ih!!!!!!!#########################!ih!!!!!!!#########################!ih" + "'", str3, "#########################!ih!!!!!!!#########################!ih!!!!!!!#########################!ih!!!!!!!#########################!ih!!!!!!!#########################!ih!!!!!!!#########################!ih!!!!!!!#########################!ih!!!!!!!#########################!ih!!!!!!!#########################!ih");
    }

    @Test
    public void test05709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05709");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeStart("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "A##################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test05710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05710");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.capitalize("                                                                                                             aaaaaaa...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                             aaaaaaa..." + "'", str1, "                                                                                                             aaaaaaa...");
    }

    @Test
    public void test05711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05711");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("Hi!                      ... ", "...AAAAAAAAAAAAAAAAAAAAAAAAAAAAA..");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "Hi!                      ... " });
    }

    @Test
    public void test05712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05712");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.defaultString("HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                                  HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                                  HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!" + "'", str2, "HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                                  HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!");
    }

    @Test
    public void test05713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05713");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceChars("444444444444444444444444444444444444444444444444#################################################", 'a', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444444444#################################################" + "'", str3, "444444444444444444444444444444444444444444444444#################################################");
    }

    @Test
    public void test05714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05714");
        int int2 = org.apache.commons.lang.StringUtils.lastIndexOf("################                                                    aaaaaaaaaa################", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05715");
        int int2 = org.apache.commons.lang.StringUtils.indexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaA...I!HI...aaaaaaaaaaaaaaaaaaaaaaaaaaaaA", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05716");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeEnd("...#################       hi!###################################################IHh", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA     HI !     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...#################       hi!###################################################IHh" + "'", str2, "...#################       hi!###################################################IHh");
    }

    @Test
    public void test05717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05717");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAllLowerCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaA...I!HI...aaaaaaaaaaaaaaaaaaaaaaaaaaaaA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05718");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.reverse("A...                                                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                              ...A" + "'", str1, "                                                              ...A");
    }

    @Test
    public void test05719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05719");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.abbreviate("!IH   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa", 87);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!IH   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA..." + "'", str2, "!IH   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...");
    }

    @Test
    public void test05720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05720");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("      ...", "!ih                                                 !ih", 29);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "      ..." });
    }

    @Test
    public void test05721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05721");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.substringBetween("HI!#########################HI!#########################HI!#########################HI!#########################HI!#########################HI!#########################HI!#########################HI!#########################HI!#########################HI!########################", "H", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test05722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05722");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.leftPad("HI! aaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 52);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI! aaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "HI! aaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test05723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05723");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.defaultString("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa       hi!#########################       hi!###################################################IH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!" + "'", str2, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!");
    }

    @Test
    public void test05724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05724");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("!IHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "       hi!");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray2, 'a');
        java.lang.Class<?> wildcardClass5 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!IHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "!IHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str4, "!IHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test05725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05725");
        boolean boolean2 = org.apache.commons.lang.StringUtils.contains("Aaaaaaaaaaaaaa################################IHh", 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test05726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05726");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.abbreviate("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...                                             ...", 56, 52);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "....                                             ..." + "'", str3, "....                                             ...");
    }

    @Test
    public void test05727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05727");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isEmpty((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05728");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.uncapitalize("                                     hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                     hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI" + "'", str1, "                                     hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI");
    }

    @Test
    public void test05729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05729");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitByCharacterTypeCamelCase("ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!i    !ih   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  hi!aaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test05730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05730");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.defaultIfEmpty("       !ihAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!ihAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA!", "                                                                                                             aaaaaaa..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       !ihAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!ihAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA!" + "'", str2, "       !ihAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!ihAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA!");
    }

    @Test
    public void test05731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05731");
        boolean boolean2 = org.apache.commons.lang.StringUtils.equals("          ##########                                                                                                     ", "...                     aA...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05732");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA444", "i!#########################");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA444" });
    }

    @Test
    public void test05733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05733");
        int int3 = org.apache.commons.lang.StringUtils.indexOf("hI", "I!AAAAAAAAAAAAAAAAAAAAAAAAA", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05734");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeEnd("...                                                                                    h!ih!ih!i", "h!ih!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...                                                                                    h!ih!ih!i" + "'", str2, "...                                                                                    h!ih!ih!i");
    }

    @Test
    public void test05735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05735");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphaSpace("...aaaaaaaaaaaaaa################################IH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05736");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBetween("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!    ", "aaaaaaaaHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HaahiaHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Haa!");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test05737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05737");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringAfterLast("hi#########################", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05738");
        int int3 = org.apache.commons.lang.StringUtils.ordinalIndexOf("aaaaaaaaaa...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH ", "HI!", 89);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05739");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.split("!IHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String[] strArray7 = org.apache.commons.lang.StringUtils.split("hi!", '4');
        java.lang.String str11 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray7, "   HI!    ", 0, (int) (byte) 1);
        int int12 = org.apache.commons.lang.StringUtils.lastIndexOfAny("aaaaaaaaaaaaaaaaaaaaaaaaa!ih       hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!H", strArray7);
        java.lang.String str13 = org.apache.commons.lang.StringUtils.replaceEachRepeatedly("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!    ", strArray3, strArray7);
        boolean boolean14 = org.apache.commons.lang.StringUtils.startsWithAny("aaaaaaaaaa...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "!IHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 128 + "'", int12 == 128);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!    " + "'", str13, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!    ");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test05740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05740");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitByCharacterType("Hi!hi!hi!h                                                                                    ...");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray1, "IH", 83, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 83 out of bounds for length 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "H", "i", "!", "hi", "!", "hi", "!", "h", "                                                                                    ", "..." });
    }

    @Test
    public void test05741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05741");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsNone("                                                                      ", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test05742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05742");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOf("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!        ", "", 953);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test05743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05743");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.rightPad("444444444", 27);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444                  " + "'", str2, "444444444                  ");
    }

    @Test
    public void test05744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05744");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray2, "aaaaaaaaaa");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray2, "                                                                       aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA..", (int) '#', 83);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test05745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05745");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.rightPad("...AAAAAAAAAAAAAAAAAAAAAAAAAAAAA", (int) (byte) 0, "ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!i    !ih   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  hi!aaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...AAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str3, "...AAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test05746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05746");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOf("                                                      HI!                            ", "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaa", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05747");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsAny("       hi!#########################       hi!###################################################IHh                                                                                                                                                                                                                                       ", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   !hi!hi!hi!hi!hi!hi                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test05748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05748");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeStart("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "hi!                      aaa                         ...aaaaaaaaaaaaaa############################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test05749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05749");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBeforeLast("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa...IH!I...Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str2, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test05750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05750");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", "aAaaaaaaaaaaaaa################################IHh!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih", 25);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" });
    }

    @Test
    public void test05751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05751");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.abbreviate("aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaa", 88, 20);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...AAAAAAAAAAAAAA..." + "'", str3, "...AAAAAAAAAAAAAA...");
    }

    @Test
    public void test05752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05752");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.leftPad("                                                 hi!                      ...h                                                  ", 171);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                            hi!                      ...h                                                  " + "'", str2, "                                                                                            hi!                      ...h                                                  ");
    }

    @Test
    public void test05753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05753");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.remove("Hi!                                hi!                                hi!                                hi!                                hi!                                hi!                                hi!                                hi!                                hi!                                hi!                        ", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!                                hi!                                hi!                                hi!                                hi!                                hi!                                hi!                                hi!                                hi!                                hi!                        " + "'", str2, "Hi!                                hi!                                hi!                                hi!                                hi!                                hi!                                hi!                                hi!                                hi!                                hi!                        ");
    }

    @Test
    public void test05754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05754");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.rightPad("hi!#########################       hi!####        H       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa", 276, "                     hi!                      ...hihi!                      ...!              ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!#########################       hi!####        H       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "hi!#########################       hi!####        H       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test05755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05755");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphanumeric("!!!HHHHHHH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05756");
        int int1 = org.apache.commons.lang.StringUtils.length("                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                                  HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 314 + "'", int1 == 314);
    }

    @Test
    public void test05757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05757");
        int int3 = org.apache.commons.lang.StringUtils.indexOf("", '#', 43);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05758");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.split("       hi!#########################", '4');
        int int4 = org.apache.commons.lang.StringUtils.indexOfAny("HI!", strArray3);
        java.lang.String str6 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray3, "!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "       hi!#########################" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "       hi!#########################" + "'", str6, "       hi!#########################");
    }

    @Test
    public void test05759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05759");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("a4444444444444444444444444444444444");
        int int3 = org.apache.commons.lang.StringUtils.indexOfAny("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "a4444444444444444444444444444444444" });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05760");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replace("       hi!                      ...hihi!                      ...!", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaA...I!HI...aaaaaaaaaaaaaaaaaaaaaaaaaaaaA", "                                                        !IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       hi!                      ...hihi!                      ...!" + "'", str3, "       hi!                      ...hihi!                      ...!");
    }

    @Test
    public void test05761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05761");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.rightPad("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", 84, "a...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa." + "'", str3, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.");
    }

    @Test
    public void test05762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05762");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang.StringUtils.lowerCase("i!                      ...", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05763");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeEnd("I!AAAAAAAAAAAAAAAAAAAAAAAAA", "       hi!#########################       hi!###################################################IHh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!AAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "I!AAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test05764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05764");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.left("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05765");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNumericSpace("Hi!aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05766");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.chop("444HI!4444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444HI!444" + "'", str1, "444HI!444");
    }

    @Test
    public void test05767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05767");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphanumericSpace("                                                                                                                                                                                                                      !IHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05768");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang.StringUtils.upperCase("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05769");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.split("", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) (short) 100);
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05770");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeEnd("aaaaaaaaaaaaaa################################ih", "aaaaaaaaaaaaaaa aaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaa################################ih" + "'", str2, "aaaaaaaaaaaaaa################################ih");
    }

    @Test
    public void test05771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05771");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitByCharacterType("aaaaaaaaaaaaaaaaaaaaaaaaa!ih       hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!H");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test05772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05772");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.substring("aaaaaaaaaa...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH ", 60, 60);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test05773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05773");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphanumeric("aaaaaaa...aaaaaaaa...aaaaaaaa..                   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!hi!                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05774");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsNone("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                      ", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!    i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h!IH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05775");
        boolean boolean2 = org.apache.commons.lang.StringUtils.contains("hI!                      AAA", '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05776");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringAfter("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", "hi!                      ...h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05777");
        int int2 = org.apache.commons.lang.StringUtils.indexOf("############aaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...AAAAAAAAAAAAAAAAAAAAAAAAAAAAA...", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test05778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05778");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.leftPad("                                                    hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!aaaaaaaaaa", 60, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                    hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!aaaaaaaaaa" + "'", str3, "                                                    hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!aaaaaaaaaa");
    }

    @Test
    public void test05779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05779");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.rightPad("   HI!       ...aaaaaaaaaaaaaa##########################...   HI!             #####", 214);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   HI!       ...aaaaaaaaaaaaaa##########################...   HI!             #####                                                                                                                                   " + "'", str2, "   HI!       ...aaaaaaaaaaaaaa##########################...   HI!             #####                                                                                                                                   ");
    }

    @Test
    public void test05780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05780");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeStart("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH", " ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH" + "'", str2, "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH");
    }

    @Test
    public void test05781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05781");
        int int2 = org.apache.commons.lang.StringUtils.indexOfAny("    !!aaaaaaaaaaaaaaaaaaaaaaaaaH   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa", " !ih                                                 !ih");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test05782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05782");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isBlank((java.lang.CharSequence) "          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test05783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05783");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.substringsBetween("4444444444444444                                                          aaaaaaaaaa ...hi!###################", "hi!                      ...################                                                    aaaaaaaaaa################hi!                      ...################                                                    aaaaaaaaaa################hi!                      ...", "HHh!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test05784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05784");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.repeat("aaaaaaaaaaaaaaaaaaaaaa", 19);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test05785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05785");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replace("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ", "Hi!aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa..." + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
    }

    @Test
    public void test05786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05786");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.defaultString("", "            aaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05787");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.replace("###################...   HI!             ######444444444", "                     aaaaa aaaaaaaaaaaaaaaa", "!IH!IH!IH!...", 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "###################...   HI!             ######444444444" + "'", str4, "###################...   HI!             ######444444444");
    }

    @Test
    public void test05788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05788");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringAfterLast("...                                                        ...", "...                                             ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05789");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBefore("", " ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05790");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.rightPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA               haaa                      !ih                                         haaa                      !ih                                         haaa                      !ih                                         ", 265);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA               haaa                      !ih                                         haaa                      !ih                                         haaa                      !ih                                         " + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA               haaa                      !ih                                         haaa                      !ih                                         haaa                      !ih                                         ");
    }

    @Test
    public void test05791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05791");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOf("hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa", 'a', 276);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 276 + "'", int3 == 276);
    }

    @Test
    public void test05792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05792");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNumericSpace("                                         hi                       ...h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05793");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBefore("        HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H  hi HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H  !        HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H  hi HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H  !      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   HI!            HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H  hi HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H  !        HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H  hi HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H  !       ", "!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H  hi HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H  !        HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H  hi HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H  !      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   HI!            HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H  hi HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H  !        HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H  hi HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H  !       " + "'", str2, "        HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H  hi HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H  !        HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H  hi HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H  !      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   HI!            HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H  hi HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H  !        HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H  hi HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H  !       ");
    }

    @Test
    public void test05794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05794");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.capitalize("                                              hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                              hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!" + "'", str1, "                                              hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!");
    }

    @Test
    public void test05795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05795");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.rightPad("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 9, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test05796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05796");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAH", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!    ", (int) (byte) 1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAH" });
    }

    @Test
    public void test05797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05797");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.stripToEmpty(" hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h" + "'", str1, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
    }

    @Test
    public void test05798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05798");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.stripStart("aaaaaaaaaaaaaaaaaaaaaaaaaaaaa       hi!#########################       hi!###################################################IH", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa       hi!#########################       hi!###################################################IH" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa       hi!#########################       hi!###################################################IH");
    }

    @Test
    public void test05799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05799");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.center("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa !IH", 5, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa !IH" + "'", str3, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa !IH");
    }

    @Test
    public void test05800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05800");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.abbreviate("!...!ihih...!ih", 34);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!...!ihih...!ih" + "'", str2, "!...!ihih...!ih");
    }

    @Test
    public void test05801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05801");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOf("aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!    ", ' ', 121);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 96 + "'", int3 == 96);
    }

    @Test
    public void test05802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05802");
        boolean boolean2 = org.apache.commons.lang.StringUtils.equalsIgnoreCase("", "I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05803");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBefore("                                                        !IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!", "                                              Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   HI!    Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   HI!    Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   HI!    hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                        !IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!" + "'", str2, "                                                        !IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!");
    }

    @Test
    public void test05804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05804");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.capitalize("H                                                             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H                                                             " + "'", str1, "H                                                             ");
    }

    @Test
    public void test05805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05805");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isBlank((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05806");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.stripToNull("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!" + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!");
    }

    @Test
    public void test05807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05807");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("...IH!I...", "                         ", 99);
        java.lang.String str7 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray3, 'a', 119, (int) 'a');
        java.lang.Class<?> wildcardClass8 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "...IH!I..." });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test05808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05808");
        int int2 = org.apache.commons.lang.StringUtils.lastIndexOf("H!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05809");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.leftPad("4444444hi!#########################", 70);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                   4444444hi!#########################" + "'", str2, "                                   4444444hi!#########################");
    }

    @Test
    public void test05810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05810");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.replace("###################################################################################################", "aaaaaaaaaaaaaa################################IHh", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA               haaa                      !ih                                         haaa                      !ih                                         haaa                      !ih                                         ", 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "###################################################################################################" + "'", str4, "###################################################################################################");
    }

    @Test
    public void test05811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05811");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNumericSpace("aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05812");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "");
        java.lang.String[] strArray6 = org.apache.commons.lang.StringUtils.stripAll(strArray4, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        int int7 = org.apache.commons.lang.StringUtils.lastIndexOfAny("                                       aaaaaaaaaa", strArray4);
        int int8 = org.apache.commons.lang.StringUtils.indexOfAny("Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", strArray4);
        int int9 = org.apache.commons.lang.StringUtils.indexOfDifference(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test05813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05813");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.chomp("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI################################IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI################################IH" + "'", str1, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI################################IH");
    }

    @Test
    public void test05814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05814");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsOnly("aaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   HI!       ", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05815");
        boolean boolean2 = org.apache.commons.lang.StringUtils.endsWithIgnoreCase("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!", "        H");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05816");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.defaultString("aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA..H!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!...aaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA..H!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih" + "'", str2, "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA..H!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
    }

    @Test
    public void test05817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05817");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.rightPad("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!...", 1, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!..." + "'", str3, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!...");
    }

    @Test
    public void test05818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05818");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("                                aaaaaaaaaa", '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                aaaaaaaaaa" });
    }

    @Test
    public void test05819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05819");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.overlay(" hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h  ", "!!!HHHHHHH", 229, 520);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + " hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h  !!!HHHHHHH" + "'", str4, " hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h  !!!HHHHHHH");
    }

    @Test
    public void test05820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05820");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphanumeric("444444444                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05821");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.leftPad("hi!                      ...hihi!        ", 13, "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!                      ...hihi!        " + "'", str3, "hi!                      ...hihi!        ");
    }

    @Test
    public void test05822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05822");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.substringsBetween("aaaaaaaaaaaaaa################################ih", "", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaA...I!HI...aaaaaaaaaaaaaaaaaaaaaaaaaaaaA");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test05823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05823");
        int int2 = org.apache.commons.lang.StringUtils.countMatches("...aaaa...", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA     HI !     ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test05824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05824");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.defaultString("I!                      ...", "4444444444444444                                                          aaaaaaaaaa ...hi!###################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!                      ..." + "'", str2, "I!                      ...");
    }

    @Test
    public void test05825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05825");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang.StringUtils.lowerCase("aaaaaaaaaa                                                                                          ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05826");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.remove("                                                                      ", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                      " + "'", str2, "                                                                      ");
    }

    @Test
    public void test05827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05827");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.remove("i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "                      ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h" + "'", str2, "i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
    }

    @Test
    public void test05828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05828");
        int int2 = org.apache.commons.lang.StringUtils.lastIndexOf("I!AAAAAAAAAAAAAAAAAAAAAAAAA", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05829");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang.StringUtils.lowerCase("hi!aaaaaaaaaaaaaaaaaaaaaaaaa", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05830");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.leftPad("                                                                                                                       ", 0, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                       " + "'", str3, "                                                                                                                       ");
    }

    @Test
    public void test05831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05831");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.capitalize("aaaaaaaaaaaaaaaaaaaaaaaaaaaaa   HI!   a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa   HI!   a" + "'", str1, "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa   HI!   a");
    }

    @Test
    public void test05832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05832");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.split("hi!                      ...hihi!        ", "Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        int int4 = org.apache.commons.lang.StringUtils.indexOfAny("!HI!HI!H  ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                      ...", "        " });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test05833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05833");
        int int3 = org.apache.commons.lang.StringUtils.indexOf("                                                                                                    ", '4', 17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05834");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.substringsBetween("#########################aihHHHHHHH#########################aihHHHHHHH#########################aihHHHHHHH#########################aihHHHHHHH#########################aihHHHHHHH#########################aihHHHHHHH#########################aihHHHHHHH#########################aihHHHHHHH#########################aih", "                                      ###", "ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test05835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05835");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.chop("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test05836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05836");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.reverse("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                     hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!IH!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih                                                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "!IH!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih                                                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test05837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05837");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.swapCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI" + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI");
    }

    @Test
    public void test05838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05838");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphanumericSpace("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05839");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isEmpty((java.lang.CharSequence) "                                                                                                                                                                     !IHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05840");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trimToNull("                     hi!                      ...hihi!                      ...!              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!                      ...hihi!                      ...!" + "'", str1, "hi!                      ...hihi!                      ...!");
    }

    @Test
    public void test05841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05841");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsOnly("", "i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h                ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test05842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05842");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBeforeLast("!", "                                                                                                                                                                                                                                                       I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!" + "'", str2, "!");
    }

    @Test
    public void test05843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05843");
        int int2 = org.apache.commons.lang.StringUtils.indexOf("hi!                                hi!                                hi!                                hi!                                hi!                                hi!                                hi!                                hi!                                hi!                                hi!                        ", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05844");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                    ", "Hi!hi!hi!h                                                                                    ...", (int) (short) 10);
        int int5 = org.apache.commons.lang.StringUtils.lastIndexOfAny("...AAAAAAAAAAAAAAAAAAAAAAAAAAAAA.", strArray4);
        int int6 = org.apache.commons.lang.StringUtils.indexOfDifference(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "                                                    " });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test05845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05845");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOf("                                                    ", ' ', 16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
    }

    @Test
    public void test05846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05846");
        boolean boolean2 = org.apache.commons.lang.StringUtils.equals("hi!                      aaa                         ...aaaaaaaaaaaaaa############################", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05847");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang.StringUtils.lowerCase("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hI", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05848");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.leftPad("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 42, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test05849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05849");
        boolean boolean2 = org.apache.commons.lang.StringUtils.equals("i!                      ...", "Aaaaaaaaaaaaaa################################IHhAaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05850");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.center("", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05851");
        char[] charArray10 = new char[] { '#', 'a', 'a', ' ' };
        boolean boolean11 = org.apache.commons.lang.StringUtils.containsAny("", charArray10);
        boolean boolean12 = org.apache.commons.lang.StringUtils.containsOnly("aaaaaaaaaa                                                                                          ", charArray10);
        boolean boolean13 = org.apache.commons.lang.StringUtils.containsNone("", charArray10);
        int int14 = org.apache.commons.lang.StringUtils.indexOfAnyBut("!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!i", charArray10);
        int int15 = org.apache.commons.lang.StringUtils.indexOfAny("i!#########################", charArray10);
        int int16 = org.apache.commons.lang.StringUtils.indexOfAnyBut("                                                                                                 HI!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '#', 'a', 'a', ' ' });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test05852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05852");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.stripToEmpty("IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH" + "'", str1, "IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH");
    }

    @Test
    public void test05853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05853");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isWhitespace("aaaaaaaaaaaaaaaaaaaaaaaaaaaaA...I!HI...aaaaaaaaaaaaaaaaaaaaaaaaaaaaA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05854");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.stripToNull("A   HI!    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A   HI!" + "'", str1, "A   HI!");
    }

    @Test
    public void test05855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05855");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("   HI!    ", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI", 35);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "   HI!    " });
    }

    @Test
    public void test05856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05856");
        int int2 = org.apache.commons.lang.StringUtils.lastIndexOf("", "       HI!                 HI!                 HI!         ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05857");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.strip("aaaaaaaaaaaaaaaaaaaaaaaaa!ih       hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!H", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaa!ih       hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaa!ih       hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
    }

    @Test
    public void test05858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05858");
        int int2 = org.apache.commons.lang.StringUtils.indexOf("                                                 ..", "!!!HHHHHHH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05859");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeEnd("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "a...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test05860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05860");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.mid("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) (short) 1, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test05861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05861");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.center("#########################!ih       #########################!ih       #haaAAAAAAAAAAAAAAAAAAAAAAaaa#########################!ih       #########################!ih       ##", (int) (byte) 0, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   HI!    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#########################!ih       #########################!ih       #haaAAAAAAAAAAAAAAAAAAAAAAaaa#########################!ih       #########################!ih       ##" + "'", str3, "#########################!ih       #########################!ih       #haaAAAAAAAAAAAAAAAAAAAAAAaaa#########################!ih       #########################!ih       ##");
    }

    @Test
    public void test05862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05862");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.stripEnd("                   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!hi!                    ", "H        ####!ih       #########################!ihH        ####!ih       #########################!ihH        ####!ih       #########################!ihH        ####!ih       #########################!ihH        ####!ih       #########################!ihH        ####!ih       #########################!ihH        ####!ih       #########################!ihH        ####!ih       #########################!ihH        ####!ih       #########################!ihH        ####!ih       #########################!ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI" + "'", str2, "                   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
    }

    @Test
    public void test05863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05863");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substring("", 520);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05864");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphanumericSpace("hi!                      ...hihi!                      ...!         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05865");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!                      ...h", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!                      ...h" });
    }

    @Test
    public void test05866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05866");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlpha("######");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05867");
        boolean boolean2 = org.apache.commons.lang.StringUtils.equalsIgnoreCase("i!#########################", "..H!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05868");
        int int2 = org.apache.commons.lang.StringUtils.indexOfDifference("i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h                ", "aaaaaaaaaa                                      ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test05869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05869");
        java.lang.String[] strArray5 = org.apache.commons.lang.StringUtils.split("hi!", '4');
        java.lang.String str9 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray5, 'a', (int) '#', 1);
        java.lang.String str11 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray5, "   HI!    ");
        java.lang.String[] strArray13 = org.apache.commons.lang.StringUtils.stripAll(strArray5, "################################");
        java.lang.String str15 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray5, "");
        boolean boolean16 = org.apache.commons.lang.StringUtils.startsWithAny("A   HI!    hi!", strArray5);
        boolean boolean17 = org.apache.commons.lang.StringUtils.startsWithAny("                     hi!                      ...hihi!                      ...!              ", strArray5);
        int int18 = org.apache.commons.lang.StringUtils.lastIndexOfAny("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   hi!        ", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 83 + "'", int18 == 83);
    }

    @Test
    public void test05870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05870");
        int int3 = org.apache.commons.lang.StringUtils.ordinalIndexOf("!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", "       hi!", 70);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05871");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsIgnoreCase("444HI!444", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05872");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("HI", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!", (int) (byte) -1);
        java.lang.String str4 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "", "" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test05873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05873");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.right("...                                                        ...", 83);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...                                                        ..." + "'", str2, "...                                                        ...");
    }

    @Test
    public void test05874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05874");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trim("I!                      ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I!                      ..." + "'", str1, "I!                      ...");
    }

    @Test
    public void test05875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05875");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("###", "!aaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "###" });
    }

    @Test
    public void test05876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05876");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.uncapitalize("...AAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...AAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "...AAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test05877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05877");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.chomp("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA444" + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA444");
    }

    @Test
    public void test05878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05878");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" });
    }

    @Test
    public void test05879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05879");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.leftPad("aaaaaa", 68);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                              aaaaaa" + "'", str2, "                                                              aaaaaa");
    }

    @Test
    public void test05880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05880");
        int int3 = org.apache.commons.lang.StringUtils.indexOf("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa !IH", "aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaa", 24);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05881");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.capitalize("aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!    ###");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!    ###" + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!    ###");
    }

    @Test
    public void test05882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05882");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOf("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA     HI !     ", '4', 29);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05883");
        int int1 = org.apache.commons.lang.StringUtils.length("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 38 + "'", int1 == 38);
    }

    @Test
    public void test05884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05884");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trimToEmpty("                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test05885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05885");
        int int2 = org.apache.commons.lang.StringUtils.lastIndexOf("I", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05886");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!    ", "HA...                                                                                                                    ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!    " });
    }

    @Test
    public void test05887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05887");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.split("aaaaaaaaaa                                                                                          ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "aaaaaaaaaa" });
    }

    @Test
    public void test05888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05888");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isEmpty((java.lang.CharSequence) "A...                                                             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05889");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByCharacterTypeCamelCase("       hi!");
        java.lang.String str5 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray3, "hi!                      ...");
        int int6 = org.apache.commons.lang.StringUtils.indexOfAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaa       hi!#########################       hi!###################################################IHh", strArray3);
        java.lang.String str7 = org.apache.commons.lang.StringUtils.getCommonPrefix(strArray3);
        java.lang.String[] strArray10 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!#########################", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang.StringUtils.replaceEach("   HI!    aaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   HI!", strArray3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 3 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "       ", "hi", "!" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "       hi!                      ...hihi!                      ...!" + "'", str5, "       hi!                      ...hihi!                      ...!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 29 + "'", int6 == 29);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!#########################" });
    }

    @Test
    public void test05890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05890");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang.StringUtils.lowerCase("#########################aihHHHHHHH#########################aihHHHHHHH#########################aihHHHHHHH#########################aihHHHHHHH#########################aihHHHHHHH#########################aihHHHHHHH#########################aihHHHHHHH#########################aihHHHHHHH#########################aih", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05891");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitByCharacterType("                                                                                          ");
        int int2 = org.apache.commons.lang.StringUtils.indexOfDifference(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "                                                                                          " });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05892");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.remove("                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                                  HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 ", " aaah");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                                  HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 " + "'", str2, "                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                                  HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 ");
    }

    @Test
    public void test05893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05893");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.left("A   HI!", 9);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A   HI!" + "'", str2, "A   HI!");
    }

    @Test
    public void test05894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05894");
        boolean boolean2 = org.apache.commons.lang.StringUtils.startsWithIgnoreCase("                                                                                                    ", "       hi!#########################       hi!###################################################IHh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05895");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitByCharacterTypeCamelCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.getCommonPrefix(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "   ", "hi", "!" });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05896");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.replace("i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "    I!   ", "", 84);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h" + "'", str4, "i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
    }

    @Test
    public void test05897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05897");
        boolean boolean2 = org.apache.commons.lang.StringUtils.startsWith("", "...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05898");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphanumeric("aAaaaaaaaaaaaaa################################IHh!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05899");
        boolean boolean2 = org.apache.commons.lang.StringUtils.startsWith("HHHHHH", "I");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05900");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isEmpty((java.lang.CharSequence) "                                                                          aaaaaaaaaa     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05901");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.chomp("#####AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa !IH######");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#####AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa !IH######" + "'", str1, "#####AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa !IH######");
    }

    @Test
    public void test05902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05902");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.rightPad("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa !IH", (int) (byte) 0, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa !IH" + "'", str3, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa !IH");
    }

    @Test
    public void test05903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05903");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.split("   HI!   ", "H");
        int int4 = org.apache.commons.lang.StringUtils.indexOfAny("                                              ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "   ", "I!   " });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test05904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05904");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isEmpty((java.lang.CharSequence) "hi!                      aaa                         ...aaaaaaaaaaaaaa#############################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05905");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.difference("                                                                          aaaaaaaaaa", "I!HI!HI!HI!HI!HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!HI!HI!HI!HI!HI" + "'", str2, "I!HI!HI!HI!HI!HI");
    }

    @Test
    public void test05906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05906");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "");
        java.lang.String[] strArray6 = org.apache.commons.lang.StringUtils.stripAll(strArray4, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        boolean boolean7 = org.apache.commons.lang.StringUtils.startsWithAny("aaaaaaaaaaaaaaa aaaaaaaaaaaaaaaa", strArray6);
        java.lang.String[] strArray10 = org.apache.commons.lang.StringUtils.splitByCharacterTypeCamelCase("                                                    ");
        boolean boolean11 = org.apache.commons.lang.StringUtils.startsWithAny("                                                    aaaaaaaaaa", strArray10);
        java.lang.String str12 = org.apache.commons.lang.StringUtils.replaceEachRepeatedly("       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaa...", strArray6, strArray10);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "                                                    " });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaa..." + "'", str12, "       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaa...");
    }

    @Test
    public void test05907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05907");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.upperCase("aaaaaaa...aaaaaaaa...aaaaaaaa..                   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!hi!                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAA...AAAAAAAA...AAAAAAAA..                   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                    " + "'", str1, "AAAAAAA...AAAAAAAA...AAAAAAAA..                   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                    ");
    }

    @Test
    public void test05908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05908");
        boolean boolean2 = org.apache.commons.lang.StringUtils.contains("...                     aA...", "hi!aaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05909");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.center("                                       aaaaaaaaaa", 86);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                         aaaaaaaaaa                   " + "'", str2, "                                                         aaaaaaaaaa                   ");
    }

    @Test
    public void test05910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05910");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.split("                                                          aaaaaaaaaa");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray1, 'a');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "aaaaaaaaaa" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaa" + "'", str3, "aaaaaaaaaa");
    }

    @Test
    public void test05911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05911");
        boolean boolean2 = org.apache.commons.lang.StringUtils.equals("hi!", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05912");
        char[] charArray1 = null;
        int int2 = org.apache.commons.lang.StringUtils.indexOfAny("hi!                      aaah", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05913");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.swapCase("############aaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "############AAAAAAA...AAAAAAAA...AAAAAAAA...AAAAAAAA...AAAAAAAA...AAAAAAAA...AAAAAAAA...AAAAAAAA...AAAAAAAA...AAAAAAAA..." + "'", str1, "############AAAAAAA...AAAAAAAA...AAAAAAAA...AAAAAAAA...AAAAAAAA...AAAAAAAA...AAAAAAAA...AAAAAAAA...AAAAAAAA...AAAAAAAA...");
    }

    @Test
    public void test05914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05914");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNumeric("i!       ####################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05915");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringAfterLast("                                                                          aaaaaaaaaa", "AAAAAAAAAAAAAA################################IHH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05916");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang.StringUtils.abbreviate("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!", 2, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05917");
        int int3 = org.apache.commons.lang.StringUtils.indexOf("                                         hi                       ...h", "AAAAAAAAAAAAAAAAAAAAAAA...", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05918");
        char[] charArray15 = new char[] { '#', 'a', 'a', ' ' };
        boolean boolean16 = org.apache.commons.lang.StringUtils.containsAny("", charArray15);
        int int17 = org.apache.commons.lang.StringUtils.indexOfAnyBut("                                                    ", charArray15);
        boolean boolean18 = org.apache.commons.lang.StringUtils.containsAny("HI!", charArray15);
        boolean boolean19 = org.apache.commons.lang.StringUtils.containsNone("                                                   ", charArray15);
        boolean boolean20 = org.apache.commons.lang.StringUtils.containsAny("                                                                                                    ", charArray15);
        boolean boolean21 = org.apache.commons.lang.StringUtils.containsOnly("                                                                                       ...", charArray15);
        int int22 = org.apache.commons.lang.StringUtils.indexOfAny("aaaaaaaaaa                                                                                                          ...", charArray15);
        boolean boolean23 = org.apache.commons.lang.StringUtils.containsOnly("...       ", charArray15);
        boolean boolean24 = org.apache.commons.lang.StringUtils.containsAny("          ", charArray15);
        boolean boolean25 = org.apache.commons.lang.StringUtils.containsAny("hi!", charArray15);
        int int26 = org.apache.commons.lang.StringUtils.indexOfAny("A...                                                              ", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '#', 'a', 'a', ' ' });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
    }

    @Test
    public void test05919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05919");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.chop("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI" + "'", str1, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
    }

    @Test
    public void test05920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05920");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isBlank((java.lang.CharSequence) "               I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05921");
        int int1 = org.apache.commons.lang.StringUtils.length("################################IHh");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 35 + "'", int1 == 35);
    }

    @Test
    public void test05922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05922");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceChars("444HI!444", ' ', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444HI!444" + "'", str3, "444HI!444");
    }

    @Test
    public void test05923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05923");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.remove("                         !ih                                                 !ih                   ", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                         !ih                                                 !ih                   " + "'", str2, "                         !ih                                                 !ih                   ");
    }

    @Test
    public void test05924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05924");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.rightPad("", 26);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                          " + "'", str2, "                          ");
    }

    @Test
    public void test05925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05925");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!    ", "##########                                                                                          ");
        int int4 = org.apache.commons.lang.StringUtils.lastIndexOfAny(" hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h  ", strArray3);
        java.lang.String str6 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray3, '#');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!    " });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!    " + "'", str6, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!    ");
    }

    @Test
    public void test05926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05926");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsNone("                                                                    ", "       ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05927");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.leftPad("#####       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################", 100, "444HI!444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#####       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################" + "'", str3, "#####       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################");
    }

    @Test
    public void test05928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05928");
        boolean boolean2 = org.apache.commons.lang.StringUtils.startsWith("                                                                                                             aaaaaaa..", "                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test05929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05929");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.left("####IHH", 52);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "####IHH" + "'", str2, "####IHH");
    }

    @Test
    public void test05930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05930");
        int int2 = org.apache.commons.lang.StringUtils.countMatches("hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!                 hi!", "                                                                                                                                     ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test05931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05931");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceOnce("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...", "aaaaaaa...hi!#########################       hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hI");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI..." + "'", str3, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...");
    }

    @Test
    public void test05932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05932");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBetween("444444444444                       ...444444444444", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   !hi!hi!hi!hi!hi!hi                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test05933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05933");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih       hi!aaaaaaaaaaaaaaaaaaaaaaaaa", "Aaaaaaaaaaaaaa################################IHhAaaaaaaaaaaaaa################################IHhAaaaaaaaaaaaaa################################IHhAaaaaaaaaaaaaa################################IHhAaaaaaaaaaaaaa################################IHhAaaaaaaaaaaaaa################################IHhAaaaaaaaaaaaaa################################IHhAaaaaaaaaaaaaa################################IHhAaaaaaaaaaaaaa################################IHhAaaaaaaaaaaaaa###############                             Aaaaaaaaaaaaaa################################IHhAaaaaaaaaaaaaa################################IHhAaaaaaaaaaaaaa################################IHhAaaaaaaaaaaaaa################################IHhAaaaaaaaaaaaaa################################IHhAaaaaaaaaaaaaa################################IHhAaaaaaaaaaaaaa################################IHhAaaaaaaaaaaaaa################################IHhAaaaaaaaaaaaaa################################IHhAaaaaaaaaaaaaa################");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih       hi!aaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test05934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05934");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.defaultIfEmpty("aaaaaaaaaaaaaaaaaaaaaaaaaaaaa       hi!#########################       hi!###################################################IHh", "hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!########################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa       hi!#########################       hi!###################################################IHh" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa       hi!#########################       hi!###################################################IHh");
    }

    @Test
    public void test05935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05935");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.reverse("!IH!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih                                                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                     hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                     hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!");
    }

    @Test
    public void test05936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05936");
        boolean boolean2 = org.apache.commons.lang.StringUtils.startsWithIgnoreCase("444444444444444444444444444444444444444444444444                                                  44444444444   HI!       ...aaaaaaaaaaaaaa##########################...   HI!   44444444444444444444444   HI!    ", "#####       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05937");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.split("aaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   HI!       ", "...AAAAAAAAAAAAAAAAAAAAAAAAAAAAA...", 94);
        java.lang.String str5 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray3, "hi!");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   HI!       " });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "aaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   HI!       " + "'", str5, "aaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   HI!       ");
    }

    @Test
    public void test05938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05938");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.mid("i! i! i! i! i! i! i! i! i! i! i! i! i! i! i! i! i!                 ", 90, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test05939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05939");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAsciiPrintable("...       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test05940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05940");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("!IHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 'a');
        java.lang.String[] strArray6 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                                                                                 HI!");
        java.lang.String str8 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray6, 'a');
        int int9 = org.apache.commons.lang.StringUtils.indexOfDifference(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang.StringUtils.replaceEachRepeatedly("       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!", strArray3, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 98 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str8, "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test05941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05941");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.stripEnd("################################aaa", "                                                                                                                                                                                                                                                                       ..                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "################################aaa" + "'", str2, "################################aaa");
    }

    @Test
    public void test05942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05942");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trimToNull("hi!                 hi!                 hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!                 hi!                 hi!" + "'", str1, "hi!                 hi!                 hi!");
    }

    @Test
    public void test05943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05943");
        char[] charArray15 = new char[] { '#', 'a', 'a', ' ' };
        boolean boolean16 = org.apache.commons.lang.StringUtils.containsAny("", charArray15);
        int int17 = org.apache.commons.lang.StringUtils.indexOfAnyBut("                                                    ", charArray15);
        boolean boolean18 = org.apache.commons.lang.StringUtils.containsAny("HI!", charArray15);
        boolean boolean19 = org.apache.commons.lang.StringUtils.containsNone("                                                   ", charArray15);
        int int20 = org.apache.commons.lang.StringUtils.indexOfAny("HI!", charArray15);
        int int21 = org.apache.commons.lang.StringUtils.indexOfAnyBut("hi!", charArray15);
        boolean boolean22 = org.apache.commons.lang.StringUtils.containsOnly("       HI!", charArray15);
        boolean boolean23 = org.apache.commons.lang.StringUtils.containsNone("A   HI!    hi!", charArray15);
        boolean boolean24 = org.apache.commons.lang.StringUtils.containsNone("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray15);
        boolean boolean25 = org.apache.commons.lang.StringUtils.containsOnly("H", charArray15);
        int int26 = org.apache.commons.lang.StringUtils.indexOfAnyBut("                 hi!                 hi!                 hi!                                        ", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '#', 'a', 'a', ' ' });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 17 + "'", int26 == 17);
    }

    @Test
    public void test05944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05944");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.split("aaaaaaaaaaaaaaa aaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!", 43);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray3, "       hi!#########################", 48, 99);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 48 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { " " });
    }

    @Test
    public void test05945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05945");
        int int2 = org.apache.commons.lang.StringUtils.indexOf("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA..");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05946");
        int int3 = org.apache.commons.lang.StringUtils.indexOf("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHI!", "aaa", 214);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05947");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNumericSpace("####################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05948");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.substringsBetween("AAAAAAAAAAAAAAAAAAAAAAAAAAAAA       HI!#########################       HI!###################################################IHH", "!HI!HI!H  ", "hi!                      ...hihi!                      ...!         ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test05949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05949");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceChars("                                aaaaaaaaaa", "444HI!444", "   HI!       ...aaaaaaaaaaaaaa##########################...   HI!             ######");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                aaaaaaaaaa" + "'", str3, "                                aaaaaaaaaa");
    }

    @Test
    public void test05950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05950");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOf("ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih", "       hi!aaaaaaaaaaaaaaaaaaaaaaaaa", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05951");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replace("hI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!    ", "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!    ###");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H" + "'", str3, "hI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
    }

    @Test
    public void test05952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05952");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.chop("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test05953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05953");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeStartIgnoreCase("", "A...                                                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05954");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphaSpace("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!...aaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05955");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih", "                                                                                                    ");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.getCommonPrefix(strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang.StringUtils.stripAll(strArray3, "################################IHh");
        java.lang.String str7 = org.apache.commons.lang.StringUtils.getCommonPrefix(strArray6);
        int int8 = org.apache.commons.lang.StringUtils.lastIndexOfAny("", strArray6);
        java.lang.String str12 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray6, '#', 276, 4);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih" + "'", str4, "h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!i" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!i" + "'", str7, "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!i");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test05956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05956");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsNone("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.", "hi!...h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05957");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeStart("                                                                                          ", "H!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                          " + "'", str2, "                                                                                          ");
    }

    @Test
    public void test05958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05958");
        char[] charArray10 = new char[] { '#', 'a', 'a', ' ' };
        boolean boolean11 = org.apache.commons.lang.StringUtils.containsAny("", charArray10);
        boolean boolean12 = org.apache.commons.lang.StringUtils.containsOnly("aaaaaaaaaa                                                                                          ", charArray10);
        boolean boolean13 = org.apache.commons.lang.StringUtils.containsNone("", charArray10);
        int int14 = org.apache.commons.lang.StringUtils.indexOfAnyBut("                                                   ", charArray10);
        boolean boolean15 = org.apache.commons.lang.StringUtils.containsAny("HI!#########################HI!#########################HI!#########################HI!#########################HI!#########################HI!#########################HI!#########################HI!#########################HI!#########################HI!########################", charArray10);
        int int16 = org.apache.commons.lang.StringUtils.indexOfAnyBut("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '#', 'a', 'a', ' ' });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 89 + "'", int16 == 89);
    }

    @Test
    public void test05959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05959");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOf("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHI!", "i! i! aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!i! i! i", 265);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05960");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.upperCase("    !!aaaaaaaaaaaaaaaaaaaaaaaaaH   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "    !!AAAAAAAAAAAAAAAAAAAAAAAAAH   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "    !!AAAAAAAAAAAAAAAAAAAAAAAAAH   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test05961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05961");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeEnd("#########################################################################################", "i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#########################################################################################" + "'", str2, "#########################################################################################");
    }

    @Test
    public void test05962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05962");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringAfterLast("hHI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!          ", "#########################!ih       ########A...                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05963");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang.StringUtils.lowerCase("HI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaa", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05964");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trim("       !IHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!IHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!IHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!IHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!" + "'", str1, "!IHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!IHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!");
    }

    @Test
    public void test05965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05965");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphanumeric("                                                                                                                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...                                             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05966");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("HI!", 'a');
        boolean boolean5 = org.apache.commons.lang.StringUtils.startsWithAny("                                                           ", strArray4);
        int int6 = org.apache.commons.lang.StringUtils.lastIndexOfAny("aaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   HI!      ", strArray4);
        java.lang.String str7 = org.apache.commons.lang.StringUtils.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "HI!" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HI!" + "'", str7, "HI!");
    }

    @Test
    public void test05967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05967");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("444444444444444444444444444444444444444444444444                                                  ", " ");
        java.lang.String str6 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray2, "!IH   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...", 7, (int) (short) -1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "444444444444444444444444444444444444444444444444", "" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test05968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05968");
        boolean boolean2 = org.apache.commons.lang.StringUtils.startsWithIgnoreCase("##########################################################", " hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h  !!!HHHHHHH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05969");
        int int1 = org.apache.commons.lang.StringUtils.length("#################                     hi!                      ...hihi!                      ...!              #################");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 128 + "'", int1 == 128);
    }

    @Test
    public void test05970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05970");
        boolean boolean2 = org.apache.commons.lang.StringUtils.startsWith(" ... ", "AAAAAAAAAAAAAA################################IH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05971");
        int int2 = org.apache.commons.lang.StringUtils.indexOfAnyBut("", "...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05972");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsAny("aaaaaaaaaaaaaaa aaaaaaaaaaaaaaa", "H!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05973");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOf("                             ", "Aaaaaaaaaaaaaa################################IHhAaa", 56);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05974");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.stripEnd("", "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA..H!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05975");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang.StringUtils.abbreviate("                                                 ...", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05976");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.split("                                                    ", '#');
        int int4 = org.apache.commons.lang.StringUtils.lastIndexOfAny("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang.StringUtils.stripAll(strArray3, "   hi!");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                                    " });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "" });
    }

    @Test
    public void test05977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05977");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.overlay("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH", "      ", (int) (short) 10, 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "!IH!      IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH" + "'", str4, "!IH!      IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH");
    }

    @Test
    public void test05978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05978");
        java.lang.String[] strArray0 = null;
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.stripAll(strArray0, "!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNull(strArray2);
    }

    @Test
    public void test05979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05979");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.center("                         !ih                                                 !ih                   ", 13, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                         !ih                                                 !ih                   " + "'", str3, "                         !ih                                                 !ih                   ");
    }

    @Test
    public void test05980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05980");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNotEmpty((java.lang.CharSequence) " aaah");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test05981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05981");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!i", "!IH!IH!IH!                                                                                    ...", 56);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!i" });
    }

    @Test
    public void test05982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05982");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.rightPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!", 6, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!");
    }

    @Test
    public void test05983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05983");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringAfterLast("hi!aaa", "...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05984");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang.StringUtils.lowerCase("i!                      ...44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05985");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("HI!", "                                                                                    ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray2, '4', 2, 33);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HI!" });
    }

    @Test
    public void test05986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05986");
        int int2 = org.apache.commons.lang.StringUtils.indexOfAnyBut("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", "hi!             ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test05987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05987");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.replace("...                                                                                    h!ih!ih!iH", "H                                                             ", "aaaaa aaaaaaaaaaaaaaaa", 253);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "...                                                                                    h!ih!ih!iH" + "'", str4, "...                                                                                    h!ih!ih!iH");
    }

    @Test
    public void test05988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05988");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.stripEnd("                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!          ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!          " + "'", str2, "                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!          ");
    }

    @Test
    public void test05989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05989");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.reverseDelimited("###################...   HI!             ######444444444", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###################...   HI!             ######" + "'", str2, "###################...   HI!             ######");
    }

    @Test
    public void test05990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05990");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.left("###########################################################################################################!IH!IH!IH!                                                                                    ...###########################################################################################################", 49);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#################################################" + "'", str2, "#################################################");
    }

    @Test
    public void test05991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05991");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.reverse("hi!                      ...h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h...                      !ih" + "'", str1, "h...                      !ih");
    }

    @Test
    public void test05992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05992");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.left("                                aaaaaaaaaa", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " " + "'", str2, " ");
    }

    @Test
    public void test05993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05993");
        boolean boolean2 = org.apache.commons.lang.StringUtils.startsWithIgnoreCase("44444444444   HI!       ...aaaaaaaaaaaaaa##########################...   HI!   444444444444", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05994");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("i!#########################", "                                                                          aaaaaaaaaa     ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "i!#########################" });
    }

    @Test
    public void test05995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05995");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("i!...", "...                                                                   ", 2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "i!..." });
    }

    @Test
    public void test05996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05996");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBefore("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!", "hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!");
    }

    @Test
    public void test05997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05997");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.chomp("HI!                      AAA       ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!                      AAA       " + "'", str2, "HI!                      AAA       ");
    }

    @Test
    public void test05998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05998");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsNone("aaaAaaaHI!aaaa                                                                                           ", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA     HI !     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05999");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                   ", "HI!");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.getCommonPrefix(strArray2);
        java.lang.String str5 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray2, "aaa");
        java.lang.String str6 = org.apache.commons.lang.StringUtils.getCommonPrefix(strArray2);
        java.lang.String str7 = org.apache.commons.lang.StringUtils.getCommonPrefix(strArray2);
        java.lang.String str8 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                   " });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                   " + "'", str3, "                                                   ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                                                   " + "'", str5, "                                                   ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "                                                   " + "'", str6, "                                                   ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                                   " + "'", str7, "                                                   ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "                                                   " + "'", str8, "                                                   ");
    }

    @Test
    public void test06000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test06000");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.strip("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa..." + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
    }
}

