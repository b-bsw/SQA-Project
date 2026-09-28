package org.apache.commons.lang;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

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
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!", (int) '4', "HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhiHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!h!hhhih!hhhih!hhhih!ihhih!hhhih!!" + "'", str4, "Hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhiHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!h!hhhih!hhhih!hhhih!ihhih!hhhih!!");
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHhih!hHhiHhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHhih!hHhiHhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str1, "HHhih!hHhiHhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!" + "'", str1, "hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!");
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHIHhhi!hhi!ihi!hhi!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!!" + "'", str1, "HHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!!");
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str1, "Hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        char[] charArray11 = new char[] { '4', '4' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("Hhhhih!hhhhhih!hihhhih!hhhhhih!h!", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("hHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("HhHIH!HhHIH!hhHIH!hhHIH!hhHIH!ihHIH!hhHIH!!hHIH!hhHIH!hhHIH!HhHIH!HhHIH!IhHIH!HhHIH!!", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!", charArray11);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHHHIH!HHHHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHIH!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hI!" + "'", str14, "hI!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhhih!hhhhhih!hihhhih!hhhhhih!h!" + "'", str16, "Hhhhih!hhhhhih!hihhhih!hhhhhih!h!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hhi!!" + "'", str17, "Hhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhHIH!HhHIH!hhHIH!hhHIH!hhHIH!ihHIH!hhHIH!!hHIH!hhHIH!hhHIH!HhHIH!HhHIH!IhHIH!HhHIH!!" + "'", str18, "hhHIH!HhHIH!hhHIH!hhHIH!hhHIH!ihHIH!hhHIH!!hHIH!hhHIH!hhHIH!HhHIH!HhHIH!IhHIH!HhHIH!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhhhih!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!hhih!" + "'", str20, "Hhhhhih!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!hhih!");
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        char[] charArray10 = new char[] { '#', '4', '4', '4', '4', '#' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihi!hhi!!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("HhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHHIH!HHhhih!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("hHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!", charArray10);
        java.lang.Class<?> wildcardClass15 = charArray10.getClass();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '#', '4', '4', '4', '4', '#' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str11, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str12, "Hhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "h" + "'", str14, "h");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        char[] charArray12 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("HI!", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhih!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ih", charArray12);
        java.lang.Class<?> wildcardClass19 = charArray12.getClass();
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhih!" + "'", str16, "Hhih!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str17, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhi!hhi!ih" + "'", str18, "Hhi!hhi!ih");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        char[] charArray19 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray19);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray19);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray19);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray19);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalize("h", charArray19);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray19);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray19);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray19);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!HhI!IhI!HhI!!", charArray19);
        java.lang.String str29 = org.apache.commons.lang.WordUtils.uncapitalize("hI!", charArray19);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.capitalize("hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!", charArray19);
        java.lang.String str31 = org.apache.commons.lang.WordUtils.initials("hHhih!hHhih!HHhih!HHhih!HHhih!IHhih!HHhih!!Hhih!HHhih!HHhih!hHhih!hHhih!iHhih!hHhih!!", charArray19);
        java.lang.String str32 = org.apache.commons.lang.WordUtils.capitalize("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhi!hhi!ihi!hhi!!i!i", charArray19);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H" + "'", str24, "H");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Hhih!" + "'", str25, "Hhih!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str28, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hI!" + "'", str29, "hI!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!" + "'", str30, "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "h" + "'", str31, "h");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhi!hhi!ihi!hhi!!i!i" + "'", str32, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhi!hhi!ihi!hhi!!i!i");
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!" + "'", str1, "hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!");
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!", (int) (byte) 100, "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhi!hhi!ihi!hhi!!i!i", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str4, "Hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!h!ihhih!!hhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hih!ihhih!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhhih!ihhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!h!!hhih!!", (-1), "HHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!h!ihhih!!hhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hih!ihhih!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhhih!ihhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!h!!hhih!!" + "'", str4, "Hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!h!ihhih!!hhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hih!ihhih!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhhih!ihhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!h!!hhih!!");
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        char[] charArray15 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray15);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("h", charArray15);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray15);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("hHI!IHI!!", charArray15);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.uncapitalize("hhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!ihhih!!hHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hih!ihhih!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hhhih!ihhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!!hhih!!", charArray15);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.initials("Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHHHIH!HHHHIH!", charArray15);
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H" + "'", str24, "H");
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!", (int) (short) 100, (int) (byte) 10, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhHhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str4, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhHhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        char[] charArray15 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray15);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray15);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray15);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray15);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!", charArray15);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.uncapitalize("hHIH!", charArray15);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhhih!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!hhih!", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hi!" + "'", str18, "Hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hI!" + "'", str21, "hI!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!" + "'", str22, "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hHIH!" + "'", str23, "hHIH!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hhhhhih!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!hhih!" + "'", str24, "hhhhhih!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!hhih!");
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        char[] charArray11 = new char[] { '4', '4' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!IHI!!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("hhI!HhI!IhI!HhI!!", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!", charArray11);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IIhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I!hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IIhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IIhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I!hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hI!" + "'", str14, "hI!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhi!ihi!!" + "'", str17, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HhI!HhI!IhI!HhI!!" + "'", str18, "HhI!HhI!IhI!HhI!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "h" + "'", str19, "h");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!iihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!iihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!iihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i!" + "'", str20, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!iihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!iihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!iihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i!");
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!", 100, (int) (byte) 0, "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhHHIH!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 100, length 45");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!IHI!!!", 1, (int) 'a', "Hhhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!IHhhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!" + "'", str4, "hhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!IHhhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
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
        java.lang.String str27 = org.apache.commons.lang.WordUtils.initials("HhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIH!IhHIH!!hHIH!!", charArray17);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHHHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!", charArray17);
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str28, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhHIH!HhHIH!hhHIH!hhHIH!hhHIH!ihHIH!hhHIH!!hHIH!hhHIH!hhHIH!HhHIH!HhHIH!IhHIH!HhHIH!!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhHIH!HhHIH!hhHIH!hhHIH!hhHIH!ihHIH!hhHIH!!hHIH!hhHIH!hhHIH!HhHIH!HhHIH!IhHIH!HhHIH!!" + "'", str2, "hhHIH!HhHIH!hhHIH!hhHIH!hhHIH!ihHIH!hhHIH!!hHIH!hhHIH!hhHIH!HhHIH!HhHIH!IhHIH!HhHIH!!");
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHHIH!HHHIHhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!", (int) 'a', "Hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHIH!HHHIHhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHIHhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!HHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!" + "'", str4, "HHHIH!HHHIHhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHIHhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!HHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!");
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhhhhih!hhhi!ihi!!", (int) (short) 0, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhhhHI!IHI!!hhHI!IHI!!ihHI!IHI!!hhHI!IHI!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhhhih!hhhi!ihi!!" + "'", str4, "Hhhhhhih!hhhi!ihi!!");
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        char[] charArray14 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("h", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("HHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("HhI!HhI!Ih", charArray14);
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str1, "hhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!!", 1, (int) '4', "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhHHHHIH!HHHHIH!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhHhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhHHHHIH!HHHHIH!" + "'", str4, "HHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhHhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhHHHHIH!HHHHIH!");
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!" + "'", str2, "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHI!HHI!IH", (int) (byte) 10, "", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHI!HHI!IH" + "'", str4, "hHI!HHI!IH");
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHIHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHIHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str1, "hhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHIHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("", (int) 'a', 0, "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!IHI!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhi!ihi!!" + "'", str1, "hhi!ihi!!");
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        char[] charArray16 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray16);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("h", charArray16);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray16);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray16);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!HhI!IhI!HhI!!", charArray16);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.uncapitalize("hhHHHIH!HHhhih!", charArray16);
        java.lang.Class<?> wildcardClass27 = charArray16.getClass();
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str25, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hhHHHIH!HHhhih!" + "'", str26, "hhHHHIH!HHhhih!");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
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
        java.lang.String str30 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHhHHHIH!HHHHHIH!HIHhhHHHIH!HHhhih!", charArray18);
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhhhih!hhhhhih!hihhhhhhih!hhhhih!" + "'", str30, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhhhih!hhhhhih!hihhhhhhih!hhhhih!");
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHHHIH!", (int) (short) 100, "HHHIH!HHHIHhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHIHhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!HHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHHHIH!" + "'", str4, "hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHHHIH!");
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!" + "'", str2, "hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!");
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        char[] charArray9 = new char[] { '#', '4', '4', '4', '4', '#' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihi!hhi!!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!ihi!!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', '4', '4', '4', '4', '#' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str10, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str11, "Hhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!ihi!!!" + "'", str12, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!ihi!!!");
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhih!hhhhhih!hihhhih!hhhhhih!h!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhih!hhhhhih!hihhhih!hhhhhih!h!" + "'", str1, "hhhhih!hhhhhih!hihhhih!hhhhhih!h!");
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!" + "'", str1, "Hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhhih!hhhihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i", (int) (byte) 10, "hhih!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhih!hhhihhih!hhhi!hhi!ihhih!hi!hhi!!hhhhih!hi!hhi!ihihhih!!hhi!!ihhihhih!!hhi!ihi!hhhih!hi!!!hhi!hhhih!hi!ihi!hhihhih!!!ihhi!hhihhih!!ihi!hhi!!hhih!hhhi!hhi!i" + "'", str4, "hhhih!hhhihhih!hhhi!hhi!ihhih!hi!hhi!!hhhhih!hi!hhi!ihihhih!!hhi!!ihhihhih!!hhi!ihi!hhhih!hi!!!hhi!hhhih!hi!ihi!hhihhih!!!ihhi!hhihhih!!ihi!hhi!!hhih!hhhi!hhi!i");
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhhhhih!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!", 10, (int) ' ', "hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhh");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhhhih!hhhhhih!hhhhhih!hihhhihhHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhh" + "'", str4, "Hhhhhhih!hhhhhih!hhhhhih!hihhhihhHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhh");
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhHHHHIH!HHHHIH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhhih!hhhhih!" + "'", str1, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhhih!hhhhih!");
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HhhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!", 0, (int) (byte) 1, "Hhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str4, "HHhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!" + "'", str1, "Hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!");
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!" + "'", str1, "hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!");
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        char[] charArray13 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("HI!", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihi!hhi!!", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str18, "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str19, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        char[] charArray15 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray15);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("h", charArray15);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray15);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("HHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!", charArray15);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.initials("hHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!", charArray15);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalize("HhhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", charArray15);
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HhhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!" + "'", str24, "HhhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!");
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        char[] charArray19 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray19);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray19);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray19);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray19);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalize("h", charArray19);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray19);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray19);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.initials("hI!", charArray19);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.uncapitalize("hhih!", charArray19);
        java.lang.String str29 = org.apache.commons.lang.WordUtils.initials("HhI!HhI!IhI!HhI!!", charArray19);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.capitalizeFully("HHIH!", charArray19);
        java.lang.String str31 = org.apache.commons.lang.WordUtils.initials("hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!", charArray19);
        java.lang.String str32 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!", charArray19);
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hhih!" + "'", str28, "hhih!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "H" + "'", str29, "H");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Hhih!" + "'", str30, "Hhih!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "h" + "'", str31, "h");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str32, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HhHhhhih!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!I!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!I!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!I!HHI!IHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhHhhhih!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!I!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!I!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!I!HHI!IHI!" + "'", str1, "hhHhhhih!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!I!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!I!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!I!HHI!IHI!");
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!ihhih!!hHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hih!ihhih!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hhhih!ihhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!!hhih!!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!ihhih!!hHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hih!ihhih!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hhhih!ihhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!!hhih!!" + "'", str2, "Hhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!ihhih!!hHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hih!ihhih!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hhhih!ihhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!!hhih!!");
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHIHhhi!hhi!ihi!hhi!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!", (int) (byte) 10, (int) (byte) 1, "HhHI!HHI!IhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhHHI!HHI!HhHI!HHI!IhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!" + "'", str4, "hhHHI!HHI!HhHI!HHI!IhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!");
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHhih!hHhiHhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhHIH!HhHIhHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!" + "'", str1, "hhHIH!HhHIhHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!");
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!" + "'", str2, "HHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!");
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        char[] charArray12 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("HI!", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihi!hhi!!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("Hhhi!hhi!iHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str17, "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhhhHI!IHI!!hhHI!IHI!!ihHI!IHI!!hhHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str1, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHi!hHi!iHi!hHi!!", 100, "hHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHi!hHi!iHi!hHi!!" + "'", str4, "hHi!hHi!iHi!hHi!!");
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!" + "'", str2, "hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!");
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i", (-1), (int) (short) 0, "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!HhHIH!HhHIH!hhHIH!hhHIH!hhHIH!ihHIH!hhHIH!!hHIH!hhHIH!hhHIH!HhHIH!HhHIH!IhHIH!HhHIH!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!HhHIH!HhHIH!hhHIH!hhHIH!hhHIH!ihHIH!hhHIH!!hHIH!hhHIH!hhHIH!HhHIH!HhHIH!IhHIH!HhHIH!!" + "'", str4, "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!HhHIH!HhHIH!hhHIH!hhHIH!hhHIH!ihHIH!hhHIH!!hHIH!hhHIH!hhHIH!HhHIH!HhHIH!IhHIH!HhHIH!!");
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhHhih!hHhih!iHhih!!Hhih!iHhih!hHhihhhhi!hhi!iHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhHhih!hHhih!iHhih!!Hhih!iHhih!hHhihhhhi!hhi!iHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str1, "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhHhih!hHhih!iHhih!!Hhih!iHhih!hHhihhhhi!hhi!iHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
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
        java.lang.String str31 = org.apache.commons.lang.WordUtils.uncapitalize("HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!", charArray20);
        java.lang.String str32 = org.apache.commons.lang.WordUtils.initials("Hhhhih!hhhhhih!hihhhih!hhhhhih!h!", charArray20);
        java.lang.String str33 = org.apache.commons.lang.WordUtils.uncapitalize("HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!", charArray20);
        java.lang.String str34 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray20);
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!" + "'", str31, "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "H" + "'", str32, "H");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!" + "'", str33, "hhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
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
        java.lang.String str30 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!", charArray19);
        java.lang.String str31 = org.apache.commons.lang.WordUtils.initials("HhhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", charArray19);
        java.lang.String str32 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!", charArray19);
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str30, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "H" + "'", str31, "H");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str32, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str1, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhhhih!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!hhih!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhhih!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!hhih!" + "'", str2, "Hhhhhih!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!hhih!");
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        char[] charArray12 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("HI!", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("HHIH!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("HHIH!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("Hhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!ihhih!!hHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hih!ihhih!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hhhih!ihhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!!hhih!!", charArray12);
        java.lang.Class<?> wildcardClass19 = charArray12.getClass();
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhih!" + "'", str16, "Hhih!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HHIH!" + "'", str17, "HHIH!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!ihhih!!hHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hih!ihhih!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hhhih!ihhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!!hhih!!" + "'", str18, "Hhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!ihhih!!hHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hih!ihhih!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hhhih!ihhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!!hhih!!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        char[] charArray11 = new char[] { '4', '4' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("h", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("Hhi!ihi!!", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("hI!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!", charArray11);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!iiHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!iiHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!iiHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hI!" + "'", str13, "hI!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "h" + "'", str14, "h");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "h" + "'", str17, "h");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!" + "'", str19, "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!iihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!iihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!iihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i!" + "'", str20, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!iihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!iihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!iihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i!");
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!I!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!I!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!I!HHI!IHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!hhihhhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!i!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhhhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!i!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhhhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!i!hhi!ihi!" + "'", str1, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!hhihhhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!i!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhhhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!i!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhhhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!i!hhi!ihi!");
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HhHI!HHI!IhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!", (int) '#', "hhi!ihi!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhHI!HHI!IhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!" + "'", str4, "HhHI!HHI!IhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!");
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!" + "'", str1, "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!");
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!" + "'", str2, "hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!");
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        char[] charArray9 = new char[] { '4', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!HhHIH!HhHIH!hhHIH!hhHIH!hhHIH!ihHIH!hhHIH!!hHIH!hhHIH!hhHIH!HhHIH!HhHIH!IhHIH!HhHIH!!", charArray9);
        java.lang.Class<?> wildcardClass17 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hI!" + "'", str12, "hI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!HhHIH!HhHIH!hhHIH!hhHIH!hhHIH!ihHIH!hhHIH!!hHIH!hhHIH!hhHIH!HhHIH!HhHIH!IhHIH!HhHIH!!" + "'", str16, "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!HhHIH!HhHIH!hhHIH!hhHIH!hhHIH!ihHIH!hhHIH!!hHIH!hhHIH!hhHIH!HhHIH!HhHIH!IhHIH!HhHIH!!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!" + "'", str1, "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!");
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHhhih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHhhih!" + "'", str1, "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHhhih!");
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhHI!IHI!!hhHI!IHI!!ihHI!IHI!!hhHI!IHI!!!" + "'", str1, "HhHI!IHI!!hhHI!IHI!!ihHI!IHI!!hhHI!IHI!!!");
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!", (int) (short) -1, (int) 'a', "HhhHHHIH!Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhHHHIH!Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str4, "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhHHHIH!Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhi!hhi!ihi!hhi!!" + "'", str1, "HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        char[] charArray9 = new char[] { '4', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!", charArray9);
        java.lang.Class<?> wildcardClass17 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hI!" + "'", str12, "hI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "h" + "'", str16, "h");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhhhih!hhhhHHHIH!HHHHHIH!HIHHHIhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!H!HHHHHIH!HhHHHIH!HHhhih!hhih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
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
        java.lang.String str30 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!HhI!IhI!HhI!!", charArray19);
        java.lang.String str31 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", charArray19);
        java.lang.String str32 = org.apache.commons.lang.WordUtils.initials("Hhhhhih!hhhhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHHIH!HHhhih!hhih!", charArray19);
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str30, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Hhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str31, "Hhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "H" + "'", str32, "H");
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHHIH!HHhhih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHHIH!HHhhih!" + "'", str1, "hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHHIH!HHhhih!");
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        char[] charArray5 = new char[] { ' ', ' ', '#' };
        java.lang.String str6 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!IHI!!!", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHHHIH!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', ' ', '#' });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!ihi!!!" + "'", str6, "Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!ihi!!!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHHHIH!" + "'", str7, "hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHHHIH!");
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!I!HhI!!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!I!HhI!!" + "'", str2, "hhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!I!HhI!!");
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhh", (int) '4', (int) 'a', "hHi!hHi!iHi!hHi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhh" + "'", str4, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhh");
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHI!IHI!!", (int) (short) 0, (int) '4', "hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHI!IHI!!" + "'", str4, "hHI!IHI!!");
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!!" + "'", str2, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!!");
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str1, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhi!hhi!ihi!hhi!!i!i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhi!hhi!ihi!hhi!!i!i" + "'", str1, "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhi!hhi!ihi!hhi!!i!i");
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihh" + "'", str1, "hhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihh");
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhHhhhih!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
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
        java.lang.String str38 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!ihi!!!", charArray22);
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
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!ihi!!!" + "'", str38, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!ihi!!!");
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        char[] charArray10 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray10);
        java.lang.Class<?> wildcardClass15 = charArray10.getClass();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        char[] charArray16 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray16);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("h", charArray16);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray16);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray16);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.initials("Hhih!", charArray16);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray16);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!", charArray16);
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "HI!" + "'", str25, "HI!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str26, "hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHhih!hHhih!iHhih!!Hhih!iHhih!hHhihhhhi!hhi!iHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!" + "'", str1, "HHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!");
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!" + "'", str1, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!");
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhi!hhi!ih", 1, 0, "hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHH" + "'", str4, "HhHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHH");
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i", (int) (short) 10, (int) '#', "HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHHHIH!HHHHIH!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHHHIH!HHHHIH!" + "'", str4, "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHHHIH!HHHHIH!");
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!" + "'", str2, "HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!");
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        char[] charArray7 = new char[] { '4', '4' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("h", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray7);
        java.lang.Class<?> wildcardClass13 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hi!" + "'", str8, "Hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hI!" + "'", str9, "hI!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "h" + "'", str10, "h");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str1, "hhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHIHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhi!hhi!ihi!hhi!!" + "'", str1, "hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        char[] charArray14 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("h", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhhhih!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhih!" + "'", str20, "Hhih!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hi!" + "'", str21, "Hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhhhhhih!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!" + "'", str22, "Hhhhhhih!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!");
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str1, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!", (int) (short) -1, "HHIH!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str4, "Hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhhih!hhhiHhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhih!hhhiHhi!hhi!ihi!hhi!!" + "'", str1, "Hhhih!hhhiHhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhi!hhi!ihi!hhi!!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhi!hhi!ihi!hhi!!" + "'", str2, "hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        char[] charArray9 = new char[] { '4', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("h", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("HHIH!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hhi!!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHI!HHI!IhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!", charArray9);
        java.lang.Class<?> wildcardClass17 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hI!" + "'", str11, "hI!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "h" + "'", str12, "h");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hhi!!" + "'", str15, "Hhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!" + "'", str16, "Hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
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
        java.lang.String str35 = org.apache.commons.lang.WordUtils.initials("HHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!", charArray22);
        java.lang.String str36 = org.apache.commons.lang.WordUtils.uncapitalize("HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!", charArray22);
        java.lang.String str37 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!!", charArray22);
        java.lang.String str38 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhHhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!", charArray22);
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
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!" + "'", str36, "hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!!" + "'", str37, "hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str38, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!" + "'", str1, "Hhhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I" + "'", str1, "HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I");
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhi!hhi!ihi!hhi!!i!i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
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
        java.lang.String str30 = org.apache.commons.lang.WordUtils.initials("hHhhhih!hhHHIH!", charArray19);
        java.lang.String str31 = org.apache.commons.lang.WordUtils.initials("hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", charArray19);
        java.lang.String str32 = org.apache.commons.lang.WordUtils.capitalize("Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!", charArray19);
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "h" + "'", str30, "h");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "h" + "'", str31, "h");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str32, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("h", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h" + "'", str2, "h");
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        char[] charArray16 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray16);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("h", charArray16);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray16);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.initials("hhI!HhI!IhI!HhI!!", charArray16);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!HhI!IhI!HhI!!", charArray16);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.initials("hhih!", charArray16);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray16);
        java.lang.Class<?> wildcardClass27 = charArray16.getClass();
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHHIH!HHHIHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!H!IHHIH!!HHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HIH!IHHIH!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHHIH!IHHIHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!H!!HHIH!!", (int) (byte) 10, "hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHHHIH!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHIH!HHHIHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!H!IHHIH!!HHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HIH!IHHIH!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHHIH!IHHIHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!H!!HHIH!!" + "'", str4, "HHHIH!HHHIHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!H!IHHIH!!HHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HIH!IHHIH!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHHIH!IHHIHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!H!!HHIH!!");
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        char[] charArray9 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("HI!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("hI!", charArray9);
        java.lang.Class<?> wildcardClass13 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!iiHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!iiHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!iiHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhHI!HHI!IHI!HHI!!", 10, (int) (byte) -1, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhHI!HHI!IHI!HHI!!" + "'", str4, "hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhHI!HHI!IHI!HHI!!");
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!", (int) (short) 0, (int) (byte) -1, "hHhhhih!hhHHIH!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!" + "'", str4, "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!");
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhi!hhi!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!", (int) (short) 10, "HhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHIHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhi!hhi!iHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHIHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhih!hhhHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHIHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhih!hihhhHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHIHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!ih!hhhhhihHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHIHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!!h!" + "'", str4, "Hhhi!hhi!iHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHIHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhih!hhhHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHIHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhih!hihhhHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHIHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!ih!hhhhhihHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHIHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!!h!");
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        char[] charArray7 = new char[] { '4', '4' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hi!" + "'", str8, "Hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!" + "'", str1, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!");
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihI!hhhi!hhi!ihi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhi!hhi!ihi!" + "'", str1, "Hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhi!hhi!ihi!");
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        char[] charArray22 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray22);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray22);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray22);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray22);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.capitalize("h", charArray22);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray22);
        java.lang.String str29 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray22);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.initials("hI!", charArray22);
        java.lang.String str31 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihi!hhi!!", charArray22);
        java.lang.String str32 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray22);
        java.lang.String str33 = org.apache.commons.lang.WordUtils.capitalize("hhi!ihi!!", charArray22);
        java.lang.String str34 = org.apache.commons.lang.WordUtils.capitalizeFully("hhi!hhi!ihi!hhi!!", charArray22);
        java.lang.String str35 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray22);
        java.lang.String str36 = org.apache.commons.lang.WordUtils.initials("HI!", charArray22);
        java.lang.String str37 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!", charArray22);
        java.lang.String str38 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!", charArray22);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "H" + "'", str27, "H");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Hhih!" + "'", str28, "Hhih!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Hi!" + "'", str29, "Hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "h" + "'", str30, "h");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str31, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "h" + "'", str32, "h");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Hhi!ihi!!" + "'", str33, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str34, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "H" + "'", str36, "H");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!" + "'", str37, "hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str38, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhHhhhhih!hhhhHHHIH!HHHHHIH!HIHHHIhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!H!HHHHHIH!HhHHHIH!HHhhih!hhih!i!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hHhhhhih!hhhhHHHIH!HHHHHIH!HIHHHIhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!H!HHHHHIH!HhHHHIH!HHhhih!hhih!hi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhiHhhhhih!hhhhHHHIH!HHHHHIH!HIHHHIhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!H!HHHHHIH!HhHHHIH!HHhhih!hhih!!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhHhhhhih!hhhhHHHIH!HHHHHIH!HIHHHIhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!H!HHHHHIH!HhHHHIH!HHhhih!hhih!i!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hHhhhhih!hhhhHHHIH!HHHHHIH!HIHHHIhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!H!HHHHHIH!HhHHHIH!HHhhih!hhih!hi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhiHhhhhih!hhhhHHHIH!HHHHHIH!HIHHHIhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!H!HHHHHIH!HhHHHIH!HHhhih!hhih!!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str1, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhHhhhhih!hhhhHHHIH!HHHHHIH!HIHHHIhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!H!HHHHHIH!HhHHHIH!HHhhih!hhih!i!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hHhhhhih!hhhhHHHIH!HHHHHIH!HIHHHIhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!H!HHHHHIH!HhHHHIH!HHhhih!hhih!hi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhiHhhhhih!hhhhHHHIH!HHHHHIH!HIHHHIhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!H!HHHHHIH!HhHHHIH!HHhhih!hhih!!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhHI!HHI!IHI!HHI!!", 10, 10, "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhhih!hhhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i" + "'", str4, "Hhhhhih!hhhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i");
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        char[] charArray14 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("h", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HI!" + "'", str20, "HI!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str21, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I" + "'", str22, "HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I");
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hI!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hI!" + "'", str2, "hI!");
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!" + "'", str1, "HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!");
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhHI!IHI!!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!", (int) (short) 10, 100, "HhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!IHI!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhHI!IHI!!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!HhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!IHI!!!" + "'", str4, "hhHI!IHI!!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!HhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!IHI!!!");
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HhHI!HHI!IhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHhi!hhi!iHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!" + "'", str1, "hHhi!hhi!iHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!");
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhhih!hhhhih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!" + "'", str1, "HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!");
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        char[] charArray15 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray15);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("h", charArray15);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray15);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("Hhi!ihi!!", charArray15);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray15);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!iHhhi!hhi!iHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!hi!", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hhih!" + "'", str21, "Hhih!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhi!ihi!!" + "'", str22, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hi!" + "'", str23, "Hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hi!" + "'", str24, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hi!");
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        char[] charArray6 = new char[] { '4', '4' };
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHhhih!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Hi!" + "'", str7, "Hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H" + "'", str8, "H");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHhhih!" + "'", str10, "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHhhih!");
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!" + "'", str1, "Hhhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!");
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHHIH!HHhhih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!" + "'", str1, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!");
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hhi!!" + "'", str1, "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hhi!!");
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!hhihhhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!i!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhhhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!i!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhhhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!i!hhi!ihi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!hhi!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhi!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!" + "'", str1, "Hhhi!hhi!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!");
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        char[] charArray14 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("h", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("hhI!HhI!IhI!HhI!!", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhih!" + "'", str20, "Hhih!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H" + "'", str21, "H");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HhI!HhI!IhI!HhI!!" + "'", str22, "HhI!HhI!IhI!HhI!!");
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        char[] charArray16 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray16);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("h", charArray16);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray16);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray16);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.initials("hI!", charArray16);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalize("hHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!", charArray16);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhih!hhhhhih!hihhhih!hhhhhih!h!", charArray16);
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "HHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!" + "'", str25, "HHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Hhhhih!hhhhhih!hihhhih!hhhhhih!h!" + "'", str26, "Hhhhih!hhhhhih!hihhhih!hhhhhih!h!");
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!", (int) (byte) 10, (int) (short) -1, "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHhhih!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str4, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhhhHI!IHI!!hhHI!IHI!!ihHI!IHI!!hhHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str1, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
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
        java.lang.String str27 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!", charArray17);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.capitalize("", charArray17);
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str27, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i", 0, (int) ' ', "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhi!hhi!ihi!hhi!!i!i");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhi!hhi!ihi!hhi!!i!i" + "'", str4, "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhi!hhi!ihi!hhi!!i!i");
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
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
        java.lang.String str32 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!", charArray21);
        java.lang.String str33 = org.apache.commons.lang.WordUtils.initials("HhhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", charArray21);
        java.lang.String str34 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!IHI!!!", charArray21);
        java.lang.String str35 = org.apache.commons.lang.WordUtils.uncapitalize("hhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!I!HhI!!", charArray21);
        java.lang.String str36 = org.apache.commons.lang.WordUtils.capitalizeFully("hhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!", charArray21);
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str32, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "H" + "'", str33, "H");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!ihi!!!" + "'", str34, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!ihi!!!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!I!HhI!!" + "'", str35, "hhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!I!HhI!!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Hhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str36, "Hhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhi!hhi!ihi!hhi!!" + "'", str1, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhhhhih!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhhhih!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!" + "'", str2, "hhhhhhih!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!");
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhi!hhi!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHI!HHI!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!" + "'", str1, "hHHI!HHI!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!");
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        char[] charArray11 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("HHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str16, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I" + "'", str1, "hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I");
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        char[] charArray12 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("HI!", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhih!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("Hhhhih!hhhhhih!hihhhih!hhhhhih!h!", charArray12);
        java.lang.Class<?> wildcardClass19 = charArray12.getClass();
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhih!" + "'", str16, "Hhih!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!" + "'", str1, "HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!");
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IIhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I!hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IIhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IIhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I!hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IIhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I!hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IIhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IIhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I!hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I!" + "'", str1, "hhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IIhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I!hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IIhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IIhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I!hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I!");
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!" + "'", str2, "HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!");
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!HhI!Ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ih" + "'", str1, "Hhi!hhi!ih");
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHHIH!HHHIhHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhih!hhhiHhi!hhi!ihi!hhi!!" + "'", str1, "Hhhih!hhhiHhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHHHIH!", (int) (short) 100, (int) '4', "HhHI!IHI!!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHHhHI!IHI!!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str4, "hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHHhHI!IHI!!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhhhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I", (int) (short) 100, (int) (short) 0, "Hhhih!hhhihhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhhhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHIHhhih!hhhihhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!" + "'", str4, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhhhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHIHhhih!hhhihhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!");
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
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
        java.lang.String str31 = org.apache.commons.lang.WordUtils.uncapitalize("HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!", charArray20);
        java.lang.String str32 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray20);
        java.lang.String str33 = org.apache.commons.lang.WordUtils.initials("hhI!HhI!Ih", charArray20);
        java.lang.String str34 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!", charArray20);
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!" + "'", str31, "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "h" + "'", str32, "h");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "h" + "'", str33, "h");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "H" + "'", str34, "H");
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        char[] charArray14 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!", charArray14);
        java.lang.Class<?> wildcardClass23 = charArray14.getClass();
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hi!" + "'", str17, "Hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hI!" + "'", str20, "hI!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!" + "'", str21, "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!" + "'", str22, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhHHIH!", 10, "hI!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhHHIH!" + "'", str4, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhHHIH!");
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str2, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!" + "'", str1, "hHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!");
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!" + "'", str2, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!");
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        char[] charArray15 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray15);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("h", charArray15);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray15);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("hHI!IHI!!", charArray15);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhih!", charArray15);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.uncapitalize("hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!!", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H" + "'", str21, "H");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "h" + "'", str22, "h");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hhih!" + "'", str23, "Hhih!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!!" + "'", str24, "hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!!");
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!!" + "'", str1, "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!!");
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhhhhih!hhhhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHHIH!HHhhih!hhih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        char[] charArray8 = new char[] { '4', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("h", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("h", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("HHIH!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("HHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hI!" + "'", str10, "hI!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhih!" + "'", str13, "Hhih!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hi!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!HhHIH!HhHIH!hhHIH!hhHIH!hhHIH!ihHIH!hhHIH!!hHIH!hhHIH!hhHIH!HhHIH!HhHIH!IhHIH!HhHIH!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!" + "'", str1, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!");
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!", (int) (byte) 0, 100, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhHhih!hHhih!iHhih!!Hhih!iHhih!hHhihhhhi!hhi!iHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!" + "'", str4, "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!");
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!" + "'", str1, "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!");
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.initials("Hhhih!hhhiHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hHHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        char[] charArray13 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("HI!", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihi!hhi!!", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhHHIH!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhHHIH!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str18, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!" + "'", str19, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhHHIH!" + "'", str20, "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhHHIH!");
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhhhih!hhhhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHHIH!HHhhih!hhih!", (int) (byte) 0, (int) (short) 0, "Hhhi!hhi!iHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhi!hhi!iHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str4, "Hhhi!hhi!iHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str1, "hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHHHIH!HHHhHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhih!hhhHhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!" + "'", str1, "hhhhih!hhhHhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHI!IHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!" + "'", str1, "hHHI!IHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!");
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!" + "'", str1, "Hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhiHHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhi!hhi!ihHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHHIH!HHhhih!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhi!hhi!ihHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHHIH!HHhhih!" + "'", str2, "Hhi!hhi!ihHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHHIH!HHhhih!");
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        char[] charArray16 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("HI!", charArray16);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihi!hhi!!", charArray16);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray16);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("hHI!IHI!!", charArray16);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("HHIH!", charArray16);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.initials("hHI!HHI!IHI!HHI!!", charArray16);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalize("hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!", charArray16);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.uncapitalize("hHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I", charArray16);
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I" + "'", str26, "hHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I");
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        char[] charArray6 = new char[] { '4', '4' };
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!HhI!IhI!HhI!!", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("hhHIH!HhHIH!hhHIH!hhHIH!hhHIH!ihHIH!hhHIH!!hHIH!hhHIH!hhHIH!HhHIH!HhHIH!IhHIH!HhHIH!!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Hi!" + "'", str7, "Hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str8, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!" + "'", str10, "Hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!");
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        char[] charArray16 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("HI!", charArray16);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihi!hhi!!", charArray16);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray16);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("hHI!IHI!!", charArray16);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("HHIH!", charArray16);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.initials("hHI!HHI!IHI!HHI!!", charArray16);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray16);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalize("Hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!", charArray16);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!", charArray16);
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HI!" + "'", str24, "HI!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!" + "'", str25, "Hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!" + "'", str26, "hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("", 100, "HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhHHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!i!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i" + "'", str1, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i");
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!" + "'", str1, "HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!");
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!" + "'", str2, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!");
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhhi!hhi!iHhhi!hhi!ihi!hhi!!hhhihHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhi!iHhhi!hhi!ihi!hhi!!hhhihHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!" + "'", str1, "Hhhi!hhi!iHhhi!hhi!ihi!hhi!!hhhihHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!");
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhi!hhi!iHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHIHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhih!hhhHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHIHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhih!hihhhHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHIHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!ih!hhhhhihHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHIHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!!h!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        char[] charArray10 = new char[] { '4', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("h", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("hhhih!hhhihhih!hhhi!hhi!ihhih!hi!hhi!!hhhhih!hi!hhi!ihihhih!!hhi!!ihhihhih!!hhi!ihi!hhhih!hi!!!hhi!hhhih!hi!ihi!hhihhih!!!ihhi!hhihhih!!ihi!hhi!!hhih!hhhi!hhi!i", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hI!" + "'", str12, "hI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "h" + "'", str14, "h");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!" + "'", str17, "hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "h" + "'", str18, "h");
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!" + "'", str2, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!");
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!hhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihI!" + "'", str1, "hhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!hhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihI!");
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        char[] charArray11 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("HHIH!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("hhi!ihi!!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("hhHI!HHI!IhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!", charArray11);
        java.lang.Class<?> wildcardClass17 = charArray11.getClass();
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhih!" + "'", str13, "Hhih!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "h" + "'", str14, "h");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhi!ihi!!" + "'", str15, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhHI!HHI!IhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!" + "'", str16, "hhHI!HHI!IhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        char[] charArray7 = new char[] { '4', '4' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hhHI!IHI!!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!HhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!IHI!!!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hi!" + "'", str8, "Hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!" + "'", str12, "HHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!");
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
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
        java.lang.String str29 = org.apache.commons.lang.WordUtils.capitalize("Hhhih!hhhiHhi!hhi!ihi!hhi!!", charArray18);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!", charArray18);
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
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Hhhih!hhhiHhi!hhi!ihi!hhi!!" + "'", str29, "Hhhih!hhhiHhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!" + "'", str30, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!");
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("", 1, (int) (byte) 1, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!" + "'", str1, "HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!");
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("", (int) (byte) 10, (int) '#', "hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHHIH!HHhhih!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        char[] charArray13 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("h", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHHHIH!HHHHIH!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("HHhi!ihi!!hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhhhhih!hhhhih!" + "'", str19, "Hhhhhih!hhhhih!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hHhi!ihi!!hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!" + "'", str20, "hHhi!ihi!!hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!");
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!I!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!I!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!I!HHI!IHI!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!I!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!I!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!I!HHI!IHI!" + "'", str2, "HHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!I!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!I!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!I!HHI!IHI!");
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        char[] charArray17 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray17);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray17);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray17);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray17);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("h", charArray17);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray17);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray17);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.initials("hI!", charArray17);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!IHI!!", charArray17);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!HHI!IHI!HHI!!", charArray17);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.initials("hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!", charArray17);
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Hhi!ihi!!" + "'", str26, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str27, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "h" + "'", str28, "h");
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi" + "'", str2, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi");
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str1, "hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!ihi!!!", (int) (byte) -1, "hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhHHHHIH!HHHHIH!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!ihi!!!" + "'", str4, "hHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!ihi!!!");
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhiHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!h!hhhih!hhhih!hhhih!ihhih!hhhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!h!hhhih!hhhih!hhhih!ihhih!hhhih!!" + "'", str1, "Hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!h!hhhih!hhhih!hhhih!ihhih!hhhih!!");
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!", 100, (int) (byte) 100, "HhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str4, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        char[] charArray8 = new char[] { '4', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("h", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("h", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hI!" + "'", str10, "hI!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHhih!hHhih!HHhih!HHhih!HHhih!IHhih!HHhih!!Hhih!HHhih!HHhih!hHhih!hHhih!iHhih!hHhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHhih!hHhih!HHhih!HHhih!HHhih!IHhih!HHhih!!Hhih!HHhih!HHhih!hHhih!hHhih!iHhih!hHhih!!" + "'", str1, "HHhih!hHhih!HHhih!HHhih!HHhih!IHhih!HHhih!!Hhih!HHhih!HHhih!hHhih!hHhih!iHhih!hHhih!!");
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhHHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!i!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhHHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!i!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!" + "'", str1, "hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhHHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!i!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!");
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIH!IhHIH!!hHIH!!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIH!IhHIH!!hHIH!!" + "'", str2, "HhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIH!IhHIH!!hHIH!!");
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!ihi!!!", 100, (int) (byte) 10, "HHHI!IHI!!hhHI!HHI!IhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIHHHI!IHI!!hhHI!HHI!IhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!" + "'", str4, "HHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIHHHI!IHI!!hhHI!HHI!IhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!");
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        char[] charArray13 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("HI!", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhih!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hi!" + "'", str16, "Hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhih!" + "'", str17, "Hhih!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str18, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I" + "'", str19, "hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!ihi!!!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!ihi!!!" + "'", str2, "hHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!ihi!!!");
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihh" + "'", str1, "hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihh");
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!", (int) 'a', "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!ihi!!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!" + "'", str4, "hHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!");
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str2, "Hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhHIH!HhHIH!hhHIH!hhHIH!hhHIH!ihHIH!hhHIH!!hHIH!hhHIH!hhHIH!HhHIH!HhHIH!IhHIH!HhHIH!!", 0, 0, "HHhih!hHhih!HHhih!HHhih!HHhih!IHhih!HHhih!!Hhih!HHhih!HHhih!hHhih!hHhih!iHhih!hHhih!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhih!hHhih!HHhih!HHhih!HHhih!IHhih!HHhih!!Hhih!HHhih!HHhih!hHhih!hHhih!iHhih!hHhih!!" + "'", str4, "HHhih!hHhih!HHhih!HHhih!HHhih!IHhih!HHhih!!Hhih!HHhih!HHhih!hHhih!hHhih!iHhih!hHhih!!");
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHHI!IHI!!Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHI!IHI!!Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str1, "hHHI!IHI!!Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhHHHHIH!HHHHIH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhhih!hhhhih!" + "'", str1, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhhih!hhhhih!");
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        char[] charArray11 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("HHI!HHI!IHI!HHI!!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHH", (int) (byte) 10, (int) (byte) 10, "hHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHHHIH!HHhHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!" + "'", str4, "HHHHHIH!HHhHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!");
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhh", (int) (byte) 10, "hHHI!HHI!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhh" + "'", str4, "hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhh");
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        char[] charArray9 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IhHHI!HHI!Ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!HI!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("HHi!hHi!iH", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IhHHI!HHI!Ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!HI!" + "'", str11, "HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IhHHI!HHI!Ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!HI!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hHi!hHi!iH" + "'", str12, "hHi!hHi!iH");
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhhhhih!hhhhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHHIH!HHhhih!hhih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhih!hhhhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHHIH!HHhhih!hhih!" + "'", str1, "Hhhhhih!hhhhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHHIH!HHhhih!hhih!");
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!" + "'", str1, "HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!");
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
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
        java.lang.String str32 = org.apache.commons.lang.WordUtils.uncapitalize("HhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHIHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!", charArray19);
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHIHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str32, "hhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHIHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!" + "'", str2, "Hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!");
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        char[] charArray7 = new char[] { '4', '4' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!IHI!!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hi!" + "'", str8, "Hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hI!" + "'", str10, "hI!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hhi!ihi!!" + "'", str11, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!" + "'", str12, "HHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!");
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        char[] charArray17 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray17);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray17);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray17);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray17);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("h", charArray17);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray17);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!", charArray17);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.initials("HHhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIH!IhHIH!!hHIH!!", charArray17);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalize("hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!", charArray17);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.initials("Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhhhHI!IHI!!hhHI!IHI!!ihHI!IHI!!hhHI!IHI!!!", charArray17);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.initials("hHhi!hhi!iHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!", charArray17);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hhih!" + "'", str23, "Hhih!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str24, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "H" + "'", str25, "H");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!" + "'", str26, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "H" + "'", str27, "H");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "h" + "'", str28, "h");
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhHI!IHI!!Hhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhHI!IHI!!Hhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhh" + "'", str1, "HhHI!IHI!!Hhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhh");
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHhhih!", (int) (short) -1, (int) (short) 10, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhi!hhi!iHhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!" + "'", str4, "Hhhi!hhi!iHhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!");
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!hhi!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!hhi!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!" + "'", str1, "hhhi!hhi!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!");
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        char[] charArray12 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("hhih!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("hHi!hHi!iHi!hHi!!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhih!" + "'", str16, "Hhih!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str17, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I" + "'", str18, "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I");
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!iihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!iihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!iihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!iihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!iihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!iihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i!" + "'", str1, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!iihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!iihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!iihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i!");
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        char[] charArray8 = new char[] { '4', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!HhI!IhI!HhI!!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hhi!hhi!ihi!hhi!!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("HhhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!HhI!IhI!HhI!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str10, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I" + "'", str12, "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hhhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!" + "'", str13, "hhhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str14, "Hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        char[] charArray11 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("HI!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihi!hhi!!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", charArray11);
        java.lang.Class<?> wildcardClass17 = charArray11.getClass();
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str16, "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str2, "Hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHhhih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhHHIH!" + "'", str1, "HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhHHIH!");
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhi!hhi!ihi!hhi!!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhi!hhi!ihi!hhi!!" + "'", str2, "hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I" + "'", str1, "hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I");
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        char[] charArray19 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray19);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray19);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray19);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray19);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalize("h", charArray19);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray19);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray19);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.initials("Hhih!", charArray19);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray19);
        java.lang.String str29 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i", charArray19);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.uncapitalize("hI!", charArray19);
        java.lang.String str31 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!", charArray19);
        java.lang.String str32 = org.apache.commons.lang.WordUtils.capitalizeFully("hhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHIHhhi!hhi!ihi!hhi!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!", charArray19);
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "HI!" + "'", str28, "HI!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i" + "'", str29, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hI!" + "'", str30, "hI!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str31, "Hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihhhi!hhi!ihi!hhi!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!" + "'", str32, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihhhi!hhi!ihi!hhi!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!");
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHHIH!HHHIhHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHIH!HHHIhHI!HHI!IHI!HHI!!" + "'", str1, "HHHIH!HHHIhHI!HHI!IHI!HHI!!");
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi", 0, (-1), "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi" + "'", str4, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi");
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalize("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhiHHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhiHHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!" + "'", str2, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhiHHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!");
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhih!", 100, "HhHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHH", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhih!" + "'", str4, "hhih!");
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        char[] charArray7 = new char[] { '4', '4' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hi!" + "'", str8, "Hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str12, "hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHhhhih!hhHHIH!", (int) (byte) 10, (int) 'a', "HHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhhhih!hhHHIH!" + "'", str4, "HHhhhih!hhHHIH!");
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhih!hhhihhih!hhhi!hhi!ihhih!hi!hhi!!hhhhih!hi!hhi!ihihhih!!hhi!!ihhihhih!!hhi!ihi!hhhih!hi!!!hhi!hhhih!hi!ihi!hhihhih!!!ihhi!hhihhih!!ihi!hhi!!hhih!hhhi!hhi!i", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhih!hhhihhih!hhhi!hhi!ihhih!hi!hhi!!hhhhih!hi!hhi!ihihhih!!hhi!!ihhihhih!!hhi!ihi!hhhih!hi!!!hhi!hhhih!hi!ihi!hhihhih!!!ihhi!hhihhih!!ihi!hhi!!hhih!hhhi!hhi!i" + "'", str2, "hhhih!hhhihhih!hhhi!hhi!ihhih!hi!hhi!!hhhhih!hi!hhi!ihihhih!!hhi!!ihhihhih!!hhi!ihi!hhhih!hi!!!hhi!hhhih!hi!ihi!hhihhih!!!ihhi!hhihhih!!ihi!hhi!!hhih!hhhi!hhi!i");
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalize("hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!" + "'", str2, "HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!");
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        char[] charArray9 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("HHIH!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hHHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!", charArray9);
        java.lang.Class<?> wildcardClass13 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hhih!" + "'", str11, "Hhih!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hhi!!" + "'", str12, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hhi!!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!!" + "'", str1, "HHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!!");
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str1, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        char[] charArray9 = new char[] { '4', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!", charArray9);
        java.lang.Class<?> wildcardClass17 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hI!" + "'", str12, "hI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhi!hhi!ihhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!", (-1), (int) (byte) 10, "hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhi!hhi!ihhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str4, "Hhi!hhi!ihhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str1, "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("", (int) (short) 10, (int) (short) 10, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!", (int) (byte) 0, (int) (short) 100, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str4, "hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhh", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhh" + "'", str2, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhh");
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhHHI!HHI!HhHI!HHI!IhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!" + "'", str1, "hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!");
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhHHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!i!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!", (int) (byte) 0, 10, "hhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!I!HhI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHhhhih!hhhhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!I!HhI!!" + "'", str4, "hHhhhih!hhhhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!I!HhI!!");
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        char[] charArray3 = new char[] { ' ', '#' };
        java.lang.String str4 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] { ' ', '#' });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!" + "'", str4, "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!");
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!h!ihhih!!hhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hih!ihhih!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhhih!ihhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!h!!hhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!h!ihhih!!hhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hih!ihhih!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhhih!ihhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!h!!hhih!!" + "'", str1, "Hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!h!ihhih!!hhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hih!ihhih!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhhih!ihhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!h!!hhih!!");
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        char[] charArray16 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray16);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("h", charArray16);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray16);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!", charArray16);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.uncapitalize("HHI!HHI!IHI!HHI!!", charArray16);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalize("HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!", charArray16);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.initials("HhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", charArray16);
        java.lang.Class<?> wildcardClass27 = charArray16.getClass();
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H" + "'", str21, "H");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str23, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hHI!HHI!IHI!HHI!!" + "'", str24, "hHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!" + "'", str25, "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H" + "'", str26, "H");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHI!HHI!IhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!" + "'", str1, "Hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!");
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHHHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!", (int) ' ', (-1), "hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhhhHI!IHI!!hhHI!IHI!!ihHI!IHI!!hhHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHHHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!" + "'", str4, "hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHHHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!");
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hi!", (int) 'a', (int) ' ', "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 97, length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhhhih!hhhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i", (int) '#', "hhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHIHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhhih!hhhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i" + "'", str4, "Hhhhhih!hhhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i");
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        char[] charArray11 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("HhI!HhI!IhI!HhI!!", charArray11);
        java.lang.Class<?> wildcardClass17 = charArray11.getClass();
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhI!HhI!IhI!HhI!!" + "'", str16, "hhI!HhI!IhI!HhI!!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!" + "'", str1, "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!");
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        char[] charArray10 = new char[] { '4', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!HhI!IhI!HhI!!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("HhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIH!IhHIH!!hHIH!!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("HHIH!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("hhHIH!HhHIH!hhHIH!hhHIH!hhHIH!ihHIH!hhHIH!!hHIH!hhHIH!hhHIH!HhHIH!HhHIH!IhHIH!HhHIH!!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhih!hhhihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("HHIH!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str12, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HI!" + "'", str13, "HI!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhih!" + "'", str15, "Hhih!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhHIH!HhHIH!hhHIH!hhHIH!hhHIH!ihHIH!hhHIH!!hHIH!hhHIH!hhHIH!HhHIH!HhHIH!IhHIH!HhHIH!!" + "'", str16, "hhHIH!HhHIH!hhHIH!hhHIH!hhHIH!ihHIH!hhHIH!!hHIH!hhHIH!hhHIH!HhHIH!HhHIH!IhHIH!HhHIH!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhhih!hhhihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i" + "'", str17, "Hhhih!hhhihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        char[] charArray16 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray16);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("h", charArray16);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray16);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray16);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.initials("HhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIH!IhHIH!!hHIH!!", charArray16);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalizeFully("hhih!", charArray16);
        java.lang.Class<?> wildcardClass27 = charArray16.getClass();
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Hhih!" + "'", str26, "Hhih!");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        char[] charArray17 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray17);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray17);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray17);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray17);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("h", charArray17);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray17);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray17);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray17);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.initials("HhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIH!IhHIH!!hHIH!!", charArray17);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.capitalizeFully("hhih!", charArray17);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.initials("HhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHHhHhhHI!IHI!!hhHI!IHI!!ihHI!IHI!!hhHI!IHI!!!I!IHI!!hhHI!IHI!!ihHI!IHI!!hhHI!IHI!!!", charArray17);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hhih!" + "'", str23, "Hhih!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H" + "'", str26, "H");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Hhih!" + "'", str27, "Hhih!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "H" + "'", str28, "H");
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!" + "'", str1, "hHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!");
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!!", (int) '#', (int) 'a', "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!" + "'", str4, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!");
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        char[] charArray8 = new char[] { '4', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!HhI!IhI!HhI!!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hhi!hhi!ihi!hhi!!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("HhhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hHHI!IHI!!Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str10, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I" + "'", str12, "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hhhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!" + "'", str13, "hhhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HHHI!IHI!!Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str14, "HHHI!IHI!!Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!", (-1), (int) (byte) 0, "hHHI!HHI!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHI!HHI!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!" + "'", str4, "hHHI!HHI!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!");
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhhhhih!hhhi!ihi!!", (int) ' ', "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhh", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhhhih!hhhi!ihi!!" + "'", str4, "Hhhhhhih!hhhi!ihi!!");
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        char[] charArray6 = new char[] { '4', '4' };
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Hi!" + "'", str7, "Hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!" + "'", str10, "hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!");
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!", 100, (int) (short) 0, "hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!" + "'", str4, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!");
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhHI!HHI!IHI!HHI!!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhHI!HHI!IHI!HHI!!" + "'", str2, "hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhHI!HHI!IHI!HHI!!");
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I", (int) '4', 100, "Hhhhhhih!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I" + "'", str4, "hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I");
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str1, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        char[] charArray5 = new char[] { '4', '4' };
        java.lang.String str6 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.initials("h", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hi!" + "'", str6, "Hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "h" + "'", str7, "h");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!" + "'", str8, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!");
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        char[] charArray10 = new char[] { '4', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("h", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("Hhi!ihi!!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("hI!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("", charArray10);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhih!hhhihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hhi!!", (int) '4', (int) (short) 0, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!ihi!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhih!hhhihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhi!hhi!ihHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!ihi!!!" + "'", str4, "Hhhih!hhhihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhi!hhi!ihHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!ihi!!!");
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhHhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhHhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str1, "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhHhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        char[] charArray7 = new char[] { '4', '4' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("HHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHHHIH!HHHHIH!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hi!" + "'", str8, "Hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hI!" + "'", str9, "hI!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!" + "'", str10, "hHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hhhhhih!hhhhih!" + "'", str11, "Hhhhhih!hhhhih!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHHhih!hHhih!HHhih!HHhih!HHhih!IHhih!HHhih!!Hhih!HHhih!HHhih!hHhih!hHhih!iHhih!hHhih!!", (-1), 0, "hhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihh");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihh" + "'", str4, "hhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihh");
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
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
        java.lang.String str31 = org.apache.commons.lang.WordUtils.capitalize("hhI!HhI!Ih", charArray20);
        java.lang.String str32 = org.apache.commons.lang.WordUtils.capitalize("Hhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!ihhih!!hHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hih!ihhih!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hhhih!ihhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!!hhih!!", charArray20);
        java.lang.String str33 = org.apache.commons.lang.WordUtils.initials("HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!", charArray20);
        java.lang.String str34 = org.apache.commons.lang.WordUtils.uncapitalize("HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhHHHIH!Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", charArray20);
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "HhI!HhI!Ih" + "'", str31, "HhI!HhI!Ih");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Hhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!ihhih!!hHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hih!ihhih!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hhhih!ihhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!!hhih!!" + "'", str32, "Hhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!ihhih!!hHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hih!ihhih!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hhhih!ihhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!!hhih!!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "H" + "'", str33, "H");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhHHHIH!Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str34, "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhHHHIH!Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("", 0, "HHHI!HHI!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhih!hhhihhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhih!hhhihhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!" + "'", str2, "Hhhih!hhhihhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!");
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
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
        java.lang.String str27 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!", charArray17);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.capitalizeFully("hHIH!", charArray17);
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str27, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Hhih!" + "'", str28, "Hhih!");
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hhi!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hhi!!" + "'", str2, "Hhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hhi!!");
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhih!hhhihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhi!hhi!ihHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!ihi!!!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhih!hhhihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhi!hhi!ihHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!ihi!!!" + "'", str2, "Hhhih!hhhihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhi!hhi!ihHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!ihi!!!");
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!", 0, (int) ' ', "HhHI!IHI!!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHhhhih!hhhhhih!hihhhih!hhhhhih!HhHI!IHI!!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str4, "hHhhhih!hhhhhih!hihhhih!hhhhhih!HhHI!IHI!!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!ihhih!!hHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hih!ihhih!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hhhih!ihhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!!hhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!h!ihhih!!hhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hih!ihhih!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhhih!ihhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!h!!hhih!!" + "'", str1, "Hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!h!ihhih!!hhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hih!ihhih!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhhih!ihhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!h!!hhih!!");
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!", 10, (int) 'a', "Hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihI!hhhi!hhi!ihi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihI!hhhi!hhi!ihi!" + "'", str4, "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihI!hhhi!hhi!ihi!");
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        char[] charArray13 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("HI!", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihi!hhi!!", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhHHIH!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhhhih!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str18, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!" + "'", str19, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hhhhhhih!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!" + "'", str20, "hhhhhhih!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!");
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!", (int) (byte) 10, 100, "Hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!" + "'", str4, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!");
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhHhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!", (int) (byte) 100, "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhHhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str4, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhHhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        char[] charArray6 = new char[] { '4', '4' };
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("h", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!ihhih!!hHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hih!ihhih!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hhhih!ihhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!!hhih!!", charArray6);
        java.lang.Class<?> wildcardClass11 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Hi!" + "'", str7, "Hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "h" + "'", str8, "h");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "h" + "'", str9, "h");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!ihhih!!hHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hih!ihhih!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hhhih!ihhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!!hhih!!" + "'", str10, "Hhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!ihhih!!hHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hih!ihhih!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hhhih!ihhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!!hhih!!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
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
        java.lang.String str27 = org.apache.commons.lang.WordUtils.capitalize("hHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!", charArray17);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHhih!hHhih!HHhih!HHhih!HHhih!IHhih!HHhih!!Hhih!HHhih!HHhih!hHhih!hHhih!iHhih!hHhih!!", charArray17);
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "HHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!" + "'", str27, "HHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Hhhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!" + "'", str28, "Hhhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!");
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!", 1, (int) (byte) 1, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!" + "'", str4, "HHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!");
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!", 0, (int) (byte) 10, "hHHHHIH!HHHHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHIH!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHhhi!hhi!hHHHHIH!HHHHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHIH!" + "'", str4, "hHhhi!hhi!hHHHHIH!HHHHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHIH!");
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!ihi!!!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!ihi!!!" + "'", str2, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!ihi!!!");
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        char[] charArray13 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("HI!", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("HHIH!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("HHHIH!HHHIHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!H!IHHIH!!HHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HIH!IHHIH!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHHIH!IHHIHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!H!!HHIH!!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("hhHHI!HHI!HhHI!HHI!IhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hi!" + "'", str16, "Hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhih!" + "'", str17, "Hhih!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str18, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HhHHI!HHI!HhHI!HHI!IhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!" + "'", str20, "HhHHI!HHI!HhHI!HHI!IhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!");
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHhHHHIH!HHHHHIH!HIHhhHHHIH!HHhhih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!IHI!!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!ihi!!!" + "'", str2, "Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!ihi!!!");
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhHHHIH!Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", (int) (byte) -1, 1, "hhHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!" + "'", str4, "hhhHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!");
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHhhhih!hhHHIH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHhhhih!hhHHIH!" + "'", str1, "HHhhhih!hhHHIH!");
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHi!hHi!iH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhI!HhI!Ih" + "'", str1, "HhI!HhI!Ih");
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHHI!IHI!!hhHI!HHI!IhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!", (int) '#', 100, "hHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHI!IHI!!hhHI!HHI!IhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!" + "'", str4, "HHHI!IHI!!hhHI!HHI!IhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!");
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!" + "'", str2, "hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!");
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        char[] charArray14 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("hHIH!", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("H", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihi!hhi!!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHHhHI!IHI!!hhHI!IHI!!ihHI!IHI!!hhHI!IHI!!!", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!ihi!!", charArray14);
        java.lang.Class<?> wildcardClass23 = charArray14.getClass();
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "h" + "'", str18, "h");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str20, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str21, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hhi!ihi!!" + "'", str22, "hhi!ihi!!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!", 10, "HHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHhi!ihi!!HHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!HHhi!ihi!!HHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!IHhi!ihi!!HHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!HHhi!ihi!!HHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!!" + "'", str4, "hHhi!ihi!!HHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!HHhi!ihi!!HHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!IHhi!ihi!!HHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!HHhi!ihi!!HHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!!");
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHHIH!HHHIhHI!HHI!IHI!HHI!!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHIH!HHHIhHI!HHI!IHI!HHI!!" + "'", str2, "HHHIH!HHHIhHI!HHI!IHI!HHI!!");
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhhhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHIHhhih!hhhihhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhhhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHIHhhih!hhhihhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!" + "'", str1, "hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhhhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHIHhhih!hhhihhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!");
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!" + "'", str1, "hhhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str1, "Hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhih!hhhiHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hHHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhih!hhhiHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hHHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!" + "'", str1, "hhhih!hhhiHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hHHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!");
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        char[] charArray11 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("HI!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhih!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!", charArray11);
        java.lang.Class<?> wildcardClass17 = charArray11.getClass();
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhih!" + "'", str15, "Hhih!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HhhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!" + "'", str1, "hHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!");
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!IHI!!!" + "'", str1, "HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!IHI!!!");
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhHI!IHI!!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!HhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!IHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhHI!IHI!!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!HhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!IHI!!!" + "'", str1, "hhHI!IHI!!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!HhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!IHI!!!");
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhhhhhih!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!", (int) (short) 100, "hHhhhih!hhhhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!I!HhI!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhhhhih!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!" + "'", str4, "hhhhhhih!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!");
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        char[] charArray18 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray18);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray18);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray18);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray18);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("h", charArray18);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray18);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.initials("hHI!IHI!!", charArray18);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhih!", charArray18);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!ihi!!", charArray18);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!", charArray18);
        java.lang.String str29 = org.apache.commons.lang.WordUtils.capitalize("hhHI!IHI!!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!", charArray18);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.initials("HHI!HHI!IHI!HHI!!", charArray18);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H" + "'", str23, "H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H" + "'", str24, "H");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "h" + "'", str25, "h");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Hhih!" + "'", str26, "Hhih!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Hhi!ihi!!" + "'", str27, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!" + "'", str28, "Hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "HhHI!IHI!!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str29, "HhHI!IHI!!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "H" + "'", str30, "H");
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhhih!hhhiHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hHHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhih!hhhiHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hHHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!" + "'", str1, "Hhhih!hhhiHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hHHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!");
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        char[] charArray12 = new char[] { '4', '4' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!IHI!!", charArray12);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!", charArray12);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihi!hhi!!", charArray12);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("HHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!", charArray12);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!", charArray12);
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!" + "'", str21, "HHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str22, "Hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        char[] charArray12 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("hHIH!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("H", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("hHhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIH!IhHIH!!hHIH!!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "h" + "'", str16, "h");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hHhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIH!IhHIH!!hHIH!!" + "'", str18, "hHhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIH!IhHIH!!hHIH!!");
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        char[] charArray8 = new char[] { '4', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("h", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray8);
        java.lang.Class<?> wildcardClass15 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hI!" + "'", str10, "hI!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "h" + "'", str12, "h");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihI!" + "'", str1, "hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihI!");
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        char[] charArray12 = new char[] { '4', '4' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("h", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray12);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", charArray12);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHhih!hHhih!HHhih!HHhih!HHhih!IHhih!HHhih!!Hhih!HHhih!HHhih!hHhih!hHhih!iHhih!hHhih!!", charArray12);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!ihi!!!", charArray12);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!", charArray12);
        java.lang.Class<?> wildcardClass23 = charArray12.getClass();
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hI!" + "'", str14, "hI!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "h" + "'", str15, "h");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "h" + "'", str16, "h");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!" + "'", str19, "hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!" + "'", str20, "Hhhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!ihi!!!" + "'", str21, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!ihi!!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str22, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!hi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!iHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!hi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!hi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!hi!hhi!ihi!hhi!!!", (int) (short) 10, "hHi!hHi!iHi!hHi!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!hi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!iHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!hi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!hi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!hi!hhi!ihi!hhi!!!" + "'", str4, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!hi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!iHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!hi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!hi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!hi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        char[] charArray9 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!I!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!I!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!I!HHI!IHI!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhi!hhi!ihi!hhi!!i!i", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhi!hhi!ihi!hhi!!i!i" + "'", str12, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhi!hhi!ihi!hhi!!i!i");
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIHHHHI!HHI!IHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!" + "'", str1, "hHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIHHHHI!HHI!IHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!");
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        char[] charArray11 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("HHI!HHI!IHI!HHI!!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("HHIH!", charArray11);
        java.lang.Class<?> wildcardClass17 = charArray11.getClass();
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhih!" + "'", str16, "Hhih!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhhhih!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhhih!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!" + "'", str1, "Hhhhhhih!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!");
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHi!hHi!iHi!hHi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHi!hHi!iHi!hHi!!" + "'", str1, "hHi!hHi!iHi!hHi!!");
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!" + "'", str2, "HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!");
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!", (int) (byte) 0, (int) (byte) 1, "hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!!" + "'", str4, "HhHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!!");
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        char[] charArray13 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("HI!", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("HHIH!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("HHIH!", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("Hhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!ihhih!!hHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hih!ihhih!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hhhih!ihhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!!hhih!!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!IHI!!!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hi!" + "'", str16, "Hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhih!" + "'", str17, "Hhih!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HHIH!" + "'", str18, "HHIH!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!ihhih!!hHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hih!ihhih!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hhhih!ihhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!!hhih!!" + "'", str19, "Hhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!ihhih!!hHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hih!ihhih!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hhhih!ihhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!!hhih!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!ihi!!!" + "'", str20, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!ihi!!!");
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
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
        java.lang.String str30 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHI!HHI!IhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!", charArray19);
        java.lang.String str31 = org.apache.commons.lang.WordUtils.capitalize("hHI!HHI!IH", charArray19);
        java.lang.String str32 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihI!hhhi!hhi!ihi!", charArray19);
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str30, "Hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "HHI!HHI!IH" + "'", str31, "HHI!HHI!IH");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihI!hhhi!hhi!ihi!" + "'", str32, "Hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihI!hhhi!hhi!ihi!");
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!hhi!iHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHIHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhih!hhhHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHIHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhih!hihhhHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHIHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!ih!hhhhhihHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHIHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!!h!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!hhi!iHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHIHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhih!hhhHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHIHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhih!hihhhHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHIHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!ih!hhhhhihHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHIHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!!h!" + "'", str1, "hhhi!hhi!iHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHIHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhih!hhhHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHIHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhih!hihhhHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHIHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!ih!hhhhhihHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHIHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!!h!");
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhi!hhi!ihi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHI!IHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHHI!HHI!IHI!" + "'", str1, "hHHI!IHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHHI!HHI!IHI!");
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHi!hHi!iH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHi!hHi!iH" + "'", str1, "HHi!hHi!iH");
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!", 100, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhi!hhi!ihi!hhi!!i!i", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str4, "hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHHIH!HHHIHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!H!IHHIH!!HHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HIH!IHHIH!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHHIH!IHHIHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!H!!HHIH!!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHIH!HHHIHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!H!IHHIH!!HHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HIH!IHHIH!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHHIH!IHHIHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!H!!HHIH!!" + "'", str2, "hHHIH!HHHIHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!H!IHHIH!!HHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HIH!IHHIH!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHHIH!IHHIHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!H!!HHIH!!");
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!" + "'", str2, "hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!");
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str2, "Hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!" + "'", str2, "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!");
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!IHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!IHI!!!" + "'", str1, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!IHI!!!");
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHHHIH!", (int) (short) 100, "hi!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHhi!HHIH!" + "'", str4, "hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHhi!HHIH!");
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhHHHIH!Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhhhih!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!hhih!", (int) '4', (int) (short) 1, "hHHI!IHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHHI!HHI!IHI!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhhih!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhHHI!IHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHHI!HHI!IHI!" + "'", str4, "Hhhhhih!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhHHI!IHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHHI!HHI!IHI!");
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        char[] charArray13 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("hhih!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhih!" + "'", str17, "Hhih!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!" + "'", str18, "hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i" + "'", str19, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!", (int) 'a', "HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!i!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!" + "'", str4, "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!i!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
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
        java.lang.String str30 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray20);
        java.lang.String str31 = org.apache.commons.lang.WordUtils.capitalize("hhi!ihi!!", charArray20);
        java.lang.String str32 = org.apache.commons.lang.WordUtils.capitalizeFully("hhi!hhi!ihi!hhi!!", charArray20);
        java.lang.String str33 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray20);
        java.lang.String str34 = org.apache.commons.lang.WordUtils.uncapitalize("HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!", charArray20);
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Hhi!ihi!!" + "'", str31, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str32, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!" + "'", str34, "hHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!");
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhih!hhhihhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhih!hhhihhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!" + "'", str1, "hhhih!hhhihhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!");
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        char[] charArray11 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("HI!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihi!hhi!!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhi!hhi!ihi!hhi!!i!i", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhi!hhi!ihi!hhi!!i!i" + "'", str16, "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhi!hhi!ihi!hhi!!i!i");
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhHhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str1, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("", (int) (byte) -1, "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I" + "'", str2, "hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I");
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!hhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihI!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!hhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihI!" + "'", str2, "hhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!hhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihI!");
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHhhhhih!hHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHHHIH!HHHHIH!", 100, 100, "hhhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 100, length 57");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        char[] charArray6 = new char[] { '4', '4' };
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Hi!" + "'", str7, "Hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H" + "'", str8, "H");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str10, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        char[] charArray8 = new char[] { '4', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!ihi!!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I" + "'", str12, "HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!ihi!!!" + "'", str14, "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!ihi!!!");
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        char[] charArray12 = new char[] { '4', '4' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!HhI!IhI!HhI!!", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("hHi!hHi!iHi!hHi!!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ih", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I", charArray12);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("hHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!", charArray12);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!ihi!!!", charArray12);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!", charArray12);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!HhHIH!HhHIH!hhHIH!hhHIH!hhHIH!ihHIH!hhHIH!!hHIH!hhHIH!hhHIH!HhHIH!HhHIH!IhHIH!HhHIH!!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str14, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "h" + "'", str15, "h");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhi!hhi!ih" + "'", str16, "hhi!hhi!ih");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I" + "'", str18, "HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "h" + "'", str19, "h");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!ihi!!!" + "'", str20, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!ihi!!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str21, "hhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!" + "'", str22, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!");
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str1, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!", 100, "Hhhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!" + "'", str4, "Hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!");
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!" + "'", str2, "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!");
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("", 100, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!IHI!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
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
        java.lang.String str30 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHI!HHI!IhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!", charArray19);
        java.lang.String str31 = org.apache.commons.lang.WordUtils.capitalize("hHI!HHI!IH", charArray19);
        java.lang.String str32 = org.apache.commons.lang.WordUtils.initials("Hhhi!hhi!iHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!", charArray19);
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str30, "Hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "HHI!HHI!IH" + "'", str31, "HHI!HHI!IH");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "H" + "'", str32, "H");
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!", (int) (byte) 100, "", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!" + "'", str4, "hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!");
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHI!HHI!IHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHI!HHI!IHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!" + "'", str1, "HHI!HHI!IHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!");
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!", (int) (byte) 100, "hHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!I!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!" + "'", str4, "hHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!I!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!");
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IhHHI!HHI!Ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!HI!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IhHHI!HHI!Ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!HI!" + "'", str2, "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IhHHI!HHI!Ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!HI!");
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        char[] charArray7 = new char[] { '4', '4' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("hHhhhih!hhHHIH!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("Hhhhhih!hhhhih!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("hhhih!hhhiHhi!hhi!ihi!hhi!!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hi!" + "'", str8, "Hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "h" + "'", str10, "h");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hhhih!hhhiHhi!hhi!ihi!hhi!!" + "'", str12, "hhhih!hhhiHhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str1, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhhih!hhhihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhih!hhhihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i" + "'", str1, "hhhih!hhhihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i");
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str1, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
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
        java.lang.String str36 = org.apache.commons.lang.WordUtils.capitalize("HhHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!", charArray21);
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
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "HhHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!" + "'", str36, "HhHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!");
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!" + "'", str1, "HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!");
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HhHHI!HHI!HhHI!HHI!IhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhHHI!HHI!HhHI!HHI!IhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!" + "'", str1, "hhHHI!HHI!HhHI!HHI!IhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!");
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        char[] charArray15 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray15);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray15);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray15);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray15);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!", charArray15);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!", charArray15);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!!", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hi!" + "'", str18, "Hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hI!" + "'", str21, "hI!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!" + "'", str22, "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!" + "'", str23, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!" + "'", str24, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!");
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hI!", (int) (short) 1, "HHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!ihi!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hI!" + "'", str4, "hI!");
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhi!hhi!ihhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhi!hhi!ihhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!" + "'", str2, "Hhi!hhi!ihhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!");
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!hi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!iHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!hi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!hi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!hi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!hi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!iHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!hi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!hi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!hi!hhi!ihi!hhi!!!" + "'", str1, "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!hi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!iHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!hi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!hi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!hi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!" + "'", str1, "hhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!");
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!" + "'", str1, "Hhhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHhi!hhi!iHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!", (int) (short) 100, (int) '#', "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!i!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 100, length 45");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHHHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!IHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!!HHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!IHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!!HHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!IHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!IHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!!HHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!IHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!!HHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!!" + "'", str1, "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHHHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!IHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!!HHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!IHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!!HHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!IHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!IHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!!HHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!IHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!!HHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!!");
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIHHHI!IHI!!hhHI!HHI!IhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhihhhi!ihi!!hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!" + "'", str1, "Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhihhhi!ihi!!hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!");
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
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
        java.lang.String str28 = org.apache.commons.lang.WordUtils.initials("hhhih!hhhihhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", charArray17);
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "h" + "'", str28, "h");
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhh", (int) 'a', "HHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!ihi!!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhHHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!ihi!!!hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhh" + "'", str4, "Hhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhHHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!ihi!!!hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhh");
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhhhih!hhHHIH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhih!hhhhih!" + "'", str1, "Hhhhhih!hhhhih!");
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        char[] charArray7 = new char[] { '4', '4' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!HhI!IhI!HhI!!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhh", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("HHI!HHI!IHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hi!" + "'", str8, "Hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str9, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhh" + "'", str11, "HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhh");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHHIH!HHhhih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!" + "'", str1, "hHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!");
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        char[] charArray10 = new char[] { '4', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!HhI!IhI!HhI!!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hHi!hHi!iHi!hHi!!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ih", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("hHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str12, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hhi!hhi!ih" + "'", str14, "hhi!hhi!ih");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I" + "'", str16, "HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "h" + "'", str17, "h");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhHHI!HHI!HhHI!HHI!IhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHhhi!hhi!hHhi!hhi!iHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!" + "'", str1, "HHhhi!hhi!hHhi!hhi!iHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!");
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHHHIH!HHHHIH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!" + "'", str1, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!");
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        char[] charArray13 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!", charArray13);
        java.lang.Class<?> wildcardClass21 = charArray13.getClass();
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hi!" + "'", str16, "Hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hI!" + "'", str19, "hI!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!" + "'", str20, "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhih!hhhihhih!hhhi!hhi!ihhih!hi!hhi!!hhhhih!hi!hhi!ihihhih!!hhi!!ihhihhih!!hhi!ihi!hhhih!hi!!!hhi!hhhih!hi!ihi!hhihhih!!!ihhi!hhihhih!!ihi!hhi!!hhih!hhhi!hhi!i", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhih!hhhihhih!hhhi!hhi!ihhih!hi!hhi!!hhhhih!hi!hhi!ihihhih!!hhi!!ihhihhih!!hhi!ihi!hhhih!hi!!!hhi!hhhih!hi!ihi!hhihhih!!!ihhi!hhihhih!!ihi!hhi!!hhih!hhhi!hhi!i" + "'", str2, "Hhhih!hhhihhih!hhhi!hhi!ihhih!hi!hhi!!hhhhih!hi!hhi!ihihhih!!hhi!!ihhihhih!!hhi!ihi!hhhih!hi!!!hhi!hhhih!hi!ihi!hhihhih!!!ihhi!hhihhih!!ihi!hhi!!hhih!hhhi!hhi!i");
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhi!ihi!!", (int) '4', "hHhhhih!hhhhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!I!HhI!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhi!ihi!!" + "'", str4, "Hhi!ihi!!");
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        char[] charArray5 = new char[] { '4', '4' };
        java.lang.String str6 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!HHI!IH", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hi!" + "'", str6, "Hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hI!" + "'", str7, "hI!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hhi!hhi!ih" + "'", str8, "Hhi!hhi!ih");
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IIhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I!hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IIhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IIhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I!hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IIhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I!hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IIhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IIhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I!hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I!" + "'", str1, "hhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IIhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I!hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IIhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IIhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I!hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I!");
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhih!hhhihhih!hhhi!hhi!ihhih!hi!hhi!!hhhhih!hi!hhi!ihihhih!!hhi!!ihhihhih!!hhi!ihi!hhhih!hi!!!hhi!hhhih!hi!ihi!hhihhih!!!ihhi!hhihhih!!ihi!hhi!!hhih!hhhi!hhi!i", (-1), (int) (short) 100, "hHhi!hhi!iHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhih!hhhihhih!hhhi!hhi!ihhih!hi!hhi!!hhhhih!hi!hhi!ihihhih!!hhi!!ihhihhih!!hhi!ihi!hhhih!hi!!!hhi!hhHhi!hhi!iHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!" + "'", str4, "hhhih!hhhihhih!hhhi!hhi!ihhih!hi!hhi!!hhhhih!hi!hhi!ihihhih!!hhi!!ihhihhih!!hhi!ihi!hhhih!hi!!!hhi!hhHhi!hhi!iHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!");
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!hi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!iHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!hi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!hi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!hi!hhi!ihi!hhi!!!", (int) 'a', "hhhih!hhhihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!hi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!iHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!hi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!hi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!hi!hhi!ihi!hhi!!!" + "'", str4, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!hi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!iHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!hi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!hi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!hi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I" + "'", str1, "hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I");
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HhhHHHIH!Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!HHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHHHIH!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHHHIH!" + "'", str2, "hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHHHIH!");
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        char[] charArray8 = new char[] { '4', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("Hhhhih!hhhhhih!hihhhih!hhhhhih!h!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hI!" + "'", str11, "hI!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhhhih!hhhhhih!hihhhih!hhhhhih!h!" + "'", str13, "Hhhhih!hhhhhih!hihhhih!hhhhhih!h!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "h" + "'", str14, "h");
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        char[] charArray10 = new char[] { '4', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!HhI!IhI!HhI!!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("HhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIH!IhHIH!!hHIH!!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("HHIH!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("hhHIH!HhHIH!hhHIH!hhHIH!hhHIH!ihHIH!hhHIH!!hHIH!hhHIH!hhHIH!HhHIH!HhHIH!IhHIH!HhHIH!!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhih!hhhihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("hHHIH!HHHIhhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHH", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str12, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HI!" + "'", str13, "HI!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhih!" + "'", str15, "Hhih!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhHIH!HhHIH!hhHIH!hhHIH!hhHIH!ihHIH!hhHIH!!hHIH!hhHIH!hhHIH!HhHIH!HhHIH!IhHIH!HhHIH!!" + "'", str16, "hhHIH!HhHIH!hhHIH!hhHIH!hhHIH!ihHIH!hhHIH!!hHIH!hhHIH!hhHIH!HhHIH!HhHIH!IhHIH!HhHIH!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhhih!hhhihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i" + "'", str17, "Hhhih!hhhihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HHHIH!HHHIhhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHH" + "'", str18, "HHHIH!HHHIhhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHH");
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!ihi!!!", (-1), (int) (short) 1, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "h" + "'", str4, "h");
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhi!hhi!ihi!hhi!!" + "'", str1, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHHHHIH!HHHHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHIH!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHHIH!HHHHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHIH!" + "'", str2, "HHHHHIH!HHHHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHIH!");
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
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
        java.lang.String str29 = org.apache.commons.lang.WordUtils.capitalize("HHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!", charArray18);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.initials("hhHhhhih!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!", charArray18);
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
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "HHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!" + "'", str29, "HHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "h" + "'", str30, "h");
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHhHHHIH!HHHHHIH!HIHhhHHHIH!HHhhih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!hhi!iHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhi!iHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str1, "Hhhi!hhi!iHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        char[] charArray6 = new char[] { '4', '4' };
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("hhHI!IHI!!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!HhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!IHI!!!", charArray6);
        java.lang.Class<?> wildcardClass11 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Hi!" + "'", str7, "Hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H" + "'", str8, "H");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "h" + "'", str10, "h");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        char[] charArray9 = new char[] { '#', '4', '4', '4', '4', '#' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihi!hhi!!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', '4', '4', '4', '4', '#' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str10, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihhhi!hhi!ihi!hhi!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihhhi!hhi!ihi!hhi!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!" + "'", str1, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihhhi!hhi!ihi!hhi!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!");
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("H", 0, 1, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H" + "'", str4, "H");
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!hHHI!IHI!!Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!hHHI!IHI!!Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str1, "HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!hHHI!IHI!!Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhh", (int) (short) -1, 10, "HHHHIH!HHHhHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhhhih!hhHHHHIH!HHHhHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!" + "'", str4, "HHhhhih!hhHHHHIH!HHHhHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!");
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!", 100, "HHHHIH!HHHhHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!" + "'", str4, "hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!");
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!", (int) ' ', "Hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hHhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!iHhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hHhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!Hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!Hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!Hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!HHI!IHi!" + "'", str4, "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hHhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!iHhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hHhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!Hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!Hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!Hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!HHI!IHi!");
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhhi!hhi!iHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHIHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhih!hhhHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHIHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhih!hihhhHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHIHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!ih!hhhhhihHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHIHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!!h!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        char[] charArray17 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray17);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray17);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray17);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray17);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("h", charArray17);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray17);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray17);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.initials("Hhi!ihi!!", charArray17);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray17);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.capitalize("HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!", charArray17);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray17);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hhih!" + "'", str23, "Hhih!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H" + "'", str24, "H");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "H" + "'", str25, "H");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HI!" + "'", str26, "HI!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!" + "'", str27, "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "H" + "'", str28, "H");
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        char[] charArray17 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray17);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray17);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray17);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray17);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("h", charArray17);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray17);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.initials("hhI!HhI!IhI!HhI!!", charArray17);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalize("hhI!HhI!IhI!HhI!!", charArray17);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalize("hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I", charArray17);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.uncapitalize("hHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", charArray17);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.capitalize("HhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!I!HhI!!", charArray17);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H" + "'", str23, "H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "h" + "'", str24, "h");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "HhI!HhI!IhI!HhI!!" + "'", str25, "HhI!HhI!IhI!HhI!!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I" + "'", str26, "HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!" + "'", str27, "hHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "HhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!I!HhI!!" + "'", str28, "HhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!I!HhI!!");
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhHhhhhih!hhhhHHHIH!HHHHHIH!HIHHHIhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!H!HHHHHIH!HhHHHIH!HHhhih!hhih!i!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hHhhhhih!hhhhHHHIH!HHHHHIH!HIHHHIhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!H!HHHHHIH!HhHHHIH!HHhhih!hhih!hi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhiHhhhhih!hhhhHHHIH!HHHHHIH!HIHHHIhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!H!HHHHHIH!HhHHHIH!HHhhih!hhih!!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHhHHHHIH!HHHHhhhih!hhhhhih!hihhhiHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!h!hhhhhih!hHhhhih!hhHHIH!HHIH!I!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HhHHHHIH!HHHHhhhih!hhhhhih!hihhhiHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!h!hhhhhih!hHhhhih!hhHHIH!HHIH!HI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHIhHHHHIH!HHHHhhhih!hhhhhih!hihhhiHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!h!hhhhhih!hHhhhih!hhHHIH!HHIH!!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!" + "'", str1, "hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHhHHHHIH!HHHHhhhih!hhhhhih!hihhhiHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!h!hhhhhih!hHhhhih!hhHHIH!HHIH!I!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HhHHHHIH!HHHHhhhih!hhhhhih!hihhhiHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!h!hhhhhih!hHhhhih!hhHHIH!HHIH!HI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHIhHHHHIH!HHHHhhhih!hhhhhih!hihhhiHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!h!hhhhhih!hHhhhih!hhHHIH!HHIH!!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!");
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHIHhhi!hhi!ihi!hhi!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!" + "'", str1, "hhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHIHhhi!hhi!ihi!hhi!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!");
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHHHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhhhHI!IHI!!hhHI!IHI!!ihHI!IHI!!hhHI!IHI!!!" + "'", str1, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhhhHI!IHI!!hhHI!IHI!!ihHI!IHI!!hhHI!IHI!!!");
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHIH!HHHIhHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhih!hhhihhi!hhi!ihi!hhi!!" + "'", str1, "Hhhih!hhhihhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhHHIH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhHHIH!" + "'", str1, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhHHIH!");
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", 100, (-1), "HhHhhhih!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!I!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!I!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!I!HHI!IHI!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str4, "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HhhHHHIH!Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhHHHIH!Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str1, "hhhHHHIH!Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIH!IhHIH!!hHIH!!", (int) (short) 10, "HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIH!IhHIH!!hHIH!!" + "'", str4, "HHhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIH!IhHIH!!hHIH!!");
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
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
        java.lang.String str30 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihi!!HHhi!hhi!iHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!", charArray18);
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hhhi!ihi!!HHhi!hhi!iHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!" + "'", str30, "hhhi!ihi!!HHhi!hhi!iHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhHHHHIH!HHHHIH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhHHHHIH!HHHHIH!" + "'", str1, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhHHHHIH!HHHHIH!");
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str1, "hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihI!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihI!" + "'", str2, "HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihI!");
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!", (int) (byte) -1, "hhhhhhih!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!" + "'", str4, "hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!");
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!" + "'", str2, "Hi!");
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHHhHI!IHI!!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihhHhi!ihi!!hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!" + "'", str1, "HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihhHhi!ihi!!hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!");
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHIHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str1, "HhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHIHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhhHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhhHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!" + "'", str1, "HhhHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!");
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!hHhih!hHhih!iHhih!!Hhih!iHhih!hHhihhhhi!hhi!iHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!hHhih!hHhih!iHhih!!Hhih!iHhih!hHhihhhhi!hhi!iHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str1, "Hhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!hHhih!hHhih!iHhih!!Hhih!iHhih!hHhihhhhi!hhi!iHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHIHhhi!hhi!ihi!hhi!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!!" + "'", str1, "hHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!!");
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhih!hhhiHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hHHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHIH!HHHIhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HhhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!I!HhI!!" + "'", str1, "hHHIH!HHHIhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HhhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!I!HhI!!");
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!" + "'", str1, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!");
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
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
        java.lang.String str27 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!", charArray17);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.capitalize("hHhhi!hhi!hHHHHIH!HHHHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHIH!", charArray17);
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str27, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "HHhhi!hhi!hHHHHIH!HHHHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHIH!" + "'", str28, "HHhhi!hhi!hHHHHIH!HHHHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHIH!");
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHH", (int) (short) 1, 100, "HhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHHhHhhHI!IHI!!hhHI!IHI!!ihHI!IHI!!hhHI!IHI!!!I!IHI!!hhHI!IHI!!ihHI!IHI!!hhHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHH" + "'", str4, "hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHH");
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
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
        java.lang.String str29 = org.apache.commons.lang.WordUtils.initials("Hhhhhih!hhhhih!", charArray18);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.capitalizeFully("hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", charArray18);
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
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "H" + "'", str29, "H");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str30, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        char[] charArray8 = new char[] { '4', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!HhI!IhI!HhI!!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hHi!hHi!iHi!hHi!!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("hhHHHIH!HHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHHIH!HIHHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HIH!HHHHHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!H!H!hhHHHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!H!HHHHHIH!hHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HIHHHIH!HHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHHIH!H!ihhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHHIH!HHHHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HIH!HIHHHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!H!HHHHHHhHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!I!IHI!!hhHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!I!IHI!!ihHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!I!IHI!!hhHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!I!IHI!!!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("HhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHIHhhi!hhi!ihi!hhi!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str10, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hhHHHIH!HHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHHIH!HIHHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HIH!HHHHHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!H!H!hhHHHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!H!HHHHHIH!hHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HIHHHIH!HHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHHIH!H!ihhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHHIH!HHHHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HIH!HIHHHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!H!HHHHHHhHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!I!IHI!!hhHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!I!IHI!!ihHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!I!IHI!!hhHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!I!IHI!!!" + "'", str12, "hhHHHIH!HHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHHIH!HIHHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HIH!HHHHHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!H!H!hhHHHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!H!HHHHHIH!hHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HIHHHIH!HHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHHIH!H!ihhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHHIH!HHHHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HIH!HIHHHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!H!HHHHHHhHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!I!IHI!!hhHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!I!IHI!!ihHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!I!IHI!!hhHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!I!IHI!!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!" + "'", str13, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        char[] charArray9 = new char[] { '4', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("h", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("Hhi!ihi!!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("hI!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("Hhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!", charArray9);
        java.lang.Class<?> wildcardClass17 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hI!" + "'", str11, "hI!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "h" + "'", str12, "h");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "h" + "'", str15, "h");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str16, "Hhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I", (int) (short) 10, "HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHH", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I" + "'", str4, "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I");
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("", (int) 'a', (int) (short) -1, "HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHHHIH!HHHHIH!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhHI!HHI!IHI!HHI!!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhHI!HHI!IHI!HHI!!" + "'", str2, "hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhHI!HHI!IHI!HHI!!");
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!hHhih!hHhih!iHhih!!Hhih!iHhih!hHhihhhhi!hhi!iHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!", (-1), (int) (short) -1, "hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!" + "'", str4, "Hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!");
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhh", (int) 'a', (int) (short) 100, "hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhh" + "'", str4, "hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhh");
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        char[] charArray11 = new char[] { '4', '4' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("h", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("h", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("HHIH!", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("HHIH!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!HhI!IhI!HhI!!", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!", charArray11);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhih!hhhihhih!hhhi!hhi!ihhih!hi!hhi!!hhhhih!hi!hhi!ihihhih!!hhi!!ihhihhih!!hhi!ihi!hhhih!hi!!!hhi!hhHhi!hhi!iHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hI!" + "'", str13, "hI!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "h" + "'", str14, "h");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhih!" + "'", str16, "Hhih!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hHIH!" + "'", str17, "hHIH!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str18, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str19, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhih!hhhihhih!hhhi!hhi!ihhih!hi!hhi!!hhhhih!hi!hhi!ihihhih!!hhi!!ihhihhih!!hhi!ihi!hhhih!hi!!!hhi!hhhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!" + "'", str20, "Hhhih!hhhihhih!hhhi!hhi!ihhih!hi!hhi!!hhhhih!hi!hhi!ihihhih!!hhi!!ihhihhih!!hhi!ihi!hhhih!hi!!!hhi!hhhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!");
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        char[] charArray9 = new char[] { '#', '4', '4', '4', '4', '#' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihi!hhi!!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("hHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIHHHHI!HHI!IHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', '4', '4', '4', '4', '#' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str10, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIHHHHI!HHI!IHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!" + "'", str12, "hHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIHHHHI!HHI!IHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!");
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i" + "'", str2, "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i");
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        char[] charArray8 = new char[] { '4', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!HhI!IhI!HhI!!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hHi!hHi!iHi!hHi!!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ih", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str10, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hhi!hhi!ih" + "'", str12, "hhi!hhi!ih");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!" + "'", str14, "Hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!");
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhih!hhhihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhih!hhhihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i" + "'", str1, "hhhih!hhhihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i");
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!" + "'", str2, "hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!");
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhHhih!hHhih!iHhih!!Hhih!iHhih!hHhihhhhi!hhi!iHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        char[] charArray12 = new char[] { '4', '4' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!IHI!!", charArray12);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!", charArray12);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("Hhhhhih!hhhhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHHIH!HHhhih!hhih!", charArray12);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("hhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hI!" + "'", str15, "hI!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hi!" + "'", str16, "Hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhi!ihi!!" + "'", str18, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str19, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hhhhhih!hhhhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHHIH!HHhhih!hhih!" + "'", str21, "Hhhhhih!hhhhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHHIH!HHhhih!hhih!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i" + "'", str22, "hhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i");
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        char[] charArray18 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray18);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray18);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray18);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray18);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("h", charArray18);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray18);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray18);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray18);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.initials("HhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIH!IhHIH!!hHIH!!", charArray18);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.capitalizeFully("hhih!", charArray18);
        java.lang.String str29 = org.apache.commons.lang.WordUtils.capitalize("", charArray18);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.uncapitalize("HHHHIH!HHHhHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!", charArray18);
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "H" + "'", str27, "H");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Hhih!" + "'", str28, "Hhih!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hHHHIH!HHHhHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!" + "'", str30, "hHHHIH!HHHhHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!");
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i" + "'", str1, "hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i");
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!IHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!IHI!!!" + "'", str1, "HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!IHI!!!");
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        char[] charArray18 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray18);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray18);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray18);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray18);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("h", charArray18);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray18);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!", charArray18);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.uncapitalize("HHI!HHI!IHI!HHI!!", charArray18);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.initials("hHIH!", charArray18);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.initials("", charArray18);
        java.lang.String str29 = org.apache.commons.lang.WordUtils.uncapitalize("hHhih!hHhih!iHhih!!Hhih!iHhih!hHhihhhhi!hhi!iHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!", charArray18);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.initials("hhhhhhih!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!", charArray18);
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "h" + "'", str27, "h");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hHhih!hHhih!iHhih!!Hhih!iHhih!hHhihhhhi!hhi!iHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str29, "hHhih!hHhih!iHhih!!Hhih!iHhih!hHhihhhhi!hhi!iHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "h" + "'", str30, "h");
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HhHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!!" + "'", str1, "hhHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!!");
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!", (int) 'a', "hhhih!hhhiHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hHHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str4, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
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
        java.lang.String str28 = org.apache.commons.lang.WordUtils.initials("HhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIH!IhHIH!!hHIH!!", charArray18);
        java.lang.String str29 = org.apache.commons.lang.WordUtils.uncapitalize("hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", charArray18);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.capitalize("Hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!", charArray18);
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "H" + "'", str28, "H");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str29, "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str30, "Hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhhih!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!hhih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhhih!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!hhih!" + "'", str1, "hhhhhih!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!hhih!");
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!!" + "'", str2, "HHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!!");
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        char[] charArray11 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("h", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!hhi!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "h" + "'", str14, "h");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "h" + "'", str15, "h");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhhi!hhi!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!" + "'", str16, "hhhi!hhi!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!");
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhHHHIH!HHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHHIH!HIHHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HIH!HHHHHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!H!H!hhHHHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!H!HHHHHIH!hHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HIHHHIH!HHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHHIH!H!ihhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHHIH!HHHHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HIH!HIHHHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!H!HHHHHHhHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!I!IHI!!hhHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!I!IHI!!ihHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!I!IHI!!hhHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!I!IHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhHHHIH!HHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHHIH!HIHHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HIH!HHHHHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!H!H!hhHHHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!H!HHHHHIH!hHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HIHHHIH!HHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHHIH!H!ihhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHHIH!HHHHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HIH!HIHHHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!H!HHHHHHhHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!I!IHI!!hhHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!I!IHI!!ihHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!I!IHI!!hhHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!I!IHI!!!" + "'", str1, "hhHHHIH!HHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHHIH!HIHHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HIH!HHHHHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!H!H!hhHHHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!H!HHHHHIH!hHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HIHHHIH!HHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHHIH!H!ihhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHHIH!HHHHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HIH!HIHHHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!H!HHHHHHhHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!I!IHI!!hhHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!I!IHI!!ihHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!I!IHI!!hhHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!I!IHI!!!");
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        char[] charArray18 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray18);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray18);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray18);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray18);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("h", charArray18);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray18);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.initials("hhI!HhI!IhI!HhI!!", charArray18);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!HhI!IhI!HhI!!", charArray18);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.initials("hhih!", charArray18);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.capitalize("HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!", charArray18);
        java.lang.String str29 = org.apache.commons.lang.WordUtils.initials("hhhhhih!hhhhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHHIH!HHhhih!hhih!", charArray18);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.capitalizeFully("hI!", charArray18);
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!" + "'", str28, "HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "h" + "'", str29, "h");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Hi!" + "'", str30, "Hi!");
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!", 100, "Hhhi!hhi!iHhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHhhi!hhi!iHhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!HI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!" + "'", str4, "hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHhhi!hhi!iHhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!HI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!");
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hi!" + "'", str1, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hi!");
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhHHHIH!HHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHHIH!HIHHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HIH!HHHHHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!H!H!hhHHHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!H!HHHHHIH!hHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HIHHHIH!HHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHHIH!H!ihhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHHIH!HHHHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HIH!HIHHHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!H!HHHHHHhHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!I!IHI!!hhHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!I!IHI!!ihHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!I!IHI!!hhHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!I!IHI!!!", (int) (byte) -1, "hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhHHHIH!HHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHHIH!HIHHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HIH!HHHHHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!H!H!hhHHHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!H!HHHHHIH!hHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HIHHHIH!HHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHHIH!H!ihhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHHIH!HHHHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HIH!HIHHHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!H!HHHHHHhHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!I!IHI!!hhHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!I!IHI!!ihHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!I!IHI!!hhHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!I!IHI!!!" + "'", str4, "hhHHHIH!HHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHHIH!HIHHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HIH!HHHHHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!H!H!hhHHHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!H!HHHHHIH!hHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HIHHHIH!HHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHHIH!H!ihhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHHIH!HHHHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HIH!HIHHHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!H!HHHHHHhHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!I!IHI!!hhHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!I!IHI!!ihHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!I!IHI!!hhHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!I!IHI!!!");
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
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
        java.lang.String str29 = org.apache.commons.lang.WordUtils.capitalize("Hhhhih!hhhhhih!hihhhih!hhhhhih!h!", charArray19);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.initials("H", charArray19);
        java.lang.String str31 = org.apache.commons.lang.WordUtils.capitalize("HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", charArray19);
        java.lang.String str32 = org.apache.commons.lang.WordUtils.capitalizeFully("hhHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!!", charArray19);
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
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Hhhhih!hhhhhih!hihhhih!hhhhhih!h!" + "'", str29, "Hhhhih!hhhhhih!hihhhih!hhhhhih!h!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "H" + "'", str30, "H");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str31, "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Hhhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!" + "'", str32, "Hhhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!");
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhih!hhhiHhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhih!hhhihhi!hhi!ihi!hhi!!" + "'", str1, "Hhhih!hhhihhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhHI!IHI!!hhHI!IHI!!ihHI!IHI!!hhHI!IHI!!!", 0, (int) (short) 0, "Hhhhhih!hhhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhhih!hhhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i" + "'", str4, "Hhhhhih!hhhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i");
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IIhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I!hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IIhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IIhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I!hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IIhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I!hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IIhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IIhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I!hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I!" + "'", str2, "hhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IIhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I!hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IIhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IIhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I!hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I!");
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhi!hhi!ihhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!", 0, (int) (byte) 10, "hHhhhih!hhHHIH!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhi!hhi!ihhHhhhih!hhHHIH!" + "'", str4, "Hhi!hhi!ihhHhhhih!hhHHIH!");
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!", (int) (byte) -1, "HhHIH!HhHIH!hhHIH!hhHIH!hhHIH!ihHIH!hhHIH!!hHIH!hhHIH!hhHIH!HhHIH!HhHIH!IhHIH!HhHIH!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!" + "'", str4, "HhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!");
    }
}

