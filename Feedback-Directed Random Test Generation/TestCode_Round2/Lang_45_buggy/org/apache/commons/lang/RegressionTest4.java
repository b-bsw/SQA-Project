package org.apache.commons.lang;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

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
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!" + "'", str1, "hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!");
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        char[] charArray11 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray11);
        java.lang.Class<?> wildcardClass17 = charArray11.getClass();
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhHHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!i!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str1, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        char[] charArray10 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("HI!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hHI!IHI!!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!", charArray10);
        java.lang.Class<?> wildcardClass15 = charArray10.getClass();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str14, "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!", 100, "hHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!" + "'", str4, "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!");
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        char[] charArray8 = new char[] { '#', '4', '4', '4', '4', '#' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihi!hhi!!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhHHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!i!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!", charArray8);
        java.lang.Class<?> wildcardClass11 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '#', '4', '4', '4', '4', '#' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str9, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhHHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!i!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!" + "'", str10, "hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhHHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!i!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i" + "'", str2, "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i");
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!hi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!iHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!hi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!hi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!hi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!HI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!Ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!HI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!HI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!HI!HHI!IHI!HHI!!!" + "'", str1, "HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!HI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!Ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!HI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!HI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!HI!HHI!IHI!HHI!!!");
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhHIH!HhHIH!hhHIH!hhHIH!hhHIH!ihHIH!hhHIH!!hHIH!hhHIH!hhHIH!HhHIH!HhHIH!IhHIH!HhHIH!!", (int) (byte) 10, "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhHIH!HhHIH!hhHIH!hhHIH!hhHIH!ihHIH!hhHIH!!hHIH!hhHIH!hhHIH!HhHIH!HhHIH!IhHIH!HhHIH!!" + "'", str4, "hhHIH!HhHIH!hhHIH!hhHIH!hhHIH!ihHIH!hhHIH!!hHIH!hhHIH!hhHIH!HhHIH!HhHIH!IhHIH!HhHIH!!");
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I" + "'", str1, "HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I");
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhHHHHIH!HHHHIH!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhHHHHIH!HHHHIH!" + "'", str2, "hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhHHHHIH!HHHHIH!");
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        char[] charArray14 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("HI!", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihi!hhi!!", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("hHI!IHI!!", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIH!IhHIH!!hHIH!!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("hhi!hhi!ihi!hhi!!", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!", charArray14);
        java.lang.Class<?> wildcardClass23 = charArray14.getClass();
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HHI!IHI!!" + "'", str19, "HHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!" + "'", str20, "Hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "h" + "'", str21, "h");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!" + "'", str22, "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!ihi!!!" + "'", str1, "Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!ihi!!!");
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!" + "'", str2, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!");
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhHI!IHI!!Hhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhh", 10, "", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhHI!IHI!!Hhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhh" + "'", str4, "hhHI!IHI!!Hhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhh");
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HhhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!" + "'", str1, "hhhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!");
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhhhhih!hhhhhih!hhhhhih!hihhhihhHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        char[] charArray8 = new char[] { '4', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hhih!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHHHIH!HHhhih!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hI!" + "'", str11, "hI!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhih!" + "'", str13, "Hhih!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhhhhih!hhhhih!" + "'", str14, "Hhhhhih!hhhhih!");
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
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
        java.lang.String str30 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!", charArray18);
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str30, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihi!!HHhi!hhi!iHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!ihi!!HHhi!hhi!iHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!" + "'", str1, "hhhi!ihi!!HHhi!hhi!iHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!");
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        char[] charArray5 = new char[] { '4', '4' };
        java.lang.String str6 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!HhI!IhI!HhI!!", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("HHHIH!HHHIHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!H!IHHIH!!HHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HIH!IHHIH!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHHIH!IHHIHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!H!!HHIH!!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hi!" + "'", str6, "Hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str7, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HHHIH!HHHIHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!H!IHHIH!!HHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HIH!IHHIH!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHHIH!IHHIHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!H!!HHIH!!" + "'", str8, "HHHIH!HHHIHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!H!IHHIH!!HHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HIH!IHHIH!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHHIH!IHHIHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!H!!HHIH!!");
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHi!hHi!iHi!hHi!!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHi!hHi!iHi!hHi!!" + "'", str2, "HHi!hHi!iHi!hHi!!");
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!hi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!iHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!hi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!hi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!hi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!", (int) ' ', (int) (byte) 1, "hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!" + "'", str4, "hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!");
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhih!", (int) ' ', (int) '#', "Hhhhhhih!hhhi!ihi!!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 32, length 5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        char[] charArray14 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("HI!", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhih!", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("HhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIH!IhHIH!!hHIH!!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHI!HHI!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("hhHhhhih!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!I!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!I!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!I!HHI!IHI!", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hi!" + "'", str17, "Hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhih!" + "'", str18, "Hhih!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hhhi!hhi!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!" + "'", str21, "Hhhi!hhi!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hhHhhhih!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!I!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!I!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!I!HHI!IHI!" + "'", str22, "hhHhhhih!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!I!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!I!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!I!HHI!IHI!");
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        char[] charArray7 = new char[] { '4', '4' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!HhI!IhI!HhI!!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hi!" + "'", str8, "Hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str9, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HI!" + "'", str10, "HI!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str11, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "h" + "'", str12, "h");
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhihhhi!ihi!!hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhihhhi!ihi!!hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!" + "'", str1, "Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhihhhi!ihi!!hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!");
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str2, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HhHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!!", 0, "", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!!" + "'", str4, "HhHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!!");
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhi!hhi!ihi!hhi!!i!i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!" + "'", str2, "Hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i" + "'", str1, "hhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i");
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHIH!HHHIhHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhih!hhhihhi!hhi!ihi!hhi!!" + "'", str1, "Hhhih!hhhihhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IIhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I!hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IIhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IIhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I!hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!iiHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!iiHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!iiHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i!" + "'", str1, "HHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!iiHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!iiHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!iiHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i!");
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!IHhhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!", (int) 'a', 1, "Hhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!IHhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str4, "hhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!IHhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        char[] charArray14 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("HI!", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhih!", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("HhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIH!IhHIH!!hHIH!!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHI!HHI!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("HhHIH!HhHIH!hhHIH!hhHIH!hhHIH!ihHIH!hhHIH!!hHIH!hhHIH!hhHIH!HhHIH!HhHIH!IhHIH!HhHIH!!", charArray14);
        java.lang.Class<?> wildcardClass23 = charArray14.getClass();
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hi!" + "'", str17, "Hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhih!" + "'", str18, "Hhih!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hhhi!hhi!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!" + "'", str21, "Hhhi!hhi!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        char[] charArray13 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("HHI!HHI!IHI!HHI!!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("HHIH!", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("Hhhih!hhhiHhi!hhi!ihi!hhi!!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("Hhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhih!" + "'", str18, "Hhih!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str20, "Hhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!" + "'", str1, "HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!");
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhhhhih!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhhih!hhhi!ihi!!" + "'", str1, "Hhhhhhih!hhhi!ihi!!");
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        char[] charArray7 = new char[] { '4', '4' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("h", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!HHI!IHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hi!" + "'", str8, "Hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hI!" + "'", str9, "hI!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "h" + "'", str10, "h");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hhi!hhi!ihhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!" + "'", str11, "Hhi!hhi!ihhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!", (int) (byte) 1, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str4, "HhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!" + "'", str1, "HHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!");
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhi!hhi!ihi!hhi!!", (int) '4', "HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!HHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhi!hhiHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!!ihi!hhi!!" + "'", str4, "HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!HHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhi!hhiHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!!ihi!hhi!!");
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHHHIH!HHHHIH!", (int) ' ', "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihI!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHHHIH!HHHHIH!" + "'", str4, "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHHHIH!HHHHIH!");
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!", (int) (byte) 10, (int) (byte) 10, "HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHHHIH!HHHHIH!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhi!ihi!!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHHHIH!HHHHIH!" + "'", str4, "HHhi!ihi!!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHHHIH!HHHHIH!");
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        char[] charArray8 = new char[] { '4', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!HhI!IhI!HhI!!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hHi!hHi!iHi!hHi!!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("HhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!I!HhI!!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hHi!hHi!iH", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str10, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!I!HhI!!" + "'", str12, "HhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!I!HhI!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str13, "Hhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhi!hhi!ih" + "'", str14, "Hhi!hhi!ih");
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!HI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!Ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!HI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!HI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!HI!HHI!IHI!HHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!HI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!Ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!HI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!HI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!HI!HHI!IHI!HHI!!!" + "'", str1, "HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!HI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!Ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!HI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!HI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!HI!HHI!IHI!HHI!!!");
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        char[] charArray11 = new char[] { '#', '4', '4', '4', '4', '#' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihi!hhi!!", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!ihi!!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("hHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!I!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhhhih!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '#', '4', '4', '4', '4', '#' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str12, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhi!ihi!!" + "'", str13, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str14, "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "h" + "'", str15, "h");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhhhhih!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!" + "'", str16, "Hhhhhhih!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!");
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhhHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIH!IhHIH!!hHIH!!" + "'", str1, "HHHhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIH!IhHIH!!hHIH!!");
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhi!hhi!iHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHIHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhih!hhhHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHIHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhih!hihhhHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHIHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!ih!hhhhhihHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHIHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!!h!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHI!HHI!IhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHHHIH!HHHhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHIH!HIHHHhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!IH!HHHHHIHhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!!H!" + "'", str1, "hHHI!HHI!IhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHHHIH!HHHhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHIH!HIHHHhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!IH!HHHHHIHhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!!H!");
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        char[] charArray18 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray18);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray18);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray18);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray18);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("h", charArray18);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray18);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray18);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.initials("hI!", charArray18);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihi!hhi!!", charArray18);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.capitalize("hHIH!", charArray18);
        java.lang.String str29 = org.apache.commons.lang.WordUtils.uncapitalize("HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!", charArray18);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.initials("Hhhhih!hhhhhih!hihhhih!hhhhhih!h!", charArray18);
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "h" + "'", str26, "h");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str27, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "HHIH!" + "'", str28, "HHIH!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!" + "'", str29, "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "H" + "'", str30, "H");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hhi!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hhi!!" + "'", str2, "Hhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hhi!!");
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
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
        java.lang.String str26 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!", charArray16);
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!" + "'", str26, "hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!");
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhh" + "'", str1, "HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhh");
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!!", 0, (int) 'a', "HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!" + "'", str4, "hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!");
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HhHhhhih!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!I!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!I!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!I!HHI!IHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHhHHHIH!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!hhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!HHIHhhi!hhi!ihi!hhi!!hhhi!hhi!ihhhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!i!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhhhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!i!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhhhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!i!hhi!ihi!" + "'", str1, "hHhHHHIH!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!hhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!HHIHhhi!hhi!ihi!hhi!!hhhi!hhi!ihhhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!i!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhhhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!i!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhhhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!i!hhi!ihi!");
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!ihi!!!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!ihi!!!" + "'", str2, "hHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!ihi!!!");
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhhhHI!IHI!!hhHI!IHI!!ihHI!IHI!!hhHI!IHI!!!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhhhHI!IHI!!hhHI!IHI!!ihHI!IHI!!hhHI!IHI!!!" + "'", str2, "hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhhhHI!IHI!!hhHI!IHI!!ihHI!IHI!!hhHI!IHI!!!");
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        char[] charArray16 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray16);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("h", charArray16);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray16);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.initials("hHI!IHI!!", charArray16);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhih!", charArray16);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!ihi!!", charArray16);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!", charArray16);
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hhih!" + "'", str24, "Hhih!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Hhi!ihi!!" + "'", str25, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!" + "'", str26, "Hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!", (int) (short) 1, (int) (short) 100, "hHIH!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHhHIH!" + "'", str4, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHhHIH!");
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!hi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!iHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!hi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!hi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!hi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!hi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!iHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!hi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!hi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!hi!hhi!ihi!hhi!!!" + "'", str1, "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!hi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!iHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!hi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!hi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!hi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        char[] charArray15 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("hHIH!", charArray15);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!", charArray15);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("hHhhhih!hhHHIH!", charArray15);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhh", charArray15);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.uncapitalize("HHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "h" + "'", str19, "h");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str20, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "h" + "'", str21, "h");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhh" + "'", str23, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhh");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str24, "hHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IhHHI!HHI!Ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hi!" + "'", str1, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hi!");
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!ihhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!ihhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!!hhih!ihhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!ihhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        char[] charArray18 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray18);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray18);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray18);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray18);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("h", charArray18);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray18);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray18);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.initials("hI!", charArray18);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.uncapitalize("hhih!", charArray18);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.initials("HhI!HhI!IhI!HhI!!", charArray18);
        java.lang.String str29 = org.apache.commons.lang.WordUtils.capitalizeFully("HHIH!", charArray18);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.initials("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hi!", charArray18);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H" + "'", str23, "H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hhih!" + "'", str24, "Hhih!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Hi!" + "'", str25, "Hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "h" + "'", str26, "h");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hhih!" + "'", str27, "hhih!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "H" + "'", str28, "H");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Hhih!" + "'", str29, "Hhih!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "H" + "'", str30, "H");
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
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
        java.lang.String str26 = org.apache.commons.lang.WordUtils.uncapitalize("HHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!", charArray16);
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!" + "'", str26, "hHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!");
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        char[] charArray16 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray16);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("h", charArray16);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray16);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.initials("hHI!IHI!!", charArray16);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhih!", charArray16);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.initials("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", charArray16);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.uncapitalize("Hhih!", charArray16);
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hhih!" + "'", str24, "Hhih!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "H" + "'", str25, "H");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hhih!" + "'", str26, "hhih!");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhhhih!hhhhhih!hhhhhih!hihhhihhHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhhih!hhhhhih!hhhhhih!hihhhihhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhh" + "'", str1, "Hhhhhhih!hhhhhih!hhhhhih!hihhhihhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhh");
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        char[] charArray15 = new char[] { '4', '4' };
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray15);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray15);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray15);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray15);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray15);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray15);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!", charArray15);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalizeFully("hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", charArray15);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray15);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhHHIH!", charArray15);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!", charArray15);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!", charArray15);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.capitalize("hHhhhih!hhhhhih!hihhhih!hhhhhih!HhHI!IHI!!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!", charArray15);
        java.lang.Class<?> wildcardClass29 = charArray15.getClass();
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hi!" + "'", str16, "Hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hI!" + "'", str18, "hI!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hi!" + "'", str19, "Hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H" + "'", str21, "H");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!" + "'", str22, "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str23, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "H" + "'", str25, "H");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhihhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!" + "'", str26, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhihhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str27, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "HHhhhih!hhhhhih!hihhhih!hhhhhih!HhHI!IHI!!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str28, "HHhhhih!hhhhhih!hihhhih!hhhhhih!HhHI!IHI!!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!I!HhI!!", (int) '4', (int) 'a', "Hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHHhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str4, "HhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHHhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        char[] charArray13 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("hHIH!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("H", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("Hhhhih!hhhhhih!hihhhih!hhhhhih!h!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "h" + "'", str17, "h");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhhhih!hhhhhih!hihhhih!hhhhhih!h!" + "'", str19, "Hhhhih!hhhhhih!hihhhih!hhhhhih!h!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I" + "'", str20, "hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I");
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!ihi!!!", (int) (byte) 0, (int) 'a', "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str4, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        char[] charArray23 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray23);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray23);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray23);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray23);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.capitalize("h", charArray23);
        java.lang.String str29 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray23);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.initials("hhI!HhI!IhI!HhI!!", charArray23);
        java.lang.String str31 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!HhI!IhI!HhI!!", charArray23);
        java.lang.String str32 = org.apache.commons.lang.WordUtils.initials("hI!", charArray23);
        java.lang.String str33 = org.apache.commons.lang.WordUtils.initials("", charArray23);
        java.lang.String str34 = org.apache.commons.lang.WordUtils.initials("hHI!IHI!!", charArray23);
        java.lang.String str35 = org.apache.commons.lang.WordUtils.uncapitalize("HhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", charArray23);
        java.lang.String str36 = org.apache.commons.lang.WordUtils.initials("Hhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!ihhih!!hHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hih!ihhih!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hhhih!ihhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!!hhih!!", charArray23);
        java.lang.String str37 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!", charArray23);
        java.lang.String str38 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I", charArray23);
        java.lang.String str39 = org.apache.commons.lang.WordUtils.initials("HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", charArray23);
        java.lang.String str40 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!", charArray23);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "H" + "'", str28, "H");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "H" + "'", str29, "H");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "h" + "'", str30, "h");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str31, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "h" + "'", str32, "h");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "h" + "'", str34, "h");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!" + "'", str35, "hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "H" + "'", str36, "H");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str37, "hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i" + "'", str38, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "H" + "'", str39, "H");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Hhhhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!" + "'", str40, "Hhhhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        char[] charArray9 = new char[] { '4', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("Hhhhih!hhhhhih!hihhhih!hhhhhih!h!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("hhHIH!HhHIH!hhHIH!hhHIH!hhHIH!ihHIH!hhHIH!!hHIH!hhHIH!hhHIH!HhHIH!HhHIH!IhHIH!HhHIH!!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!HhHIH!HhHIH!hhHIH!hhHIH!hhHIH!ihHIH!hhHIH!!hHIH!hhHIH!hhHIH!HhHIH!HhHIH!IhHIH!HhHIH!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hI!" + "'", str12, "hI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhhhih!hhhhhih!hihhhih!hhhhhih!h!" + "'", str14, "Hhhhih!hhhhhih!hihhhih!hhhhhih!h!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "h" + "'", str15, "h");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "h" + "'", str16, "h");
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        char[] charArray10 = new char[] { '4', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!HhI!IhI!HhI!!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("HhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIH!IhHIH!!hHIH!!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("HHIH!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ih", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("hHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHhHHHIH!HHHHHIH!HIHhhHHHIH!HHhhih!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str12, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HI!" + "'", str13, "HI!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhih!" + "'", str15, "Hhih!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhi!hhi!ih" + "'", str16, "Hhi!hhi!ih");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHhHHHIH!HHHHHIH!HIHhhHHHIH!HHhhih!" + "'", str18, "hHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHhHHHIH!HHHHHIH!HIHhhHHHIH!HHhhih!");
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        char[] charArray11 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("HI!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("HHI!IHI!!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I", charArray11);
        java.lang.Class<?> wildcardClass17 = charArray11.getClass();
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hHI!IHI!!" + "'", str15, "hHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i" + "'", str16, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhhih!hhhhih!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhhih!hhhhih!" + "'", str2, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhhih!hhhhih!");
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
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
        java.lang.String str29 = org.apache.commons.lang.WordUtils.uncapitalize("HhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHHIH!HHhhih!", charArray18);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.initials("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!ihi!!!", charArray18);
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
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHHIH!HHhhih!" + "'", str29, "hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHHIH!HHhhih!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "h" + "'", str30, "h");
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!", (int) (short) 100, (int) (short) 1, "hHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHhHHHIH!HHHHHIH!HIHhhHHHIH!HHhhih!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHhHHHIH!HHHHHIH!HIHhhHHHIH!HHhhih!" + "'", str4, "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHhHHHIH!HHHHHIH!HIHhhHHHIH!HHhhih!");
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("h", 0, "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "h" + "'", str4, "h");
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!" + "'", str2, "HHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!");
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I", (int) (byte) 1, (int) '4', "hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!" + "'", str4, "HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!");
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str1, "HHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!hhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!hhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihI!" + "'", str1, "HhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!hhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihI!");
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!ihi!!!" + "'", str1, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!ihi!!!");
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhih!hHhih!HHhih!HHhih!HHhih!IHhih!HHhih!!Hhih!HHhih!HHhih!hHhih!hHhih!iHhih!hHhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!" + "'", str1, "Hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!");
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!", (int) '#', (int) (short) 0, "HhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHHhHI!IHI!!hhHI!IHI!!ihHI!IHI!!hhHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!HhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHHhHI!IHI!!hhHI!IHI!!ihHI!IHI!!hhHI!IHI!!!" + "'", str4, "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!HhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHHhHI!IHI!!hhHI!IHI!!ihHI!IHI!!hhHI!IHI!!!");
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        char[] charArray6 = new char[] { '4', '4' };
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I", charArray6);
        java.lang.Class<?> wildcardClass11 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Hi!" + "'", str7, "Hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I" + "'", str10, "HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!" + "'", str1, "HHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!");
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHI!HHI!IHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHI!HHI!IHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!" + "'", str2, "HHI!HHI!IHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!");
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str1, "hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        char[] charArray12 = new char[] { '4', '4' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!HhI!IhI!HhI!!", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("hHi!hHi!iHi!hHi!!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ih", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I", charArray12);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("hHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!", charArray12);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!ihi!!!", charArray12);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("Hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!", charArray12);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("HHHI!IHI!!Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!", charArray12);
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!" + "'", str21, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hHHI!IHI!!Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str22, "hHHI!IHI!!Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhI!HhI!Ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        char[] charArray6 = new char[] { '4', '4' };
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("hHhhhih!hhHHIH!", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Hi!" + "'", str7, "Hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H" + "'", str8, "H");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "h" + "'", str9, "h");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!" + "'", str10, "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!");
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhih!hhhihhih!hhhi!hhi!ihhih!hi!hhi!!hhhhih!hi!hhi!ihihhih!!hhi!!ihhihhih!!hhi!ihi!hhhih!hi!!!hhi!hhhih!hi!ihi!hhihhih!!!ihhi!hhihhih!!ihi!hhi!!hhih!hhhi!hhi!i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhih!hhhihhih!hhhi!hhi!ihhih!hi!hhi!!hhhhih!hi!hhi!ihihhih!!hhi!!ihhihhih!!hhi!ihi!hhhih!hi!!!hhi!hhhih!hi!ihi!hhihhih!!!ihhi!hhihhih!!ihi!hhi!!hhih!hhhi!hhi!i" + "'", str1, "hhhih!hhhihhih!hhhi!hhi!ihhih!hi!hhi!!hhhhih!hi!hhi!ihihhih!!hhi!!ihhihhih!!hhi!ihi!hhhih!hi!!!hhi!hhhih!hi!ihi!hhihhih!!!ihhi!hhihhih!!ihi!hhi!!hhih!hhhi!hhi!i");
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        char[] charArray11 = new char[] { '4', '4' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("h", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("Hhi!ihi!!", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("HhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("HHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!", charArray11);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hHHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hI!" + "'", str13, "hI!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "h" + "'", str14, "h");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!" + "'", str19, "HHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hhi!!" + "'", str20, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hhi!!");
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIHHHHI!HHI!IHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHhi!HHIH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihHI!hhih!" + "'", str1, "hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihHI!hhih!");
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!" + "'", str1, "hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!");
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhhhhih!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!hhih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhih!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!hhih!" + "'", str1, "Hhhhhih!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!hhih!");
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!" + "'", str2, "HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!");
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhhi!hhi!iHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        char[] charArray11 = new char[] { '#', '4', '4', '4', '4', '#' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihi!hhi!!", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("HhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHHIH!HHhhih!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("hHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("HHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhHhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhHHHHIH!HHHHIH!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '#', '4', '4', '4', '4', '#' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str12, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str13, "Hhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "h" + "'", str15, "h");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhHhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhHHHHIH!HHHHIH!" + "'", str16, "HHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhHhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhHHHHIH!HHHHIH!");
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhhhih!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhHHI!IHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHHI!HHI!IHI!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhhih!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhHHI!IHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHHI!HHI!IHI!" + "'", str2, "Hhhhhih!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhHHI!IHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHHI!HHI!IHI!");
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhi!hhi!ihi!hhi!!i!i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhHIH!HhHIhHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhHIH!HhHIhHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!" + "'", str1, "hhHIH!HhHIhHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!");
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IIhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I!hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IIhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IIhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I!hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!iihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!iihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!iihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i!" + "'", str1, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!iihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!iihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!iihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i!");
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
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
        java.lang.String str32 = org.apache.commons.lang.WordUtils.uncapitalize("hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", charArray20);
        java.lang.String str33 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!", charArray20);
        java.lang.String str34 = org.apache.commons.lang.WordUtils.initials("hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!", charArray20);
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!" + "'", str32, "hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!" + "'", str33, "Hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "h" + "'", str34, "h");
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHhhhih!hhhhhih!hihhhih!hhhhhih!HhHI!IHI!!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHhhhih!hhhhhih!hihhhih!hhhhhih!HhHI!IHI!!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str1, "hHhhhih!hhhhhih!hihhhih!hhhhhih!HhHI!IHI!!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhihhhi!ihi!!hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhihhhi!ihi!!hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!" + "'", str1, "Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhihhhi!ihi!!hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!");
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!" + "'", str2, "hhHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!");
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("", (int) (byte) 100, 10, "HHHHHIH!HHHHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHIH!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!", (int) (byte) 100, "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str4, "hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!HhHIH!HhHIH!hhHIH!hhHIH!hhHIH!ihHIH!hhHIH!!hHIH!hhHIH!hhHIH!HhHIH!HhHIH!IhHIH!HhHIH!!", (int) '4', "Hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!HhHIH!HhHIH!hhHIH!hhHIH!hhHIH!ihHIH!hhHIH!!hHIH!hhHIH!hhHIH!HhHIH!HhHIH!IhHIH!HhHIH!!" + "'", str4, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!HhHIH!HhHIH!hhHIH!hhHIH!hhHIH!ihHIH!hhHIH!!hHIH!hhHIH!hhHIH!HhHIH!HhHIH!IhHIH!HhHIH!!");
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        char[] charArray12 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("hHIH!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("H", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!", charArray12);
        java.lang.Class<?> wildcardClass19 = charArray12.getClass();
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "h" + "'", str16, "h");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str18, "hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        char[] charArray14 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("hHI!HHI!IHI!HHI!!", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("hhhi!hhi!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("HhhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HHI!HHI!IHI!HHI!!" + "'", str18, "HHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "h" + "'", str19, "h");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "h" + "'", str21, "h");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HhhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!" + "'", str22, "HhhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!");
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IhHHI!HHI!Ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!HI!", 0, (int) (short) 0, "Hhhhhhih!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhhhih!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!" + "'", str4, "Hhhhhhih!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!");
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhiHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!h!hhhih!hhhih!hhhih!ihhih!hhhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhiHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!h!hhhih!hhhih!hhhih!ihhih!hhhih!!" + "'", str1, "hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhiHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!h!hhhih!hhhih!hhhih!ihhih!hhhih!!");
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
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
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!", charArray16);
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!" + "'", str26, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!");
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHI!IHI!!Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihi!!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str1, "Hhhi!ihi!!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhh", (int) (short) 1, (int) '4', "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hi" + "'", str4, "HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hi");
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHHI!HHI!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHI!HHI!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!" + "'", str2, "hHHI!HHI!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!");
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str1, "Hhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!ihi!!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihi!!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str1, "Hhhi!ihi!!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHHIH!HHHIHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!H!IHHIH!!HHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HIH!IHHIH!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHHIH!IHHIHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!H!!HHIH!!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHIH!HHHIHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!H!IHHIH!!HHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HIH!IHHIH!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHHIH!IHHIHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!H!!HHIH!!" + "'", str2, "hHHIH!HHHIHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!H!IHHIH!!HHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HIH!IHHIH!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHHIH!IHHIHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!H!!HHIH!!");
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        char[] charArray9 = new char[] { '4', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("h", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("HHIH!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hhi!!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!", charArray9);
        java.lang.Class<?> wildcardClass17 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hI!" + "'", str11, "hI!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "h" + "'", str12, "h");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hhi!!" + "'", str15, "Hhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!" + "'", str16, "hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hi!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!" + "'", str2, "Hi!");
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHHIH!HHHIhhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihh" + "'", str1, "hhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihh");
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        char[] charArray10 = new char[] { '4', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("HHhhhih!hhHHIH!", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("hhHI!IHI!!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!HhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!IHI!!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hI!" + "'", str13, "hI!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HHhhhih!hhHHIH!" + "'", str17, "HHhhhih!hhHHIH!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "h" + "'", str18, "h");
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihHI!hhih!", 0, (int) '#', "HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!" + "'", str4, "hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!");
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHHhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHHhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str1, "hhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHHhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        char[] charArray8 = new char[] { '4', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("h", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("hhih!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hHHI!IHI!!Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhih!hhhihhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "h" + "'", str10, "h");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hhih!" + "'", str11, "hhih!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "h" + "'", str12, "h");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HHHI!IHI!!Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str13, "HHHI!IHI!!Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str14, "Hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhi!hhi!ihi!hhi!!i!i", (int) (byte) 100, (-1), "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhi!hhi!ihi!hhi!!i!i" + "'", str4, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhi!hhi!ihi!hhi!!i!i");
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        char[] charArray15 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("hHIH!", charArray15);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("H", charArray15);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!", charArray15);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!HhI!Ih", charArray15);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray15);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.initials("hhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "h" + "'", str19, "h");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!" + "'", str21, "hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhi!hhi!ih" + "'", str22, "Hhi!hhi!ih");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "h" + "'", str24, "h");
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhi!hhi!ihhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhi!hhi!ihhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!" + "'", str2, "Hhi!hhi!ihhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!");
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!", (int) (short) -1, "", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!" + "'", str4, "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!");
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        char[] charArray17 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray17);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray17);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray17);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray17);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("h", charArray17);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray17);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalize("Hhi!ihi!!", charArray17);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray17);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalize("hHHHHIH!HHHHIH!", charArray17);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.initials("Hhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!ihhih!!hHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hih!ihhih!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hhhih!ihhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!!hhih!!", charArray17);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.uncapitalize("HHHI!IHI!!hhHI!HHI!IhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!", charArray17);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hhih!" + "'", str23, "Hhih!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hhi!ihi!!" + "'", str24, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Hi!" + "'", str25, "Hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HHHHHIH!HHHHIH!" + "'", str26, "HHHHHIH!HHHHIH!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "H" + "'", str27, "H");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hHHI!IHI!!hhHI!HHI!IhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!" + "'", str28, "hHHI!IHI!!hhHI!HHI!IhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!");
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!IHI!!!" + "'", str1, "HhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!IHI!!!");
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        char[] charArray7 = new char[] { '4', '4' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("h", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!ihhih!!hHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hih!ihhih!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hhhih!ihhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!!hhih!!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("Hhhih!hhhiHhi!hhi!ihi!hhi!!", charArray7);
        java.lang.Class<?> wildcardClass13 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hi!" + "'", str8, "Hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "h" + "'", str9, "h");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "h" + "'", str10, "h");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!ihhih!!hHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hih!ihhih!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hhhih!ihhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!!hhih!!" + "'", str11, "Hhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!ihhih!!hHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hih!ihhih!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hhhih!ihhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!!hhih!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!ihi!!!", 0, (int) (short) 100, "hHhhi!hhi!hHHHHIH!HHHHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHIH!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihhHhhi!hhi!hHHHHIH!HHHHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHIH!" + "'", str4, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihhHhhi!hhi!hHHHHIH!HHHHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHIH!");
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!" + "'", str1, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!");
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!ihhih!!hHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hih!ihhih!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hhhih!ihhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!!hhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHHI!IHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHHI!HHI!IHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        char[] charArray12 = new char[] { '4', '4' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!", charArray12);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!", charArray12);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhih!hhhiHhi!hhi!ihi!hhi!!", charArray12);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhHHHHIH!HHHHIH!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hI!" + "'", str15, "hI!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hi!" + "'", str16, "Hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!" + "'", str18, "hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str20, "Hhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hhhih!hhhihhi!hhi!ihi!hhi!!" + "'", str21, "Hhhih!hhhihhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "h" + "'", str22, "h");
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHHIH!HHHIHhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHIH!HHHIHhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!" + "'", str1, "HHHIH!HHHIHhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!");
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
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
        java.lang.String str33 = org.apache.commons.lang.WordUtils.initials("HHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!", charArray20);
        java.lang.String str34 = org.apache.commons.lang.WordUtils.initials("hHhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIH!IhHIH!!hHIH!!", charArray20);
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
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "H" + "'", str33, "H");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "h" + "'", str34, "h");
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        char[] charArray13 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("HhI!HhI!IhI!HhI!!", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!HhI!IhI!HhI!!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i", charArray13);
        java.lang.Class<?> wildcardClass21 = charArray13.getClass();
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hi!" + "'", str17, "Hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhI!HhI!IhI!HhI!!" + "'", str18, "hhI!HhI!IhI!HhI!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str19, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i" + "'", str20, "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        char[] charArray14 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhhhih!hhhhhih!hihhhhhhih!hhhhih!", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hi!" + "'", str17, "Hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hI!" + "'", str20, "hI!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!" + "'", str21, "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhhhih!hhhhhih!hihhhhhhih!hhhhih!" + "'", str22, "hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhhhih!hhhhhih!hihhhhhhih!hhhhih!");
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!", 1, "HhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!IHI!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!" + "'", str4, "hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!");
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!" + "'", str1, "hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!");
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str1, "Hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
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
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!", charArray12);
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "h" + "'", str22, "h");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
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
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhHHIH!", charArray12);
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhHHIH!" + "'", str22, "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhHHIH!");
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        char[] charArray12 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("HI!", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("HHIH!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("HHHIH!HHHIHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!H!IHHIH!!HHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HIH!IHHIH!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHHIH!IHHIHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!H!!HHIH!!", charArray12);
        java.lang.Class<?> wildcardClass19 = charArray12.getClass();
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhih!" + "'", str16, "Hhih!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str17, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!" + "'", str2, "Hhhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        char[] charArray5 = new char[] { '4' };
        java.lang.String str6 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhh", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("hhhhih!hhhhhih!hihhhih!hhhhhih!h!", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!", charArray5);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("hhHhhhih!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4' });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhh" + "'", str6, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhh");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Hhhhih!hhhhhih!hihhhih!hhhhhih!h!" + "'", str7, "Hhhhih!hhhhhih!hihhhih!hhhhhih!h!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "h" + "'", str8, "h");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "h" + "'", str9, "h");
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
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
        java.lang.String str34 = org.apache.commons.lang.WordUtils.capitalize("", charArray20);
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHI!HHI!IHI!HHI!!", (int) (byte) 0, (int) ' ', "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHI!HHI!IHI!HHI!!" + "'", str4, "HHI!HHI!IHI!HHI!!");
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str1, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhHI!HHI!IhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!" + "'", str1, "Hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!");
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!" + "'", str1, "hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!");
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHhih!hHhih!HHhih!HHhih!HHhih!IHhih!HHhih!!Hhih!HHhih!HHhih!hHhih!hHhih!iHhih!hHhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhHIH!HhHIH!hhHIH!hhHIH!hhHIH!ihHIH!hhHIH!!hHIH!hhHIH!hhHIH!HhHIH!HhHIH!IhHIH!HhHIH!!" + "'", str1, "hhHIH!HhHIH!hhHIH!hhHIH!hhHIH!ihHIH!hhHIH!!hHIH!hhHIH!hhHIH!HhHIH!HhHIH!IhHIH!HhHIH!!");
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h" + "'", str2, "h");
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhhih!hhhhhih!hihhhih!hhhhhih!h!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!IHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!IHI!!!" + "'", str1, "HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!IHI!!!");
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHhih!hHhiHhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!", (int) (byte) 1, "HHHI!IHI!!hhHI!HHI!IhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhih!hHhiHhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str4, "HHhih!hHhiHhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHhih!hHhiHhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!", 0, 100, "Hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhih!hHhiHhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhiHhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str4, "HHhih!hHhiHhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhiHhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhihhi!hhi!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhihhi!hhi!ih" + "'", str1, "hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhihhi!hhi!ih");
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        char[] charArray13 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("HI!", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("HHIH!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("HHIH!", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihI!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hi!" + "'", str16, "Hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhih!" + "'", str17, "Hhih!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HHIH!" + "'", str18, "HHIH!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str19, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!!" + "'", str20, "HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!!");
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        char[] charArray13 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("HI!", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhih!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ih", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hi!" + "'", str16, "Hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhih!" + "'", str17, "Hhih!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str18, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhi!hhi!ih" + "'", str19, "Hhi!hhi!ih");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str20, "hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhhhHI!IHI!!hhHI!IHI!!ihHI!IHI!!hhHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhhhHI!IHI!!hhHI!IHI!!ihHI!IHI!!hhHI!IHI!!!" + "'", str1, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhhhHI!IHI!!hhHI!IHI!!ihHI!IHI!!hhHI!IHI!!!");
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHHHIH!HHHHIH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!" + "'", str1, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!");
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!!" + "'", str1, "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!!");
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str1, "Hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!hhi!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhi!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!" + "'", str1, "Hhhi!hhi!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!");
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!", (int) (byte) 100, (int) (short) -1, "HHHIH!HHHIhHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!" + "'", str4, "hhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!");
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!" + "'", str1, "HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!");
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!" + "'", str2, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!");
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        char[] charArray15 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("HI!", charArray15);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihi!hhi!!", charArray15);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray15);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("hHI!IHI!!", charArray15);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIH!IhHIH!!hHIH!!", charArray15);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("hhi!hhi!ihi!hhi!!", charArray15);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!", charArray15);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhih!hhhihhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HHI!IHI!!" + "'", str20, "HHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!" + "'", str21, "Hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "h" + "'", str22, "h");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!" + "'", str23, "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str24, "Hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhih!hhhihhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", (-1), "Hhi!hhi!ih", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhih!hhhihhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!" + "'", str4, "Hhhih!hhhihhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!");
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
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
        java.lang.String str30 = org.apache.commons.lang.WordUtils.capitalize("Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhihhhi!ihi!!hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!", charArray18);
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhihhhi!ihi!!hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!" + "'", str30, "Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhihhhi!ihi!!hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!");
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        char[] charArray16 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray16);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("h", charArray16);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray16);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray16);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.initials("hI!", charArray16);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.initials("hHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!", charArray16);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.initials("HHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIHHHI!IHI!!hhHI!HHI!IhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!", charArray16);
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "h" + "'", str25, "h");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H" + "'", str26, "H");
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", 1, (-1), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!" + "'", str4, "hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!");
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhHI!IHI!!Hhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHhi!ihi!!hHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHH" + "'", str1, "HHhi!ihi!!hHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHH");
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        char[] charArray13 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("HI!", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhih!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHHIH!HHhhih!", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("HhhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHhHHHIH!HHHHHIH!HIHhhHHHIH!HHhhih!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hi!" + "'", str16, "Hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhih!" + "'", str17, "Hhih!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhi!hhi!ihHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHHIH!HHhhih!" + "'", str18, "Hhi!hhi!ihHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHHIH!HHhhih!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhhhih!hhhhhih!hihhhhhhih!hhhhih!" + "'", str20, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhhhih!hhhhhih!hihhhhhhih!hhhhih!");
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str1, "Hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHhHHHIH!HHHHHIH!HIHhhHHHIH!HHhhih!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHhHHHIH!HHHHHIH!HIHhhHHHIH!HHhhih!" + "'", str2, "HHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHhHHHIH!HHHHHIH!HIHhhHHHIH!HHhhih!");
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!", (int) '4', 100, "hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhHI!HHI!IHI!HHI!!" + "'", str4, "hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhHI!HHI!IHI!HHI!!");
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        char[] charArray14 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("h", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("HHI!HHI!IHI!HHI!!", charArray14);
        java.lang.Class<?> wildcardClass23 = charArray14.getClass();
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str21, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hHI!HHI!IHI!HHI!!" + "'", str22, "hHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHi!hHi!iHi!hHi!!", (int) (byte) 100, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHi!hHi!iHi!hHi!!" + "'", str4, "HHi!hHi!iHi!hHi!!");
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HhHI!HHI!IhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HhHI!HHI!IhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!" + "'", str2, "HhHI!HHI!IhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!");
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        char[] charArray6 = new char[] { '4', '4' };
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("HhHhhhih!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Hi!" + "'", str7, "Hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H" + "'", str8, "H");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!I!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!I!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!" + "'", str1, "hHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!I!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!");
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        char[] charArray11 = new char[] { '4', '4' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("h", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHhih!hHhih!HHhih!HHhih!HHhih!IHhih!HHhih!!Hhih!HHhih!HHhih!hHhih!hHhih!iHhih!hHhih!!", charArray11);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!ihi!!!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hI!" + "'", str13, "hI!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "h" + "'", str14, "h");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "h" + "'", str15, "h");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!" + "'", str18, "hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!" + "'", str19, "Hhhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!ihi!!!" + "'", str20, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!ihi!!!");
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str1, "Hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhi!hhi!ihi!hhi!!" + "'", str1, "HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", (int) (short) -1, (int) (byte) 0, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!" + "'", str4, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!");
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhHI!IHI!!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!", 10, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhHI!IHI!!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str4, "hhHI!IHI!!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHhi!ihi!!hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHhi!ihi!!hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!" + "'", str2, "HHhi!ihi!!hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!");
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!" + "'", str2, "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!");
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        char[] charArray11 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("h", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("HHhhhih!hhhhhih!hihhhih!hhhhhih!HhHI!IHI!!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "h" + "'", str14, "h");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHHHIH!HHHHIH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHHHIH!HHHHIH!" + "'", str1, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHHHIH!HHHHIH!");
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        char[] charArray7 = new char[] { '4', '4' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihi!hhi!!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!", charArray7);
        java.lang.Class<?> wildcardClass13 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hi!" + "'", str8, "Hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "h" + "'", str10, "h");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str11, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "h" + "'", str12, "h");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        char[] charArray13 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("HI!", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhih!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!IHI!!!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hi!" + "'", str16, "Hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhih!" + "'", str17, "Hhih!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!" + "'", str18, "HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str19, "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!ihi!!!" + "'", str20, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!ihi!!!");
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHi!hHi!iH", (int) (byte) 1, 10, "HhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHHhHhhHI!IHI!!hhHI!IHI!!ihHI!IHI!!hhHI!IHI!!!I!IHI!!hhHI!IHI!!ihHI!IHI!!hhHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHi!hHi!iH" + "'", str4, "HHi!hHi!iH");
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HhHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHH" + "'", str1, "hhHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHH");
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!", (int) (short) 1, (int) (short) 100, "hhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!hhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihI!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!hhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihI!" + "'", str4, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!hhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihI!");
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!", (int) (byte) 100, 100, "HHhi!ihi!!hHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHH");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 100, length 51");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i" + "'", str1, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i");
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        char[] charArray16 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("HI!", charArray16);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray16);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!", charArray16);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", charArray16);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!", charArray16);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", charArray16);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalize("HhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IIhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I!hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IIhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IIhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I!hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I!", charArray16);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHHIH!HHhhih!", charArray16);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!hhi!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!", charArray16);
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "H" + "'", str25, "H");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Hhhi!hhi!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!" + "'", str26, "Hhhi!hhi!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!");
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str1, "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
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
        java.lang.String str30 = org.apache.commons.lang.WordUtils.capitalize("hhI!HhI!Ih", charArray19);
        java.lang.String str31 = org.apache.commons.lang.WordUtils.capitalize("Hhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!ihhih!!hHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hih!ihhih!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hhhih!ihhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!!hhih!!", charArray19);
        java.lang.String str32 = org.apache.commons.lang.WordUtils.capitalizeFully("hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHhhi!hhi!iHhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!HI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!", charArray19);
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "HhI!HhI!Ih" + "'", str30, "HhI!HhI!Ih");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Hhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!ihhih!!hHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hih!ihhih!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hhhih!ihhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!!hhih!!" + "'", str31, "Hhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!ihhih!!hHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hih!ihhih!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hhhih!ihhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!!hhih!!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhi!hhi!ihhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!hi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str32, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhi!hhi!ihhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!hi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhi!hhi!ihi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhi!hhi!ihi!" + "'", str1, "Hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhi!hhi!ihi!");
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!hHHI!IHI!!Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!hHHI!IHI!!Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str1, "hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!hHHI!IHI!!Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!IHI!!!", (int) '4', (int) (byte) 100, "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHhhih!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHhhih!" + "'", str4, "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHhhih!");
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!" + "'", str1, "hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!");
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhhhHI!IHI!!hhHI!IHI!!ihHI!IHI!!hhHI!IHI!!!", (int) '#', 0, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhiHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str4, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhiHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        char[] charArray9 = new char[] { '4', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hI!" + "'", str12, "hI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!" + "'", str15, "hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str16, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        char[] charArray13 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("h", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("Hhhhhih!hhhhih!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhih!" + "'", str19, "Hhih!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhhhih!hhhhih!" + "'", str20, "Hhhhhih!hhhhih!");
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str1, "HhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHHHIH!HHHHIH!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHHHIH!HHHHIH!" + "'", str2, "HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHHHIH!HHHHIH!");
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str1, "hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIH!IhHIH!!hHIH!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!" + "'", str1, "Hhhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i" + "'", str1, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i");
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!" + "'", str2, "Hhhhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhiHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!h!hhhih!hhhih!hhhih!ihhih!hhhih!!", (int) (short) 0, (int) 'a', "HHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!I!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!I!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!I!HHI!IHI!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhiHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!h!hhHHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!I!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!I!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!I!HHI!IHI!" + "'", str4, "Hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhiHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!h!hhHHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!I!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!I!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!I!HHI!IHI!");
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!IHhhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!" + "'", str1, "Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!" + "'", str2, "hHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!");
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhi!hhi!iHhhi!hhi!ihi!hhi!!hhhihHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!", (int) '#', "Hhhhhih!hhhhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHHIH!HHhhih!hhih!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhi!hhi!iHhhi!hhi!ihi!hhi!!hhhihHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!" + "'", str4, "Hhhi!hhi!iHhhi!hhi!ihi!hhi!!hhhihHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!");
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhI!HhI!Ih", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhI!HhI!Ih" + "'", str2, "hhI!HhI!Ih");
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhi!hhi!iHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHI!HHI!Ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str1, "hHHI!HHI!Ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHi!hHi!iHi!hHi!!", (int) (byte) 10, (int) (byte) 0, "HHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHi!hHi!iHHHI!IHI!!" + "'", str4, "HHi!hHi!iHHHI!IHI!!");
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!" + "'", str1, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!");
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!" + "'", str1, "HhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!");
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!" + "'", str1, "HHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!");
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!ihi!!!" + "'", str1, "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!ihi!!!");
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        char[] charArray7 = new char[] { '4', '4' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!HhI!IhI!HhI!!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhh", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hhHHHIH!HHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHHIH!HIHHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HIH!HHHHHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!H!H!hhHHHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!H!HHHHHIH!hHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HIHHHIH!HHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHHIH!H!ihhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHHIH!HHHHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HIH!HIHHHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!H!HHHHHHhHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!I!IHI!!hhHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!I!IHI!!ihHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!I!IHI!!hhHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!I!IHI!!!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hi!" + "'", str8, "Hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str9, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhh" + "'", str11, "HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhh");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HhHHHIH!HHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHHIH!HIHHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HIH!HHHHHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!H!H!hhHHHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!H!HHHHHIH!hHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HIHHHIH!HHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHHIH!H!ihhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHHIH!HHHHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HIH!HIHHHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!H!HHHHHHhHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!I!IHI!!hhHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!I!IHI!!ihHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!I!IHI!!hhHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!I!IHI!!!" + "'", str12, "HhHHHIH!HHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHHIH!HIHHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HIH!HHHHHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!H!H!hhHHHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!H!HHHHHIH!hHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HIHHHIH!HHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHHIH!H!ihhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHHIH!HHHHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HIH!HIHHHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!H!HHHHHHhHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!I!IHI!!hhHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!I!IHI!!ihHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!I!IHI!!hhHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!I!IHI!!!");
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        char[] charArray10 = new char[] { '4', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hI!" + "'", str13, "hI!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!" + "'", str17, "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
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
        java.lang.String str33 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!HHI!IHI!HHI!!", charArray20);
        java.lang.String str34 = org.apache.commons.lang.WordUtils.uncapitalize("hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!", charArray20);
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
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hHI!HHI!IHI!HHI!!" + "'", str33, "hHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!" + "'", str34, "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHi!hHi!iHi!hHi!!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHi!hHi!iHi!hHi!!" + "'", str2, "HHi!hHi!iHi!hHi!!");
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        char[] charArray16 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray16);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray16);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray16);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray16);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!", charArray16);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.uncapitalize("hHIH!", charArray16);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalize("hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", charArray16);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i", charArray16);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hi!" + "'", str19, "Hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H" + "'", str21, "H");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hI!" + "'", str22, "hI!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!" + "'", str23, "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hHIH!" + "'", str24, "hHIH!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str25, "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i" + "'", str26, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i");
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        char[] charArray10 = new char[] { '4', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!HhI!IhI!HhI!!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("hHhih!hHhih!iHhih!!Hhih!iHhih!hHhihhhhi!hhi!iHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str12, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "h" + "'", str14, "h");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!" + "'", str15, "HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!" + "'", str17, "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hHhih!hHhih!iHhih!!Hhih!iHhih!hHhihhhhi!hhi!iHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str18, "hHhih!hHhih!iHhih!!Hhih!iHhih!hHhihhhhi!hhi!iHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhhhih!hhhHhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhh", 0, (int) (byte) 10, "hhHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHHHIH!HHhhHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!" + "'", str4, "HHHHHIH!HHhhHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!");
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I", (int) '4', "hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHhhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!I!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I" + "'", str4, "HHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHhhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!I!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I");
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        char[] charArray6 = new char[] { '4', '4' };
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!HhI!IhI!HhI!!", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("hHi!hHi!iHi!hHi!!", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ih", charArray6);
        java.lang.Class<?> wildcardClass11 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Hi!" + "'", str7, "Hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str8, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "h" + "'", str9, "h");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hhi!hhi!ih" + "'", str10, "hhi!hhi!ih");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        char[] charArray6 = new char[] { '4', '4' };
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray6);
        java.lang.Class<?> wildcardClass11 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Hi!" + "'", str7, "Hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!" + "'", str1, "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!");
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhiHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhiHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str1, "hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhiHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        char[] charArray14 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("h", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("hHI!IHI!!", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!IHI!!", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "h" + "'", str21, "h");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhi!ihi!!" + "'", str22, "Hhi!ihi!!");
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhhhih!hhhhhih!hihhhhhhih!hhhhih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHHHHHIH!HHHHHIH!HIHHHHHHIH!HHHHIH!" + "'", str1, "HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHHHHHIH!HHHHHIH!HIHHHHHHIH!HHHHIH!");
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        char[] charArray8 = new char[] { '4', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!", charArray8);
        java.lang.Class<?> wildcardClass15 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hI!" + "'", str11, "hI!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str14, "Hhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!" + "'", str2, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!");
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!hi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!iHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!hi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!hi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!hi!hhi!ihi!hhi!!!", (int) (byte) 10, 10, "HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhHHIH!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhi!hhi!iHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhHHIH!" + "'", str4, "hhhi!hhi!iHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhHHIH!");
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I" + "'", str1, "HHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I");
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHHIH!HHhhih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhi!hhi!ihHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHHIH!HHhhih!" + "'", str1, "hhi!hhi!ihHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHHIH!HHhhih!");
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        char[] charArray15 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray15);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("h", charArray15);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray15);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("hhI!HhI!IhI!HhI!!", charArray15);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!HhI!IhI!HhI!!", charArray15);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhHHIH!", charArray15);
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhHHIH!" + "'", str24, "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhHHIH!");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        char[] charArray16 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray16);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("h", charArray16);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray16);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.initials("HHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!", charArray16);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhih!hHhih!HHhih!HHhih!HHhih!IHhih!HHhih!!Hhih!HHhih!HHhih!hHhih!hHhih!iHhih!hHhih!!", charArray16);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!", charArray16);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.initials("hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", charArray16);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H" + "'", str21, "H");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhih!" + "'", str22, "Hhih!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H" + "'", str23, "H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!" + "'", str24, "Hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str25, "hhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "h" + "'", str26, "h");
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HhHHI!HHI!HhHI!HHI!IhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhHHI!HHI!HhHI!HHI!IhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!" + "'", str1, "HhHHI!HHI!HhHI!HHI!IhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!");
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        char[] charArray11 = new char[] { '4', '4' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("HHI!IHI!!", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray11);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hI!" + "'", str14, "hI!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hHI!IHI!!" + "'", str18, "hHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HI!" + "'", str19, "HI!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str20, "Hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        char[] charArray10 = new char[] { '4', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("h", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("HHIH!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hhi!!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHI!HHI!IhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("HhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hI!" + "'", str12, "hI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hhi!!" + "'", str16, "Hhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!" + "'", str17, "Hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!", (int) ' ', "HhHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!" + "'", str4, "HHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!");
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHhi!ihi!!hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHhi!ihi!!hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!" + "'", str1, "HHhi!ihi!!hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!");
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhHHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!i!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!", (int) ' ', (-1), "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhhhih!hhhhhih!hihhhhhhih!hhhhih!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhHHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!i!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!" + "'", str4, "hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhHHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!i!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!");
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        char[] charArray10 = new char[] { '4', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("h", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("Hhi!ihi!!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("HhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhih!hhhihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hI!" + "'", str12, "hI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhih!hhhihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i" + "'", str18, "Hhhih!hhhihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i");
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        char[] charArray7 = new char[] { '4', '4' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!IHI!!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hi!" + "'", str8, "Hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hI!" + "'", str10, "hI!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hhi!ihi!!" + "'", str11, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str12, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhi!iHhhi!hhi!ihi!hhi!!hhhihHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhihhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str1, "Hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhihhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!", (int) '#', "hHI!IHI!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!" + "'", str4, "HHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!");
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhih!hHhih!HHhih!HHhih!HHhih!IHhih!HHhih!!Hhih!HHhih!HHhih!hHhih!hHhih!iHhih!hHhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!" + "'", str1, "Hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!");
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHHI!HHI!Ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!", (int) (byte) 100, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHhi!HHIH!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHI!HHI!Ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str4, "hHHI!HHI!Ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        char[] charArray15 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray15);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray15);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray15);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray15);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!", charArray15);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.uncapitalize("hHIH!", charArray15);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.uncapitalize("HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!", charArray15);
        java.lang.Class<?> wildcardClass25 = charArray15.getClass();
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!" + "'", str24, "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        char[] charArray6 = new char[] { '4', '4' };
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!HhI!IhI!HhI!!", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("hHi!hHi!iHi!hHi!!", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Hi!" + "'", str7, "Hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str8, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "h" + "'", str9, "h");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        char[] charArray13 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("h", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhi!iHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhih!" + "'", str19, "Hhih!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str20, "Hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        char[] charArray8 = new char[] { '4', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihi!hhi!!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hHIH!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str12, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HHIH!" + "'", str14, "HHIH!");
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!" + "'", str1, "hHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!");
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
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
        java.lang.String str27 = org.apache.commons.lang.WordUtils.capitalize("hHIH!", charArray17);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!", charArray17);
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "HHIH!" + "'", str27, "HHIH!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str28, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HhhHIH!HhHIH!hhHIH!hhHIH!hhHIH!ihHIH!hhHIH!!hHIH!hhHIH!hhHIH!HhHIH!HhHIH!IhHIH!HhHIH!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!" + "'", str1, "Hhhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!");
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhih!hhhihhih!hhhi!hhi!ihhih!hi!hhi!!hhhhih!hi!hhi!ihihhih!!hhi!!ihhihhih!!hhi!ihi!hhhih!hi!!!hhi!hhHhi!hhi!iHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!", (int) (byte) 0, (int) (short) -1, "hHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHhHHHIH!HHHHHIH!HIHhhHHHIH!HHhhih!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhih!hhhihhih!hhhi!hhi!ihhih!hi!hhi!!hhhhih!hi!hhi!ihihhih!!hhi!!ihhihhih!!hhi!ihi!hhhih!hi!!!hhi!hhHhi!hhi!iHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!" + "'", str4, "hhhih!hhhihhih!hhhi!hhi!ihhih!hi!hhi!!hhhhih!hi!hhi!ihihhih!!hhi!!ihhihhih!!hhi!ihi!hhhih!hi!!!hhi!hhHhi!hhi!iHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!");
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        char[] charArray12 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("HI!", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhih!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("HhhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHI!HHI!Ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhih!" + "'", str16, "Hhih!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HhhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!" + "'", str17, "HhhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str18, "Hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHhhih!", 0, (int) '#', "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!" + "'", str4, "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!");
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHHhHI!IHI!!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHHhHI!IHI!!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str2, "hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHHhHI!IHI!!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!" + "'", str1, "hHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!");
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHHIH!HHHIHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!H!IHHIH!!HHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HIH!IHHIH!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHHIH!IHHIHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!H!!HHIH!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!h!ihhih!!hhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hih!ihhih!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhhih!ihhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!h!!hhih!!" + "'", str1, "hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!h!ihhih!!hhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hih!ihhih!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhhih!ihhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!h!!hhih!!");
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIHHHHI!HHI!IHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIHHHHI!HHI!IHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!" + "'", str1, "hHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIHHHHI!HHI!IHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!");
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHhi!HHIH!", (int) (byte) 1, (int) (short) 100, "hHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!" + "'", str4, "hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!");
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhhhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHIHhhih!hhhihhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!", 100, "HhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHHhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhhhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHIHhhih!hhhihhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!" + "'", str4, "hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhhhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHIHhhih!hhhihhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!");
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!i!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!", (int) (short) 100, "HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!i!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str4, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!i!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!I!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!I!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!" + "'", str1, "hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!I!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!");
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhih!hhhihhi!hhi!ihi!hhi!!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhih!hhhihhi!hhi!ihi!hhi!!" + "'", str2, "Hhhih!hhhihhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!ihi!!!", (int) (short) -1, (int) (short) -1, "hhhi!hhi!iHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhHHIH!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!ihi!!!" + "'", str4, "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!ihi!!!");
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.initials("hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h" + "'", str2, "h");
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i" + "'", str1, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i");
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhiHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhiHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str2, "hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhiHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!hHHI!IHI!!Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!hHHI!IHI!!Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str2, "hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!hHHI!IHI!!Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHhhi!hhi!hHhi!hhi!iHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!", (int) (byte) 10, "HhhHHHIH!Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!HHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhhi!hhi!hHhi!hhi!iHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!" + "'", str4, "HHhhi!hhi!hHhi!hhi!iHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!");
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hhi!!", (int) (byte) 100, "HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHHHHHIH!HHHHHIH!HIHHHHHHIH!HHHHIH!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hhi!!" + "'", str4, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hhi!!");
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHIH!HHHIHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!" + "'", str1, "HHHIH!HHHIHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!");
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        char[] charArray14 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("HI!", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihi!hhi!!", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("Hhhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!ihi!!!", charArray14);
        java.lang.Class<?> wildcardClass23 = charArray14.getClass();
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str19, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str20, "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hhhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!" + "'", str21, "Hhhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!ihi!!!" + "'", str22, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!ihi!!!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhh" + "'", str1, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhh");
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!IHhhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHhi!HHIH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHhi!HHIH!" + "'", str1, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHhi!HHIH!");
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHhhhih!hhhhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!I!HhI!!", 100, "hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhiHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!h!hhhih!hhhih!hhhih!ihhih!hhhih!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHhhhih!hhhhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHIhhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhiHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!h!hhhih!hhhih!hhhih!ihhih!hhhih!!!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHhhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhiHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!h!hhhih!hhhih!hhhih!ihhih!hhhih!!I!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!I!HhI!!" + "'", str4, "hHhhhih!hhhhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHIhhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhiHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!h!hhhih!hhhih!hhhih!ihhih!hhhih!!!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHhhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhiHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!h!hhhih!hhhih!hhhih!ihhih!hhhih!!I!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!I!HhI!!");
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHI!HHI!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhi!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!" + "'", str1, "Hhhi!hhi!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!");
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhih!hhhHhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhih!hhhHhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!" + "'", str1, "hhhhih!hhhHhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHHhHI!IHI!!hhHI!IHI!!ihHI!IHI!!hhHI!IHI!!!", 0, "hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHHhHI!IHI!!hhHI!IHI!!ihHI!IHI!!hhHI!IHI!!!" + "'", str4, "HhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHHhHI!IHI!!hhHI!IHI!!ihHI!IHI!!hhHI!IHI!!!");
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str1, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHhhhih!hhhhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!I!HhI!!", (int) (byte) 10, (int) (short) 1, "hHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!ihi!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHhhhih!hhhHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!ihi!!!" + "'", str4, "hHhhhih!hhhHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!ihi!!!");
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i" + "'", str1, "hhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i");
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HhhHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!" + "'", str1, "Hhhhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHhhi!hhi!hHHHHIH!HHHHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHIH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHhhi!hhi!hHHHHIH!HHHHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHIH!" + "'", str1, "hHhhi!hhi!hHHHHIH!HHHHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHIH!");
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        char[] charArray7 = new char[] { '4', '4' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!HhI!IhI!HhI!!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("HhhHHHIH!Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hi!" + "'", str8, "Hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str9, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HI!" + "'", str10, "HI!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str11, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HhhHHHIH!Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str12, "HhhHHHIH!Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        char[] charArray11 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("HHIH!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "h" + "'", str16, "h");
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        char[] charArray13 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("HHI!HHI!IHI!HHI!!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("HHIH!", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhih!" + "'", str18, "Hhih!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str19, "Hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i" + "'", str20, "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i");
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!", (int) (byte) 10, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhHhhhhih!hhhhHHHIH!HHHHHIH!HIHHHIhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!H!HHHHHIH!HhHHHIH!HHhhih!hhih!i!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hHhhhhih!hhhhHHHIH!HHHHHIH!HIHHHIhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!H!HHHHHIH!HhHHHIH!HHhhih!hhih!hi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhiHhhhhih!hhhhHHHIH!HHHHHIH!HIHHHIhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!H!HHHHHIH!HhHHHIH!HHhhih!hhih!!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!" + "'", str4, "Hhhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHHHIH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHHHIH!" + "'", str1, "hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHHHIH!");
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        char[] charArray11 = new char[] { '4', '4' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("h", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("Hhi!ihi!!", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("HhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!!", charArray11);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("hHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hI!" + "'", str13, "hI!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "h" + "'", str14, "h");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "h" + "'", str19, "h");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!" + "'", str20, "hHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!");
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        char[] charArray9 = new char[] { '#', '4', '4', '4', '4', '#' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihi!hhi!!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("HhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHHIH!HHhhih!", charArray9);
        java.lang.Class<?> wildcardClass13 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', '4', '4', '4', '4', '#' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str10, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str11, "Hhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhhhih!hhHHHHIH!HHHhHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhih!hhhhhhih!hhhhhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!" + "'", str1, "Hhhhhih!hhhhhhih!hhhhhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        char[] charArray9 = new char[] { '4', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("Hhhhih!hhhhhih!hihhhih!hhhhhih!h!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("hHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("HhHIH!HhHIH!hhHIH!hhHIH!hhHIH!ihHIH!hhHIH!!hHIH!hhHIH!hhHIH!HhHIH!HhHIH!IhHIH!HhHIH!!", charArray9);
        java.lang.Class<?> wildcardClass17 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hI!" + "'", str12, "hI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhhhih!hhhhhih!hihhhih!hhhhhih!h!" + "'", str14, "Hhhhih!hhhhhih!hihhhih!hhhhhih!h!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hhi!!" + "'", str15, "Hhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhHIH!HhHIH!hhHIH!hhHIH!hhHIH!ihHIH!hhHIH!!hHIH!hhHIH!hhHIH!HhHIH!HhHIH!IhHIH!HhHIH!!" + "'", str16, "hhHIH!HhHIH!hhHIH!hhHIH!hhHIH!ihHIH!hhHIH!!hHIH!hhHIH!hhHIH!HhHIH!HhHIH!IhHIH!HhHIH!!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
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
        java.lang.String str32 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!", charArray19);
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "h" + "'", str30, "h");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "h" + "'", str31, "h");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!" + "'", str32, "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("", (int) (short) 0, (int) (byte) 0, "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHhi!ihi!!hHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHhi!ihi!!hHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHH" + "'", str1, "hHhi!ihi!!hHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHH");
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!hhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!" + "'", str1, "hHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!");
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHHHHIH!HHhhHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHHIH!HHhhHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!" + "'", str1, "hHHHHIH!HHhhHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!");
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!" + "'", str1, "Hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!");
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        char[] charArray8 = new char[] { '4', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!HhI!IhI!HhI!!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhih!hHhih!HHhih!HHhih!HHhih!IHhih!HHhih!!Hhih!HHhih!HHhih!hHhih!hHhih!iHhih!hHhih!!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("HhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str10, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!" + "'", str13, "Hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!" + "'", str14, "hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!");
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HhhHHHIH!Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhi!hhi!ihhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str1, "hhi!hhi!ihhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        char[] charArray7 = new char[] { '4', '4' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!HhI!IhI!HhI!!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("hHi!hHi!iHi!hHi!!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("HhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!I!HhI!!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHHhHI!IHI!!hhHI!IHI!!ihHI!IHI!!hhHI!IHI!!!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hi!" + "'", str8, "Hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str9, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "h" + "'", str10, "h");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!I!HhI!!" + "'", str11, "HhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!I!HhI!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "h" + "'", str12, "h");
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!IHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!ihi!!!" + "'", str1, "hHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!ihi!!!");
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
        char[] charArray13 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("HI!", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("hHI!IHI!!", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("hhHI!IHI!!hhHI!IHI!!ihHI!IHI!!hhHI!IHI!!!", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!ihi!!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "h" + "'", str16, "h");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HhHI!IHI!!hhHI!IHI!!ihHI!IHI!!hhHI!IHI!!!" + "'", str18, "HhHI!IHI!!hhHI!IHI!!ihHI!IHI!!hhHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I" + "'", str19, "HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hhi!ihi!!" + "'", str20, "hhi!ihi!!");
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHHHIH!", (int) (short) 1, "HHhhi!hhi!hHHHHIH!HHHHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHIH!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHHHIH!" + "'", str4, "hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHHHIH!");
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        char[] charArray15 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray15);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("HhI!HhI!IhI!HhI!!", charArray15);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("hhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i", charArray15);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("hHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!", charArray15);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIH!IhHIH!!hHIH!!", charArray15);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.initials("Hhhi!hhi!iHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hi!" + "'", str19, "Hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hhI!HhI!IhI!HhI!!" + "'", str20, "hhI!HhI!IhI!HhI!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i" + "'", str21, "hhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!" + "'", str22, "HHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hhhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!" + "'", str23, "Hhhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H" + "'", str24, "H");
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        char[] charArray10 = new char[] { '4', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("h", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("h", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("HHIH!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("hhi!ihi!!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhhhih!hhhhhih!hihhhhhhih!hhhhih!", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hI!" + "'", str12, "hI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhih!" + "'", str15, "Hhih!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhi!ihi!!" + "'", str16, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!" + "'", str18, "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!");
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhhhih!hhhhHHHIH!HHHHHIH!HIHHHIhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!H!HHHHHIH!HhHHHIH!HHhhih!hhih!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhhih!hhhhHHHIH!HHHHHIH!HIHHHIhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!H!HHHHHIH!HhHHHIH!HHhhih!hhih!" + "'", str2, "Hhhhhih!hhhhHHHIH!HHHHHIH!HIHHHIhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!H!HHHHHIH!HhHHHIH!HHhhih!hhih!");
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HhHHHIH!HHhhih!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HhHHHIH!HHhhih!" + "'", str2, "HhHHHIH!HHhhih!");
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("", (int) 'a', (-1), "hHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHi!hHi!iHHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhi!ihi!!" + "'", str1, "Hhi!hhi!ihhhi!ihi!!");
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!I!HhI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hhi!!" + "'", str1, "Hhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hhi!!");
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
        char[] charArray14 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("hHI!HHI!IHI!HHI!!", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!i!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HHI!HHI!IHI!HHI!!" + "'", str18, "HHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "h" + "'", str19, "h");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!i!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str21, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!i!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!" + "'", str22, "hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!");
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHHHHIH!HHhHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHHIH!HHhHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!" + "'", str1, "hHHHHIH!HHhHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!");
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhhi!hhi!iHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!", (int) (short) 100, "hhhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhi!hhi!iHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str4, "hhhi!hhi!iHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
        char[] charArray14 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("HI!", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("HHIH!", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("Hhih!", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhih!hHhih!HHhih!HHhih!HHhih!IHhih!HHhih!!Hhih!HHhih!HHhih!hHhih!hHhih!iHhih!hHhih!!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!ihi!!!", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hi!" + "'", str17, "Hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhih!" + "'", str18, "Hhih!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhih!" + "'", str19, "Hhih!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!" + "'", str20, "Hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!ihi!!!" + "'", str21, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!ihi!!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str22, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        char[] charArray16 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("HI!", charArray16);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihi!hhi!!", charArray16);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray16);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("hHI!IHI!!", charArray16);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("HHIH!", charArray16);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.initials("hHI!HHI!IHI!HHI!!", charArray16);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.initials("HhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", charArray16);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihi!hhi!!", charArray16);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalize("hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHHHIH!", charArray16);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HHI!IHI!!" + "'", str21, "HHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "h" + "'", str23, "h");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H" + "'", str24, "H");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hhi!hhi!ihi!hhi!!" + "'", str25, "hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHHHIH!" + "'", str26, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHHHIH!");
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IhHHI!HHI!Ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!iHhhi!hhi!iHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!hi!" + "'", str1, "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!iHhhi!hhi!iHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!hi!");
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
        char[] charArray11 = new char[] { '4', '4' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!IHI!!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("Hhhhhih!hhhhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHHIH!HHhhih!hhih!", charArray11);
        java.lang.Class<?> wildcardClass21 = charArray11.getClass();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhhhih!hhhhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHHIH!HHhhih!hhih!" + "'", str20, "Hhhhhih!hhhhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHHIH!HHhhih!hhih!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
        char[] charArray12 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("HI!", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("hHI!IHI!!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHhhih!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "h" + "'", str15, "h");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str16, "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhHI!IHI!!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!HhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!IHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!ihi!!!" + "'", str1, "Hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!ihi!!!");
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
        char[] charArray10 = new char[] { '4', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("hHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("hHhih!hHhih!iHhih!!Hhih!iHhih!hHhihhhhi!hhi!iHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hI!" + "'", str13, "hI!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!" + "'", str16, "HHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "h" + "'", str17, "h");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str18, "Hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhi!hhi!iHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhi!hhi!iHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str2, "Hhhi!hhi!iHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHHhHI!IHI!!hhHI!IHI!!ihHI!IHI!!hhHI!IHI!!!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHHhHI!IHI!!hhHI!IHI!!ihHI!IHI!!hhHI!IHI!!!" + "'", str2, "HhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHHhHI!IHI!!hhHI!IHI!!ihHI!IHI!!hhHI!IHI!!!");
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
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
        java.lang.String str29 = org.apache.commons.lang.WordUtils.uncapitalize("HHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!!", charArray18);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.uncapitalize("HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I", charArray18);
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
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!!" + "'", str29, "hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I" + "'", str30, "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I");
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhi!hhi!ihi!hhi!!" + "'", str1, "HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
        char[] charArray17 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray17);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray17);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray17);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray17);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("h", charArray17);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray17);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalize("Hhi!ihi!!", charArray17);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray17);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalize("hHHHHIH!HHHHIH!", charArray17);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.initials("Hhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!ihhih!!hHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hih!ihhih!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hhhih!ihhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!!hhih!!", charArray17);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.uncapitalize("HHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!!", charArray17);
        java.lang.Class<?> wildcardClass29 = charArray17.getClass();
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hhih!" + "'", str23, "Hhih!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hhi!ihi!!" + "'", str24, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Hi!" + "'", str25, "Hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HHHHHIH!HHHHIH!" + "'", str26, "HHHHHIH!HHHHIH!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "H" + "'", str27, "H");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!!" + "'", str28, "hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!!");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
        char[] charArray10 = new char[] { '4', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("hHHI!IHI!!Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!hhi!iHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhHHIH!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hI!" + "'", str13, "hI!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "h" + "'", str16, "h");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!" + "'", str17, "HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!" + "'", str18, "Hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!");
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!!", (int) 'a', (-1), "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!hi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!iHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!hi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!hi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!hi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!!" + "'", str4, "hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!!");
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihI!hhhi!hhi!ihi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihI!hhhi!hhi!ihi!" + "'", str1, "Hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihI!hhhi!hhi!ihi!");
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!", (int) '4', (int) '4', "hHHHIH!HHHhHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hhHHHIH!HHHhHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!" + "'", str4, "hhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hhHHHIH!HHHhHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!");
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!i!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
        char[] charArray15 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray15);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("h", charArray15);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray15);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!", charArray15);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalizeFully("HHIH!", charArray15);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.initials("HhHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!!", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hhih!" + "'", str21, "Hhih!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str22, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hhih!" + "'", str23, "Hhih!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H" + "'", str24, "H");
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
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
        java.lang.String str27 = org.apache.commons.lang.WordUtils.initials("", charArray17);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ih", charArray17);
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "H" + "'", str28, "H");
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhhhih!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!hhih!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhhih!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!hhih!" + "'", str2, "hhhhhih!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!hhih!");
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHI!HHI!IHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!", (int) (byte) 0, 0, "hHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str4, "hHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!ihi!!!" + "'", str1, "HHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!ihi!!!");
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!", 1, "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!" + "'", str4, "HhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!");
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HhHHI!HHI!HhHI!HHI!IhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!", (int) (byte) 0, (int) (short) 10, "Hhhih!hhhihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhi!hhi!ihHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!ihi!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhHHI!HHI!Hhhih!hhhihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhi!hhi!ihHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!ihi!!!" + "'", str4, "HhHHI!HHI!Hhhih!hhhihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhi!hhi!ihHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!ihi!!!");
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhihhi!hhi!ih", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhihhi!hhi!ih" + "'", str2, "Hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhihhi!hhi!ih");
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHhi!HHIH!", 100, "hhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhihhI!HhI!Ih", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHhhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhihhI!HhI!Ihhi!HHIH!" + "'", str4, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHhhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhihhI!HhI!Ihhi!HHIH!");
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
        char[] charArray11 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("hHIH!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhhih!hhhhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHHIH!HHhhih!hhih!", charArray11);
        java.lang.Class<?> wildcardClass17 = charArray11.getClass();
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "h" + "'", str15, "h");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhhhhih!hhhhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHHIH!HHhhih!hhih!" + "'", str16, "hhhhhih!hhhhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHHIH!HHhhih!hhih!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
        char[] charArray14 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("h", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhHhhhhih!hhhhHHHIH!HHHHHIH!HIHHHIhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!H!HHHHHIH!HhHHHIH!HHhhih!hhih!i!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hHhhhhih!hhhhHHHIH!HHHHHIH!HIHHHIhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!H!HHHHHIH!HhHHHIH!HHhhih!hhih!hi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhiHhhhhih!hhhhHHHIH!HHHHHIH!HIHHHIhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!H!HHHHHIH!HhHHHIH!HHhhih!hhih!!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhih!" + "'", str20, "Hhih!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhhhhhhih!hhhhhhhih!hhhhhih!hihhhihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!h!hhhhhih!hhhhhih!hhhhih!hhih!i!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhhhhhih!hhhhhhhih!hhhhhih!hihhhihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!h!hhhhhih!hhhhhih!hhhhih!hhih!hi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhihhhhhih!hhhhhhhih!hhhhhih!hihhhihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!h!hhhhhih!hhhhhih!hhhhih!hhih!!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str22, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhhhhhhih!hhhhhhhih!hhhhhih!hihhhihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!h!hhhhhih!hhhhhih!hhhhih!hhih!i!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhhhhhih!hhhhhhhih!hhhhhih!hihhhihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!h!hhhhhih!hhhhhih!hhhhih!hhih!hi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhihhhhhih!hhhhhhhih!hhhhhih!hihhhihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!h!hhhhhih!hhhhhih!hhhhih!hhih!!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HhhHHHIH!Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!HHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhhHHHIH!Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!HHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!" + "'", str1, "HhhHHHIH!Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!HHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!");
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
        char[] charArray12 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("HI!", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhih!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("HhhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhih!" + "'", str16, "Hhih!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HhhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!" + "'", str17, "HhhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHHHHIH!HHHHIH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhhih!hhhhih!" + "'", str1, "hhhhhih!hhhhih!");
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HhHHI!HHI!HhHI!HHI!IhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!", (int) (byte) 0, (int) (short) 0, "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!HhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHHhHI!IHI!!hhHI!IHI!!ihHI!IHI!!hhHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!HhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHHhHI!IHI!!hhHI!IHI!!ihHI!IHI!!hhHI!IHI!!!" + "'", str4, "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!HhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHHhHI!IHI!!hhHI!IHI!!ihHI!IHI!!hhHI!IHI!!!");
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", 100, (int) (short) 100, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!iHhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!" + "'", str4, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!iHhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!");
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHHIH!" + "'", str1, "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHHIH!");
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihI!hhhi!hhi!ihi!", (int) (short) -1, (int) '#', "HHHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhHHHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!" + "'", str4, "hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhHHHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!");
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hhi!!" + "'", str1, "Hhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hhi!!");
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
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
        java.lang.String str29 = org.apache.commons.lang.WordUtils.capitalize("hhI!HhI!Ih", charArray18);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHH", charArray18);
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
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "HhI!HhI!Ih" + "'", str29, "HhI!HhI!Ih");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhh" + "'", str30, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhh");
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!" + "'", str2, "HHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!");
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhhHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!", (int) ' ', "hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhhhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHIHhhih!hhhihhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!" + "'", str4, "hhhHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!");
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str1, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHHI!HHI!IhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHHHIH!HHHhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHIH!HIHHHhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!IH!HHHHHIHhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!!H!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHI!HHI!IhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHHHIH!HHHhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHIH!HIHHHhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!IH!HHHHHIHhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!!H!" + "'", str1, "HHHI!HHI!IhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHHHIH!HHHhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHIH!HIHHHhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!IH!HHHHHIHhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!!H!");
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
        char[] charArray8 = new char[] { ' ', '#', '#', '4', ' ', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { ' ', '#', '#', '4', ' ', '4' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "h" + "'", str9, "h");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!" + "'", str10, "HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!");
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhHhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str1, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhHhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!ihi!!!", (-1), (int) (byte) 1, "hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhi!hhi!ihi!hhi!!" + "'", str4, "hhhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!", (int) '#', "HHHI!HHI!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhHHHI!HHI!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!i!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hHHHI!HHI!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!HHHI!HHI!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhHHHI!HHI!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!i!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hHHHI!HHI!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHHI!HHI!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihiHHHI!HHI!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!hhi!!!i!hHi!!" + "'", str4, "HHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhHHHI!HHI!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!i!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hHHHI!HHI!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!HHHI!HHI!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhHHHI!HHI!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!i!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hHHHI!HHI!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHHI!HHI!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihiHHHI!HHI!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!hhi!!!i!hHi!!");
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
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
        java.lang.String str31 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhi!ihi!!hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!", charArray19);
        java.lang.String str32 = org.apache.commons.lang.WordUtils.capitalize("Hhhih!hhhiHhi!hhi!ihi!hhi!!", charArray19);
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str31, "Hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Hhhih!hhhiHhi!hhi!ihi!hhi!!" + "'", str32, "Hhhih!hhhiHhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
        char[] charArray14 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("h", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("hhHI!HHI!IhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HI!" + "'", str20, "HI!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I" + "'", str21, "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "h" + "'", str22, "h");
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
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
        java.lang.String str33 = org.apache.commons.lang.WordUtils.initials("Hhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!ihhih!!hHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hih!ihhih!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hhhih!ihhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!!hhih!!", charArray20);
        java.lang.String str34 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!", charArray20);
        java.lang.Class<?> wildcardClass35 = charArray20.getClass();
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
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "H" + "'", str33, "H");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str34, "hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
        char[] charArray11 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("HHIH!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!hhi!iHhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhih!" + "'", str13, "Hhih!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "h" + "'", str14, "h");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "h" + "'", str15, "h");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhhi!hhi!iHhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!" + "'", str16, "hhhi!hhi!iHhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!");
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!iHhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!" + "'", str2, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!");
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHHHIH!HHHHIH!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHHHIH!HHHHIH!" + "'", str2, "HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHHHIH!HHHHIH!");
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHHIH!HHHIhhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIHHi!hHi!iH", (int) (byte) -1, (int) (byte) 10, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihhHhhi!hhi!hHHHHIH!HHHHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHIH!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHIH!HHHIHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihhHhhi!hhi!hHHHHIH!HHHHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHIH!" + "'", str4, "HHHIH!HHHIHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihhHhhi!hhi!hHHHHIH!HHHHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHIH!");
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHHIH!HHhhih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHhhhih!hhhhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!I!HhI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHhhhih!hhhhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!I!HhI!!" + "'", str1, "hHhhhih!hhhhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!I!HhI!!");
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!" + "'", str1, "HHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!");
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
        char[] charArray13 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("HI!", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("hHI!IHI!!", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("HhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("hhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!IHI!!!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "h" + "'", str16, "h");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!" + "'", str17, "HhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str18, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!!" + "'", str19, "hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!IHI!!!" + "'", str20, "HhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!IHI!!!");
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i" + "'", str2, "hhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i");
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHI!HHI!IHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!" + "'", str1, "hHHI!HHI!IHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!");
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
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
        java.lang.String str32 = org.apache.commons.lang.WordUtils.capitalize("hHIH!", charArray22);
        java.lang.String str33 = org.apache.commons.lang.WordUtils.uncapitalize("HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!", charArray22);
        java.lang.String str34 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!HHI!IHI!HHI!!", charArray22);
        java.lang.String str35 = org.apache.commons.lang.WordUtils.uncapitalize("hHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!", charArray22);
        java.lang.String str36 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHHIH!HHHHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHIH!", charArray22);
        java.lang.String str37 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!", charArray22);
        java.lang.String str38 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!hhi!iHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhHHIH!", charArray22);
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "HHIH!" + "'", str32, "HHIH!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!" + "'", str33, "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hHI!HHI!IHI!HHI!!" + "'", str34, "hHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!" + "'", str35, "hHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hHHHHIH!HHHHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHIH!" + "'", str36, "hHHHHIH!HHHHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHIH!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str37, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!" + "'", str38, "Hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!");
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str1, "hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhh", (int) ' ', "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!H!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!HHhh" + "'", str4, "hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!H!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!HHhh");
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
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
        java.lang.String str32 = org.apache.commons.lang.WordUtils.initials("hHhhhih!hhHHIH!", charArray21);
        java.lang.String str33 = org.apache.commons.lang.WordUtils.initials("hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", charArray21);
        java.lang.String str34 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!", charArray21);
        java.lang.String str35 = org.apache.commons.lang.WordUtils.capitalize("", charArray21);
        java.lang.String str36 = org.apache.commons.lang.WordUtils.capitalize("HhHHHIH!HHhhih!", charArray21);
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "h" + "'", str32, "h");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "h" + "'", str33, "h");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!" + "'", str34, "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "HhHHHIH!HHhhih!" + "'", str36, "HhHHHIH!HHhhih!");
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
        char[] charArray5 = new char[] { '4' };
        java.lang.String str6 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhh", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("hhhhih!hhhhhih!hihhhih!hhhhhih!h!", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("hhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIH!IhHIH!!hHIH!!", charArray5);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("HhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4' });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhh" + "'", str6, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhh");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Hhhhih!hhhhhih!hihhhih!hhhhhih!h!" + "'", str7, "Hhhhih!hhhhhih!hihhhih!hhhhhih!h!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIH!IhHIH!!hHIH!!" + "'", str8, "hhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIH!IhHIH!!hHIH!!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!" + "'", str9, "HhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!");
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhi!hhi!ihi!hhi!!", 10, (int) (byte) 1, "HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhi!hhi!iHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhi!hhi!ihi!hhi!!" + "'", str4, "hhhi!hhi!iHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!" + "'", str1, "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!");
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
        char[] charArray16 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray16);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("h", charArray16);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray16);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.initials("hhI!HhI!IhI!HhI!!", charArray16);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalize("hhI!HhI!IhI!HhI!!", charArray16);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalize("hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I", charArray16);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.initials("hhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIH!IhHIH!!hHIH!!", charArray16);
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HhI!HhI!IhI!HhI!!" + "'", str24, "HhI!HhI!IhI!HhI!!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I" + "'", str25, "HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "h" + "'", str26, "h");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhHhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhHhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str1, "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhHhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", (int) (short) 10, (int) (byte) 1, "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IhHHI!HHI!Ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!HI!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhHHHIH!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IhHHI!HHI!Ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!HI!" + "'", str4, "hhHHHIH!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IhHHI!HHI!Ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!HI!");
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HhHhhhih!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HhHhhhih!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!" + "'", str2, "HhHhhhih!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!");
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
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
        java.lang.String str26 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhih!hhhihhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!", charArray16);
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hhhih!hhhihhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!" + "'", str26, "hhhih!hhhihhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!");
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhi!hhi!ihhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!hi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHHHI!HHI!IHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHHHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!HI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!" + "'", str1, "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHHHI!HHI!IHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHHHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!HI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!");
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
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
        java.lang.String str32 = org.apache.commons.lang.WordUtils.initials("hHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!", charArray19);
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "h" + "'", str32, "h");
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
        char[] charArray9 = new char[] { '4', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("hHhi!ihi!!hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hI!" + "'", str12, "hI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str15, "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hHhi!ihi!!hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!" + "'", str16, "hHhi!ihi!!hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!");
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhhi!hhi!hhhhhih!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!hhih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
        char[] charArray10 = new char[] { '4', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("Hhhhih!hhhhhih!hihhhih!hhhhhih!h!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("hhHIH!HhHIH!hhHIH!hhHIH!hhHIH!ihHIH!hhHIH!!hHIH!hhHIH!hhHIH!HhHIH!HhHIH!IhHIH!HhHIH!!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("hhHI!IHI!!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!HhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!IHI!!!", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("HhHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!", charArray10);
        java.lang.Class<?> wildcardClass19 = charArray10.getClass();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hI!" + "'", str13, "hI!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhhhih!hhhhhih!hihhhih!hhhhhih!h!" + "'", str15, "Hhhhih!hhhhhih!hihhhih!hhhhhih!h!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "h" + "'", str16, "h");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hhHI!IHI!!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!HhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!IHI!!!" + "'", str17, "hhHI!IHI!!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!HhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!IHI!!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhih!hhhihhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhih!hhhihhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!" + "'", str2, "Hhhih!hhhihhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!");
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHhhi!hhi!hHHHHIH!HHHHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHIH!", (int) (short) 10, "HHHIH!HHHIHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihhHhhi!hhi!hHHHHIH!HHHHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHIH!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhhi!hhi!hHHHHIH!HHHHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHIH!" + "'", str4, "HHhhi!hhi!hHHHHIH!HHHHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHIH!");
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
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
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!HhI!Ih", charArray15);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.capitalize("", charArray15);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.uncapitalize("HHI!HHI!IH", charArray15);
        java.lang.Class<?> wildcardClass29 = charArray15.getClass();
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Hhi!hhi!ih" + "'", str26, "Hhi!hhi!ih");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hHI!HHI!IH" + "'", str28, "hHI!HHI!IH");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhHhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhHhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str1, "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhHhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhi!hhi!ihhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str1, "Hhi!hhi!ihhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
        char[] charArray11 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("HHIH!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHhi!HHIH!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhih!" + "'", str13, "Hhih!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "h" + "'", str14, "h");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str15, "hhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHhi!HHIH!" + "'", str16, "hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHhi!HHIH!");
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
        char[] charArray13 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("HI!", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhih!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("HhhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("HhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!IHI!!!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("hhi!hhi!ih", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hi!" + "'", str16, "Hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhih!" + "'", str17, "Hhih!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HhhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!" + "'", str18, "HhhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "h" + "'", str20, "h");
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhhhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHIHhhih!hhhihhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!", (-1), (-1), "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!hi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!iHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!hi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!hi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!hi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhhhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHIHhhih!hhhihhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!" + "'", str4, "hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhhhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHIHhhih!hhhihhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!");
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HhHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!hHHI!IHI!!Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!ihi!!!", (int) (byte) 0, 100, "hhi!hhi!ihhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhi!hhi!ihhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str4, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhi!hhi!ihhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
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
        java.lang.String str34 = org.apache.commons.lang.WordUtils.capitalize("hHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!", charArray20);
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "HHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str34, "HHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("", 0, 0, "hhHI!IHI!!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!HhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!IHI!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!i!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!", (int) (byte) -1, (int) (byte) 10, "hhhih!hhhiHhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhhih!hhhhhih!hhhiHhi!hhi!ihi!hhi!!" + "'", str4, "Hhhhhih!hhhhhih!hhhiHhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
        char[] charArray14 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("hHIH!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("HHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!iiHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!iiHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!iiHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i!", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hi!" + "'", str17, "Hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HI!" + "'", str19, "HI!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HHIH!" + "'", str20, "HHIH!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str21, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihh", (int) 'a', (int) ' ', "hHhhhih!hhhhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHIhhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhiHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!h!hhhih!hhhih!hhhih!ihhih!hhhih!!!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHhhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhiHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!h!hhhih!hhhih!hhhih!ihhih!hhhih!!I!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!I!HhI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhHhhhih!hhhhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHIhhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhiHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!h!hhhih!hhhih!hhhih!ihhih!hhhih!!!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHhhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhiHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!h!hhhih!hhhih!hhhih!ihhih!hhhih!!I!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!I!HhI!!" + "'", str4, "hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhHhhhih!hhhhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHIhhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhiHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!h!hhhih!hhhih!hhhih!ihhih!hhhih!!!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHhhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhiHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!h!hhhih!hhhih!hhhih!ihhih!hhhih!!I!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!I!HhI!!");
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!" + "'", str1, "hHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!");
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IIhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I!hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IIhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IIhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I!hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IIhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I!hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IIhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IIhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I!hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I!" + "'", str1, "HhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IIhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I!hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IIhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IIhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I!hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I!");
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
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
        java.lang.String str30 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhhih!hhhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i", charArray18);
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hhhhhih!hhhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i" + "'", str30, "hhhhhih!hhhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i");
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!ihi!!!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!ihi!!!" + "'", str2, "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!ihi!!!");
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhhhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHIHhhih!hhhihhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHHHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihihHHIH!HHHIHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhHhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str1, "hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHHHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihihHHIH!HHHIHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhHhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhHhhhih!hhhhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHIhhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhiHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!h!hhhih!hhhih!hhhih!ihhih!hhhih!!!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHhhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhiHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!h!hhhih!hhhih!hhhih!ihhih!hhhih!!I!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!I!HhI!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhhhhih!hhhhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhihhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!h!hhhih!hhhih!hhhih!ihhih!hhhih!!!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihhhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!h!hhhih!hhhih!hhhih!ihhih!hhhih!!i!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hhi!!" + "'", str2, "Hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhhhhih!hhhhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhihhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!h!hhhih!hhhih!hhhih!ihhih!hhhih!!!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihhhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!h!hhhih!hhhih!hhhih!ihhih!hhhih!!i!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hhi!!");
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I" + "'", str1, "hHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I");
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!HHHIH!HHHIH!HHHIH!HHHIH!HHHIH!IHHIH!HHHIH!!HHIH!HHHIH!HHHIH!HHHIH!HHHIH!IHHIH!HHHIH!!" + "'", str1, "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!HHHIH!HHHIH!HHHIH!HHHIH!HHHIH!IHHIH!HHHIH!!HHIH!HHHIH!HHHIH!HHHIH!HHHIH!IHHIH!HHHIH!!");
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str2, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!HHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!IHI!!!" + "'", str1, "hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!HHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!IHI!!!");
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
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
        java.lang.String str33 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHH", charArray20);
        java.lang.String str34 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhHI!HHI!IHI!HHI!!", charArray20);
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
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhh" + "'", str33, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhh");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhHI!HHI!IHI!HHI!!" + "'", str34, "hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhHI!HHI!IHI!HHI!!");
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHhhi!hhi!iHhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!HI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhi!hhi!ihhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!hi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str1, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhi!hhi!ihhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!hi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!ihi!!!", 10, "Hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhhih!hhHhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!hhhih!hihhHhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!hih!hhhhhiHhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!h!h!hhhhhiHhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!h!hhhhhih!Hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!hihhhi!ihiHhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!!hhhi!ihiHhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!!ihhi!ihiHhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!!hhhi!hhhHhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!ih!hhhih!iHhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!hhih!!hhihHhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhih!hhhHhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!ih!ihhih!!Hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!hhih!ihhihHhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhih!ihhHhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!ih!!hhih!hHhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!hhih!hhhihHhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhih!!hhHhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!ih!!ihi!!!" + "'", str4, "Hhhhhih!hhHhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!hhhih!hihhHhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!hih!hhhhhiHhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!h!h!hhhhhiHhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!h!hhhhhih!Hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!hihhhi!ihiHhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!!hhhi!ihiHhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!!ihhi!ihiHhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!!hhhi!hhhHhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!ih!hhhih!iHhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!hhih!!hhihHhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhih!hhhHhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!ih!ihhih!!Hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!hhih!ihhihHhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhih!ihhHhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!ih!!hhih!hHhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!hhih!hhhihHhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhih!!hhHhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!ih!!ihi!!!");
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhHhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhHhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str2, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhHhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhhih!hhhihhih!hhhi!hhi!ihhih!hi!hhi!!hhhhih!hi!hhi!ihihhih!!hhi!!ihhihhih!!hhi!ihi!hhhih!hi!!!hhi!hhhih!hi!ihi!hhihhih!!!ihhi!hhihhih!!ihi!hhi!!hhih!hhhi!hhi!i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!H!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!HHhh", (int) '4', "", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!H!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!HHhh" + "'", str4, "hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!H!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!HHhh");
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHHIH!HHHIhhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHIH!HHHIhhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHH" + "'", str1, "hHHIH!HHHIhhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHH");
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHhhi!hhi!iHhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!HI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHhhi!hhi!iHhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!HI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!" + "'", str1, "HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHhhi!hhi!iHhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!HI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!");
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
        char[] charArray14 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("HI!", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihi!hhi!!", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("hHI!IHI!!", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIH!IhHIH!!hHIH!!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("hHI!HHI!IH", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HHI!IHI!!" + "'", str19, "HHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!" + "'", str20, "Hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "h" + "'", str21, "h");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "h" + "'", str22, "h");
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str1, "Hhhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!" + "'", str1, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!");
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
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
        java.lang.String str29 = org.apache.commons.lang.WordUtils.capitalize("HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!", charArray18);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.capitalize("hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!", charArray18);
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
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!" + "'", str29, "HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str30, "Hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhh" + "'", str1, "HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhh");
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str2, "hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!HI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!Ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!HI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!HI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!HI!HHI!IHI!HHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!hi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!hi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!hi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!hi!hhi!ihi!hhi!!!" + "'", str1, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!hi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!hi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!hi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!hi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
        char[] charArray11 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("HI!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("hI!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhHhhhhih!hhhhHHHIH!HHHHHIH!HIHHHIhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!H!HHHHHIH!HhHHHIH!HHhhih!hhih!i!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hHhhhhih!hhhhHHHIH!HHHHHIH!HIHHHIhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!H!HHHHHIH!HhHHHIH!HHhhih!hhih!hi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhiHhhhhih!hhhhHHHIH!HHHHHIH!HIHHHIhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!H!HHHHHIH!HhHHHIH!HHhhih!hhih!!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhHhhhhih!hhhhHHHIH!HHHHHIH!HIHHHIhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!H!HHHHHIH!HhHHHIH!HHhhih!hhih!i!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hHhhhhih!hhhhHHHIH!HHHHHIH!HIHHHIhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!H!HHHHHIH!HhHHHIH!HHhhih!hhih!hi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhiHhhhhih!hhhhHHHIH!HHHHHIH!HIHHHIhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!H!HHHHHIH!HhHHHIH!HHhhih!hhih!!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str16, "hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhHhhhhih!hhhhHHHIH!HHHHHIH!HIHHHIhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!H!HHHHHIH!HhHHHIH!HHhhih!hhih!i!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hHhhhhih!hhhhHHHIH!HHHHHIH!HIHHHIhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!H!HHHHHIH!HhHHHIH!HHhhih!hhih!hi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhiHhhhhih!hhhhHHHIH!HHHHHIH!HIHHHIhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!H!HHHHHIH!HhHHHIH!HHhhih!hhih!!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihI!", 0, 10, "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhHHIH!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhHI!HHI!Ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhHHIH!" + "'", str4, "hhHI!HHI!Ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhHHIH!");
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHHIH!HHHIhHI!HHI!IHI!HHI!!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHIH!HHHIhHI!HHI!IHI!HHI!!" + "'", str2, "hHHIH!HHHIhHI!HHI!IHI!HHI!!");
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.uncapitalize("HHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!!" + "'", str2, "hHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!!");
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
        char[] charArray7 = new char[] { '4', '4' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihi!hhi!!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("HHHhih!hHhih!HHhih!HHhih!HHhih!IHhih!HHhih!!Hhih!HHhih!HHhih!hHhih!hHhih!iHhih!hHhih!!", charArray7);
        java.lang.Class<?> wildcardClass13 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hi!" + "'", str8, "Hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "h" + "'", str10, "h");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str11, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hHHhih!hHhih!HHhih!HHhih!HHhih!IHhih!HHhih!!Hhih!HHhih!HHhih!hHhih!hHhih!iHhih!hHhih!!" + "'", str12, "hHHhih!hHhih!HHhih!HHhih!HHhih!IHhih!HHhih!!Hhih!HHhih!HHhih!hHhih!hHhih!iHhih!hHhih!!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhihhi!hhi!ih", (int) '#', 0, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhih!hhhihhhhhih!hhhhhih!hihhhih!hHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str4, "Hhhih!hhhihhhhhih!hhhhhih!hihhhih!hHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
        char[] charArray12 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("HI!", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhih!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", charArray12);
        java.lang.Class<?> wildcardClass19 = charArray12.getClass();
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhih!" + "'", str16, "Hhih!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!" + "'", str17, "HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str18, "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
        char[] charArray12 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("HI!", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("hHI!IHI!!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("hhHI!IHI!!hhHI!IHI!!ihHI!IHI!!hhHI!IHI!!!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhhi!hhi!hHHHHIH!HHHHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHIH!", charArray12);
        java.lang.Class<?> wildcardClass19 = charArray12.getClass();
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "h" + "'", str15, "h");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HhHI!IHI!!hhHI!IHI!!ihHI!IHI!!hhHI!IHI!!!" + "'", str17, "HhHI!IHI!!hhHI!IHI!!ihHI!IHI!!hhHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhhi!hhi!hhhhhih!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!hhih!" + "'", str18, "Hhhhi!hhi!hhhhhih!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!hhih!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHHI!HHI!IhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHHHIH!HHHhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHIH!HIHHHhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!IH!HHHHHIHhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!!H!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHI!HHI!IhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHHHIH!HHHhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHIH!HIHHHhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!IH!HHHHHIHhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!!H!" + "'", str1, "HHHI!HHI!IhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHHHIH!HHHhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHIH!HIHHHhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!IH!HHHHHIHhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!!H!");
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHhhhih!hhhHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHhhi!hhi!hHhi!hhi!iHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!", 100, (int) (byte) 10, "hhHI!HHI!IhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 100, length 55");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!i!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!I!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!" + "'", str1, "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!I!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!");
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!" + "'", str2, "hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!");
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhih!hhhiHhi!hhi!ihi!hhi!!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhih!hhhiHhi!hhi!ihi!hhi!!" + "'", str2, "Hhhih!hhhiHhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhHHHIH!Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhHHHIH!Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str2, "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhHHHIH!Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhhih!hhhiHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hHHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhih!hhhiHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hHHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!" + "'", str1, "hhhih!hhhiHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hHHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!");
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
        char[] charArray12 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("hhih!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhih!" + "'", str16, "Hhih!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str17, "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str18, "hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
        char[] charArray11 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("HI!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihi!hhi!!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhih!hhhhhih!hihhhih!hhhhhih!h!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("HHhi!ihi!!hHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHH", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhhhih!hhhhhih!hihhhih!hhhhhih!h!" + "'", str15, "Hhhhih!hhhhhih!hihhhih!hhhhhih!h!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HHhi!ihi!!hHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHH" + "'", str16, "HHhi!ihi!!hHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHH");
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
        char[] charArray8 = new char[] { '4', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!HhI!IhI!HhI!!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hhi!!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhHHIH!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str10, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "h" + "'", str12, "h");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhHHIH!" + "'", str14, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhHHIH!");
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
        char[] charArray13 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("hHI!HHI!IHI!HHI!!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("hhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!", charArray13);
        java.lang.Class<?> wildcardClass21 = charArray13.getClass();
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HHI!HHI!IHI!HHI!!" + "'", str17, "HHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "h" + "'", str18, "h");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!" + "'", str20, "HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!" + "'", str1, "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!");
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
        char[] charArray12 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("hhih!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHhhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhihhI!HhI!Ihhi!HHIH!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhih!" + "'", str16, "Hhih!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str17, "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHhhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhihhI!HhI!Ihhi!HHIH!" + "'", str18, "hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHhhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhihhI!HhI!Ihhi!HHIH!");
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhhih!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!hhih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhih!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!hhih!" + "'", str1, "Hhhhhih!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!hhih!");
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
        char[] charArray11 = new char[] { '4', '4' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("h", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHhih!hHhih!HHhih!HHhih!HHhih!IHhih!HHhih!!Hhih!HHhih!HHhih!hHhih!hHhih!iHhih!hHhih!!", charArray11);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!ihi!!!", charArray11);
        java.lang.Class<?> wildcardClass21 = charArray11.getClass();
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hI!" + "'", str13, "hI!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "h" + "'", str14, "h");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "h" + "'", str15, "h");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!" + "'", str18, "hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!" + "'", str19, "Hhhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!ihi!!!" + "'", str20, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!ihi!!!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!" + "'", str1, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!");
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
        char[] charArray12 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("hHIH!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!hhi!iHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("", charArray12);
        java.lang.Class<?> wildcardClass19 = charArray12.getClass();
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "h" + "'", str16, "h");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hhhi!hhi!iHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str17, "hhhi!hhi!iHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!" + "'", str2, "HHHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!");
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHhhhhih!hHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHHHIH!HHHHIH!", (int) '#', "hHI!HHI!IHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHhhhhih!hHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHHHIH!HHHHIH!" + "'", str4, "hHhhhhih!hHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHHHIH!HHHHIH!");
    }
}

