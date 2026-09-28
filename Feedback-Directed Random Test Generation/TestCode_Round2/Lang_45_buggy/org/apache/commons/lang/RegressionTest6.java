package org.apache.commons.lang;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

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
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
        char[] charArray5 = new char[] { '4', '4' };
        java.lang.String str6 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!ihi!!!", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhhhih!hhhhhih!hhhhhih!hihhhihhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!ihhhhih!hhhhhih!hihhhih!hhhhhhhh", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hi!" + "'", str6, "Hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!ihi!!!" + "'", str7, "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!ihi!!!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hhhhhhih!hhhhhih!hhhhhih!hihhhihhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!ihhhhih!hhhhhih!hihhhih!hhhhhhhh" + "'", str8, "hhhhhhih!hhhhhih!hhhhhih!hihhhihhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!ihhhhih!hhhhhih!hihhhih!hhhhhhhh");
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        char[] charArray8 = new char[] { '4', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("h", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("h", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhHHIH!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hI!" + "'", str10, "hI!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhHHIH!" + "'", str14, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhHHIH!");
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhihhhi!ihi!!hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!", 100, (int) 'a', "HHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHhHHHIH!HHHHHIH!HIHhhHHHIH!HHhhih!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhiHHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHhHHHIH!HHHHHIH!HIHhhHHHIH!HHhhih!" + "'", str4, "Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhiHHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHhHHHIH!HHHHHIH!HIHhhHHHIH!HHhhih!");
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        char[] charArray14 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("HI!", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("HHIH!", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("HHIH!", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("Hhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!ihhih!!hHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hih!ihhih!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hhhih!ihhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!!hhih!!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhHHHHIH!HHHHIH!", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hi!" + "'", str17, "Hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhih!" + "'", str18, "Hhih!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HHIH!" + "'", str19, "HHIH!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!ihhih!!hHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hih!ihhih!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hhhih!ihhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!!hhih!!" + "'", str20, "Hhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!ihhih!!hHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hih!ihhih!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hhhih!ihhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!!hhih!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H" + "'", str21, "H");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i" + "'", str22, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i");
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        char[] charArray8 = new char[] { '4', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("h", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhHhih!hHhih!iHhih!!Hhih!iHhih!hHhihhhhi!hhi!iHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hI!" + "'", str10, "hI!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "h" + "'", str12, "h");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhih!hhhihhih!hhhi!hhi!ihhih!hi!hhi!!hhhhih!hi!hhi!ihihhih!!hhi!!ihhihhih!!hhi!ihi!hhhih!hi!!!hhi!hhhih!hi!ihi!hhihhih!!!ihhi!hhihhih!!ihi!hhi!!hhih!hhhi!hhi!i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhih!hhhihhih!hhhi!hhi!ihhih!hi!hhi!!hhhhih!hi!hhi!ihihhih!!hhi!!ihhihhih!!hhi!ihi!hhhih!hi!!!hhi!hhhih!hi!ihi!hhihhih!!!ihhi!hhihhih!!ihi!hhi!!hhih!hhhi!hhi!i" + "'", str1, "Hhhih!hhhihhih!hhhi!hhi!ihhih!hi!hhi!!hhhhih!hi!hhi!ihihhih!!hhi!!ihhihhih!!hhi!ihi!hhhih!hi!!!hhi!hhhih!hi!ihi!hhihhih!!!ihhi!hhihhih!!ihi!hhi!!hhih!hhhi!hhi!i");
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhi!hhi!ihhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!HHHIH!HHHIH!IHHI!HHI!IHHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!" + "'", str1, "HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!HHHIH!HHHIH!IHHI!HHI!IHHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!");
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        char[] charArray20 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray20);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray20);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray20);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray20);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalize("h", charArray20);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray20);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray20);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.initials("Hhih!", charArray20);
        java.lang.String str29 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray20);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i", charArray20);
        java.lang.String str31 = org.apache.commons.lang.WordUtils.uncapitalize("hI!", charArray20);
        java.lang.String str32 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!", charArray20);
        java.lang.String str33 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!", charArray20);
        java.lang.String str34 = org.apache.commons.lang.WordUtils.capitalize("hHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!", charArray20);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "H" + "'", str25, "H");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Hhih!" + "'", str26, "Hhih!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Hi!" + "'", str27, "Hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "H" + "'", str28, "H");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "HI!" + "'", str29, "HI!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i" + "'", str30, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hI!" + "'", str31, "hI!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str32, "Hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!" + "'", str33, "hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "HHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!" + "'", str34, "HHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!");
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhhi!hhi!hhhhhih!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!hhih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHI!HHI!HHHHHIH!HHHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHHHIH!HHHHIH!HHIH!" + "'", str1, "hHHHI!HHI!HHHHHIH!HHHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHHHIH!HHHHIH!HHIH!");
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        char[] charArray14 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("h", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!HHI!IH", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhih!" + "'", str20, "Hhih!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H" + "'", str21, "H");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hHI!HHI!IH" + "'", str22, "hHI!HHI!IH");
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhih!hHhiHhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str1, "Hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhiHHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhiHHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!" + "'", str1, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhiHHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!");
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        char[] charArray9 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!IHI!!!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!IHI!!!" + "'", str11, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!IHI!!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        char[] charArray15 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray15);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("h", charArray15);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray15);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!", charArray15);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.uncapitalize("HHI!HHI!IHI!HHI!!", charArray15);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!", charArray15);
        java.lang.Class<?> wildcardClass25 = charArray15.getClass();
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H" + "'", str21, "H");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str22, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hHI!HHI!IHI!HHI!!" + "'", str23, "hHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str24, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihhhih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihhhih!" + "'", str1, "hhHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihhhih!");
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHHIH!HHHIHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihhHhhi!hhi!hHHHHIH!HHHHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHIH!", (int) (byte) 100, "hhHI!IHI!!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHIH!HHHIHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhHI!IHI!!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!hhi!ihhHhhi!hhi!hHHHHIH!HHHHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHIH!" + "'", str4, "HHHIH!HHHIHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhHI!IHI!!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!hhi!ihhHhhi!hhi!hHHHHIH!HHHHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHIH!");
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        char[] charArray14 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("HI!", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("hHI!IHI!!", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHhhih!", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("hHhhhih!hhhhhih!hihhhih!hhhhhih!HhHI!IHI!!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("hhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!iHhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "h" + "'", str17, "h");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str18, "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HHhhhih!hhhhhih!hihhhih!hhhhhih!HhHI!IHI!!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str20, "HHhhhih!hhhhhih!hihhhih!hhhhhih!HhHI!IHI!!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str21, "HhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!" + "'", str22, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!");
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        char[] charArray8 = new char[] { '4', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("h", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("h", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("HHIH!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("HHIH!", charArray8);
        java.lang.Class<?> wildcardClass15 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hI!" + "'", str10, "hI!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhih!" + "'", str13, "Hhih!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hHIH!" + "'", str14, "hHIH!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        char[] charArray16 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray16);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("h", charArray16);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray16);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("Hhi!ihi!!", charArray16);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalize("HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!", charArray16);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHHIH!HHHHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHIH!", charArray16);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalize("hHHHHIH!HHHHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHIH!", charArray16);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H" + "'", str21, "H");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhih!" + "'", str22, "Hhih!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hhi!ihi!!" + "'", str23, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!" + "'", str24, "HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hHHHHIH!HHHHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHIH!" + "'", str25, "hHHHHIH!HHHHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHIH!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HHHHHIH!HHHHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHIH!" + "'", str26, "HHHHHIH!HHHHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHIH!");
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHhhi!hhi!hHhi!hhi!iHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!", (int) (byte) 0, (int) 'a', "hHHHI!HHI!HHHHHIH!HHHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHHHIH!HHHHIH!HHIH!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhhi!hhi!hHhi!hhi!iHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!" + "'", str4, "HHhhi!hhi!hHhi!hhi!iHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!");
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!!", (int) (short) 10, "Hhhi!hhi!iHHHIH!HHHIHhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHIHhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!HHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!!" + "'", str4, "hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!!");
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHHI!HHI!IHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
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
        java.lang.String str27 = org.apache.commons.lang.WordUtils.capitalize("Hhhhih!hhhhhih!hihhhih!hhhhhih!h!", charArray17);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.capitalize("HHHHIH!HHHhHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!", charArray17);
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Hhhhih!hhhhhih!hihhhih!hhhhhih!h!" + "'", str27, "Hhhhih!hhhhhih!hihhhih!hhhhhih!h!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "HHHHIH!HHHhHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!" + "'", str28, "HHHHIH!HHHhHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!");
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHhHIH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHhHIH!" + "'", str1, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHhHIH!");
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        char[] charArray12 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("HI!", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhih!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("HhhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihi!hhi!!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhih!" + "'", str16, "Hhih!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HhhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!" + "'", str17, "HhhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str18, "Hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!HHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!IHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHhHHHHIH!HHHHhhhih!hhhhhih!hihhhiHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!h!hhhhhih!hHhhhih!hhHHIH!HHIH!I!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HhHHHHIH!HHHHhhhih!hhhhhih!hihhhiHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!h!hhhhhih!hHhhhih!hhHHIH!HHIH!HI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHIhHHHHIH!HHHHhhhih!hhhhhih!hihhhiHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!h!hhhhhih!hHhhhih!hhHHIH!HHIH!!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHhHHHHIH!HHHHhhhih!hhhhhih!hihhhiHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!h!hhhhhih!hHhhhih!hhHHIH!HHIH!I!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HhHHHHIH!HHHHhhhih!hhhhhih!hihhhiHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!h!hhhhhih!hHhhhih!hhHHIH!HHIH!HI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHIhHHHHIH!HHHHhhhih!hhhhhih!hihhhiHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!h!hhhhhih!hHhhhih!hhHHIH!HHIH!!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!" + "'", str1, "hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHhHHHHIH!HHHHhhhih!hhhhhih!hihhhiHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!h!hhhhhih!hHhhhih!hhHHIH!HHIH!I!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HhHHHHIH!HHHHhhhih!hhhhhih!hihhhiHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!h!hhhhhih!hHhhhih!hhHHIH!HHIH!HI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHIhHHHHIH!HHHHhhhih!hhhhhih!hihhhiHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!h!hhhhhih!hHhhhih!hhHHIH!HHIH!!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!");
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!", (int) (byte) 1, (int) (byte) 0, "HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!" + "'", str4, "hHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!");
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        char[] charArray16 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray16);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("h", charArray16);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray16);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.initials("hhI!HhI!IhI!HhI!!", charArray16);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray16);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalize("hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I", charArray16);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!", charArray16);
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hi!" + "'", str24, "Hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I" + "'", str25, "HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str26, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
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
        java.lang.String str34 = org.apache.commons.lang.WordUtils.initials("Hhhhhih!hhhhih!", charArray20);
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "H" + "'", str34, "H");
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
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
        java.lang.String str33 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!HHI!IHI!HHI!!", charArray21);
        java.lang.String str34 = org.apache.commons.lang.WordUtils.uncapitalize("hHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!", charArray21);
        java.lang.String str35 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHHIH!HHHHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHIH!", charArray21);
        java.lang.String str36 = org.apache.commons.lang.WordUtils.uncapitalize("HHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHhhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!I!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I", charArray21);
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
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hHI!HHI!IHI!HHI!!" + "'", str33, "hHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!" + "'", str34, "hHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hHHHHIH!HHHHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHIH!" + "'", str35, "hHHHHIH!HHHHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHIH!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHhhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!I!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I" + "'", str36, "hHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHhhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!I!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I");
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
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
        java.lang.String str31 = org.apache.commons.lang.WordUtils.capitalize("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i", charArray19);
        java.lang.String str32 = org.apache.commons.lang.WordUtils.initials("hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHhHHHIH!HHHHHIH!HIHhhHHHIH!HHhhih!", charArray19);
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i" + "'", str31, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "h" + "'", str32, "h");
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHHhih!hHhhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        char[] charArray10 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("hhih!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhHHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!i!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("HHhhi!hhi!hHHHHIH!HHHHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHIH!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhih!" + "'", str12, "Hhih!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhHHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!i!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!" + "'", str13, "hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhHHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!i!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hHhhi!hhi!hHHHHIH!HHHHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHIH!" + "'", str14, "hHhhi!hhi!hHHHHIH!HHHHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHIH!");
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhi!hhi!ihhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!", 0, "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!HhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHHhHI!IHI!!hhHI!IHI!!ihHI!IHI!!hhHI!IHI!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhi!hhi!ihhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str4, "hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhi!hhi!ihhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        char[] charArray10 = new char[] { '4', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!HhI!IhI!HhI!!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hHi!hHi!iHi!hHi!!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ih", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhi!hhi!ihi!hhi!!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHHHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihihHHIH!HHHIHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhHhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str12, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hhi!hhi!ih" + "'", str14, "hhi!hhi!ih");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhi!hhi!ihi!hhi!!" + "'", str16, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "h" + "'", str17, "h");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!" + "'", str18, "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!");
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhHhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhHHHHIH!HHHHIH!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhHhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhHHHHIH!HHHHIH!" + "'", str2, "HHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhHhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhHHHHIH!HHHHIH!");
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        char[] charArray10 = new char[] { '4', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("h", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hI!" + "'", str12, "hI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "h" + "'", str14, "h");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str17, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!" + "'", str18, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!");
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhHHHIH!HHhhih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHhhih!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHhhih!" + "'", str2, "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHhhih!");
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I" + "'", str2, "HHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I");
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
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
        java.lang.String str28 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhih!hhhiHhi!hhi!ihi!hhi!!", charArray17);
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Hhhih!hhhihhi!hhi!ihi!hhi!!" + "'", str28, "Hhhih!hhhihhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHHHIH!HHHHIH!", (int) '4', "HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHHHIH!HHHHIH!" + "'", str4, "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHHHIH!HHHHIH!");
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str1, "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        char[] charArray4 = new char[] { '4', '4' };
        java.lang.String str5 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray4);
        java.lang.String str6 = org.apache.commons.lang.WordUtils.uncapitalize("hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Hi!" + "'", str5, "Hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!" + "'", str6, "hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!");
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhhih!hhhihhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhih!hhhihhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!" + "'", str1, "Hhhih!hhhihhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!");
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        char[] charArray6 = new char[] { '4', '4' };
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IhHHI!HHI!Ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!HI!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Hi!" + "'", str7, "Hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H" + "'", str8, "H");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i", (int) (short) -1, "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHIHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHHHIH!HHHHIH!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i" + "'", str4, "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i");
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        char[] charArray7 = new char[] { '4', '4' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHHhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hi!" + "'", str8, "Hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hI!" + "'", str10, "hI!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "h" + "'", str12, "h");
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHhHHHIH!HHHHHIH!HIHhhHHHIH!HHhhih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHhHHHIH!HHHHHIH!HIHhhHHHIH!HHhhih!" + "'", str1, "hHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHhHHHIH!HHHHHIH!HIHhhHHHIH!HHhhih!");
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        char[] charArray12 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("hhih!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("hHi!hHi!iHi!hHi!!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("HHhih!hHhih!HHhih!HHhih!HHhih!IHhih!HHhih!!Hhih!HHhih!HHhih!hHhih!hHhih!iHhih!hHhih!!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhih!" + "'", str16, "Hhih!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str17, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        char[] charArray10 = new char[] { '4', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!HhHIH!HhHIH!hhHIH!hhHIH!hhHIH!ihHIH!hhHIH!!hHIH!hhHIH!hhHIH!HhHIH!HhHIH!IhHIH!HhHIH!!", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHhhi!hhi!iHhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!HI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hI!" + "'", str13, "hI!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!HhHIH!HhHIH!hhHIH!hhHIH!hhHIH!ihHIH!hhHIH!!hHIH!hhHIH!hhHIH!HhHIH!HhHIH!IhHIH!HhHIH!!" + "'", str17, "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!HhHIH!HhHIH!hhHIH!hhHIH!hhHIH!ihHIH!hhHIH!!hHIH!hhHIH!hhHIH!HhHIH!HhHIH!IhHIH!HhHIH!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
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
        java.lang.String str30 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!ihi!!!", charArray18);
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!ihi!!!" + "'", str30, "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!ihi!!!");
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        char[] charArray13 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("HI!", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hi!" + "'", str16, "Hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str17, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str18, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!" + "'", str19, "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i" + "'", str20, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i");
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHHHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!", 0, (int) (byte) 1, "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!iHhhi!hhi!iHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!iHhhi!hhi!iHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!hi!" + "'", str4, "hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!iHhhi!hhi!iHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!hi!");
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        char[] charArray6 = new char[] { '4', '4' };
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!HhI!IhI!HhI!!", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("HHI!HHI!IHI!HHI!!", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhiHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Hi!" + "'", str7, "Hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str8, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str1, "hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        char[] charArray14 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("HHIH!", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("HHhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIH!IhHIH!!hHIH!!", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!HHI!IhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHHHIH!HHHhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHIH!HIHHHhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!IH!HHHHHIHhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!!H!", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hi!" + "'", str17, "Hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!" + "'", str20, "HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hHHI!HHI!IhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHHHIH!HHHhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHIH!HIHHHhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!IH!HHHHHIHhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!!H!" + "'", str22, "hHHI!HHI!IhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHHHIH!HHHhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHIH!HIHHHhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!IH!HHHHHIHhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!!H!");
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhHhih!hHhih!iHhih!!Hhih!iHhih!hHhihhhhi!hhi!iHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHHhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIHHHHI!HHI!IhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!" + "'", str1, "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHHhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIHHHHI!HHI!IhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!");
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
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
        java.lang.String str31 = org.apache.commons.lang.WordUtils.initials("HHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!", charArray19);
        java.lang.String str32 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhhih!hhhhih!", charArray19);
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "H" + "'", str31, "H");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhhih!hhhhih!" + "'", str32, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhhih!hhhhih!");
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!hi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!hi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!hi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!hi!hhi!ihi!hhi!!!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!hi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!hi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!hi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!hi!hhi!ihi!hhi!!!" + "'", str2, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!hi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!hi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!hi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!hi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
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
        java.lang.String str31 = org.apache.commons.lang.WordUtils.uncapitalize("hhi!ihi!!", charArray20);
        java.lang.String str32 = org.apache.commons.lang.WordUtils.capitalize("Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!ihi!!!", charArray20);
        java.lang.String str33 = org.apache.commons.lang.WordUtils.capitalize("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!ihi!!!", charArray20);
        java.lang.String str34 = org.apache.commons.lang.WordUtils.capitalize("hhhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!", charArray20);
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hhi!ihi!!" + "'", str31, "hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!ihi!!!" + "'", str32, "Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!ihi!!!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!ihi!!!" + "'", str33, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!ihi!!!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "HhhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!" + "'", str34, "HhhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!");
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhhhih!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!hhih!", (int) '#', "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhHhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhhih!hhhhhhhih!hhhhhih!hihhhih!hhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhHhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!hhhhih!hhhhhih!hhhhih!hhih!" + "'", str4, "Hhhhhih!hhhhhhhih!hhhhhih!hihhhih!hhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhHhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!hhhhih!hhhhhih!hhhhih!hhih!");
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        char[] charArray15 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray15);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("h", charArray15);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray15);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("HHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!", charArray15);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhih!hHhih!HHhih!HHhih!HHhih!IHhih!HHhih!!Hhih!HHhih!HHhih!hHhih!hHhih!iHhih!hHhih!!", charArray15);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!", charArray15);
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!" + "'", str23, "Hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str24, "hhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        char[] charArray15 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray15);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("h", charArray15);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray15);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!", charArray15);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!", charArray15);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.initials("HHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHhHHHIH!HHHHHIH!HIHhhHHHIH!HHhhih!", charArray15);
        java.lang.Class<?> wildcardClass25 = charArray15.getClass();
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H" + "'", str21, "H");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str22, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str23, "hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H" + "'", str24, "H");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        char[] charArray15 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("HHI!HHI!IHI!HHI!!", charArray15);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("HHIH!", charArray15);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("Hhhih!hhhiHhi!hhi!ihi!hhi!!", charArray15);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("Hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!", charArray15);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.initials("HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I", charArray15);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalize("hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHHHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihihHHIH!HHHIHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhHhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhih!" + "'", str20, "Hhih!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H" + "'", str21, "H");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H" + "'", str23, "H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHHHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihihHHIH!HHHIHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhHhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str24, "HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHHHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihihHHIH!HHHIHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhHhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!i!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!i!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str1, "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!i!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        char[] charArray14 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("hHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHhi!HHIH!", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hi!" + "'", str17, "Hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str18, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str19, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!" + "'", str20, "hHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str21, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihhi!hhih!" + "'", str22, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihhi!hhih!");
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!hhi!iHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!hhi!iHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhi!hhi!ihi!hhi!!" + "'", str1, "hhhi!hhi!iHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHhhih!", (int) (short) -1, 0, "HHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!!" + "'", str4, "HHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!!");
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhhhih!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhhih!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!" + "'", str1, "Hhhhhhih!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!");
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        char[] charArray12 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("HI!", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("HHIH!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("Hhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!ihhih!!hHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hih!ihhih!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hhhih!ihhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!!hhih!!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhih!" + "'", str16, "Hhih!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!" + "'", str17, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!ihi!!!", (int) '#', 1, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!" + "'", str4, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!");
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhi!hhi!ihi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhi!hhi!ihi!" + "'", str1, "Hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhi!hhi!ihi!");
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIH!IhHIH!!hHIH!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!" + "'", str1, "hhHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!");
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        char[] charArray12 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("HI!", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("HHHHHIH!HHHHIH!", charArray12);
        java.lang.Class<?> wildcardClass19 = charArray12.getClass();
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str16, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str17, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hHHHHIH!HHHHIH!" + "'", str18, "hHHHHIH!HHHHIH!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHhhhih!hhhhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!I!HhI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhHHHIH!HHHHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!" + "'", str1, "HhHHHIH!HHHHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!");
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!", (int) 'a', "", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!" + "'", str4, "HHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!");
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        char[] charArray13 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("HI!", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhih!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHHhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIHHHHI!HHI!IhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hi!" + "'", str16, "Hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhih!" + "'", str17, "Hhih!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str19, "hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHHhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIHHHHI!HHI!IhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!" + "'", str20, "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHHhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIHHHHI!HHI!IhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!");
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        char[] charArray14 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("hHI!HHI!IHI!HHI!!", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("hhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HHI!HHI!IHI!HHI!!" + "'", str18, "HHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "h" + "'", str19, "h");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!" + "'", str21, "HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!iiHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!iiHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!iiHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!iiHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!iiHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!iiHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i!" + "'", str1, "HHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!iiHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!iiHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!iiHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i!");
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HhhHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIH!IhHIH!!hHIH!!" + "'", str1, "hHHhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIH!IhHIH!!hHIH!!");
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!hhi!iHhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!hhi!iHhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!" + "'", str1, "hhhi!hhi!iHhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!");
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
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
        java.lang.String str25 = org.apache.commons.lang.WordUtils.initials("Hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!", charArray14);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalize("Hhih!", charArray14);
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "H" + "'", str25, "H");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Hhih!" + "'", str26, "Hhih!");
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!hi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!iHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!hi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!hi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!hi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!hi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!hi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!hi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!hi!hhi!ihi!hhi!!!" + "'", str1, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!hi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!hi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!hi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!hi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihhhih!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihhhih!" + "'", str2, "hhHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihhhih!");
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hHHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hhi!!" + "'", str1, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hhi!!");
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!iHhhi!hhi!iHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!hi!", (int) (short) 100, "Hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!iHhhi!hhi!iHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!hi!" + "'", str4, "hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!iHhhi!hhi!iHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!hi!");
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        char[] charArray11 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("HI!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihi!hhi!!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", charArray11);
        java.lang.Class<?> wildcardClass17 = charArray11.getClass();
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str16, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
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
        java.lang.String str34 = org.apache.commons.lang.WordUtils.capitalize("", charArray20);
        java.lang.Class<?> wildcardClass35 = charArray20.getClass();
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HhHI!IHI!!Hhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHhi!ihi!!hHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHH" + "'", str1, "hHhi!ihi!!hHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHH");
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHhi!ihi!!hHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHH", (int) (short) 0, (int) ' ', "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!HHHIH!HHHIH!iHHIHhHi!hHi!iH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHhi!ihi!!hHHHHHIH!HHHHHIH!HIHHHhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!HHHIH!HHHIH!iHHIHhHi!hHi!iH" + "'", str4, "hHhi!ihi!!hHHHHHIH!HHHHHIH!HIHHHhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!HHHIH!HHHIH!iHHIHhHi!hHi!iH");
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        char[] charArray13 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("HI!", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhih!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHHIH!HHhhih!", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("hhHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("HHi!hHi!iHi!hHi!!", charArray13);
        java.lang.Class<?> wildcardClass21 = charArray13.getClass();
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hi!" + "'", str16, "Hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhih!" + "'", str17, "Hhih!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhi!hhi!ihHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHHIH!HHhhih!" + "'", str18, "Hhi!hhi!ihHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHHIH!HHhhih!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "h" + "'", str19, "h");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hHi!hHi!iHi!hHi!!" + "'", str20, "hHi!hHi!iHi!hHi!!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhih!hhhihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhih!hhhihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hhi!!" + "'", str1, "Hhhih!hhhihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hhi!!");
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHhhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!I!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHhhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!I!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I" + "'", str1, "HHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHhhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!I!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I");
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHi!hHi!iH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhI!HhI!Ih" + "'", str1, "hhI!HhI!Ih");
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!IHhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str1, "Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhih!hhhihhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!", (int) (byte) 0, (int) (byte) -1, "hhhi!hhi!iHhhi!hhi!ihi!hhi!!hhhihHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhih!hhhihhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!" + "'", str4, "Hhhih!hhhihhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!");
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        char[] charArray18 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray18);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray18);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray18);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray18);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("h", charArray18);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray18);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray18);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.initials("Hhih!", charArray18);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray18);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i", charArray18);
        java.lang.String str29 = org.apache.commons.lang.WordUtils.uncapitalize("hI!", charArray18);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.initials("HhI!HhI!IhI!HhI!!", charArray18);
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "HI!" + "'", str27, "HI!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i" + "'", str28, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hI!" + "'", str29, "hI!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "H" + "'", str30, "H");
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        char[] charArray15 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("hHIH!", charArray15);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!", charArray15);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("hHhhhih!hhHHIH!", charArray15);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhh", charArray15);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihi!!HHhi!hhi!iHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!", charArray15);
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hhhi!ihi!!HHhi!hhi!iHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!" + "'", str24, "hhhi!ihi!!HHhi!hhi!iHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!");
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!i!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!", 0, "hHI!IHI!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!i!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str4, "hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!i!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        char[] charArray13 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("HI!", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihi!hhi!!", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihh", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!H!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!HHhh", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str18, "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihh" + "'", str19, "hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihh");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!H!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!HHhh" + "'", str20, "HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!H!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!HHhh");
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!h!ihhih!!hhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hih!ihhih!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hhhih!ihhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!h!!hhih!!", 0, 1, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhHH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhHH" + "'", str4, "hHhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhHH");
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhih!hhhihhih!hhhi!hhi!ihhih!hi!hhi!!hhhhih!hi!hhi!ihihhih!!hhi!!ihhihhih!!hhi!ihi!hhhih!hi!!!hhi!hhHhi!hhi!iHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhih!hhhihhih!hhhi!hhi!ihhih!hi!hhi!!hhhhih!hi!hhi!ihihhih!!hhi!!ihhihhih!!hhi!ihi!hhhih!hi!!!hhi!hhhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!" + "'", str1, "Hhhih!hhhihhih!hhhi!hhi!ihhih!hi!hhi!!hhhhih!hi!hhi!ihihhih!!hhi!!ihhihhih!!hhi!ihi!hhhih!hi!!!hhi!hhhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!");
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!I!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!I!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!I!HHI!IHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!I!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!I!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!I!HHI!IHI!" + "'", str1, "HHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!I!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!I!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!I!HHI!IHI!");
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhHhhhih!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!I!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!I!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!I!HHI!IHI!", 0, 100, "hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhHhhhih!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIHhHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!" + "'", str4, "hhHhhhih!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIHhHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!");
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHHIH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        char[] charArray13 = new char[] { '4', '4' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!IHI!!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!", charArray13);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihi!hhi!!", charArray13);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("HHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!", charArray13);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.initials("hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i", charArray13);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.uncapitalize("HhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHIHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!", charArray13);
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!" + "'", str22, "HHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "h" + "'", str23, "h");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHIHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str24, "hhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHIHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!iihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!iihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!iihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i!", (int) 'a', (int) (short) 0, "h");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hh" + "'", str4, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hh");
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHHHIH!HHHHhhhih!hhhhhih!hihhhiHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!h!hhhhhih!hHhhhih!hhHHIH!HHIH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhih!hhhhhhhih!hhhhhih!hihhhihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!h!hhhhhih!hhhhhih!hhhhih!hhih!" + "'", str1, "Hhhhhih!hhhhhhhih!hhhhhih!hihhhihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!h!hhhhhih!hhhhhih!hhhhih!hhih!");
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hhi!!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hhi!!" + "'", str2, "Hhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hhi!!");
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhih!hhhihhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHIH!HHHIHHI!HHI!IHI!HHI!!" + "'", str1, "hHHIH!HHHIHHI!HHI!IHI!HHI!!");
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!HHHIH!HHHIH!HHHIH!HHHIH!HHHIH!IHHIH!HHHIH!!HHIH!HHHIH!HHHIH!HHHIH!HHHIH!IHHIH!HHHIH!!", (int) (byte) 10, (-1), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!HHHIH!HHHIH!HHHIH!HHHIH!HHHIH!IHHIH!HHHIH!!HHIH!HHHIH!HHHIH!HHHIH!HHHIH!IHHIH!HHHIH!!" + "'", str4, "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!HHHIH!HHHIH!HHHIH!HHHIH!HHHIH!IHHIH!HHHIH!!HHIH!HHHIH!HHHIH!HHHIH!HHHIH!IHHIH!HHHIH!!");
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!hhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!hhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihI!" + "'", str1, "hhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!hhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihI!");
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
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
        java.lang.String str27 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.uncapitalize("hHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!!", charArray15);
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!!" + "'", str28, "hHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!!");
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        char[] charArray5 = new char[] { '4' };
        java.lang.String str6 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhh", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("hhhhih!hhhhhih!hihhhih!hhhhhih!h!", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!", charArray5);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("hhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihh", charArray5);
        java.lang.Class<?> wildcardClass10 = charArray5.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4' });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhh" + "'", str6, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhh");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Hhhhih!hhhhhih!hihhhih!hhhhhih!h!" + "'", str7, "Hhhhih!hhhhhih!hihhhih!hhhhhih!h!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "h" + "'", str8, "h");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihh" + "'", str9, "hhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihh");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!i!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHHhHI!IHI!!hhHI!IHI!!ihHI!IHI!!hhHI!IHI!!!I!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!" + "'", str1, "HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHHhHI!IHI!!hhHI!IHI!!ihHI!IHI!!hhHI!IHI!!!I!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!");
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        char[] charArray9 = new char[] { '4', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("h", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("hHHIH!HHHIHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHHI!HHI!IHhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!HHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!IHI!!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hI!" + "'", str11, "hI!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "h" + "'", str12, "h");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhi!hhi!ihhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!" + "'", str14, "Hhi!hhi!ihhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!" + "'", str15, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HHHIH!HHHIHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHHI!HHI!IHhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!HHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!IHI!!!" + "'", str16, "HHHIH!HHHIHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHHI!HHI!IHhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!HHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!IHI!!!");
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHHHIH!HHhhHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhih!hhhhhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!" + "'", str1, "Hhhhhih!hhhhhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str1, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
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
        java.lang.String str26 = org.apache.commons.lang.WordUtils.initials("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!HHHIH!HHHIH!iHHIHhHi!hHi!iH", charArray16);
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "h" + "'", str26, "h");
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHHHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihihHHIH!HHHIHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhHhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHHHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihihHHIH!HHHIHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhHhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str2, "hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHHHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihihHHIH!HHHIHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhHhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i" + "'", str2, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i");
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhHH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhHH" + "'", str1, "hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhHH");
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhi!hhi!ihhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!HHHIH!HHHIH!IHHI!HHI!IHHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!" + "'", str1, "hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!HHHIH!HHHIH!IHHI!HHI!IHHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!");
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        char[] charArray15 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray15);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray15);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray15);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray15);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!", charArray15);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.uncapitalize("hHIH!", charArray15);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.uncapitalize("Hhih!", charArray15);
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hhih!" + "'", str24, "hhih!");
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhih!hhhihhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhih!hhhihhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihI!" + "'", str1, "hhhih!hhhihhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihI!");
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        char[] charArray14 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("hHI!HHI!IHI!HHI!!", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("hhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhi!hhi!ihi!", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HHI!HHI!IHI!HHI!!" + "'", str18, "HHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "h" + "'", str19, "h");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!" + "'", str21, "HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "h" + "'", str22, "h");
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHHhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str1, "Hhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!hhi!iHhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!hhi!iHhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!" + "'", str1, "hhhi!hhi!iHhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!");
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhiHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!h!hhhih!hhhih!hhhih!ihhih!hhhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHIH!HHHIH!HHHIH!HHHIH!HHHIH!IHHIH!HHHIH!!HHIH!HHHIhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!H!HHHIH!HHHIH!HHHIH!IHHIH!HHHIH!!" + "'", str1, "hHHIH!HHHIH!HHHIH!HHHIH!HHHIH!IHHIH!HHHIH!!HHIH!HHHIhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!H!HHHIH!HHHIH!HHHIH!IHHIH!HHHIH!!");
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        char[] charArray13 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("HI!", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihi!hhi!!", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!", charArray13);
        java.lang.Class<?> wildcardClass21 = charArray13.getClass();
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str18, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str19, "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str20, "Hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhi!hhi!ihi!hhi!!i!i", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhi!hhi!ihi!hhi!!i!i" + "'", str2, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhi!hhi!ihi!hhi!!i!i");
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!" + "'", str1, "HHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!");
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhi!hhi!ihi!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhi!hhi!ihi!" + "'", str2, "hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhi!hhi!ihi!");
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHhih!hHhih!hHhih!hHhih!hHhih!iHhih!hHhih!!Hhih!hHhih!hHhih!hHhih!hHhih!hHhih!iHhih!hHhih!!Hhih!hHhih!iHhih!hHhih!hHhih!hHhih!iHhih!hHhih!!Hhih!hHhih!hHhih!hHhih!hHhih!hHhih!iHhih!hHhih!!Hhih!hHhih!!Hhih!hHhih!hHhih!hHhih!hHhih!hHhih!iHhih!hHhih!!Hhih!hHhih!hHhih!hHhih!hHhih!hHhih!iHhih!hHhih!!Hhih!hHhih!iHhih!hHhih!hHhih!hHhih!iHhih!hHhih!!Hhih!hHhih!hHhih!hHhih!hHhih!hHhih!iHhih!hHhih!!Hhih!hHhih!!Hhih!iHhih!hHhih!hHhih!hHhih!hHhih!iHhih!hHhih!!Hhih!hHhih!hHhih!hHhih!hHhih!hHhih!iHhih!hHhih!!Hhih!hHhih!iHhih!hHhih!hHhih!hHhih!iHhih!hHhih!!Hhih!hHhih!hHhih!hHhih!hHhih!hHhih!hHhih!hHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!Hhih!hHhih!hHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!Hhih!iHhih!hHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!Hhih!hHhih!hHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!Hhih!!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHhih!hHhih!hHhih!hHhih!hHhih!iHhih!hHhih!!Hhih!hHhih!hHhih!hHhih!hHhih!hHhih!iHhih!hHhih!!Hhih!hHhih!iHhih!hHhih!hHhih!hHhih!iHhih!hHhih!!Hhih!hHhih!hHhih!hHhih!hHhih!hHhih!iHhih!hHhih!!Hhih!hHhih!!Hhih!hHhih!hHhih!hHhih!hHhih!hHhih!iHhih!hHhih!!Hhih!hHhih!hHhih!hHhih!hHhih!hHhih!iHhih!hHhih!!Hhih!hHhih!iHhih!hHhih!hHhih!hHhih!iHhih!hHhih!!Hhih!hHhih!hHhih!hHhih!hHhih!hHhih!iHhih!hHhih!!Hhih!hHhih!!Hhih!iHhih!hHhih!hHhih!hHhih!hHhih!iHhih!hHhih!!Hhih!hHhih!hHhih!hHhih!hHhih!hHhih!iHhih!hHhih!!Hhih!hHhih!iHhih!hHhih!hHhih!hHhih!iHhih!hHhih!!Hhih!hHhih!hHhih!hHhih!hHhih!hHhih!hHhih!hHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!Hhih!hHhih!hHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!Hhih!iHhih!hHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!Hhih!hHhih!hHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!Hhih!!" + "'", str2, "HHhih!hHhih!hHhih!hHhih!hHhih!iHhih!hHhih!!Hhih!hHhih!hHhih!hHhih!hHhih!hHhih!iHhih!hHhih!!Hhih!hHhih!iHhih!hHhih!hHhih!hHhih!iHhih!hHhih!!Hhih!hHhih!hHhih!hHhih!hHhih!hHhih!iHhih!hHhih!!Hhih!hHhih!!Hhih!hHhih!hHhih!hHhih!hHhih!hHhih!iHhih!hHhih!!Hhih!hHhih!hHhih!hHhih!hHhih!hHhih!iHhih!hHhih!!Hhih!hHhih!iHhih!hHhih!hHhih!hHhih!iHhih!hHhih!!Hhih!hHhih!hHhih!hHhih!hHhih!hHhih!iHhih!hHhih!!Hhih!hHhih!!Hhih!iHhih!hHhih!hHhih!hHhih!hHhih!iHhih!hHhih!!Hhih!hHhih!hHhih!hHhih!hHhih!hHhih!iHhih!hHhih!!Hhih!hHhih!iHhih!hHhih!hHhih!hHhih!iHhih!hHhih!!Hhih!hHhih!hHhih!hHhih!hHhih!hHhih!hHhih!hHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!Hhih!hHhih!hHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!Hhih!iHhih!hHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!Hhih!hHhih!hHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!Hhih!!");
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hi!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hi!" + "'", str2, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!hi!");
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!hhi!iHhhhhih!hhhhhih!hihhhih!hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhi!hhi!ihi!hhi!!i!i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!hhi!iHhhhhih!hhhhhih!hihhhih!hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhi!hhi!ihi!hhi!!i!i" + "'", str1, "hhhi!hhi!iHhhhhih!hhhhhih!hihhhih!hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhi!hhi!ihi!hhi!!i!i");
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!hHhih!hHhih!iHhih!!Hhih!iHhih!hHhihhhhi!hhi!iHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!hHhih!hHhih!iHhih!!Hhih!iHhih!hHhihhhhi!hhi!iHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str2, "Hhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!hHhih!hHhih!iHhih!!Hhih!iHhih!hHhihhhhi!hhi!iHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str1, "hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str2, "hhhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
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
        java.lang.String str30 = org.apache.commons.lang.WordUtils.capitalize("HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!hHHI!IHI!!Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!", charArray18);
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!hHHI!IHI!!Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str30, "HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!hHHI!IHI!!Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i", (int) '#', (int) (byte) 1, "Hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhiHhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str4, "hhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhiHhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        char[] charArray13 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("hHIH!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("H", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("Hhhhih!hhhhhih!hihhhih!hhhhhih!h!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "h" + "'", str17, "h");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhhhih!hhhhhih!hihhhih!hhhhhih!h!" + "'", str19, "Hhhhih!hhhhhih!hihhhih!hhhhhih!h!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str20, "Hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        char[] charArray11 = new char[] { '4', '4' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("h", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("Hhi!ihi!!", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("HhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!!", charArray11);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!", charArray11);
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str20, "hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        char[] charArray11 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("HHIH!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("HhHHI!HHI!HhHI!HHI!IhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("HhhHHHIH!Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhih!" + "'", str13, "Hhih!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "h" + "'", str14, "h");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hhHHI!HHI!HhHI!HHI!IhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!" + "'", str15, "hhHHI!HHI!HhHI!HHI!IhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HhhHHHIH!Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str16, "HhhHHHIH!Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        char[] charArray10 = new char[] { '#', '4', '4', '4', '4', '#' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihi!hhi!!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!ihi!!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHIH!HHHIHHI!HHI!IHI!HHI!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '#', '4', '4', '4', '4', '#' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str11, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhi!ihi!!" + "'", str12, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str13, "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhhih!hhhihhi!hhi!ihi!hhi!!" + "'", str14, "Hhhih!hhhihhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("", 100, "hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhHhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHhhhih!hhhHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHhhhih!hhhHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!ihi!!!" + "'", str1, "hHhhhih!hhhHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!ihi!!!");
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
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
        java.lang.String str28 = org.apache.commons.lang.WordUtils.initials("hi!", charArray18);
        java.lang.String str29 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!", charArray18);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.uncapitalize("HhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!", charArray18);
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "h" + "'", str28, "h");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str29, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!" + "'", str30, "hhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!");
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!hhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihI!" + "'", str1, "HhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!hhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihI!");
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!" + "'", str1, "hHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!");
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        char[] charArray9 = new char[] { '4', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!HhI!IhI!HhI!!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hHi!hHi!iHi!hHi!!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ih", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("HhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IIhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I!hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IIhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IIhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I!hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str11, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "h" + "'", str12, "h");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hhi!hhi!ih" + "'", str13, "hhi!hhi!ih");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I" + "'", str15, "HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IIhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I!hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IIhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IIhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I!hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I!" + "'", str16, "hhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IIhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I!hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IIhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IIhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I!hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I!");
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        char[] charArray7 = new char[] { '4', '4' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhh", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hi!" + "'", str8, "Hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhh" + "'", str11, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhh");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i" + "'", str12, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i");
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhhhih!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhHHI!IHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHHI!HHI!IHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHHIH!HHHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHHHIH!HHHhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhi!hhi!ihi!" + "'", str1, "hHHHHIH!HHHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHHHIH!HHHhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhi!hhi!ihi!");
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!", (int) (short) 100, "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hhi!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hhi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str4, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hhi!!hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhh", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhh" + "'", str2, "hhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhh");
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        char[] charArray13 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("hHIH!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("hHhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIH!IhHIH!!hHIH!!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hi!" + "'", str16, "Hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HI!" + "'", str18, "HI!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HHIH!" + "'", str19, "HHIH!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HHhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIH!IhHIH!!hHIH!!" + "'", str20, "HHhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIH!IhHIH!!hHIH!!");
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        char[] charArray5 = new char[] { '4', '4' };
        java.lang.String str6 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("hHIH!", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("hHHI!HHI!IhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHHHIH!HHHhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHIH!HIHHHhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!IH!HHHHHIHhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!!H!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hi!" + "'", str6, "Hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HHIH!" + "'", str7, "HHIH!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "h" + "'", str8, "h");
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHIH!HHHIHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhHI!IHI!!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!hhi!ihhHhhi!hhi!hHHHHIH!HHHHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHIH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!hhi!ihhhhhi!hhi!hhhhhih!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!hhih!" + "'", str1, "Hhhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!hhi!ihhhhhi!hhi!hhhhhih!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!hhih!");
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhih!hHhih!hHhih!hHhih!hHhih!iHhih!hHhih!!Hhih!hHhih!hHhih!hHhih!hHhih!hHhih!iHhih!hHhih!!Hhih!hHhih!iHhih!hHhih!hHhih!hHhih!iHhih!hHhih!!Hhih!hHhih!hHhih!hHhih!hHhih!hHhih!iHhih!hHhih!!Hhih!hHhih!!Hhih!hHhih!hHhih!hHhih!hHhih!hHhih!iHhih!hHhih!!Hhih!hHhih!hHhih!hHhih!hHhih!hHhih!iHhih!hHhih!!Hhih!hHhih!iHhih!hHhih!hHhih!hHhih!iHhih!hHhih!!Hhih!hHhih!hHhih!hHhih!hHhih!hHhih!iHhih!hHhih!!Hhih!hHhih!!Hhih!iHhih!hHhih!hHhih!hHhih!hHhih!iHhih!hHhih!!Hhih!hHhih!hHhih!hHhih!hHhih!hHhih!iHhih!hHhih!!Hhih!hHhih!iHhih!hHhih!hHhih!hHhih!iHhih!hHhih!!Hhih!hHhih!hHhih!hHhih!hHhih!hHhih!hHhih!hHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!Hhih!hHhih!hHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!Hhih!iHhih!hHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!Hhih!hHhih!hHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!Hhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!ihhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!ihhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!!hhih!ihhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!ihhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!" + "'", str1, "Hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!ihhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!ihhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!!hhih!ihhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!ihhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!ihhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!hhhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!hhih!!");
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHI!HHI!IHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!", (-1), (int) (short) 0, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        char[] charArray14 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("hHIH!", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("H", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihi!hhi!!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHHhHI!IHI!!hhHI!IHI!!ihHI!IHI!!hhHI!IHI!!!", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("hhhhhhih!hhhhhih!hhhhhih!hihhhihhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!ihhhhih!hhhhhih!hihhhih!hhhhhhhh", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "h" + "'", str18, "h");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str20, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str21, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhhhhhih!hhhhhih!hhhhhih!hihhhihhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!ihhhhih!hhhhhih!hihhhih!hhhhhhhh" + "'", str22, "Hhhhhhih!hhhhhih!hhhhhih!hihhhihhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!ihhhhih!hhhhhih!hihhhih!hhhhhhhh");
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        char[] charArray8 = new char[] { '4', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!HhI!IhI!HhI!!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("H", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str10, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "h" + "'", str12, "h");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!" + "'", str13, "HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhHIH!HhHIH!hhHIH!hhHIH!hhHIH!ihHIH!hhHIH!!hHIH!hhHIH!hhHIH!HhHIH!HhHIH!IhHIH!HhHIH!!", (int) 'a', "hHHIH!HHHIHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!H!IHHIH!!HHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HIH!IHHIH!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHHIH!IHHIHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!H!!HHIH!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhHIH!HhHIH!hhHIH!hhHIH!hhHIH!ihHIH!hhHIH!!hHIH!hhHIH!hhHIH!HhHIH!HhHIH!IhHIH!HhHIH!!" + "'", str4, "hhHIH!HhHIH!hhHIH!hhHIH!hhHIH!ihHIH!hhHIH!!hHIH!hhHIH!hhHIH!HhHIH!HhHIH!IhHIH!HhHIH!!");
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!HHI!IhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHHHIH!HHHhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHIH!HIHHHhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!IH!HHHHHIHhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!!H!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHI!HHI!IhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHHHIH!HHHhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHIH!HIHHHhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!IH!HHHHHIHhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!!H!" + "'", str1, "hHHI!HHI!IhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHHHIH!HHHhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHIH!HIHHHhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!IH!HHHHHIHhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!!H!");
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        char[] charArray15 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray15);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("h", charArray15);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray15);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("HHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!", charArray15);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.initials("HhI!HhI!Ih", charArray15);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.uncapitalize("hHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!iiHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!iiHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!iiHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i!", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hhih!" + "'", str21, "Hhih!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H" + "'", str23, "H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!iiHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!iiHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!iiHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i!" + "'", str24, "hHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!iiHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!iiHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!iiHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i!");
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!I!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!", (int) 'a', 100, "Hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHHhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str4, "HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHHhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        char[] charArray10 = new char[] { '4', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("h", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("HHIH!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hhi!!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("hHhi!hhi!iHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hI!" + "'", str12, "hI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hhi!!" + "'", str16, "Hhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!" + "'", str17, "hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "h" + "'", str18, "h");
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        char[] charArray10 = new char[] { '#', '4', '4', '4', '4', '#' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihi!hhi!!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!ihi!!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("HHHHIH!HHHhHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '#', '4', '4', '4', '4', '#' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str11, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhi!ihi!!" + "'", str12, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str13, "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hHHHIH!HHHhHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!" + "'", str14, "hHHHIH!HHHhHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!");
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        char[] charArray15 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("HHI!HHI!IHI!HHI!!", charArray15);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("hHi!hHi!iHi!hHi!!", charArray15);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("HhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!", charArray15);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", charArray15);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.uncapitalize("HhHI!IHI!!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!", charArray15);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.initials("hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HHi!hHi!iHi!hHi!!" + "'", str20, "HHi!hHi!iHi!hHi!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str21, "HhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str22, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hhHI!IHI!!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str23, "hhHI!IHI!!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "h" + "'", str24, "h");
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        char[] charArray14 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("HHhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hi!" + "'", str17, "Hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hI!" + "'", str20, "hI!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H" + "'", str21, "H");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hHhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str22, "hHhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHhHHHIH!HHHHHIH!HIHhhHHHIH!HHhhih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhhhih!hhhhhih!hihhhhhhih!hhhhih!" + "'", str1, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhhhih!hhhhhih!hihhhhhhih!hhhhih!");
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        char[] charArray10 = new char[] { '4', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!HhI!IhI!HhI!!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hHi!hHi!iHi!hHi!!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ih", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhi!hhi!ihi!hhi!!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHHHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihihHHIH!HHHIHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhHhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!I!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str12, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hhi!hhi!ih" + "'", str14, "hhi!hhi!ih");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhi!hhi!ihi!hhi!!" + "'", str16, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "h" + "'", str17, "h");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!I!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!" + "'", str18, "HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!I!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!");
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str1, "hhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhi!hhi!ihi!", (int) 'a', (int) (short) 1, "hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhHhhhih!hhhhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHIhhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhiHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!h!hhhih!hhhih!hhhih!ihhih!hhhih!!!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHhhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhiHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!h!hhhih!hhhih!hhhih!ihhih!hhhih!!I!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!I!HhI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhHhhhih!hhhhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHIhhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhiHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!h!hhhih!hhhih!hhhih!ihhih!hhhih!!!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHhhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhiHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!h!hhhih!hhhih!hhhih!ihhih!hhhih!!I!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!I!HhI!!" + "'", str4, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhHhhhih!hhhhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHIhhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhiHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!h!hhhih!hhhih!hhhih!ihhih!hhhih!!!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHhhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhiHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!h!hhhih!hhhih!hhhih!ihhih!hhhih!!I!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!I!HhI!!");
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("", (int) (short) 10, (int) '4', "hhhi!hhi!iHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHHIH!HHHIhhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIHHi!hHi!iH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHIH!HHHIhhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIHHi!hHi!iH" + "'", str1, "hHHIH!HHHIhhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIHHi!hHi!iH");
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        char[] charArray11 = new char[] { '#', '4', '4', '4', '4', '#' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihi!hhi!!", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!ihi!!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("hHHIH!HHHIH!HHHIH!HHHIH!HHHIH!IHHIH!HHHIH!!HHIH!HHHIhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!H!HHHIH!HHHIH!HHHIH!IHHIH!HHHIH!!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '#', '4', '4', '4', '4', '#' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str12, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhi!ihi!!" + "'", str13, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str14, "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhhhih!hhhhhih!hihhhih!hhhhhih!h!" + "'", str15, "Hhhhih!hhhhhih!hihhhih!hhhhhih!h!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HHHIH!HHHIH!HHHIH!HHHIH!HHHIH!IHHIH!HHHIH!!HHIH!HHHIhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!H!HHHIH!HHHIH!HHHIH!IHHIH!HHHIH!!" + "'", str16, "HHHIH!HHHIH!HHHIH!HHHIH!HHHIH!IHHIH!HHHIH!!HHIH!HHHIhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!H!HHHIH!HHHIH!HHHIH!IHHIH!HHHIH!!");
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        char[] charArray14 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("HI!", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhih!", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("hHhhhih!hhhhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!I!HhI!!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("Hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hi!" + "'", str17, "Hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhih!" + "'", str18, "Hhih!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!" + "'", str19, "HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HHhhhih!hhhhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!I!HhI!!" + "'", str20, "HHhhhih!hhhhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!I!HhI!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str21, "hhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        char[] charArray11 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("HI!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhih!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhih!" + "'", str15, "Hhih!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!" + "'", str16, "Hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!");
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str1, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!", 100, "hHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIHHHHI!HHI!IHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhihhHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIHHHHI!HHI!IHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str4, "hhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhihhHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIHHHHI!HHI!IHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!IhHhi!ihi!!hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!IhHhi!ihi!!hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!" + "'", str1, "hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!IhHhi!ihi!!hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!");
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhHHhHhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhh", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhHHhHhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhh" + "'", str2, "Hhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhHHhHhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhh");
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HI!", (int) (short) 1, (int) (byte) -1, "HHhhih!hhhihhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HI!" + "'", str4, "HI!");
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!" + "'", str2, "hhhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhHI!HHI!IHI!HHI!!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhHI!HHI!IHI!HHI!!" + "'", str2, "hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhHI!HHI!IHI!HHI!!");
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        char[] charArray14 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("HhI!HhI!IhI!HhI!!", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!HhI!IhI!HhI!!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("hhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!I!HhI!!", charArray14);
        java.lang.Class<?> wildcardClass23 = charArray14.getClass();
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hi!" + "'", str18, "Hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hhI!HhI!IhI!HhI!!" + "'", str19, "hhI!HhI!IhI!HhI!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str20, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i" + "'", str21, "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "h" + "'", str22, "h");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHHIH!HHHIHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!H!IHHIH!!HHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HIH!IHHIH!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHHIH!IHHIHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!H!!HHIH!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHIH!HHHIHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!H!IHHIH!!HHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HIH!IHHIH!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHHIH!IHHIHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!H!!HHIH!!" + "'", str1, "hHHIH!HHHIHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!H!IHHIH!!HHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HIH!IHHIH!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHHIH!IHHIHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!H!!HHIH!!");
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhhhhih!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhhhih!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!" + "'", str2, "hhhhhhih!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!");
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhiHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!h!hhHHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!I!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!I!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!I!HHI!IHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhiHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!h!hhHHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!I!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!I!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!I!HHI!IHI!" + "'", str1, "Hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhiHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!h!hhHHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!I!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!I!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!I!HHI!IHI!");
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        char[] charArray15 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray15);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("h", charArray15);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray15);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("hHI!IHI!!", charArray15);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhih!", charArray15);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.initials("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", charArray15);
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hhih!" + "'", str23, "Hhih!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H" + "'", str24, "H");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!" + "'", str1, "hhhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!");
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHhHHHIH!HHHHHIH!HIHhhHHHIH!HHhhih!", 0, 1, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhhhih!hhhhhih!hihhhhhhih!hhhhih!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhhhih!hhhhhih!hihhhhhhih!hhhhih!" + "'", str4, "HHhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhhhih!hhhhhih!hihhhhhhih!hhhhih!");
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        char[] charArray11 = new char[] { '4', '4' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("h", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("Hhi!ihi!!", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("HhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("HHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!", charArray11);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!hHHI!IHI!!Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!", charArray11);
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!hHHI!IHI!!Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str20, "hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!hHHI!IHI!!Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHI!HHI!IHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHI!HHI!IHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!" + "'", str1, "HHI!HHI!IHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!");
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
        char[] charArray8 = new char[] { '4', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("HHHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!ihi!!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hI!" + "'", str11, "hI!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!ihi!!!" + "'", str14, "hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!ihi!!!");
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhhih!hhhHhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!", (int) (byte) 0, 0, "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHHhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIHHHHI!HHI!IhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHHhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIHHHHI!HHI!IhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!" + "'", str4, "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHHhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIHHHHI!HHI!IhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!");
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHHIH!HHHIHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihhHhhi!hhi!hHHHHIH!HHHHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHIH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
        char[] charArray8 = new char[] { '4', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("hHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hI!" + "'", str11, "hI!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "h" + "'", str14, "h");
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhhih!hhhhih!", 10, "hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHhHHHHIH!HHHHhhhih!hhhhhih!hihhhiHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!h!hhhhhih!hHhhhih!hhHHIH!HHIH!I!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HhHHHHIH!HHHHhhhih!hhhhhih!hihhhiHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!h!hhhhhih!hHhhhih!hhHHIH!HHIH!HI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHIhHHHHIH!HHHHhhhih!hhhhhih!hihhhiHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!h!hhhhhih!hHhhhih!hhHHIH!HHIH!!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhhih!hhhhih!" + "'", str4, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhhih!hhhhih!");
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I", (int) (byte) -1, (int) (short) 0, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str2, "hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHIH!HHHIHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHHI!HHI!IHhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!HHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!IHI!!!", (int) (byte) -1, (int) (short) 100, "Hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHIH!HHHIHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHHI!HHI!IHhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!HHHIH!HHHIH!IHhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str4, "hHHIH!HHHIHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHHI!HHI!IHhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!HHHIH!HHHIH!IHhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
        char[] charArray7 = new char[] { '4', '4' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("h", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("hhih!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("HHIH!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("HhHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hi!" + "'", str8, "Hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "h" + "'", str9, "h");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hhih!" + "'", str10, "hhih!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hHIH!" + "'", str11, "hHIH!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HhHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!!" + "'", str12, "HhHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!!");
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
        char[] charArray9 = new char[] { '4', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("H", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "h" + "'", str12, "h");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhi!hhi!ihi!hhi!!i!i", (int) (byte) -1, (int) (short) 10, "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IhHHI!HHI!Ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!HI!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhi!hhi!ihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IhHHI!HHI!Ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!HI!" + "'", str4, "hhhi!hhi!ihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IhHHI!HHI!Ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!HI!");
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
        char[] charArray17 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray17);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray17);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray17);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray17);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("h", charArray17);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray17);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray17);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray17);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!HhI!IhI!HhI!!", charArray17);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.uncapitalize("hI!", charArray17);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.capitalizeFully("hhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hhHHHIH!HHHhHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!", charArray17);
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str26, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hI!" + "'", str27, "hI!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Hhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hhhhhih!hhhhhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!" + "'", str28, "Hhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hhhhhih!hhhhhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!" + "'", str2, "hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!");
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HhHHHIH!HHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHHIH!HIHHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HIH!HHHHHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!H!H!hhHHHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!H!HHHHHIH!hHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HIHHHIH!HHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHHIH!H!ihhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHHIH!HHHHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HIH!HIHHHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!H!HHHHHHhHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!I!IHI!!hhHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!I!IHI!!ihHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!I!IHI!!hhHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!I!IHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhHHHIH!HHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHHIH!HIHHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HIH!HHHHHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!H!H!hhHHHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!H!HHHHHIH!hHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HIHHHIH!HHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHHIH!H!ihhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHHIH!HHHHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HIH!HIHHHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!H!HHHHHHhHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!I!IHI!!hhHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!I!IHI!!ihHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!I!IHI!!hhHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!I!IHI!!!" + "'", str1, "hhHHHIH!HHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHHIH!HIHHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HIH!HHHHHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!H!H!hhHHHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!H!HHHHHIH!hHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HIHHHIH!HHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHHIH!H!ihhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHHIH!HHHHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HIH!HIHHHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!H!HHHHHHhHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!I!IHI!!hhHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!I!IHI!!ihHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!I!IHI!!hhHhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!I!IHI!!!");
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
        char[] charArray16 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray16);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("h", charArray16);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray16);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!", charArray16);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.initials("HHhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIH!IhHIH!!hHIH!!", charArray16);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalize("hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!", charArray16);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.uncapitalize("HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!", charArray16);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H" + "'", str21, "H");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhih!" + "'", str22, "Hhih!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str23, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H" + "'", str24, "H");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!" + "'", str25, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!" + "'", str26, "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!");
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhHIH!HhHIH!hhHIH!hhHIH!hhHIH!ihHIH!hhHIH!!hHIH!hhHIH!hhHIH!HhHIH!HhHIH!IhHIH!HhHIH!!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhHIH!HhHIH!hhHIH!hhHIH!hhHIH!ihHIH!hhHIH!!hHIH!hhHIH!hhHIH!HhHIH!HhHIH!IhHIH!HhHIH!!" + "'", str2, "hhhHIH!HhHIH!hhHIH!hhHIH!hhHIH!ihHIH!hhHIH!!hHIH!hhHIH!hhHIH!HhHIH!HhHIH!IhHIH!HhHIH!!");
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
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
        java.lang.String str28 = org.apache.commons.lang.WordUtils.capitalize("Hhhhih!hhhhhih!hihhhih!hhhhhih!h!", charArray18);
        java.lang.String str29 = org.apache.commons.lang.WordUtils.initials("H", charArray18);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.initials("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i", charArray18);
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Hhhhih!hhhhhih!hihhhih!hhhhhih!h!" + "'", str28, "Hhhhih!hhhhhih!hihhhih!hhhhhih!h!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "H" + "'", str29, "H");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "H" + "'", str30, "H");
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihhhi!hhi!ihi!hhi!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!", (int) (short) -1, (int) (byte) 100, "hhhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihhhi!hhi!ihi!hhi!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!" + "'", str4, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihhhi!hhi!ihi!hhi!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!");
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
        char[] charArray17 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray17);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("HI!", charArray17);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihi!hhi!!", charArray17);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray17);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", charArray17);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!", charArray17);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalize("Hhhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!", charArray17);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!ihi!!!", charArray17);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.initials("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhi!hhi!ihhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!hi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", charArray17);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.capitalize("Hhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!ihhih!!hHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hih!ihhih!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hhhih!ihhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!!hhih!!", charArray17);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.initials("hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhhih!hhhhih!", charArray17);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H" + "'", str21, "H");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str22, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str23, "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hhhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!" + "'", str24, "Hhhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!ihi!!!" + "'", str25, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!ihi!!!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H" + "'", str26, "H");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Hhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!ihhih!!hHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hih!ihhih!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hhhih!ihhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!!hhih!!" + "'", str27, "Hhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!ihhih!!hHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hih!ihhih!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hhhih!ihhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!!hhih!!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "h" + "'", str28, "h");
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
        char[] charArray16 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray16);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("h", charArray16);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray16);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!", charArray16);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.initials("hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!", charArray16);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.initials("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhiHHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!", charArray16);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H" + "'", str21, "H");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str23, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "h" + "'", str24, "h");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "H" + "'", str25, "H");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
        char[] charArray14 = new char[] { '4', '4' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", charArray14);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray14);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhHHIH!", charArray14);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!", charArray14);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!", charArray14);
        java.lang.Class<?> wildcardClass27 = charArray14.getClass();
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hI!" + "'", str17, "hI!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hi!" + "'", str18, "Hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!" + "'", str21, "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str22, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H" + "'", str24, "H");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhihhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!" + "'", str25, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhihhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str26, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
        char[] charArray15 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("HHI!HHI!IHI!HHI!!", charArray15);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("hHi!hHi!iHi!hHi!!", charArray15);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("HhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!", charArray15);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", charArray15);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.uncapitalize("HhHI!IHI!!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!", charArray15);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHHHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihihHHIH!HHHIHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhHhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HHi!hHi!iHi!hHi!!" + "'", str20, "HHi!hHi!iHi!hHi!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str21, "HhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str22, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hhHI!IHI!!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str23, "hhHI!IHI!!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihihhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str24, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihihhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
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
        java.lang.String str38 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!", charArray22);
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
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Hhhhih!hhhhhih!hihhhih!hhhhhih!h!" + "'", str38, "Hhhhih!hhhhhih!hihhhih!hhhhhih!h!");
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
        char[] charArray10 = new char[] { '4', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!HhI!IhI!HhI!!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("hHi!hHi!iHi!hHi!!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ih", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("hHi!hHi!iHi!hHi!!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!IHI!!!", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str12, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hhi!hhi!ih" + "'", str14, "hhi!hhi!ih");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HHi!hHi!iHi!hHi!!" + "'", str15, "HHi!hHi!iHi!hHi!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!IHI!!!" + "'", str17, "hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!IHI!!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str18, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!", (int) 'a', "hhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!IHI!!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!IHI!!!hih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str4, "hhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!IHI!!!hih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhhi!hhi!iHhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhi!iHhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!" + "'", str1, "Hhhi!hhi!iHhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!");
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hi", (int) (short) 10, (int) (short) 100, "HhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!I!HhI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hi" + "'", str4, "HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hi");
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!" + "'", str2, "hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!");
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!IHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!ihi!!!" + "'", str1, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!ihi!!!");
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hhHHHIH!HHHhHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hhHHHIH!HHHhHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!" + "'", str2, "hhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hhHHHIH!HHHhHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!");
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHIHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHHHIH!HHHHIH!", (int) (short) 100, (int) (byte) 1, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 100, length 99");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
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
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalize("HhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHHIH!HHhhih!", charArray13);
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHHIH!HHhhih!" + "'", str24, "HhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHHIH!HHhhih!");
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
        char[] charArray13 = new char[] { '4', '4' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("h", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("Hhi!ihi!!", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("HhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", charArray13);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("HHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!", charArray13);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhi!iHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!", charArray13);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!ihhih!!hHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hih!ihhih!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hhhih!ihhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!!hhih!!", charArray13);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalize("hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hI!" + "'", str15, "hI!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "h" + "'", str16, "h");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hi!" + "'", str17, "Hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!" + "'", str21, "HHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str22, "Hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!ihhih!!hHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hih!ihhih!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hhhih!ihhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!!hhih!!" + "'", str23, "hhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!ihhih!!hHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hih!ihhih!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hhhih!ihhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!!hhih!!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str24, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
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
        java.lang.String str31 = org.apache.commons.lang.WordUtils.initials("HhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIH!IhHIH!!hHIH!!", charArray21);
        java.lang.String str32 = org.apache.commons.lang.WordUtils.uncapitalize("hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", charArray21);
        java.lang.String str33 = org.apache.commons.lang.WordUtils.uncapitalize("hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", charArray21);
        java.lang.String str34 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!", charArray21);
        java.lang.String str35 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!hhi!iHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!", charArray21);
        java.lang.String str36 = org.apache.commons.lang.WordUtils.uncapitalize("HHhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhhhih!hhhhhih!hihhhhhhih!hhhhih!", charArray21);
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "H" + "'", str31, "H");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str32, "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!" + "'", str33, "hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!" + "'", str34, "Hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hhhi!hhi!iHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str35, "hhhi!hhi!iHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hHhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhhhih!hhhhhih!hihhhhhhih!hhhhih!" + "'", str36, "hHhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhhhih!hhhhhih!hihhhhhhih!hhhhih!");
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhi!hhi!iHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
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
        java.lang.String str31 = org.apache.commons.lang.WordUtils.uncapitalize("HhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", charArray19);
        java.lang.String str32 = org.apache.commons.lang.WordUtils.initials("Hhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!ihhih!!hHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hih!ihhih!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hhhih!ihhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!!hhih!!", charArray19);
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!" + "'", str31, "hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "H" + "'", str32, "H");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhih!hhhihhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!", (int) (short) 10, 0, "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHIHhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhih!hhhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHIHhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I" + "'", str4, "Hhhih!hhhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHIHhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I");
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!I!HhI!!", 10, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhHhhhih!hhhhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHIhhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhiHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!h!hhhih!hhhih!hhhih!ihhih!hhhih!!!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHhhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhiHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!h!hhhih!hhhih!hhhih!ihhih!hhhih!!I!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!I!HhI!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!I!HhI!!" + "'", str4, "HhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!I!HhI!!");
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhhhih!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhHHI!IHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHHI!HHI!IHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
        char[] charArray17 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray17);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("HI!", charArray17);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihi!hhi!!", charArray17);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray17);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("hHI!IHI!!", charArray17);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.initials("HHIH!", charArray17);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.initials("hHI!HHI!IHI!HHI!!", charArray17);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalize("hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!", charArray17);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHhih!hHhih!HHhih!HHhih!HHhih!IHhih!HHhih!!Hhih!HHhih!HHhih!hHhih!hHhih!iHhih!hHhih!!", charArray17);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!hhi!iHhhi!hhi!ihi!hhi!!hhhihHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!", charArray17);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.initials("hHHI!HHI!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!", charArray17);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H" + "'", str21, "H");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HHI!IHI!!" + "'", str22, "HHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H" + "'", str23, "H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "h" + "'", str24, "h");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!" + "'", str25, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Hhhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!" + "'", str26, "Hhhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Hhhi!hhi!iHhhi!hhi!ihi!hhi!!hhhihHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!" + "'", str27, "Hhhi!hhi!iHhhi!hhi!ihi!hhi!!hhhihHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "h" + "'", str28, "h");
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHhHHHIH!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHhHHHIH!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!" + "'", str1, "hHhHHHIH!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!");
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
        char[] charArray7 = new char[] { '4', '4' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("HHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("HhhHHHIH!Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", charArray7);
        java.lang.Class<?> wildcardClass13 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hi!" + "'", str8, "Hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hI!" + "'", str9, "hI!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!" + "'", str10, "hHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str12, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
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
        java.lang.String str34 = org.apache.commons.lang.WordUtils.capitalize("Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhhhHI!IHI!!hhHI!IHI!!ihHI!IHI!!hhHI!IHI!!!", charArray21);
        java.lang.String str35 = org.apache.commons.lang.WordUtils.uncapitalize("hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!", charArray21);
        java.lang.String str36 = org.apache.commons.lang.WordUtils.capitalize("hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!", charArray21);
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhhhHI!IHI!!hhHI!IHI!!ihHI!IHI!!hhHI!IHI!!!" + "'", str34, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhhhHI!IHI!!hhHI!IHI!!ihHI!IHI!!hhHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!" + "'", str35, "hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!" + "'", str36, "HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!");
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!" + "'", str2, "hHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!");
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
        char[] charArray14 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("HI!", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("HHIH!", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("Hhih!", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhih!hHhih!HHhih!HHhih!HHhih!IHhih!HHhih!!Hhih!HHhih!HHhih!hHhih!hHhih!iHhih!hHhih!!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("hHHIH!HHHIHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHHI!HHI!IHhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!HHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!IHI!!!", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("HhI!HhI!Ih", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hi!" + "'", str17, "Hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhih!" + "'", str18, "Hhih!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhih!" + "'", str19, "Hhih!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!" + "'", str20, "Hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HHHIH!HHHIHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHHI!HHI!IHhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!HHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!IHI!!!" + "'", str21, "HHHIH!HHHIHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHHI!HHI!IHhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!HHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!IHI!!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hhI!HhI!Ih" + "'", str22, "hhI!HhI!Ih");
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
        char[] charArray17 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray17);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("HI!", charArray17);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihi!hhi!!", charArray17);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray17);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("hHI!IHI!!", charArray17);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIH!IhHIH!!hHIH!!", charArray17);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.initials("hhi!hhi!ihi!hhi!!", charArray17);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!", charArray17);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalize("", charArray17);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!IHI!!!", charArray17);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.capitalize("Hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHhi!HHIH!", charArray17);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H" + "'", str21, "H");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HHI!IHI!!" + "'", str22, "HHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!" + "'", str23, "Hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "h" + "'", str24, "h");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!" + "'", str25, "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!ihi!!!" + "'", str27, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!ihi!!!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHhi!HHIH!" + "'", str28, "Hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHhi!HHIH!");
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
        char[] charArray23 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray23);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray23);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray23);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray23);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.capitalize("h", charArray23);
        java.lang.String str29 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray23);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray23);
        java.lang.String str31 = org.apache.commons.lang.WordUtils.initials("hI!", charArray23);
        java.lang.String str32 = org.apache.commons.lang.WordUtils.uncapitalize("hhih!", charArray23);
        java.lang.String str33 = org.apache.commons.lang.WordUtils.initials("HhI!HhI!IhI!HhI!!", charArray23);
        java.lang.String str34 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!IHI!!", charArray23);
        java.lang.String str35 = org.apache.commons.lang.WordUtils.uncapitalize("hhI!HhI!IhI!HhI!!", charArray23);
        java.lang.String str36 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!", charArray23);
        java.lang.String str37 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihI!hhhi!hhi!ihi!", charArray23);
        java.lang.String str38 = org.apache.commons.lang.WordUtils.capitalize("hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!", charArray23);
        java.lang.String str39 = org.apache.commons.lang.WordUtils.capitalize("HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHHHIH!HHHHIH!", charArray23);
        java.lang.String str40 = org.apache.commons.lang.WordUtils.capitalize("HhI!HhI!IhI!HhI!!", charArray23);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "H" + "'", str28, "H");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Hhih!" + "'", str29, "Hhih!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Hi!" + "'", str30, "Hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "h" + "'", str31, "h");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hhih!" + "'", str32, "hhih!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "H" + "'", str33, "H");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Hhi!ihi!!" + "'", str34, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hhI!HhI!IhI!HhI!!" + "'", str35, "hhI!HhI!IhI!HhI!!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!" + "'", str36, "Hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihI!hhhi!hhi!ihi!" + "'", str37, "hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihI!hhhi!hhi!ihi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!" + "'", str38, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHHHIH!HHHHIH!" + "'", str39, "HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHHHIH!HHHHIH!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "HhI!HhI!IhI!HhI!!" + "'", str40, "HhI!HhI!IhI!HhI!!");
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
        char[] charArray20 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray20);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray20);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray20);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray20);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalize("h", charArray20);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray20);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.capitalize("Hhi!ihi!!", charArray20);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray20);
        java.lang.String str29 = org.apache.commons.lang.WordUtils.initials("hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", charArray20);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.capitalize("hhHIH!HhHIH!hhHIH!hhHIH!hhHIH!ihHIH!hhHIH!!hHIH!hhHIH!hhHIH!HhHIH!HhHIH!IhHIH!HhHIH!!", charArray20);
        java.lang.String str31 = org.apache.commons.lang.WordUtils.capitalizeFully("hhHIH!HhHIH!hhHIH!hhHIH!hhHIH!ihHIH!hhHIH!!hHIH!hhHIH!hhHIH!HhHIH!HhHIH!IhHIH!HhHIH!!", charArray20);
        java.lang.String str32 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihhhi!ihi!!", charArray20);
        java.lang.String str33 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihi!!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!", charArray20);
        java.lang.String str34 = org.apache.commons.lang.WordUtils.initials("", charArray20);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "H" + "'", str25, "H");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Hhih!" + "'", str26, "Hhih!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Hhi!ihi!!" + "'", str27, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Hi!" + "'", str28, "Hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "h" + "'", str29, "h");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "HhHIH!HhHIH!hhHIH!hhHIH!hhHIH!ihHIH!hhHIH!!hHIH!hhHIH!hhHIH!HhHIH!HhHIH!IhHIH!HhHIH!!" + "'", str30, "HhHIH!HhHIH!hhHIH!hhHIH!hhHIH!ihHIH!hhHIH!!hHIH!hhHIH!hhHIH!HhHIH!HhHIH!IhHIH!HhHIH!!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!" + "'", str31, "Hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Hhi!hhi!ihhhi!ihi!!" + "'", str32, "Hhi!hhi!ihhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hhhi!ihi!!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str33, "hhhi!ihi!!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
        char[] charArray13 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhHHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!i!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hi!" + "'", str16, "Hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str18, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhHHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!i!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!" + "'", str19, "hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhHHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!i!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!" + "'", str2, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!");
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHhhi!hhi!hHHHHIH!HHHHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHIH!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHhhi!hhi!hHHHHIH!HHHHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHIH!" + "'", str2, "HHhhi!hhi!hHHHHIH!HHHHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHIH!");
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHhi!HHIH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihhi!hhih!" + "'", str1, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihhi!hhih!");
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHHIH!HHHIHhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHIHhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!HHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHIH!HHHIHhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHIHhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!HHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!" + "'", str2, "HHHIH!HHHIHhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHIHhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!HHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!");
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
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
        java.lang.String str30 = org.apache.commons.lang.WordUtils.capitalizeFully("hhHIH!HhHIH!hhHIH!hhHIH!hhHIH!ihHIH!hhHIH!!hHIH!hhHIH!hhHIH!HhHIH!HhHIH!IhHIH!HhHIH!!", charArray19);
        java.lang.String str31 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!ihi!!hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!", charArray19);
        java.lang.String str32 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhhhih!hhhhhih!hihhhhhhih!hhhhih!", charArray19);
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!" + "'", str30, "Hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Hhhi!ihi!!hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!" + "'", str31, "Hhhi!ihi!!hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhhhih!hhhhhih!hihhhhhhih!hhhhih!" + "'", str32, "Hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhhhih!hhhhhih!hihhhhhhih!hhhhih!");
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
        char[] charArray9 = new char[] { '4', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihi!hhi!!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "h" + "'", str12, "h");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str13, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str15, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
        char[] charArray19 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray19);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray19);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray19);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray19);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalize("h", charArray19);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray19);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!", charArray19);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.uncapitalize("HHI!HHI!IHI!HHI!!", charArray19);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.initials("hHIH!", charArray19);
        java.lang.String str29 = org.apache.commons.lang.WordUtils.initials("", charArray19);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.uncapitalize("hhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIH!IhHIH!!hHIH!!", charArray19);
        java.lang.String str31 = org.apache.commons.lang.WordUtils.initials("HhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!", charArray19);
        java.lang.String str32 = org.apache.commons.lang.WordUtils.capitalize("hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhHhhhhih!hhhhHHHIH!HHHHHIH!HIHHHIhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!H!HHHHHIH!HhHHHIH!HHhhih!hhih!i!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hHhhhhih!hhhhHHHIH!HHHHHIH!HIHHHIhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!H!HHHHHIH!HhHHHIH!HHhhih!hhih!hi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhiHhhhhih!hhhhHHHIH!HHHHHIH!HIHHHIhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!H!HHHHHIH!HhHHHIH!HHhhih!hhih!!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!", charArray19);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H" + "'", str24, "H");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "H" + "'", str25, "H");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str26, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hHI!HHI!IHI!HHI!!" + "'", str27, "hHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "h" + "'", str28, "h");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIH!IhHIH!!hHIH!!" + "'", str30, "hhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIH!IhHIH!!hHIH!!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "H" + "'", str31, "H");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhHhhhhih!hhhhHHHIH!HHHHHIH!HIHHHIhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!H!HHHHHIH!HhHHHIH!HHhhih!hhih!i!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hHhhhhih!hhhhHHHIH!HHHHHIH!HIHHHIhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!H!HHHHHIH!HhHHHIH!HHhhih!hhih!hi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhiHhhhhih!hhhhHHHIH!HHHHHIH!HIHHHIhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!H!HHHHHIH!HhHHHIH!HHhhih!hhih!!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str32, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhHhhhhih!hhhhHHHIH!HHHHHIH!HIHHHIhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!H!HHHHHIH!HhHHHIH!HHhhih!hhih!i!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hHhhhhih!hhhhHHHIH!HHHHHIH!HIHHHIhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!H!HHHHHIH!HhHHHIH!HHhhih!hhih!hi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhiHhhhhih!hhhhHHHIH!HHHHHIH!HIHHHIhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!H!HHHHHIH!HhHHHIH!HHhhih!hhih!!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3261");
        char[] charArray11 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("HHI!IHI!!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("HHi!hHi!iHi!hHi!!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHhi!HHIH!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HHI!IHI!!" + "'", str14, "HHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HHi!hHi!iHi!hHi!!" + "'", str15, "HHi!hHi!iHi!hHi!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihhi!hhih!" + "'", str16, "Hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihhi!hhih!");
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3262");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!", (-1), (int) (byte) 1, "HHHIH!HHHIHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhHI!IHI!!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!hhi!ihhHhhi!hhi!hHHHHIH!HHHHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHIH!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHHIH!HHHIHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhHI!IHI!!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!hhi!ihhHhhi!hhi!hHHHHIH!HHHHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHIH!" + "'", str4, "HHHHIH!HHHIHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhHI!IHI!!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!hhi!ihhHhhi!hhi!hHHHHIH!HHHHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHIH!");
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3263");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHHIH!HHHIH!HHHIH!HHHIH!HHHIH!IHHIH!HHHIH!!HHIH!HHHIH!HHHIH!HHHIH!HHHIH!HHHIH!IHHIH!HHHIH!!HHIH!HHHIH!IHHIH!HHHIH!HHHIH!HHHIH!IHHIH!HHHIH!!HHIH!HHHIH!HHHIH!HHHIH!HHHIH!HHHIH!IHHIH!HHHIH!!HHIH!HHHIH!!HHIH!HHHIH!HHHIH!HHHIH!HHHIH!HHHIH!IHHIH!HHHIH!!HHIH!HHHIH!HHHIH!HHHIH!HHHIH!HHHIH!IHHIH!HHHIH!!HHIH!HHHIH!IHHIH!HHHIH!HHHIH!HHHIH!IHHIH!HHHIH!!HHIH!HHHIH!HHHIH!HHHIH!HHHIH!HHHIH!IHHIH!HHHIH!!HHIH!HHHIH!!HHIH!IHHIH!HHHIH!HHHIH!HHHIH!HHHIH!IHHIH!HHHIH!!HHIH!HHHIH!HHHIH!HHHIH!HHHIH!HHHIH!IHHIH!HHHIH!!HHIH!HHHIH!IHHIH!HHHIH!HHHIH!HHHIH!IHHIH!HHHIH!!HHIH!HHHIH!HHHIH!HHHIH!HHHIH!HHHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!IHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHIH!HHHIH!HHHIH!HHHIH!HHHIH!IHHIH!HHHIH!!HHIH!HHHIH!HHHIH!HHHIH!HHHIH!HHHIH!IHHIH!HHHIH!!HHIH!HHHIH!IHHIH!HHHIH!HHHIH!HHHIH!IHHIH!HHHIH!!HHIH!HHHIH!HHHIH!HHHIH!HHHIH!HHHIH!IHHIH!HHHIH!!HHIH!HHHIH!!HHIH!HHHIH!HHHIH!HHHIH!HHHIH!HHHIH!IHHIH!HHHIH!!HHIH!HHHIH!HHHIH!HHHIH!HHHIH!HHHIH!IHHIH!HHHIH!!HHIH!HHHIH!IHHIH!HHHIH!HHHIH!HHHIH!IHHIH!HHHIH!!HHIH!HHHIH!HHHIH!HHHIH!HHHIH!HHHIH!IHHIH!HHHIH!!HHIH!HHHIH!!HHIH!IHHIH!HHHIH!HHHIH!HHHIH!HHHIH!IHHIH!HHHIH!!HHIH!HHHIH!HHHIH!HHHIH!HHHIH!HHHIH!IHHIH!HHHIH!!HHIH!HHHIH!IHHIH!HHHIH!HHHIH!HHHIH!IHHIH!HHHIH!!HHIH!HHHIH!HHHIH!HHHIH!HHHIH!HHHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!IHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!!" + "'", str1, "HHHIH!HHHIH!HHHIH!HHHIH!HHHIH!IHHIH!HHHIH!!HHIH!HHHIH!HHHIH!HHHIH!HHHIH!HHHIH!IHHIH!HHHIH!!HHIH!HHHIH!IHHIH!HHHIH!HHHIH!HHHIH!IHHIH!HHHIH!!HHIH!HHHIH!HHHIH!HHHIH!HHHIH!HHHIH!IHHIH!HHHIH!!HHIH!HHHIH!!HHIH!HHHIH!HHHIH!HHHIH!HHHIH!HHHIH!IHHIH!HHHIH!!HHIH!HHHIH!HHHIH!HHHIH!HHHIH!HHHIH!IHHIH!HHHIH!!HHIH!HHHIH!IHHIH!HHHIH!HHHIH!HHHIH!IHHIH!HHHIH!!HHIH!HHHIH!HHHIH!HHHIH!HHHIH!HHHIH!IHHIH!HHHIH!!HHIH!HHHIH!!HHIH!IHHIH!HHHIH!HHHIH!HHHIH!HHHIH!IHHIH!HHHIH!!HHIH!HHHIH!HHHIH!HHHIH!HHHIH!HHHIH!IHHIH!HHHIH!!HHIH!HHHIH!IHHIH!HHHIH!HHHIH!HHHIH!IHHIH!HHHIH!!HHIH!HHHIH!HHHIH!HHHIH!HHHIH!HHHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!IHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!HHHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!HHIH!!");
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3264");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str1, "HHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3265");
        char[] charArray12 = new char[] { '4', '4' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!IHI!!", charArray12);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!", charArray12);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("hHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!", charArray12);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", charArray12);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHIHhhi!hhi!ihi!hhi!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hI!" + "'", str15, "hI!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hi!" + "'", str16, "Hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhi!ihi!!" + "'", str18, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str19, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!" + "'", str20, "HHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str21, "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihhhi!hhi!ihi!hhi!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!" + "'", str22, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihhhi!hhi!ihi!hhi!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!");
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3266");
        char[] charArray15 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("HI!", charArray15);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("hHI!IHI!!", charArray15);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray15);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray15);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", charArray15);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("hHi!hHi!iHi!hHi!!", charArray15);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhhhih!hhhhhih!hihhhhhhih!hhhhih!", charArray15);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.uncapitalize("HhHHHIH!HHHHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "h" + "'", str18, "h");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hi!" + "'", str20, "Hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str21, "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HHi!hHi!iHi!hHi!!" + "'", str22, "HHi!hHi!iHi!hHi!!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhhhih!hhhhhih!hihhhhhhih!hhhhih!" + "'", str23, "hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhhhih!hhhhhih!hihhhhhhih!hhhhih!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hhHHHIH!HHHHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!" + "'", str24, "hhHHHIH!HHHHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!");
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3267");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHi!hHi!iH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3268");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!", 10, (int) ' ', "HHHIH!HHHIHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihhHhhi!hhi!hHHHHIH!HHHHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHIH!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!HHHIH!HHHIHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihhHhhi!hhi!hHHHHIH!HHHHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHIH!" + "'", str4, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!HHHIH!HHHIHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihhHhhi!hhi!hHHHHIH!HHHHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHIH!");
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3269");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHHHIH!HHHhHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHIH!HHHhHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!" + "'", str1, "HHHHIH!HHHhHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!");
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3270");
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
        java.lang.String str33 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!HHI!IHI!HHI!!", charArray21);
        java.lang.String str34 = org.apache.commons.lang.WordUtils.uncapitalize("hHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!", charArray21);
        java.lang.String str35 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHHIH!HHHHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHIH!", charArray21);
        java.lang.String str36 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!", charArray21);
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
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hHI!HHI!IHI!HHI!!" + "'", str33, "hHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!" + "'", str34, "hHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hHHHHIH!HHHHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHIH!" + "'", str35, "hHHHHIH!HHHHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHIH!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str36, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3271");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhih!hhhihhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", 1, (int) 'a', "hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhih!hhhihhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHhhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str4, "hhhih!hhhihhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHhhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3272");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!H!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!HHhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!H!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!HHhh" + "'", str1, "HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!H!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!HHhh");
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3273");
        char[] charArray9 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IhHHI!HHI!Ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!HI!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IhHHI!HHI!Ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!HI!" + "'", str11, "HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IhHHI!HHI!Ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!HI!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3274");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHHI!HHI!IhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3275");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("", (int) ' ', "hHhhi!hhi!hHHHHIH!HHHHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHIH!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3276");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HhHI!HHI!IhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HhHI!HHI!IhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!" + "'", str2, "HhHI!HHI!IhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!");
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3277");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHHIH!HHHIHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!", 100, "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHIH!HHHIHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str4, "hHHIH!HHHIHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3278");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3279");
        char[] charArray16 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("hHIH!", charArray16);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("H", charArray16);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihi!hhi!!", charArray16);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.initials("hHI!HHI!IHI!HHI!!", charArray16);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.initials("HhHHHIH!HHhhih!", charArray16);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.initials("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!", charArray16);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalize("hHI!HHI!IHHhHHHIH!HHhhih!", charArray16);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "h" + "'", str20, "h");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H" + "'", str21, "H");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str22, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "h" + "'", str23, "h");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H" + "'", str24, "H");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "H" + "'", str25, "H");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HHI!HHI!IHHhHHHIH!HHhhih!" + "'", str26, "HHI!HHI!IHHhHHHIH!HHhhih!");
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3280");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhhih!hhhih!ihhih!!hhih!ihhih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhih!hhhih!ihhih!!hhih!ihhih!" + "'", str1, "Hhhhhih!hhhih!ihhih!!hhih!ihhih!");
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3281");
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
        java.lang.String str29 = org.apache.commons.lang.WordUtils.initials("hHhhhih!hhHHIH!", charArray18);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!", charArray18);
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
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "h" + "'", str29, "h");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str30, "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3282");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihhi!hhih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihhi!hhih!" + "'", str1, "hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihhi!hhih!");
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3283");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!" + "'", str2, "hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!");
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3284");
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
        java.lang.String str29 = org.apache.commons.lang.WordUtils.capitalize("hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!", charArray18);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.initials("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!", charArray18);
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
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!" + "'", str29, "HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "H" + "'", str30, "H");
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3285");
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
        java.lang.String str28 = org.apache.commons.lang.WordUtils.initials("HhI!HhI!Ih", charArray17);
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "H" + "'", str28, "H");
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3286");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIH!IhHIH!!hHIH!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!" + "'", str1, "Hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3287");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!" + "'", str2, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!");
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3288");
        char[] charArray15 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray15);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray15);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray15);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray15);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!", charArray15);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhi!ihi!!hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!", charArray15);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.uncapitalize("hHhhhih!hhHHIH!", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hi!" + "'", str18, "Hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hI!" + "'", str21, "hI!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str23, "Hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hHhhhih!hhHHIH!" + "'", str24, "hHhhhih!hhHHIH!");
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3289");
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
        java.lang.String str32 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!", charArray19);
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "H" + "'", str27, "H");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "HI!" + "'", str28, "HI!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i" + "'", str29, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hI!" + "'", str30, "hI!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str31, "Hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!" + "'", str32, "hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3290");
        char[] charArray9 = new char[] { '4', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hI!" + "'", str12, "hI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3291");
        char[] charArray14 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("HI!", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihi!hhi!!", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhHHHHIH!HHHHIH!", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str19, "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str20, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhhih!hhhhih!" + "'", str22, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhhih!hhhhih!");
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3292");
        char[] charArray10 = new char[] { '4', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!HhI!IhI!HhI!!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHI!HHI!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str12, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "h" + "'", str14, "h");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!" + "'", str15, "HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhhi!hhi!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!" + "'", str17, "Hhhi!hhi!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhhhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!" + "'", str18, "hhhhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3293");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhhhih!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhHHI!IHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHHI!HHI!IHI!", (-1), "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhhih!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhHHI!IHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHHI!HHI!IHI!" + "'", str4, "Hhhhhih!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhHHI!IHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHHI!HHI!IHI!");
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3294");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!ihhih!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!", (int) ' ', 0, "hHHHHIH!HHHHhhhih!hhhhhih!hihhhiHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!h!hhhhhih!hHhhhih!hhHHIH!HHIH!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhih!hhhih!hhhih!ihhih!hhhih!!hhHHHHIH!HHHHhhhih!hhhhhih!hihhhiHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!h!hhhhhih!hHhhhih!hhHHIH!HHIH!" + "'", str4, "Hhhih!hhhih!hhhih!ihhih!hhhih!!hhHHHHIH!HHHHhhhih!hhhhhih!hihhhiHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!h!hhhhhih!hHhhhih!hhHHIH!HHIH!");
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3295");
        char[] charArray17 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray17);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray17);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray17);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray17);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("h", charArray17);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray17);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.initials("hhI!HhI!IhI!HhI!!", charArray17);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!HhI!IhI!HhI!!", charArray17);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.initials("hhih!", charArray17);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.capitalize("HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!", charArray17);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.uncapitalize("HHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!", charArray17);
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!" + "'", str27, "HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!" + "'", str28, "hHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!");
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3296");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHHHIH!HHHHIH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHHHIH!HHHHIH!" + "'", str1, "hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHHHIH!HHHHIH!");
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3297");
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
        java.lang.String str27 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhi!hhi!ihi!hhi!!i!i", charArray17);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!HHI!IH", charArray17);
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhi!hhi!ihi!hhi!!i!i" + "'", str27, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhi!hhi!ihi!hhi!!i!i");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hHI!HHI!IH" + "'", str28, "hHI!HHI!IH");
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3298");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3299");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHHhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIH!IhHIH!!hHIH!!", 10, "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHhHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihhhih!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIH!IhHIH!!hHIH!!" + "'", str4, "HHHhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIH!IhHIH!!hHIH!!");
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3300");
        char[] charArray9 = new char[] { '4', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("h", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!ihhih!!hHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hih!ihhih!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hhhih!ihhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!!hhih!!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("Hhhih!hhhiHhi!hhi!ihi!hhi!!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalize("Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("hHhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhHH", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "h" + "'", str12, "h");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!ihhih!!hHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hih!ihhih!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hhhih!ihhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!!hhih!!" + "'", str13, "Hhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!ihhih!!hHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hih!ihhih!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hhhih!ihhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!!hhih!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!" + "'", str15, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HHhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhHH" + "'", str16, "HHhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhHH");
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3301");
        char[] charArray13 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("HI!", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("HHIH!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("HHIH!", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("Hhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!ihhih!!hHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hih!ihhih!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hhhih!ihhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!!hhih!!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hi!" + "'", str16, "Hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhih!" + "'", str17, "Hhih!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HHIH!" + "'", str18, "HHIH!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!ihhih!!hHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hih!ihhih!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hhhih!ihhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!!hhih!!" + "'", str19, "Hhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!ihhih!!hHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hih!ihhih!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hhhih!ihhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!!hhih!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str20, "Hhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3302");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHHhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!", 0, "HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHHhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str4, "HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHHhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3303");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str1, "hhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3304");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!" + "'", str2, "Hhhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!");
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3305");
        char[] charArray12 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("HI!", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihi!hhi!!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("hHI!IHI!!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIH!IhHIH!!hHIH!!", charArray12);
        java.lang.Class<?> wildcardClass19 = charArray12.getClass();
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HHI!IHI!!" + "'", str17, "HHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!" + "'", str18, "Hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3306");
        char[] charArray8 = new char[] { '4', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("h", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!ihhih!!hHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hih!ihhih!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hhhih!ihhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!!hhih!!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("Hhhih!hhhiHhi!hhi!ihi!hhi!!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!", charArray8);
        java.lang.Class<?> wildcardClass15 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "h" + "'", str10, "h");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!ihhih!!hHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hih!ihhih!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hhhih!ihhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!!hhih!!" + "'", str12, "Hhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!ihhih!!hHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hih!ihhih!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hhhih!ihhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!!hhih!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!" + "'", str14, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3307");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhihhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhihhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str2, "Hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhihhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3308");
        char[] charArray14 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("h", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("hhI!HhI!IhI!HhI!!", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhi!hhi!ihhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!hi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", charArray14);
        java.lang.Class<?> wildcardClass23 = charArray14.getClass();
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "h" + "'", str21, "h");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3309");
        char[] charArray10 = new char[] { '4', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("h", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("Hhi!ihi!!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("hI!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("Hhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("hHHIH!HHHIhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HhhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!I!HhI!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hI!" + "'", str12, "hI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "h" + "'", str16, "h");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str17, "Hhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hHHIH!HHHIhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HhhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!I!HhI!!" + "'", str18, "hHHIH!HHHIhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HhhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!I!HhI!!");
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3310");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHHhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIHHHHI!HHI!IhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHHhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIHHHHI!HHI!IhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!" + "'", str1, "HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHHhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIHHHHI!HHI!IhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!");
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3311");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!", (int) (short) 100, "Hhi!ihi!!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!" + "'", str4, "Hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!");
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3312");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3313");
        char[] charArray13 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("hHIH!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!hhi!iHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("HHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "h" + "'", str17, "h");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhhi!hhi!iHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str18, "hhhi!hhi!iHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3314");
        char[] charArray16 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray16);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("h", charArray16);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray16);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("Hhi!ihi!!", charArray16);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray16);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalize("hHHHHIH!HHHHIH!", charArray16);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalize("HHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!", charArray16);
        java.lang.Class<?> wildcardClass27 = charArray16.getClass();
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H" + "'", str21, "H");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhih!" + "'", str22, "Hhih!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hhi!ihi!!" + "'", str23, "Hhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hi!" + "'", str24, "Hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "HHHHHIH!HHHHIH!" + "'", str25, "HHHHHIH!HHHHIH!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!" + "'", str26, "HHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3315");
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
        java.lang.String str30 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!", charArray19);
        java.lang.String str31 = org.apache.commons.lang.WordUtils.initials("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!!", charArray19);
        java.lang.String str32 = org.apache.commons.lang.WordUtils.initials("Hhhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!hhi!ihhhhhi!hhi!hhhhhih!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!hhih!", charArray19);
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhihhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!" + "'", str30, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhihhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "h" + "'", str31, "h");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "H" + "'", str32, "H");
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3316");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihI!hhhi!hhi!ihi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3317");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!", (int) (byte) 10, (int) (byte) -1, "Hhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihh");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!" + "'", str4, "HHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!");
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3318");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhiHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!h!hhHHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!I!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!I!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!I!HHI!IHI!", (int) (byte) 100, 0, "hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhiHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!h!hhHHhhhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!" + "'", str4, "Hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhiHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!h!hhHHhhhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!");
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3319");
        char[] charArray10 = new char[] { '4', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("h", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("Hhi!ihi!!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("hI!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhh", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hI!" + "'", str12, "hI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "h" + "'", str16, "h");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str17, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "h" + "'", str18, "h");
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3320");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHHHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!IHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!!HHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!IHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!!HHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!IHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!IHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!!HHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!IHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!!HHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!" + "'", str1, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!");
    }

    @Test
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3321");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str1, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
    }

    @Test
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3322");
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
        java.lang.String str34 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray20);
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3323");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!", 0, (int) ' ', "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihhhi!hhi!ihi!hhi!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihhhi!hhi!ihi!hhi!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!" + "'", str4, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihhhi!hhi!ihi!hhi!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!");
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3324");
        char[] charArray7 = new char[] { '4', '4' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.initials("h", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hi!" + "'", str8, "Hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hI!" + "'", str9, "hI!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "h" + "'", str10, "h");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str12, "Hhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3325");
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
        java.lang.String str32 = org.apache.commons.lang.WordUtils.capitalize("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i", charArray20);
        java.lang.String str33 = org.apache.commons.lang.WordUtils.capitalize("hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!", charArray20);
        java.lang.String str34 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!", charArray20);
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i" + "'", str32, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!" + "'", str33, "HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str34, "Hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3326");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!HhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHHhHI!IHI!!hhHI!IHI!!ihHI!IHI!!hhHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str1, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3327");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHhhi!hhi!iHhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!HI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!", (int) (byte) 100, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhHHIH!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHhhi!hhi!iHhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!HI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!" + "'", str4, "HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHhhi!hhi!iHhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!HI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!");
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3328");
        char[] charArray12 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("HHIH!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("hhhhih!hhhhhih!hihhhih!hhhhhih!h!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHhi!HHIH!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhhhih!hhhhhih!hihhhih!hhhhhih!h!" + "'", str17, "Hhhhih!hhhhhih!hihhhih!hhhhhih!h!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihhi!hhih!" + "'", str18, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihhi!hhih!");
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3329");
        char[] charArray15 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray15);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray15);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray15);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray15);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!", charArray15);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!", charArray15);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!", charArray15);
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!" + "'", str24, "Hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3330");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!" + "'", str1, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!");
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3331");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhhih!hhhihhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHhhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhih!hhhihhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHhhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str1, "Hhhih!hhhihhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHhhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3332");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3333");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhi!hhi!ihi!hhi!!i!i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhi!hhi!ihi!hhi!!i!i" + "'", str1, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhi!hhi!ihi!hhi!!i!i");
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3334");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHI!IHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHHI!HHI!IHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhi!hhi!ihi!" + "'", str1, "Hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhi!hhi!ihi!");
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3335");
        char[] charArray15 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("HI!", charArray15);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihi!hhi!!", charArray15);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray15);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("hHI!IHI!!", charArray15);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("HHIH!", charArray15);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("hHI!HHI!IHI!HHI!!", charArray15);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("HI!", charArray15);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.initials("", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HHI!IHI!!" + "'", str20, "HHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H" + "'", str21, "H");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "h" + "'", str22, "h");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "HI!" + "'", str23, "HI!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3336");
        char[] charArray15 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray15);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("h", charArray15);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray15);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("HHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!", charArray15);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.initials("hhi!ihi!!", charArray15);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.initials("HhHhhhih!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!I!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!I!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHHHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!I!HHI!IHI!", charArray15);
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H" + "'", str24, "H");
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3337");
        char[] charArray6 = new char[] { '4', '4' };
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("HhhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Hi!" + "'", str7, "Hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H" + "'", str8, "H");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!" + "'", str9, "hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HhhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!" + "'", str10, "HhhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!");
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3338");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!", (int) (short) 10, 0, "hhhih!hhhihhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHHHIH!HHhhhih!hhhihhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!" + "'", str4, "HHHHHIH!HHhhhih!hhhihhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!");
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3339");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!" + "'", str2, "hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!");
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3340");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHHIH!HHHIHHI!HHI!IHI!HHI!!", (int) (byte) 0, "Hhhih!hhhihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhi!hhi!ihHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!ihi!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHIH!HHHIHHI!HHI!IHI!HHI!!" + "'", str4, "hHHIH!HHHIHHI!HHI!IHI!HHI!!");
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3341");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!hhi!iHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str1, "Hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3342");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3343");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHHhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIHHHHI!HHI!IhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str1, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3344");
        char[] charArray8 = new char[] { '4', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHI!IHI!!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hI!" + "'", str11, "hI!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str13, "Hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str14, "Hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3345");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!IHI!!!hih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!", (int) '#', (int) (byte) 10, "Hhhhhhih!hhhi!ihi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhHhhhih!hhhhhih!hihhhih!hhhhhih!h!Hhhhhhih!hhhi!ihi!!" + "'", str4, "hhHhhhih!hhhhhih!hihhhih!hhhhhih!h!Hhhhhhih!hhhi!ihi!!");
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3346");
        char[] charArray11 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("HI!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihi!hhi!!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhih!hhhhhih!hihhhih!hhhhhih!h!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhhhih!hhhhhih!hihhhih!hhhhhih!h!" + "'", str15, "Hhhhih!hhhhhih!hihhhih!hhhhhih!h!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str16, "hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3347");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhihhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhihhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str1, "hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhihhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3348");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHhih!hHhih!HHhih!HHhih!HHhih!IHhih!HHhih!!Hhih!HHhih!HHhih!hHhih!hHhih!iHhih!hHhih!!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHhih!hHhih!HHhih!HHhih!HHhih!IHhih!HHhih!!Hhih!HHhih!HHhih!hHhih!hHhih!iHhih!hHhih!!" + "'", str2, "HHhih!hHhih!HHhih!HHhih!HHhih!IHhih!HHhih!!Hhih!HHhih!HHhih!hHhih!hHhih!iHhih!hHhih!!");
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3349");
        char[] charArray16 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("hHIH!", charArray16);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("H", charArray16);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihi!hhi!!", charArray16);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.initials("hHI!HHI!IHI!HHI!!", charArray16);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!", charArray16);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!", charArray16);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalize("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhi!hhi!ihi!hhi!!i!i", charArray16);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "h" + "'", str20, "h");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H" + "'", str21, "H");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str22, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "h" + "'", str23, "h");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str24, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str25, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhi!hhi!ihi!hhi!!i!i" + "'", str26, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhi!hhi!ihi!hhi!!i!i");
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3350");
        char[] charArray12 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("HI!", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihi!hhi!!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("hHHIH!HHHIHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHHI!HHI!IHhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!HHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!IHI!!!", charArray12);
        java.lang.Class<?> wildcardClass19 = charArray12.getClass();
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str17, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "h" + "'", str18, "h");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3351");
        char[] charArray14 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("hHIH!", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("H", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("HHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihi!hhi!!", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "h" + "'", str18, "h");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!" + "'", str20, "hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!" + "'", str21, "HHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str22, "Hhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3352");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HhHhhhih!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!", 1, (int) '#', "HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHIHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHHHIH!HHHHIH!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhHhhhih!hhhhhih!hhhhhih!hihhhih!hhHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHIHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHHHIH!HHHHIH!" + "'", str4, "HhHhhhih!hhhhhih!hhhhhih!hihhhih!hhHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHIHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHHHIH!HHHHIH!");
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3353");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHHIH!HHhhih!", (int) (byte) -1, "hHHIH!HHHIHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!H!IHHIH!!HHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HIH!IHHIH!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!HHHIH!IHHIHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!H!!HHIH!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHHIH!HHhhih!" + "'", str4, "HhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHHIH!HHhhih!");
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3354");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhHI!IHI!!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhHI!IHI!!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str2, "hhHI!IHI!!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
    }

    @Test
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3355");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhi!hhi!ihi!hhi!!", (int) (short) 100, "hHHhih!hHhih!HHhih!HHhih!HHhih!IHhih!HHhih!!Hhih!HHhih!HHhih!hHhih!hHhih!iHhih!hHhih!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhi!hhi!ihi!hhi!!" + "'", str4, "HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3356");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!iiHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!iiHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!iiHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3357");
        char[] charArray12 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("h", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray12);
        java.lang.Class<?> wildcardClass19 = charArray12.getClass();
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HI!" + "'", str18, "HI!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3358");
        char[] charArray12 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("HI!", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihi!hhi!!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhih!hhhhhih!hihhhih!hhhhhih!h!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("HhI!HhI!Ih", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhiHHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhhih!hhhhhih!hihhhih!hhhhhih!h!" + "'", str16, "Hhhhih!hhhhhih!hihhhih!hhhhhih!h!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhihhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hhi!!" + "'", str18, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhihhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hhi!!");
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3359");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhh", (int) (byte) 1, 100, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhihhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhh" + "'", str4, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhh");
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3360");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str1, "hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3361");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!", (int) (byte) 1, (int) (byte) 100, "HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!" + "'", str4, "hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!");
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3362");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhHhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhHHHHIH!HHHHIH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhHhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhHHHHIH!HHHHIH!" + "'", str1, "hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhHhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhHHHHIH!HHHHIH!");
    }

    @Test
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3363");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!i", (int) 'a', 0, "HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!HHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhi!hhiHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!HHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhi!hhiHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!!ihi!hhi!!" + "'", str4, "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!HHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhi!hhiHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!!ihi!hhi!!");
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3364");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHHHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihihHHIH!HHHIHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhHhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHHHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihihHHIH!HHHIHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhHhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str2, "HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHHHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihihHHIH!HHHIHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhHhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3365");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!HHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!IHI!!!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!HHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!IHI!!!" + "'", str2, "hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!HHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!IHI!!!");
    }

    @Test
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3366");
        char[] charArray8 = new char[] { '4', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("Hhhhih!hhhhhih!hihhhih!hhhhhih!h!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!IHI!!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hI!" + "'", str11, "hI!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhhhih!hhhhhih!hihhhih!hhhhhih!h!" + "'", str13, "Hhhhih!hhhhhih!hihhhih!hhhhhih!h!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
    }

    @Test
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3367");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHH" + "'", str1, "hHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHH");
    }

    @Test
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3368");
        char[] charArray18 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray18);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray18);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray18);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray18);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("h", charArray18);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray18);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray18);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.initials("hI!", charArray18);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.initials("hHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!", charArray18);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.initials("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!!", charArray18);
        java.lang.String str29 = org.apache.commons.lang.WordUtils.uncapitalize("hhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!", charArray18);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhh", charArray18);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H" + "'", str23, "H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hhih!" + "'", str24, "Hhih!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "H" + "'", str25, "H");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "h" + "'", str26, "h");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "h" + "'", str27, "h");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "h" + "'", str28, "h");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str29, "hhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhh" + "'", str30, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhh");
    }

    @Test
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3369");
        char[] charArray7 = new char[] { '4', '4' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!ihi!!!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("Hhhih!hhhihhhhhih!hhhhhih!hihhhih!hHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!", charArray7);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("HhhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hi!" + "'", str8, "Hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!ihi!!!" + "'", str9, "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!ihi!!!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str10, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hhhih!hhhihhhhhih!hhhhhih!hihhhih!hHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str11, "Hhhih!hhhihhhhhih!hhhhhih!hihhhih!hHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhihhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!" + "'", str12, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhihhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!");
    }

    @Test
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3370");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihhhih!", (int) (short) 100, "H", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!iHhhhih!" + "'", str4, "hhHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!iHhhhih!");
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3371");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!", (int) '4', "hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!i!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str4, "Hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
    }

    @Test
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3372");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhhhhih!hhhhhih!hhhhhih!hihhhihhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!ihhhhih!hhhhhih!hihhhih!hhhhhhhh", 100, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhhhih!hhhhhih!hhhhhih!hihhhihhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!ihhhhih!hhhhhih!hihhhih!hhhhhhhh" + "'", str4, "Hhhhhhih!hhhhhih!hhhhhih!hihhhihhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!ihhhhih!hhhhhih!hihhhih!hhhhhhhh");
    }

    @Test
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3373");
        char[] charArray6 = new char[] { '4' };
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhh", charArray6);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalize("hhhhih!hhhhhih!hihhhih!hhhhhih!h!", charArray6);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.initials("hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!", charArray6);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hhhih!hhhihhih!hhhi!hhi!ihhih!hi!hhi!!hhhhih!hi!hhi!ihihhih!!hhi!!ihhihhih!!hhi!ihi!hhhih!hi!!!hhi!hhhih!hi!ihi!hhihhih!!!ihhi!hhihhih!!ihi!hhi!!hhih!hhhi!hhi!i", charArray6);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhhhhih!hhhhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhihhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!h!hhhih!hhhih!hhhih!ihhih!hhhih!!!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihhhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!h!hhhih!hhhih!hhhih!ihhih!hhhih!!i!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hhi!!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4' });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhh" + "'", str7, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhh");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hhhhih!hhhhhih!hihhhih!hhhhhih!h!" + "'", str8, "Hhhhih!hhhhhih!hihhhih!hhhhhih!h!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "h" + "'", str9, "h");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhhih!hhhihhih!hhhi!hhi!ihhih!hi!hhi!!hhhhih!hi!hhi!ihihhih!!hhi!!ihhihhih!!hhi!ihi!hhhih!hi!!!hhi!hhhih!hi!ihi!hhihhih!!!ihhi!hhihhih!!ihi!hhi!!hhih!hhhi!hhi!i" + "'", str10, "Hhhih!hhhihhih!hhhi!hhi!ihhih!hi!hhi!!hhhhih!hi!hhi!ihihhih!!hhi!!ihhihhih!!hhi!ihi!hhhih!hi!!!hhi!hhhih!hi!ihi!hhihhih!!!ihhi!hhihhih!!ihi!hhi!!hhih!hhhi!hhi!i");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhhhhih!hhhhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhihhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!h!hhhih!hhhih!hhhih!ihhih!hhhih!!!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihhhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!h!hhhih!hhhih!hhhih!ihhih!hhhih!!i!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hhi!!" + "'", str11, "hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhhhhih!hhhhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhihhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!h!hhhih!hhhih!hhhih!ihhih!hhhih!!!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihhhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!h!hhhih!hhhih!hhhih!ihhih!hhhih!!i!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hhi!!");
    }

    @Test
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3374");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!" + "'", str1, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!");
    }

    @Test
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3375");
        char[] charArray18 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray18);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray18);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray18);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray18);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("h", charArray18);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray18);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray18);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.initials("hI!", charArray18);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.uncapitalize("hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!", charArray18);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.capitalize("h", charArray18);
        java.lang.String str29 = org.apache.commons.lang.WordUtils.uncapitalize("HHhhhih!hhhhhih!hihhhih!hhhhhih!HhHI!IHI!!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!", charArray18);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.capitalize("", charArray18);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H" + "'", str23, "H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hhih!" + "'", str24, "Hhih!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "H" + "'", str25, "H");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "h" + "'", str26, "h");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!" + "'", str27, "hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "H" + "'", str28, "H");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hHhhhih!hhhhhih!hihhhih!hhhhhih!HhHI!IHI!!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str29, "hHhhhih!hhhhhih!hihhhih!hhhhhih!HhHI!IHI!!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3376");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhhhih!hhhih!ihhih!!hhih!ihhih!", (-1), "", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhhih!hhhih!ihhih!!hhih!ihhih!" + "'", str4, "Hhhhhih!hhhih!ihhih!!hhih!ihhih!");
    }

    @Test
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3377");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hhi!!" + "'", str1, "hhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hhi!!");
    }

    @Test
    public void test3378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3378");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IIhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I!hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IIhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IIhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I!hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I!", (int) (byte) 10, "HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!hHhih!hHhih!HHhih!HHhih!HHhih!IHhih!HHhih!!Hhih!HHhih!HHhih!hHhih!hHhih!iHhih!hHhih!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IIhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I!hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IIhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IIhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I!hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I!" + "'", str4, "hhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IIhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I!hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IIhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IIhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I!hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!I!");
    }

    @Test
    public void test3379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3379");
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
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalize("hHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!", charArray15);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalize("hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!!", charArray15);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.capitalize("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!ihi!!!", charArray15);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhih!hhhihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhi!hhi!ihHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!ihi!!!", charArray15);
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "HHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!" + "'", str25, "HHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!!" + "'", str26, "HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!IHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!ihi!!!" + "'", str27, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!ihi!!!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Hhhih!hhhihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!ihi!!!" + "'", str28, "Hhhih!hhhihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhi!hhi!ihhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!ihi!!!");
    }

    @Test
    public void test3380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3380");
        char[] charArray13 = new char[] { '4', '4' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("h", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("Hhi!ihi!!", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("HhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", charArray13);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("HHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!", charArray13);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhi!iHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!", charArray13);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!ihhih!!hHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hih!ihhih!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hhhih!ihhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!!hhih!!", charArray13);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalize("hHHHHIH!HHhhHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hI!" + "'", str15, "hI!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "h" + "'", str16, "h");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hi!" + "'", str17, "Hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!" + "'", str21, "HHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str22, "Hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!ihhih!!hHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hih!ihhih!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hhhih!ihhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!!hhih!!" + "'", str23, "hhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!ihhih!!hHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hih!ihhih!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!hhhih!ihhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!h!!hhih!!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HHHHHIH!HHhhHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!" + "'", str24, "HHHHHIH!HHhhHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!");
    }

    @Test
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3381");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi" + "'", str1, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi");
    }

    @Test
    public void test3382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3382");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!", 10, 100, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhiHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!" + "'", str4, "hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhiHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!");
    }

    @Test
    public void test3383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3383");
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
        java.lang.String str32 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hhi!!", charArray19);
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
    public void test3384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3384");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("", (int) ' ', "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test3385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3385");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihI!hhhi!hhi!ihi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!IHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!HHHI!HHI!IHI!" + "'", str1, "hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!IHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!HHHI!HHI!IHI!");
    }

    @Test
    public void test3386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3386");
        char[] charArray10 = new char[] { '4', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("h", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("Hhi!ihi!!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("hI!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihI!hhhi!hhi!ihi!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hI!" + "'", str12, "hI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "h" + "'", str16, "h");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str17, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
    }

    @Test
    public void test3387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3387");
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
        java.lang.String str30 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!", charArray20);
        java.lang.String str31 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", charArray20);
        java.lang.String str32 = org.apache.commons.lang.WordUtils.capitalize("hHhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIH!IhHIH!!hHIH!!", charArray20);
        java.lang.String str33 = org.apache.commons.lang.WordUtils.initials("Hhhi!hhi!iHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!", charArray20);
        java.lang.String str34 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhih!hhhihhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!", charArray20);
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str30, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str31, "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "HHhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIH!IhHIH!!hHIH!!" + "'", str32, "HHhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIH!IhHIH!!hHIH!!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "H" + "'", str33, "H");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str34, "Hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3388");
        char[] charArray11 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("HI!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("hI!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhh", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhh" + "'", str16, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhh");
    }

    @Test
    public void test3389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3389");
        char[] charArray14 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("hHIH!", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHIHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHHHIH!HHHHIH!", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "h" + "'", str18, "h");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str19, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str20, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!" + "'", str21, "hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
    }

    @Test
    public void test3390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3390");
        char[] charArray9 = new char[] { '4', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hI!" + "'", str12, "hI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhhih!hhhhhih!hihhhih!hhhhhih!h!" + "'", str16, "Hhhhih!hhhhhih!hihhhih!hhhhhih!h!");
    }

    @Test
    public void test3391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3391");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!", (int) 'a', "Hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!" + "'", str4, "Hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!");
    }

    @Test
    public void test3392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3392");
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
        java.lang.String str27 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhih!hhhiHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hHHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!", charArray17);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.capitalize("Hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!", charArray17);
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Hhhih!hhhihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hhi!!" + "'", str27, "Hhhih!hhhihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!" + "'", str28, "Hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!");
    }

    @Test
    public void test3393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3393");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!IHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!!HHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!IHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!!HHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!IHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!IHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!!HHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!IHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!!HHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!!" + "'", str1, "hHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!IHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!!HHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!IHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!!HHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!IHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!IHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!!HHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!IHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!!HHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!!");
    }

    @Test
    public void test3394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3394");
        char[] charArray10 = new char[] { '4', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("h", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("Hhi!ihi!!", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("hI!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!HHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!IHI!!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hI!" + "'", str12, "hI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "h" + "'", str16, "h");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!HHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!IHI!!!" + "'", str18, "hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!HHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!IHI!!!");
    }

    @Test
    public void test3395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3395");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str2, "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
    }

    @Test
    public void test3396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3396");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.capitalize("HHhih!hHhiHhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHhih!hHhiHhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str2, "HHhih!hHhiHhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
    }

    @Test
    public void test3397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3397");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHHHIH!HHHIHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhHI!IHI!!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!hhi!ihhHhhi!hhi!hHHHHIH!HHHHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHIH!", (int) (short) 1, "hhhi!hhi!iHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhHHIH!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHHIH!HHHIHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhHI!IHI!!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!hhi!ihhHhhi!hhi!hHHHHIH!HHHHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHIH!" + "'", str4, "HHHHIH!HHHIHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhHI!IHI!!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!hhi!ihhHhhi!hhi!hHHHHIH!HHHHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHIH!");
    }

    @Test
    public void test3398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3398");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HHi!hHi!iHHHI!IHI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhI!HhI!Ihhhi!ihi!!" + "'", str1, "hhI!HhI!Ihhhi!ihi!!");
    }

    @Test
    public void test3399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3399");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhHH", 100, (int) (short) 1, "hHHIH!HHHIHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHHI!HHI!IHhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!HHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!IHI!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhHH" + "'", str4, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhHH");
    }

    @Test
    public void test3400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3400");
        char[] charArray9 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IhHHI!HHI!Ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!HI!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("Hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IhHHI!HHI!Ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!HI!" + "'", str11, "HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IhHHI!HHI!Ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!HI!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
    }

    @Test
    public void test3401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3401");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHhhhih!hhHHHHIH!HHHhHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHhhhih!hhHHHHIH!HHHhHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!" + "'", str1, "hHhhhih!hhHHHHIH!HHHhHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!");
    }

    @Test
    public void test3402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3402");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhhhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHIHhhih!hhhihhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhhhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHIHhhih!hhhihhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!" + "'", str2, "hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhhhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHIHhhih!hhhihhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!");
    }

    @Test
    public void test3403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3403");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhHhhhhih!hhhhHHHIH!HHHHHIH!HIHHHIhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!H!HHHHHIH!HhHHHIH!HHhhih!hhih!i!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hHhhhhih!hhhhHHHIH!HHHHHIH!HIHHHIhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!H!HHHHHIH!HhHHHIH!HHhhih!hhih!hi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhiHhhhhih!hhhhHHHIH!HHHHHIH!HIHHHIhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!H!HHHHHIH!HhHHHIH!HHhhih!hhih!!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test3404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3404");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str1, "hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test3405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3405");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!", 100, "hHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!" + "'", str4, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!");
    }

    @Test
    public void test3406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3406");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHhHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihhhih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHhHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihhhih!" + "'", str1, "HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHhHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihhhih!");
    }

    @Test
    public void test3407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3407");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str1, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
    }

    @Test
    public void test3408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3408");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHHhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str1, "Hhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test3409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3409");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!HhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHHhHI!IHI!!hhHI!IHI!!ihHI!IHI!!hhHI!IHI!!!", (int) (byte) 100, (int) '#', "HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHHHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihihHHIH!HHHIHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhHhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!HhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIHHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHHHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihihHHIH!HHHIHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhHhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str4, "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!HhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIHHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHHHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihihHHIH!HHHIHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhHhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test3410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3410");
        char[] charArray9 = new char[] { '4', '4' };
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray9);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!HhI!IhI!HhI!!", charArray9);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.initials("hHi!hHi!iHi!hHi!!", charArray9);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("Hhi!hhi!ih", charArray9);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hHi!hHi!iHi!hHi!!", charArray9);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!", charArray9);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhhih!hhhhhih!hhhiHhi!hhi!ihi!hhi!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str11, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "h" + "'", str12, "h");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hhi!hhi!ih" + "'", str13, "hhi!hhi!ih");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HHi!hHi!iHi!hHi!!" + "'", str14, "HHi!hHi!iHi!hHi!!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hhhhhih!hhhhhih!hhhihhi!hhi!ihi!hhi!!" + "'", str16, "Hhhhhih!hhhhhih!hhhihhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test3411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3411");
        char[] charArray17 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray17);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray17);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray17);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray17);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("h", charArray17);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray17);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!", charArray17);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.initials("hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!", charArray17);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhih!hHhih!HHhih!HHhih!HHhih!IHhih!HHhih!!Hhih!HHhih!HHhih!hHhih!hHhih!iHhih!hHhih!!", charArray17);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhi!hhi!ihhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!", charArray17);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!ihi!!!", charArray17);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H" + "'", str23, "H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str24, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "h" + "'", str25, "h");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!" + "'", str26, "Hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhi!hhi!ihhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str27, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhi!hhi!ihhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!ihi!!!" + "'", str28, "Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!ihi!!!");
    }

    @Test
    public void test3412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3412");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhhhhih!hhhhhih!hhhiHhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhih!hhhhhih!hhhiHhi!hhi!ihi!hhi!!" + "'", str1, "Hhhhhih!hhhhhih!hhhiHhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test3413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3413");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!" + "'", str1, "Hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!");
    }

    @Test
    public void test3414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3414");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhiHHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!", (int) (short) 100, (int) (short) 10, "hHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhiHHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!" + "'", str4, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhiHHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!");
    }

    @Test
    public void test3415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3415");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhiHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!", (int) (short) 10, 10, "HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!" + "'", str4, "hhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!");
    }

    @Test
    public void test3416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3416");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhHHIH!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhHHIH!" + "'", str2, "HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhHHIH!");
    }

    @Test
    public void test3417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3417");
        char[] charArray14 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("hHIH!", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("H", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("HhI!HhI!Ih", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!", charArray14);
        java.lang.Class<?> wildcardClass23 = charArray14.getClass();
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "h" + "'", str18, "h");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!" + "'", str20, "hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhhHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hhi!hhi!ih" + "'", str21, "Hhi!hhi!ih");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str22, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3418");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test3419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3419");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHHIH!HHHIhHI!HHI!IHI!HHI!!", (int) (byte) 0, "Hhhhhih!hhhhhhhih!hhhhhih!hihhhihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!h!hhhhhih!hhhhhih!hhhhih!hhih!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHIH!HHHIhHI!HHI!IHI!HHI!!" + "'", str4, "hHHIH!HHHIhHI!HHI!IHI!HHI!!");
    }

    @Test
    public void test3420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3420");
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
        java.lang.String str38 = org.apache.commons.lang.WordUtils.capitalizeFully("hHIH!", charArray22);
        java.lang.Class<?> wildcardClass39 = charArray22.getClass();
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
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Hhih!" + "'", str38, "Hhih!");
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test3421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3421");
        char[] charArray8 = new char[] { '4', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("hHI!HHI!IHI!HHI!!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ih", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHHHIH!HHHHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHIH!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str12, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hhi!hhi!ih" + "'", str13, "Hhi!hhi!ih");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hhhhhih!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!hhih!" + "'", str14, "Hhhhhih!hhhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!hhih!");
    }

    @Test
    public void test3422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3422");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHHI!HHI!IhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhhih!hhhhih!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhhih!hhhhih!I!HHI!IHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test3423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3423");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhhih!hhhhhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!", 100, (int) 'a', "Hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 100, length 59");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3424");
        char[] charArray13 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.initials("HI!", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihi!hhi!!", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihh", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhi!hhi!ihhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!hi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str18, "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihh" + "'", str19, "hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhhih!hhhiHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihh");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhi!hhi!ihhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!hi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str20, "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhi!hhi!ihhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!hi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test3425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3425");
        char[] charArray7 = new char[] { ' ', ' ', '#' };
        java.lang.String str8 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!IHI!!!", charArray7);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!IHI!!Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!", charArray7);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!", charArray7);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.uncapitalize("HHHIH!HHHIhHI!HHI!IHI!HHI!!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { ' ', ' ', '#' });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!ihi!!!" + "'", str8, "Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!ihi!!!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hHHI!IHI!!Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str9, "hHHI!IHI!!Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str10, "Hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hHHIH!HHHIhHI!HHI!IHI!HHI!!" + "'", str11, "hHHIH!HHHIhHI!HHI!IHI!HHI!!");
    }

    @Test
    public void test3426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3426");
        char[] charArray18 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray18);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray18);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray18);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray18);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("h", charArray18);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray18);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray18);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.initials("Hhih!", charArray18);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray18);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i", charArray18);
        java.lang.String str29 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!IhHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!hHHHHIH!HHHHIH!HhHHHHIH!HHHHIH!!", charArray18);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.initials("Hhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhHHhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!ihi!!!hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhh", charArray18);
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "HI!" + "'", str27, "HI!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i" + "'", str28, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!" + "'", str29, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "H" + "'", str30, "H");
    }

    @Test
    public void test3427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3427");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!", (int) 'a', "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hhi!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!" + "'", str4, "Hhhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!");
    }

    @Test
    public void test3428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3428");
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
        java.lang.String str29 = org.apache.commons.lang.WordUtils.uncapitalize("HHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHhHHHIH!HHHHHIH!HIHhhHHHIH!HHhhih!", charArray18);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!", charArray18);
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
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHhHHHIH!HHHHHIH!HIHhhHHHIH!HHhhih!" + "'", str29, "hHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHhHHHIH!HHHHHIH!HIHhhHHHIH!HHhhih!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!" + "'", str30, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!");
    }

    @Test
    public void test3429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3429");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!hhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!hhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihI!" + "'", str1, "HhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!hhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihI!");
    }

    @Test
    public void test3430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3430");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("HhhHHHIH!Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHhhhih!hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!" + "'", str1, "hHHhhhih!hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!");
    }

    @Test
    public void test3431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3431");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHIH!HHHIH!HHHIH!HHHIH!HHHIH!IHHIH!HHHIH!!HHIH!HHHIhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!H!HHHIH!HHHIH!HHHIH!IHHIH!HHHIH!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!h!hhhih!hhhih!hhhih!ihhih!hhhih!!" + "'", str1, "Hhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!h!hhhih!hhhih!hhhih!ihhih!hhhih!!");
    }

    @Test
    public void test3432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3432");
        char[] charArray13 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("hHIH!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("HHi!hHi!iHi!hHi!!", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("hHHHIH!HHHhHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "h" + "'", str17, "h");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!" + "'", str19, "HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "h" + "'", str20, "h");
    }

    @Test
    public void test3433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3433");
        char[] charArray15 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray15);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray15);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("hI!", charArray15);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("hHIH!", charArray15);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", charArray15);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.initials("hHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!", charArray15);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!!", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hi!" + "'", str18, "Hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HI!" + "'", str20, "HI!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HHIH!" + "'", str21, "HHIH!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str22, "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "h" + "'", str23, "h");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!" + "'", str24, "Hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!ihhhhhih!hhhhih!hhhhhhih!hhhhih!!hhhhhih!hhhhih!hhhhhhih!hhhhih!!");
    }

    @Test
    public void test3434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3434");
        char[] charArray14 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("Hi!", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("hHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhHHHIH!Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hi!" + "'", str17, "Hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str18, "Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str19, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!" + "'", str20, "hHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str21, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhHHHIH!Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str22, "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhHHHIH!Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test3435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3435");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("HHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test3436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3436");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!", 0, "hhi!ihi!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!" + "'", str4, "hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!");
    }

    @Test
    public void test3437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3437");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("HHhih!hHhih!HHhih!HHhih!HHhih!IHhih!HHhih!!Hhih!HHhih!HHhih!hHhih!hHhih!iHhih!hHhih!!", (int) ' ', (int) (short) 10, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHhih!hHhih!HHhih!HHhih!HHhih!IHHhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str4, "HHhih!hHhih!HHhih!HHhih!HHhih!IHHhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test3438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3438");
        char[] charArray16 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("HI!", charArray16);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihi!hhi!!", charArray16);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray16);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("hHI!IHI!!", charArray16);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("HHIH!", charArray16);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.initials("hHI!HHI!IHI!HHI!!", charArray16);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalize("hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!", charArray16);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.initials("Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHHHIH!HHHHIH!", charArray16);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!", charArray16);
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "H" + "'", str25, "H");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str26, "Hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test3439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3439");
        char[] charArray5 = new char[] { '4' };
        java.lang.String str6 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhh", charArray5);
        java.lang.String str7 = org.apache.commons.lang.WordUtils.capitalize("hhhhih!hhhhhih!hihhhih!hhhhhih!h!", charArray5);
        java.lang.String str8 = org.apache.commons.lang.WordUtils.initials("hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!", charArray5);
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("hhhih!hhhihhih!hhhi!hhi!ihhih!hi!hhi!!hhhhih!hi!hhi!ihihhih!!hhi!!ihhihhih!!hhi!ihi!hhhih!hi!!!hhi!hhhih!hi!ihi!hhihhih!!!ihhi!hhihhih!!ihi!hhi!!hhih!hhhi!hhi!i", charArray5);
        java.lang.Class<?> wildcardClass10 = charArray5.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4' });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhh" + "'", str6, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhh");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Hhhhih!hhhhhih!hihhhih!hhhhhih!h!" + "'", str7, "Hhhhih!hhhhhih!hihhhih!hhhhhih!h!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "h" + "'", str8, "h");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hhhih!hhhihhih!hhhi!hhi!ihhih!hi!hhi!!hhhhih!hi!hhi!ihihhih!!hhi!!ihhihhih!!hhi!ihi!hhhih!hi!!!hhi!hhhih!hi!ihi!hhihhih!!!ihhi!hhihhih!!ihi!hhi!!hhih!hhhi!hhi!i" + "'", str9, "Hhhih!hhhihhih!hhhi!hhi!ihhih!hi!hhi!!hhhhih!hi!hhi!ihihhih!!hhi!!ihhihhih!!hhi!ihi!hhhih!hi!!!hhi!hhhih!hi!ihi!hhihhih!!!ihhi!hhihhih!!ihi!hhi!!hhih!hhhi!hhi!i");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3440");
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
        java.lang.String str32 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", charArray19);
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str32, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test3441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3441");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str1, "hhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
    }

    @Test
    public void test3442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3442");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHhih!hHhiHhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHhih!hHhiHhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str1, "hHhih!hHhiHhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
    }

    @Test
    public void test3443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3443");
        char[] charArray16 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("HI!", charArray16);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("Hhi!hhi!ihi!hhi!!", charArray16);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray16);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("hHI!IHI!!", charArray16);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("HHIH!", charArray16);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.initials("hHI!HHI!IHI!HHI!!", charArray16);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalize("hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!", charArray16);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.initials("Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHHHIH!HHHHIH!", charArray16);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhi!ihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHhHHHIH!HHHHHIH!HIHhhHHHIH!HHhhih!hhhi!hhi!ihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHhHHHIH!HHHHHIH!HIHhhHHHIH!HHhhih!hi!hhi!!hhhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHhHHHIH!HHHHHIH!HIHhhHHHIH!HHhhih!hi!hhi!ihihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHhHHHIH!HHHHHIH!HIHhhHHHIH!HHhhih!!hhi!", charArray16);
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "H" + "'", str25, "H");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhhhih!hhhhhih!hihhhhhhih!hhhhih!hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhhhih!hhhhhih!hihhhhhhih!hhhhih!hi!hhi!!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhhhih!hhhhhih!hihhhhhhih!hhhhih!hi!hhi!ihihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhhhih!hhhhhih!hihhhhhhih!hhhhih!!hhi!" + "'", str26, "Hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhhhih!hhhhhih!hihhhhhhih!hhhhih!hhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhhhih!hhhhhih!hihhhhhhih!hhhhih!hi!hhi!!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhhhih!hhhhhih!hihhhhhhih!hhhhih!hi!hhi!ihihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhhhih!hhhhhih!hihhhhhhih!hhhhih!!hhi!");
    }

    @Test
    public void test3444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3444");
        char[] charArray23 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray23);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray23);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray23);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray23);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.capitalize("h", charArray23);
        java.lang.String str29 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray23);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray23);
        java.lang.String str31 = org.apache.commons.lang.WordUtils.initials("hI!", charArray23);
        java.lang.String str32 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihi!hhi!!", charArray23);
        java.lang.String str33 = org.apache.commons.lang.WordUtils.capitalize("hHIH!", charArray23);
        java.lang.String str34 = org.apache.commons.lang.WordUtils.uncapitalize("HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!", charArray23);
        java.lang.String str35 = org.apache.commons.lang.WordUtils.uncapitalize("hHI!HHI!IHI!HHI!!", charArray23);
        java.lang.String str36 = org.apache.commons.lang.WordUtils.uncapitalize("hHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!", charArray23);
        java.lang.String str37 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHHIH!HHHHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHIH!", charArray23);
        java.lang.String str38 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!", charArray23);
        java.lang.String str39 = org.apache.commons.lang.WordUtils.capitalizeFully("hHIH!", charArray23);
        java.lang.String str40 = org.apache.commons.lang.WordUtils.capitalize("hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhihhi!hhi!ih", charArray23);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "H" + "'", str28, "H");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Hhih!" + "'", str29, "Hhih!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Hi!" + "'", str30, "Hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "h" + "'", str31, "h");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str32, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "HHIH!" + "'", str33, "HHIH!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!" + "'", str34, "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hHI!HHI!IHI!HHI!!" + "'", str35, "hHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!" + "'", str36, "hHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hHHHHIH!HHHHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHIH!" + "'", str37, "hHHHHIH!HHHHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!HHIH!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str38, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Hhih!" + "'", str39, "Hhih!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhihhi!hhi!ih" + "'", str40, "Hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhihhi!hhi!ih");
    }

    @Test
    public void test3445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3445");
        char[] charArray20 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray20);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray20);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray20);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray20);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalize("h", charArray20);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray20);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.capitalizeFully("hHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!", charArray20);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.uncapitalize("HHI!HHI!IHI!HHI!!", charArray20);
        java.lang.String str29 = org.apache.commons.lang.WordUtils.initials("hHIH!", charArray20);
        java.lang.String str30 = org.apache.commons.lang.WordUtils.initials("", charArray20);
        java.lang.String str31 = org.apache.commons.lang.WordUtils.uncapitalize("hhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIH!IhHIH!!hHIH!!", charArray20);
        java.lang.String str32 = org.apache.commons.lang.WordUtils.initials("Hhih!", charArray20);
        java.lang.String str33 = org.apache.commons.lang.WordUtils.capitalize("hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihI!hhhi!hhi!ihi!", charArray20);
        java.lang.String str34 = org.apache.commons.lang.WordUtils.initials("hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHIHhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I", charArray20);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "H" + "'", str25, "H");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H" + "'", str26, "H");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str27, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hHI!HHI!IHI!HHI!!" + "'", str28, "hHI!HHI!IHI!HHI!!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "h" + "'", str29, "h");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIH!IhHIH!!hHIH!!" + "'", str31, "hhHIH!HhHIH!IhHIH!!hHIH!IhHIH!HhHIH!IhHIH!!hHIH!!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "H" + "'", str32, "H");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihI!hhhi!hhi!ihi!" + "'", str33, "Hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihI!hhhi!hhi!ihi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "h" + "'", str34, "h");
    }

    @Test
    public void test3446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3446");
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
        java.lang.String str30 = org.apache.commons.lang.WordUtils.capitalizeFully("HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!", charArray19);
        java.lang.String str31 = org.apache.commons.lang.WordUtils.initials("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!!", charArray19);
        java.lang.String str32 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhhih!hhhhhih!hhhiHhi!hhi!ihi!hhi!!", charArray19);
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhihhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!" + "'", str30, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhihhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "h" + "'", str31, "h");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Hhhhhih!hhhhhih!hhhihhi!hhi!ihi!hhi!!" + "'", str32, "Hhhhhih!hhhhhih!hhhihhi!hhi!ihi!hhi!!");
    }

    @Test
    public void test3447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3447");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!" + "'", str1, "HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!");
    }

    @Test
    public void test3448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3448");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("hHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!" + "'", str1, "hHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!");
    }

    @Test
    public void test3449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3449");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHHHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihihHHIH!HHHIHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhHhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHHHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihihHHIH!HHHIHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhHhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str2, "HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHHHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihihHHIH!HHHIHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhHhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test3450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3450");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str1, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
    }

    @Test
    public void test3451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3451");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!", (int) (short) 100, "HHHIH!HHHIhhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHH", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!" + "'", str4, "hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!");
    }

    @Test
    public void test3452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3452");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!", (int) (short) 1, (int) '4', "HHHIH!HHHIHhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHIHhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!HHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!" + "'", str4, "hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!");
    }

    @Test
    public void test3453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3453");
        char[] charArray11 = new char[] { '4', '4' };
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray11);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray11);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("h", charArray11);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray11);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("Hhi!ihi!!", charArray11);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("hI!", charArray11);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalize("", charArray11);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("HHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I", charArray11);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHHhHI!IHI!!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!", charArray11);
        java.lang.Class<?> wildcardClass21 = charArray11.getClass();
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hI!" + "'", str13, "hI!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "h" + "'", str14, "h");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!" + "'", str15, "Hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "h" + "'", str17, "h");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I" + "'", str19, "hHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!I");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "h" + "'", str20, "h");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3454");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihhhi!hhi!ihi!hhi!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhhhhih!hhhhih!hhhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!ihHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!hhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHIHHHI!HHI!IHI!HHI!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str1, "hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHIHHHI!HHI!IHI!HHI!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
    }

    @Test
    public void test3455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3455");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!" + "'", str2, "hHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!");
    }

    @Test
    public void test3456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3456");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhi!iHHHIH!HHHIHhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHIHhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!HHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!hhi!ihhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhihhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!hhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str1, "Hhhi!hhi!ihhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhihhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!hhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test3457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3457");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i" + "'", str2, "hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i");
    }

    @Test
    public void test3458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3458");
        char[] charArray13 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("HHIH!", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.uncapitalize("h", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("HHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.initials("hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhHHIH!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hhih!" + "'", str15, "Hhih!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "h" + "'", str16, "h");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str17, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "h" + "'", str20, "h");
    }

    @Test
    public void test3459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3459");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHHHIH!", 1, "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHHHIH!" + "'", str4, "hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHHHIH!");
    }

    @Test
    public void test3460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3460");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!hHhhhhih!hhhhih!iHhhhhih!hhhhih!hHhhhhih!hhhhih!!Hhhhhih!hhhhih!hHhhhhih!hhhhih!!", (int) (byte) 1, (int) (short) 0, "HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IhHHI!HHI!Ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!HI!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IhHHI!HHI!Ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!HI!" + "'", str4, "hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IhHHI!HHI!Ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!HI!");
    }

    @Test
    public void test3461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3461");
        char[] charArray10 = new char[] { '4', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalize("hHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("hHhih!hHhih!iHhih!!Hhih!iHhih!hHhihhhhi!hhi!iHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("", charArray10);
        java.lang.Class<?> wildcardClass19 = charArray10.getClass();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hI!" + "'", str13, "hI!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!" + "'", str16, "HHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "h" + "'", str17, "h");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3462");
        char[] charArray15 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray15);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("h", charArray15);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.initials("Hi!", charArray15);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("hhI!HhI!IhI!HhI!!", charArray15);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray15);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.initials("Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!HHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H" + "'", str21, "H");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "h" + "'", str22, "h");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hi!" + "'", str23, "Hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H" + "'", str24, "H");
    }

    @Test
    public void test3463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3463");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("HHHI!IHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHI!IHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!" + "'", str1, "HHHI!IHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!");
    }

    @Test
    public void test3464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3464");
        char[] charArray12 = new char[] { '4', '4' };
        java.lang.String str13 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray12);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray12);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray12);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray12);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray12);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray12);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalize("hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!", charArray12);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("hhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!IHI!!!", charArray12);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhi!hhi!ihi!hhi!!", charArray12);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!" + "'", str13, "Hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hI!" + "'", str15, "hI!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hi!" + "'", str16, "Hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!" + "'", str19, "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!IHI!!!" + "'", str20, "HhHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!IHI!!!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str21, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "h" + "'", str22, "h");
    }

    @Test
    public void test3465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3465");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("hHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!", 0, "hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!" + "'", str4, "hHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!iHHIH!HHHIH!iHHIH!!HHIH!hHHIH!HHHIH!iHHIH!!HHIH!!");
    }

    @Test
    public void test3466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3466");
        char[] charArray10 = new char[] { '4', '4' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.uncapitalize("", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("HI!", charArray10);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray10);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("hHHI!IHI!!Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!", charArray10);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalize("hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!", charArray10);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!HhHIH!HhHIH!hhHIH!hhHIH!hhHIH!ihHIH!hhHIH!!hHIH!hhHIH!hhHIH!HhHIH!HhHIH!IhHIH!HhHIH!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hI!" + "'", str13, "hI!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "h" + "'", str16, "h");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!" + "'", str17, "HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!HhHIH!HhHIH!hhHIH!hhHIH!hhHIH!ihHIH!hhHIH!!hHIH!hhHIH!hhHIH!HhHIH!HhHIH!IhHIH!HhHIH!!" + "'", str18, "hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!HhHIH!HhHIH!hhHIH!hhHIH!hhHIH!ihHIH!hhHIH!!hHIH!hhHIH!hhHIH!HhHIH!HhHIH!IhHIH!HhHIH!!");
    }

    @Test
    public void test3467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3467");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihI!", 100, "", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihI!" + "'", str4, "HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihI!");
    }

    @Test
    public void test3468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3468");
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
        java.lang.String str32 = org.apache.commons.lang.WordUtils.capitalize("hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i", charArray20);
        java.lang.String str33 = org.apache.commons.lang.WordUtils.capitalize("hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!", charArray20);
        java.lang.String str34 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhihhi!hhi!ih", charArray20);
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i" + "'", str32, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!i");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!" + "'", str33, "HHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhihhi!hhi!ih" + "'", str34, "Hhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhihhi!hhi!ih");
    }

    @Test
    public void test3469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3469");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihihhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihihhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str2, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihihhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test3470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3470");
        char[] charArray14 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray14);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("HI!", charArray14);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("hHI!IHI!!", charArray14);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!", charArray14);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHhhih!", charArray14);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("hHhhhih!hhhhhih!hihhhih!hhhhhih!HhHI!IHI!!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!", charArray14);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("hhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!", charArray14);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.initials("hhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "h" + "'", str17, "h");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str18, "hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HHhhhih!hhhhhih!hihhhih!hhhhhih!HhHI!IHI!!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str20, "HHhhhih!hhhhhih!hihhhih!hhhhhih!HhHI!IHI!!Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str21, "HhHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "h" + "'", str22, "h");
    }

    @Test
    public void test3471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3471");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHhi!HHIH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihhi!hhih!" + "'", str1, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihhi!hhih!");
    }

    @Test
    public void test3472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3472");
        char[] charArray8 = new char[] { '4', '4' };
        java.lang.String str9 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray8);
        java.lang.String str10 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray8);
        java.lang.String str11 = org.apache.commons.lang.WordUtils.initials("h", charArray8);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray8);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("Hhi!ihi!!", charArray8);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hhHhhhih!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hI!" + "'", str10, "hI!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HhHhhhih!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!" + "'", str14, "HhHhhhih!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!");
    }

    @Test
    public void test3473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3473");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!", (int) (short) 0, "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihI!hhhi!hhi!ihi!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!" + "'", str4, "HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhih!hhhhih!");
    }

    @Test
    public void test3474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3474");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHHHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihihHHIH!HHHIHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhHhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihihhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str1, "Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihihhhih!hhhihhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test3475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3475");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("hhhhhih!hhhhHHHIH!HHHHHIH!HIHHHIhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!H!HHHHHIH!HhHHHIH!HHhhih!hhih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test3476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3476");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHHhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHHhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!" + "'", str2, "HhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHHhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!");
    }

    @Test
    public void test3477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3477");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("HHhi!ihi!!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHHHIH!HHHHIH!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHhi!ihi!!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHHHIH!HHHHIH!" + "'", str2, "HHhi!ihi!!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHHHIH!HHHHIH!");
    }

    @Test
    public void test3478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3478");
        char[] charArray13 = new char[] { '4', '4' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalize("hi!", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.initials("h", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.initials("Hhi!ihi!!", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("hI!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("", charArray13);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!", charArray13);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhih!hhhiHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hHHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!", charArray13);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.initials("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhhhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!", charArray13);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalize("hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHHHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!IHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!!HHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!IHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!!HHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!IHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!IHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!!HHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!IHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!!HHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '4', '4' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hI!" + "'", str15, "hI!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "h" + "'", str16, "h");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Hi!" + "'", str17, "Hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "h" + "'", str19, "h");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!" + "'", str21, "hHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hhhih!hhhiHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hHHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!" + "'", str22, "hhhih!hhhiHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hHHi!hHi!iHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hHi!!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H" + "'", str23, "H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHHHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!IHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!!HHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!IHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!!HHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!IHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!IHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!!HHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!IHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!!HHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!!" + "'", str24, "HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHHHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!IHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!!HHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!IHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!!HHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!IHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!IHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!!HHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!IHHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!!HHHHHIH!HHHHIH!HHHHHHIH!HHHHIH!!");
    }

    @Test
    public void test3479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3479");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("Hhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!HHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!" + "'", str1, "hHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!HHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!!");
    }

    @Test
    public void test3480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3480");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("", (int) (byte) 0, "hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test3481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3481");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.uncapitalize("HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!HHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhi!hhiHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!HHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhi!hhiHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!!ihi!hhi!!" + "'", str1, "hHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!HHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhi!hhiHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!!ihi!hhi!!");
    }

    @Test
    public void test3482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3482");
        char[] charArray15 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray15);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalize("h", charArray15);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray15);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalizeFully("hi!", charArray15);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.initials("Hhih!", charArray15);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("HHI!HHI!IHI!HHI!!", charArray15);
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str24, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3483");
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
        java.lang.String str31 = org.apache.commons.lang.WordUtils.initials("Hhhhih!hhhhhih!hihhhih!hhhhhih!h!", charArray19);
        java.lang.String str32 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!", charArray19);
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "H" + "'", str31, "H");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!" + "'", str32, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test3484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3484");
        char[] charArray1 = null;
        java.lang.String str2 = org.apache.commons.lang.WordUtils.initials("Hhhhhhih!hhhhhih!hhhhhih!hihhhihhHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHHhh", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
    }

    @Test
    public void test3485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3485");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.wrap("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!", 1, "", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!" + "'", str4, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!");
    }

    @Test
    public void test3486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3486");
        char[] charArray10 = new char[] { '#', '4', '4', '4', '4', '#' };
        java.lang.String str11 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihi!hhi!!", charArray10);
        java.lang.String str12 = org.apache.commons.lang.WordUtils.capitalizeFully("HHHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!IHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!HHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!H!!", charArray10);
        java.lang.String str13 = org.apache.commons.lang.WordUtils.initials("HhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHHIH!HHhhih!", charArray10);
        java.lang.String str14 = org.apache.commons.lang.WordUtils.initials("hHHIH!HHHIHHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!IHhhhih!hhhhhih!hihhhih!hhhhhih!h!HHhhhih!hhhhhih!hihhhih!hhhhhih!h!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '#', '4', '4', '4', '4', '#' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hhi!hhi!ihi!hhi!!" + "'", str11, "Hhi!hhi!ihi!hhi!!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!" + "'", str12, "Hhhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "h" + "'", str14, "h");
    }

    @Test
    public void test3487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3487");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("", (int) ' ', (int) ' ', "HHhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhhhhih!hhhhhih!hihhhhhhih!hhhhih!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test3488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3488");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("Hhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!", (int) (byte) 1, (int) (byte) 1, "hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!" + "'", str4, "HhhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHIhHhhhih!hhhhhih!hihhhih!hhhhhih!hHhhhih!hhHHIH!");
    }

    @Test
    public void test3489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3489");
        char[] charArray15 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray15);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray15);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray15);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray15);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray15);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!", charArray15);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.uncapitalize("hHIH!", charArray15);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!", charArray15);
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!" + "'", str24, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhhih!");
    }

    @Test
    public void test3490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3490");
        char[] charArray13 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str14 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str15 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str16 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray13);
        java.lang.String str17 = org.apache.commons.lang.WordUtils.initials("hHIH!", charArray13);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.uncapitalize("Hhhhhih!hhhhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHHIH!HHhhih!hhih!", charArray13);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.initials("HhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!", charArray13);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.uncapitalize("hHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "h" + "'", str17, "h");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhhhhih!hhhhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHHIH!HHhhih!hhih!" + "'", str18, "hhhhhih!hhhhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHHIH!HHhhih!hhih!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!" + "'", str20, "hHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!");
    }

    @Test
    public void test3491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3491");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hHHI!IHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHHI!HHI!IHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhi!hhi!ihi!" + "'", str1, "Hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhhi!hhi!ihi!");
    }

    @Test
    public void test3492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3492");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!ihi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test3493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3493");
        char[] charArray17 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray17);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray17);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray17);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.uncapitalize("hi!", charArray17);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.capitalize("h", charArray17);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.capitalize("hhih!", charArray17);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.initials("HHhi!ihi!!HHhi!ihi!!IHhi!ihi!!HHhi!ihi!!!", charArray17);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.initials("hhi!ihi!!", charArray17);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.uncapitalize("hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!IHI!!!", charArray17);
        java.lang.String str27 = org.apache.commons.lang.WordUtils.capitalize("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi", charArray17);
        java.lang.String str28 = org.apache.commons.lang.WordUtils.initials("hHhhhih!hhhhI!HhI!IhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHIhhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhiHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!h!hhhih!hhhih!hhhih!ihhih!hhhih!!!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHhhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhiHHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!IHI!!!h!hhhih!hhhih!hhhih!ihhih!hhhih!!I!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!I!HhI!!", charArray17);
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!IHI!!!" + "'", str26, "hHHI!IHI!!HHHI!IHI!!IHHI!IHI!!HHHI!hhhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!Ihhih!hhhih!Ihhih!!hhih!Hhhih!hhhih!Ihhih!!hhih!!IHI!!!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi" + "'", str27, "Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "h" + "'", str28, "h");
    }

    @Test
    public void test3494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3494");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.capitalize("Hhi!hhi!ihHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHHIH!HHhhih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhi!hhi!ihHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHHIH!HHhhih!" + "'", str1, "Hhi!hhi!ihHhHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HhHHHIH!HHhhih!");
    }

    @Test
    public void test3495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3495");
        char[] charArray16 = new char[] { '4', '4', '#', ' ', '4', '#' };
        java.lang.String str17 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str18 = org.apache.commons.lang.WordUtils.capitalizeFully("", charArray16);
        java.lang.String str19 = org.apache.commons.lang.WordUtils.capitalizeFully("Hi!", charArray16);
        java.lang.String str20 = org.apache.commons.lang.WordUtils.capitalizeFully("h", charArray16);
        java.lang.String str21 = org.apache.commons.lang.WordUtils.capitalizeFully("H", charArray16);
        java.lang.String str22 = org.apache.commons.lang.WordUtils.uncapitalize("HI!", charArray16);
        java.lang.String str23 = org.apache.commons.lang.WordUtils.initials("HHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!", charArray16);
        java.lang.String str24 = org.apache.commons.lang.WordUtils.capitalizeFully("HHhi!ihi!!hHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!", charArray16);
        java.lang.String str25 = org.apache.commons.lang.WordUtils.capitalize("HHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!", charArray16);
        java.lang.String str26 = org.apache.commons.lang.WordUtils.capitalizeFully("hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!i!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!", charArray16);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '4', '4', '#', ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Hi!" + "'", str19, "Hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H" + "'", str21, "H");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hI!" + "'", str22, "hI!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H" + "'", str23, "H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str24, "Hhhi!ihi!!hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "HHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!" + "'", str25, "HHhih!hHhih!iHhih!!Hhih!iHhih!hHhih!iHhih!!Hhih!!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!i!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!" + "'", str26, "Hhhhhih!hhhhhih!hihhhih!hhhhhih!h!hhhhhih!hhhhhih!hihhhih!hhhhhih!h!ihhhhih!hhhhhih!hihhhih!hhhhhhhhhhhi!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!i!ihi!!hhhi!ihi!!ihhi!ihi!!hhhi!ihi!!!");
    }

    @Test
    public void test3496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3496");
        java.lang.String str2 = org.apache.commons.lang.WordUtils.wrap("Hhhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!" + "'", str2, "Hhhhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!hhih!hhhih!hhhih!hhhih!hhhih!ihhih!hhhih!!");
    }

    @Test
    public void test3497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3497");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.swapCase("hhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHI!IHhhi!hhi!iHhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!HI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihHHI!HHI!IhHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhHhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!hi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!" + "'", str1, "HHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhi!ihHHI!HHI!IhHHHHIH!HHHHHIH!HIHHHIH!HHHHHIH!HHHhHhi!hhi!ihi!hhi!!hHhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!iHhi!hhi!ihi!hhi!!hHhi!hhHhhHhhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!ihhih!hhhih!ihhih!!hhih!hhhih!hhhih!ihhih!!hhih!!hi!hhi!!iHhi!hhi!ihi!hhi!!!Hhi!hhi!ihi!hhi!!!");
    }

    @Test
    public void test3498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3498");
        java.lang.String str4 = org.apache.commons.lang.WordUtils.abbreviate("hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!!", (int) (short) -1, (int) '#', "hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHIhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!" + "'", str4, "hHHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHIhhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHhHhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhihHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!!HHI!HHI!IHI!HHI!!IHHI!HHI!IHI!HHI!!HHHI!HHI!IHI!");
    }

    @Test
    public void test3499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3499");
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
        java.lang.String str33 = org.apache.commons.lang.WordUtils.initials("Hhhhhih!hhhhhih!hihhhih!hhhhhih!hhhHhHI!HHI!IHI!HHI!!HhHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!!hHI!HHI!IHI!HHI!!IhHI!HHI!IHI!HHI!!HhHI!HHhHHhHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!IHHIH!HHHIH!IHHIH!!HHIH!HHHIH!HHHIH!IHHIH!!HHIH!!", charArray20);
        java.lang.String str34 = org.apache.commons.lang.WordUtils.capitalize("hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!", charArray20);
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!" + "'", str34, "Hhhih!hhhih!ihhih!!hhih!ihhih!hhhihhhhi!hhi!ihhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!");
    }

    @Test
    public void test3500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3500");
        java.lang.String str1 = org.apache.commons.lang.WordUtils.initials("Hhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhihhi!hhi!ihhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhhhhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!hhhi!hhi!ihi!hhi!!ihhi!hhi!ihi!hhi!!!hhi!hhi!ihi!hhi!!!i!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }
}

