package org.apache.commons.lang;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

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
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHHHIH!HHHHIH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!" + "'", str1, "hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!");
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        char[] charArray12 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("HI!", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("hI!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("hhHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhih!hHhih!HHhih!HHhih!HHhih!IHhih!HHhih!!Hhih!HHhih!HHhih!hHhih!hHhih!iHhih!hHhih!!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hi!" + "'", str16, "Hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HhHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!" + "'", str17, "HhHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!" + "'", str18, "Hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!");
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihHI!hhih!", (int) (byte) 1, (int) (short) 100, "Hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihHhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str4, "hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihHhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!" + "'", str1, "HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!");
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!IHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!ihi!!!" + "'", str1, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!ihi!!!");
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!!" + "'", str2, "HHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!!");
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        char[] charArray18 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray18);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("HI!", charArray18);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihi!hhi!!", charArray18);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray18);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("hHI!IHI!!", charArray18);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.initials("HHIH!", charArray18);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.initials("hHI!HHI!IHI!HHI!!", charArray18);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray18);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.capitalize("Hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!", charArray18);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.initials("", charArray18);
        java.lang.String str29 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!", charArray18);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhhih!hhhhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHHIH!HHhhih!hhih!", charArray18);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H" + "'", str21, "H");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "HHI!IHI!!" + "'", str23, "HHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H" + "'", str24, "H");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "h" + "'", str25, "h");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HI!" + "'", str26, "HI!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!" + "'", str27, "Hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str29, "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hhhhhih!hhhhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHHIH!HHhhih!hhih!" + "'", str30, "hhhhhih!hhhhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHHIH!HHhhih!hhih!");
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!" + "'", str1, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!");
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHHIH!HHHIHhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhih!hhhihHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhHhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str1, "hhhih!hhhihHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhHhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        char[] charArray10 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("HI!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihi!hhi!!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhih!hhhhhih!hihhhih!hhhhhih!h!", charArray10);
        java.lang.Class<?> wildcardClass15 = charArray10.getClass();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhhhih!hhhhhih!hihhhih!hhhhhih!h!" + "'", str14, "Hhhhih!hhhhhih!hihhhih!hhhhhih!h!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHHHIH!HHHhHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHIH!HHHhHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!" + "'", str1, "HHHHIH!HHHhHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!");
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!ihhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!ihhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!!hhih!ihhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!ihhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHIH!HHHIH!HHHIH!HHHIH!HHHIH!IHHIH!HHHIH!!HHIH!HHHIH!HHHIH!HHHIH!HHHIH!HHHIH!IHHIH!HHHIH!!HHIH!HHHIH!IHHIH!HHHIH!HHHIH!HHHIH!IHHIH!HHHIH!!HHIH!HHHIH!HHHIH!HHHIH!HHHIH!HHHIH!IHHIH!HHHIH!!HHIH!HHHIH!!HHIH!HHHIH!HHHIH!HHHIH!HHHIH!HHHIH!IHHIH!HHHIH!!HHIH!HHHIH!HHHIH!HHHIH!HHHIH!HHHIH!IHHIH!HHHIH!!HHIH!HHHIH!IHHIH!HHHIH!HHHIH!HHHIH!IHHIH!HHHIH!!HHIH!HHHIH!HHHIH!HHHIH!HHHIH!HHHIH!IHHIH!HHHIH!!HHIH!HHHIH!!HHIH!IHHIH!HHHIH!HHHIH!HHHIH!HHHIH!IHHIH!HHHIH!!HHIH!HHHIH!HHHIH!HHHIH!HHHIH!HHHIH!IHHIH!HHHIH!!HHIH!HHHIH!IHHIH!HHHIH!HHHIH!HHHIH!IHHIH!HHHIH!!HHIH!HHHIH!HHHIH!HHHIH!HHHIH!HHHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!IHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!!" + "'", str1, "hHHIH!HHHIH!HHHIH!HHHIH!HHHIH!IHHIH!HHHIH!!HHIH!HHHIH!HHHIH!HHHIH!HHHIH!HHHIH!IHHIH!HHHIH!!HHIH!HHHIH!IHHIH!HHHIH!HHHIH!HHHIH!IHHIH!HHHIH!!HHIH!HHHIH!HHHIH!HHHIH!HHHIH!HHHIH!IHHIH!HHHIH!!HHIH!HHHIH!!HHIH!HHHIH!HHHIH!HHHIH!HHHIH!HHHIH!IHHIH!HHHIH!!HHIH!HHHIH!HHHIH!HHHIH!HHHIH!HHHIH!IHHIH!HHHIH!!HHIH!HHHIH!IHHIH!HHHIH!HHHIH!HHHIH!IHHIH!HHHIH!!HHIH!HHHIH!HHHIH!HHHIH!HHHIH!HHHIH!IHHIH!HHHIH!!HHIH!HHHIH!!HHIH!IHHIH!HHHIH!HHHIH!HHHIH!HHHIH!IHHIH!HHHIH!!HHIH!HHHIH!HHHIH!HHHIH!HHHIH!HHHIH!IHHIH!HHHIH!!HHIH!HHHIH!IHHIH!HHHIH!HHHIH!HHHIH!IHHIH!HHHIH!!HHIH!HHHIH!HHHIH!HHHIH!HHHIH!HHHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!IHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!!");
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhih!hhhihhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhih!hhhihhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!" + "'", str1, "hhhih!hhhihhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!");
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhhih!hhhhih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhhih!hhhhih!" + "'", str1, "hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhhih!hhhhih!");
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHHHIH!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHHHIH!" + "'", str2, "hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHHHIH!");
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHHI!IHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHHI!HHI!IHI!", (int) (short) 100, "hHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHI!IHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHHI!HHI!IHI!" + "'", str4, "hHHI!IHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHHI!HHI!IHI!");
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!", (int) (short) 1, "HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!IHI!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!" + "'", str4, "hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!");
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhi!hhi!ihi!hhi!!i!i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhi!hhi!ihi!hhi!!i!i" + "'", str1, "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhi!hhi!ihi!hhi!!i!i");
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHhhhih!hhHHHHIH!HHHhHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHhhhih!hhHHHHIH!HHHhHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!" + "'", str2, "HHhhhih!hhHHHHIH!HHHhHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!");
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.initials("hHHHHIH!HHhhHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h" + "'", str2, "h");
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHHhHhhHI!IHI!!hhHI!IHI!!ihHI!IHI!!hhHI!IHI!!!I!IHI!!hhHI!IHI!!ihHI!IHI!!hhHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!i!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str1, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!i!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!IHI!!!", (int) 'a', 100, "hHhi!ihi!!hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!IhHhi!ihi!!hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!" + "'", str4, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!IhHhi!ihi!!hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!");
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhi!ihi!!", (int) '4', "hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHhhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhihhI!HhI!Ihhi!HHIH!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhi!ihi!!" + "'", str4, "hhi!ihi!!");
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhHHHI!HHI!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!i!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hHHHI!HHI!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!HHHI!HHI!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhHHHI!HHI!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!i!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hHHHI!HHI!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHHI!HHI!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihiHHHI!HHI!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!hhi!!!i!hHi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHhhhi!hhi!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!I!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!Hhhhi!hhi!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!HI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!hhhi!hhi!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHhhhi!hhi!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!I!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!Hhhhi!hhi!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!HI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!hhhi!hhi!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHIhhhi!hhi!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!!HHI!!!I!HhI!!" + "'", str1, "hhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHhhhi!hhi!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!I!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!Hhhhi!hhi!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!HI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!hhhi!hhi!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHhhhi!hhi!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!I!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!Hhhhi!hhi!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!HI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!hhhi!hhi!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHIhhhi!hhi!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!!HHI!!!I!HhI!!");
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!" + "'", str2, "hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!");
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhHHI!HHI!HhHI!HHI!IhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhHHI!HHI!HhHI!HHI!IhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!" + "'", str2, "hhHHI!HHI!HhHI!HHI!IhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!");
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhHI!HHI!IHI!HHI!!" + "'", str1, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhHI!HHI!IHI!HHI!!");
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhi!hhi!ihhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhi!hhi!ihhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str1, "hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhi!hhi!ihhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHHHIH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihhhih!" + "'", str1, "hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihhhih!");
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        char[] charArray13 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("HI!", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhih!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHHIH!HHhhih!", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("hhHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("HHHIH!HHHIHhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hi!" + "'", str16, "Hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhih!" + "'", str17, "Hhih!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhi!hhi!ihHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHHIH!HHhhih!" + "'", str18, "Hhi!hhi!ihHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHHIH!HHhhih!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "h" + "'", str19, "h");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HHHIH!HHHIHhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!" + "'", str20, "HHHIH!HHHIHhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!");
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        char[] charArray12 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("HI!", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhih!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHHIH!HHhhih!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhih!" + "'", str16, "Hhih!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhi!hhi!ihHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHHIH!HHhhih!" + "'", str17, "Hhi!hhi!ihHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHHIH!HHhhih!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!" + "'", str18, "Hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        char[] charArray17 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray17);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray17);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray17);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray17);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("h", charArray17);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray17);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.initials("hHI!IHI!!", charArray17);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhih!", charArray17);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.initials("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", charArray17);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray17);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!iHhhi!hhi!iHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!hi!", charArray17);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H" + "'", str23, "H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "h" + "'", str24, "h");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Hhih!" + "'", str25, "Hhih!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H" + "'", str26, "H");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hi!" + "'", str28, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hi!");
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        char[] charArray11 = new char[] { '4', '4' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!IHI!!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hI!" + "'", str14, "hI!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhi!ihi!!" + "'", str17, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str18, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        char[] charArray15 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray15);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("h", charArray15);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray15);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray15);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.initials("Hhih!", charArray15);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalize("HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhi!hhi!ihi!hhi!!", charArray15);
        java.lang.Class<?> wildcardClass25 = charArray15.getClass();
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hhih!" + "'", str21, "Hhih!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hi!" + "'", str22, "Hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H" + "'", str23, "H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhi!hhi!ihi!hhi!!" + "'", str24, "HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhi!hhi!ihhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        char[] charArray10 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("HI!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hI!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IhHHI!HHI!Ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!HI!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!I!HhI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhhhih!hhhhhih!hihhhih!hhhhhih!h!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!" + "'", str1, "HHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!");
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        char[] charArray11 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("HI!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("HHI!IHI!!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("Hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!h!ihhih!!hhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hih!ihhih!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhhih!ihhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!h!!hhih!!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hHI!IHI!!" + "'", str15, "hHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!h!ihhih!!hhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hih!ihhih!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhhih!ihhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!h!!hhih!!" + "'", str16, "Hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!h!ihhih!!hhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hih!ihhih!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhhih!ihhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!h!!hhih!!");
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhHhhhhih!hhhhHHHIH!HHHHHIH!HIHHHIhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!H!HHHHHIH!HhHHHIH!HHhhih!hhih!i!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hHhhhhih!hhhhHHHIH!HHHHHIH!HIHHHIhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!H!HHHHHIH!HhHHHIH!HHhhih!hhih!hi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhiHhhhhih!hhhhHHHIH!HHHHHIH!HIHHHIhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!H!HHHHHIH!HhHHHIH!HHhhih!hhih!!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!", (int) (byte) 10, (int) (short) -1, "hhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhHhhhhih!hhhhHHHIH!HHHHHIH!HIHHHIhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!H!HHHHHIH!HhHHHIH!HHhhih!hhih!i!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hHhhhhih!hhhhHHHIH!HHHHHIH!HIHHHIhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!H!HHHHHIH!HhHHHIH!HHhhih!hhih!hi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhiHhhhhih!hhhhHHHIH!HHHHHIH!HIHHHIhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!H!HHHHHIH!HhHHHIH!HHhhih!hhih!!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str4, "hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhHhhhhih!hhhhHHHIH!HHHHHIH!HIHHHIhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!H!HHHHHIH!HhHHHIH!HHhhih!hhih!i!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hHhhhhih!hhhhHHHIH!HHHHHIH!HIHHHIhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!H!HHHHHIH!HhHHHIH!HHhhih!hhih!hi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhiHhhhhih!hhhhHHHIH!HHHHHIH!HIHHHIhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!H!HHHHHIH!HhHHHIH!HHhhih!hhih!!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhi!hhi!ihi!hhi!!", (int) '4', 1, "hHhhhih!hhhhhih!hihhhih!hhhhhih!HhHI!IHI!!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 52, length 17");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhihhI!HhI!Ih", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhihhI!HhI!Ih" + "'", str2, "hhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhihhI!HhI!Ih");
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!", (int) (short) 100, (int) (short) -1, "HhHIH!HhHIH!hhHIH!hhHIH!hhHIH!ihHIH!hhHIH!!hHIH!hhHIH!hhHIH!HhHIH!HhHIH!IhHIH!HhHIH!!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 100, length 49");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        char[] charArray9 = new char[] { '4', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHhhih!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hI!" + "'", str12, "hI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHhhih!" + "'", str16, "HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHhhih!");
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        char[] charArray15 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray15);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("h", charArray15);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray15);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("hhI!HhI!IhI!HhI!!", charArray15);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!HhI!IhI!HhI!!", charArray15);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!HHI!IHI!HHI!!", charArray15);
        java.lang.Class<?> wildcardClass25 = charArray15.getClass();
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H" + "'", str21, "H");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "h" + "'", str22, "h");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str23, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hHI!HHI!IHI!HHI!!" + "'", str24, "hHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHHI!IHI!!Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!ihi!!hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!" + "'", str1, "hhhi!ihi!!hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!");
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        char[] charArray21 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray21);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray21);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray21);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray21);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalize("h", charArray21);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray21);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.initials("hhI!HhI!IhI!HhI!!", charArray21);
        java.lang.String str29 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!HhI!IhI!HhI!!", charArray21);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.initials("hI!", charArray21);
        java.lang.String str31 = org.apache.commons.lang.WordUtils.initials("", charArray21);
        java.lang.String str32 = org.apache.commons.lang.WordUtils.initials("hHI!IHI!!", charArray21);
        java.lang.String str33 = org.apache.commons.lang.WordUtils.uncapitalize("HhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", charArray21);
        java.lang.String str34 = org.apache.commons.lang.WordUtils.initials("Hhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!ihhih!!hHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hih!ihhih!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hhhih!ihhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!!hhih!!", charArray21);
        java.lang.String str35 = org.apache.commons.lang.WordUtils.capitalize("HhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", charArray21);
        java.lang.String str36 = org.apache.commons.lang.WordUtils.initials("HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!", charArray21);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertArrayEquals(charArray21, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H" + "'", str26, "H");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "H" + "'", str27, "H");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "h" + "'", str28, "h");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str29, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "h" + "'", str30, "h");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "h" + "'", str32, "h");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!" + "'", str33, "hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "H" + "'", str34, "H");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "HhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!" + "'", str35, "HhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "H" + "'", str36, "H");
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str1, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        char[] charArray9 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhi!hhi!ihi!hhi!!i!i", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhi!hhi!ihi!hhi!!i!i" + "'", str12, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhi!hhi!ihi!hhi!!i!i");
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!HHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhi!hhiHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str1, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhHHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!ihi!!!hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhh", (int) '#', (int) (short) 100, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhh");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhHHhHhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhh" + "'", str4, "Hhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhHHhHhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhh");
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HhHHI!HHI!HhHI!HHI!IhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HhHHI!HHI!HhHI!HHI!IhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!" + "'", str2, "HhHHI!HHI!HhHI!HHI!IhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!");
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!ihi!!!", 0, (int) '4', "hHi!hHi!iH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!HHHIH!HHHIH!iHHIHhHi!hHi!iH" + "'", str4, "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!HHHIH!HHHIH!iHHIHhHi!hHi!iH");
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhi!hhi!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!", (int) (byte) 0, (int) '4', "HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhi!hhi!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!" + "'", str4, "hhhi!hhi!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!");
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        char[] charArray19 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray19);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray19);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray19);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray19);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalize("h", charArray19);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray19);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray19);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.initials("Hhih!", charArray19);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.capitalizeFully("hhih!", charArray19);
        java.lang.String str29 = org.apache.commons.lang.WordUtils.initials("hhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!I!HhI!!", charArray19);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.uncapitalize("HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!", charArray19);
        java.lang.String str31 = org.apache.commons.lang.WordUtils.uncapitalize("hHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIHHHHI!HHI!IHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!", charArray19);
        java.lang.String str32 = org.apache.commons.lang.WordUtils.initials("hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHHhHI!IHI!!hhHI!IHI!!ihHI!IHI!!hhHI!IHI!!!", charArray19);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H" + "'", str24, "H");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Hhih!" + "'", str25, "Hhih!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Hi!" + "'", str26, "Hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "H" + "'", str27, "H");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Hhih!" + "'", str28, "Hhih!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "h" + "'", str29, "h");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!" + "'", str30, "hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIHHHHI!HHI!IHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!" + "'", str31, "hHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIHHHHI!HHI!IHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "h" + "'", str32, "h");
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        char[] charArray22 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray22);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray22);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray22);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray22);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.capitalize("h", charArray22);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray22);
        java.lang.String str29 = org.apache.commons.lang.WordUtils.initials("hhI!HhI!IhI!HhI!!", charArray22);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!HhI!IhI!HhI!!", charArray22);
        java.lang.String str31 = org.apache.commons.lang.WordUtils.initials("hI!", charArray22);
        java.lang.String str32 = org.apache.commons.lang.WordUtils.initials("", charArray22);
        java.lang.String str33 = org.apache.commons.lang.WordUtils.initials("hHI!IHI!!", charArray22);
        java.lang.String str34 = org.apache.commons.lang.WordUtils.uncapitalize("HhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", charArray22);
        java.lang.String str35 = org.apache.commons.lang.WordUtils.initials("Hhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!ihhih!!hHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hih!ihhih!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hhhih!ihhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!!hhih!!", charArray22);
        java.lang.String str36 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!", charArray22);
        java.lang.String str37 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I", charArray22);
        java.lang.String str38 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray22);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "H" + "'", str27, "H");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "H" + "'", str28, "H");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "h" + "'", str29, "h");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str30, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "h" + "'", str31, "h");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "h" + "'", str33, "h");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!" + "'", str34, "hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "H" + "'", str35, "H");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str36, "hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i" + "'", str37, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        char[] charArray20 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray20);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray20);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray20);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray20);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalize("h", charArray20);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray20);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.initials("hhI!HhI!IhI!HhI!!", charArray20);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!HhI!IhI!HhI!!", charArray20);
        java.lang.String str29 = org.apache.commons.lang.WordUtils.initials("hI!", charArray20);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.initials("", charArray20);
        java.lang.String str31 = org.apache.commons.lang.WordUtils.initials("hHI!IHI!!", charArray20);
        java.lang.String str32 = org.apache.commons.lang.WordUtils.uncapitalize("HhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", charArray20);
        java.lang.String str33 = org.apache.commons.lang.WordUtils.capitalizeFully("hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I", charArray20);
        java.lang.String str34 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!", charArray20);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "H" + "'", str25, "H");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H" + "'", str26, "H");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "h" + "'", str27, "h");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str28, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "h" + "'", str29, "h");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "h" + "'", str31, "h");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!" + "'", str32, "hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i" + "'", str33, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str34, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        char[] charArray20 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray20);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray20);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray20);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray20);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalize("h", charArray20);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray20);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray20);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.initials("hI!", charArray20);
        java.lang.String str29 = org.apache.commons.lang.WordUtils.uncapitalize("hhih!", charArray20);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.initials("HhI!HhI!IhI!HhI!!", charArray20);
        java.lang.String str31 = org.apache.commons.lang.WordUtils.capitalizeFully("HHIH!", charArray20);
        java.lang.String str32 = org.apache.commons.lang.WordUtils.initials("hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!", charArray20);
        java.lang.String str33 = org.apache.commons.lang.WordUtils.initials("HHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", charArray20);
        java.lang.String str34 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhHhih!hHhih!iHhih!!Hhih!iHhih!hHhihhhhi!hhi!iHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!", charArray20);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "H" + "'", str25, "H");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Hhih!" + "'", str26, "Hhih!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Hi!" + "'", str27, "Hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "h" + "'", str28, "h");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hhih!" + "'", str29, "hhih!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "H" + "'", str30, "H");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Hhih!" + "'", str31, "Hhih!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "h" + "'", str32, "h");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "H" + "'", str33, "H");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str34, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!" + "'", str1, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!");
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        char[] charArray16 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray16);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("h", charArray16);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray16);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray16);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.initials("Hhih!", charArray16);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalizeFully("hhih!", charArray16);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.initials("hhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!I!HhI!!", charArray16);
        java.lang.Class<?> wildcardClass27 = charArray16.getClass();
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H" + "'", str21, "H");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhih!" + "'", str22, "Hhih!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hi!" + "'", str23, "Hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H" + "'", str24, "H");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Hhih!" + "'", str25, "Hhih!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "h" + "'", str26, "h");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        char[] charArray10 = new char[] { '4', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("Hhhhih!hhhhhih!hihhhih!hhhhhih!h!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("hHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("HhHIH!HhHIH!hhHIH!hhHIH!hhHIH!ihHIH!hhHIH!!hHIH!hhHIH!hhHIH!HhHIH!HhHIH!IhHIH!HhHIH!!", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhhhhhhih!hhhhhhhih!hhhhhih!hihhhihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!h!hhhhhih!hhhhhih!hhhhih!hhih!i!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhhhhhih!hhhhhhhih!hhhhhih!hihhhihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!h!hhhhhih!hhhhhih!hhhhih!hhih!hi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhihhhhhih!hhhhhhhih!hhhhhih!hihhhihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!h!hhhhhih!hhhhhih!hhhhih!hhih!!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hI!" + "'", str13, "hI!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhhhih!hhhhhih!hihhhih!hhhhhih!h!" + "'", str15, "Hhhhih!hhhhhih!hihhhih!hhhhhih!h!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hhi!!" + "'", str16, "Hhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hhHIH!HhHIH!hhHIH!hhHIH!hhHIH!ihHIH!hhHIH!!hHIH!hhHIH!hhHIH!HhHIH!HhHIH!IhHIH!HhHIH!!" + "'", str17, "hhHIH!HhHIH!hhHIH!hhHIH!hhHIH!ihHIH!hhHIH!!hHIH!hhHIH!hhHIH!HhHIH!HhHIH!IhHIH!HhHIH!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhhhhhhih!hhhhhhhih!hhhhhih!hihhhihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!h!hhhhhih!hhhhhih!hhhhih!hhih!i!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhhhhhih!hhhhhhhih!hhhhhih!hihhhihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!h!hhhhhih!hhhhhih!hhhhih!hhih!hi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhihhhhhih!hhhhhhhih!hhhhhih!hihhhihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!h!hhhhhih!hhhhhih!hhhhih!hhih!!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str18, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhhhhhhih!hhhhhhhih!hhhhhih!hihhhihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!h!hhhhhih!hhhhhih!hhhhih!hhih!i!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhhhhhih!hhhhhhhih!hhhhhih!hihhhihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!h!hhhhhih!hhhhhih!hhhhih!hhih!hi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhihhhhhih!hhhhhhhih!hhhhhih!hihhhihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!h!hhhhhih!hhhhhih!hhhhih!hhih!!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhhhhih!hhhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHHIH!HHHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I" + "'", str1, "HHHHHIH!HHHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I");
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        char[] charArray18 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray18);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray18);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray18);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray18);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("h", charArray18);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray18);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray18);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.initials("Hhi!ihi!!", charArray18);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray18);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray18);
        java.lang.String str29 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!", charArray18);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.uncapitalize("hHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!I!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!", charArray18);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H" + "'", str23, "H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hhih!" + "'", str24, "Hhih!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "H" + "'", str25, "H");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H" + "'", str26, "H");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "HI!" + "'", str27, "HI!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Hi!" + "'", str28, "Hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str29, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!I!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!" + "'", str30, "hHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!I!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!");
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        char[] charArray19 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray19);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray19);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray19);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray19);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalize("h", charArray19);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray19);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray19);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.initials("hI!", charArray19);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.capitalize("hHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!", charArray19);
        java.lang.String str29 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!", charArray19);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.capitalize("Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhh", charArray19);
        java.lang.String str31 = org.apache.commons.lang.WordUtils.capitalize("hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!", charArray19);
        java.lang.String str32 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!", charArray19);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H" + "'", str24, "H");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Hhih!" + "'", str25, "Hhih!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H" + "'", str26, "H");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "h" + "'", str27, "h");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "HHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!" + "'", str28, "HHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str29, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhh" + "'", str30, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhh");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str31, "Hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str32, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhih!hhhihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhi!hhi!ihHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!ihi!!!", (-1), 0, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i" + "'", str4, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i");
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        char[] charArray18 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray18);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray18);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray18);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray18);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("h", charArray18);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray18);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.initials("hhI!HhI!IhI!HhI!!", charArray18);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!HhI!IhI!HhI!!", charArray18);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.initials("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhihhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!", charArray18);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.capitalize("HhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!", charArray18);
        java.lang.String str29 = org.apache.commons.lang.WordUtils.capitalize("Hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhiHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!h!hhhih!hhhih!hhhih!ihhih!hhhih!!", charArray18);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!", charArray18);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H" + "'", str23, "H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H" + "'", str24, "H");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "h" + "'", str25, "h");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str26, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "H" + "'", str27, "H");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "HhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str28, "HhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhiHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!h!hhhih!hhhih!hhhih!ihhih!hhhih!!" + "'", str29, "Hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhiHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!h!hhhih!hhhih!hhhih!ihhih!hhhih!!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!" + "'", str30, "hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!");
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhhhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHIHhhih!hhhihhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhhhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHIHhhih!hhhihhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!" + "'", str1, "hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhhhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHIHhhih!hhhihhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!");
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        char[] charArray13 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("HI!", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("hI!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("hhHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!IHI!!!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hi!" + "'", str16, "Hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hi!" + "'", str17, "Hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HhHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!" + "'", str18, "HhHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!ihi!!!" + "'", str19, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!ihi!!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "h" + "'", str20, "h");
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!", 0, "Hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!ihi!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!" + "'", str4, "HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!");
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        char[] charArray13 = new char[] { '4', '4' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!IHI!!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!", charArray13);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihi!hhi!!", charArray13);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhhhih!hhHHIH!", charArray13);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.initials("hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!", charArray13);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhi!hhi!ihhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!hi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hI!" + "'", str16, "hI!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hi!" + "'", str17, "Hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhi!ihi!!" + "'", str19, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str20, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hhi!hhi!ihi!hhi!!" + "'", str21, "hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhhhhih!hhhhih!" + "'", str22, "Hhhhhih!hhhhih!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "h" + "'", str23, "h");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhi!hhi!ihhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!hi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str24, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhi!hhi!ihhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!hi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str1, "hHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHIH!HHHIhhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIHHi!hHi!iH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhihhi!hhi!ih" + "'", str1, "Hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhihhi!hhi!ih");
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhi!hhi!ihi!hhi!!" + "'", str1, "hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHhi!hhi!iHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!", 100, "hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHhi!hhi!iHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!" + "'", str4, "hHhi!hhi!iHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!");
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        char[] charArray11 = new char[] { '4', '4' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihI!", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!", charArray11);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("Hhhhhhih!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "h" + "'", str14, "h");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "h" + "'", str15, "h");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhhhhih!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!" + "'", str20, "Hhhhhhih!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!");
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        char[] charArray10 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("HHIH!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("HHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhih!" + "'", str12, "Hhih!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhihhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!" + "'", str13, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhihhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!!" + "'", str14, "HHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!!");
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        char[] charArray20 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray20);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray20);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray20);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray20);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalize("h", charArray20);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray20);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.initials("hhI!HhI!IhI!HhI!!", charArray20);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!HhI!IhI!HhI!!", charArray20);
        java.lang.String str29 = org.apache.commons.lang.WordUtils.initials("hI!", charArray20);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.initials("HhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIH!IhHIH!!hHIH!!", charArray20);
        java.lang.String str31 = org.apache.commons.lang.WordUtils.uncapitalize("hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", charArray20);
        java.lang.String str32 = org.apache.commons.lang.WordUtils.capitalize("hHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!", charArray20);
        java.lang.String str33 = org.apache.commons.lang.WordUtils.capitalize("hhhhhih!hhhhih!", charArray20);
        java.lang.String str34 = org.apache.commons.lang.WordUtils.uncapitalize("HhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!hhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihI!", charArray20);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "H" + "'", str25, "H");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H" + "'", str26, "H");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "h" + "'", str27, "h");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str28, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "h" + "'", str29, "h");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "H" + "'", str30, "H");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str31, "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "HHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!" + "'", str32, "HHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Hhhhhih!hhhhih!" + "'", str33, "Hhhhhih!hhhhih!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!hhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihI!" + "'", str34, "hhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!hhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihI!");
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        char[] charArray19 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray19);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray19);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray19);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray19);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalize("h", charArray19);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray19);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray19);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.initials("hI!", charArray19);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.capitalize("hHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!", charArray19);
        java.lang.String str29 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!", charArray19);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.capitalize("Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhh", charArray19);
        java.lang.String str31 = org.apache.commons.lang.WordUtils.capitalize("hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!", charArray19);
        java.lang.String str32 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", charArray19);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H" + "'", str24, "H");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Hhih!" + "'", str25, "Hhih!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H" + "'", str26, "H");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "h" + "'", str27, "h");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "HHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!" + "'", str28, "HHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str29, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhh" + "'", str30, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhh");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str31, "Hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str32, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        char[] charArray13 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("HI!", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihi!hhi!!", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str18, "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!" + "'", str19, "HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", (int) 'a', (int) (byte) -1, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhh");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!" + "'", str4, "hHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!");
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHI!IHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!HHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!IHI!!!" + "'", str1, "hHHI!IHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!HHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!IHI!!!");
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhi!hhi!ihi!hhi!!i!i", (int) '4', (int) 'a', "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hh" + "'", str4, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hh");
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        char[] charArray18 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray18);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray18);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray18);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray18);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("h", charArray18);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray18);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalize("Hhi!ihi!!", charArray18);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray18);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.initials("hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", charArray18);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.capitalize("hhHIH!HhHIH!hhHIH!hhHIH!hhHIH!ihHIH!hhHIH!!hHIH!hhHIH!hhHIH!HhHIH!HhHIH!IhHIH!HhHIH!!", charArray18);
        java.lang.String str29 = org.apache.commons.lang.WordUtils.capitalizeFully("hhHIH!HhHIH!hhHIH!hhHIH!hhHIH!ihHIH!hhHIH!!hHIH!hhHIH!hhHIH!HhHIH!HhHIH!IhHIH!HhHIH!!", charArray18);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!", charArray18);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H" + "'", str23, "H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hhih!" + "'", str24, "Hhih!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Hhi!ihi!!" + "'", str25, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Hi!" + "'", str26, "Hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "h" + "'", str27, "h");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "HhHIH!HhHIH!hhHIH!hhHIH!hhHIH!ihHIH!hhHIH!!hHIH!hhHIH!hhHIH!HhHIH!HhHIH!IhHIH!HhHIH!!" + "'", str28, "HhHIH!HhHIH!hhHIH!hhHIH!hhHIH!ihHIH!hhHIH!!hHIH!hhHIH!hhHIH!HhHIH!HhHIH!IhHIH!HhHIH!!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!" + "'", str29, "Hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!" + "'", str30, "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!");
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhih!hhhihhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhih!hhhihhi!hhi!ihi!hhi!!" + "'", str1, "Hhhih!hhhihhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        char[] charArray21 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray21);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray21);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray21);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray21);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalize("h", charArray21);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray21);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray21);
        java.lang.String str29 = org.apache.commons.lang.WordUtils.initials("hI!", charArray21);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihi!hhi!!", charArray21);
        java.lang.String str31 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray21);
        java.lang.String str32 = org.apache.commons.lang.WordUtils.capitalize("hhi!ihi!!", charArray21);
        java.lang.String str33 = org.apache.commons.lang.WordUtils.capitalizeFully("hhi!hhi!ihi!hhi!!", charArray21);
        java.lang.String str34 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray21);
        java.lang.String str35 = org.apache.commons.lang.WordUtils.initials("HI!", charArray21);
        java.lang.String str36 = org.apache.commons.lang.WordUtils.initials("HhhHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!", charArray21);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertArrayEquals(charArray21, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H" + "'", str26, "H");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Hhih!" + "'", str27, "Hhih!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Hi!" + "'", str28, "Hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "h" + "'", str29, "h");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str30, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "h" + "'", str31, "h");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Hhi!ihi!!" + "'", str32, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str33, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "H" + "'", str35, "H");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "H" + "'", str36, "H");
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!i!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!i!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str1, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!i!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhih!hhhihhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str1, "Hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!" + "'", str2, "hhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!");
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!" + "'", str2, "hhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!");
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhih!hhhihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhi!hhi!ihHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHIH!HHHIHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHHI!HHI!IHhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!HHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!IHI!!!" + "'", str1, "hHHIH!HHHIHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHHI!HHI!IHhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!HHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!IHI!!!");
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        char[] charArray12 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("HI!", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("HHIH!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("hHHHHIH!HHhhHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhih!" + "'", str16, "Hhih!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str17, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HHHHHIH!HHhhHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!" + "'", str18, "HHHHHIH!HHhhHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!");
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        char[] charArray17 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray17);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray17);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray17);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray17);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("h", charArray17);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray17);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.initials("hhI!HhI!IhI!HhI!!", charArray17);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!HhI!IhI!HhI!!", charArray17);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.initials("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhihhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!", charArray17);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.capitalize("HhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!", charArray17);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.capitalize("HHHI!IHI!!Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!", charArray17);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H" + "'", str23, "H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "h" + "'", str24, "h");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str25, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H" + "'", str26, "H");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "HhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str27, "HhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "HHHI!IHI!!Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str28, "HHHI!IHI!!Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        char[] charArray15 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("HI!", charArray15);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray15);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("HHIH!", charArray15);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("Hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!", charArray15);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("hhI!HhI!IhI!HhI!!", charArray15);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("h", charArray15);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihI!", charArray15);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.initials("hhhhhih!hhhhHHHIH!HHHHHIH!HIHHHIhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!H!HHHHHIH!HhHHHIH!HHhhih!hhih!", charArray15);
        java.lang.Class<?> wildcardClass25 = charArray15.getClass();
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hi!" + "'", str18, "Hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhih!" + "'", str19, "Hhih!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!" + "'", str20, "Hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hhI!HhI!IhI!HhI!!" + "'", str21, "hhI!HhI!IhI!HhI!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "h" + "'", str22, "h");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihI!" + "'", str23, "HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihI!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "h" + "'", str24, "h");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        char[] charArray7 = new char[] { '4', '4' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("HHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hHHI!IHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHHI!HHI!IHI!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhhhih!hhHHIH!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hi!" + "'", str8, "Hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hI!" + "'", str9, "hI!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!" + "'", str10, "hHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhhhhih!hhhhih!" + "'", str12, "Hhhhhih!hhhhih!");
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHHHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHHHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!" + "'", str1, "HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHHHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!");
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        char[] charArray20 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray20);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray20);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray20);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray20);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalize("h", charArray20);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray20);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray20);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.initials("hI!", charArray20);
        java.lang.String str29 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihi!hhi!!", charArray20);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.capitalize("hHIH!", charArray20);
        java.lang.String str31 = org.apache.commons.lang.WordUtils.initials("hHhhhih!hhHHIH!", charArray20);
        java.lang.String str32 = org.apache.commons.lang.WordUtils.initials("hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", charArray20);
        java.lang.String str33 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!", charArray20);
        java.lang.String str34 = org.apache.commons.lang.WordUtils.initials("HHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!ihi!!!", charArray20);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "H" + "'", str25, "H");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Hhih!" + "'", str26, "Hhih!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Hi!" + "'", str27, "Hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "h" + "'", str28, "h");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str29, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "HHIH!" + "'", str30, "HHIH!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "h" + "'", str31, "h");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "h" + "'", str32, "h");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!" + "'", str33, "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "H" + "'", str34, "H");
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!" + "'", str1, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!");
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!iHhhi!hhi!iHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!hi!", (int) (byte) 0, (int) (short) 1, "hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhh");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhh" + "'", str4, "hhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhh");
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        char[] charArray9 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IhHHI!HHI!Ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!HI!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhHhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhHHHHIH!HHHHIH!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IhHHI!HHI!Ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!HI!" + "'", str11, "HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IhHHI!HHI!Ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!HI!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhhih!hhhhih!" + "'", str12, "Hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhhih!hhhhih!");
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!", (int) 'a', (int) (byte) 1, "hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihhhih!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHhHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihhhih!" + "'", str4, "HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHhHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihhhih!");
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        char[] charArray13 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("HHIH!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("HHhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIH!IhHIH!!hHIH!!", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("HHHI!IHI!!hhHI!HHI!IhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhHI!HHI!IHI!HHI!!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hi!" + "'", str16, "Hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HHHI!IHI!!hhHI!HHI!IhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!" + "'", str19, "HHHI!IHI!!hhHI!HHI!IhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhHI!HHI!IHI!HHI!!" + "'", str20, "hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhHI!HHI!IHI!HHI!!");
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!IHhhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!", (int) '#', "Hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!IHhhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!" + "'", str4, "hhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!IHhhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        char[] charArray15 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray15);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("h", charArray15);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray15);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("HHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!", charArray15);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.initials("hHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!", charArray15);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhihhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!", charArray15);
        java.lang.Class<?> wildcardClass25 = charArray15.getClass();
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hhih!" + "'", str21, "Hhih!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "h" + "'", str23, "h");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhihhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!" + "'", str24, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhihhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIHHHHI!HHI!IHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str1, "Hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHHHIH!HHHhHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHIH!HHHhHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!" + "'", str2, "HHHHIH!HHHhHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!");
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        char[] charArray8 = new char[] { '4', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("h", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!ihhih!!hHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hih!ihhih!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hhhih!ihhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!!hhih!!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("Hhhih!hhhiHhi!hhi!ihi!hhi!!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhHI!HHI!IHI!HHI!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "h" + "'", str10, "h");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!ihhih!!hHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hih!ihhih!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hhhih!ihhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!!hhih!!" + "'", str12, "Hhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!ihhih!!hHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hih!ihhih!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hhhih!ihhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!!hhih!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "h" + "'", str14, "h");
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        char[] charArray16 = new char[] { '4', '4' };
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray16);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray16);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray16);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray16);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray16);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray16);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!", charArray16);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", charArray16);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray16);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhHHIH!", charArray16);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!", charArray16);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!", charArray16);
        java.lang.String str29 = org.apache.commons.lang.WordUtils.capitalize("hHhhhih!hhhhhih!hihhhih!hhhhhih!HhHI!IHI!!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!", charArray16);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!ihi!!!", charArray16);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hi!" + "'", str17, "Hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hI!" + "'", str19, "hI!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hi!" + "'", str20, "Hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H" + "'", str21, "H");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!" + "'", str23, "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str24, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H" + "'", str26, "H");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhihhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!" + "'", str27, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhihhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str28, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "HHhhhih!hhhhhih!hihhhih!hhhhhih!HhHI!IHI!!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str29, "HHhhhih!hhhhhih!hihhhih!hhhhhih!HhHI!IHI!!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!ihi!!!" + "'", str30, "Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!ihi!!!");
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        char[] charArray5 = new char[] { ' ', ' ', '#' };
        java.lang.String str6 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!IHI!!!", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ', '#' });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!ihi!!!" + "'", str6, "Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!ihi!!!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str7, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhi!hhi!iHhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!", 10, (int) '#', "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhi!hhi!ihi!hhi!!i!i");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhi!hhi!iHhhhhih!hhhhhih!hihhhih!hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhi!hhi!ihi!hhi!!i!i" + "'", str4, "hhhi!hhi!iHhhhhih!hhhhhih!hihhhih!hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhi!hhi!ihi!hhi!!i!i");
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        char[] charArray17 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray17);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray17);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray17);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray17);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("h", charArray17);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray17);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.initials("hhI!HhI!IhI!HhI!!", charArray17);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!HhI!IhI!HhI!!", charArray17);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.initials("hI!", charArray17);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.initials("HHHI!IHI!!hhHI!HHI!IhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!", charArray17);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.capitalize("hhhhhih!hhhhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHHIH!HHhhih!hhih!", charArray17);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H" + "'", str23, "H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "h" + "'", str24, "h");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str25, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "h" + "'", str26, "h");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "H" + "'", str27, "H");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Hhhhhih!hhhhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHHIH!HHhhih!hhih!" + "'", str28, "Hhhhhih!hhhhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHHIH!HHhhih!hhih!");
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhHhhhih!hhhhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHIhhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhiHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!h!hhhih!hhhih!hhhih!ihhih!hhhih!!!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHhhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhiHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!h!hhhih!hhhih!hhhih!ihhih!hhhih!!I!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!I!HhI!!", (int) (byte) 100, "hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhHhhhih!hhhhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHIhhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhiHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!h!hhhih!hhhih!hhhih!ihhih!hhhih!!!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHhhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhiHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!h!hhhih!hhhih!hhhih!ihhih!hhhih!!I!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!I!HhI!!" + "'", str4, "hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhHhhhih!hhhhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHIhhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhiHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!h!hhhih!hhhih!hhhih!ihhih!hhhih!!!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHhhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhiHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!h!hhhih!hhhih!hhhih!ihhih!hhhih!!I!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!I!HhI!!");
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhihhi!hhi!ih", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhihhi!hhi!ih" + "'", str2, "Hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhihhi!hhi!ih");
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        char[] charArray14 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("HHI!HHI!IHI!HHI!!", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("hHi!hHi!iHi!hHi!!", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("HhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("HHhhhih!hhHHHHIH!HHHhHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HHi!hHi!iHi!hHi!!" + "'", str19, "HHi!hHi!iHi!hHi!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str20, "HhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str21, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hHhhhih!hhHHHHIH!HHHhHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!" + "'", str22, "hHhhhih!hhHHHHIH!HHHhHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!");
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!" + "'", str2, "HHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!");
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhi!hhi!iHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!", (int) (short) 1, (int) (byte) -1, "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!HHHIH!HHHIH!HHHIH!HHHIH!HHHIH!IHHIH!HHHIH!!HHIH!HHHIH!HHHIH!HHHIH!HHHIH!IHHIH!HHHIH!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhi!hhi!iHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str4, "Hhhi!hhi!iHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHI!HHI!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!", (int) (byte) 100, 100, "Hhhih!hhhihhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 100, length 43");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHhhi!hhi!iHhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!HI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHhhi!hhi!iHhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!HI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!" + "'", str2, "HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHhhi!hhi!iHhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!HI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!");
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHHI!HHI!IhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHHHIH!HHHhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHIH!HIHHHhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!IH!HHHHHIHhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!!H!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHI!HHI!IhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHHHIH!HHHhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHIH!HIHHHhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!IH!HHHHHIHhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!!H!" + "'", str2, "hHHI!HHI!IhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHHHIH!HHHhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHIH!HIHHHhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!IH!HHHHHIHhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!!H!");
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        char[] charArray14 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("HI!", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihi!hhi!!", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("hHI!IHI!!", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIH!IhHIH!!hHIH!!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HHI!IHI!!" + "'", str19, "HHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!" + "'", str20, "Hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "h" + "'", str21, "h");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        char[] charArray16 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("HI!", charArray16);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray16);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!", charArray16);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", charArray16);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!", charArray16);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", charArray16);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalize("HhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IIhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I!hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IIhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IIhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I!hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I!", charArray16);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!", charArray16);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalize("hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i", charArray16);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hi!" + "'", str19, "Hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str20, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str21, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!" + "'", str22, "hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str23, "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IIhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I!hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IIhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IIhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I!hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I!" + "'", str24, "HhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IIhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I!hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IIhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IIhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I!hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!" + "'", str25, "hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i" + "'", str26, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i");
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!HhHIH!HhHIH!hhHIH!hhHIH!hhHIH!ihHIH!hhHIH!!hHIH!hhHIH!hhHIH!HhHIH!HhHIH!IhHIH!HhHIH!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!hHhih!hHhih!HHhih!HHhih!HHhih!IHhih!HHhih!!Hhih!HHhih!HHhih!hHhih!hHhih!iHhih!hHhih!!" + "'", str1, "HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!hHhih!hHhih!HHhih!HHhih!HHhih!IHhih!HHhih!!Hhih!HHhih!HHhih!hHhih!hHhih!iHhih!hHhih!!");
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hHhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!iHhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hHhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!Hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!Hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!Hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!HHI!IHi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHhhih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHhhih!" + "'", str1, "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHhhih!");
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.initials("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        char[] charArray15 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray15);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("h", charArray15);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray15);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray15);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.initials("hI!", charArray15);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhiHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hhih!" + "'", str21, "Hhih!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hi!" + "'", str22, "Hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "h" + "'", str23, "h");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str24, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("h", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h" + "'", str2, "h");
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        char[] charArray6 = new char[] { '4', '4' };
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Hi!" + "'", str7, "Hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str10, "Hhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhHhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhHhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str2, "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhHhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhhhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!" + "'", str1, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!");
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHI!HHI!IHI!HHI!!", (int) (byte) 10, (int) ' ', "Hhhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHI!HHI!IHI!HHI!!" + "'", str4, "HHI!HHI!IHI!HHI!!");
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhhhih!hhhhhhih!hhhhhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhhih!hhhhhhih!hhhhhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!" + "'", str2, "Hhhhhih!hhhhhhih!hhhhhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihHhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihhhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str1, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihhhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        char[] charArray19 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray19);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray19);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray19);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray19);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalize("h", charArray19);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray19);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.initials("hhI!HhI!IhI!HhI!!", charArray19);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!HhI!IhI!HhI!!", charArray19);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.initials("hI!", charArray19);
        java.lang.String str29 = org.apache.commons.lang.WordUtils.initials("", charArray19);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.initials("hHI!IHI!!", charArray19);
        java.lang.String str31 = org.apache.commons.lang.WordUtils.capitalize("Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!", charArray19);
        java.lang.String str32 = org.apache.commons.lang.WordUtils.capitalize("Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhhhHI!IHI!!hhHI!IHI!!ihHI!IHI!!hhHI!IHI!!!", charArray19);
        java.lang.Class<?> wildcardClass33 = charArray19.getClass();
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H" + "'", str24, "H");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "H" + "'", str25, "H");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "h" + "'", str26, "h");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str27, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "h" + "'", str28, "h");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "h" + "'", str30, "h");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str31, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhhhHI!IHI!!hhHI!IHI!!ihHI!IHI!!hhHI!IHI!!!" + "'", str32, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhhhHI!IHI!!hhHI!IHI!!ihHI!IHI!!hhHI!IHI!!!");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHHHIH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHHHIH!" + "'", str1, "hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHHHIH!");
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        char[] charArray6 = new char[] { '4', '4' };
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("Hhhih!hhhihhih!hhhi!hhi!ihhih!hi!hhi!!hhhhih!hi!hhi!ihihhih!!hhi!!ihhihhih!!hhi!ihi!hhhih!hi!!!hhi!hhhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Hi!" + "'", str7, "Hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhhih!hhhihhih!hhhi!hhi!ihhih!hi!hhi!!hhhhih!hi!hhi!ihihhih!!hhi!!ihhihhih!!hhi!ihi!hhhih!hi!!!hhi!hhhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!" + "'", str10, "Hhhih!hhhihhih!hhhi!hhi!ihhih!hi!hhi!!hhhhih!hi!hhi!ihihhih!!hhi!!ihhihhih!!hhi!ihi!hhhih!hi!!!hhi!hhhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!");
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhhhih!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhhhih!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!" + "'", str1, "hhhhhhih!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!");
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHhhhih!hhHHIH!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHhhhih!hhHHIH!" + "'", str2, "HHhhhih!hhHHIH!");
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!!" + "'", str1, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!!");
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        char[] charArray18 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray18);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray18);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray18);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray18);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("h", charArray18);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray18);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalize("Hhi!ihi!!", charArray18);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray18);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.capitalize("hHHHHIH!HHHHIH!", charArray18);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.initials("Hhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!ihhih!!hHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hih!ihhih!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hhhih!ihhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!!hhih!!", charArray18);
        java.lang.String str29 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!HhHIH!HhHIH!hhHIH!hhHIH!hhHIH!ihHIH!hhHIH!!hHIH!hhHIH!hhHIH!HhHIH!HhHIH!IhHIH!HhHIH!!", charArray18);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.uncapitalize("hHhih!hHhih!HHhih!HHhih!HHhih!IHhih!HHhih!!Hhih!HHhih!HHhih!hHhih!hHhih!iHhih!hHhih!!", charArray18);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H" + "'", str23, "H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hhih!" + "'", str24, "Hhih!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Hhi!ihi!!" + "'", str25, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Hi!" + "'", str26, "Hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "HHHHHIH!HHHHIH!" + "'", str27, "HHHHHIH!HHHHIH!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "H" + "'", str28, "H");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!HhHIH!HhHIH!hhHIH!hhHIH!hhHIH!ihHIH!hhHIH!!hHIH!hhHIH!hhHIH!HhHIH!HhHIH!IhHIH!HhHIH!!" + "'", str29, "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!HhHIH!HhHIH!hhHIH!hhHIH!hhHIH!ihHIH!hhHIH!!hHIH!hhHIH!hhHIH!HhHIH!HhHIH!IhHIH!HhHIH!!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hHhih!hHhih!HHhih!HHhih!HHhih!IHhih!HHhih!!Hhih!HHhih!HHhih!hHhih!hHhih!iHhih!hHhih!!" + "'", str30, "hHhih!hHhih!HHhih!HHhih!HHhih!IHhih!HHhih!!Hhih!HHhih!HHhih!hHhih!hHhih!iHhih!hHhih!!");
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        char[] charArray11 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIH!IhHIH!!hHIH!!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!HI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!Ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!HI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!HI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!HI!HHI!IHI!HHI!!!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!" + "'", str15, "Hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!HI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!Ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!HI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!HI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!HI!HHI!IHI!HHI!!!" + "'", str16, "HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!HI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!Ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!HI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!HI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!HI!HHI!IHI!HHI!!!");
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        char[] charArray14 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("HI!", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("HHIH!", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("Hhih!", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!I!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hi!" + "'", str17, "Hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhih!" + "'", str18, "Hhih!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhih!" + "'", str19, "Hhih!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str20, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!i!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str22, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!i!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHHIH!HHHhHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!", (int) (byte) 10, (int) 'a', "HhHI!IHI!!hhHI!IHI!!ihHI!IHI!!hhHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHHIH!HHHhHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!" + "'", str4, "hHHHIH!HHHhHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!");
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalize("hhHIH!HhHIhHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HhHIH!HhHIhHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!" + "'", str2, "HhHIH!HhHIhHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!");
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHHIH!HHhhHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHHIH!HHhhHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!" + "'", str1, "hHHHHIH!HHhhHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!");
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHhih!hHhih!HHhih!HHhih!HHhih!IHhih!HHhih!!Hhih!HHhih!HHhih!hHhih!hHhih!iHhih!hHhih!!", 10, 1, "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHhih!hHhhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i" + "'", str4, "hHHhih!hHhhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i");
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhHHIH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhHHIH!" + "'", str1, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhHHIH!");
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhi!hhi!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhi!hhi!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!" + "'", str2, "hhhi!hhi!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!");
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        char[] charArray18 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray18);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray18);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray18);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray18);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("h", charArray18);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray18);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.initials("hhI!HhI!IhI!HhI!!", charArray18);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!HhI!IhI!HhI!!", charArray18);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.initials("hI!", charArray18);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!HHI!IHI!HHI!!", charArray18);
        java.lang.String str29 = org.apache.commons.lang.WordUtils.capitalize("HhHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!", charArray18);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.capitalize("hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhiHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", charArray18);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H" + "'", str23, "H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H" + "'", str24, "H");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "h" + "'", str25, "h");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str26, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "h" + "'", str27, "h");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hHI!HHI!IHI!HHI!!" + "'", str28, "hHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "HhHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!" + "'", str29, "HhHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhiHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str30, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhiHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHI!IHI!!", 0, "HhHI!IHI!!hhHI!IHI!!ihHI!IHI!!hhHI!IHI!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHI!IHI!!" + "'", str4, "HHI!IHI!!");
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        char[] charArray20 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray20);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray20);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray20);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray20);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray20);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray20);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!", charArray20);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.uncapitalize("hHIH!", charArray20);
        java.lang.String str29 = org.apache.commons.lang.WordUtils.uncapitalize("HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!", charArray20);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.uncapitalize("hhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!", charArray20);
        java.lang.String str31 = org.apache.commons.lang.WordUtils.initials("HhI!HhI!IhI!HhI!!", charArray20);
        java.lang.String str32 = org.apache.commons.lang.WordUtils.uncapitalize("HHHhih!hHhih!HHhih!HHhih!HHhih!IHhih!HHhih!!Hhih!HHhih!HHhih!hHhih!hHhih!iHhih!hHhih!!", charArray20);
        java.lang.String str33 = org.apache.commons.lang.WordUtils.initials("hhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhihhI!HhI!Ih", charArray20);
        java.lang.String str34 = org.apache.commons.lang.WordUtils.initials("HhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!", charArray20);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hi!" + "'", str23, "Hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H" + "'", str24, "H");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "H" + "'", str25, "H");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hI!" + "'", str26, "hI!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!" + "'", str27, "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hHIH!" + "'", str28, "hHIH!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!" + "'", str29, "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str30, "hhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "H" + "'", str31, "H");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hHHhih!hHhih!HHhih!HHhih!HHhih!IHhih!HHhih!!Hhih!HHhih!HHhih!hHhih!hHhih!iHhih!hHhih!!" + "'", str32, "hHHhih!hHhih!HHhih!HHhih!HHhih!IHhih!HHhih!!Hhih!HHhih!HHhih!hHhih!hHhih!iHhih!hHhih!!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "h" + "'", str33, "h");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "H" + "'", str34, "H");
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        char[] charArray21 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray21);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray21);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray21);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray21);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalize("h", charArray21);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray21);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray21);
        java.lang.String str29 = org.apache.commons.lang.WordUtils.initials("hI!", charArray21);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihi!hhi!!", charArray21);
        java.lang.String str31 = org.apache.commons.lang.WordUtils.capitalize("hHIH!", charArray21);
        java.lang.String str32 = org.apache.commons.lang.WordUtils.uncapitalize("HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!", charArray21);
        java.lang.String str33 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray21);
        java.lang.String str34 = org.apache.commons.lang.WordUtils.initials("hhI!HhI!Ih", charArray21);
        java.lang.String str35 = org.apache.commons.lang.WordUtils.uncapitalize("HhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHIHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!", charArray21);
        java.lang.String str36 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i", charArray21);
        java.lang.Class<?> wildcardClass37 = charArray21.getClass();
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertArrayEquals(charArray21, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H" + "'", str26, "H");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Hhih!" + "'", str27, "Hhih!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Hi!" + "'", str28, "Hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "h" + "'", str29, "h");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str30, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "HHIH!" + "'", str31, "HHIH!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!" + "'", str32, "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "h" + "'", str33, "h");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "h" + "'", str34, "h");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHIHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str35, "hhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHIHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i" + "'", str36, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str2, "hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        char[] charArray18 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray18);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray18);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray18);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray18);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("h", charArray18);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray18);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!", charArray18);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.uncapitalize("HHI!HHI!IHI!HHI!!", charArray18);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.capitalize("HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!", charArray18);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.capitalize("hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!", charArray18);
        java.lang.String str29 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", charArray18);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!HHI!IhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!", charArray18);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H" + "'", str23, "H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H" + "'", str24, "H");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str25, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hHI!HHI!IHI!HHI!!" + "'", str26, "hHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!" + "'", str27, "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!" + "'", str28, "HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Hhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str29, "Hhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hHHI!HHI!IhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!" + "'", str30, "hHHI!HHI!IhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!");
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        char[] charArray8 = new char[] { '4', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!HhI!IhI!HhI!!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hhi!hhi!ihi!hhi!!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("HhhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str10, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I" + "'", str12, "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hhhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!" + "'", str13, "hhhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!" + "'", str14, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!");
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhHhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str1, "hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhHhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHI!HHI!IHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        char[] charArray19 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray19);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray19);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray19);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray19);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalize("h", charArray19);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray19);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray19);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.initials("Hhih!", charArray19);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.capitalizeFully("hhih!", charArray19);
        java.lang.String str29 = org.apache.commons.lang.WordUtils.initials("hhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!I!HhI!!", charArray19);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.uncapitalize("HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!", charArray19);
        java.lang.String str31 = org.apache.commons.lang.WordUtils.uncapitalize("hHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIHHHHI!HHI!IHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!", charArray19);
        java.lang.String str32 = org.apache.commons.lang.WordUtils.initials("hhhHHHIH!Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", charArray19);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H" + "'", str24, "H");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Hhih!" + "'", str25, "Hhih!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Hi!" + "'", str26, "Hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "H" + "'", str27, "H");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Hhih!" + "'", str28, "Hhih!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "h" + "'", str29, "h");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!" + "'", str30, "hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIHHHHI!HHI!IHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!" + "'", str31, "hHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIHHHHI!HHI!IHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "h" + "'", str32, "h");
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        char[] charArray17 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray17);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray17);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray17);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray17);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("h", charArray17);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray17);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray17);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.initials("hI!", charArray17);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.uncapitalize("hhih!", charArray17);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.initials("HhI!HhI!IhI!HhI!!", charArray17);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhhih!hhhhHHHIH!HHHHHIH!HIHHHIhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!H!HHHHHIH!HhHHHIH!HHhhih!hhih!", charArray17);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hhih!" + "'", str23, "Hhih!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hi!" + "'", str24, "Hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "h" + "'", str25, "h");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hhih!" + "'", str26, "hhih!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "H" + "'", str27, "H");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Hhhhhih!hhhhhhhih!hhhhhih!hihhhihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!h!hhhhhih!hhhhhih!hhhhih!hhih!" + "'", str28, "Hhhhhih!hhhhhhhih!hhhhhih!hihhhihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!h!hhhhhih!hhhhhih!hhhhih!hhih!");
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        char[] charArray16 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray16);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("h", charArray16);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray16);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray16);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.initials("HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", charArray16);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalize("hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!", charArray16);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.uncapitalize("hHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!I!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!", charArray16);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H" + "'", str21, "H");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhih!" + "'", str22, "Hhih!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "HI!" + "'", str23, "HI!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H" + "'", str24, "H");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!" + "'", str25, "HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!I!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!" + "'", str26, "hHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!I!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!");
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("", (int) (byte) -1, "hhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!ihhih!!hHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hih!ihhih!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hhhih!ihhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!!hhih!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHHhHhhHI!IHI!!hhHI!IHI!!ihHI!IHI!!hhHI!IHI!!!I!IHI!!hhHI!IHI!!ihHI!IHI!!hhHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        char[] charArray15 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray15);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("h", charArray15);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray15);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("hHI!IHI!!", charArray15);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.uncapitalize("hhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!ihhih!!hHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hih!ihhih!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hhhih!ihhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!!hhih!!", charArray15);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("hhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhh", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H" + "'", str21, "H");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "h" + "'", str22, "h");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!ihhih!!hHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hih!ihhih!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hhhih!ihhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!!hhih!!" + "'", str23, "hhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!ihhih!!hHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hih!ihhih!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hhhih!ihhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!!hhih!!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhh" + "'", str24, "Hhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhh");
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        char[] charArray7 = new char[] { '4', '4' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!HhI!IhI!HhI!!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("HHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("Hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hi!" + "'", str8, "Hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str9, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!" + "'", str10, "hHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!" + "'", str11, "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        char[] charArray14 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("HI!", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihi!hhi!!", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("hHI!IHI!!", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHHHIH!HHHHIH!", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HHI!IHI!!" + "'", str19, "HHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str20, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hhhhhih!hhhhih!" + "'", str21, "Hhhhhih!hhhhih!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str22, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hh" + "'", str1, "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hh");
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        char[] charArray13 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("hHIH!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("hHhhhih!hhHHIH!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "h" + "'", str17, "h");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str18, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "h" + "'", str19, "h");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str20, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str2, "hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        char[] charArray10 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("HHI!IHI!!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhhhhih!hhhhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhihhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!h!hhhih!hhhih!hhhih!ihhih!hhhih!!!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihhhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!h!hhhih!hhhih!hhhih!ihhih!hhhih!!i!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hhi!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HHI!IHI!!" + "'", str13, "HHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhhhhih!hhhhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhihhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!h!hhhih!hhhih!hhhih!ihhih!hhhih!!!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihhhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!h!hhhih!hhhih!hhhih!ihhih!hhhih!!i!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hhi!!" + "'", str14, "hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhhhhih!hhhhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhihhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!h!hhhih!hhhih!hhhih!ihhih!hhhih!!!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihhhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!h!hhhih!hhhih!hhhih!ihhih!hhhih!!i!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hhi!!");
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        char[] charArray17 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray17);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray17);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray17);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray17);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("h", charArray17);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray17);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.initials("hhI!HhI!IhI!HhI!!", charArray17);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!HhI!IhI!HhI!!", charArray17);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhHHIH!", charArray17);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.capitalize("HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", charArray17);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!", charArray17);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H" + "'", str23, "H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "h" + "'", str24, "h");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str25, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhHHIH!" + "'", str26, "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhHHIH!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!" + "'", str27, "HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hhhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!" + "'", str28, "hhhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!ihi!!!" + "'", str1, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!ihi!!!");
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        char[] charArray16 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray16);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("h", charArray16);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray16);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray16);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.initials("Hhih!", charArray16);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!HHI!IHI!HHI!!", charArray16);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.uncapitalize("HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHhHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihhhih!", charArray16);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H" + "'", str21, "H");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhih!" + "'", str22, "Hhih!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hi!" + "'", str23, "Hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H" + "'", str24, "H");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str25, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHhHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihhhih!" + "'", str26, "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHhHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihhhih!");
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhi!hhi!ihi!hhi!!i!i", 0, (int) (short) 10, "HHHIH!HHHIHhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHIHhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!HHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhi!hhi!iHHHIH!HHHIHhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHIHhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!HHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!" + "'", str4, "Hhhi!hhi!iHHHIH!HHHIHhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHIHhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!HHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!");
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        char[] charArray18 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray18);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray18);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray18);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray18);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("h", charArray18);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray18);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray18);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray18);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!HhI!IhI!HhI!!", charArray18);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.uncapitalize("hI!", charArray18);
        java.lang.String str29 = org.apache.commons.lang.WordUtils.capitalize("hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!", charArray18);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.initials("hHhih!hHhih!HHhih!HHhih!HHhih!IHhih!HHhih!!Hhih!HHhih!HHhih!hHhih!hHhih!iHhih!hHhih!!", charArray18);
        java.lang.Class<?> wildcardClass31 = charArray18.getClass();
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H" + "'", str23, "H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hhih!" + "'", str24, "Hhih!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str27, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hI!" + "'", str28, "hI!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!" + "'", str29, "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "h" + "'", str30, "h");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhih!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhih!" + "'", str2, "hhih!");
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        char[] charArray9 = new char[] { '4', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!IHI!!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hhi!!", charArray9);
        java.lang.Class<?> wildcardClass17 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hI!" + "'", str12, "hI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhi!ihi!!" + "'", str15, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hhi!!" + "'", str16, "Hhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hhi!!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        char[] charArray19 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray19);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray19);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray19);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray19);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalize("h", charArray19);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray19);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.initials("hhI!HhI!IhI!HhI!!", charArray19);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!HhI!IhI!HhI!!", charArray19);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.initials("hI!", charArray19);
        java.lang.String str29 = org.apache.commons.lang.WordUtils.initials("", charArray19);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.initials("hHI!IHI!!", charArray19);
        java.lang.String str31 = org.apache.commons.lang.WordUtils.uncapitalize("HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHH", charArray19);
        java.lang.String str32 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!", charArray19);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H" + "'", str24, "H");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "H" + "'", str25, "H");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "h" + "'", str26, "h");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str27, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "h" + "'", str28, "h");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "h" + "'", str30, "h");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHH" + "'", str31, "hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHH");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!" + "'", str32, "hHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!");
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhhhhih!hhhhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhihhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!h!hhhih!hhhih!hhhih!ihhih!hhhih!!!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihhhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!h!hhhih!hhhih!hhhih!ihhih!hhhih!!i!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hhi!!", (int) (byte) 1, (int) (short) 0, "hHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I" + "'", str4, "HhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I");
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        char[] charArray12 = new char[] { '4', '4' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("h", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("Hhi!ihi!!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("hI!", charArray12);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("", charArray12);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!", charArray12);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhih!hhhiHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hHHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!", charArray12);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("hhHIH!HhHIhHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hI!" + "'", str14, "hI!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "h" + "'", str15, "h");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hi!" + "'", str16, "Hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "h" + "'", str18, "h");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!" + "'", str20, "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hhhih!hhhiHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hHHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!" + "'", str21, "hhhih!hhhiHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hHHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hhHIH!HhHIhHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!" + "'", str22, "hhHIH!HhHIhHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!");
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!" + "'", str2, "hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!");
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!" + "'", str2, "HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!");
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!i!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!i!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str1, "hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!i!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHHI!HHI!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!hhi!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!" + "'", str1, "hhhi!hhi!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!");
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhhhih!hhhHhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhih!hhhHhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!" + "'", str1, "Hhhhih!hhhHhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        char[] charArray11 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("HHIH!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHhHHHIH!HHHHHIH!HIHhhHHHIH!HHhhih!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhih!" + "'", str13, "Hhih!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "h" + "'", str14, "h");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hI!" + "'", str15, "hI!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhhhih!hhhhhih!hihhhhhhih!hhhhih!" + "'", str16, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhhhih!hhhhhih!hihhhhhhih!hhhhih!");
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHHHI!HHI!IHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHHHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!HI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHHHI!HHI!IHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHHHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!HI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!" + "'", str2, "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHHHI!HHI!IHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHHHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!HI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!");
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhih!", (int) (byte) 10, "hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHHHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihihHHIH!HHHIHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhHhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhih!" + "'", str4, "Hhih!");
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        char[] charArray18 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray18);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray18);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray18);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray18);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("h", charArray18);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray18);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalize("Hhi!ihi!!", charArray18);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray18);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.initials("hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", charArray18);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.capitalize("hhHIH!HhHIH!hhHIH!hhHIH!hhHIH!ihHIH!hhHIH!!hHIH!hhHIH!hhHIH!HhHIH!HhHIH!IhHIH!HhHIH!!", charArray18);
        java.lang.String str29 = org.apache.commons.lang.WordUtils.initials("Hhhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!", charArray18);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!", charArray18);
        java.lang.Class<?> wildcardClass31 = charArray18.getClass();
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H" + "'", str23, "H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hhih!" + "'", str24, "Hhih!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Hhi!ihi!!" + "'", str25, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Hi!" + "'", str26, "Hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "h" + "'", str27, "h");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "HhHIH!HhHIH!hhHIH!hhHIH!hhHIH!ihHIH!hhHIH!!hHIH!hhHIH!hhHIH!HhHIH!HhHIH!IhHIH!HhHIH!!" + "'", str28, "HhHIH!HhHIH!hhHIH!hhHIH!hhHIH!ihHIH!hhHIH!!hHIH!hhHIH!hhHIH!HhHIH!HhHIH!IhHIH!HhHIH!!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "H" + "'", str29, "H");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hhhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str30, "hhhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        char[] charArray11 = new char[] { '4', '4' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("h", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("", charArray11);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hI!" + "'", str13, "hI!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "h" + "'", str14, "h");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "h" + "'", str15, "h");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhhih!hhhhhih!hihhhih!hhhhhih!h!" + "'", str18, "Hhhhih!hhhhhih!hihhhih!hhhhhih!h!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!" + "'", str20, "hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!");
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        char[] charArray10 = new char[] { '4', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("h", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("Hhi!ihi!!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("hI!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("HhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!IHI!!!", charArray10);
        java.lang.Class<?> wildcardClass19 = charArray10.getClass();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hI!" + "'", str12, "hI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "h" + "'", str16, "h");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!IHI!!!" + "'", str18, "hhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!IHI!!!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        char[] charArray9 = new char[] { '4', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("hHHI!IHI!!Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hI!" + "'", str12, "hI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "h" + "'", str15, "h");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!", (int) (short) 100, (int) (short) 100, "hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHhi!HHIH!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHhi!HHIH!" + "'", str4, "Hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHhi!HHIH!");
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        char[] charArray17 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray17);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray17);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray17);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray17);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("h", charArray17);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray17);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.initials("hhI!HhI!IhI!HhI!!", charArray17);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!HhI!IhI!HhI!!", charArray17);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhHHIH!", charArray17);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray17);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!", charArray17);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H" + "'", str23, "H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "h" + "'", str24, "h");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str25, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhHHIH!" + "'", str26, "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhHHIH!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str28, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        char[] charArray8 = new char[] { '4', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihi!hhi!!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihI!hhhi!hhi!ihi!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str12, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhi!hhi!ihi!" + "'", str14, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhi!hhi!ihi!");
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        char[] charArray16 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray16);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("HhI!HhI!IhI!HhI!!", charArray16);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("hhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i", charArray16);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("hHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!", charArray16);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIH!IhHIH!!hHIH!!", charArray16);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!!", charArray16);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.uncapitalize("hhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHIHhhi!hhi!ihi!hhi!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!", charArray16);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hi!" + "'", str20, "Hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hhI!HhI!IhI!HhI!!" + "'", str21, "hhI!HhI!IhI!HhI!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i" + "'", str22, "hhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "HHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!" + "'", str23, "HHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hhhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!" + "'", str24, "Hhhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!" + "'", str25, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHIHhhi!hhi!ihi!hhi!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!" + "'", str26, "hhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHIHhhi!hhi!ihi!hhi!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!");
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIH!IhHIH!!hHIH!!", 0, "HhHI!IHI!!hhHI!IHI!!ihHI!IHI!!hhHI!IHI!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIH!IhHIH!!hHIH!!" + "'", str4, "hhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIH!IhHIH!!hHIH!!");
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!", (int) (byte) 1, "hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str4, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhI!HhI!Ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhI!HhI!Ih" + "'", str1, "hhI!HhI!Ih");
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        char[] charArray13 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("h", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hi!" + "'", str19, "Hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        char[] charArray14 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("h", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("hHIH!", charArray14);
        java.lang.Class<?> wildcardClass23 = charArray14.getClass();
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhih!" + "'", str20, "Hhih!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H" + "'", str21, "H");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HHIH!" + "'", str22, "HHIH!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        char[] charArray18 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray18);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray18);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray18);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray18);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("h", charArray18);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray18);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray18);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.initials("Hhih!", charArray18);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.capitalizeFully("hhih!", charArray18);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.initials("hhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!I!HhI!!", charArray18);
        java.lang.String str29 = org.apache.commons.lang.WordUtils.uncapitalize("HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!", charArray18);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhih!hhhihhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!", charArray18);
        java.lang.Class<?> wildcardClass31 = charArray18.getClass();
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H" + "'", str23, "H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hhih!" + "'", str24, "Hhih!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Hi!" + "'", str25, "Hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H" + "'", str26, "H");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Hhih!" + "'", str27, "Hhih!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "h" + "'", str28, "h");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!" + "'", str29, "hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str30, "Hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        char[] charArray8 = new char[] { '4', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hhih!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hHHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hI!" + "'", str11, "hI!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhih!" + "'", str13, "Hhih!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hhi!!" + "'", str14, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hhi!!");
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        char[] charArray20 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray20);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray20);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray20);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray20);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalize("h", charArray20);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray20);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.initials("hhI!HhI!IhI!HhI!!", charArray20);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!HhI!IhI!HhI!!", charArray20);
        java.lang.String str29 = org.apache.commons.lang.WordUtils.initials("hI!", charArray20);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.initials("", charArray20);
        java.lang.String str31 = org.apache.commons.lang.WordUtils.initials("hHI!IHI!!", charArray20);
        java.lang.String str32 = org.apache.commons.lang.WordUtils.capitalize("Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!", charArray20);
        java.lang.String str33 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHI!HHI!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!", charArray20);
        java.lang.String str34 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHI!IHI!!hhHI!HHI!IhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!", charArray20);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "H" + "'", str25, "H");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H" + "'", str26, "H");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "h" + "'", str27, "h");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str28, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "h" + "'", str29, "h");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "h" + "'", str31, "h");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str32, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Hhhi!hhi!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!" + "'", str33, "Hhhi!hhi!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Hhhi!ihi!!hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!" + "'", str34, "Hhhi!ihi!!hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!");
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhihhi!hhi!ih", 10, 0, "hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihI!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhih!hhhihhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihI!" + "'", str4, "Hhhih!hhhihhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihI!");
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHhi!hhi!iHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!", (int) 'a', (int) '4', "HHHHIH!HHHhHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 97, length 45");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        char[] charArray17 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray17);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray17);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray17);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray17);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("h", charArray17);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray17);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.initials("hhI!HhI!IhI!HhI!!", charArray17);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray17);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalize("hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I", charArray17);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.capitalize("HhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!IHI!!!", charArray17);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!ihi!!!", charArray17);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H" + "'", str23, "H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "h" + "'", str24, "h");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Hi!" + "'", str25, "Hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I" + "'", str26, "HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "HhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!IHI!!!" + "'", str27, "HhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!IHI!!!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!ihi!!!" + "'", str28, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!ihi!!!");
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        char[] charArray13 = new char[] { '4', '4' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!", charArray13);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", charArray13);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray13);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhHHIH!", charArray13);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!", charArray13);
        java.lang.Class<?> wildcardClass25 = charArray13.getClass();
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hI!" + "'", str16, "hI!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hi!" + "'", str17, "Hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!" + "'", str20, "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str21, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H" + "'", str23, "H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhihhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!" + "'", str24, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhihhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihI!" + "'", str1, "HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihI!");
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        char[] charArray12 = new char[] { '4', '4' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!IHI!!", charArray12);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("hhI!HhI!IhI!HhI!!", charArray12);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!", charArray12);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!", charArray12);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hHHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hI!" + "'", str15, "hI!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hi!" + "'", str16, "Hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhi!ihi!!" + "'", str18, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HhI!HhI!IhI!HhI!!" + "'", str19, "HhI!HhI!IhI!HhI!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "h" + "'", str20, "h");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H" + "'", str21, "H");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hHHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!" + "'", str22, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hHHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!");
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        char[] charArray14 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("h", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("hhi!ihi!!", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!ihi!!!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("HhHI!IHI!!Hhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhh", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("HHhhhih!hhhhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!I!HhI!!", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "h" + "'", str17, "h");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "h" + "'", str18, "h");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "h" + "'", str19, "h");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!ihi!!!" + "'", str20, "Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!ihi!!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H" + "'", str21, "H");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HHhhhih!hhhhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!I!HhI!!" + "'", str22, "HHhhhih!hhhhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!I!HhI!!");
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhihhi!hhi!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhihhi!hhi!ih" + "'", str1, "Hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhihhi!hhi!ih");
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!i!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!i!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!" + "'", str1, "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!i!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!i!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhhi!hhi!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhi!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!" + "'", str1, "Hhhi!hhi!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!");
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhhih!hhhihhih!hhhi!hhi!ihhih!hi!hhi!!hhhhih!hi!hhi!ihihhih!!hhi!!ihhihhih!!hhi!ihi!hhhih!hi!!!hhi!hhHhi!hhi!iHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhih!hhhihhih!hhhi!hhi!ihhih!hi!hhi!!hhhhih!hi!hhi!ihihhih!!hhi!!ihhihhih!!hhi!ihi!hhhih!hi!!!hhi!hhHhi!hhi!iHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!" + "'", str1, "Hhhih!hhhihhih!hhhi!hhi!ihhih!hi!hhi!!hhhhih!hi!hhi!ihihhih!!hhi!!ihhihhih!!hhi!ihi!hhhih!hi!!!hhi!hhHhi!hhi!iHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!");
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        char[] charArray18 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray18);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray18);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray18);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray18);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("h", charArray18);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray18);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.initials("hhI!HhI!IhI!HhI!!", charArray18);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!HhI!IhI!HhI!!", charArray18);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.initials("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhihhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!", charArray18);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.capitalize("HhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!", charArray18);
        java.lang.String str29 = org.apache.commons.lang.WordUtils.capitalize("Hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhiHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!h!hhhih!hhhih!hhhih!ihhih!hhhih!!", charArray18);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.uncapitalize("HhHhhhih!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!", charArray18);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H" + "'", str23, "H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H" + "'", str24, "H");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "h" + "'", str25, "h");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str26, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "H" + "'", str27, "H");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "HhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str28, "HhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhiHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!h!hhhih!hhhih!hhhih!ihhih!hhhih!!" + "'", str29, "Hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhiHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!h!hhhih!hhhih!hhhih!ihhih!hhhih!!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hhHhhhih!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!" + "'", str30, "hhHhhhih!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!");
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHHI!IHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHHI!HHI!IHI!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHI!IHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHHI!HHI!IHI!" + "'", str2, "hHHI!IHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHHI!HHI!IHI!");
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhihhI!HhI!Ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!" + "'", str2, "Hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!");
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhhhih!hhhhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHHIH!HHhhih!hhih!", 100, (int) (byte) 1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 100, length 62");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        char[] charArray17 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray17);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("HI!", charArray17);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihi!hhi!!", charArray17);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray17);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("hHI!IHI!!", charArray17);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.initials("HHIH!", charArray17);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.initials("hHI!HHI!IHI!HHI!!", charArray17);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray17);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalize("Hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!", charArray17);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!", charArray17);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.capitalize("HHHHIH!HHHhHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!", charArray17);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H" + "'", str21, "H");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HHI!IHI!!" + "'", str22, "HHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H" + "'", str23, "H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "h" + "'", str24, "h");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "HI!" + "'", str25, "HI!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!" + "'", str26, "Hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!" + "'", str27, "hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "HHHHIH!HHHhHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!" + "'", str28, "HHHHIH!HHHhHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!");
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhi!hhi!ihi!hhi!!i!i", (int) (byte) -1, 1, "Hhhih!hhhihhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhhih!hhhihhi!hhi!ihi!hhi!!" + "'", str4, "HHhhih!hhhihhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str1, "Hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        char[] charArray16 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("HI!", charArray16);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray16);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!", charArray16);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", charArray16);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!", charArray16);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", charArray16);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalize("HhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IIhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I!hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IIhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IIhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I!hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I!", charArray16);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.initials("hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!", charArray16);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hi!" + "'", str19, "Hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str20, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str21, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!" + "'", str22, "hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str23, "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IIhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I!hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IIhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IIhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I!hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I!" + "'", str24, "HhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IIhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I!hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IIhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IIhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I!hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "h" + "'", str26, "h");
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhhih!hhhhhhhih!hhhhhih!hihhhihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!h!hhhhhih!hhhhhih!hhhhih!hhih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhhih!hhhhhhhih!hhhhhih!hihhhihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!h!hhhhhih!hhhhhih!hhhhih!hhih!" + "'", str1, "hhhhhih!hhhhhhhih!hhhhhih!hihhhihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!h!hhhhhih!hhhhhih!hhhhih!hhih!");
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("", (int) (byte) -1, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhHhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!I!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!I!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!" + "'", str1, "HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!I!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!");
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!" + "'", str2, "HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!");
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        char[] charArray7 = new char[] { '4', '4' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!HhI!IhI!HhI!!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("hHi!hHi!iHi!hHi!!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ih", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!", charArray7);
        java.lang.Class<?> wildcardClass13 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hi!" + "'", str8, "Hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str9, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "h" + "'", str10, "h");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hhi!hhi!ih" + "'", str11, "hhi!hhi!ih");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        char[] charArray7 = new char[] { '4', '4' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hHHHHIH!HHHHIH!", charArray7);
        java.lang.Class<?> wildcardClass13 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hi!" + "'", str8, "Hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!" + "'", str11, "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HHHHHIH!HHHHIH!" + "'", str12, "HHHHHIH!HHHHIH!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!IhHhi!ihi!!hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        char[] charArray12 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("HI!", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("hHI!IHI!!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("HhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!!", charArray12);
        java.lang.Class<?> wildcardClass19 = charArray12.getClass();
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "h" + "'", str15, "h");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!" + "'", str16, "HhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str17, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!!" + "'", str18, "hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!" + "'", str1, "hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!");
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str1, "Hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        char[] charArray21 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray21);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray21);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray21);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray21);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalize("h", charArray21);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray21);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.initials("hhI!HhI!IhI!HhI!!", charArray21);
        java.lang.String str29 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!HhI!IhI!HhI!!", charArray21);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.initials("hI!", charArray21);
        java.lang.String str31 = org.apache.commons.lang.WordUtils.initials("", charArray21);
        java.lang.String str32 = org.apache.commons.lang.WordUtils.initials("hHI!IHI!!", charArray21);
        java.lang.String str33 = org.apache.commons.lang.WordUtils.uncapitalize("HhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", charArray21);
        java.lang.String str34 = org.apache.commons.lang.WordUtils.initials("Hhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!ihhih!!hHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hih!ihhih!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hhhih!ihhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!!hhih!!", charArray21);
        java.lang.String str35 = org.apache.commons.lang.WordUtils.capitalize("hhHI!IHI!!hhHI!IHI!!ihHI!IHI!!hhHI!IHI!!!", charArray21);
        java.lang.String str36 = org.apache.commons.lang.WordUtils.capitalize("hHHIH!HHHIhHI!HHI!IHI!HHI!!", charArray21);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertArrayEquals(charArray21, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H" + "'", str26, "H");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "H" + "'", str27, "H");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "h" + "'", str28, "h");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str29, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "h" + "'", str30, "h");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "h" + "'", str32, "h");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!" + "'", str33, "hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "H" + "'", str34, "H");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "HhHI!IHI!!hhHI!IHI!!ihHI!IHI!!hhHI!IHI!!!" + "'", str35, "HhHI!IHI!!hhHI!IHI!!ihHI!IHI!!hhHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "HHHIH!HHHIhHI!HHI!IHI!HHI!!" + "'", str36, "HHHIH!HHHIhHI!HHI!IHI!HHI!!");
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!" + "'", str1, "hhHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!");
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhhhhih!hhhhhih!hhhhhih!hihhhihhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhh", (int) (short) 100, "hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhhhih!hhhhhih!hhhhhih!hihhhihhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!ihhhhih!hhhhhih!hihhhih!hhhhhhhh" + "'", str4, "Hhhhhhih!hhhhhih!hhhhhih!hihhhihhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!ihhhhih!hhhhhih!hihhhih!hhhhhhhh");
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str1, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        char[] charArray9 = new char[] { '4', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("Hhhhih!hhhhhih!hihhhih!hhhhhih!h!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("hhHIH!HhHIH!hhHIH!hhHIH!hhHIH!ihHIH!hhHIH!!hHIH!hhHIH!hhHIH!HhHIH!HhHIH!IhHIH!HhHIH!!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("hhHI!IHI!!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!HhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!IHI!!!", charArray9);
        java.lang.Class<?> wildcardClass17 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hI!" + "'", str12, "hI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhhhih!hhhhhih!hihhhih!hhhhhih!h!" + "'", str14, "Hhhhih!hhhhhih!hihhhih!hhhhhih!h!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "h" + "'", str15, "h");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhHI!IHI!!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!HhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!IHI!!!" + "'", str16, "hhHI!IHI!!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!HhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!IHI!!!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!", (int) (short) 100, 0, "hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!IHI!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 100, length 93");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhhhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHIHhhih!hhhihhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihihhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str1, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihihhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!" + "'", str1, "Hhhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!");
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
        char[] charArray22 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray22);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray22);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray22);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray22);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.capitalize("h", charArray22);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray22);
        java.lang.String str29 = org.apache.commons.lang.WordUtils.initials("hhI!HhI!IhI!HhI!!", charArray22);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!HhI!IhI!HhI!!", charArray22);
        java.lang.String str31 = org.apache.commons.lang.WordUtils.initials("hI!", charArray22);
        java.lang.String str32 = org.apache.commons.lang.WordUtils.initials("", charArray22);
        java.lang.String str33 = org.apache.commons.lang.WordUtils.initials("hHI!IHI!!", charArray22);
        java.lang.String str34 = org.apache.commons.lang.WordUtils.uncapitalize("HhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", charArray22);
        java.lang.String str35 = org.apache.commons.lang.WordUtils.initials("Hhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!ihhih!!hHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hih!ihhih!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hhhih!ihhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!!hhih!!", charArray22);
        java.lang.String str36 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!", charArray22);
        java.lang.String str37 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I", charArray22);
        java.lang.String str38 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!", charArray22);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "H" + "'", str27, "H");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "H" + "'", str28, "H");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "h" + "'", str29, "h");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str30, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "h" + "'", str31, "h");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "h" + "'", str33, "h");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!" + "'", str34, "hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "H" + "'", str35, "H");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str36, "hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i" + "'", str37, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!" + "'", str38, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!");
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        char[] charArray16 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("HI!", charArray16);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihi!hhi!!", charArray16);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray16);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("hHI!IHI!!", charArray16);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("HHIH!", charArray16);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.initials("hHI!HHI!IHI!HHI!!", charArray16);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalize("hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!", charArray16);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHhih!hHhih!HHhih!HHhih!HHhih!IHhih!HHhih!!Hhih!HHhih!HHhih!hHhih!hHhih!iHhih!hHhih!!", charArray16);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!hhi!iHhhi!hhi!ihi!hhi!!hhhihHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!", charArray16);
        java.lang.Class<?> wildcardClass27 = charArray16.getClass();
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HHI!IHI!!" + "'", str21, "HHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "h" + "'", str23, "h");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!" + "'", str24, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Hhhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!" + "'", str25, "Hhhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Hhhi!hhi!iHhhi!hhi!ihi!hhi!!hhhihHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!" + "'", str26, "Hhhi!hhi!iHhhi!hhi!ihi!hhi!!hhhihHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        char[] charArray17 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray17);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray17);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray17);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray17);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("h", charArray17);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray17);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray17);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.initials("Hhih!", charArray17);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalizeFully("hhih!", charArray17);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.uncapitalize("hhHIH!HhHIH!hhHIH!hhHIH!hhHIH!ihHIH!hhHIH!!hHIH!hhHIH!hhHIH!HhHIH!HhHIH!IhHIH!HhHIH!!", charArray17);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.uncapitalize("HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I", charArray17);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hhih!" + "'", str23, "Hhih!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hi!" + "'", str24, "Hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "H" + "'", str25, "H");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Hhih!" + "'", str26, "Hhih!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hhHIH!HhHIH!hhHIH!hhHIH!hhHIH!ihHIH!hhHIH!!hHIH!hhHIH!hhHIH!HhHIH!HhHIH!IhHIH!HhHIH!!" + "'", str27, "hhHIH!HhHIH!hhHIH!hhHIH!hhHIH!ihHIH!hhHIH!!hHIH!hhHIH!hhHIH!HhHIH!HhHIH!IhHIH!HhHIH!!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I" + "'", str28, "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I");
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("h", (int) 'a', 100, "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhHhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 97, length 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHI!HHI!IHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!", (int) 'a', (int) (byte) -1, "hhhih!hhhihhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 97, length 57");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        char[] charArray5 = new char[] { '4', '4' };
        java.lang.String str6 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!ihi!!!", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hi!" + "'", str6, "Hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!ihi!!!" + "'", str7, "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!ihi!!!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i" + "'", str8, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i");
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        char[] charArray14 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("hHIH!", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("H", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihi!hhi!!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("hHI!HHI!IHI!HHI!!", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("HhHHHIH!HHhhih!", charArray14);
        java.lang.Class<?> wildcardClass23 = charArray14.getClass();
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "h" + "'", str18, "h");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str20, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "h" + "'", str21, "h");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
        char[] charArray16 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray16);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("h", charArray16);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray16);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!", charArray16);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("HHIH!", charArray16);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.initials("Hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!", charArray16);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.uncapitalize("HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!", charArray16);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H" + "'", str21, "H");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhih!" + "'", str22, "Hhih!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str23, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hhih!" + "'", str24, "Hhih!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "H" + "'", str25, "H");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!" + "'", str26, "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!");
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        char[] charArray8 = new char[] { '4', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("hHhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIH!IhHIH!!hHIH!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I" + "'", str12, "HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!" + "'", str13, "HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "h" + "'", str14, "h");
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!", (int) (short) 0, (int) (byte) 0, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!" + "'", str4, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!");
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!" + "'", str1, "hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!");
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhi!hhi!ihHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHHIH!HHhhih!", 0, (int) '#', "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhi!hhi!ihHhHHHIH!HHHHHIH!HIHHHIH!H" + "'", str4, "hhi!hhi!ihHhHHHIH!HHHHHIH!HIHHHIH!H");
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        char[] charArray8 = new char[] { '4', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!HhI!IhI!HhI!!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hHi!hHi!iHi!hHi!!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ih", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhi!hhi!ihi!hhi!!", charArray8);
        java.lang.Class<?> wildcardClass15 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str10, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hhi!hhi!ih" + "'", str12, "hhi!hhi!ih");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhi!hhi!ihi!hhi!!" + "'", str14, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhih!hhhihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hhi!!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhih!hhhihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hhi!!" + "'", str2, "Hhhih!hhhihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hhi!!");
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHHI!IHI!!Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHI!IHI!!Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str2, "hHHI!IHI!!Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhih!hhhihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhi!hhi!ihHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!ihi!!!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhih!hhhihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhi!hhi!ihHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!ihi!!!" + "'", str2, "Hhhih!hhhihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhi!hhi!ihHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!ihi!!!");
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        char[] charArray20 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray20);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray20);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray20);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray20);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalize("h", charArray20);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray20);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray20);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.initials("hI!", charArray20);
        java.lang.String str29 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihi!hhi!!", charArray20);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.initials("hi!", charArray20);
        java.lang.String str31 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHI!HHI!IhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!", charArray20);
        java.lang.String str32 = org.apache.commons.lang.WordUtils.initials("HHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!", charArray20);
        java.lang.String str33 = org.apache.commons.lang.WordUtils.initials("Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhihhhi!ihi!!hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!", charArray20);
        java.lang.String str34 = org.apache.commons.lang.WordUtils.capitalize("hHHI!HHI!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!", charArray20);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "H" + "'", str25, "H");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Hhih!" + "'", str26, "Hhih!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Hi!" + "'", str27, "Hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "h" + "'", str28, "h");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str29, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "h" + "'", str30, "h");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str31, "Hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "H" + "'", str32, "H");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "H" + "'", str33, "H");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "HHHI!HHI!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!" + "'", str34, "HHHI!HHI!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!");
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!", (int) (short) 0, (int) (byte) -1, "hhI!HhI!IhI!HhI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!" + "'", str4, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!");
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!ihi!!!" + "'", str1, "hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!ihi!!!");
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        char[] charArray13 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("hHI!HHI!IHI!HHI!!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("Hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!ihhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!ihhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!!hhih!ihhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!ihhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HHI!HHI!IHI!HHI!!" + "'", str17, "HHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str18, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihHhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihHhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str2, "hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihHhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("", (int) ' ', "hHhHHHIH!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!hhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!HHIHhhi!hhi!ihi!hhi!!hhhi!hhi!ihhhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!i!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhhhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!i!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhhhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!i!hhi!ihi!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        char[] charArray9 = new char[] { '4', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("HhI!HhI!IhI!HhI!!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!ihi!!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!" + "'", str14, "HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!ihi!!!" + "'", str16, "hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!ihi!!!");
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhi!hhi!ihi!hhi!!i!i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhi!hhi!ihi!hhi!!i!i" + "'", str1, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhi!hhi!ihi!hhi!!i!i");
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        char[] charArray8 = new char[] { '4', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hhih!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("hHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!", charArray8);
        java.lang.Class<?> wildcardClass15 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hI!" + "'", str11, "hI!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhih!" + "'", str13, "Hhih!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "h" + "'", str14, "h");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        char[] charArray12 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("hHI!HHI!IHI!HHI!!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhhhih!hhHHHHIH!HHHhHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HHI!HHI!IHI!HHI!!" + "'", str16, "HHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "h" + "'", str17, "h");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhhhih!hhhhhhih!hhhhhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!" + "'", str18, "Hhhhhih!hhhhhhih!hhhhhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
        char[] charArray17 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray17);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray17);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray17);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray17);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("h", charArray17);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray17);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray17);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.initials("Hhih!", charArray17);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray17);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.initials("HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!", charArray17);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.initials("", charArray17);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hhih!" + "'", str23, "Hhih!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hi!" + "'", str24, "Hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "H" + "'", str25, "H");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HI!" + "'", str26, "HI!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "H" + "'", str27, "H");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        char[] charArray16 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray16);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("h", charArray16);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray16);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray16);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.initials("hI!", charArray16);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihi!hhi!!", charArray16);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.uncapitalize("hhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i", charArray16);
        java.lang.Class<?> wildcardClass27 = charArray16.getClass();
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H" + "'", str21, "H");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhih!" + "'", str22, "Hhih!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hi!" + "'", str23, "Hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "h" + "'", str24, "h");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str25, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i" + "'", str26, "hhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!IHI!!!", (int) (byte) 0, (int) (byte) 100, "hHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIHHHHI!HHI!IHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHhHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIHHHHI!HHI!IHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!" + "'", str4, "HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHhHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIHHHHI!HHI!IHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!");
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        char[] charArray9 = new char[] { '4', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!HhI!IhI!HhI!!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("HhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIH!IhHIH!!hHIH!!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("HHIH!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("hhHIH!HhHIH!hhHIH!hhHIH!hhHIH!ihHIH!hhHIH!!hHIH!hhHIH!hhHIH!HhHIH!HhHIH!IhHIH!HhHIH!!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHHHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str11, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HI!" + "'", str12, "HI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhih!" + "'", str14, "Hhih!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hhHIH!HhHIH!hhHIH!hhHIH!hhHIH!ihHIH!hhHIH!!hHIH!hhHIH!hhHIH!HhHIH!HhHIH!IhHIH!HhHIH!!" + "'", str15, "hhHIH!HhHIH!hhHIH!hhHIH!hhHIH!ihHIH!hhHIH!!hHIH!hhHIH!hhHIH!HhHIH!HhHIH!IhHIH!HhHIH!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str16, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHH", (int) (short) 0, (int) (byte) 1, "hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihhhih!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihhhih!" + "'", str4, "hhHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihhhih!");
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
        char[] charArray21 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray21);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray21);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray21);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray21);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalize("h", charArray21);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray21);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.initials("hhI!HhI!IhI!HhI!!", charArray21);
        java.lang.String str29 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!HhI!IhI!HhI!!", charArray21);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.initials("hI!", charArray21);
        java.lang.String str31 = org.apache.commons.lang.WordUtils.initials("", charArray21);
        java.lang.String str32 = org.apache.commons.lang.WordUtils.initials("hHI!IHI!!", charArray21);
        java.lang.String str33 = org.apache.commons.lang.WordUtils.uncapitalize("HhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", charArray21);
        java.lang.String str34 = org.apache.commons.lang.WordUtils.initials("Hhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!ihhih!!hHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hih!ihhih!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hhhih!ihhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!!hhih!!", charArray21);
        java.lang.String str35 = org.apache.commons.lang.WordUtils.capitalize("HhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", charArray21);
        java.lang.String str36 = org.apache.commons.lang.WordUtils.initials("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hi!", charArray21);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertArrayEquals(charArray21, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H" + "'", str26, "H");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "H" + "'", str27, "H");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "h" + "'", str28, "h");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str29, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "h" + "'", str30, "h");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "h" + "'", str32, "h");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!" + "'", str33, "hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "H" + "'", str34, "H");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "HhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!" + "'", str35, "HhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "H" + "'", str36, "H");
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
        char[] charArray15 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray15);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("h", charArray15);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray15);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!", charArray15);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHIH!HHHIHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!H!IHHIH!!HHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HIH!IHHIH!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHHIH!IHHIHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!H!!HHIH!!", charArray15);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhih!hhhihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HI!" + "'", str21, "HI!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str22, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!h!ihhih!!hhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hih!ihhih!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhhih!ihhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!h!!hhih!!" + "'", str23, "Hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!h!ihhih!!hhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hih!ihhih!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhhih!ihhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!h!!hhih!!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hhhih!hhhihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i" + "'", str24, "Hhhih!hhhihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i");
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
        char[] charArray16 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray16);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("h", charArray16);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray16);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.initials("hhI!HhI!IhI!HhI!!", charArray16);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!HhI!IhI!HhI!!", charArray16);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.initials("hI!", charArray16);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.uncapitalize("HHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", charArray16);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H" + "'", str21, "H");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "h" + "'", str23, "h");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str24, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "h" + "'", str25, "h");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!" + "'", str26, "hHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!");
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHHIH!HHHIHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHHI!HHI!IHhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!HHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!IHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHIH!HHHIHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHHI!HHI!IHhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!HHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!IHI!!!" + "'", str1, "hHHIH!HHHIHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHHI!HHI!IHhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!HHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!IHI!!!");
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhi!hhi!ihi!hhi!!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhi!hhi!ihi!hhi!!" + "'", str2, "hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        char[] charArray10 = new char[] { '4', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!HhI!IhI!HhI!!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("HhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIH!IhHIH!!hHIH!!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("HHIH!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("Hhih!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhhhih!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("hhhih!hhhiHhi!hhi!ihi!hhi!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str12, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HI!" + "'", str13, "HI!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhih!" + "'", str15, "Hhih!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hhhhhhih!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!" + "'", str17, "hhhhhhih!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhhih!hhhiHhi!hhi!ihi!hhi!!" + "'", str18, "hhhih!hhhiHhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHH" + "'", str1, "HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHH");
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        char[] charArray8 = new char[] { '4', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!HhI!IhI!HhI!!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hHi!hHi!iHi!hHi!!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ih", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hHi!hHi!iHi!hHi!!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hHHI!HHI!IhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str10, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hhi!hhi!ih" + "'", str12, "hhi!hhi!ih");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HHi!hHi!iHi!hHi!!" + "'", str13, "HHi!hHi!iHi!hHi!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HHHI!HHI!IhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!" + "'", str14, "HHHI!HHI!IhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!");
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
        char[] charArray12 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("HI!", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhhih!hhhhih!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhHHIH!", charArray12);
        java.lang.Class<?> wildcardClass19 = charArray12.getClass();
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str16, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhhhhih!hhhhih!" + "'", str17, "Hhhhhih!hhhhih!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!" + "'", str18, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!", (int) (byte) 100, "HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!" + "'", str4, "HHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!");
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
        char[] charArray11 = new char[] { '#', '4', '4', '4', '4', '#' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihi!hhi!!", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("HHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("HhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '#', '4', '4', '4', '4', '#' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str12, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str13, "Hhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!" + "'", str14, "hHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
        char[] charArray13 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("HhI!HhI!IhI!HhI!!", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!HhI!IhI!HhI!!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("hhI!HhI!Ih", charArray13);
        java.lang.Class<?> wildcardClass21 = charArray13.getClass();
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hi!" + "'", str17, "Hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhI!HhI!IhI!HhI!!" + "'", str18, "hhI!HhI!IhI!HhI!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str19, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hhI!HhI!Ih" + "'", str20, "hhI!HhI!Ih");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!", (int) ' ', "hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str4, "Hhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
        char[] charArray12 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("HI!", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihi!hhi!!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIH!IhHIH!!hHIH!!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!" + "'", str17, "Hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "h" + "'", str18, "h");
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHHHHHIH!HHHHHIH!HIHHHHHHIH!HHHHIH!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHHHHHIH!HHHHHIH!HIHHHHHHIH!HHHHIH!" + "'", str2, "HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHHHHHIH!HHHHHIH!HIHHHHHHIH!HHHHIH!");
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
        char[] charArray12 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("HI!", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("HHIH!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("Hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhih!" + "'", str16, "Hhih!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!" + "'", str17, "Hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        char[] charArray11 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("hHI!HHI!IHI!HHI!!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhi!hhi!ihhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HHI!HHI!IHI!HHI!!" + "'", str15, "HHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhi!hhi!ihhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str16, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhi!hhi!ihhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!ihi!!!" + "'", str1, "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!ihi!!!");
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IhHHI!HHI!Ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
        char[] charArray6 = new char[] { '4', '4' };
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("HHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("hHHIH!HHHIHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHHI!HHI!IHhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!HHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!IHI!!!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Hi!" + "'", str7, "Hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hI!" + "'", str8, "hI!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!" + "'", str9, "hHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "h" + "'", str10, "h");
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhhhih!hhhhHHHIH!HHHHHIH!HIHHHIhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!H!HHHHHIH!HhHHHIH!HHhhih!hhih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHHIH!HHHHhhhih!hhhhhih!hihhhiHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!h!hhhhhih!hHhhhih!hhHHIH!HHIH!" + "'", str1, "hHHHHIH!HHHHhhhih!hhhhhih!hihhhiHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!h!hhhhhih!hHhhhih!hhHHIH!HHIH!");
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
        char[] charArray12 = new char[] { '4', '4' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!IHI!!", charArray12);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!", charArray12);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihi!hhi!!", charArray12);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhhhih!hhHHIH!", charArray12);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("hHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!", charArray12);
        java.lang.Class<?> wildcardClass23 = charArray12.getClass();
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hI!" + "'", str15, "hI!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hi!" + "'", str16, "Hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhi!ihi!!" + "'", str18, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str19, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hhi!hhi!ihi!hhi!!" + "'", str20, "hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hhhhhih!hhhhih!" + "'", str21, "Hhhhhih!hhhhih!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!" + "'", str22, "HHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalize("hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!" + "'", str2, "HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!");
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHHHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!IHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!!HHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!IHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!!HHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!IHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!IHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!!HHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!IHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!!HHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!" + "'", str1, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!");
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhi!ihi!!", (int) (short) 100, 0, "HhHI!HHI!IhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 100, length 9");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
        char[] charArray8 = new char[] { '4', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("h", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("h", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("HHIH!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hI!" + "'", str10, "hI!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhih!" + "'", str13, "Hhih!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi" + "'", str14, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi");
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
        char[] charArray13 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("HI!", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("hHI!IHI!!", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("hhHI!IHI!!hhHI!IHI!!ihHI!IHI!!hhHI!IHI!!!", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhhi!hhi!hHHHHIH!HHHHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHIH!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!", charArray13);
        java.lang.Class<?> wildcardClass21 = charArray13.getClass();
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "h" + "'", str16, "h");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HhHI!IHI!!hhHI!IHI!!ihHI!IHI!!hhHI!IHI!!!" + "'", str18, "HhHI!IHI!!hhHI!IHI!!ihHI!IHI!!hhHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhhhi!hhi!hhhhhih!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!hhih!" + "'", str19, "Hhhhi!hhi!hhhhhih!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!hhih!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str20, "Hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        char[] charArray18 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray18);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray18);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray18);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray18);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("h", charArray18);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray18);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.initials("hhI!HhI!IhI!HhI!!", charArray18);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!HhI!IhI!HhI!!", charArray18);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.initials("hI!", charArray18);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.initials("", charArray18);
        java.lang.String str29 = org.apache.commons.lang.WordUtils.initials("hHI!IHI!!", charArray18);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.uncapitalize("HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHH", charArray18);
        java.lang.Class<?> wildcardClass31 = charArray18.getClass();
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H" + "'", str23, "H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H" + "'", str24, "H");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "h" + "'", str25, "h");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str26, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "h" + "'", str27, "h");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "h" + "'", str29, "h");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHH" + "'", str30, "hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHH");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
        char[] charArray8 = new char[] { '4', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!HhI!IhI!HhI!!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("HhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIH!IhHIH!!hHIH!!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("HHIH!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("hhhih!hhhihHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhHhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str10, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HI!" + "'", str11, "HI!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhih!" + "'", str13, "Hhih!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "h" + "'", str14, "h");
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!" + "'", str1, "Hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!", 10, "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHhHHHIH!HHHHHIH!HIHhhHHHIH!HHhhih!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhi!hhi!ihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHhHHHIH!HHHHHIH!HIHhhHHHIH!HHhhih!hhhi!hhi!ihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHhHHHIH!HHHHHIH!HIHhhHHHIH!HHhhih!hi!hhi!!hhhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHhHHHIH!HHHHHIH!HIHhhHHHIH!HHhhih!hi!hhi!ihihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHhHHHIH!HHHHHIH!HIHhhHHHIH!HHhhih!!hhi!" + "'", str4, "Hhhi!hhi!ihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHhHHHIH!HHHHHIH!HIHhhHHHIH!HHhhih!hhhi!hhi!ihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHhHHHIH!HHHHHIH!HIHhhHHHIH!HHhhih!hi!hhi!!hhhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHhHHHIH!HHHHHIH!HIHhhHHHIH!HHhhih!hi!hhi!ihihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHhHHHIH!HHHHHIH!HIHhhHHHIH!HHhhih!!hhi!");
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
        char[] charArray13 = new char[] { '4', '4' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!IHI!!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!", charArray13);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("hHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!", charArray13);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", charArray13);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.initials("hHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!", charArray13);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalize("HHI!HHI!IH", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hI!" + "'", str16, "hI!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hi!" + "'", str17, "Hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhi!ihi!!" + "'", str19, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str20, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!" + "'", str21, "HHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str22, "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "h" + "'", str23, "h");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HHI!HHI!IH" + "'", str24, "HHI!HHI!IH");
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        char[] charArray19 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray19);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray19);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray19);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray19);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalize("h", charArray19);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray19);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalize("Hhi!ihi!!", charArray19);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray19);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.initials("hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", charArray19);
        java.lang.String str29 = org.apache.commons.lang.WordUtils.capitalize("hhHIH!HhHIH!hhHIH!hhHIH!hhHIH!ihHIH!hhHIH!!hHIH!hhHIH!hhHIH!HhHIH!HhHIH!IhHIH!HhHIH!!", charArray19);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.initials("Hhhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!", charArray19);
        java.lang.String str31 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!", charArray19);
        java.lang.String str32 = org.apache.commons.lang.WordUtils.initials("hHhhhih!hhhhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHIhhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhiHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!h!hhhih!hhhih!hhhih!ihhih!hhhih!!!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHhhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhiHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!h!hhhih!hhhih!hhhih!ihhih!hhhih!!I!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!I!HhI!!", charArray19);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H" + "'", str24, "H");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Hhih!" + "'", str25, "Hhih!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Hhi!ihi!!" + "'", str26, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Hi!" + "'", str27, "Hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "h" + "'", str28, "h");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "HhHIH!HhHIH!hhHIH!hhHIH!hhHIH!ihHIH!hhHIH!!hHIH!hhHIH!hhHIH!HhHIH!HhHIH!IhHIH!HhHIH!!" + "'", str29, "HhHIH!HhHIH!hhHIH!hhHIH!hhHIH!ihHIH!hhHIH!!hHIH!hhHIH!hhHIH!HhHIH!HhHIH!IhHIH!HhHIH!!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "H" + "'", str30, "H");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hhhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str31, "hhhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "h" + "'", str32, "h");
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
        char[] charArray7 = new char[] { '4', '4' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hi!" + "'", str8, "Hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hI!" + "'", str10, "hI!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!" + "'", str12, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!");
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
        char[] charArray9 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IhHHI!HHI!Ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!HI!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IhHHI!HHI!Ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!HI!" + "'", str11, "HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IhHHI!HHI!Ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!HI!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str12, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
        char[] charArray10 = new char[] { '4', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("h", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("HHIH!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hhi!!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("Hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hI!" + "'", str12, "hI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hhi!!" + "'", str16, "Hhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str17, "Hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("", (int) (short) 100, "hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        char[] charArray10 = new char[] { '4', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!HhHIH!HhHIH!hhHIH!hhHIH!hhHIH!ihHIH!hhHIH!!hHIH!hhHIH!hhHIH!HhHIH!HhHIH!IhHIH!HhHIH!!", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!ihi!!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hI!" + "'", str13, "hI!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!HhHIH!HhHIH!hhHIH!hhHIH!hhHIH!ihHIH!hhHIH!!hHIH!hhHIH!hhHIH!HhHIH!HhHIH!IhHIH!HhHIH!!" + "'", str17, "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!HhHIH!HhHIH!hhHIH!hhHIH!hhHIH!ihHIH!hhHIH!!hHIH!hhHIH!hhHIH!HhHIH!HhHIH!IhHIH!HhHIH!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!ihi!!!" + "'", str18, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!ihi!!!");
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHHIH!HHHhHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!", (int) '4', (int) (byte) 10, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHHIH!HHHhHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!" + "'", str4, "hHHHIH!HHHhHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!");
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.initials("hhHIH!HhHIhHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h" + "'", str2, "h");
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!", 100, (int) ' ', "hhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str4, "hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
        char[] charArray11 = new char[] { '4', '4' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("h", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("HHIH!", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hhi!!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("Hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("HHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!", charArray11);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hI!" + "'", str13, "hI!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "h" + "'", str14, "h");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hhi!!" + "'", str17, "Hhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str18, "Hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!" + "'", str19, "HHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str20, "hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhhhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHIHhhih!hhhihhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihihhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str1, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihihhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        char[] charArray8 = new char[] { '4', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("h", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHHHHHIH!HHHHHIH!HIHHHHHHIH!HHHHIH!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hI!" + "'", str10, "hI!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "h" + "'", str12, "h");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I" + "'", str13, "HHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhhhih!hhhhhih!hihhhhhhih!hhhhih!" + "'", str14, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhhhih!hhhhhih!hihhhhhhih!hhhhih!");
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
        char[] charArray13 = new char[] { '4', '4' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("h", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", charArray13);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHhih!hHhih!HHhih!HHhih!HHhih!IHhih!HHhih!!Hhih!HHhih!HHhih!hHhih!hHhih!iHhih!hHhih!!", charArray13);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!ihi!!!", charArray13);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!", charArray13);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.initials("hhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!hHhih!hHhih!iHhih!!Hhih!iHhih!hHhihhhhi!hhi!iHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hI!" + "'", str15, "hI!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "h" + "'", str16, "h");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "h" + "'", str17, "h");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!" + "'", str20, "hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hhhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!" + "'", str21, "Hhhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!ihi!!!" + "'", str22, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!ihi!!!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str23, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "h" + "'", str24, "h");
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhih!hhhihhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHIH!HHHIHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str1, "hHHIH!HHHIHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
        char[] charArray14 = new char[] { '4', '4' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!IHI!!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihi!hhi!!", charArray14);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhhhih!hhHHIH!", charArray14);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalize("hHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!", charArray14);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalize("hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!!", charArray14);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHIH!HHHhHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hI!" + "'", str17, "hI!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hi!" + "'", str18, "Hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhi!ihi!!" + "'", str20, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str21, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hhi!hhi!ihi!hhi!!" + "'", str22, "hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hhhhhih!hhhhih!" + "'", str23, "Hhhhhih!hhhhih!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!" + "'", str24, "HHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!!" + "'", str25, "HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hHHHIH!HHHhHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!" + "'", str26, "hHHHIH!HHHhHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!");
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhih!hhhiHhi!hhi!ihi!hhi!!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhih!hhhiHhi!hhi!ihi!hhi!!" + "'", str2, "hhhih!hhhiHhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
        char[] charArray7 = new char[] { '4', '4' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hi!" + "'", str8, "Hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "h" + "'", str10, "h");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHhhhih!hhhhhih!hihhhih!hhhhhih!HhHI!IHI!!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHhhhih!hhhhhih!hihhhih!hhhhhih!HhHI!IHI!!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str1, "HHhhhih!hhhhhih!hihhhih!hhhhhih!HhHI!IHI!!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhh", (int) (short) 1, (-1), "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!ihi!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhh" + "'", str4, "Hhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhh");
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
        char[] charArray12 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("HI!", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhih!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHHIH!HHhhih!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("HhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHHhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhih!" + "'", str16, "Hhih!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhi!hhi!ihHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHHIH!HHhhih!" + "'", str17, "Hhi!hhi!ihHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHHIH!HHhhih!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHHhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str18, "HhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHHhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhHI!HHI!Ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhHHIH!", (int) '4', "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!ihi!!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhHI!HHI!Ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhHHIH!" + "'", str4, "hhHI!HHI!Ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhHHIH!");
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str1, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
        char[] charArray17 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray17);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("HI!", charArray17);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihi!hhi!!", charArray17);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray17);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("hHI!IHI!!", charArray17);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.initials("HHIH!", charArray17);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.initials("hHI!HHI!IHI!HHI!!", charArray17);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.initials("HhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", charArray17);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalize("Hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!", charArray17);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.initials("Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i", charArray17);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.capitalize("hHi!hHi!iHi!hHi!!", charArray17);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H" + "'", str21, "H");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HHI!IHI!!" + "'", str22, "HHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H" + "'", str23, "H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "h" + "'", str24, "h");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "H" + "'", str25, "H");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!" + "'", str26, "Hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "H" + "'", str27, "H");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "HHi!hHi!iHi!hHi!!" + "'", str28, "HHi!hHi!iHi!hHi!!");
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!HHHIH!HHHIH!iHHIHhHi!hHi!iH", 1, (int) (byte) -1, "HHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!HHHIH!HHHIH!iHHIHhHi!hHi!iH" + "'", str4, "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!HHHIH!HHHIH!iHHIHhHi!hHi!iH");
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!h!ihhih!!hhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hih!ihhih!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhhih!ihhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!h!!hhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!h!ihhih!!hhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hih!ihhih!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhhih!ihhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!h!!hhih!!" + "'", str1, "Hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!h!ihhih!!hhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hih!ihhih!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhhih!ihhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!h!!hhih!!");
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HhHhhhih!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHhHHHIH!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!" + "'", str1, "hHhHHHIH!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!");
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
        char[] charArray13 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("HI!", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("hhHHHIH!HHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHHIH!HIHHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HIH!HHHHHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!H!H!hhHHHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!H!HHHHHIH!hHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HIHHHIH!HHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHHIH!H!ihhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHHIH!HHHHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HIH!HIHHHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!H!HHHHHHhHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!I!IHI!!hhHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!I!IHI!!ihHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!I!IHI!!hhHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!I!IHI!!!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHHIH!HHHhHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hi!" + "'", str16, "Hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str17, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str18, "hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HhHHHIH!HHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHHIH!HIHHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HIH!HHHHHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!H!H!hhHHHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!H!HHHHHIH!hHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HIHHHIH!HHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHHIH!H!ihhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHHIH!HHHHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HIH!HIHHHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!H!HHHHHHhHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!I!IHI!!hhHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!I!IHI!!ihHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!I!IHI!!hhHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!I!IHI!!!" + "'", str19, "HhHHHIH!HHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHHIH!HIHHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HIH!HHHHHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!H!H!hhHHHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!H!HHHHHIH!hHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HIHHHIH!HHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHHIH!H!ihhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHHIH!HHHHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HIH!HIHHHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!H!HHHHHHhHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!I!IHI!!hhHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!I!IHI!!ihHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!I!IHI!!hhHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!I!IHI!!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhhih!hhhhhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!" + "'", str20, "Hhhhih!hhhhhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHHIH!HHhhih!", (int) '#', 0, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhi!hhi!ihi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhi!hhi!ihi!" + "'", str4, "hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhi!hhi!ihi!");
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
        char[] charArray14 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("h", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhhhih!hhhhhih!hihhhhhhih!hhhhih!", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HI!" + "'", str20, "HI!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I" + "'", str21, "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhhhih!hhhhhih!hihhhhhhih!hhhhih!" + "'", str22, "hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhhhih!hhhhhih!hihhhhhhih!hhhhih!");
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!", (int) (short) -1, (int) (short) -1, "hHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str4, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str1, "hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhhhhih!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
        char[] charArray11 = new char[] { '4', '4' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!IHI!!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhih!hhhihhih!hhhi!hhi!ihhih!hi!hhi!!hhhhih!hi!hhi!ihihhih!!hhi!!ihhihhih!!hhi!ihi!hhhih!hi!!!hhi!hhhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hI!" + "'", str14, "hI!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhi!ihi!!" + "'", str17, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str18, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhih!hhhihhih!hhhi!hhi!ihhih!hi!hhi!!hhhhih!hi!hhi!ihihhih!!hhi!!ihhihhih!!hhi!ihi!hhhih!hi!!!hhi!hhhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!" + "'", str20, "Hhhih!hhhihhih!hhhi!hhi!ihhih!hi!hhi!!hhhhih!hi!hhi!ihihhih!!hhi!!ihhihhih!!hhi!ihi!hhhih!hi!!!hhi!hhhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!");
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihhhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str1, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
        char[] charArray7 = new char[] { '4', '4' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!HhI!IhI!HhI!!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("HhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIH!IhHIH!!hHIH!!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhi!hhi!ihi!hhi!!i!i", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hi!" + "'", str8, "Hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str9, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HI!" + "'", str10, "HI!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhi!hhi!ihi!hhi!!i!i" + "'", str12, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhi!hhi!ihi!hhi!!i!i");
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhHHHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str2, "Hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHHIH!HHHIhHI!HHI!IHI!HHI!!", (-1), "hHIH!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhHIH!HhHIH!HhHIH!IhHIH!HhHIH!!hHIH!HhHIH!HhHIH!HhHIH!IhHIH!hhHIH!HhHIH!IhHIH!!hHIH!HhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIH!IhHIH!!hHIH!HhHIH!HhHIH!IhHIH!!hHIH!!" + "'", str4, "HhHIH!HhHIH!HhHIH!IhHIH!HhHIH!!hHIH!HhHIH!HhHIH!HhHIH!IhHIH!hhHIH!HhHIH!IhHIH!!hHIH!HhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIH!IhHIH!!hHIH!HhHIH!HhHIH!IhHIH!!hHIH!!");
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhihhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHIHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHHHIH!HHHHIH!" + "'", str1, "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHIHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHHHIH!HHHHIH!");
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
        char[] charArray8 = new char[] { '4', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("HHHIH!HHHIHhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("HHhhi!hhi!hHHHHIH!HHHHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHIH!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hI!" + "'", str11, "hI!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HHhhi!hhi!hHHHHIH!HHHHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHIH!" + "'", str14, "HHhhi!hhi!hHHHHIH!HHHHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHIH!");
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
        char[] charArray13 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("HhI!HhI!IhI!HhI!!", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("hhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("hhhih!hhhihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hi!" + "'", str17, "Hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhI!HhI!IhI!HhI!!" + "'", str18, "hhI!HhI!IhI!HhI!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i" + "'", str19, "hhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "h" + "'", str20, "h");
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
        char[] charArray10 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihh", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihh" + "'", str14, "Hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihh");
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
        char[] charArray4 = new char[] { '4' };
        java.lang.String str5 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhh", charArray4);
        java.lang.String str6 = org.apache.commons.lang.WordUtils.initials("HHHIH!HHHIHhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHIHhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!HHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!", charArray4);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!hhi!hhhhhih!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!hhih!", charArray4);
        java.lang.Class<?> wildcardClass8 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4' });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhh" + "'", str5, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhh");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Hhhhi!hhi!hhhhhih!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!hhih!" + "'", str7, "Hhhhi!hhi!hhhhhih!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!hhih!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!ihi!!!" + "'", str1, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!ihi!!!");
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
        char[] charArray12 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("HI!", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihi!hhi!!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhh", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str17, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhh" + "'", str18, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhh");
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i" + "'", str2, "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i");
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhHhhhih!hhhhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHIhhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhiHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!h!hhhih!hhhih!hhhih!ihhih!hhhih!!!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHhhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhiHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!h!hhhih!hhhih!hhhih!ihhih!hhhih!!I!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!I!HhI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhHhhhih!hhhhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHIhhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhiHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!h!hhhih!hhhih!hhhih!ihhih!hhhih!!!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHhhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhiHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!h!hhhih!hhhih!hhhih!ihhih!hhhih!!I!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!I!HhI!!" + "'", str1, "hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhHhhhih!hhhhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHIhhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhiHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!h!hhhih!hhhih!hhhih!ihhih!hhhih!!!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHhhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhiHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!h!hhhih!hhhih!hhhih!ihhih!hhhih!!I!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!I!HhI!!");
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
        char[] charArray11 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("HI!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("hhI!HhI!Ih", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str15, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "h" + "'", str16, "h");
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
        char[] charArray11 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("HI!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhih!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", charArray11);
        java.lang.Class<?> wildcardClass17 = charArray11.getClass();
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhih!" + "'", str15, "Hhih!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str16, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHIHhhi!hhi!ihi!hhi!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHIHhhi!hhi!ihi!hhi!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!" + "'", str2, "hhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHIHhhi!hhi!ihi!hhi!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!");
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!i!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!i!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str1, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!i!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!I!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!", (int) '4', 10, "HhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHIHhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I" + "'", str4, "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHIHhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I");
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!IHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!ihi!!!" + "'", str1, "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!ihi!!!");
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhh", (int) ' ', "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHhHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihhhih!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHhHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHhHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihhhih!h!h!ihhhhih!hhhhhih!hihhhih!hhhhhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHhHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihhhih!h" + "'", str4, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHhHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHhHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihhhih!h!h!ihhhhih!hhhhhih!hihhhih!hhhhhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHhHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihhhih!h");
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!" + "'", str1, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!");
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHhhih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhHHIH!" + "'", str1, "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhHHIH!");
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhHH" + "'", str1, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhHH");
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIH!IhHIH!!hHIH!!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIH!IhHIH!!hHIH!!" + "'", str2, "HHhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIH!IhHIH!!hHIH!!");
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
        char[] charArray15 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("HI!", charArray15);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihi!hhi!!", charArray15);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray15);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("hHI!IHI!!", charArray15);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("HHIH!", charArray15);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("hHI!HHI!IHI!HHI!!", charArray15);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!", charArray15);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.initials("hHhhhih!hhhhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!I!HhI!!", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HHI!IHI!!" + "'", str20, "HHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H" + "'", str21, "H");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "h" + "'", str22, "h");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!" + "'", str23, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "h" + "'", str24, "h");
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
        char[] charArray13 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("hHI!HHI!IHI!HHI!!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("hhhi!hhi!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!", charArray13);
        java.lang.Class<?> wildcardClass21 = charArray13.getClass();
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HHI!HHI!IHI!HHI!!" + "'", str17, "HHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "h" + "'", str18, "h");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "h" + "'", str20, "h");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
        char[] charArray16 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray16);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("h", charArray16);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray16);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray16);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.initials("Hhi!ihi!!", charArray16);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalize("hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!HHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!IHI!!!", charArray16);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHI!IHI!!hhHI!IHI!!ihHI!IHI!!hhHI!IHI!!!", charArray16);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H" + "'", str21, "H");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhih!" + "'", str22, "Hhih!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H" + "'", str23, "H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H" + "'", str24, "H");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!HHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!IHI!!!" + "'", str25, "HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!HHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!IHI!!!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str26, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhHI!HHI!IhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhHI!HHI!IhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!" + "'", str2, "hhHI!HHI!IhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!");
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!ihi!!!" + "'", str1, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!ihi!!!");
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!HHHIH!HHHIH!HHHIH!HHHIH!HHHIH!IHHIH!HHHIH!!HHIH!HHHIH!HHHIH!HHHIH!HHHIH!IHHIH!HHHIH!!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!HHHIH!HHHIH!HHHIH!HHHIH!HHHIH!IHHIH!HHHIH!!HHIH!HHHIH!HHHIH!HHHIH!HHHIH!IHHIH!HHHIH!!" + "'", str2, "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!HHHIH!HHHIH!HHHIH!HHHIH!HHHIH!IHHIH!HHHIH!!HHIH!HHHIH!HHHIH!HHHIH!HHHIH!IHHIH!HHHIH!!");
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!IHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!IHI!!!" + "'", str1, "HhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!IHI!!!");
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
        char[] charArray16 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray16);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("h", charArray16);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray16);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.initials("hhI!HhI!IhI!HhI!!", charArray16);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!HhI!IhI!HhI!!", charArray16);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!HHI!IHI!HHI!!", charArray16);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.initials("HhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i", charArray16);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H" + "'", str21, "H");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "h" + "'", str23, "h");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str24, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hHI!HHI!IHI!HHI!!" + "'", str25, "hHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H" + "'", str26, "H");
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
        char[] charArray19 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray19);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray19);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray19);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray19);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalize("h", charArray19);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray19);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.initials("hhI!HhI!IhI!HhI!!", charArray19);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!HhI!IhI!HhI!!", charArray19);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.initials("hI!", charArray19);
        java.lang.String str29 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!", charArray19);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", charArray19);
        java.lang.String str31 = org.apache.commons.lang.WordUtils.capitalize("hHhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIH!IhHIH!!hHIH!!", charArray19);
        java.lang.String str32 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhih!hhhihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i", charArray19);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H" + "'", str24, "H");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "H" + "'", str25, "H");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "h" + "'", str26, "h");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str27, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "h" + "'", str28, "h");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str29, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str30, "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "HHhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIH!IhHIH!!hHIH!!" + "'", str31, "HHhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIH!IhHIH!!hHIH!!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Hhhih!hhhihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i" + "'", str32, "Hhhih!hhhihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i");
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
        char[] charArray13 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("HI!", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhih!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("HhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIH!IhHIH!!hHIH!!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!ihi!!!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hi!" + "'", str16, "Hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhih!" + "'", str17, "Hhih!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!ihi!!!" + "'", str20, "Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!ihi!!!");
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!IHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!", (int) (short) 1, "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!" + "'", str4, "hHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!");
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHHhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!", (int) 'a', "hHHIH!HHHIHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHHI!HHI!IHhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!HHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!IHI!!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHhHHIH!HHHIHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHHI!HHI!IHhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!HHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!IHI!!!Hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str4, "HhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHhHHIH!HHHIHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHHI!HHI!IHhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!HHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!IHI!!!Hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
        char[] charArray14 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("hHIH!", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("hI!", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "h" + "'", str18, "h");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str19, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str20, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!" + "'", str21, "hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hI!" + "'", str22, "hI!");
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
        char[] charArray21 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray21);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray21);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray21);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray21);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalize("h", charArray21);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray21);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray21);
        java.lang.String str29 = org.apache.commons.lang.WordUtils.initials("Hhih!", charArray21);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray21);
        java.lang.String str31 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i", charArray21);
        java.lang.String str32 = org.apache.commons.lang.WordUtils.uncapitalize("hI!", charArray21);
        java.lang.String str33 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!", charArray21);
        java.lang.String str34 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!", charArray21);
        java.lang.String str35 = org.apache.commons.lang.WordUtils.initials("Hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!h!hhhih!hhhih!hhhih!ihhih!hhhih!!", charArray21);
        java.lang.String str36 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!", charArray21);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertArrayEquals(charArray21, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H" + "'", str26, "H");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Hhih!" + "'", str27, "Hhih!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Hi!" + "'", str28, "Hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "H" + "'", str29, "H");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "HI!" + "'", str30, "HI!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i" + "'", str31, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hI!" + "'", str32, "hI!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str33, "Hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!" + "'", str34, "hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "H" + "'", str35, "H");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str36, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHHhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!", (int) (short) 1, "HHHhih!hHhih!HHhih!HHhih!HHhih!IHhih!HHhih!!Hhih!HHhih!HHhih!hHhih!hHhih!iHhih!hHhih!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHHhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str4, "hhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHHhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I" + "'", str2, "hHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I");
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HhHHHIH!HHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHHIH!HIHHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HIH!HHHHHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!H!H!hhHHHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!H!HHHHHIH!hHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HIHHHIH!HHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHHIH!H!ihhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHHIH!HHHHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HIH!HIHHHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!H!HHHHHHhHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!I!IHI!!hhHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!I!IHI!!ihHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!I!IHI!!hhHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!I!IHI!!!", (-1), (-1), "hHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhHHHIH!HHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHHIH!HIHHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HIH!HHHHHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!H!H!hhHHHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!H!HHHHHIH!hHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HIHHHIH!HHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHHIH!H!ihhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHHIH!HHHHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HIH!HIHHHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!H!HHHHHHhHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!I!IHI!!hhHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!I!IHI!!ihHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!I!IHI!!hhHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!I!IHI!!!" + "'", str4, "HhHHHIH!HHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHHIH!HIHHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HIH!HHHHHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!H!H!hhHHHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!H!HHHHHIH!hHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HIHHHIH!HHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHHIH!H!ihhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHHIH!HHHHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HIH!HIHHHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!H!HHHHHHhHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!I!IHI!!hhHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!I!IHI!!ihHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!I!IHI!!hhHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!I!IHI!!!");
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
        char[] charArray19 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray19);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray19);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray19);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray19);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalize("h", charArray19);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray19);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.initials("hhI!HhI!IhI!HhI!!", charArray19);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!HhI!IhI!HhI!!", charArray19);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.initials("hI!", charArray19);
        java.lang.String str29 = org.apache.commons.lang.WordUtils.initials("", charArray19);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.initials("hHI!IHI!!", charArray19);
        java.lang.String str31 = org.apache.commons.lang.WordUtils.uncapitalize("HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHH", charArray19);
        java.lang.String str32 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!", charArray19);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H" + "'", str24, "H");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "H" + "'", str25, "H");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "h" + "'", str26, "h");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str27, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "h" + "'", str28, "h");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "h" + "'", str30, "h");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHH" + "'", str31, "hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHH");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!" + "'", str32, "hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!");
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2901");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHHI!IHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHI!IHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!" + "'", str1, "HHHI!IHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!");
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhHhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhHHHHIH!HHHHIH!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhHhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhHHHHIH!HHHHIH!" + "'", str2, "HHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhHhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhHHHHIH!HHHHIH!");
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2903");
        char[] charArray9 = new char[] { '#', '4', '4', '4', '4', '#' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihi!hhi!!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("HHHIH!HHHIHhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', '4', '4', '4', '4', '#' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str10, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
        char[] charArray15 = new char[] { '4', '4' };
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray15);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray15);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray15);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray15);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray15);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!IHI!!", charArray15);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!", charArray15);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihi!hhi!!", charArray15);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhhhih!hhHHIH!", charArray15);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.initials("hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!", charArray15);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.uncapitalize("hhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!IHI!!!", charArray15);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhih!", charArray15);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.initials("hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHHHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hi!" + "'", str16, "Hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hI!" + "'", str18, "hI!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hi!" + "'", str19, "Hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hhi!ihi!!" + "'", str21, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str22, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hhi!hhi!ihi!hhi!!" + "'", str23, "hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hhhhhih!hhhhih!" + "'", str24, "Hhhhhih!hhhhih!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "h" + "'", str25, "h");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!IHI!!!" + "'", str26, "hhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!IHI!!!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Hhih!" + "'", str27, "Hhih!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "h" + "'", str28, "h");
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
        char[] charArray18 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray18);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray18);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray18);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray18);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("h", charArray18);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray18);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray18);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray18);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!HhI!IhI!HhI!!", charArray18);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.uncapitalize("hI!", charArray18);
        java.lang.String str29 = org.apache.commons.lang.WordUtils.capitalize("hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!", charArray18);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihhhi!ihi!!", charArray18);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H" + "'", str23, "H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hhih!" + "'", str24, "Hhih!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str27, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hI!" + "'", str28, "hI!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!" + "'", str29, "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Hhi!hhi!ihhhi!ihi!!" + "'", str30, "Hhi!hhi!ihhhi!ihi!!");
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!", (int) (short) 0, (int) (byte) 0, "hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhHhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhHhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str4, "hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhHhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str1, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
        char[] charArray9 = new char[] { '4', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!HhI!IhI!HhI!!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("HhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIH!IhHIH!!hHIH!!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("Hhhhhih!hhhhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHHIH!HHhhih!hhih!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("hhHhhhih!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!I!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!I!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!I!HHI!IHI!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str11, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HI!" + "'", str12, "HI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str14, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhhhhih!hhhhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHHIH!HHhhih!hhih!" + "'", str15, "Hhhhhih!hhhhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHHIH!HHhhih!hhih!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhHhhhih!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!I!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!I!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!I!HHI!IHI!" + "'", str16, "hhHhhhih!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!I!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!I!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!I!HHI!IHI!");
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIHHHHI!HHI!IHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str1, "Hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
        char[] charArray16 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray16);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("h", charArray16);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray16);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray16);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.initials("hI!", charArray16);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.initials("HhHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!", charArray16);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalize("HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!hHhih!hHhih!HHhih!HHhih!HHhih!IHhih!HHhih!!Hhih!HHhih!HHhih!hHhih!hHhih!iHhih!hHhih!!", charArray16);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H" + "'", str21, "H");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhih!" + "'", str22, "Hhih!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H" + "'", str23, "H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "h" + "'", str24, "h");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "H" + "'", str25, "H");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!hHhih!hHhih!HHhih!HHhih!HHhih!IHhih!HHhih!!Hhih!HHhih!HHhih!hHhih!hHhih!iHhih!hHhih!!" + "'", str26, "HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!hHhih!hHhih!HHhih!HHhih!HHhih!IHhih!HHhih!!Hhih!HHhih!HHhih!hHhih!hHhih!iHhih!hHhih!!");
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhhi!hhi!iHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHIHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhih!hhhHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHIHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhih!hihhhHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHIHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!ih!hhhhhihHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHIHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!!h!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhi!iHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHIHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhih!hhhHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHIHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhih!hihhhHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHIHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!ih!hhhhhihHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHIHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!!h!" + "'", str1, "Hhhi!hhi!iHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHIHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhih!hhhHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHIHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhih!hihhhHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHIHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!ih!hhhhhihHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHIHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!!h!");
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2912");
        char[] charArray11 = new char[] { '4', '4' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", charArray11);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.Class<?> wildcardClass21 = charArray11.getClass();
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hI!" + "'", str14, "hI!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!" + "'", str18, "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str19, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!I!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!I!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!I!HHI!IHI!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!I!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!I!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!I!HHI!IHI!" + "'", str2, "hHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!I!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!I!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!I!HHI!IHI!");
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2914");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!I!HhI!!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!I!HhI!!" + "'", str2, "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!I!HhI!!");
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
        char[] charArray12 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("hHI!HHI!IHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihh", charArray12);
        java.lang.Class<?> wildcardClass19 = charArray12.getClass();
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hi!" + "'", str16, "Hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "h" + "'", str17, "h");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihh" + "'", str18, "hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihh");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2916");
        char[] charArray15 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray15);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("h", charArray15);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray15);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!", charArray15);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.initials("HHhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIH!IhHIH!!hHIH!!", charArray15);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalize("hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!", charArray15);
        java.lang.Class<?> wildcardClass25 = charArray15.getClass();
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hhih!" + "'", str21, "Hhih!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str22, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H" + "'", str23, "H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!" + "'", str24, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHHHIH!HHHHIH!", (int) (short) 0, (int) '#', "H");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHHHIH!HHHHIH!" + "'", str4, "hHHHHIH!HHHHIH!");
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2918");
        char[] charArray10 = new char[] { '4', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!HhI!IhI!HhI!!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("HhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIH!IhHIH!!hHIH!!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("HHIH!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("Hhih!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhhhih!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("hhHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str12, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HI!" + "'", str13, "HI!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhih!" + "'", str15, "Hhih!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hhhhhhih!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!" + "'", str17, "hhhhhhih!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!" + "'", str18, "Hhhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2919");
        char[] charArray19 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray19);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray19);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray19);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray19);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalize("h", charArray19);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray19);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray19);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.initials("hI!", charArray19);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihi!hhi!!", charArray19);
        java.lang.String str29 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray19);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.uncapitalize("HhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i", charArray19);
        java.lang.String str31 = org.apache.commons.lang.WordUtils.capitalize("Hhhhi!hhi!hhhhhih!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!hhih!", charArray19);
        java.lang.String str32 = org.apache.commons.lang.WordUtils.capitalize("HHHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!", charArray19);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H" + "'", str24, "H");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Hhih!" + "'", str25, "Hhih!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Hi!" + "'", str26, "Hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "h" + "'", str27, "h");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str28, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "h" + "'", str29, "h");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i" + "'", str30, "hhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Hhhhi!hhi!hhhhhih!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!hhih!" + "'", str31, "Hhhhi!hhi!hhhhhih!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!hhih!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "HHHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!" + "'", str32, "HHHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!");
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhi!hhi!iHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhHHIH!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhi!hhi!iHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhHHIH!" + "'", str2, "hhhi!hhi!iHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhHHIH!");
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhhih!hhhhhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!", 10, 0, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhhhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHIHhhih!hhhihhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhih!hhhHhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhhhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHIHhhih!hhhihhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!" + "'", str4, "Hhhhih!hhhHhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhhhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHIHhhih!hhhihhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!");
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2922");
        char[] charArray10 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("HI!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHH", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhHHHHIH!HHHHIH!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhh" + "'", str13, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhh");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhHHHHIH!HHHHIH!" + "'", str14, "hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhHHHHIH!HHHHIH!");
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2923");
        char[] charArray14 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("HhI!HhI!IhI!HhI!!", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!HhI!IhI!HhI!!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hi!" + "'", str18, "Hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hhI!HhI!IhI!HhI!!" + "'", str19, "hhI!HhI!IhI!HhI!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str20, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i" + "'", str21, "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2924");
        char[] charArray11 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("HI!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("HHIH!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!ihi!!!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhih!" + "'", str15, "Hhih!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!ihi!!!" + "'", str16, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!ihi!!!");
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2925");
        char[] charArray10 = new char[] { '4', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!HhI!IhI!HhI!!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHIH!HhHIH!HhHIH!IhHIH!HhHIH!!hHIH!HhHIH!HhHIH!HhHIH!IhHIH!hhHIH!HhHIH!IhHIH!!hHIH!HhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIH!IhHIH!!hHIH!HhHIH!HhHIH!IhHIH!!hHIH!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str12, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "h" + "'", str14, "h");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!" + "'", str15, "HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!" + "'", str17, "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!ihhih!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str18, "Hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!ihhih!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2926");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhhih!hhhhHHHIH!HHHHHIH!HIHHHIhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!H!HHHHHIH!HhHHHIH!HHhhih!hhih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhih!hhhhhhhih!hhhhhih!hihhhihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!h!hhhhhih!hhhhhih!hhhhih!hhih!" + "'", str1, "Hhhhhih!hhhhhhhih!hhhhhih!hihhhihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!h!hhhhhih!hhhhhih!hhhhih!hhih!");
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2927");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!" + "'", str1, "Hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!");
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2928");
        char[] charArray17 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray17);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray17);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray17);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray17);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("h", charArray17);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray17);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!", charArray17);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.uncapitalize("HHI!HHI!IHI!HHI!!", charArray17);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalize("HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!", charArray17);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.capitalize("hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!", charArray17);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.initials("hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!", charArray17);
        java.lang.Class<?> wildcardClass29 = charArray17.getClass();
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H" + "'", str23, "H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str24, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hHI!HHI!IHI!HHI!!" + "'", str25, "hHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!" + "'", str26, "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!" + "'", str27, "HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "h" + "'", str28, "h");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2929");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!", (int) ' ', (int) (byte) 1, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhhih!hhhih!ihhih!!hhih!ihhih!" + "'", str4, "Hhhhhih!hhhih!ihhih!!hhih!ihhih!");
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
        char[] charArray16 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray16);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("h", charArray16);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray16);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray16);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.initials("Hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!", charArray16);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalize("HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhi!hhi!ihi!hhi!!", charArray16);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H" + "'", str21, "H");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhih!" + "'", str22, "Hhih!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "H" + "'", str25, "H");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhi!hhi!ihi!hhi!!" + "'", str26, "HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2931");
        char[] charArray9 = new char[] { '4', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("HhI!HhI!IhI!HhI!!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihi!!HHhi!hhi!iHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!" + "'", str14, "HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhhi!ihi!!HHhi!hhi!iHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!" + "'", str16, "hhhi!ihi!!HHhi!hhi!iHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!");
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2932");
        char[] charArray9 = new char[] { '4', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!HhI!IhI!HhI!!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("HhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIH!IhHIH!!hHIH!!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("HHIH!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("Hhih!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str11, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HI!" + "'", str12, "HI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhih!" + "'", str14, "Hhih!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2933");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHI!IHI!!hhHI!IHI!!ihHI!IHI!!hhHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str1, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhhhhih!hhhhHHHIH!HHHHHIH!HIHHHIhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!H!HHHHHIH!HhHHHIH!HHhhih!hhih!", (int) (byte) 0, "hHhhhih!hhhHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!ihi!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhhhih!hhhhHHHIH!HHHHHIH!HIHHHIhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!H!HHHHHIH!HhHHHIH!HHhhih!hhih!" + "'", str4, "hhhhhih!hhhhHHHIH!HHHHHIH!HIHHHIhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!H!HHHHHIH!HhHHHIH!HHhhih!hhih!");
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2935");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhHI!IHI!!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!", (int) (byte) 1, (int) (short) 0, "HhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!hhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihI!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!hhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihI!" + "'", str4, "hHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!hhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihI!");
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2936");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhhih!hhhhih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhhih!hhhhih!" + "'", str1, "Hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhhih!hhhhih!");
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2937");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", (int) (short) 10, "HHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!iiHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!iiHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!iiHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str4, "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i" + "'", str1, "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i");
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
        char[] charArray16 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("HI!", charArray16);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihi!hhi!!", charArray16);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray16);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("hHI!IHI!!", charArray16);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("HHIH!", charArray16);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.initials("hHI!HHI!IHI!HHI!!", charArray16);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalize("hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!", charArray16);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHhih!hHhih!HHhih!HHhih!HHhih!IHhih!HHhih!!Hhih!HHhih!HHhih!hHhih!hHhih!iHhih!hHhih!!", charArray16);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHIH!HHHhHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!", charArray16);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HHI!IHI!!" + "'", str21, "HHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "h" + "'", str23, "h");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!" + "'", str24, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Hhhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!" + "'", str25, "Hhhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hHHHIH!HHHhHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!" + "'", str26, "hHHHIH!HHHhHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!");
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2940");
        char[] charArray7 = new char[] { '4', '4' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("HHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!", charArray7);
        java.lang.Class<?> wildcardClass13 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hi!" + "'", str8, "Hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "h" + "'", str10, "h");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!" + "'", str12, "HHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2941");
        char[] charArray12 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("hHI!HHI!IHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str17, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HHI!HHI!IHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!" + "'", str18, "HHI!HHI!IHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!");
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2942");
        char[] charArray10 = new char[] { '4', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!HhI!IhI!HhI!!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hHi!hHi!iHi!hHi!!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ih", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("hhHI!HHI!IhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!I!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!", charArray10);
        java.lang.Class<?> wildcardClass19 = charArray10.getClass();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str12, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hhi!hhi!ih" + "'", str14, "hhi!hhi!ih");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I" + "'", str16, "HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!" + "'", str17, "Hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihhhhhih!hhhhhih!hihhhih!hhhhhih!h!i!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str18, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihhhhhih!hhhhhih!hihhhih!hhhhhih!h!i!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2943");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhhHHHIH!Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", (int) ' ', "hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhHHHIH!Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str4, "hhhHHHIH!Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
        char[] charArray10 = new char[] { '4', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("h", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("Hhi!ihi!!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("hI!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("Hhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("hhhi!hhi!iHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhi!hhi!ihi!hhi!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hI!" + "'", str12, "hI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "h" + "'", str16, "h");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str17, "Hhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhi!hhi!iHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhi!hhi!ihi!hhi!!" + "'", str18, "Hhhi!hhi!iHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2945");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhhih!hhhihhih!hhhi!hhi!ihhih!hi!hhi!!hhhhih!hi!hhi!ihihhih!!hhi!!ihhihhih!!hhi!ihi!hhhih!hi!!!hhi!hhhih!hi!ihi!hhihhih!!!ihhi!hhihhih!!ihi!hhi!!hhih!hhhi!hhi!i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhih!hhhihhih!hhhi!hhi!ihhih!hi!hhi!!hhhhih!hi!hhi!ihihhih!!hhi!!ihhihhih!!hhi!ihi!hhhih!hi!!!hhi!hhhih!hi!ihi!hhihhih!!!ihhi!hhihhih!!ihi!hhi!!hhih!hhhi!hhi!i" + "'", str1, "hhhih!hhhihhih!hhhi!hhi!ihhih!hi!hhi!!hhhhih!hi!hhi!ihihhih!!hhi!!ihhihhih!!hhi!ihi!hhhih!hi!!!hhi!hhhih!hi!ihi!hhihhih!!!ihhi!hhihhih!!ihi!hhi!!hhih!hhhi!hhi!i");
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2946");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!" + "'", str2, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!");
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2947");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HhHIH!HhHIhHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhHIH!HhHIhHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!" + "'", str1, "hhHIH!HhHIhHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!");
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!" + "'", str2, "HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!");
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2949");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhHHHIH!HHhhih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhHHHIH!HHhhih!" + "'", str1, "hhHHHIH!HHhhih!");
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2950");
        char[] charArray10 = new char[] { '4', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("Hhhhih!hhhhhih!hihhhih!hhhhhih!h!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("hhHIH!HhHIH!hhHIH!hhHIH!hhHIH!ihHIH!hhHIH!!hHIH!hhHIH!hhHIH!HhHIH!HhHIH!IhHIH!HhHIH!!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("hHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("Hhhih!hhhiHhi!hhi!ihi!hhi!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hI!" + "'", str13, "hI!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhhhih!hhhhhih!hihhhih!hhhhhih!h!" + "'", str15, "Hhhhih!hhhhhih!hihhhih!hhhhhih!h!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "h" + "'", str16, "h");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "h" + "'", str17, "h");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhih!hhhiHhi!hhi!ihi!hhi!!" + "'", str18, "Hhhih!hhhiHhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2951");
        char[] charArray8 = new char[] { '4', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!HhI!IhI!HhI!!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("hHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str10, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "h" + "'", str12, "h");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!" + "'", str13, "HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "h" + "'", str14, "h");
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2952");
        char[] charArray14 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("HI!", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("hHI!IHI!!", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("hHi!hHi!iHi!hHi!!", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhhhih!hhhhhih!hihhhhhhih!hhhhih!", charArray14);
        java.lang.Class<?> wildcardClass23 = charArray14.getClass();
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "h" + "'", str17, "h");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hi!" + "'", str19, "Hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str20, "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HHi!hHi!iHi!hHi!!" + "'", str21, "HHi!hHi!iHi!hHi!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhhhih!hhhhhih!hihhhhhhih!hhhhih!" + "'", str22, "hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhhhih!hhhhhih!hihhhhhhih!hhhhih!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2953");
        char[] charArray19 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray19);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray19);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray19);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray19);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalize("h", charArray19);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray19);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray19);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.initials("hI!", charArray19);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihi!hhi!!", charArray19);
        java.lang.String str29 = org.apache.commons.lang.WordUtils.initials("hi!", charArray19);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!", charArray19);
        java.lang.String str31 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!hhi!iHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!", charArray19);
        java.lang.String str32 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!", charArray19);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H" + "'", str24, "H");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Hhih!" + "'", str25, "Hhih!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Hi!" + "'", str26, "Hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "h" + "'", str27, "h");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str28, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "h" + "'", str29, "h");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str30, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Hhhi!hhi!iHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!" + "'", str31, "Hhhi!hhi!iHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!" + "'", str32, "Hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!");
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2954");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHHI!HHI!IhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHI!HHI!IhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!" + "'", str2, "HHHI!HHI!IhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!");
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2955");
        char[] charArray19 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray19);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray19);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray19);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray19);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray19);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray19);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!", charArray19);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.uncapitalize("hHIH!", charArray19);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.uncapitalize("HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!", charArray19);
        java.lang.String str29 = org.apache.commons.lang.WordUtils.uncapitalize("hhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!", charArray19);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i", charArray19);
        java.lang.String str31 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHHHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!IHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!!HHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!IHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!!HHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!IHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!IHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!!HHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!IHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!!HHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!!", charArray19);
        java.lang.String str32 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!", charArray19);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hi!" + "'", str22, "Hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H" + "'", str23, "H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H" + "'", str24, "H");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hI!" + "'", str25, "hI!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!" + "'", str26, "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hHIH!" + "'", str27, "hHIH!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!" + "'", str28, "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str29, "hhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i" + "'", str30, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHHHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!IHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!!HHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!IHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!!HHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!IHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!IHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!!HHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!IHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!!HHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!!" + "'", str31, "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHHHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!IHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!!HHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!IHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!!HHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!IHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!IHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!!HHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!IHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!!HHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str32, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2956");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hhi!!" + "'", str1, "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hhi!!");
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2957");
        char[] charArray7 = new char[] { '4', '4' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("h", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhhih!hhhhHHHIH!HHHHHIH!HIHHHIhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!H!HHHHHIH!HhHHHIH!HHhhih!hhih!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!hhi!ihHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHHIH!HHhhih!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhHHIH!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hi!" + "'", str8, "Hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "h" + "'", str9, "h");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hhhhhih!hhhhHHHIH!HHHHHIH!HIHHHIhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!H!HHHHHIH!HhHHHIH!HHhhih!hhih!" + "'", str10, "hhhhhih!hhhhHHHIH!HHHHHIH!HIHHHIhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!H!HHHHHIH!HhHHHIH!HHhhih!hhih!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hhi!hhi!ihHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHHIH!HHhhih!" + "'", str11, "hhi!hhi!ihHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHHIH!HHhhih!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!" + "'", str12, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!");
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2958");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHIHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHHHIH!HHHHIH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHIHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHHHIH!HHHHIH!" + "'", str1, "HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHIHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHHHIH!HHHHIH!");
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2959");
        char[] charArray15 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("HI!", charArray15);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray15);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhih!", charArray15);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", charArray15);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ih", charArray15);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!", charArray15);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("hHi!hHi!iH", charArray15);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.initials("hhhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hi!" + "'", str18, "Hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhih!" + "'", str19, "Hhih!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str20, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hhi!hhi!ih" + "'", str21, "Hhi!hhi!ih");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!" + "'", str22, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "HHi!hHi!iH" + "'", str23, "HHi!hHi!iH");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "h" + "'", str24, "h");
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2960");
        char[] charArray19 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray19);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray19);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray19);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray19);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalize("h", charArray19);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray19);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray19);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.initials("hI!", charArray19);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihi!hhi!!", charArray19);
        java.lang.String str29 = org.apache.commons.lang.WordUtils.capitalize("hHIH!", charArray19);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.uncapitalize("HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!", charArray19);
        java.lang.String str31 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!HHI!IHI!HHI!!", charArray19);
        java.lang.String str32 = org.apache.commons.lang.WordUtils.uncapitalize("hHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!", charArray19);
        java.lang.Class<?> wildcardClass33 = charArray19.getClass();
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H" + "'", str24, "H");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Hhih!" + "'", str25, "Hhih!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Hi!" + "'", str26, "Hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "h" + "'", str27, "h");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str28, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "HHIH!" + "'", str29, "HHIH!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!" + "'", str30, "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hHI!HHI!IHI!HHI!!" + "'", str31, "hHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!" + "'", str32, "hHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2961");
        char[] charArray9 = new char[] { '4', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("h", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("HHI!IHI!!", charArray9);
        java.lang.Class<?> wildcardClass17 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hI!" + "'", str11, "hI!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "h" + "'", str12, "h");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HHI!IHI!!" + "'", str16, "HHI!IHI!!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2962");
        char[] charArray12 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("hHI!HHI!IHI!HHI!!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHHHIH!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("HHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HHI!HHI!IHI!HHI!!" + "'", str16, "HHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHHHIH!" + "'", str17, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHHHIH!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2963");
        char[] charArray22 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray22);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray22);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray22);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray22);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.capitalize("h", charArray22);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray22);
        java.lang.String str29 = org.apache.commons.lang.WordUtils.initials("hhI!HhI!IhI!HhI!!", charArray22);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!HhI!IhI!HhI!!", charArray22);
        java.lang.String str31 = org.apache.commons.lang.WordUtils.initials("hI!", charArray22);
        java.lang.String str32 = org.apache.commons.lang.WordUtils.initials("", charArray22);
        java.lang.String str33 = org.apache.commons.lang.WordUtils.initials("hHI!IHI!!", charArray22);
        java.lang.String str34 = org.apache.commons.lang.WordUtils.capitalize("Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!", charArray22);
        java.lang.String str35 = org.apache.commons.lang.WordUtils.initials("hhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i", charArray22);
        java.lang.String str36 = org.apache.commons.lang.WordUtils.initials("hhHHI!HHI!HhHI!HHI!IhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!", charArray22);
        java.lang.String str37 = org.apache.commons.lang.WordUtils.capitalize("hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHhi!HHIH!", charArray22);
        java.lang.String str38 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!", charArray22);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "H" + "'", str27, "H");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "H" + "'", str28, "H");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "h" + "'", str29, "h");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str30, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "h" + "'", str31, "h");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "h" + "'", str33, "h");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str34, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "h" + "'", str35, "h");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "h" + "'", str36, "h");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHhi!HHIH!" + "'", str37, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHhi!HHIH!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str38, "Hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2964");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("", (-1), "Hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2965");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("", 0, 0, "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2966");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHhhih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!" + "'", str1, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!");
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2967");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhi!hhi!ihhHhhhih!hhHHIH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHI!HHI!IHHhHHHIH!HHhhih!" + "'", str1, "hHI!HHI!IHHhHHHIH!HHhhih!");
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2968");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!I!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2969");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhhhhih!hhhhhih!hhhhhih!hihhhihhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhh", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhhhih!hhhhhih!hhhhhih!hihhhihhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhh" + "'", str2, "Hhhhhhih!hhhhhih!hhhhhih!hihhhihhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhh");
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2970");
        char[] charArray16 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("HI!", charArray16);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihi!hhi!!", charArray16);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray16);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("hHI!IHI!!", charArray16);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("HHIH!", charArray16);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.initials("hHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!", charArray16);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalize("Hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!", charArray16);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I", charArray16);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalize("hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhiHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!h!hhhih!hhhih!hhhih!ihhih!hhhih!!", charArray16);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HHI!IHI!!" + "'", str21, "HHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "h" + "'", str23, "h");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!" + "'", str24, "Hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I" + "'", str25, "hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhiHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!h!hhhih!hhhih!hhhih!ihhih!hhhih!!" + "'", str26, "Hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhiHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!h!hhhih!hhhih!hhhih!ihhih!hhhih!!");
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2971");
        char[] charArray12 = new char[] { '4', '4' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("h", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("Hhi!ihi!!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("hI!", charArray12);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("", charArray12);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!", charArray12);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhih!hhhiHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hHHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!", charArray12);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("HhhHHHIH!Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hI!" + "'", str14, "hI!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "h" + "'", str15, "h");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hi!" + "'", str16, "Hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "h" + "'", str18, "h");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!" + "'", str20, "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hhhih!hhhiHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hHHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!" + "'", str21, "hhhih!hhhiHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hHHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhhhhhih!hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str22, "Hhhhhhih!hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2972");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2973");
        char[] charArray7 = new char[] { '4', '4' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("h", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("hhih!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hi!" + "'", str8, "Hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "h" + "'", str9, "h");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hhih!" + "'", str10, "hhih!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!" + "'", str11, "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!" + "'", str12, "Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2974");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHHI!HHI!IhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!", 100, "hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhhih!hhhhih!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHI!HHI!IhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhhih!hhhhih!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhhih!hhhhih!I!HHI!IHI!" + "'", str4, "HHHI!HHI!IhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhhih!hhhhih!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhhih!hhhhih!I!HHI!IHI!");
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2975");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhhi!ihi!!hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHI!IHI!!Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str1, "HHHI!IHI!!Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2976");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!HhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHHhHI!IHI!!hhHI!IHI!!ihHI!IHI!!hhHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2977");
        char[] charArray17 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray17);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray17);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray17);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray17);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("h", charArray17);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray17);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray17);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.initials("hI!", charArray17);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihi!hhi!!", charArray17);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray17);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.uncapitalize("HhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i", charArray17);
        java.lang.Class<?> wildcardClass29 = charArray17.getClass();
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hhih!" + "'", str23, "Hhih!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hi!" + "'", str24, "Hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "h" + "'", str25, "h");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str26, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "h" + "'", str27, "h");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i" + "'", str28, "hhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2978");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2979");
        char[] charArray17 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray17);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray17);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray17);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray17);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("h", charArray17);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray17);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.initials("hhI!HhI!IhI!HhI!!", charArray17);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray17);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalize("hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I", charArray17);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.uncapitalize("HhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!", charArray17);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.uncapitalize("hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHHIH!HHhhih!", charArray17);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H" + "'", str23, "H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "h" + "'", str24, "h");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Hi!" + "'", str25, "Hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I" + "'", str26, "HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str27, "hhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHHIH!HHhhih!" + "'", str28, "hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHHIH!HHhhih!");
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2980");
        char[] charArray13 = new char[] { '4', '4' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!IHI!!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("hhI!HhI!IhI!HhI!!", charArray13);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", charArray13);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihi!hhi!!", charArray13);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!", charArray13);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHHHIH!HHHHhhhih!hhhhhih!hihhhiHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!h!hhhhhih!hHhhhih!hhHHIH!HHIH!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hI!" + "'", str16, "hI!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hi!" + "'", str17, "Hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhi!ihi!!" + "'", str19, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HhI!HhI!IhI!HhI!!" + "'", str20, "HhI!HhI!IhI!HhI!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str21, "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str22, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str23, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hhhhhih!hhhhhhhih!hhhhhih!hihhhihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!h!hhhhhih!hhhhhih!hhhhih!hhih!" + "'", str24, "Hhhhhih!hhhhhhhih!hhhhhih!hihhhihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!h!hhhhhih!hhhhhih!hhhhih!hhih!");
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2981");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2982");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!", (int) (byte) 0, (int) (short) 0, "Hhhhhih!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!hhih!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhhih!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!hhih!" + "'", str4, "Hhhhhih!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!hhih!");
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2983");
        char[] charArray21 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray21);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray21);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray21);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray21);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalize("h", charArray21);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray21);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.initials("hhI!HhI!IhI!HhI!!", charArray21);
        java.lang.String str29 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!HhI!IhI!HhI!!", charArray21);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.initials("hI!", charArray21);
        java.lang.String str31 = org.apache.commons.lang.WordUtils.initials("", charArray21);
        java.lang.String str32 = org.apache.commons.lang.WordUtils.initials("hHI!IHI!!", charArray21);
        java.lang.String str33 = org.apache.commons.lang.WordUtils.capitalize("Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!", charArray21);
        java.lang.String str34 = org.apache.commons.lang.WordUtils.initials("hhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i", charArray21);
        java.lang.String str35 = org.apache.commons.lang.WordUtils.capitalize("hhHhhhih!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!", charArray21);
        java.lang.String str36 = org.apache.commons.lang.WordUtils.initials("HhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIH!IhHIH!!hHIH!!", charArray21);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertArrayEquals(charArray21, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H" + "'", str26, "H");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "H" + "'", str27, "H");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "h" + "'", str28, "h");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str29, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "h" + "'", str30, "h");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "h" + "'", str32, "h");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str33, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "h" + "'", str34, "h");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "HhHhhhih!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!" + "'", str35, "HhHhhhih!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "H" + "'", str36, "H");
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2984");
        char[] charArray12 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("HHIH!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhHHHIH!Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhiHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!h!hhhih!hhhih!hhhih!ihhih!hhhih!!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhHHHIH!Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str17, "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhHHHIH!Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "h" + "'", str18, "h");
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2985");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!" + "'", str1, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!");
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2986");
        char[] charArray17 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray17);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray17);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray17);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray17);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("h", charArray17);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray17);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray17);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.initials("hI!", charArray17);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalize("hHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!", charArray17);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!", charArray17);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.uncapitalize("HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!IHI!!!", charArray17);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hhih!" + "'", str23, "Hhih!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H" + "'", str24, "H");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "h" + "'", str25, "h");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!" + "'", str26, "HHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str27, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!IHI!!!" + "'", str28, "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!IHI!!!");
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2987");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhhih!hhhihhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", 100, "hHi!hHi!iHi!hHi!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhih!hhhihhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!" + "'", str4, "hhhih!hhhihhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!");
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2988");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I" + "'", str1, "HhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I");
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2989");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2990");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihi!!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!ihi!!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str1, "hhhi!ihi!!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2991");
        char[] charArray14 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("hHIH!", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("H", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!HhI!Ih", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("Hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "h" + "'", str18, "h");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!" + "'", str20, "hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hhi!hhi!ih" + "'", str21, "Hhi!hhi!ih");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!" + "'", str22, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!");
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2992");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhi!hhi!ihhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!hi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhi!hhi!ihhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!hi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str1, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhi!hhi!ihhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!hi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2993");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str1, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2994");
        char[] charArray15 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray15);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("h", charArray15);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray15);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray15);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.initials("hI!", charArray15);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hhih!" + "'", str21, "Hhih!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "h" + "'", str23, "h");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str24, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2995");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHIH!HHHIHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHHI!HHI!IHhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!HHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!IHI!!!", 0, (int) (byte) 10, "hHhhhih!hhHHIH!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHIH!HHHIhHhhhih!hhHHIH!" + "'", str4, "hHHIH!HHHIhHhhhih!hhHHIH!");
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2996");
        char[] charArray15 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("hHI!HHI!IHI!HHI!!", charArray15);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!IHI!!", charArray15);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("HHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!", charArray15);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("HhhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", charArray15);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhi!hhi!ihi!hhi!!i!i", charArray15);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.initials("HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HHI!HHI!IHI!HHI!!" + "'", str19, "HHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhi!ihi!!" + "'", str20, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!" + "'", str21, "HHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HhhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!" + "'", str22, "HhhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhi!hhi!ihi!hhi!!i!i" + "'", str23, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhi!hhi!ihi!hhi!!i!i");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H" + "'", str24, "H");
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2997");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("", (int) (short) 100, (int) (byte) 0, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2998");
        char[] charArray9 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("HHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!iiHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!iiHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!iiHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!iiHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!iiHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!iiHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i!" + "'", str12, "HHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!iiHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!iiHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!iiHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i!");
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2999");
        char[] charArray16 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("HI!", charArray16);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihi!hhi!!", charArray16);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray16);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("hHI!IHI!!", charArray16);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("HHIH!", charArray16);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.initials("hHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!", charArray16);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalize("Hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!", charArray16);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalize("hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhHHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!i!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!", charArray16);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.initials("hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!", charArray16);
        java.lang.Class<?> wildcardClass27 = charArray16.getClass();
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HHI!IHI!!" + "'", str21, "HHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "h" + "'", str23, "h");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!" + "'", str24, "Hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhHHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!i!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!" + "'", str25, "HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhHHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!i!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "h" + "'", str26, "h");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3000");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!" + "'", str2, "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!");
    }
}

