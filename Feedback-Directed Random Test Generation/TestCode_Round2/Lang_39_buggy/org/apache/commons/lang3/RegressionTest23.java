package org.apache.commons.lang3;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest23 {

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
    public void test11501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11501");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IHH                      IHH                      IHH                      IHH                      IHH                      IHH                      IHH                      IHH                      IHH                      IHH                      IHH                      IHH                      IHH" + "'", str2, "IHH                      IHH                      IHH                      IHH                      IHH                      IHH                      IHH                      IHH                      IHH                      IHH                      IHH                      IHH                      IHH");
    }

    @Test
    public void test11502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11502");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("4ih###############################", 240, 227);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4ih###############################" + "'", str3, "4ih###############################");
    }

    @Test
    public void test11503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11503");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "  ", 285);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test11504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11504");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("444444444444444444444444444444444444444444HHI!I!       444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11505");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###hhi####    ...                                                                                                 ", 62);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test11506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11506");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("##############################################################################################################################################################HI!IIIIIIIIIIIIIIIIIIIIIIIIIIIIHI!H##############################################################", "4                           H4!   HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH4!4!44");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11507");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("#################################################################IIIIIH!IH!IH!IH!IH!IH!IH                           Iaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test11508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11508");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("hi!");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, 'a');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "hi", "!" });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hia!" + "'", str4, "hia!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi", "!" });
    }

    @Test
    public void test11509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11509");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "            hia!Hi#                             hia!Hi#                 ", 96, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 96 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test11510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11510");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("hhh", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhh" + "'", str2, "hhh");
    }

    @Test
    public void test11511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11511");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("          hia");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "", "", "", "", "", "", "", "", "", "", "hia" });
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test11512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11512");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test11513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11513");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("H#ih", 0, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hihhi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H#ih" + "'", str3, "H#ih");
    }

    @Test
    public void test11514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11514");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH" + "'", str1, "hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH");
    }

    @Test
    public void test11515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11515");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("...       ...       ...       haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.       ..hH4444444444444444444444444444444#4444444444444444444444444444444444#44444444444444444444444444444", 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "...       ...       ...       h", ".       ..hH4444444444444444444444444444444#4444444444444444444444444444444444#44444444444444444444444444444" });
    }

    @Test
    public void test11516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11516");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("44HI!44444I!HI!H...44444HI!444444", 120, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44HI!44444I!HI!H...44444HI!444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44HI!44444I!HI!H...44444HI!444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test11517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11517");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       ", "H!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       HI!I!       " });
    }

    @Test
    public void test11518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11518");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast(".       ...       ...       ..                                                                                                                                ", "444444444444I...4444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".       ...       ...       ..                                                                                                                                " + "'", str2, ".       ...       ...       ..                                                                                                                                ");
    }

    @Test
    public void test11519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11519");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi                                                            ", 2, 62);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!..." + "'", str3, "i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!...");
    }

    @Test
    public void test11520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11520");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!H!H...", "hI", 596);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!H!H..." });
    }

    @Test
    public void test11521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11521");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("i");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  HIH  ");
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny("                                                                                      aaaHhi!I!       aaa                                                                                       ", strArray5);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "i" });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "i" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "i" });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test11522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11522");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace("###hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...####hhi...#    h!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11523");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("#################################################################   ihhih!ih!ih!ih!ih!ih!ih!ih!ih!ih                           i", "###aaa###");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "#################################################################   ihhih!ih!ih!ih!ih!ih!ih!ih!ih!ih                           i" });
    }

    @Test
    public void test11524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11524");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                                                                                                                                                                                                                                                                                                                                                             ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "                                                                                                                                                                                                                                                                                                                                                                             " });
    }

    @Test
    public void test11525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11525");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("", "444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11526");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("...           ###HHI####           ...           ###HHI####", 403, "#####################################       ...       .#hhi#       ...       ######################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#####################################       ...       .#hhi#       ...       ###########################################################################       ...       .#h...           ###HHI####           ...           ###HHI#########################################       ...       .#hhi#       ...       ###########################################################################       ...       .#h" + "'", str3, "#####################################       ...       .#hhi#       ...       ###########################################################################       ...       .#h...           ###HHI####           ...           ###HHI#########################################       ...       .#hhi#       ...       ###########################################################################       ...       .#h");
    }

    @Test
    public void test11527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11527");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("   !I!...        ###HHI####           ...", "AAAAAAAAAI");
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("I                                  II                                  II                                  II                                  II                                  II                                  II                                  II                                  II                                  II                                  ", strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "hi !");
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny("...4444444444", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "   !I!...        ###HHI####           ..." });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "I!...        ###HHI####           ..." });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test11528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11528");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("444444444444444444444444444444444444444444HI!!       444444444444444444444444444444444444444444", "Ahia!Hi#AAAAAAAAAAAAAAAAAAAAAAAAAAAAAhia!Hi#AAAAAAAAAAAAAAAAAAAAAAAAAAAAAhia!Hi#AAAAAAAAAAAAAAAAAAAAAAAAAAAAAhia!Hi#AAAAAAAAAAAAAAAAAAAAAAAAAAAAAhia!Hi#AAAAAAAAAAAAAAAAAAAAAAAAAAAAAhia!Hi#AAAAAAAAAAAAAAAAAAAAAAAAAAAAAhia!Hi#AAAAAAAAAAAAAAAAAAAAAAAAAAAAAhia!Hi#AAAAAAAAAAAAAAAAAAAAAAAAAAAAAhia", "A", 210);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "444444444444444444444444444444444444444444HI!!       444444444444444444444444444444444444444444" + "'", str4, "444444444444444444444444444444444444444444HI!!       444444444444444444444444444444444444444444");
    }

    @Test
    public void test11529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11529");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("hiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHh", "####.HH###aaaaaaaaaaaaaaaaa####.HH###aaaaaaaaaaaaaaaaa####.HH###aaaaaaaaaaaaaaaaa####.HH###aaaaaaaaaaaaaaaaa####.HH###aaaaaaaaaaaaaaaaa####.HH###aaaaaaaaaaaaaaaaa####.HH###aaaaaaaaaaaaaaaaa####.HH###aaaaaaaaaaaaaaaaa####.HH###", 142);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '4', 338, 210);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test11530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11530");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("4HI!44444I!HI!H...44444HI!44444", "!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    44444!H    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11531");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("...h!ih!ih", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444I", 394);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '4');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "...h!ih!ih" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "...h!ih!ih" + "'", str5, "...h!ih!ih");
    }

    @Test
    public void test11532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11532");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                                                                                                                                                                                                                                                 I!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI", ' ', 663);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 304 + "'", int3 == 304);
    }

    @Test
    public void test11533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11533");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hhhhhhhhhhhhhhhhhhhhh      HI444", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hhhhhhhhhhhhhhhhhhhhh      HI444" });
    }

    @Test
    public void test11534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11534");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("##IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH###", '4');
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "    hi!hhi!i!       hi!hhi!i!                                                                                                                                                                                                                                                                                                                                                                                                                    ");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "##IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH###" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "##IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH###" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "##IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH###" });
    }

    @Test
    public void test11535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11535");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH      hi#!HHHHHHHHHHHHHHHHHHHHHHHHH");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '4', 5, 48);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4hi#!HHHHHHHHHHHHHHHHHHHHHHHHH444444hi#!HHHHHHHHHHHHHHHHHHHHHHHHH444444hi#!HHHHHHHHHHHHHHHHHHHHHHHHH444444hi#!HHHHHHHHHHHHHHHHHHHHHHHHH444444hi#!HHHHHHHHHHHHHHHHHHHHHHHHH444444hi#!HHHHHHHHHHHHHHHHHHHHHHHHH444444hi#!HHHHHHHHHHHHHHHHHHHHHHHHH44444" + "'", str5, "4hi#!HHHHHHHHHHHHHHHHHHHHHHHHH444444hi#!HHHHHHHHHHHHHHHHHHHHHHHHH444444hi#!HHHHHHHHHHHHHHHHHHHHHHHHH444444hi#!HHHHHHHHHHHHHHHHHHHHHHHHH444444hi#!HHHHHHHHHHHHHHHHHHHHHHHHH444444hi#!HHHHHHHHHHHHHHHHHHHHHHHHH444444hi#!HHHHHHHHHHHHHHHHHHHHHHHHH44444");
    }

    @Test
    public void test11536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11536");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("!#.H", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test11537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11537");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("4444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11538");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("4HI!44444I!HI!H...44444HI!44444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4HI!44444I!HI!H...44444HI!44444" + "'", str1, "4HI!44444I!HI!H...44444HI!44444");
    }

    @Test
    public void test11539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11539");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("hI#                             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hI#" + "'", str1, "hI#");
    }

    @Test
    public void test11540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11540");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("   ##", "hH4444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#4444444444444444444444444444444444#444444444################################################################ i4444444444444444444444444444444444#44444444444444444444444444!i!       ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11541");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("", "I  I  ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11542");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("44444444444444444444444444444444444444444444444444444444###hhi###44444444444444444444444444444444444444444444444444444444", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11543");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("     HI!   HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!...      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "     HI!   HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!...      " + "'", str1, "     HI!   HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!...      ");
    }

    @Test
    public void test11544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11544");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("!4ih!4ih!4ih!4ih!4ihHHI    ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11545");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("                     HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################HHI####...                     HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   ##############");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11546");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("#####################################       ...       .#hhi#       ...       ###########################################################################       ...       .#h...           ###HHI####           ...           ###HHI#########################################       ...       .#hhi#       ...       ###########################################################################       ...       .#h", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       ...       .hhi       ...              ...       .h...           HHI           ...           HHI       ...       .hhi       ...              ...       .h" + "'", str2, "       ...       .hhi       ...              ...       .h...           HHI           ...           HHI       ...       .hhi       ...              ...       .h");
    }

    @Test
    public void test11547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11547");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("...hhi....    ...", 279, "IHI!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!..");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IHI!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!..IHI!HHHHHHHHHHHHHHHHHHHHHHHHHHH...hhi....    ...IHI!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!..IHI!HHHHHHHHHHHHHHHHHHHHHHHHHHH" + "'", str3, "IHI!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!..IHI!HHHHHHHHHHHHHHHHHHHHHHHHHHH...hhi....    ...IHI!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!..IHI!HHHHHHHHHHHHHHHHHHHHHHHHHHH");
    }

    @Test
    public void test11548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11548");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("hhhhhhhhhhhhhhhhhhhhhhhhh", 324, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA###HHI####    ...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhhhhhhhhhhhhhhhhhhhhhhhAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA###HHI####    ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA###HHI####    ...AAAAAAA" + "'", str3, "hhhhhhhhhhhhhhhhhhhhhhhhhAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA###HHI####    ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA###HHI####    ...AAAAAAA");
    }

    @Test
    public void test11549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11549");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!hhi!i!       hi!hhi!i!                               HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################           ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH##", "...h!ih!ih", 6);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!hhi!i!       hi!hhi!i!                               HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################################################################           ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH###                      ####IHH##" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test11550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11550");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("44444HI!4444AhAhAhAhAhAhAhAhAhAhAhAhAAhAhAhAhAhAhAhAhAhAhAhAhAAhAhAhAhAhAhAhAhAhAhAhAhAAhAhAhAhAhAhAhAhAhAhAhAhAAhAhAhAhAhAhAhAhAhAhAhAhAAhAhAhAhAhAhAhAhAhAhAhAhAAhAhAhAhAhAhAhAhAhAhAhAhAAhAhAhAhAhAhAhAhAhAhAhAhAAhAhAhAhAhAhAhAhAhAhAhAhAAhAhAhAhAhAhAhAhAhAhAhAhAAhAhAhAhAhAhAhAhAhAhAhAhAAhAhAhAhAhAhAhAhAhAhAhAhAAhAhAhAhAhAhAhAhAhAhAhAhAAhAhAhAhAhAhAhAhAhAhAhAhAAhAhAhAhAhAhAhAhAhAhAhAhAAhAhAhAhAhAhAhAh", "######      ...       ...      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444HI!4444AhAhAhAhAhAhAhAhAhAhAhAhAAhAhAhAhAhAhAhAhAhAhAhAhAAhAhAhAhAhAhAhAhAhAhAhAhAAhAhAhAhAhAhAhAhAhAhAhAhAAhAhAhAhAhAhAhAhAhAhAhAhAAhAhAhAhAhAhAhAhAhAhAhAhAAhAhAhAhAhAhAhAhAhAhAhAhAAhAhAhAhAhAhAhAhAhAhAhAhAAhAhAhAhAhAhAhAhAhAhAhAhAAhAhAhAhAhAhAhAhAhAhAhAhAAhAhAhAhAhAhAhAhAhAhAhAhAAhAhAhAhAhAhAhAhAhAhAhAhAAhAhAhAhAhAhAhAhAhAhAhAhAAhAhAhAhAhAhAhAhAhAhAhAhAAhAhAhAhAhAhAhAhAhAhAhAhAAhAhAhAhAhAhAhAh" + "'", str2, "44444HI!4444AhAhAhAhAhAhAhAhAhAhAhAhAAhAhAhAhAhAhAhAhAhAhAhAhAAhAhAhAhAhAhAhAhAhAhAhAhAAhAhAhAhAhAhAhAhAhAhAhAhAAhAhAhAhAhAhAhAhAhAhAhAhAAhAhAhAhAhAhAhAhAhAhAhAhAAhAhAhAhAhAhAhAhAhAhAhAhAAhAhAhAhAhAhAhAhAhAhAhAhAAhAhAhAhAhAhAhAhAhAhAhAhAAhAhAhAhAhAhAhAhAhAhAhAhAAhAhAhAhAhAhAhAhAhAhAhAhAAhAhAhAhAhAhAhAhAhAhAhAhAAhAhAhAhAhAhAhAhAhAhAhAhAAhAhAhAhAhAhAhAhAhAhAhAhAAhAhAhAhAhAhAhAhAhAhAhAhAAhAhAhAhAhAhAhAh");
    }

    @Test
    public void test11551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11551");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                                                                                                                         ", 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                                                                                                                                                                                         " });
    }

    @Test
    public void test11552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11552");
        char[] charArray11 = new char[] { '4', 'a', '#', '#', 'a', '4' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("", charArray11);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("hi!       ", charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("i", charArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny("                               ###HHI####           ", charArray11);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny("I!HI..#!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', 'a', '#', '#', 'a', '4' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 31 + "'", int15 == 31);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
    }

    @Test
    public void test11553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11553");
        java.lang.String[] strArray0 = null;
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray0, "       #                            #                            #                            #                            ");
        org.junit.Assert.assertNull(strArray2);
    }

    @Test
    public void test11554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11554");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("###hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi####");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "###hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi####" });
    }

    @Test
    public void test11555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11555");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("!Ha!H...", "!4ih!4ih!4ih!4ih!4ihHHI    ...", "     ####IHH###      ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!Ha!H..." + "'", str3, "!Ha!H...");
    }

    @Test
    public void test11556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11556");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("HI#!HHHHHHHHHHHHHHHHHHHHHHHH", "444444444444444444444444444444444!IH44444...H!IH!I44444!IH44444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI#!HHHHHHHHHHHHHHHHHHHHHHHH" + "'", str2, "HI#!HHHHHHHHHHHHHHHHHHHHHHHH");
    }

    @Test
    public void test11557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11557");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("HI#!HHHHHHHHHHHHHHHHHHHHHHHH###################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11558");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("HI#!HHHHHHHHHHHHHHHHHHHHHHHHH", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah", (int) (short) 1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "HI#!HHHHHHHHHHHHHHHHHHHHHHHHH" });
    }

    @Test
    public void test11559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11559");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("HI!HI!H", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!H" + "'", str2, "HI!HI!H");
    }

    @Test
    public void test11560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11560");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric("##########################################################################################################################################################################################################################################################################################################################AAAAAAAAAI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11561");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!...HI!HI!HI!HI4                                 ", "4444444444444444444444...", 146);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!I!...HI!HI!HI!HI4                                 " });
    }

    @Test
    public void test11562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11562");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("...ih##############", "!i");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11563");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("#########################################################################################################################################################44444hi 44444i hi h44444hi 44444                                                                 #########################################################################################################################################################", 281, "hi!aaaaaaaaaaaaaaaaaaaI                                  II                                  II hhhh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#########################################################################################################################################################44444hi 44444i hi h44444hi 44444                                                                 #########################################################################################################################################################" + "'", str3, "#########################################################################################################################################################44444hi 44444i hi h44444hi 44444                                                                 #########################################################################################################################################################");
    }

    @Test
    public void test11564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11564");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase("444444444444444444444444444H!H!###H!HHIH!####H!H!44444444444444444444444444444H!H!###H!HHIH!####H!H!44444444444444444444444444444H!H!###H!HHIH!####H!H!44444444444444444444444444444H!H!###H!HHIH!####H!H!44444444444444444444444444444H!H!###H!HHIH!####H!H!44444444444444444444444444444H!H!###H!HHIH!####H!H!444444444444... ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11565");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("hhhhhhhhhhhhhhhhhhhhhhhhhAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA###HHI####    ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA###HHI####    ...AAAAAAA", "                               ###HHI####    ......HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test11566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11566");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("!I!       HI!HHI!I!       HI!HHI!I!       HI!HHI!I!       HI!HHI!I!       HI!", '4');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "i!I!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!I!       HI!HHI!I!       HI!HHI!I!       HI!HHI!I!       HI!HHI!I!       HI!" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "!I!       HI!HHI!I!       HI!HHI!I!       HI!HHI!I!       HI!HHI!I!       HI!" + "'", str4, "!I!       HI!HHI!I!       HI!HHI!I!       HI!HHI!I!       HI!HHI!I!       HI!");
    }

    @Test
    public void test11567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11567");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("I!I!", "       ...       .#hhi#       ...                                                                  ###   ###   ###   ###   ###   ###   ###   ###   ###   ###   ###   ###   ###   ###   ###   ###   ###   ###   ###   ###   ###   ###   ###   ###   ###   ###   ###   ###   ###", "                     HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   #################HHI####...                     HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHHI   ##############");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I!I!" + "'", str3, "I!I!");
    }

    @Test
    public void test11568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11568");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                                                                                                                                                                                                                                                                                                                                                                             ", 63);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                            ..." + "'", str2, "                                                            ...");
    }

    @Test
    public void test11569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11569");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("h!IH", 120);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h!IH" + "'", str2, "h!IH");
    }

    @Test
    public void test11570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11570");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("###hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi####", "!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI                                                                                                                                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi####" + "'", str2, "###hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi#######hhi####");
    }

    @Test
    public void test11571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11571");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("I!!", "                                                                                                                     HHHHHHHHHHHHHHH                                                                                                     ", 1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "I!!" });
    }

    @Test
    public void test11572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11572");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!HIhi#!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11573");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("#####################################################################################################44444HI!44444I!HI!H44444HI!44444                                                                 ##########################################################################################################################################################", 243);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#####################################################################################################44444HI!44444I!HI!H44444HI!44444                                                                 ##########################################################################################################################################################" + "'", str2, "#####################################################################################################44444HI!44444I!HI!H44444HI!44444                                                                 ##########################################################################################################################################################");
    }

    @Test
    public void test11574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11574");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("            ...H!IH!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "            ", "...", "H", "!", "IH", "!" });
    }

    @Test
    public void test11575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11575");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("hi !Hi!                          hi !Hi!        hi4!hi4!hi4!hi4!hi4!hi4!HHHHHHI!I!...                          hi !Hi!                          hi !Hi!                          hi !Hi!                          hi !");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11576");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric("###HHI####    ...444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11577");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("                                                                                                h                                                                                                h                                                                                                h                                                                                                h                  .hi!hi!hi!hi!hi!hihHI!i!                         i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11578");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric("4");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11579");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("             hh              ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "             ", "hh", "              " });
    }

    @Test
    public void test11580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11580");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("#################################################################", (int) (short) 100, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "####################################################################################################" + "'", str3, "####################################################################################################");
    }

    @Test
    public void test11581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11581");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("4HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H..hi!       aaaaaaaaaaaaaaaaaaa4HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H...44444HI!444444HI!44444I!HI!H..", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA###hhi########...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11582");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("HI#!                                                                                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11583");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("H I####           I####           I####           I####           I####           I####           I####           I####           I####", 235, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H I####           I####           I####           I####           I####           I####           I####           I####           I####aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "H I####           I####           I####           I####           I####           I####           I####           I####           I####aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test11584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11584");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("I!HI!H...            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I!HI!H..." + "'", str1, "I!HI!H...");
    }

    @Test
    public void test11585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11585");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("HH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH#######IHH##", "#!           ###iiI####           ...           ###iiI####           ...           ###iiI####  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#!           ###iiI####           ...           ###iiI####           ...           ###iiI####  " + "'", str2, "#!           ###iiI####           ...           ###iiI####           ...           ###iiI####  ");
    }

    @Test
    public void test11586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11586");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("!i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!i" + "'", str1, "!i");
    }

    @Test
    public void test11587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11587");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaa4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4aaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                    ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaa4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4ih4aaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test11588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11588");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("####ihh###                 ####ihh###                 ####ihh###                 ####ihh###                 ####ihh###                 ####ihh###                 ####ihh###                 ####ihh###                 ####ihh###", 178);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "           ####ihh###                 ####ihh###" + "'", str2, "           ####ihh###                 ####ihh###");
    }

    @Test
    public void test11589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11589");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("##############################################################444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 2);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##############################################################444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##############################################################444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "##############################################################444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##############################################################444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test11590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11590");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("       ...       .#hhi#       ...      ", "44444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       ...       .#hhi#       ...      " + "'", str2, "       ...       .#hhi#       ...      ");
    }

    @Test
    public void test11591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11591");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("    IHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH   ", '4', (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11592");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("####ihh###           ...           ####ihh###           ...           ####ihh###           !#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "####ihh###           ...           ####ihh###           ...           ####ihh###           !" + "'", str1, "####ihh###           ...           ####ihh###           ...           ####ihh###           !");
    }

    @Test
    public void test11593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11593");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("####IHH###", "####IHH###           ...           ####IHH###           ...           ####IHH###           !#IH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "####IHH###" + "'", str2, "####IHH###");
    }

    @Test
    public void test11594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11594");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("   ", 255);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
    }

    @Test
    public void test11595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11595");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd(" ###HHI####   ", "I!! I!! I!! I!! I!! I!! I!! I!! I!! I!! I!! I!! I!! I!! I!! I!! I!! I!! I!! I!! I!! I!! I!! I!! I!! I!! I!! I!! I!! I!! I!! I!! I!! I!! I!! I!! I!! I!! I!! I!! I!! I!! I!! I!! I!! I!! I!! I!! I!! I!! I!44444hi !HIhi !!hi !44444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " ###HHI####" + "'", str2, " ###HHI####");
    }

    @Test
    public void test11596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11596");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                                                                                                                                                                       H                                                                                                                                                                       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11597");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("I...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11598");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("!#IH      ", "########!4ih#########");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11599");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("IHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH", 328, "ia!HHHHHHHHHHHHHHHHHHHHHHHHH      hia!HHHHHHHHHHHHHHHHHHHHHHHHH      hia!HHHHHHHHHHHHHHHHHHHHHHHHH      hia!HHHHHHHHHHHHHHHHHHHHHHHHH      hia!HHHHHHHHHHHHHHHHHHHHHHHHH      hia!HHHHHHHHHHHHHHHHHHHHHHHHH      hia!HHHHHHHHHHHHHHHHHHHHHHHHH      hia!HHHHHHHHHHHHHHHHHHHHHHHHH      hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ia!HHHHHHHHHHHHHHHHHHHHHHHHH      hia!HHHHHHHHHHHHHHHHIHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHHia!HHHHHHHHHHHHHHHHHHHHHHHHH      hia!HHHHHHHHHHHHHHHHH" + "'", str3, "ia!HHHHHHHHHHHHHHHHHHHHHHHHH      hia!HHHHHHHHHHHHHHHHIHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHH                        IHHia!HHHHHHHHHHHHHHHHHHHHHHHHH      hia!HHHHHHHHHHHHHHHHH");
    }

    @Test
    public void test11600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11600");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                                        ", "I!HI!H...hi!hi!hi!hi!hi!hihHI!i!aaaaaaaaaaaaaaaaaaaaaaaaai!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", 496);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11601");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("...H!IH!IH44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...H!IH!IH44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "...H!IH!IH44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test11602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11602");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("aaai", "haih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaai" + "'", str2, "aaai");
    }

    @Test
    public void test11603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11603");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("  HI...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "  HI..." + "'", str1, "  HI...");
    }
}

