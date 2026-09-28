package org.apache.commons.lang;

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
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOf("aaaaaaa...hi!#########################       hi!                                 ", "", 56);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 56 + "'", int3 == 56);
    }

    @Test
    public void test10502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10502");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.difference("#####", "       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!" + "'", str2, "       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!");
    }

    @Test
    public void test10503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10503");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("HI!                      AAA       ", "aAAAAAHi!hi!hi!h...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!    ###", 311);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "HI!                      AAA       " });
    }

    @Test
    public void test10504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10504");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAllUpperCase("   hi!a                                                                                                                                                                                                                                                                                                                                                                               a...a                                                                                                                                                                                                                                                                                                                                                                               HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10505");
        boolean boolean2 = org.apache.commons.lang.StringUtils.equalsIgnoreCase("HI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaa", "#########################!ih       #########################!ih       #########################!ih       #########################!ih       #########################!ih       #########################!ih       #########################!ih       #########################!ih       ##############");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10506");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substring("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA!IHAAAAAAAAAAAAAAAAAAAAAAA", 98);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10507");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBeforeLast("#########################!ih", "Aaaaaaaaaaaaaa################################IHh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#########################!ih" + "'", str2, "#########################!ih");
    }

    @Test
    public void test10508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10508");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH", "####################################################################################################");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH" });
    }

    @Test
    public void test10509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10509");
        int int1 = org.apache.commons.lang.StringUtils.length("...AAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27 + "'", int1 == 27);
    }

    @Test
    public void test10510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10510");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAllLowerCase("!aaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10511");
        char[] charArray8 = new char[] { '#', 'a', 'a', ' ' };
        boolean boolean9 = org.apache.commons.lang.StringUtils.containsAny("", charArray8);
        boolean boolean10 = org.apache.commons.lang.StringUtils.containsOnly("aaaaaaaaaa                                                                                          ", charArray8);
        int int11 = org.apache.commons.lang.StringUtils.indexOfAny("         hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!aa", charArray8);
        int int12 = org.apache.commons.lang.StringUtils.indexOfAny(" hi!   hi!   hi!   hi!   hi!   hi!   hi!   hi!   hi!   hi!   hi!   hi!   hi!   hi!   hi!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '#', 'a', 'a', ' ' });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test10512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10512");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ", "          ");
        int int4 = org.apache.commons.lang.StringUtils.indexOfAny("                                                          aaaaaaaaaa", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "         " });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test10513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10513");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.center("                                                                   ", 17);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                   " + "'", str2, "                                                                   ");
    }

    @Test
    public void test10514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10514");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.chomp("################################IHh", "                                                              AAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "################################IHh" + "'", str2, "################################IHh");
    }

    @Test
    public void test10515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10515");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replace("aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!", "!ih ...hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaa", "aaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   HI!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!" + "'", str3, "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!");
    }

    @Test
    public void test10516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10516");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isEmpty((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHi!                      aaah");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10517");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "#################              !...                      !ihih...                      !ih                     #################");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
    }

    @Test
    public void test10518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10518");
        boolean boolean2 = org.apache.commons.lang.StringUtils.contains("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!", ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test10519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10519");
        boolean boolean2 = org.apache.commons.lang.StringUtils.startsWith("#########################!ih       ########A...                     ", "A   HI!    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10520");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.remove("   HI!       ...aaaaaaaaaaaaaa##########################...   HI!             ######", "...                                           ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   HI!       ...aaaaaaaaaaaaaa##########################...   HI!             ######" + "'", str2, "   HI!       ...aaaaaaaaaaaaaa##########################...   HI!             ######");
    }

    @Test
    public void test10521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10521");
        int int2 = org.apache.commons.lang.StringUtils.indexOfAnyBut("hi!                      aaa                         ...aaaaaaaaaaaaaa#############################", "!##                      AAA       ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10522");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.stripStart("                                                                                                                                                                                                                                                                                        hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "#########################   hi!       ...AAAAAAAAAAAAAA##########################...   hi!   ########A...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10523");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("i!...", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA               haaa                      !ih                                         haaa                      !ih                                         haaa                      !ih                                         ", 75);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "i!..." });
    }

    @Test
    public void test10524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10524");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.deleteWhitespace("   AHI!   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AHI!" + "'", str1, "AHI!");
    }

    @Test
    public void test10525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10525");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.remove("aaaaaaaaaaaaaaaaaaaaaaaaa!ih       hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaa!ih       hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaa!ih       hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
    }

    @Test
    public void test10526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10526");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substring("", 469);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10527");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBefore("aaaaaaaaaa                                                                                       ", "!IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaa                                                                                       " + "'", str2, "aaaaaaaaaa                                                                                       ");
    }

    @Test
    public void test10528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10528");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("aaaaaaa...hi!#########################       hi!                                  ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!    ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test10529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10529");
        int int2 = org.apache.commons.lang.StringUtils.getLevenshteinDistance("                                                                                                                                                                                                     aaaaaaaaaa                                                                                                                                                                     ", "                                                     HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 319 + "'", int2 == 319);
    }

    @Test
    public void test10530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10530");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isBlank((java.lang.CharSequence) "    ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10531");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.left("haaAAAAAAAAAAAAAAAAAAAAAAaaa", 92);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "haaAAAAAAAAAAAAAAAAAAAAAAaaa" + "'", str2, "haaAAAAAAAAAAAAAAAAAAAAAAaaa");
    }

    @Test
    public void test10532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10532");
        int int2 = org.apache.commons.lang.StringUtils.indexOf("       hi!                 hi!                 hi!          ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!    i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10533");
        boolean boolean2 = org.apache.commons.lang.StringUtils.contains("aaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaa", "...                                                        ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10534");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("###################...   HI!             ######", "                         !ih                        ");
        java.lang.String[] strArray7 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("!IHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "       hi!");
        java.lang.String str9 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray7, 'a');
        java.lang.String[] strArray12 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                    aaaaaaaaaa", "                                                                                              ...");
        java.lang.String str13 = org.apache.commons.lang.StringUtils.replaceEachRepeatedly("############aaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...", strArray7, strArray12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang.StringUtils.replaceEachRepeatedly("##########HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Haa", strArray3, strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 18 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "###################...", "", "", "HI", "", "", "", "", "", "", "", "", "", "", "", "", "", "######" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "!IHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "!IHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str9, "!IHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "                                                    aaaaaaaaaa" });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "############aaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa..." + "'", str13, "############aaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...");
    }

    @Test
    public void test10535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10535");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeEndIgnoreCase("aAAAAAAAAAAAAA################################IHAAAAAAAAAAAAAA################################IHAAAAAAAAAAAAAA################################IHAAAAAAAAAAAAAA################################IHAAAAAAAAAAAAAA################################IHAAAAAAAAAAAAAA################################IHAAAAAAAAAAAAAA################################IHAAAAAAAAAAAAAA################################IHAAAAAAAAAAAAAA################################IHAAAAAAAAAAAAAA################################IHAAAAAAAAAAAAAA################################IHAAAAAAAAAAAAAA################################IHAAAAAAAAAAAAAA################################IHAAAAAAAAAAAAAA################################IHAAAAAAAAAAAAAA################################IHAAAAAAAAAAAAAA################################IHAAAAAAAAAAAAAA################################IH", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!IHaaaaaaaaaaaaaaaaaaaaaaa ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aAAAAAAAAAAAAA################################IHAAAAAAAAAAAAAA################################IHAAAAAAAAAAAAAA################################IHAAAAAAAAAAAAAA################################IHAAAAAAAAAAAAAA################################IHAAAAAAAAAAAAAA################################IHAAAAAAAAAAAAAA################################IHAAAAAAAAAAAAAA################################IHAAAAAAAAAAAAAA################################IHAAAAAAAAAAAAAA################################IHAAAAAAAAAAAAAA################################IHAAAAAAAAAAAAAA################################IHAAAAAAAAAAAAAA################################IHAAAAAAAAAAAAAA################################IHAAAAAAAAAAAAAA################################IHAAAAAAAAAAAAAA################################IHAAAAAAAAAAAAAA################################IH" + "'", str2, "aAAAAAAAAAAAAA################################IHAAAAAAAAAAAAAA################################IHAAAAAAAAAAAAAA################################IHAAAAAAAAAAAAAA################################IHAAAAAAAAAAAAAA################################IHAAAAAAAAAAAAAA################################IHAAAAAAAAAAAAAA################################IHAAAAAAAAAAAAAA################################IHAAAAAAAAAAAAAA################################IHAAAAAAAAAAAAAA################################IHAAAAAAAAAAAAAA################################IHAAAAAAAAAAAAAA################################IHAAAAAAAAAAAAAA################################IHAAAAAAAAAAAAAA################################IHAAAAAAAAAAAAAA################################IHAAAAAAAAAAAAAA################################IHAAAAAAAAAAAAAA################################IH");
    }

    @Test
    public void test10536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10536");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isEmpty((java.lang.CharSequence) "...aaaaaaaaaaaaaa################################IHh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10537");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.leftPad("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI", 92, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI" + "'", str3, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI");
    }

    @Test
    public void test10538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10538");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNumericSpace("                           aaaaaaaaaa                                                                                                         HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10539");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.stripToNull("444444444444444444444444444444444444444444444444#################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444444444#################################################" + "'", str1, "444444444444444444444444444444444444444444444444#################################################");
    }

    @Test
    public void test10540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10540");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringAfter("", "...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10541");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 100);
        java.lang.String[] strArray9 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("                                                              ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) (short) 100);
        boolean boolean10 = org.apache.commons.lang.StringUtils.startsWithAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                     hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!", strArray9);
        java.lang.String str11 = org.apache.commons.lang.StringUtils.replaceEachRepeatedly("aaaaaaaaaaaaaaaaaaaaaaaa!hi!hi!hi!hi!hi!hi", strArray4, strArray9);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H" });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "                                                              " });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaa!hi!hi!hi!hi!hi!hi" + "'", str11, "aaaaaaaaaaaaaaaaaaaaaaaa!hi!hi!hi!hi!hi!hi");
    }

    @Test
    public void test10542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10542");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.center("          ...                                ...                                ...                                ...                                ...                                ...                                ...                                ...                                ...                    ", (-1), '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "          ...                                ...                                ...                                ...                                ...                                ...                                ...                                ...                                ...                    " + "'", str3, "          ...                                ...                                ...                                ...                                ...                                ...                                ...                                ...                                ...                    ");
    }

    @Test
    public void test10543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10543");
        int int2 = org.apache.commons.lang.StringUtils.indexOfAnyBut("", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!                                                              ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10544");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trim("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa !IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa !IH" + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa !IH");
    }

    @Test
    public void test10545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10545");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test10546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10546");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNumericSpace("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10547");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.substringsBetween("!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAhaaa!ihhaaa!ihhaaa!ih", "4444444444444444                                                          aaaaaaaaaa ...hi!###################", "                                                                 ...");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test10548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10548");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isEmpty((java.lang.CharSequence) "   hi!a                                                                                                                                                                                                                                                                                                                                                                               a...a                                                                                                                                                                                                                                                                                                                                                                               HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10549");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("hi!#########################       hi!####        H       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa", 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!#########################       hi!####        H       hi!", "       hi!", "       hi!", "       hi!", "       hi!", "       hi!", "       hi!", "       hi!", "       hi!", "       hi!" });
    }

    @Test
    public void test10550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10550");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitByCharacterType("                                                                       aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA..");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray1, '4');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "                                                                       ", "a", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", ".." });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                       4a4AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA4.." + "'", str3, "                                                                       4a4AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA4..");
    }

    @Test
    public void test10551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10551");
        int int3 = org.apache.commons.lang.StringUtils.indexOf("!IH!IH!IH!                                                                                    ...", '#', 265);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10552");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.split("                                                                                                                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...                                             ", "4444444444444444444444444444444444hi                       ...h4444444444444444444444444444444444", 26);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test10553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10553");
        int int2 = org.apache.commons.lang.StringUtils.lastIndexOf("       hi!                 hi!                 hi!          ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa       hi!#########################       hi!###################################################IH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10554");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.capitalize("aaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Aaaaaaaaaaaaaaaaaaaaa" + "'", str1, "Aaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10555");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.chomp("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH", "HI!#########################HI!#########################HI!#########################HI!#########################HI!#########################HI!#########################HI!#########################HI!#########################HI!#########################HI!########################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH" + "'", str2, "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH");
    }

    @Test
    public void test10556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10556");
        java.lang.String[] strArray5 = org.apache.commons.lang.StringUtils.split("", "HI!HI!H...", 136);
        java.lang.String[] strArray9 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("      hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################", "    ...", 1);
        java.lang.String str11 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray9, "...");
        java.lang.String str12 = org.apache.commons.lang.StringUtils.replaceEachRepeatedly("   HI!    aaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   HI!", strArray5, strArray9);
        boolean boolean13 = org.apache.commons.lang.StringUtils.startsWithAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaa   HI!   ", strArray9);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "      hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################" });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "      hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################" + "'", str11, "      hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "   HI!    aaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   HI!" + "'", str12, "   HI!    aaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   HI!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test10557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10557");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.substringBetween("", "aaaaaaaaaa!IH!IH!IH!IH!...", "hIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhI");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test10558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10558");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h                ", "HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!          ", 121);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h                " });
    }

    @Test
    public void test10559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10559");
        int int2 = org.apache.commons.lang.StringUtils.indexOf("                                                                                                             aaaaaaa..", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10560");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang.StringUtils.upperCase("!IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10561");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.capitalize("                                                                                                                                                            I!                                                                                                                                                            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                            I!                                                                                                                                                            " + "'", str1, "                                                                                                                                                            I!                                                                                                                                                            ");
    }

    @Test
    public void test10562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10562");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.defaultIfEmpty("aaaaaaaaaaaaaaaaaaaaaaaaaaaaA...aaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaA", "44444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaA...aaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaA" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaA...aaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaA");
    }

    @Test
    public void test10563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10563");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.deleteWhitespace("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI");
    }

    @Test
    public void test10564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10564");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.split("HI AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "...aaaa...", 91);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "HI AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" });
    }

    @Test
    public void test10565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10565");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.replace("4444444444444444444444444444444444hi                       ...h4444444444444444444444444444444444", "...    ...", "      ...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", 817);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4444444444444444444444444444444444hi                       ...h4444444444444444444444444444444444" + "'", str4, "4444444444444444444444444444444444hi                       ...h4444444444444444444444444444444444");
    }

    @Test
    public void test10566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10566");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceChars("...AAAAAAAAAAAAAAAAAAAAAAAAAAAAA...", "444444444444444444444444444444444444444444444444##################################################", "i!aaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                              ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...AAAAAAAAAAAAAAAAAAAAAAAAAAAAA..." + "'", str3, "...AAAAAAAAAAAAAAAAAAAAAAAAAAAAA...");
    }

    @Test
    public void test10567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10567");
        int int2 = org.apache.commons.lang.StringUtils.indexOfAnyBut("HI!HI!HI!HI!HI!HI!H...                                                                                                                                                                                                ", "i!                      ...44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10568");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeEnd("...                                                        ...", "   HI!       ...aaaaaaaaaaaaaa##########################...   HI!             #####");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...                                                        ..." + "'", str2, "...                                                        ...");
    }

    @Test
    public void test10569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10569");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.rightPad("################################IH", 14);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "################################IH" + "'", str2, "################################IH");
    }

    @Test
    public void test10570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10570");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.swapCase("!HI!HI!H  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!hi!hi!h  " + "'", str1, "!hi!hi!h  ");
    }

    @Test
    public void test10571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10571");
        boolean boolean2 = org.apache.commons.lang.StringUtils.contains("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAH", "hI!     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10572");
        boolean boolean2 = org.apache.commons.lang.StringUtils.startsWithIgnoreCase("HA...", "!IH                                                 !IH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10573");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringAfter("                                                                                                                       ", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   !hi!hi!hi!hi!hi!hi                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10574");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOf("   HI!   ", 'a', 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10575");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.strip("i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!" + "'", str1, "i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!");
    }

    @Test
    public void test10576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10576");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitByCharacterTypeCamelCase("#####AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa !IH######");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray1, "     i!hi!hi!h                                                                                    ...      ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "#####", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "Aa", " ", "!", "IH", "######" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#####     i!hi!hi!h                                                                                    ...      AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA     i!hi!hi!h                                                                                    ...      Aa     i!hi!hi!h                                                                                    ...            i!hi!hi!h                                                                                    ...      !     i!hi!hi!h                                                                                    ...      IH     i!hi!hi!h                                                                                    ...      ######" + "'", str3, "#####     i!hi!hi!h                                                                                    ...      AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA     i!hi!hi!h                                                                                    ...      Aa     i!hi!hi!h                                                                                    ...            i!hi!hi!h                                                                                    ...      !     i!hi!hi!h                                                                                    ...      IH     i!hi!hi!h                                                                                    ...      ######");
    }

    @Test
    public void test10577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10577");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang.StringUtils.upperCase("aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI     ###", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10578");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("#", "   HI!       ...aaaaaaaaaaaaaa##########################...   HI!             ######", 2);
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.stripAll(strArray3);
        java.lang.String str5 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "#" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "#" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#" + "'", str5, "#");
    }

    @Test
    public void test10579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10579");
        int int3 = org.apache.commons.lang.StringUtils.ordinalIndexOf("", "############aaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...AAAAAAAAAAAAAAAAAAAAAAAAAAAAA...", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10580");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.rightPad("h aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa! aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaih", 42, "  HI!HI!HI!HI!HI!HI!HI!H.. ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa! aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaih" + "'", str3, "h aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa! aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaih");
    }

    @Test
    public void test10581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10581");
        int int2 = org.apache.commons.lang.StringUtils.indexOfDifference("       ...", "!IH ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10582");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringAfter("hI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", "Aaaaaaaaaaaaaaa aaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10583");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.chop("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10584");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.substring("444444444444444444444444444444444444444444444444##################################################", 82, 41);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test10585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10585");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("          ##########                                                                                                     ", '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "          ##########                                                                                                     " });
    }

    @Test
    public void test10586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10586");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeEndIgnoreCase("aaaaaaaaaaaaaaaaaaaaaa", "    I!   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10587");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isWhitespace("                                                                                                                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...                                             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10588");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBefore("               I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H                               ", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "               I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H                               " + "'", str2, "               I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H                               ");
    }

    @Test
    public void test10589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10589");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.reverseDelimited("4hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h44!!!HHHHHHH", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!HHHHHHH4hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h" + "'", str2, "!!!HHHHHHH4hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
    }

    @Test
    public void test10590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10590");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.right("                                                                                                                     ", 17);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                 " + "'", str2, "                 ");
    }

    @Test
    public void test10591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10591");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.swapCase("                                                                       aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                       Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.." + "'", str1, "                                                                       Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa..");
    }

    @Test
    public void test10592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10592");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("                                                        !IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!", "aaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...");
        java.lang.String str6 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray2, '4', 99, 93);
        java.lang.String str7 = org.apache.commons.lang.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                        !IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                                        !IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!" + "'", str7, "                                                        !IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!");
    }

    @Test
    public void test10593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10593");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNumeric("I!AAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10594");
        boolean boolean2 = org.apache.commons.lang.StringUtils.contains("444444444444444444444444444444444444444444444444                                                  44444444444   HI!       ...aaaaaaaaaaaaaa##########################...   HI!   44444444444444444444444   HI!    ", ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test10595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10595");
        char[] charArray9 = new char[] { '#', 'a', 'a', ' ' };
        boolean boolean10 = org.apache.commons.lang.StringUtils.containsAny("", charArray9);
        int int11 = org.apache.commons.lang.StringUtils.indexOfAny("HI!", charArray9);
        int int12 = org.apache.commons.lang.StringUtils.indexOfAnyBut("   HI!    ", charArray9);
        boolean boolean13 = org.apache.commons.lang.StringUtils.containsAny("HHh!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!", charArray9);
        int int14 = org.apache.commons.lang.StringUtils.indexOfAnyBut("    !!AAAAAAAAAAAAAAAAAAAAAAAAAH   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', 'a', 'a', ' ' });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
    }

    @Test
    public void test10596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10596");
        int int2 = org.apache.commons.lang.StringUtils.lastIndexOf("                                                                                                                                                            I!                                                                                                                                                            ", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10597");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.leftPad("#########################################################################################ih", 306, "                                               ...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                               ...                                               ...                                               ...                                               ...               #########################################################################################ih" + "'", str3, "                                               ...                                               ...                                               ...                                               ...               #########################################################################################ih");
    }

    @Test
    public void test10598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10598");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitByCharacterType("      ...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "      ", "...", "HI", "!", "HI", "!", "HI", "!", "HI", "!", "HI", "!", "HI", "!", "HI", "!", "HI", "!", "HI", "!", "HI", "!", "HI" });
    }

    @Test
    public void test10599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10599");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsIgnoreCase("", "       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaa...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10600");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsOnly("aaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   HI!       ", "                                                                                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaA...I!HI...aaaaaaaaaaaaaaaaaaaaaaaaaaaaA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10601");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.leftPad("HI                       ...H", 313);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                            HI                       ...H" + "'", str2, "                                                                                                                                                                                                                                                                                            HI                       ...H");
    }

    @Test
    public void test10602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10602");
        java.lang.String[] strArray5 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("444444444", "...", 9);
        java.lang.String[] strArray8 = org.apache.commons.lang.StringUtils.split("hi!", '4');
        java.lang.String str12 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray8, "   HI!    ", 0, (int) (byte) 1);
        java.lang.String str13 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray8);
        java.lang.String str14 = org.apache.commons.lang.StringUtils.replaceEach("   hi!    ", strArray5, strArray8);
        java.lang.String[] strArray18 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("    I!   ", "hI!                      AAA", 51);
        java.lang.String str19 = org.apache.commons.lang.StringUtils.replaceEach("...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ", strArray5, strArray18);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "444444444" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "   hi!    " + "'", str14, "   hi!    ");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "    I!   " });
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       " + "'", str19, "...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ...       ");
    }

    @Test
    public void test10603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10603");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.swapCase("                                                                                                                                                                                                                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                               " + "'", str1, "                                                                                                                                                                                                                               ");
    }

    @Test
    public void test10604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10604");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isEmpty((java.lang.CharSequence) "aaaaaaaaaa...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10605");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOf("444444444444444444444444444444444444444444444444#################################################", "                                                                                    ...", 253);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10606");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.remove("i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!", "aaaaaaaaaa!IH!IH!IH!IH!...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!" + "'", str2, "i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!");
    }

    @Test
    public void test10607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10607");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.stripEnd("hi!###################                                                 ...hi!##################", "HI!...HIHI!...!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!###################                                                 ...hi!##################" + "'", str2, "hi!###################                                                 ...hi!##################");
    }

    @Test
    public void test10608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10608");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.replace("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   HI!", "aaa", "I!                      ..", 280);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "I!                      ..I!                      ..I!                      ..I!                      ..I!                      ..I!                      ..I!                      ..I!                      ..I!                      ..I!                      ..I!                      ..I!                      ..I!                      ..I!                      ..I!                      ..I!                      ..I!                      ..I!                      ..I!                      ..I!                      ..I!                      ..I!                      ..I!                      ..I!                      ..I!                      ..I!                      ..I!                      ..I!                      ..I!                      ..I!                      ..   HI!" + "'", str4, "I!                      ..I!                      ..I!                      ..I!                      ..I!                      ..I!                      ..I!                      ..I!                      ..I!                      ..I!                      ..I!                      ..I!                      ..I!                      ..I!                      ..I!                      ..I!                      ..I!                      ..I!                      ..I!                      ..I!                      ..I!                      ..I!                      ..I!                      ..I!                      ..I!                      ..I!                      ..I!                      ..I!                      ..I!                      ..I!                      ..   HI!");
    }

    @Test
    public void test10609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10609");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeEndIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "I!                      ..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10610");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.abbreviate("                                                                                                                                     ...", 41, 469);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                     ..." + "'", str3, "                                                                                                                                     ...");
    }

    @Test
    public void test10611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10611");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.overlay("hI!", "... ####IHH                                                      ...", 253, 96);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hI!... ####IHH                                                      ..." + "'", str4, "hI!... ####IHH                                                      ...");
    }

    @Test
    public void test10612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10612");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.replace("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!    ", "       hi!aaaaaaaaaa44444444444   HI!       ...aaaaaaaaaaaaaa##########################...   HI!   444444444444aaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaa!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!aaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa", 305);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" + "'", str4, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
    }

    @Test
    public void test10613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10613");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isWhitespace("ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!i    !IH   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA  hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10614");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.uncapitalize("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         HI               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         HI               " + "'", str1, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         HI               ");
    }

    @Test
    public void test10615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10615");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceChars("HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                                  HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!", ' ', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!" + "'", str3, "HI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!");
    }

    @Test
    public void test10616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10616");
        int int2 = org.apache.commons.lang.StringUtils.getLevenshteinDistance("AAAAAA...", "       HI!                 HI!                 HI!         ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 59 + "'", int2 == 59);
    }

    @Test
    public void test10617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10617");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAllLowerCase("                              ###################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10618");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.rightPad("AaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAH", 38, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAH" + "'", str3, "AaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAH");
    }

    @Test
    public void test10619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10619");
        boolean boolean2 = org.apache.commons.lang.StringUtils.startsWithIgnoreCase("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", "aaaaaaaaaaaaaaaaaaaaaaaa!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10620");
        boolean boolean2 = org.apache.commons.lang.StringUtils.contains("       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaa!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!aaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa", "AaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAH4444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10621");
        char[] charArray1 = null;
        int int2 = org.apache.commons.lang.StringUtils.indexOfAny("", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10622");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang.StringUtils.upperCase("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIa...", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10623");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substring("...                                                                                    h!ih!ih!i", 106);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10624");
        boolean boolean2 = org.apache.commons.lang.StringUtils.equalsIgnoreCase("                                                 hi!                      ...h                                                  ", "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10625");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.defaultIfEmpty("hhhhhhhhhhhhhhhhhhhhhhhhh", "                                                                                            hi!                      ...h                                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhhhhhhhhhhhhhhhhhhhhhh" + "'", str2, "hhhhhhhhhhhhhhhhhhhhhhhhh");
    }

    @Test
    public void test10626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10626");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("...hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh...", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hiI");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test10627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10627");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!hi!", "       hi!#       hi!#       hi!#       hi!#       hi!#       hi!#       hi!#hAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HI", "HI", "HI", "HI", "HI", "HI", "HI", "HI", "HI", "HI", "HI", "HI", "HI", "HI", "HI" });
    }

    @Test
    public void test10628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10628");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.difference("                                                                                                   ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10629");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.remove("aaaaaaaaHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HaahiaHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Haa!", " HI!HI!HI..                                                  HI!HI!HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HaahiaHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Haa!" + "'", str2, "aaaaaaaaHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HaahiaHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Haa!");
    }

    @Test
    public void test10630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10630");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.uncapitalize("!HI!HI!HI!HI!HI!HI!HI!H  hi HI!HI!HI!HI!HI!HI!HI!H444444444444444                                                          aaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!HI!HI!HI!HI!HI!HI!HI!H  hi HI!HI!HI!HI!HI!HI!HI!H444444444444444                                                          aaaaaaaaaa" + "'", str1, "!HI!HI!HI!HI!HI!HI!HI!H  hi HI!HI!HI!HI!HI!HI!HI!H444444444444444                                                          aaaaaaaaaa");
    }

    @Test
    public void test10631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10631");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substring("      ", 76);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10632");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAsciiPrintable("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10633");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.defaultIfEmpty("                                         hi!                      aaah", "                        hi!                         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                         hi!                      aaah" + "'", str2, "                                         hi!                      aaah");
    }

    @Test
    public void test10634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10634");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.substringBetween("", "444444444444444444444444444444444444444444444444#################################################", "I!AAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test10635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10635");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBeforeLast("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10636");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNumeric("       ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10637");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("!IH   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "!IH", "", "", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" });
    }

    @Test
    public void test10638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10638");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAllUpperCase("!IH!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih                                                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10639");
        int int2 = org.apache.commons.lang.StringUtils.lastIndexOf("HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!          ", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 952 + "'", int2 == 952);
    }

    @Test
    public void test10640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10640");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("   hi!    ", "Hi!hi!hi!h                                                                                    ...");
        java.lang.String str6 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray2, '4', 210, 86);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "   hi!    " });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test10641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10641");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!          ", "#####AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa !IH######");
        java.lang.String[] strArray5 = org.apache.commons.lang.StringUtils.splitByCharacterTypeCamelCase("a4444444444444444444444444444444444");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang.StringUtils.replaceEachRepeatedly("aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!#########################IHH", strArray3, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!          " });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "a", "4444444444444444444444444444444444" });
    }

    @Test
    public void test10642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10642");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("          ", "##########                                                                                          ");
        int int3 = org.apache.commons.lang.StringUtils.indexOfDifference(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "          " });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10643");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.difference("...   aaa                         ...aaaaaaaaaaaaaa############################", "                                                                                            hi!                      ...h                                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                            hi!                      ...h                                                  " + "'", str2, "                                                                                            hi!                      ...h                                                  ");
    }

    @Test
    public void test10644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10644");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.defaultString("II!                      ...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!I!", "#####...! ...hihi! hi!######");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "II!                      ...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!I!" + "'", str2, "II!                      ...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!I!");
    }

    @Test
    public void test10645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10645");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringAfter("HHI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!          ", "hi HI!HI!HI!HI!HI!HI!HI!H444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10646");
        int int1 = org.apache.commons.lang.StringUtils.length("   HI!       ...aaaaaaaaaaaaaa##       hi!aaaaaaaaaaaaaaaaaaaaaaaaa#####...   HI!             ######");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test10647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10647");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.uncapitalize("                   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!hi!                ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!hi!                ..." + "'", str1, "                   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!hi!                ...");
    }

    @Test
    public void test10648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10648");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitByCharacterType("44444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "44444444444444444444444444444444444" });
    }

    @Test
    public void test10649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10649");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBetween("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ", "############################################################################################!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAhaaa!ihhaaa!ihhaaa!ih############################################################################################");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test10650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10650");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.substringBetween("                                                                                                      !Haaaaaaaaaaaaaaaaaaaaaaaa!hi!hi!hi!hi!hi!hiH                                                                                                      ", "444444444444444444444444444444444444444444444444#################################################", "!IH!IH!IH!444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test10651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10651");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNumeric("HI!HI!H...HI!HI!H...HI!HI!H...HI!HI!H...HI!###########################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10652");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsAny("                                                      HI!                            ", "##############       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test10653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10653");
        int int2 = org.apache.commons.lang.StringUtils.indexOfAny("!IH", "!IH!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih                                !IH   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10654");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substring("!HI!HI!H  ", 91);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10655");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.right(" !ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", 276);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " !ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI" + "'", str2, " !ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
    }

    @Test
    public void test10656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10656");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAsciiPrintable("I!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaHI!aaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10657");
        boolean boolean2 = org.apache.commons.lang.StringUtils.contains("         ", ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test10658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10658");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNotEmpty((java.lang.CharSequence) "                                              Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   HI!    Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   HI!    Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   HI!    hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10659");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("       ...A       ...A       ...A       ...A       ...A       ...A       ...A       ...A       ...A       ...", "...");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray2, 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "       aaaA       aaaA       aaaA       aaaA       aaaA       aaaA       aaaA       aaaA       aaaA       aaa" + "'", str4, "       aaaA       aaaA       aaaA       aaaA       aaaA       aaaA       aaaA       aaaA       aaaA       aaa");
    }

    @Test
    public void test10660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10660");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   hi!        ", '4');
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   hi!        " });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   hi!" });
    }

    @Test
    public void test10661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10661");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByCharacterType("aaaaaaaaaa                                                           ");
        int int3 = org.apache.commons.lang.StringUtils.indexOfAny("h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aaaaaaaaaa", "                                                           " });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10662");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.strip("HI!                 HI!                 HI!                 HI!                 HI!                                  HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!", "                                                                                                                                                                                                                      !IHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10663");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.defaultString("HI!...HIHI!...!", "      ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!...HIHI!...!" + "'", str2, "HI!...HIHI!...!");
    }

    @Test
    public void test10664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10664");
        int int2 = org.apache.commons.lang.StringUtils.indexOf("                                                                                 hi", "HI!HI!H...HI!HI!H...HI!HI!H...HI!HI!H...HI!###########################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10665");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.chomp("4444444444444444                                                          aaaaaaaaaa    ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                        hi!                         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444                                                          aaaaaaaaaa    " + "'", str2, "4444444444444444                                                          aaaaaaaaaa    ");
    }

    @Test
    public void test10666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10666");
        int int2 = org.apache.commons.lang.StringUtils.lastIndexOf("haAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "A...                     ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10667");
        char[] charArray12 = new char[] { '#', 'a', 'a', ' ' };
        boolean boolean13 = org.apache.commons.lang.StringUtils.containsAny("", charArray12);
        boolean boolean14 = org.apache.commons.lang.StringUtils.containsOnly("aaaaaaaaaa                                                                                          ", charArray12);
        boolean boolean15 = org.apache.commons.lang.StringUtils.containsNone("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray12);
        int int16 = org.apache.commons.lang.StringUtils.indexOfAnyBut("aaaaaaaaaa", charArray12);
        boolean boolean17 = org.apache.commons.lang.StringUtils.containsOnly("       hi!                      ...hihi!                      ...!", charArray12);
        boolean boolean18 = org.apache.commons.lang.StringUtils.containsOnly("!IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!", charArray12);
        int int19 = org.apache.commons.lang.StringUtils.indexOfAnyBut("haaAAAAAAAAAAAAAAAAAAAAAAaaa", charArray12);
        int int20 = org.apache.commons.lang.StringUtils.indexOfAny("!IH!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih                                !IH   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '#', 'a', 'a', ' ' });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 51 + "'", int20 == 51);
    }

    @Test
    public void test10668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10668");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.defaultString("          ##########################                     aaaaa aaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "          ##########################                     aaaaa aaaaaaaaaaaaaaaa" + "'", str1, "          ##########################                     aaaaa aaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10669");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.split("aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!", "", 953);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!" });
    }

    @Test
    public void test10670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10670");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.chop("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaa");
    }

    @Test
    public void test10671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10671");
        char[] charArray14 = new char[] { '#', 'a', 'a', ' ' };
        boolean boolean15 = org.apache.commons.lang.StringUtils.containsAny("", charArray14);
        int int16 = org.apache.commons.lang.StringUtils.indexOfAnyBut("                                                    ", charArray14);
        boolean boolean17 = org.apache.commons.lang.StringUtils.containsAny("HI!", charArray14);
        boolean boolean18 = org.apache.commons.lang.StringUtils.containsNone("                                                   ", charArray14);
        boolean boolean19 = org.apache.commons.lang.StringUtils.containsAny("                                                                                                    ", charArray14);
        boolean boolean20 = org.apache.commons.lang.StringUtils.containsOnly("                                                                                       ...", charArray14);
        int int21 = org.apache.commons.lang.StringUtils.indexOfAny("aaaaaaaaaa                                                                                                          ...", charArray14);
        boolean boolean22 = org.apache.commons.lang.StringUtils.containsNone("H                                                             ", charArray14);
        boolean boolean23 = org.apache.commons.lang.StringUtils.containsAny("aaaaaaaaaaaaaa################################ih", charArray14);
        boolean boolean24 = org.apache.commons.lang.StringUtils.containsOnly("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       HI", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '#', 'a', 'a', ' ' });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test10672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10672");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.left("                                                                                                                                                                                                                                                       I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H               ", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10673");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeEndIgnoreCase("#...", "4444444444444444444444444444444444444444444444444444444444444444444444444hi!                      ...h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#..." + "'", str2, "#...");
    }

    @Test
    public void test10674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10674");
        boolean boolean2 = org.apache.commons.lang.StringUtils.contains("                                                                         hi                       ...h", '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10675");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isBlank((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10676");
        int int2 = org.apache.commons.lang.StringUtils.lastIndexOf("...AAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10677");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.swapCase("444444444444444444444444444444444444444444444444#################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444444444#################################################" + "'", str1, "444444444444444444444444444444444444444444444444#################################################");
    }

    @Test
    public void test10678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10678");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.stripEnd("... hi!                 hi!                 hi!                 hi!                 hi!               ...", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "... hi!                 hi!                 hi!                 hi!                 hi!               ..." + "'", str2, "... hi!                 hi!                 hi!                 hi!                 hi!               ...");
    }

    @Test
    public void test10679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10679");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.reverse("AAAAAAAAAAAAAA################################IHH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHI################################AAAAAAAAAAAAAA" + "'", str1, "HHI################################AAAAAAAAAAAAAA");
    }

    @Test
    public void test10680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10680");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.rightPad("   4444444444444444                                                          aaaaaaaaaa    ", 306, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   4444444444444444                                                          aaaaaaaaaa    44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "   4444444444444444                                                          aaaaaaaaaa    44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test10681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10681");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.center("aaaaaaaaaa...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH", 36);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaa...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH" + "'", str2, "aaaaaaaaaa...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH");
    }

    @Test
    public void test10682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10682");
        int int2 = org.apache.commons.lang.StringUtils.countMatches("i!#########################", "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10683");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isEmpty((java.lang.CharSequence) "       ...A       ...A       ...A       ...A       ...A       ...A       ...A       ...A       ...A       ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10684");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.stripToNull("               aaaaaaaaaaaaaaaaaaaaaaaaaaaaA...I!HI...aaaaaaaaaaaaaaaaaaaaaaaaaaaaA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaA...I!HI...aaaaaaaaaaaaaaaaaaaaaaaaaaaaA" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaA...I!HI...aaaaaaaaaaaaaaaaaaaaaaaaaaaaA");
    }

    @Test
    public void test10685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10685");
        int int2 = org.apache.commons.lang.StringUtils.indexOfAnyBut("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HaahiaHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Haa!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10686");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.upperCase("       hi!aaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "       HI!AAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "       HI!AAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test10687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10687");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOfAny("                                                                                                                     ", strArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray2, "   HI!    ", 36, 70);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 36 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10688");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceChars("    !IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I   ", "                                          !ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!i", "aaaaaaaaaaaaaa################################ih");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaa#IH#IH#IH#IH#IH#IH#IH#IH#IH#IH#IH#IH#IH#IH#IH#IH#IH#IH#IH#IH#IH#IH#IH#IH#IH#IH#Iaaa" + "'", str3, "aaaa#IH#IH#IH#IH#IH#IH#IH#IH#IH#IH#IH#IH#IH#IH#IH#IH#IH#IH#IH#IH#IH#IH#IH#IH#IH#IH#Iaaa");
    }

    @Test
    public void test10689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10689");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA..H!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA..H!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih" });
    }

    @Test
    public void test10690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10690");
        int int2 = org.apache.commons.lang.StringUtils.indexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                      aaaaaaaaaaaaaaaaaaaaaaa", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10691");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNotBlank((java.lang.CharSequence) "h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10692");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.split("a4444444444444444444444444444444444");
        int int2 = org.apache.commons.lang.StringUtils.indexOfDifference(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "a4444444444444444444444444444444444" });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10693");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.defaultIfEmpty("       hi!aaaaaaaaaa44444444444   HI!       ...aaaaaaaaaaaaaa##########################...   HI!   444444444444aaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaa!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!aaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa", " hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       hi!aaaaaaaaaa44444444444   HI!       ...aaaaaaaaaaaaaa##########################...   HI!   444444444444aaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaa!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!aaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "       hi!aaaaaaaaaa44444444444   HI!       ...aaaaaaaaaaaaaa##########################...   HI!   444444444444aaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaa!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!aaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10694");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.deleteWhitespace("                                                                                                                                                                                                                                                                                                                                                                                                                                                               ih                                                  ih                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ihih" + "'", str1, "ihih");
    }

    @Test
    public void test10695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10695");
        int int3 = org.apache.commons.lang.StringUtils.ordinalIndexOf("aaaaaaa...aaaaaaaa...aaaaaaaa..                   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!hi!                    ", "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!", 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10696");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isWhitespace("...i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h.##");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10697");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.leftPad("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi" + "'", str2, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi");
    }

    @Test
    public void test10698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10698");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.lowerCase("Aaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10699");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.right("aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 70);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test10700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10700");
        boolean boolean2 = org.apache.commons.lang.StringUtils.startsWith("Aaaaaaa...", "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaa44444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10701");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.substring("   HHHHHHH", 1, 41);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  HHHHHHH" + "'", str3, "  HHHHHHH");
    }

    @Test
    public void test10702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10702");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringAfter("   HI!                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   HI!                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!" + "'", str2, "   HI!                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!");
    }

    @Test
    public void test10703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10703");
        boolean boolean2 = org.apache.commons.lang.StringUtils.contains("   A", "I!                      ..I!                      ..I!                      ..I!                      ..I!                      ..I!                      ..I!                      ..I!                      ..I!                      ..I!                      ..I!                      ..I!                      ..I!                      ..I!                      ..I!                      ..I!                      ..I!                      ..I!                      ..I!                      ..I!                      ..I!                      ..I!                      ..I!                      ..I!                      ..I!                      ..I!                      ..I!                      ..I!                      ..I!                      ..I!                      ..   HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10704");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeEndIgnoreCase("                                                                                                                                                                     !IHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "4444444444444444                                                          AAAAAAAAAA ...HI!###################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                     !IHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "                                                                                                                                                                     !IHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test10705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10705");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.split("       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!", "##", 11);
        java.lang.String str7 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray3, "                                                                                                                                                                     !IHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 25, (int) (byte) 10);
        java.lang.Class<?> wildcardClass8 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test10706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10706");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphaSpace("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10707");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsOnly("                             AAAAAAAAAA", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10708");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("################################");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "################################" });
    }

    @Test
    public void test10709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10709");
        char[] charArray14 = new char[] { '#', 'a', 'a', ' ' };
        boolean boolean15 = org.apache.commons.lang.StringUtils.containsAny("", charArray14);
        int int16 = org.apache.commons.lang.StringUtils.indexOfAny("HI!", charArray14);
        boolean boolean17 = org.apache.commons.lang.StringUtils.containsNone("                                                    ", charArray14);
        boolean boolean18 = org.apache.commons.lang.StringUtils.containsOnly("                                                   ", charArray14);
        boolean boolean19 = org.apache.commons.lang.StringUtils.containsOnly(" hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h  ", charArray14);
        boolean boolean20 = org.apache.commons.lang.StringUtils.containsNone("HA...", charArray14);
        boolean boolean21 = org.apache.commons.lang.StringUtils.containsOnly("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!    ", charArray14);
        boolean boolean22 = org.apache.commons.lang.StringUtils.containsAny("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!", charArray14);
        int int23 = org.apache.commons.lang.StringUtils.indexOfAnyBut("aaaaaaaaaa!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I", charArray14);
        boolean boolean24 = org.apache.commons.lang.StringUtils.containsOnly("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaa44444444444444444444444444444444444444444444444444444", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '#', 'a', 'a', ' ' });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test10710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10710");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.leftPad("HHHHHH", 210, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHHHHHH" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHHHHHH");
    }

    @Test
    public void test10711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10711");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substring("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   HI!      ", 313);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10712");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.repeat("                     ", "#####AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa !IH######", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                     " + "'", str3, "                     ");
    }

    @Test
    public void test10713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10713");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeEnd("   HI!    aaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   HI!", " aaah");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   HI!    aaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   HI!" + "'", str2, "   HI!    aaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   HI!");
    }

    @Test
    public void test10714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10714");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("                     ################                                                    aaaaaaaaaa################################                                                    aaaaaaaaaa################################                                                    aaaaaaaaaa################################                                                    aaaaaaaaaa################################                                                    aaaa", "                                                                    ", 503);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                     ################                                                    aaaaaaaaaa################################                                                    aaaaaaaaaa################################                                                    aaaaaaaaaa################################                                                    aaaaaaaaaa################################                                                    aaaa" });
    }

    @Test
    public void test10715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10715");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringAfter("   AHI!   ", "Hi!                      ...haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10716");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.reverse("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    ...aaaaaaaaaaaaaa################################IHh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHI################################aaaaaaaaaaaaaa...    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "hHI################################aaaaaaaaaaaaaa...    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10717");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceOnce("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", "hi!###################                                                 ...hi!###################", " HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa..." + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
    }

    @Test
    public void test10718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10718");
        int int2 = org.apache.commons.lang.StringUtils.getLevenshteinDistance("###", "...Aaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 167 + "'", int2 == 167);
    }

    @Test
    public void test10719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10719");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.chomp("                          ih                                                  ih                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                          ih                                                  ih                   " + "'", str1, "                          ih                                                  ih                   ");
    }

    @Test
    public void test10720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10720");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trim("4444444444444444                                                          aaaaaaaaaa ...hi!###################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444                                                          aaaaaaaaaa ...hi!###################" + "'", str1, "4444444444444444                                                          aaaaaaaaaa ...hi!###################");
    }

    @Test
    public void test10721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10721");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substring("   HI!       ...aaaaaaaaaaaaaa##       hi!aaaaaaaaaaaaaaaaaaaaaaaaa#####...   HI!             ######", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       hi!aaaaaaaaaaaaaaaaaaaaaaaaa#####...   HI!             ######" + "'", str2, "       hi!aaaaaaaaaaaaaaaaaaaaaaaaa#####...   HI!             ######");
    }

    @Test
    public void test10722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10722");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.right("                      hI!                      AAA", 441);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                      hI!                      AAA" + "'", str2, "                      hI!                      AAA");
    }

    @Test
    public void test10723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10723");
        boolean boolean2 = org.apache.commons.lang.StringUtils.endsWith("aaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   HI!", "      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10724");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.abbreviate("haaAAAAAAAAAAAAAAAAAAAAAAaaa", 9, 372);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "haaAAAAAAAAAAAAAAAAAAAAAAaaa" + "'", str3, "haaAAAAAAAAAAAAAAAAAAAAAAaaa");
    }

    @Test
    public void test10725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10725");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.stripStart("a4444444444444444444444444444444444AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa !IHAAAAAAAAAAA", "######");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a4444444444444444444444444444444444AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa !IHAAAAAAAAAAA" + "'", str2, "a4444444444444444444444444444444444AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa !IHAAAAAAAAAAA");
    }

    @Test
    public void test10726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10726");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trimToEmpty("!ih!ih!ih!444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih!ih!ih!444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "!ih!ih!ih!444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test10727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10727");
        int int2 = org.apache.commons.lang.StringUtils.indexOfAnyBut("   4444444444444444                                                          aaaaaaaaaa    ", "                                                  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test10728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10728");
        int int2 = org.apache.commons.lang.StringUtils.countMatches("!IH!IH!IH!                                                                                    ...", "...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test10729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10729");
        char[] charArray11 = new char[] { '#', 'a', 'a', ' ' };
        boolean boolean12 = org.apache.commons.lang.StringUtils.containsAny("", charArray11);
        int int13 = org.apache.commons.lang.StringUtils.indexOfAnyBut("                                                    ", charArray11);
        boolean boolean14 = org.apache.commons.lang.StringUtils.containsAny("HI!", charArray11);
        boolean boolean15 = org.apache.commons.lang.StringUtils.containsNone("                                                   ", charArray11);
        int int16 = org.apache.commons.lang.StringUtils.indexOfAny("HI!", charArray11);
        boolean boolean17 = org.apache.commons.lang.StringUtils.containsAny("   !IH   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa   ", charArray11);
        int int18 = org.apache.commons.lang.StringUtils.indexOfAnyBut("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '#', 'a', 'a', ' ' });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test10730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10730");
        boolean boolean2 = org.apache.commons.lang.StringUtils.equals("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI", "i!                      ...44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10731");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.substringBetween("HI!HI!H#######...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa   HI!   a", "Aaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test10732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10732");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.strip("!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!i" + "'", str1, "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!i");
    }

    @Test
    public void test10733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10733");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAllUpperCase("                                                 ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10734");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replace("", "44444444444   hi!       ...AAAAAAAAAAAAAA##########################...   hi!   444444444444", "...                                                                   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test10735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10735");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang.StringUtils.upperCase("                                    hi    ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10736");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlpha("HI!       ...aaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10737");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringAfterLast("I", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   HI!       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10738");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.substringsBetween("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!", "    ...aaaaaaaaaaaaaa##########################...");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test10739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10739");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.abbreviate("A", 130, 265);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A" + "'", str3, "A");
    }

    @Test
    public void test10740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10740");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ", "                                                  ");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.stripAll(strArray2, "                                                              aaaaaaaaaaAAAa");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test10741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10741");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByCharacterType("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String[] strArray5 = org.apache.commons.lang.StringUtils.splitByCharacterTypeCamelCase("hi!");
        java.lang.String[] strArray6 = org.apache.commons.lang.StringUtils.stripAll(strArray5);
        java.lang.String[] strArray7 = org.apache.commons.lang.StringUtils.stripAll(strArray6);
        int int8 = org.apache.commons.lang.StringUtils.indexOfAny("                                                                                                                                                #####################################################################################################################################...", strArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang.StringUtils.replaceEach("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...                                             ...", strArray2, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi", "!" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi", "!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi", "!" });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test10742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10742");
        int int3 = org.apache.commons.lang.StringUtils.indexOf("i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h                ", '4', 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10743");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsOnly("A   HI!    hi!", "aaaaaaaaaa################################IH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10744");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.mid("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          aaaaaaaaaaaaaa################################ih", 0, 503);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       " + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ");
    }

    @Test
    public void test10745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10745");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.defaultString("                                                                                         ", "...aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa...i!...aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa...i!...aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                         " + "'", str2, "                                                                                         ");
    }

    @Test
    public void test10746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10746");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.stripToNull("                                                      hi!                             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test10747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10747");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.strip("                              ", "               HI            aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa               HI             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10748");
        int int1 = org.apache.commons.lang.StringUtils.length("aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!#########################IHH");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 204 + "'", int1 == 204);
    }

    @Test
    public void test10749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10749");
        boolean boolean2 = org.apache.commons.lang.StringUtils.contains("###################...   HI!             ######444444444", ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test10750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10750");
        char[] charArray9 = new char[] { '#', 'a', 'a', ' ' };
        boolean boolean10 = org.apache.commons.lang.StringUtils.containsAny("", charArray9);
        int int11 = org.apache.commons.lang.StringUtils.indexOfAny("HI!", charArray9);
        boolean boolean12 = org.apache.commons.lang.StringUtils.containsNone("                                                    ", charArray9);
        int int13 = org.apache.commons.lang.StringUtils.indexOfAny("   hi!    ", charArray9);
        int int14 = org.apache.commons.lang.StringUtils.indexOfAnyBut(".......", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', 'a', 'a', ' ' });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test10751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10751");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.split("hi!                      ...hihi!                      ...!", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) (byte) -1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!                      ...hihi!                      ...!" });
    }

    @Test
    public void test10752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10752");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeStart("...AAAAAAAAAAAAAAAAAAAAAAAAAAAAA..", "aAAAAAHi!hi!hi!h...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!    ###");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...AAAAAAAAAAAAAAAAAAAAAAAAAAAAA.." + "'", str2, "...AAAAAAAAAAAAAAAAAAAAAAAAAAAAA..");
    }

    @Test
    public void test10753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10753");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replace("ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihIIIIIII...II", "##############       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################", "                         !ih                                                 !ih                   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihIIIIIII...II" + "'", str3, "ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihIIIIIII...II");
    }

    @Test
    public void test10754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10754");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.replace("############################################################################################i!                      ..############################################################################################", "hA4444444444444444444hi!444444444444", "i!######################..", 294);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "############################################################################################i!                      ..############################################################################################" + "'", str4, "############################################################################################i!                      ..############################################################################################");
    }

    @Test
    public void test10755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10755");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.stripToEmpty("                             AAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAA" + "'", str1, "AAAAAAAAAA");
    }

    @Test
    public void test10756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10756");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAllLowerCase("     !Ih44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10757");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.strip("aaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa         ", "    ih ih ih ih ih ih ih ih ih ih ih ih ih ih ih ih                                     ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10758");
        int int2 = org.apache.commons.lang.StringUtils.lastIndexOf("      hi!       ", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10759");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeEndIgnoreCase("i!                      ...44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!                      ...44444444444444444444444444444444444444444444444444444" + "'", str2, "i!                      ...44444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test10760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10760");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphaSpace("aaaaaaaaaa                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10761");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substring("    ...aaaaaaaaaaaaaa##########################...", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   ...aaaaaaaaaaaaaa##########################..." + "'", str2, "   ...aaaaaaaaaaaaaa##########################...");
    }

    @Test
    public void test10762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10762");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitByCharacterType("aaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   HI!       ");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.stripAll(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "aaaaaaaaaa", "A", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "   ", "HI", "!", "       " });
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aaaaaaaaaa", "A", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "", "HI", "!", "" });
    }

    @Test
    public void test10763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10763");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitByCharacterTypeCamelCase("       HI!                 HI!                 HI!          ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "       ", "HI", "!", "                 ", "HI", "!", "                 ", "HI", "!", "          " });
    }

    @Test
    public void test10764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10764");
        boolean boolean2 = org.apache.commons.lang.StringUtils.contains("                                              hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!", "                                                                                                                                                                                                                                                                                                                                     h!ih!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10765");
        int int3 = org.apache.commons.lang.StringUtils.indexOf("   4444444444444444                                                          aaaaaaaaaa    ", "aaaaaaa...hi!#########################       hi!                                  ", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10766");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.defaultIfEmpty("AaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAH", "       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaa!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!aaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAH" + "'", str2, "AaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAH");
    }

    @Test
    public void test10767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10767");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.stripStart("                            !IH                                                      ", "AaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAH4444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                            !IH                                                      " + "'", str2, "                            !IH                                                      ");
    }

    @Test
    public void test10768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10768");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.split("AAAAAAAAAAAAAAAAAAAAAAAA!HI!HI!HI!HI!HI!HI", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   !hi!hi!hi!hi!hi!hi                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ", 86);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "AAAAAAAAAAAAAAAAAAAAAAAA", "HI", "HI", "HI", "HI", "HI", "HI" });
    }

    @Test
    public void test10769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10769");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitByCharacterType("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "   ", "hi", "!" });
    }

    @Test
    public void test10770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10770");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("i!                      ...44444444444444444444444444444444444444444444444444444", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!    i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h!IH", 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "...44444444444444444444444444444444444444444444444444444" });
    }

    @Test
    public void test10771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10771");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trim("############aaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...AAAAAAAAAAAAAAAAAAAAAAAAAAAAA...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "############aaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...AAAAAAAAAAAAAAAAAAAAAAAAAAAAA..." + "'", str1, "############aaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...AAAAAAAAAAAAAAAAAAAAAAAAAAAAA...");
    }

    @Test
    public void test10772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10772");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.mid("      hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!                                                                                                aaaaaaa...", 19, 99);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!             " + "'", str3, "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!             ");
    }

    @Test
    public void test10773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10773");
        boolean boolean2 = org.apache.commons.lang.StringUtils.contains("...    ...", '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10774");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.capitalize("aaaaaaaaaaaaaa################################ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Aaaaaaaaaaaaaa################################ih" + "'", str1, "Aaaaaaaaaaaaaa################################ih");
    }

    @Test
    public void test10775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10775");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI", "                         ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI" });
    }

    @Test
    public void test10776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10776");
        boolean boolean2 = org.apache.commons.lang.StringUtils.startsWithIgnoreCase("                aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                         aaa                                                 ", "A! A! AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   AA!A! A! A");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10777");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("aaaAaaaHI!aaaa", 'a');
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "A", "HI!" });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "A", "HI!" });
    }

    @Test
    public void test10778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10778");
        boolean boolean2 = org.apache.commons.lang.StringUtils.startsWithIgnoreCase("     HI!                 HI!                 HI!                 HI!                 HI!                                  HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!", "!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA               haaa                      !ih                                         haaa                      !ih                                         haaa                      !ih                                         ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10779");
        int int2 = org.apache.commons.lang.StringUtils.countMatches("hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################", "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10780");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphanumeric("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10781");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.reverseDelimited("..H!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "..H!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih" + "'", str2, "..H!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
    }

    @Test
    public void test10782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10782");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trimToEmpty("                           aaaaaaaaaa                                                                                                         HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaa                                                                                                         HI!" + "'", str1, "aaaaaaaaaa                                                                                                         HI!");
    }

    @Test
    public void test10783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10783");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                       ", "                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!          ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test10784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10784");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.stripToEmpty("!#########################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!#########################" + "'", str1, "!#########################");
    }

    @Test
    public void test10785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10785");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isWhitespace("HHHHHH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10786");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.split("       ...", "");
        java.lang.String str5 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray3, '4');
        int int6 = org.apache.commons.lang.StringUtils.lastIndexOfAny("AAAAAAAAAAAAAAAAAAAAAAA...aaaaaaaaaaaaaa###", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "       ..." });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "       ..." + "'", str5, "       ...");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test10787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10787");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.remove("                                                     HI!HI!HI!HI!HI!HI!HI", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                     HI!HI!HI!HI!HI!HI!HI" + "'", str2, "                                                     HI!HI!HI!HI!HI!HI!HI");
    }

    @Test
    public void test10788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10788");
        char[] charArray10 = new char[] { 'a', 'a', '4' };
        boolean boolean11 = org.apache.commons.lang.StringUtils.containsAny("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", charArray10);
        boolean boolean12 = org.apache.commons.lang.StringUtils.containsAny("                                                                                       ...", charArray10);
        boolean boolean13 = org.apache.commons.lang.StringUtils.containsOnly("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH", charArray10);
        int int14 = org.apache.commons.lang.StringUtils.indexOfAny("HI!", charArray10);
        int int15 = org.apache.commons.lang.StringUtils.indexOfAny("h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih", charArray10);
        boolean boolean16 = org.apache.commons.lang.StringUtils.containsAny("!IHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", charArray10);
        boolean boolean17 = org.apache.commons.lang.StringUtils.containsOnly("hi!                      aaah                                         hi!                      aaah                                         hi!                      aaah               Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { 'a', 'a', '4' });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test10789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10789");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeEndIgnoreCase("i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str2, "i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test10790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10790");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("                                                                                                                                                                   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                                                                                                                                   HI", "HI", "HI", "HI", "HI", "HI", "HI", "HI", "HI", "HI", "HI", "HI", "HI", "HI", "HI", "HI", "HI" });
    }

    @Test
    public void test10791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10791");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.strip("", "aaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10792");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.defaultIfEmpty("!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!i!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih", "                      ...aaaaaaaaaaaaaaaaaaaaaaaaaaa   hi                      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!i!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih" + "'", str2, "!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!i!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih    !IH   A!ih");
    }

    @Test
    public void test10793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10793");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.remove("444hi!4444", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444hi!4444" + "'", str2, "444hi!4444");
    }

    @Test
    public void test10794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10794");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.difference("", "       hi!                      ...hihi!                      ...!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       hi!                      ...hihi!                      ...!" + "'", str2, "       hi!                      ...hihi!                      ...!");
    }

    @Test
    public void test10795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10795");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeStart("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          aaaaaaaaaaaaaa################################i", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          aaaaaaaaaaaaaa################################i" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          aaaaaaaaaaaaaa################################i");
    }

    @Test
    public void test10796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10796");
        char[] charArray6 = new char[] { '#', 'a', 'a', ' ' };
        boolean boolean7 = org.apache.commons.lang.StringUtils.containsAny("", charArray6);
        boolean boolean8 = org.apache.commons.lang.StringUtils.containsOnly("", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '#', 'a', 'a', ' ' });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test10797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10797");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replace("   HI!       ...aaaaaaaaaaaaaa##       hi!aaaaaaaaaaaaaaaaaaaaaaaaa#####...   HI!             ######", "#########################!ih       ########A...                     ", "                                                                                                                                                                                                                                                                                            HI                       ...H");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   HI!       ...aaaaaaaaaaaaaa##       hi!aaaaaaaaaaaaaaaaaaaaaaaaa#####...   HI!             ######" + "'", str3, "   HI!       ...aaaaaaaaaaaaaa##       hi!aaaaaaaaaaaaaaaaaaaaaaaaa#####...   HI!             ######");
    }

    @Test
    public void test10798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10798");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.substringBetween("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "", "                                                 ..");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test10799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10799");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("IIIIIII...IIIIIIII...IIIIIIII...IIIIIIII...IIIIIIII...IIIIIIII...IIIIIIII...IIIIIIII...IIIIIIII...IIIIIIII...");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "IIIIIII...IIIIIIII...IIIIIIII...IIIIIIII...IIIIIIII...IIIIIIII...IIIIIIII...IIIIIIII...IIIIIIII...IIIIIIII..." });
    }

    @Test
    public void test10800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10800");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.reverse("   HI!       ...aaaaaaaaaaaaaa##########################...   HI!             ######");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "######             !IH   ...##########################aaaaaaaaaaaaaa...       !IH   " + "'", str1, "######             !IH   ...##########################aaaaaaaaaaaaaa...       !IH   ");
    }

    @Test
    public void test10801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10801");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.stripToNull("...i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h..." + "'", str1, "...i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h...");
    }

    @Test
    public void test10802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10802");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.defaultString("HI!                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!" + "'", str1, "HI!                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!");
    }

    @Test
    public void test10803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10803");
        boolean boolean2 = org.apache.commons.lang.StringUtils.endsWith(" ...hihi! hi! #...!", "                                                                       Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa..");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10804");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang.StringUtils.upperCase("       hi!aaaaaaaaaa4444444444...", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10805");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.mid("444HI!4444", 84, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test10806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10806");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.center("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!aaaaaaaaaaaaaaaaaaaaaa", 74, "A...                     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!aaaaaaaaaaaaaaaaaaaaaaA" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!aaaaaaaaaaaaaaaaaaaaaaA");
    }

    @Test
    public void test10807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10807");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.lowerCase("hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10808");
        char[] charArray14 = new char[] { '#', 'a', 'a', ' ' };
        boolean boolean15 = org.apache.commons.lang.StringUtils.containsAny("", charArray14);
        int int16 = org.apache.commons.lang.StringUtils.indexOfAnyBut("                                                    ", charArray14);
        boolean boolean17 = org.apache.commons.lang.StringUtils.containsAny("HI!", charArray14);
        boolean boolean18 = org.apache.commons.lang.StringUtils.containsNone("                                                   ", charArray14);
        boolean boolean19 = org.apache.commons.lang.StringUtils.containsAny("                                                                                                    ", charArray14);
        boolean boolean20 = org.apache.commons.lang.StringUtils.containsOnly("                                                                                       ...", charArray14);
        boolean boolean21 = org.apache.commons.lang.StringUtils.containsOnly("       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!", charArray14);
        boolean boolean22 = org.apache.commons.lang.StringUtils.containsAny("hI!", charArray14);
        boolean boolean23 = org.apache.commons.lang.StringUtils.containsNone("aaaaaaaaaaaaaaaaaaaaaaaaaaaaa   HI!   a", charArray14);
        int int24 = org.apache.commons.lang.StringUtils.indexOfAny("                                         HI                       ...H", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '#', 'a', 'a', ' ' });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test10809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10809");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("                                                                                                             aaaaaaa...", "HI!", 50);
        java.lang.String str5 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray3, '4');
        java.lang.Class<?> wildcardClass6 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                                                                                             aaaaaaa..." });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                                                                                                             aaaaaaa..." + "'", str5, "                                                                                                             aaaaaaa...");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test10810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10810");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.leftPad("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIa...", 33, "                i!                      ...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIa..." + "'", str3, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIa...");
    }

    @Test
    public void test10811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10811");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.chop("       !ihAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!ihAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "       !ihAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!ihAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "       !ihAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!ihAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test10812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10812");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.stripStart("aaaaaaaaaaaaaaaaaaaaaaaaa!ih       hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "                                                                                     HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaa!ih       hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaa!ih       hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
    }

    @Test
    public void test10813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10813");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsNone("                                                                         hi                       ...h", "#AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10814");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.leftPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!", 469, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!");
    }

    @Test
    public void test10815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10815");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("                                        ", '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                        " });
    }

    @Test
    public void test10816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10816");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.split("    !IH   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa", 'a');
        java.lang.String[] strArray7 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("                                                    ", '4');
        int int8 = org.apache.commons.lang.StringUtils.indexOfAny("                                                                                              ", strArray7);
        java.lang.String str9 = org.apache.commons.lang.StringUtils.replaceEach("aaaaaaaaaa                                                           ", strArray3, strArray7);
        java.lang.String str10 = org.apache.commons.lang.StringUtils.getCommonPrefix(strArray7);
        java.lang.String str14 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray7, "   HI!   ", 77, 51);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "    !IH   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "                                                    " });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "aaaaaaaaaa                                                           " + "'", str9, "aaaaaaaaaa                                                           ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "                                                    " + "'", str10, "                                                    ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test10817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10817");
        int int2 = org.apache.commons.lang.StringUtils.indexOf("                                         hi!                      ...h", "######");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10818");
        int int3 = org.apache.commons.lang.StringUtils.indexOf("i!...", '#', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10819");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.split("#################                     hi!                      ...hihi!                      ...!              #################", "", (-1));
        java.lang.String[] strArray5 = org.apache.commons.lang.StringUtils.stripAll(strArray3, "i!       ####################################################################################################");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "#################                     hi!                      ...hihi!                      ...!              #################" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!                      ...hihi!                      ..." });
    }

    @Test
    public void test10820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10820");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.stripEnd(" ...hihi! hi! #...!", "       !ihAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!ihAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " ...hihi! hi! #..." + "'", str2, " ...hihi! hi! #...");
    }

    @Test
    public void test10821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10821");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trim("ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!i    !IH   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA  hi!aaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!i    !IH   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA  hi!aaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!i    !IH   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA  hi!aaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10822");
        char[] charArray9 = new char[] { '#', 'a', 'a', ' ' };
        boolean boolean10 = org.apache.commons.lang.StringUtils.containsAny("", charArray9);
        int int11 = org.apache.commons.lang.StringUtils.indexOfAny("HI!", charArray9);
        boolean boolean12 = org.apache.commons.lang.StringUtils.containsNone("                                                    ", charArray9);
        boolean boolean13 = org.apache.commons.lang.StringUtils.containsAny("                                                                                          aaaaaaaaaa", charArray9);
        boolean boolean14 = org.apache.commons.lang.StringUtils.containsNone("                                                     HI!HI!HI!HI!HI!HI!HI", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', 'a', 'a', ' ' });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test10823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10823");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("i!                      ..", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!");
        int int3 = org.apache.commons.lang.StringUtils.indexOfDifference(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                      .." });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10824");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.chop("HI!   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!         " + "'", str1, "HI!   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!         ");
    }

    @Test
    public void test10825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10825");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("444444444444                       ...444444444444", "                                            HI!                                              ", 932);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "444444444444                       ...444444444444" });
    }

    @Test
    public void test10826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10826");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphanumeric("h...                      !ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10827");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.right("######", 50);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "######" + "'", str2, "######");
    }

    @Test
    public void test10828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10828");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.split("                                                                                                                                                                                                     aaaaaaaaaa                                                                                                                                                                     ", "      !       ", 60);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aaaaaaaaaa" });
    }

    @Test
    public void test10829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10829");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang.StringUtils.lowerCase("       hi!#########################       hi!###################################################IHh", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10830");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("                                                    ", "HI!");
        int int5 = org.apache.commons.lang.StringUtils.lastIndexOfAny("          ", strArray4);
        java.lang.String[] strArray6 = org.apache.commons.lang.StringUtils.stripAll(strArray4);
        java.lang.String str7 = org.apache.commons.lang.StringUtils.getCommonPrefix(strArray4);
        java.lang.String[] strArray12 = org.apache.commons.lang.StringUtils.split("                                                                   ...", "##########", 128);
        java.lang.String[] strArray15 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                   ", "HI!");
        java.lang.String str16 = org.apache.commons.lang.StringUtils.getCommonPrefix(strArray15);
        java.lang.String str17 = org.apache.commons.lang.StringUtils.replaceEach("                                                                                                                                     ...", strArray12, strArray15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang.StringUtils.replaceEachRepeatedly("                                                                                 hi!", strArray4, strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: TimeToLive of -1 is less than 0:                                                                    ...               ...                             hi!");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "                                                    " });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                                    " + "'", str7, "                                                    ");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "                                                                   ..." });
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "                                                   " });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "                                                   " + "'", str16, "                                                   ");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "                                                                                                                     " + "'", str17, "                                                                                                                     ");
    }

    @Test
    public void test10831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10831");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.center("hi!     ", 48, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444hi!     44444444444444444444" + "'", str3, "44444444444444444444hi!     44444444444444444444");
    }

    @Test
    public void test10832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10832");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.strip("       hi!                 hi!                 hi!                                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!                 hi!                 hi!" + "'", str1, "hi!                 hi!                 hi!");
    }

    @Test
    public void test10833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10833");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444444444444                                                          aaaaaaaaaa    ", "                                                                                     HI!", 75);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test10834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10834");
        char[] charArray7 = new char[] { '#', 'a', 'a', ' ' };
        boolean boolean8 = org.apache.commons.lang.StringUtils.containsAny("", charArray7);
        int int9 = org.apache.commons.lang.StringUtils.indexOfAnyBut("...h", charArray7);
        int int10 = org.apache.commons.lang.StringUtils.indexOfAnyBut("                                                                                                                                                                                                                                                                                                                                                                               HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                               aaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '#', 'a', 'a', ' ' });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 367 + "'", int10 == 367);
    }

    @Test
    public void test10835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10835");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substring("!HI!HI!H  ", 896);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10836");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trimToNull("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hI                                                                                                                                                                                                                                                                                                                                                                                                                                                                       HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                               aaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hI                                                                                                                                                                                                                                                                                                                                                                                                                                                                       HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                               aaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!" + "'", str1, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hI                                                                                                                                                                                                                                                                                                                                                                                                                                                                       HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                               aaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!");
    }

    @Test
    public void test10837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10837");
        int int2 = org.apache.commons.lang.StringUtils.indexOfAny("...AAAAAAAAAAAAAAAAAAAAAAAAAAAAA.", "aaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10838");
        int int2 = org.apache.commons.lang.StringUtils.indexOf("                           hi!                             aaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                           hi!                         ", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 59 + "'", int2 == 59);
    }

    @Test
    public void test10839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10839");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("aaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA               haaa                      !ih                                         haaa                      !ih                                         haaa                      !ih                                         ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
    }

    @Test
    public void test10840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10840");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("i!             hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################", "A   HI!    hi!", (int) (short) 0);
        java.lang.String str5 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray4);
        int int6 = org.apache.commons.lang.StringUtils.lastIndexOfAny("                                                                                                                                                                     !IHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "i!             hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "i!             hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################" + "'", str5, "i!             hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test10841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10841");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("A   HI!    ", "   HI!       ...aaaaaaaaaaaaaa##########################...   HI!             #####");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "A" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A" + "'", str3, "A");
    }

    @Test
    public void test10842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10842");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringAfter("aaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...", "                                            HI!                                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10843");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceChars("", "hi!                                hi!                                hi!                                hi!                                hi!                                hi!                                hi!                                hi!                                hi!                                hi!                        ", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test10844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10844");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang.StringUtils.abbreviate("                                                              AAAAAA", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10845");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.abbreviate("                     HI!HI!Haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa h aaaaaaaaaaaaaaaaaaaaaaaaa   ", 89);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                     HI!HI!Haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa h aaaaaaaaaaaaaa..." + "'", str2, "                     HI!HI!Haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa h aaaaaaaaaaaaaa...");
    }

    @Test
    public void test10846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10846");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByCharacterTypeCamelCase("aaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   HI!       ");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOfAny("", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aaaaaaaaaa", "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "   ", "HI", "!", "       " });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10847");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang.StringUtils.upperCase("#################                     hi!                      ...hihi!                      ...!              #################", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10848");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAsciiPrintable("                                     hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10849");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("    !IH   AAAAAAAAAAAAAAAAAAAAAA", "                                                                                                                                                                                                                                                                    i!...");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "    !IH   AAAAAAAAAAAAAAAAAAAAAA" });
    }

    @Test
    public void test10850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10850");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.center("                      aaa                         ...aaaaaaaaaaaaaa#############################", 172, "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaa                      aaa                         ...aaaaaaaaaaaaaa#############################Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaa" + "'", str3, "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaa                      aaa                         ...aaaaaaaaaaaaaa#############################Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaa");
    }

    @Test
    public void test10851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10851");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringAfterLast("    !!AAAAAAAAAAAAAAAAAAAAAAAAAH   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10852");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.mid("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!IHaaaaaaaaaaaaaaaaaaaaaaa", 330, 896);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test10853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10853");
        char[] charArray9 = new char[] { '#', 'a', 'a', ' ' };
        boolean boolean10 = org.apache.commons.lang.StringUtils.containsAny("", charArray9);
        int int11 = org.apache.commons.lang.StringUtils.indexOfAnyBut("                                                    ", charArray9);
        boolean boolean12 = org.apache.commons.lang.StringUtils.containsNone("       ...", charArray9);
        int int13 = org.apache.commons.lang.StringUtils.indexOfAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!", charArray9);
        boolean boolean14 = org.apache.commons.lang.StringUtils.containsAny("####################################################################################################", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', 'a', 'a', ' ' });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test10854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10854");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replace("                                                                                                 HI!", "                                                                                                                                                                     !IHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "!IHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                 HI!" + "'", str3, "                                                                                                 HI!");
    }

    @Test
    public void test10855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10855");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.reverse("                                                                                    ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...                                                                                    " + "'", str1, "...                                                                                    ");
    }

    @Test
    public void test10856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10856");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.split("hi", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!    ", 97);
        java.lang.String str7 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray3, '#', 323, 305);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test10857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10857");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.leftPad("###################################################################################################", 210);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                               ###################################################################################################" + "'", str2, "                                                                                                               ###################################################################################################");
    }

    @Test
    public void test10858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10858");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.substring("################################IH", 25, 85);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#######IH" + "'", str3, "#######IH");
    }

    @Test
    public void test10859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10859");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceChars("#########################aihHHHHHHH#########################aihHHHHHHH#########################aihHHHHHHH#########################aihHHHHHHH#########################aihHHHHHHH#########################aihHHHHHHH#########################aihHHHHHHH#########################aihHHHHHHH#########################aih", "aaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   HI!       ", "...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#########################.!I#########################.!I#########################.!I#########################.!I#########################.!I#########################.!I#########################.!I#########################.!I#########################.!I" + "'", str3, "#########################.!I#########################.!I#########################.!I#########################.!I#########################.!I#########################.!I#########################.!I#########################.!I#########################.!I");
    }

    @Test
    public void test10860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10860");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.upperCase("aaaaaaaaaa                                                                                                         HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAA                                                                                                         HI!" + "'", str1, "AAAAAAAAAA                                                                                                         HI!");
    }

    @Test
    public void test10861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10861");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeStartIgnoreCase("          ...                                ...                                ...                                ...                                ...                                ...                                ...                                ...                                ...                    ", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444#");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "          ...                                ...                                ...                                ...                                ...                                ...                                ...                                ...                                ...                    " + "'", str2, "          ...                                ...                                ...                                ...                                ...                                ...                                ...                                ...                                ...                    ");
    }

    @Test
    public void test10862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10862");
        java.lang.String[] strArray5 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("hi!", '4');
        java.lang.String[] strArray9 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("                                                                                    ...", "H!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih       hi!aaaaaaaaaaaaaaaaaaaaaaaaa", 50);
        java.lang.String str10 = org.apache.commons.lang.StringUtils.replaceEach("a4444444444444444444444444444444444", strArray5, strArray9);
        int int11 = org.apache.commons.lang.StringUtils.lastIndexOfAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!    ", strArray5);
        java.lang.String[] strArray14 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("hAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa############       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!########################", "##########                                                                                          ");
        java.lang.String[] strArray16 = org.apache.commons.lang.StringUtils.stripAll(strArray14, "aaaaaaaaaaaaaaaaaaaaa...");
        java.lang.String str20 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray16, '4', 0, 32);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.apache.commons.lang.StringUtils.replaceEach("i! i! i! i! i! i! i! i! i! i! i! i! i! i! i! i! i!                 ", strArray5, strArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 236");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "                                                                                    ..." });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "a4444444444444444444444444444444444" + "'", str10, "a4444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 89 + "'", int11 == 89);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hA4444444444444444444hi!444444444444" + "'", str20, "hA4444444444444444444hi!444444444444");
    }

    @Test
    public void test10863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10863");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitByCharacterTypeCamelCase("4444444444444444                                                          aaaaaaaaaa    ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "4444444444444444", "                                                          ", "aaaaaaaaaa", "    " });
    }

    @Test
    public void test10864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10864");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isBlank((java.lang.CharSequence) " hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10865");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlpha("hi!                 hi!                 hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10866");
        boolean boolean2 = org.apache.commons.lang.StringUtils.contains("...aaaa...", "aaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10867");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.deleteWhitespace("               aaaaaaaaaaaaaaaaaaaaaaaaaaaaA...I!HI...aaaaaaaaaaaaaaaaaaaaaaaaaaaaA               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaA...I!HI...aaaaaaaaaaaaaaaaaaaaaaaaaaaaA" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaA...I!HI...aaaaaaaaaaaaaaaaaaaaaaaaaaaaA");
    }

    @Test
    public void test10868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10868");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trimToEmpty("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                        hi!                         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                        hi!" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                        hi!");
    }

    @Test
    public void test10869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10869");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.upperCase("############aaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "############AAAAAAA...AAAAAAAA...AAAAAAAA...AAAAAAAA...AAAAAAAA...AAAAAAAA...AAAAAAAA...AAAAAAAA...AAAAAAAA...AAAAAAAA..." + "'", str1, "############AAAAAAA...AAAAAAAA...AAAAAAAA...AAAAAAAA...AAAAAAAA...AAAAAAAA...AAAAAAAA...AAAAAAAA...AAAAAAAA...AAAAAAAA...");
    }

    @Test
    public void test10870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10870");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceChars("aaaAaaaHI!aaaa", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!    ###", "#########################!ih!!!!!!!#########################!ih!!!!!!!#########################!ih!!!!!!!#########################!ih!!!!!!!#########################!ih!!!!!!!#########################!ih!!!!!!!#########################!ih!!!!!!!#########################!ih!!!!!!!#########################!ih");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaa#aaa###aaaa" + "'", str3, "aaa#aaa###aaaa");
    }

    @Test
    public void test10871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10871");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.leftPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!    ", 280, "....aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa...i!...aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa...i!...aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "....aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa...i!...aaaa......aaaa......aaaa......aaaa....aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!    " + "'", str3, "....aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa...i!...aaaa......aaaa......aaaa......aaaa....aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!    ");
    }

    @Test
    public void test10872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10872");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceChars("hihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi", 'a', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi" + "'", str3, "hihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi");
    }

    @Test
    public void test10873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10873");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.leftPad("....aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa...i!...aaaa......aaaa......aaaa......aaaa....aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!    ", 51, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "....aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa...i!...aaaa......aaaa......aaaa......aaaa....aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!    " + "'", str3, "....aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa...i!...aaaa......aaaa......aaaa......aaaa....aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!    ");
    }

    @Test
    public void test10874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10874");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsAny("       .", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa   HI!       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test10875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10875");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!", "       ...", 42);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 31, 503);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 31 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!" });
    }

    @Test
    public void test10876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10876");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeStart("       ..", "                                                                                               444444444444                       ...44444444       hi!aaaaaaaaaaaaaaaaaaaaaaaaa444444444444                       ...444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       .." + "'", str2, "       ..");
    }

    @Test
    public void test10877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10877");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceChars("h#!#ih#!#ih#!#ih#!#ih#!#ih#!#ih#!#ih#!#ih#!#ih#!#ih#!#ih#!#ih#!#ih#!#ih#!#ih#!#ih#!#ih#!#ih#!#ih#!#ih#!#ih#!#ih#!#ih#!#ih#!#ih#!#ih#!#ih#!#ih#!#ih#!#ih#!#ih#!#ih", '4', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h#!#ih#!#ih#!#ih#!#ih#!#ih#!#ih#!#ih#!#ih#!#ih#!#ih#!#ih#!#ih#!#ih#!#ih#!#ih#!#ih#!#ih#!#ih#!#ih#!#ih#!#ih#!#ih#!#ih#!#ih#!#ih#!#ih#!#ih#!#ih#!#ih#!#ih#!#ih#!#ih" + "'", str3, "h#!#ih#!#ih#!#ih#!#ih#!#ih#!#ih#!#ih#!#ih#!#ih#!#ih#!#ih#!#ih#!#ih#!#ih#!#ih#!#ih#!#ih#!#ih#!#ih#!#ih#!#ih#!#ih#!#ih#!#ih#!#ih#!#ih#!#ih#!#ih#!#ih#!#ih#!#ih#!#ih");
    }

    @Test
    public void test10878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10878");
        java.lang.String[] strArray5 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "hi!", 0);
        java.lang.String[] strArray8 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "");
        java.lang.String str9 = org.apache.commons.lang.StringUtils.replaceEachRepeatedly("HI!", strArray5, strArray8);
        java.lang.String str10 = org.apache.commons.lang.StringUtils.getCommonPrefix(strArray5);
        java.lang.String str12 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray5, "###################################################");
        int int13 = org.apache.commons.lang.StringUtils.lastIndexOfAny("44 !ih                                                 !ih44", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HI!" + "'", str9, "HI!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test10879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10879");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsAny("4444444444444444                                                          aaaaaaaaaa    ", "..H!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10880");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.leftPad("                                          ", 172, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##################################################################################################################################                                          " + "'", str3, "##################################################################################################################################                                          ");
    }

    @Test
    public void test10881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10881");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAllLowerCase("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Haa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10882");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trimToEmpty("!IH   A...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!IH   A..." + "'", str1, "!IH   A...");
    }

    @Test
    public void test10883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10883");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphanumeric("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10884");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.chomp("#########################!ih       ########A...                     ", "...                                                                                                                                                                                                                                                                                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#########################!ih       ########A...                     " + "'", str2, "#########################!ih       ########A...                     ");
    }

    @Test
    public void test10885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10885");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.defaultString("....aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa...i!...aaaa......aaaa......aaaa......aaaa....aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "....aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa...i!...aaaa......aaaa......aaaa......aaaa....aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!    " + "'", str1, "....aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa...i!...aaaa......aaaa......aaaa......aaaa....aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!    ");
    }

    @Test
    public void test10886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10886");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("...                                                                   ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test10887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10887");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.overlay("Hi !########################", "i!#########################", 11, 306);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hi !#######i!#########################" + "'", str4, "Hi !#######i!#########################");
    }

    @Test
    public void test10888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10888");
        char[] charArray13 = new char[] { '#', 'a', 'a', ' ' };
        boolean boolean14 = org.apache.commons.lang.StringUtils.containsAny("", charArray13);
        boolean boolean15 = org.apache.commons.lang.StringUtils.containsOnly("aaaaaaaaaa                                                                                          ", charArray13);
        boolean boolean16 = org.apache.commons.lang.StringUtils.containsNone("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray13);
        boolean boolean17 = org.apache.commons.lang.StringUtils.containsAny("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray13);
        boolean boolean18 = org.apache.commons.lang.StringUtils.containsNone("   hi!    ", charArray13);
        boolean boolean19 = org.apache.commons.lang.StringUtils.containsNone("...", charArray13);
        int int20 = org.apache.commons.lang.StringUtils.indexOfAny("                                                                                    ...", charArray13);
        boolean boolean21 = org.apache.commons.lang.StringUtils.containsNone("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!        ", charArray13);
        boolean boolean22 = org.apache.commons.lang.StringUtils.containsAny("A! A! AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   AA!A! A! Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '#', 'a', 'a', ' ' });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test10889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10889");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlpha("4444444444444444                                                          aaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10890");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.leftPad("...aaaa...", 229);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                           ...aaaa..." + "'", str2, "                                                                                                                                                                                                                           ...aaaa...");
    }

    @Test
    public void test10891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10891");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.remove("!IH   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...", "                                                                                                                                    ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!IH   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA..." + "'", str2, "!IH   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...");
    }

    @Test
    public void test10892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10892");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.strip("                 ", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA!IHAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                 " + "'", str2, "                 ");
    }

    @Test
    public void test10893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10893");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.capitalize("....aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa...i!...aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa...i!...aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "....aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa...i!...aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa...i!...aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa..." + "'", str1, "....aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa...i!...aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa...i!...aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa......aaaa...");
    }

    @Test
    public void test10894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10894");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBetween("                                                   ", "ih                                                  ih");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test10895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10895");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.rightPad("hi!#########################hi!#########################hi!#########################hi!#########################hi!#########################hi!#########################hi!#########################hi!#########################hi!#########################hi!########################", (int) (byte) 100, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!#########################hi!#########################hi!#########################hi!#########################hi!#########################hi!#########################hi!#########################hi!#########################hi!#########################hi!########################" + "'", str3, "hi!#########################hi!#########################hi!#########################hi!#########################hi!#########################hi!#########################hi!#########################hi!#########################hi!#########################hi!########################");
    }

    @Test
    public void test10896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10896");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphanumeric("################################IHh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10897");
        char[] charArray16 = new char[] { '#', 'a', 'a', ' ' };
        boolean boolean17 = org.apache.commons.lang.StringUtils.containsAny("", charArray16);
        int int18 = org.apache.commons.lang.StringUtils.indexOfAnyBut("                                                    ", charArray16);
        boolean boolean19 = org.apache.commons.lang.StringUtils.containsAny("HI!", charArray16);
        boolean boolean20 = org.apache.commons.lang.StringUtils.containsNone("                                                   ", charArray16);
        int int21 = org.apache.commons.lang.StringUtils.indexOfAny("HI!", charArray16);
        int int22 = org.apache.commons.lang.StringUtils.indexOfAnyBut("hi!", charArray16);
        boolean boolean23 = org.apache.commons.lang.StringUtils.containsOnly("       HI!", charArray16);
        boolean boolean24 = org.apache.commons.lang.StringUtils.containsNone("A   HI!    hi!", charArray16);
        boolean boolean25 = org.apache.commons.lang.StringUtils.containsNone("HI!                      AAA       ", charArray16);
        boolean boolean26 = org.apache.commons.lang.StringUtils.containsAny("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi", charArray16);
        boolean boolean27 = org.apache.commons.lang.StringUtils.containsOnly("                                                        !IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!", charArray16);
        boolean boolean28 = org.apache.commons.lang.StringUtils.containsAny("#########", charArray16);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '#', 'a', 'a', ' ' });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test10898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10898");
        char[] charArray14 = new char[] { '#', 'a', 'a', ' ' };
        boolean boolean15 = org.apache.commons.lang.StringUtils.containsAny("", charArray14);
        int int16 = org.apache.commons.lang.StringUtils.indexOfAnyBut("                                                    ", charArray14);
        boolean boolean17 = org.apache.commons.lang.StringUtils.containsAny("HI!", charArray14);
        boolean boolean18 = org.apache.commons.lang.StringUtils.containsNone("                                                   ", charArray14);
        int int19 = org.apache.commons.lang.StringUtils.indexOfAny("HI!", charArray14);
        int int20 = org.apache.commons.lang.StringUtils.indexOfAnyBut("hi!", charArray14);
        int int21 = org.apache.commons.lang.StringUtils.indexOfAnyBut("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!", charArray14);
        boolean boolean22 = org.apache.commons.lang.StringUtils.containsOnly("I!                      ...", charArray14);
        int int23 = org.apache.commons.lang.StringUtils.indexOfAnyBut("                                              ", charArray14);
        boolean boolean24 = org.apache.commons.lang.StringUtils.containsNone("          ####################################################", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '#', 'a', 'a', ' ' });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test10899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10899");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.strip("H!IH!IH!IH!IH!...", "                                aaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H!IH!IH!IH!IH!..." + "'", str2, "H!IH!IH!IH!IH!...");
    }

    @Test
    public void test10900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10900");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.lowerCase("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!    " + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!    ");
    }

    @Test
    public void test10901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10901");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphanumeric("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10902");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("                                                                                                      !HHI!H                                                                                                      ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.stripAll(strArray2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                                                                      !HHI!H                                                                                                      " });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "!HHI!H" });
    }

    @Test
    public void test10903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10903");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceOnce(" HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                       ", "                         !ih                                                 !ih                   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI" + "'", str3, " HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
    }

    @Test
    public void test10904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10904");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphaSpace("aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10905");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNumericSpace("       hi!aaaaaaaaaa44444444444   HI!       ...aaaaaaaaaaaaaa##########################...   HI!   444444444444aaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaa!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!aaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa       hi!aaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10906");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphanumericSpace("...#################       hi!###################################################IHh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10907");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceChars("aaaaaaaaaaaaaaaaaaaaaaaaaaaaa   HI!   ", '#', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa   HI!   " + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa   HI!   ");
    }

    @Test
    public void test10908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10908");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("444444444444444444444444444444444444444444444444##################################################", "I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "444444444444444444444444444444444444444444444444##################################################" });
    }

    @Test
    public void test10909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10909");
        boolean boolean2 = org.apache.commons.lang.StringUtils.contains("AAAAAAAAAA", 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10910");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!", "          ...                                ...                                ...                                ...                                ...                                ...                                ...                                ...                                ...                    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10911");
        int int2 = org.apache.commons.lang.StringUtils.lastIndexOf(" HI!HI!H#######...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H  ", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10912");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("", "aaaaaaaaaa");
        java.lang.String str6 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray4, 'a');
        java.lang.String[] strArray9 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!    ", "                                                                                          ");
        java.lang.String str10 = org.apache.commons.lang.StringUtils.replaceEachRepeatedly("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!", strArray4, strArray9);
        int int11 = org.apache.commons.lang.StringUtils.indexOfAny("aaaaaaaaaaaaaaaa aaaaaaaaaaaaaaa", strArray4);
        java.lang.String str13 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray4, 'a');
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!    " });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!" + "'", str10, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test10913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10913");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("...IH!I...", "                         ", 99);
        java.lang.String str4 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "...IH!I..." });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "...IH!I..." + "'", str4, "...IH!I...");
    }

    @Test
    public void test10914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10914");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI################################IHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI################################IHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test10915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10915");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAsciiPrintable("hi!###################                                                 ...hi!###################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10916");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("   HI!       ...aaaaaaaaaaaaaa##########################...   HI!   ", "hi!    hA...hi!     ", 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "   HI!       ...aaaaaaaaaaaaaa##########################...   HI!   " });
    }

    @Test
    public void test10917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10917");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.remove("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH", "#########################!ih       ########A...                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH" + "'", str2, "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH");
    }

    @Test
    public void test10918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10918");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("hihihihihihihihihihihihihihihihi", "ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!i    !IH   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA  hi!aaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
    }

    @Test
    public void test10919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10919");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trimToEmpty("hi!                      ...hihi!        444444444444444444444444444444444444444444444444aaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!                      ...hihi!        444444444444444444444444444444444444444444444444aaaaaa" + "'", str1, "hi!                      ...hihi!        444444444444444444444444444444444444444444444444aaaaaa");
    }

    @Test
    public void test10920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10920");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeStartIgnoreCase("                                                                                                                                    !ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih                                !ih  ...", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                    !ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih                                !ih  ..." + "'", str2, "                                                                                                                                    !ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih                                !ih  ...");
    }

    @Test
    public void test10921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10921");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.stripToNull("                                                                                                                                                                                                                                                                                                                                            ################hi!                      ...a################hi!                      ...################                                                    ahi!                      ...################                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "################hi!                      ...a################hi!                      ...################                                                    ahi!                      ...################" + "'", str1, "################hi!                      ...a################hi!                      ...################                                                    ahi!                      ...################");
    }

    @Test
    public void test10922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10922");
        boolean boolean2 = org.apache.commons.lang.StringUtils.endsWith("", "       !IHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!IHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10923");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.substring("HI!   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!                 HI!          ", 27, 121);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!HI!                 HI" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!HI!                 HI");
    }

    @Test
    public void test10924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10924");
        boolean boolean2 = org.apache.commons.lang.StringUtils.endsWith("                                 ....                                             ...                                  ", "AAAAAAAAAAAAAA################################IH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10925");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.center(" HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!...", (int) (byte) 0, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!..." + "'", str3, " HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!...");
    }

    @Test
    public void test10926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10926");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trimToEmpty("                      aaa                         ...aaaaaaaaaaaaaa#############################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaa                         ...aaaaaaaaaaaaaa#############################" + "'", str1, "aaa                         ...aaaaaaaaaaaaaa#############################");
    }

    @Test
    public void test10927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10927");
        java.lang.String[] strArray5 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "hi!", 0);
        java.lang.String[] strArray8 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "");
        java.lang.String str9 = org.apache.commons.lang.StringUtils.replaceEachRepeatedly("HI!", strArray5, strArray8);
        java.lang.String[] strArray11 = org.apache.commons.lang.StringUtils.splitByCharacterTypeCamelCase("       hi!");
        java.lang.String str13 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray11, "hi!                      ...");
        java.lang.String str14 = org.apache.commons.lang.StringUtils.replaceEach("                         ...aaaaaaaaaaaaaa################################IHh                      ", strArray5, strArray11);
        java.lang.String[] strArray15 = org.apache.commons.lang.StringUtils.stripAll(strArray11);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HI!" + "'", str9, "HI!");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "       ", "hi", "!" });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "       hi!                      ...hihi!                      ...!" + "'", str13, "       hi!                      ...hihi!                      ...!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                         ...aaaaaaaaaaaaaa################################IHh                      " + "'", str14, "                         ...aaaaaaaaaaaaaa################################IHh                      ");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "hi", "!" });
    }

    @Test
    public void test10928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10928");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAsciiPrintable("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10929");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsAny("Aaaaaaaaaaaaaaaa          Aaaaaaaaaaaaaaaaa", "ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!i    !IH   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA  hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test10930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10930");
        int int2 = org.apache.commons.lang.StringUtils.indexOfAnyBut("AAAAAAAAAAAAAAAAAAAAAA############################################################################################i!                      ..############################################################################################", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10931");
        int int2 = org.apache.commons.lang.StringUtils.indexOfAny("I!", "                                                                                                                                                                                                                                                                                                      ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10932");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.substringsBetween("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                       ", "aaaaaaaaaa                                                                                       ", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test10933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10933");
        boolean boolean2 = org.apache.commons.lang.StringUtils.startsWith("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!", "A##################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10934");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.stripStart("#########################   hi!       ...AAAAAAAAAAAAAA##########################...   hi!   ########A...", "                                                                                                                                                                                                                                                                       ..                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#########################   hi!       ...AAAAAAAAAAAAAA##########################...   hi!   ########A..." + "'", str2, "#########################   hi!       ...AAAAAAAAAAAAAA##########################...   hi!   ########A...");
    }

    @Test
    public void test10935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10935");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsOnly("...#################       hi!###################################################IHh", "HI!#########################HI!#########################HI!#########################HI!#########################HI!#########################HI!#########################HI!#########################HI!#########################HI!#########################HI!########################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10936");
        int int3 = org.apache.commons.lang.StringUtils.ordinalIndexOf("aaaaaaaaaa...!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH ", "A! A! AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   AA!A! A! Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 265);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10937");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.chomp("       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!", "                                                HI!                                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!" + "'", str2, "       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!");
    }

    @Test
    public void test10938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10938");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphanumeric("Aaaaaaaaaaaaaa################################ihaaaaaaaaaaaaaa################################ihaaaaaaaaaaaaaa################################ihaaaaaaaaaaaaaa################################ihaaaaaaaaaaaaaa################################ihaaaaaaaaaaaaaa################################ihaaaaaaaaaaaaaa################################ihaaaaaaaaaaaaaa################################ihaaaaaaaaaaaaaa################################ihaaaaaaaaaaaaaa################################ihaaaaaaaaaaaaaa################################ihaaaaaaaaaaaaaa################################ihaaaaaaaaaaaaaa################################ihaaaaaaaaaaaaaa################################ihaaaaaaaaaaaaaa################################ihaaaaaaaaaaaaaa################################ihaaaaaaaaaaaaaa################################ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10939");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
    }

    @Test
    public void test10940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10940");
        int int3 = org.apache.commons.lang.StringUtils.indexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   HI!", '4', 114);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10941");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA               haaa                      !ih                                         haaa                      !ih                                         haaa                      !ih                                         ", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!    i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h!IH");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA               haaa                      !ih                                         haaa                      !ih                                         haaa                      !ih                                         " });
    }

    @Test
    public void test10942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10942");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.chomp("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hI                                                                                        ", "...AAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hI                                                                                        " + "'", str2, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hI                                                                                        ");
    }

    @Test
    public void test10943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10943");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.defaultIfEmpty("I!AAAAAAAAAAAAAAAAAAAAAAAAA", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!AAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "I!AAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test10944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10944");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.lowerCase("HAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10945");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNotBlank((java.lang.CharSequence) "!...!ihih...!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10946");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.center("      ...", 817, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444      ...44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444      ...44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test10947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10947");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("                         !ih                                                 !ih                   ", "          HI!       ...aaaaaaaaaaaaaa##########################...   HI!             ######        ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                         !ih                                                 !ih                   " });
    }

    @Test
    public void test10948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10948");
        java.lang.String[] strArray1 = null;
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.split("hi!", '4');
        java.lang.String str8 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray4, "   HI!    ", 0, (int) (byte) 1);
        java.lang.String str10 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray4, 'a');
        java.lang.String str12 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray4, ' ');
        java.lang.String str13 = org.apache.commons.lang.StringUtils.replaceEach("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4!4I4Haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray1, strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4!4I4Haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str13, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4!4I4Haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10949");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isWhitespace("       hi!#########################                                                                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10950");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.split("Hi!...h", "AaA...I!HI...a                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ", 56);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "i", "h" });
    }

    @Test
    public void test10951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10951");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.strip("                     ...", "############aaaaaaa...aaaaaaaa...aaaaaaaa...aaaaaaaa...AAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                     " + "'", str2, "                     ");
    }

    @Test
    public void test10952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10952");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.leftPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa############       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!########################", 223, "###");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa############       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!########################" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa############       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!#########################       hi!########################");
    }

    @Test
    public void test10953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10953");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAsciiPrintable(" !ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10954");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.difference("                                     hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI", "haAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "haAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "haAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test10955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10955");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi", "                                                          aaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test10956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10956");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.remove("                                                                                                         HI!a                                                             ", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!a" + "'", str2, "HI!a");
    }

    @Test
    public void test10957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10957");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsNone("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaa aaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10958");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.center("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!        ", 91, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!        " + "'", str3, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   HI!        ");
    }

    @Test
    public void test10959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10959");
        int int2 = org.apache.commons.lang.StringUtils.lastIndexOf("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa   HI!   a", "                      aaa                         ...aaaaaaaaaaaaaa#############################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10960");
        char[] charArray12 = new char[] { '#', 'a', 'a', ' ' };
        boolean boolean13 = org.apache.commons.lang.StringUtils.containsAny("", charArray12);
        boolean boolean14 = org.apache.commons.lang.StringUtils.containsOnly("aaaaaaaaaa                                                                                          ", charArray12);
        boolean boolean15 = org.apache.commons.lang.StringUtils.containsNone("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray12);
        int int16 = org.apache.commons.lang.StringUtils.indexOfAnyBut("aaaaaaaaaa", charArray12);
        int int17 = org.apache.commons.lang.StringUtils.indexOfAnyBut("i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", charArray12);
        boolean boolean18 = org.apache.commons.lang.StringUtils.containsAny("                                                          aaaaaaaaaa", charArray12);
        int int19 = org.apache.commons.lang.StringUtils.indexOfAnyBut("       HI!", charArray12);
        int int20 = org.apache.commons.lang.StringUtils.indexOfAny("aaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   HI!      ", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '#', 'a', 'a', ' ' });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 7 + "'", int19 == 7);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test10961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10961");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isWhitespace("AAAAA...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10962");
        boolean boolean2 = org.apache.commons.lang.StringUtils.endsWith("#########################################################################################ih", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI################################IH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10963");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.split("                    ...                                ...                                ...                                ...                                ...                                ...                                ...                                ...                                ...                                    !ih");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray1, 'a');
        java.lang.String str7 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray1, "################hi!                      ...a################hi!                      ...################                                                    ahi!                      ...################                                                    ", 61, 57);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "...", "...", "...", "...", "...", "...", "...", "...", "...", "!ih" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...a...a...a...a...a...a...a...a...a!ih" + "'", str3, "...a...a...a...a...a...a...a...a...a!ih");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test10964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10964");
        boolean boolean2 = org.apache.commons.lang.StringUtils.contains("                                         hi!                      aaah", "         hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HI!aa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10965");
        int int3 = org.apache.commons.lang.StringUtils.ordinalIndexOf("hi aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaa################################ih", 94);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10966");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("...AAAAAA", "                                                                                                                                                                                                                                                                                                                                            ################hi!                      ...a################hi!                      ...################                                                    ahi!                      ...################                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "AAAAAA" });
    }

    @Test
    public void test10967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10967");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeEnd("h...", "#...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h..." + "'", str2, "h...");
    }

    @Test
    public void test10968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10968");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.center("Hi!                      ...h", 31);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " Hi!                      ...h " + "'", str2, " Hi!                      ...h ");
    }

    @Test
    public void test10969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10969");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.remove("                                               ...", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                               ..." + "'", str2, "                                               ...");
    }

    @Test
    public void test10970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10970");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparator(" ...hihi! hi! #...", "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!", 106);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { " ...hihi! hi! #..." });
    }

    @Test
    public void test10971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10971");
        int int2 = org.apache.commons.lang.StringUtils.lastIndexOf("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 999 + "'", int2 == 999);
    }

    @Test
    public void test10972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10972");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.reverse("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH...aaaaaaaaaaaaaaaaaaaaaaaaaaa   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "   aaaaaaaaaaaaaaaaaaaaaaaaaaa...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" + "'", str1, "   aaaaaaaaaaaaaaaaaaaaaaaaaaa...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
    }

    @Test
    public void test10973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10973");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.chop("!##                      AAA       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!##                      AAA      " + "'", str1, "!##                      AAA      ");
    }

    @Test
    public void test10974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10974");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.upperCase("aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!" + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!");
    }

    @Test
    public void test10975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10975");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replace("i!hi!hi!h                                                                                    ...", "################                                                    aaaaaaaaaa################", "444444444                  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "i!hi!hi!h                                                                                    ..." + "'", str3, "i!hi!hi!h                                                                                    ...");
    }

    @Test
    public void test10976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10976");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.upperCase("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444444444444                                                          aaaaaaaaaa    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444444444444                                                          AAAAAAAAAA    " + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444444444444                                                          AAAAAAAAAA    ");
    }

    @Test
    public void test10977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10977");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAllLowerCase("               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10978");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNumeric("                                aaaaaaaaaaaaaaa aaaaaaaaaaaaaaaa                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10979");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isEmpty((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10980");
        int int2 = org.apache.commons.lang.StringUtils.indexOfDifference("                                                                                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaA...I!HI...aaaaaaaaaaaaaaaaaaaaaaaaaaaaA", "444444444444444444444444444444444444444444444444                                                  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10981");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("HI!");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.stripAll(strArray1);
        java.lang.String str4 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray2, "                                                                                                 HI!");
        java.lang.String str5 = org.apache.commons.lang.StringUtils.getCommonPrefix(strArray2);
        java.lang.String[] strArray6 = org.apache.commons.lang.StringUtils.stripAll(strArray2);
        java.lang.String str8 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray6, "    !IH   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa");
        java.lang.String str12 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray6, '#', 172, 77);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "HI!" });
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HI!" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HI!" + "'", str4, "HI!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HI!" + "'", str5, "HI!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "HI!" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HI!" + "'", str8, "HI!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test10982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10982");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!    ", "h", 42);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   ", "i!    " });
    }

    @Test
    public void test10983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10983");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isEmpty((java.lang.CharSequence) "                     ...hihi!                      .                                                                                                                                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10984");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBefore("!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa hi!aaaaaaaaaaaaaaaaaaaaaaaaa", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10985");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.upperCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                         HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                         HI!" + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                         HI!");
    }

    @Test
    public void test10986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10986");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trimToNull("aaaaaaaaaa                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaa" + "'", str1, "aaaaaaaaaa");
    }

    @Test
    public void test10987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10987");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsOnly("################################IHaaaaaaaaaaahi!", "                                                                                          aaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10988");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.remove("    ...", "              hi!                      ...hihi!                      ...!                        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    ..." + "'", str2, "    ...");
    }

    @Test
    public void test10989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10989");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.remove("   ", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   " + "'", str2, "   ");
    }

    @Test
    public void test10990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10990");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBeforeLast("             ...AAAAAAAAAAAAAA##########################...         ", "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "             ...AAAAAAAAAAAAAA##########################...         " + "'", str2, "             ...AAAAAAAAAAAAAA##########################...         ");
    }

    @Test
    public void test10991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10991");
        int int2 = org.apache.commons.lang.StringUtils.indexOfAny("aaaaa aaaaaaaaaaaaaaaa", "               aaaaaaaaaaaaaaaaaaaaaaaaaaaaA...I!HI...aaaaaaaaaaaaaaaaaaaaaaaaaaaaA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10992");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitByCharacterType("...! ...hihi! hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "...!", " ", "...", "hihi", "!", " ", "hi", "!" });
    }

    @Test
    public void test10993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10993");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceChars("I!                      ..", "aaaaaaaaaa                   ", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I!.." + "'", str3, "I!..");
    }

    @Test
    public void test10994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10994");
        char[] charArray10 = new char[] { '#', 'a', 'a', ' ' };
        boolean boolean11 = org.apache.commons.lang.StringUtils.containsAny("", charArray10);
        int int12 = org.apache.commons.lang.StringUtils.indexOfAny("HI!", charArray10);
        boolean boolean13 = org.apache.commons.lang.StringUtils.containsNone("                                                    ", charArray10);
        int int14 = org.apache.commons.lang.StringUtils.indexOfAnyBut("HI!", charArray10);
        int int15 = org.apache.commons.lang.StringUtils.indexOfAnyBut("aaaaaaaaaa", charArray10);
        boolean boolean16 = org.apache.commons.lang.StringUtils.containsOnly("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   hi!    i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '#', 'a', 'a', ' ' });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test10995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10995");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("                                              hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "                                                 ...", 19);
        java.lang.String str5 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray3, 'a');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                              hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                                              hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str5, "                                              hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test10996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10996");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.right("                                                                                                                                                                                                     aaaaaaaaaa                                                                                                                                                                     ", 73);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                         " + "'", str2, "                                                                         ");
    }

    @Test
    public void test10997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10997");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.lowerCase("     HI!       ...aaaaaaaaaaaaaa####################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "     hi!       ...aaaaaaaaaaaaaa####################" + "'", str1, "     hi!       ...aaaaaaaaaaaaaa####################");
    }

    @Test
    public void test10998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10998");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("aaaaaaaaaa                                                                                       ", "                                                    ...h                               ", (int) (short) 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aaaaaaaaaa                                                                                       " });
    }

    @Test
    public void test10999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10999");
        boolean boolean2 = org.apache.commons.lang.StringUtils.contains("i!                      ...", 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test11000");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.chop("...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI" + "'", str1, "...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
    }
}

