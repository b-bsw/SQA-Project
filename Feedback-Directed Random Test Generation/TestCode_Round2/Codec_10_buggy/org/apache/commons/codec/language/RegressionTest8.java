package org.apache.commons.codec.language;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest8 {

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
    public void test4001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4001");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "hi!");
        java.lang.String str5 = caverphone0.caverphone("hi!");
        boolean boolean8 = caverphone0.isCaverphoneEqual("", "AA11111111");
        java.lang.String str10 = caverphone0.encode("1111111111");
        java.lang.String str12 = caverphone0.caverphone("1111111111");
        java.lang.String str14 = caverphone0.encode("hi!");
        boolean boolean17 = caverphone0.isCaverphoneEqual("AA11111111", "hi!");
        org.apache.commons.codec.language.Caverphone caverphone18 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean21 = caverphone18.isCaverphoneEqual("", "hi!");
        java.lang.String str23 = caverphone18.caverphone("hi!");
        java.lang.String str25 = caverphone18.caverphone("");
        org.apache.commons.codec.language.Caverphone caverphone26 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean29 = caverphone26.isCaverphoneEqual("", "hi!");
        java.lang.String str31 = caverphone26.caverphone("hi!");
        java.lang.String str33 = caverphone26.caverphone("AA11111111");
        java.lang.String str35 = caverphone26.encode("hi!");
        org.apache.commons.codec.language.Caverphone caverphone36 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str38 = caverphone36.encode("");
        java.lang.Object obj39 = caverphone26.encode((java.lang.Object) "");
        java.lang.Object obj40 = caverphone18.encode((java.lang.Object) "");
        java.lang.String str42 = caverphone18.encode("");
        java.lang.String str44 = caverphone18.encode("hi!");
        boolean boolean47 = caverphone18.isCaverphoneEqual("hi!", "1111111111");
        java.lang.String str49 = caverphone18.caverphone("");
        java.lang.String str51 = caverphone18.encode("1111111111");
        org.apache.commons.codec.language.Caverphone caverphone52 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean55 = caverphone52.isCaverphoneEqual("", "hi!");
        java.lang.String str57 = caverphone52.caverphone("hi!");
        java.lang.String str59 = caverphone52.caverphone("AA11111111");
        java.lang.String str61 = caverphone52.encode("hi!");
        org.apache.commons.codec.language.Caverphone caverphone62 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str64 = caverphone62.encode("");
        java.lang.Object obj65 = caverphone52.encode((java.lang.Object) "");
        java.lang.String str67 = caverphone52.encode("");
        boolean boolean70 = caverphone52.isCaverphoneEqual("AA11111111", "1111111111");
        java.lang.String str72 = caverphone52.encode("");
        java.lang.String str74 = caverphone52.encode("AA11111111");
        boolean boolean77 = caverphone52.isCaverphoneEqual("1111111111", "");
        java.lang.String str79 = caverphone52.caverphone("");
        java.lang.Object obj80 = caverphone18.encode((java.lang.Object) "");
        java.lang.String str82 = caverphone18.caverphone("");
        boolean boolean85 = caverphone18.isCaverphoneEqual("AA11111111", "1111111111");
        java.lang.String str87 = caverphone18.encode("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj88 = caverphone0.encode((java.lang.Object) caverphone18);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1111111111" + "'", str10, "1111111111");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1111111111" + "'", str12, "1111111111");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "AA11111111" + "'", str14, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "AA11111111" + "'", str23, "AA11111111");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1111111111" + "'", str25, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "AA11111111" + "'", str31, "AA11111111");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "AA11111111" + "'", str33, "AA11111111");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "AA11111111" + "'", str35, "AA11111111");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "1111111111" + "'", str38, "1111111111");
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + "1111111111" + "'", obj39, "1111111111");
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + "1111111111" + "'", obj40, "1111111111");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "1111111111" + "'", str42, "1111111111");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "AA11111111" + "'", str44, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "1111111111" + "'", str49, "1111111111");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "1111111111" + "'", str51, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "AA11111111" + "'", str57, "AA11111111");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "AA11111111" + "'", str59, "AA11111111");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "AA11111111" + "'", str61, "AA11111111");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "1111111111" + "'", str64, "1111111111");
        org.junit.Assert.assertEquals("'" + obj65 + "' != '" + "1111111111" + "'", obj65, "1111111111");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "1111111111" + "'", str67, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "1111111111" + "'", str72, "1111111111");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "AA11111111" + "'", str74, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "1111111111" + "'", str79, "1111111111");
        org.junit.Assert.assertEquals("'" + obj80 + "' != '" + "1111111111" + "'", obj80, "1111111111");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "1111111111" + "'", str82, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "AA11111111" + "'", str87, "AA11111111");
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "hi!");
        java.lang.String str5 = caverphone0.caverphone("hi!");
        boolean boolean8 = caverphone0.isCaverphoneEqual("", "AA11111111");
        boolean boolean11 = caverphone0.isCaverphoneEqual("1111111111", "1111111111");
        boolean boolean14 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str16 = caverphone0.caverphone("1111111111");
        java.lang.String str18 = caverphone0.encode("AA11111111");
        boolean boolean21 = caverphone0.isCaverphoneEqual("hi!", "1111111111");
        java.lang.String str23 = caverphone0.encode("");
        boolean boolean26 = caverphone0.isCaverphoneEqual("1111111111", "");
        java.lang.String str28 = caverphone0.caverphone("");
        boolean boolean31 = caverphone0.isCaverphoneEqual("hi!", "");
        boolean boolean34 = caverphone0.isCaverphoneEqual("", "hi!");
        java.lang.String str36 = caverphone0.caverphone("AA11111111");
        java.lang.Class<?> wildcardClass37 = caverphone0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1111111111" + "'", str16, "1111111111");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "AA11111111" + "'", str18, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1111111111" + "'", str23, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "1111111111" + "'", str28, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "AA11111111" + "'", str36, "AA11111111");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "hi!");
        java.lang.String str5 = caverphone0.caverphone("hi!");
        java.lang.String str7 = caverphone0.caverphone("AA11111111");
        java.lang.String str9 = caverphone0.caverphone("");
        org.apache.commons.codec.language.Caverphone caverphone10 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean13 = caverphone10.isCaverphoneEqual("", "hi!");
        java.lang.String str15 = caverphone10.caverphone("hi!");
        boolean boolean18 = caverphone10.isCaverphoneEqual("", "AA11111111");
        boolean boolean21 = caverphone10.isCaverphoneEqual("1111111111", "1111111111");
        boolean boolean24 = caverphone10.isCaverphoneEqual("AA11111111", "");
        java.lang.String str26 = caverphone10.caverphone("1111111111");
        java.lang.String str28 = caverphone10.caverphone("AA11111111");
        java.lang.Object obj29 = caverphone0.encode((java.lang.Object) str28);
        org.apache.commons.codec.language.Caverphone caverphone30 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str32 = caverphone30.encode("");
        java.lang.String str34 = caverphone30.encode("hi!");
        java.lang.String str36 = caverphone30.caverphone("");
        java.lang.Object obj38 = caverphone30.encode((java.lang.Object) "");
        java.lang.String str40 = caverphone30.encode("");
        java.lang.String str42 = caverphone30.encode("1111111111");
        java.lang.String str44 = caverphone30.encode("1111111111");
        boolean boolean47 = caverphone30.isCaverphoneEqual("1111111111", "");
        java.lang.Object obj48 = caverphone0.encode((java.lang.Object) "");
        java.lang.String str50 = caverphone0.encode("");
        java.lang.String str52 = caverphone0.encode("AA11111111");
        org.apache.commons.codec.language.Caverphone caverphone53 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean56 = caverphone53.isCaverphoneEqual("", "hi!");
        java.lang.String str58 = caverphone53.caverphone("hi!");
        boolean boolean61 = caverphone53.isCaverphoneEqual("", "AA11111111");
        boolean boolean64 = caverphone53.isCaverphoneEqual("1111111111", "1111111111");
        boolean boolean67 = caverphone53.isCaverphoneEqual("AA11111111", "");
        java.lang.String str69 = caverphone53.caverphone("1111111111");
        java.lang.String str71 = caverphone53.encode("AA11111111");
        boolean boolean74 = caverphone53.isCaverphoneEqual("hi!", "AA11111111");
        java.lang.String str76 = caverphone53.encode("1111111111");
        boolean boolean79 = caverphone53.isCaverphoneEqual("", "");
        java.lang.String str81 = caverphone53.caverphone("");
        java.lang.Class<?> wildcardClass82 = caverphone53.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj83 = caverphone0.encode((java.lang.Object) wildcardClass82);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1111111111" + "'", str9, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AA11111111" + "'", str15, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "1111111111" + "'", str26, "1111111111");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "AA11111111" + "'", str28, "AA11111111");
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + "AA11111111" + "'", obj29, "AA11111111");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "1111111111" + "'", str32, "1111111111");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "AA11111111" + "'", str34, "AA11111111");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "1111111111" + "'", str36, "1111111111");
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + "1111111111" + "'", obj38, "1111111111");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "1111111111" + "'", str40, "1111111111");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "1111111111" + "'", str42, "1111111111");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "1111111111" + "'", str44, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + "1111111111" + "'", obj48, "1111111111");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "1111111111" + "'", str50, "1111111111");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "AA11111111" + "'", str52, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "AA11111111" + "'", str58, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "1111111111" + "'", str69, "1111111111");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "AA11111111" + "'", str71, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "1111111111" + "'", str76, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "1111111111" + "'", str81, "1111111111");
        org.junit.Assert.assertNotNull(wildcardClass82);
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "hi!");
        java.lang.String str5 = caverphone0.caverphone("hi!");
        java.lang.String str7 = caverphone0.caverphone("AA11111111");
        java.lang.String str9 = caverphone0.encode("hi!");
        org.apache.commons.codec.language.Caverphone caverphone10 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str12 = caverphone10.encode("");
        java.lang.Object obj13 = caverphone0.encode((java.lang.Object) "");
        java.lang.String str15 = caverphone0.encode("1111111111");
        boolean boolean18 = caverphone0.isCaverphoneEqual("hi!", "1111111111");
        boolean boolean21 = caverphone0.isCaverphoneEqual("AA11111111", "hi!");
        boolean boolean24 = caverphone0.isCaverphoneEqual("", "AA11111111");
        java.lang.String str26 = caverphone0.caverphone("1111111111");
        java.lang.String str28 = caverphone0.encode("1111111111");
        org.apache.commons.codec.language.Caverphone caverphone29 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean32 = caverphone29.isCaverphoneEqual("", "hi!");
        org.apache.commons.codec.language.Caverphone caverphone33 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean36 = caverphone33.isCaverphoneEqual("AA11111111", "AA11111111");
        boolean boolean39 = caverphone33.isCaverphoneEqual("", "");
        java.lang.String str41 = caverphone33.encode("hi!");
        java.lang.Object obj42 = caverphone29.encode((java.lang.Object) str41);
        java.lang.String str44 = caverphone29.caverphone("1111111111");
        java.lang.String str46 = caverphone29.encode("1111111111");
        java.lang.Object obj47 = caverphone0.encode((java.lang.Object) str46);
        boolean boolean50 = caverphone0.isCaverphoneEqual("hi!", "1111111111");
        java.lang.String str52 = caverphone0.caverphone("");
        java.lang.String str54 = caverphone0.caverphone("");
        java.lang.Object obj56 = caverphone0.encode((java.lang.Object) "1111111111");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AA11111111" + "'", str9, "AA11111111");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1111111111" + "'", str12, "1111111111");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "1111111111" + "'", obj13, "1111111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1111111111" + "'", str15, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "1111111111" + "'", str26, "1111111111");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "1111111111" + "'", str28, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "AA11111111" + "'", str41, "AA11111111");
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + "AA11111111" + "'", obj42, "AA11111111");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "1111111111" + "'", str44, "1111111111");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "1111111111" + "'", str46, "1111111111");
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + "1111111111" + "'", obj47, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "1111111111" + "'", str52, "1111111111");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "1111111111" + "'", str54, "1111111111");
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + "1111111111" + "'", obj56, "1111111111");
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "hi!");
        java.lang.String str5 = caverphone0.caverphone("hi!");
        java.lang.String str7 = caverphone0.caverphone("AA11111111");
        java.lang.String str9 = caverphone0.caverphone("");
        boolean boolean12 = caverphone0.isCaverphoneEqual("hi!", "hi!");
        java.lang.String str14 = caverphone0.caverphone("hi!");
        boolean boolean17 = caverphone0.isCaverphoneEqual("AA11111111", "hi!");
        java.lang.String str19 = caverphone0.encode("1111111111");
        org.apache.commons.codec.language.Caverphone caverphone20 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean23 = caverphone20.isCaverphoneEqual("", "hi!");
        java.lang.String str25 = caverphone20.caverphone("hi!");
        java.lang.String str27 = caverphone20.caverphone("AA11111111");
        java.lang.String str29 = caverphone20.encode("AA11111111");
        boolean boolean32 = caverphone20.isCaverphoneEqual("", "1111111111");
        java.lang.String str34 = caverphone20.caverphone("hi!");
        boolean boolean37 = caverphone20.isCaverphoneEqual("", "AA11111111");
        org.apache.commons.codec.language.Caverphone caverphone38 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean41 = caverphone38.isCaverphoneEqual("", "hi!");
        java.lang.String str43 = caverphone38.caverphone("hi!");
        boolean boolean46 = caverphone38.isCaverphoneEqual("", "AA11111111");
        boolean boolean49 = caverphone38.isCaverphoneEqual("1111111111", "1111111111");
        boolean boolean52 = caverphone38.isCaverphoneEqual("AA11111111", "");
        java.lang.String str54 = caverphone38.encode("");
        boolean boolean57 = caverphone38.isCaverphoneEqual("", "hi!");
        java.lang.String str59 = caverphone38.caverphone("AA11111111");
        boolean boolean62 = caverphone38.isCaverphoneEqual("AA11111111", "");
        java.lang.Object obj63 = caverphone20.encode((java.lang.Object) "");
        java.lang.String str65 = caverphone20.encode("1111111111");
        boolean boolean68 = caverphone20.isCaverphoneEqual("", "AA11111111");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj69 = caverphone0.encode((java.lang.Object) boolean68);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1111111111" + "'", str9, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "AA11111111" + "'", str14, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1111111111" + "'", str19, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "AA11111111" + "'", str25, "AA11111111");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "AA11111111" + "'", str27, "AA11111111");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "AA11111111" + "'", str29, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "AA11111111" + "'", str34, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "AA11111111" + "'", str43, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "1111111111" + "'", str54, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "AA11111111" + "'", str59, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertEquals("'" + obj63 + "' != '" + "1111111111" + "'", obj63, "1111111111");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "1111111111" + "'", str65, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "hi!");
        java.lang.String str5 = caverphone0.caverphone("hi!");
        boolean boolean8 = caverphone0.isCaverphoneEqual("", "AA11111111");
        boolean boolean11 = caverphone0.isCaverphoneEqual("1111111111", "1111111111");
        boolean boolean14 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str16 = caverphone0.caverphone("1111111111");
        java.lang.String str18 = caverphone0.encode("AA11111111");
        boolean boolean21 = caverphone0.isCaverphoneEqual("hi!", "AA11111111");
        java.lang.String str23 = caverphone0.caverphone("hi!");
        boolean boolean26 = caverphone0.isCaverphoneEqual("AA11111111", "AA11111111");
        java.lang.String str28 = caverphone0.caverphone("1111111111");
        org.apache.commons.codec.language.Caverphone caverphone29 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean32 = caverphone29.isCaverphoneEqual("", "hi!");
        java.lang.String str34 = caverphone29.caverphone("hi!");
        boolean boolean37 = caverphone29.isCaverphoneEqual("", "AA11111111");
        boolean boolean40 = caverphone29.isCaverphoneEqual("1111111111", "1111111111");
        boolean boolean43 = caverphone29.isCaverphoneEqual("AA11111111", "");
        boolean boolean46 = caverphone29.isCaverphoneEqual("", "1111111111");
        java.lang.String str48 = caverphone29.caverphone("hi!");
        java.lang.Object obj49 = caverphone0.encode((java.lang.Object) str48);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1111111111" + "'", str16, "1111111111");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "AA11111111" + "'", str18, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "AA11111111" + "'", str23, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "1111111111" + "'", str28, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "AA11111111" + "'", str34, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "AA11111111" + "'", str48, "AA11111111");
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + "AA11111111" + "'", obj49, "AA11111111");
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "hi!");
        java.lang.String str5 = caverphone0.caverphone("hi!");
        boolean boolean8 = caverphone0.isCaverphoneEqual("", "AA11111111");
        java.lang.String str10 = caverphone0.encode("1111111111");
        java.lang.String str12 = caverphone0.encode("1111111111");
        java.lang.Class<?> wildcardClass13 = caverphone0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1111111111" + "'", str10, "1111111111");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1111111111" + "'", str12, "1111111111");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "hi!");
        java.lang.String str5 = caverphone0.caverphone("hi!");
        boolean boolean8 = caverphone0.isCaverphoneEqual("", "AA11111111");
        java.lang.String str10 = caverphone0.caverphone("AA11111111");
        org.apache.commons.codec.language.Caverphone caverphone11 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str13 = caverphone11.encode("");
        java.lang.String str15 = caverphone11.encode("hi!");
        java.lang.String str17 = caverphone11.caverphone("");
        java.lang.Object obj19 = caverphone11.encode((java.lang.Object) "");
        java.lang.Object obj20 = caverphone0.encode(obj19);
        boolean boolean23 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.Object obj24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = caverphone0.encode(obj24);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AA11111111" + "'", str10, "AA11111111");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1111111111" + "'", str13, "1111111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AA11111111" + "'", str15, "AA11111111");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1111111111" + "'", str17, "1111111111");
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + "1111111111" + "'", obj19, "1111111111");
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + "1111111111" + "'", obj20, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "hi!");
        java.lang.String str5 = caverphone0.caverphone("hi!");
        boolean boolean8 = caverphone0.isCaverphoneEqual("", "AA11111111");
        boolean boolean11 = caverphone0.isCaverphoneEqual("1111111111", "1111111111");
        boolean boolean14 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str16 = caverphone0.encode("");
        boolean boolean19 = caverphone0.isCaverphoneEqual("", "hi!");
        org.apache.commons.codec.language.Caverphone caverphone20 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean23 = caverphone20.isCaverphoneEqual("", "hi!");
        java.lang.String str25 = caverphone20.caverphone("hi!");
        java.lang.String str27 = caverphone20.caverphone("");
        org.apache.commons.codec.language.Caverphone caverphone28 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean31 = caverphone28.isCaverphoneEqual("", "hi!");
        java.lang.String str33 = caverphone28.caverphone("hi!");
        java.lang.String str35 = caverphone28.caverphone("AA11111111");
        java.lang.String str37 = caverphone28.encode("hi!");
        org.apache.commons.codec.language.Caverphone caverphone38 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str40 = caverphone38.encode("");
        java.lang.Object obj41 = caverphone28.encode((java.lang.Object) "");
        java.lang.Object obj42 = caverphone20.encode((java.lang.Object) "");
        boolean boolean45 = caverphone20.isCaverphoneEqual("1111111111", "AA11111111");
        java.lang.Object obj46 = caverphone0.encode((java.lang.Object) "AA11111111");
        java.lang.String str48 = caverphone0.encode("AA11111111");
        java.lang.String str50 = caverphone0.encode("1111111111");
        java.lang.String str52 = caverphone0.encode("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1111111111" + "'", str16, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "AA11111111" + "'", str25, "AA11111111");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1111111111" + "'", str27, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "AA11111111" + "'", str33, "AA11111111");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "AA11111111" + "'", str35, "AA11111111");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "AA11111111" + "'", str37, "AA11111111");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "1111111111" + "'", str40, "1111111111");
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + "1111111111" + "'", obj41, "1111111111");
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + "1111111111" + "'", obj42, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + "AA11111111" + "'", obj46, "AA11111111");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "AA11111111" + "'", str48, "AA11111111");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "1111111111" + "'", str50, "1111111111");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "AA11111111" + "'", str52, "AA11111111");
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "hi!");
        java.lang.String str5 = caverphone0.caverphone("hi!");
        boolean boolean8 = caverphone0.isCaverphoneEqual("", "AA11111111");
        boolean boolean11 = caverphone0.isCaverphoneEqual("1111111111", "1111111111");
        boolean boolean14 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str16 = caverphone0.caverphone("1111111111");
        java.lang.String str18 = caverphone0.caverphone("AA11111111");
        org.apache.commons.codec.language.Caverphone caverphone19 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str21 = caverphone19.encode("");
        java.lang.String str23 = caverphone19.encode("hi!");
        java.lang.String str25 = caverphone19.encode("");
        boolean boolean28 = caverphone19.isCaverphoneEqual("", "");
        java.lang.Object obj29 = caverphone0.encode((java.lang.Object) "");
        boolean boolean32 = caverphone0.isCaverphoneEqual("AA11111111", "AA11111111");
        java.lang.String str34 = caverphone0.encode("hi!");
        java.lang.String str36 = caverphone0.encode("1111111111");
        java.lang.String str38 = caverphone0.encode("1111111111");
        java.lang.Class<?> wildcardClass39 = caverphone0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1111111111" + "'", str16, "1111111111");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "AA11111111" + "'", str18, "AA11111111");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1111111111" + "'", str21, "1111111111");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "AA11111111" + "'", str23, "AA11111111");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1111111111" + "'", str25, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + "1111111111" + "'", obj29, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "AA11111111" + "'", str34, "AA11111111");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "1111111111" + "'", str36, "1111111111");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "1111111111" + "'", str38, "1111111111");
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("AA11111111", "AA11111111");
        org.apache.commons.codec.language.Caverphone caverphone4 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean7 = caverphone4.isCaverphoneEqual("", "hi!");
        java.lang.String str9 = caverphone4.caverphone("hi!");
        java.lang.String str11 = caverphone4.caverphone("");
        org.apache.commons.codec.language.Caverphone caverphone12 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean15 = caverphone12.isCaverphoneEqual("", "hi!");
        java.lang.String str17 = caverphone12.caverphone("hi!");
        java.lang.String str19 = caverphone12.caverphone("AA11111111");
        java.lang.String str21 = caverphone12.encode("hi!");
        org.apache.commons.codec.language.Caverphone caverphone22 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str24 = caverphone22.encode("");
        java.lang.Object obj25 = caverphone12.encode((java.lang.Object) "");
        java.lang.Object obj26 = caverphone4.encode((java.lang.Object) "");
        boolean boolean29 = caverphone4.isCaverphoneEqual("1111111111", "AA11111111");
        java.lang.Object obj30 = caverphone0.encode((java.lang.Object) "AA11111111");
        java.lang.String str32 = caverphone0.caverphone("hi!");
        org.apache.commons.codec.language.Caverphone caverphone33 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean36 = caverphone33.isCaverphoneEqual("", "hi!");
        java.lang.String str38 = caverphone33.caverphone("hi!");
        boolean boolean41 = caverphone33.isCaverphoneEqual("AA11111111", "hi!");
        java.lang.Object obj42 = caverphone0.encode((java.lang.Object) "hi!");
        java.lang.String str44 = caverphone0.encode("AA11111111");
        java.lang.String str46 = caverphone0.encode("hi!");
        boolean boolean49 = caverphone0.isCaverphoneEqual("AA11111111", "1111111111");
        boolean boolean52 = caverphone0.isCaverphoneEqual("hi!", "AA11111111");
        boolean boolean55 = caverphone0.isCaverphoneEqual("", "1111111111");
        boolean boolean58 = caverphone0.isCaverphoneEqual("hi!", "");
        org.apache.commons.codec.language.Caverphone caverphone59 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean62 = caverphone59.isCaverphoneEqual("", "hi!");
        java.lang.String str64 = caverphone59.caverphone("hi!");
        java.lang.String str66 = caverphone59.encode("AA11111111");
        java.lang.String str68 = caverphone59.encode("1111111111");
        boolean boolean71 = caverphone59.isCaverphoneEqual("", "1111111111");
        java.lang.String str73 = caverphone59.caverphone("");
        java.lang.String str75 = caverphone59.encode("1111111111");
        java.lang.Object obj76 = caverphone0.encode((java.lang.Object) "1111111111");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AA11111111" + "'", str9, "AA11111111");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1111111111" + "'", str11, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "AA11111111" + "'", str17, "AA11111111");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "AA11111111" + "'", str19, "AA11111111");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "AA11111111" + "'", str21, "AA11111111");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1111111111" + "'", str24, "1111111111");
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + "1111111111" + "'", obj25, "1111111111");
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + "1111111111" + "'", obj26, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + "AA11111111" + "'", obj30, "AA11111111");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "AA11111111" + "'", str32, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "AA11111111" + "'", str38, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + "AA11111111" + "'", obj42, "AA11111111");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "AA11111111" + "'", str44, "AA11111111");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "AA11111111" + "'", str46, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "AA11111111" + "'", str64, "AA11111111");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "AA11111111" + "'", str66, "AA11111111");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "1111111111" + "'", str68, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "1111111111" + "'", str73, "1111111111");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "1111111111" + "'", str75, "1111111111");
        org.junit.Assert.assertEquals("'" + obj76 + "' != '" + "1111111111" + "'", obj76, "1111111111");
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "hi!");
        java.lang.String str5 = caverphone0.caverphone("hi!");
        java.lang.String str7 = caverphone0.caverphone("AA11111111");
        java.lang.String str9 = caverphone0.encode("AA11111111");
        boolean boolean12 = caverphone0.isCaverphoneEqual("", "1111111111");
        java.lang.String str14 = caverphone0.caverphone("hi!");
        java.lang.String str16 = caverphone0.encode("");
        java.lang.String str18 = caverphone0.caverphone("hi!");
        boolean boolean21 = caverphone0.isCaverphoneEqual("", "hi!");
        java.lang.String str23 = caverphone0.caverphone("AA11111111");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AA11111111" + "'", str9, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "AA11111111" + "'", str14, "AA11111111");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1111111111" + "'", str16, "1111111111");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "AA11111111" + "'", str18, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "AA11111111" + "'", str23, "AA11111111");
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "hi!");
        java.lang.String str5 = caverphone0.caverphone("hi!");
        java.lang.String str7 = caverphone0.caverphone("AA11111111");
        java.lang.Object obj9 = caverphone0.encode((java.lang.Object) "AA11111111");
        java.lang.String str11 = caverphone0.caverphone("");
        boolean boolean14 = caverphone0.isCaverphoneEqual("1111111111", "1111111111");
        org.apache.commons.codec.language.Caverphone caverphone15 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean18 = caverphone15.isCaverphoneEqual("", "hi!");
        java.lang.String str20 = caverphone15.caverphone("hi!");
        boolean boolean23 = caverphone15.isCaverphoneEqual("AA11111111", "hi!");
        org.apache.commons.codec.language.Caverphone caverphone24 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean27 = caverphone24.isCaverphoneEqual("", "hi!");
        java.lang.String str29 = caverphone24.caverphone("hi!");
        java.lang.String str31 = caverphone24.caverphone("AA11111111");
        java.lang.String str33 = caverphone24.encode("AA11111111");
        java.lang.String str35 = caverphone24.caverphone("hi!");
        boolean boolean38 = caverphone24.isCaverphoneEqual("1111111111", "AA11111111");
        java.lang.String str40 = caverphone24.encode("1111111111");
        java.lang.Object obj41 = caverphone15.encode((java.lang.Object) str40);
        java.lang.String str43 = caverphone15.caverphone("hi!");
        java.lang.Object obj44 = caverphone0.encode((java.lang.Object) "hi!");
        java.lang.String str46 = caverphone0.caverphone("AA11111111");
        boolean boolean49 = caverphone0.isCaverphoneEqual("hi!", "AA11111111");
        java.lang.String str51 = caverphone0.caverphone("AA11111111");
        boolean boolean54 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean57 = caverphone0.isCaverphoneEqual("1111111111", "hi!");
        java.lang.String str59 = caverphone0.caverphone("AA11111111");
        java.lang.String str61 = caverphone0.encode("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "AA11111111" + "'", obj9, "AA11111111");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1111111111" + "'", str11, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "AA11111111" + "'", str20, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "AA11111111" + "'", str29, "AA11111111");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "AA11111111" + "'", str31, "AA11111111");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "AA11111111" + "'", str33, "AA11111111");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "AA11111111" + "'", str35, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "1111111111" + "'", str40, "1111111111");
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + "1111111111" + "'", obj41, "1111111111");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "AA11111111" + "'", str43, "AA11111111");
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + "AA11111111" + "'", obj44, "AA11111111");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "AA11111111" + "'", str46, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "AA11111111" + "'", str51, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "AA11111111" + "'", str59, "AA11111111");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "1111111111" + "'", str61, "1111111111");
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "hi!");
        java.lang.String str5 = caverphone0.caverphone("hi!");
        java.lang.String str7 = caverphone0.encode("AA11111111");
        java.lang.String str9 = caverphone0.caverphone("");
        java.lang.String str11 = caverphone0.encode("1111111111");
        java.lang.String str13 = caverphone0.caverphone("hi!");
        java.lang.String str15 = caverphone0.caverphone("1111111111");
        boolean boolean18 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str20 = caverphone0.encode("");
        java.lang.String str22 = caverphone0.encode("1111111111");
        java.lang.String str24 = caverphone0.encode("AA11111111");
        java.lang.String str26 = caverphone0.caverphone("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1111111111" + "'", str9, "1111111111");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1111111111" + "'", str11, "1111111111");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AA11111111" + "'", str13, "AA11111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1111111111" + "'", str15, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1111111111" + "'", str20, "1111111111");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1111111111" + "'", str22, "1111111111");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "AA11111111" + "'", str24, "AA11111111");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "1111111111" + "'", str26, "1111111111");
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "hi!");
        java.lang.String str5 = caverphone0.caverphone("hi!");
        java.lang.String str7 = caverphone0.caverphone("AA11111111");
        java.lang.String str9 = caverphone0.encode("hi!");
        org.apache.commons.codec.language.Caverphone caverphone10 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str12 = caverphone10.encode("");
        java.lang.Object obj13 = caverphone0.encode((java.lang.Object) "");
        java.lang.String str15 = caverphone0.encode("1111111111");
        boolean boolean18 = caverphone0.isCaverphoneEqual("hi!", "1111111111");
        boolean boolean21 = caverphone0.isCaverphoneEqual("AA11111111", "hi!");
        boolean boolean24 = caverphone0.isCaverphoneEqual("", "AA11111111");
        boolean boolean27 = caverphone0.isCaverphoneEqual("", "AA11111111");
        java.lang.String str29 = caverphone0.caverphone("1111111111");
        boolean boolean32 = caverphone0.isCaverphoneEqual("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AA11111111" + "'", str9, "AA11111111");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1111111111" + "'", str12, "1111111111");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "1111111111" + "'", obj13, "1111111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1111111111" + "'", str15, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "1111111111" + "'", str29, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "hi!");
        java.lang.String str5 = caverphone0.caverphone("hi!");
        boolean boolean8 = caverphone0.isCaverphoneEqual("", "AA11111111");
        java.lang.String str10 = caverphone0.caverphone("AA11111111");
        java.lang.String str12 = caverphone0.encode("hi!");
        java.lang.String str14 = caverphone0.encode("");
        java.lang.String str16 = caverphone0.encode("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AA11111111" + "'", str10, "AA11111111");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "AA11111111" + "'", str12, "AA11111111");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1111111111" + "'", str14, "1111111111");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "AA11111111" + "'", str16, "AA11111111");
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "hi!");
        java.lang.String str5 = caverphone0.caverphone("hi!");
        java.lang.String str7 = caverphone0.encode("AA11111111");
        java.lang.String str9 = caverphone0.caverphone("");
        java.lang.String str11 = caverphone0.encode("AA11111111");
        java.lang.String str13 = caverphone0.encode("");
        boolean boolean16 = caverphone0.isCaverphoneEqual("", "1111111111");
        java.lang.String str18 = caverphone0.caverphone("");
        java.lang.String str20 = caverphone0.caverphone("AA11111111");
        org.apache.commons.codec.language.Caverphone caverphone21 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean24 = caverphone21.isCaverphoneEqual("AA11111111", "AA11111111");
        boolean boolean27 = caverphone21.isCaverphoneEqual("", "");
        boolean boolean30 = caverphone21.isCaverphoneEqual("AA11111111", "1111111111");
        java.lang.String str32 = caverphone21.caverphone("1111111111");
        java.lang.String str34 = caverphone21.caverphone("");
        java.lang.String str36 = caverphone21.caverphone("AA11111111");
        org.apache.commons.codec.language.Caverphone caverphone37 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str39 = caverphone37.encode("");
        java.lang.String str41 = caverphone37.encode("hi!");
        java.lang.String str43 = caverphone37.encode("");
        java.lang.String str45 = caverphone37.caverphone("AA11111111");
        java.lang.Object obj46 = caverphone21.encode((java.lang.Object) str45);
        java.lang.String str48 = caverphone21.encode("");
        boolean boolean51 = caverphone21.isCaverphoneEqual("1111111111", "AA11111111");
        java.lang.String str53 = caverphone21.encode("hi!");
        boolean boolean56 = caverphone21.isCaverphoneEqual("", "1111111111");
        java.lang.Class<?> wildcardClass57 = caverphone21.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj58 = caverphone0.encode((java.lang.Object) caverphone21);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1111111111" + "'", str9, "1111111111");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "AA11111111" + "'", str11, "AA11111111");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1111111111" + "'", str13, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1111111111" + "'", str18, "1111111111");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "AA11111111" + "'", str20, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "1111111111" + "'", str32, "1111111111");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "1111111111" + "'", str34, "1111111111");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "AA11111111" + "'", str36, "AA11111111");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "1111111111" + "'", str39, "1111111111");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "AA11111111" + "'", str41, "AA11111111");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "1111111111" + "'", str43, "1111111111");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "AA11111111" + "'", str45, "AA11111111");
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + "AA11111111" + "'", obj46, "AA11111111");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "1111111111" + "'", str48, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "AA11111111" + "'", str53, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("AA11111111", "AA11111111");
        org.apache.commons.codec.language.Caverphone caverphone4 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean7 = caverphone4.isCaverphoneEqual("", "hi!");
        java.lang.String str9 = caverphone4.caverphone("hi!");
        java.lang.String str11 = caverphone4.caverphone("");
        org.apache.commons.codec.language.Caverphone caverphone12 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean15 = caverphone12.isCaverphoneEqual("", "hi!");
        java.lang.String str17 = caverphone12.caverphone("hi!");
        java.lang.String str19 = caverphone12.caverphone("AA11111111");
        java.lang.String str21 = caverphone12.encode("hi!");
        org.apache.commons.codec.language.Caverphone caverphone22 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str24 = caverphone22.encode("");
        java.lang.Object obj25 = caverphone12.encode((java.lang.Object) "");
        java.lang.Object obj26 = caverphone4.encode((java.lang.Object) "");
        boolean boolean29 = caverphone4.isCaverphoneEqual("1111111111", "AA11111111");
        java.lang.Object obj30 = caverphone0.encode((java.lang.Object) "AA11111111");
        boolean boolean33 = caverphone0.isCaverphoneEqual("AA11111111", "1111111111");
        boolean boolean36 = caverphone0.isCaverphoneEqual("1111111111", "");
        java.lang.String str38 = caverphone0.caverphone("");
        java.lang.String str40 = caverphone0.caverphone("");
        boolean boolean43 = caverphone0.isCaverphoneEqual("1111111111", "AA11111111");
        java.lang.String str45 = caverphone0.caverphone("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AA11111111" + "'", str9, "AA11111111");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1111111111" + "'", str11, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "AA11111111" + "'", str17, "AA11111111");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "AA11111111" + "'", str19, "AA11111111");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "AA11111111" + "'", str21, "AA11111111");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1111111111" + "'", str24, "1111111111");
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + "1111111111" + "'", obj25, "1111111111");
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + "1111111111" + "'", obj26, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + "AA11111111" + "'", obj30, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "1111111111" + "'", str38, "1111111111");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "1111111111" + "'", str40, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "1111111111" + "'", str45, "1111111111");
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "hi!");
        java.lang.String str5 = caverphone0.caverphone("hi!");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "hi!");
        java.lang.String str10 = caverphone0.encode("AA11111111");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AA11111111" + "'", str10, "AA11111111");
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "hi!");
        java.lang.String str5 = caverphone0.caverphone("hi!");
        java.lang.String str7 = caverphone0.encode("AA11111111");
        java.lang.String str9 = caverphone0.caverphone("");
        java.lang.String str11 = caverphone0.encode("AA11111111");
        java.lang.String str13 = caverphone0.encode("");
        boolean boolean16 = caverphone0.isCaverphoneEqual("", "1111111111");
        boolean boolean19 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str21 = caverphone0.caverphone("hi!");
        java.lang.String str23 = caverphone0.caverphone("");
        java.lang.Class<?> wildcardClass24 = caverphone0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1111111111" + "'", str9, "1111111111");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "AA11111111" + "'", str11, "AA11111111");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1111111111" + "'", str13, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "AA11111111" + "'", str21, "AA11111111");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1111111111" + "'", str23, "1111111111");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "hi!");
        java.lang.String str5 = caverphone0.caverphone("hi!");
        java.lang.String str7 = caverphone0.caverphone("AA11111111");
        java.lang.String str9 = caverphone0.encode("hi!");
        org.apache.commons.codec.language.Caverphone caverphone10 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str12 = caverphone10.encode("");
        java.lang.Object obj13 = caverphone0.encode((java.lang.Object) "");
        java.lang.String str15 = caverphone0.encode("");
        boolean boolean18 = caverphone0.isCaverphoneEqual("1111111111", "");
        java.lang.String str20 = caverphone0.encode("AA11111111");
        boolean boolean23 = caverphone0.isCaverphoneEqual("", "AA11111111");
        boolean boolean26 = caverphone0.isCaverphoneEqual("", "1111111111");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AA11111111" + "'", str9, "AA11111111");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1111111111" + "'", str12, "1111111111");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "1111111111" + "'", obj13, "1111111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1111111111" + "'", str15, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "AA11111111" + "'", str20, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "hi!");
        java.lang.String str5 = caverphone0.caverphone("hi!");
        java.lang.String str7 = caverphone0.caverphone("AA11111111");
        java.lang.String str9 = caverphone0.encode("hi!");
        org.apache.commons.codec.language.Caverphone caverphone10 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str12 = caverphone10.encode("");
        java.lang.Object obj13 = caverphone0.encode((java.lang.Object) "");
        java.lang.String str15 = caverphone0.encode("");
        java.lang.String str17 = caverphone0.encode("hi!");
        java.lang.String str19 = caverphone0.encode("AA11111111");
        boolean boolean22 = caverphone0.isCaverphoneEqual("AA11111111", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AA11111111" + "'", str9, "AA11111111");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1111111111" + "'", str12, "1111111111");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "1111111111" + "'", obj13, "1111111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1111111111" + "'", str15, "1111111111");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "AA11111111" + "'", str17, "AA11111111");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "AA11111111" + "'", str19, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("");
        java.lang.String str4 = caverphone0.encode("hi!");
        java.lang.String str6 = caverphone0.caverphone("");
        java.lang.String str8 = caverphone0.encode("1111111111");
        java.lang.String str10 = caverphone0.caverphone("AA11111111");
        boolean boolean13 = caverphone0.isCaverphoneEqual("", "AA11111111");
        java.lang.String str15 = caverphone0.encode("hi!");
        java.lang.String str17 = caverphone0.encode("");
        boolean boolean20 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean23 = caverphone0.isCaverphoneEqual("", "1111111111");
        org.apache.commons.codec.language.Caverphone caverphone24 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean27 = caverphone24.isCaverphoneEqual("", "hi!");
        java.lang.String str29 = caverphone24.caverphone("hi!");
        boolean boolean32 = caverphone24.isCaverphoneEqual("AA11111111", "hi!");
        java.lang.String str34 = caverphone24.caverphone("1111111111");
        java.lang.String str36 = caverphone24.caverphone("hi!");
        org.apache.commons.codec.language.Caverphone caverphone37 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean40 = caverphone37.isCaverphoneEqual("", "hi!");
        java.lang.String str42 = caverphone37.caverphone("hi!");
        java.lang.String str44 = caverphone37.caverphone("AA11111111");
        java.lang.String str46 = caverphone37.encode("hi!");
        java.lang.String str48 = caverphone37.encode("AA11111111");
        java.lang.String str50 = caverphone37.encode("");
        java.lang.Object obj51 = caverphone24.encode((java.lang.Object) "");
        java.lang.Object obj52 = caverphone0.encode(obj51);
        java.lang.String str54 = caverphone0.caverphone("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "AA11111111" + "'", str4, "AA11111111");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1111111111" + "'", str6, "1111111111");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1111111111" + "'", str8, "1111111111");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AA11111111" + "'", str10, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AA11111111" + "'", str15, "AA11111111");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1111111111" + "'", str17, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "AA11111111" + "'", str29, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "1111111111" + "'", str34, "1111111111");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "AA11111111" + "'", str36, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "AA11111111" + "'", str42, "AA11111111");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "AA11111111" + "'", str44, "AA11111111");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "AA11111111" + "'", str46, "AA11111111");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "AA11111111" + "'", str48, "AA11111111");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "1111111111" + "'", str50, "1111111111");
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + "1111111111" + "'", obj51, "1111111111");
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + "1111111111" + "'", obj52, "1111111111");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "1111111111" + "'", str54, "1111111111");
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "hi!");
        java.lang.String str5 = caverphone0.caverphone("hi!");
        java.lang.String str7 = caverphone0.encode("AA11111111");
        boolean boolean10 = caverphone0.isCaverphoneEqual("", "AA11111111");
        java.lang.String str12 = caverphone0.encode("AA11111111");
        java.lang.String str14 = caverphone0.encode("1111111111");
        java.lang.String str16 = caverphone0.caverphone("");
        java.lang.String str18 = caverphone0.caverphone("");
        boolean boolean21 = caverphone0.isCaverphoneEqual("", "AA11111111");
        java.lang.Class<?> wildcardClass22 = caverphone0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "AA11111111" + "'", str12, "AA11111111");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1111111111" + "'", str14, "1111111111");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1111111111" + "'", str16, "1111111111");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1111111111" + "'", str18, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "hi!");
        java.lang.String str5 = caverphone0.caverphone("hi!");
        java.lang.String str7 = caverphone0.caverphone("AA11111111");
        java.lang.String str9 = caverphone0.encode("AA11111111");
        java.lang.String str11 = caverphone0.caverphone("hi!");
        java.lang.String str13 = caverphone0.caverphone("1111111111");
        boolean boolean16 = caverphone0.isCaverphoneEqual("", "hi!");
        java.lang.String str18 = caverphone0.encode("hi!");
        java.lang.String str20 = caverphone0.encode("AA11111111");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AA11111111" + "'", str9, "AA11111111");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "AA11111111" + "'", str11, "AA11111111");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1111111111" + "'", str13, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "AA11111111" + "'", str18, "AA11111111");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "AA11111111" + "'", str20, "AA11111111");
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "hi!");
        java.lang.String str5 = caverphone0.caverphone("hi!");
        java.lang.String str7 = caverphone0.encode("AA11111111");
        boolean boolean10 = caverphone0.isCaverphoneEqual("", "AA11111111");
        org.apache.commons.codec.language.Caverphone caverphone11 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean14 = caverphone11.isCaverphoneEqual("", "hi!");
        java.lang.String str16 = caverphone11.caverphone("hi!");
        java.lang.String str18 = caverphone11.caverphone("AA11111111");
        java.lang.String str20 = caverphone11.encode("hi!");
        org.apache.commons.codec.language.Caverphone caverphone21 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str23 = caverphone21.encode("");
        java.lang.Object obj24 = caverphone11.encode((java.lang.Object) "");
        boolean boolean27 = caverphone11.isCaverphoneEqual("AA11111111", "AA11111111");
        java.lang.Object obj28 = caverphone0.encode((java.lang.Object) "AA11111111");
        boolean boolean31 = caverphone0.isCaverphoneEqual("", "hi!");
        java.lang.String str33 = caverphone0.caverphone("1111111111");
        boolean boolean36 = caverphone0.isCaverphoneEqual("AA11111111", "1111111111");
        java.lang.String str38 = caverphone0.caverphone("AA11111111");
        org.apache.commons.codec.language.Caverphone caverphone39 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean42 = caverphone39.isCaverphoneEqual("", "hi!");
        java.lang.String str44 = caverphone39.caverphone("hi!");
        java.lang.String str46 = caverphone39.caverphone("");
        org.apache.commons.codec.language.Caverphone caverphone47 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean50 = caverphone47.isCaverphoneEqual("", "hi!");
        java.lang.String str52 = caverphone47.caverphone("hi!");
        java.lang.String str54 = caverphone47.caverphone("AA11111111");
        java.lang.String str56 = caverphone47.encode("hi!");
        org.apache.commons.codec.language.Caverphone caverphone57 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str59 = caverphone57.encode("");
        java.lang.Object obj60 = caverphone47.encode((java.lang.Object) "");
        java.lang.Object obj61 = caverphone39.encode((java.lang.Object) "");
        boolean boolean64 = caverphone39.isCaverphoneEqual("1111111111", "AA11111111");
        java.lang.String str66 = caverphone39.encode("");
        java.lang.String str68 = caverphone39.encode("AA11111111");
        boolean boolean71 = caverphone39.isCaverphoneEqual("", "hi!");
        java.lang.String str73 = caverphone39.encode("AA11111111");
        java.lang.String str75 = caverphone39.encode("hi!");
        java.lang.String str77 = caverphone39.encode("hi!");
        java.lang.Object obj78 = caverphone0.encode((java.lang.Object) "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "AA11111111" + "'", str16, "AA11111111");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "AA11111111" + "'", str18, "AA11111111");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "AA11111111" + "'", str20, "AA11111111");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1111111111" + "'", str23, "1111111111");
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + "1111111111" + "'", obj24, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + "AA11111111" + "'", obj28, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "1111111111" + "'", str33, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "AA11111111" + "'", str38, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "AA11111111" + "'", str44, "AA11111111");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "1111111111" + "'", str46, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "AA11111111" + "'", str52, "AA11111111");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "AA11111111" + "'", str54, "AA11111111");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "AA11111111" + "'", str56, "AA11111111");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "1111111111" + "'", str59, "1111111111");
        org.junit.Assert.assertEquals("'" + obj60 + "' != '" + "1111111111" + "'", obj60, "1111111111");
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + "1111111111" + "'", obj61, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "1111111111" + "'", str66, "1111111111");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "AA11111111" + "'", str68, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "AA11111111" + "'", str73, "AA11111111");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "AA11111111" + "'", str75, "AA11111111");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "AA11111111" + "'", str77, "AA11111111");
        org.junit.Assert.assertEquals("'" + obj78 + "' != '" + "AA11111111" + "'", obj78, "AA11111111");
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "hi!");
        java.lang.String str5 = caverphone0.caverphone("hi!");
        java.lang.String str7 = caverphone0.caverphone("AA11111111");
        java.lang.String str9 = caverphone0.encode("hi!");
        org.apache.commons.codec.language.Caverphone caverphone10 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str12 = caverphone10.encode("");
        java.lang.Object obj13 = caverphone0.encode((java.lang.Object) "");
        boolean boolean16 = caverphone0.isCaverphoneEqual("1111111111", "1111111111");
        boolean boolean19 = caverphone0.isCaverphoneEqual("AA11111111", "1111111111");
        java.lang.String str21 = caverphone0.caverphone("AA11111111");
        boolean boolean24 = caverphone0.isCaverphoneEqual("1111111111", "");
        boolean boolean27 = caverphone0.isCaverphoneEqual("", "AA11111111");
        boolean boolean30 = caverphone0.isCaverphoneEqual("AA11111111", "");
        boolean boolean33 = caverphone0.isCaverphoneEqual("1111111111", "");
        org.apache.commons.codec.language.Caverphone caverphone34 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str36 = caverphone34.encode("");
        java.lang.String str38 = caverphone34.encode("hi!");
        java.lang.String str40 = caverphone34.encode("");
        java.lang.String str42 = caverphone34.caverphone("1111111111");
        java.lang.String str44 = caverphone34.encode("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj45 = caverphone0.encode((java.lang.Object) caverphone34);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AA11111111" + "'", str9, "AA11111111");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1111111111" + "'", str12, "1111111111");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "1111111111" + "'", obj13, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "AA11111111" + "'", str21, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "1111111111" + "'", str36, "1111111111");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "AA11111111" + "'", str38, "AA11111111");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "1111111111" + "'", str40, "1111111111");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "1111111111" + "'", str42, "1111111111");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "1111111111" + "'", str44, "1111111111");
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "hi!");
        java.lang.String str5 = caverphone0.caverphone("hi!");
        java.lang.String str7 = caverphone0.caverphone("AA11111111");
        java.lang.String str9 = caverphone0.encode("AA11111111");
        java.lang.String str11 = caverphone0.caverphone("hi!");
        boolean boolean14 = caverphone0.isCaverphoneEqual("1111111111", "AA11111111");
        java.lang.String str16 = caverphone0.encode("1111111111");
        java.lang.String str18 = caverphone0.caverphone("1111111111");
        java.lang.String str20 = caverphone0.caverphone("AA11111111");
        java.lang.Class<?> wildcardClass21 = caverphone0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AA11111111" + "'", str9, "AA11111111");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "AA11111111" + "'", str11, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1111111111" + "'", str16, "1111111111");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1111111111" + "'", str18, "1111111111");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "AA11111111" + "'", str20, "AA11111111");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "hi!");
        java.lang.String str5 = caverphone0.caverphone("hi!");
        java.lang.String str7 = caverphone0.caverphone("");
        org.apache.commons.codec.language.Caverphone caverphone8 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean11 = caverphone8.isCaverphoneEqual("", "hi!");
        java.lang.String str13 = caverphone8.caverphone("hi!");
        java.lang.String str15 = caverphone8.caverphone("AA11111111");
        java.lang.String str17 = caverphone8.encode("hi!");
        org.apache.commons.codec.language.Caverphone caverphone18 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str20 = caverphone18.encode("");
        java.lang.Object obj21 = caverphone8.encode((java.lang.Object) "");
        java.lang.Object obj22 = caverphone0.encode((java.lang.Object) "");
        java.lang.String str24 = caverphone0.encode("");
        java.lang.String str26 = caverphone0.caverphone("");
        java.lang.String str28 = caverphone0.encode("");
        java.lang.String str30 = caverphone0.caverphone("hi!");
        org.apache.commons.codec.language.Caverphone caverphone31 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean34 = caverphone31.isCaverphoneEqual("", "hi!");
        java.lang.String str36 = caverphone31.caverphone("hi!");
        java.lang.String str38 = caverphone31.caverphone("AA11111111");
        java.lang.String str40 = caverphone31.caverphone("");
        org.apache.commons.codec.language.Caverphone caverphone41 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean44 = caverphone41.isCaverphoneEqual("", "hi!");
        java.lang.String str46 = caverphone41.caverphone("hi!");
        java.lang.String str48 = caverphone41.caverphone("");
        org.apache.commons.codec.language.Caverphone caverphone49 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean52 = caverphone49.isCaverphoneEqual("", "hi!");
        java.lang.String str54 = caverphone49.caverphone("hi!");
        java.lang.String str56 = caverphone49.caverphone("AA11111111");
        java.lang.String str58 = caverphone49.encode("hi!");
        org.apache.commons.codec.language.Caverphone caverphone59 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str61 = caverphone59.encode("");
        java.lang.Object obj62 = caverphone49.encode((java.lang.Object) "");
        java.lang.Object obj63 = caverphone41.encode((java.lang.Object) "");
        java.lang.Object obj64 = caverphone31.encode((java.lang.Object) "");
        java.lang.Object obj65 = caverphone0.encode(obj64);
        java.lang.String str67 = caverphone0.caverphone("hi!");
        boolean boolean70 = caverphone0.isCaverphoneEqual("AA11111111", "1111111111");
        java.lang.String str72 = caverphone0.caverphone("hi!");
        java.lang.Class<?> wildcardClass73 = caverphone0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1111111111" + "'", str7, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AA11111111" + "'", str13, "AA11111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AA11111111" + "'", str15, "AA11111111");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "AA11111111" + "'", str17, "AA11111111");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1111111111" + "'", str20, "1111111111");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + "1111111111" + "'", obj21, "1111111111");
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + "1111111111" + "'", obj22, "1111111111");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1111111111" + "'", str24, "1111111111");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "1111111111" + "'", str26, "1111111111");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "1111111111" + "'", str28, "1111111111");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "AA11111111" + "'", str30, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "AA11111111" + "'", str36, "AA11111111");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "AA11111111" + "'", str38, "AA11111111");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "1111111111" + "'", str40, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "AA11111111" + "'", str46, "AA11111111");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "1111111111" + "'", str48, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "AA11111111" + "'", str54, "AA11111111");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "AA11111111" + "'", str56, "AA11111111");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "AA11111111" + "'", str58, "AA11111111");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "1111111111" + "'", str61, "1111111111");
        org.junit.Assert.assertEquals("'" + obj62 + "' != '" + "1111111111" + "'", obj62, "1111111111");
        org.junit.Assert.assertEquals("'" + obj63 + "' != '" + "1111111111" + "'", obj63, "1111111111");
        org.junit.Assert.assertEquals("'" + obj64 + "' != '" + "1111111111" + "'", obj64, "1111111111");
        org.junit.Assert.assertEquals("'" + obj65 + "' != '" + "1111111111" + "'", obj65, "1111111111");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "AA11111111" + "'", str67, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "AA11111111" + "'", str72, "AA11111111");
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("AA11111111", "AA11111111");
        org.apache.commons.codec.language.Caverphone caverphone4 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean7 = caverphone4.isCaverphoneEqual("", "hi!");
        java.lang.String str9 = caverphone4.caverphone("hi!");
        java.lang.String str11 = caverphone4.caverphone("");
        org.apache.commons.codec.language.Caverphone caverphone12 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean15 = caverphone12.isCaverphoneEqual("", "hi!");
        java.lang.String str17 = caverphone12.caverphone("hi!");
        java.lang.String str19 = caverphone12.caverphone("AA11111111");
        java.lang.String str21 = caverphone12.encode("hi!");
        org.apache.commons.codec.language.Caverphone caverphone22 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str24 = caverphone22.encode("");
        java.lang.Object obj25 = caverphone12.encode((java.lang.Object) "");
        java.lang.Object obj26 = caverphone4.encode((java.lang.Object) "");
        boolean boolean29 = caverphone4.isCaverphoneEqual("1111111111", "AA11111111");
        java.lang.Object obj30 = caverphone0.encode((java.lang.Object) "AA11111111");
        boolean boolean33 = caverphone0.isCaverphoneEqual("AA11111111", "1111111111");
        java.lang.String str35 = caverphone0.caverphone("hi!");
        boolean boolean38 = caverphone0.isCaverphoneEqual("hi!", "");
        boolean boolean41 = caverphone0.isCaverphoneEqual("AA11111111", "hi!");
        java.lang.String str43 = caverphone0.encode("");
        boolean boolean46 = caverphone0.isCaverphoneEqual("hi!", "1111111111");
        java.lang.String str48 = caverphone0.encode("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AA11111111" + "'", str9, "AA11111111");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1111111111" + "'", str11, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "AA11111111" + "'", str17, "AA11111111");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "AA11111111" + "'", str19, "AA11111111");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "AA11111111" + "'", str21, "AA11111111");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1111111111" + "'", str24, "1111111111");
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + "1111111111" + "'", obj25, "1111111111");
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + "1111111111" + "'", obj26, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + "AA11111111" + "'", obj30, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "AA11111111" + "'", str35, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "1111111111" + "'", str43, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "1111111111" + "'", str48, "1111111111");
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "hi!");
        java.lang.String str5 = caverphone0.caverphone("hi!");
        java.lang.String str7 = caverphone0.caverphone("");
        boolean boolean10 = caverphone0.isCaverphoneEqual("AA11111111", "1111111111");
        boolean boolean13 = caverphone0.isCaverphoneEqual("", "hi!");
        java.lang.String str15 = caverphone0.encode("1111111111");
        java.lang.Class<?> wildcardClass16 = caverphone0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1111111111" + "'", str7, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1111111111" + "'", str15, "1111111111");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "hi!");
        java.lang.String str5 = caverphone0.caverphone("hi!");
        java.lang.String str7 = caverphone0.caverphone("");
        org.apache.commons.codec.language.Caverphone caverphone8 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean11 = caverphone8.isCaverphoneEqual("", "hi!");
        java.lang.String str13 = caverphone8.caverphone("hi!");
        java.lang.String str15 = caverphone8.caverphone("AA11111111");
        java.lang.String str17 = caverphone8.encode("hi!");
        org.apache.commons.codec.language.Caverphone caverphone18 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str20 = caverphone18.encode("");
        java.lang.Object obj21 = caverphone8.encode((java.lang.Object) "");
        java.lang.Object obj22 = caverphone0.encode((java.lang.Object) "");
        java.lang.String str24 = caverphone0.encode("");
        java.lang.String str26 = caverphone0.encode("hi!");
        java.lang.String str28 = caverphone0.caverphone("1111111111");
        java.lang.String str30 = caverphone0.caverphone("AA11111111");
        org.apache.commons.codec.language.Caverphone caverphone31 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean34 = caverphone31.isCaverphoneEqual("", "hi!");
        java.lang.String str36 = caverphone31.caverphone("hi!");
        java.lang.String str38 = caverphone31.caverphone("AA11111111");
        java.lang.String str40 = caverphone31.encode("AA11111111");
        boolean boolean43 = caverphone31.isCaverphoneEqual("", "1111111111");
        boolean boolean46 = caverphone31.isCaverphoneEqual("1111111111", "");
        java.lang.String str48 = caverphone31.caverphone("1111111111");
        boolean boolean51 = caverphone31.isCaverphoneEqual("AA11111111", "1111111111");
        java.lang.String str53 = caverphone31.caverphone("1111111111");
        java.lang.String str55 = caverphone31.caverphone("AA11111111");
        java.lang.Object obj56 = caverphone0.encode((java.lang.Object) "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1111111111" + "'", str7, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AA11111111" + "'", str13, "AA11111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AA11111111" + "'", str15, "AA11111111");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "AA11111111" + "'", str17, "AA11111111");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1111111111" + "'", str20, "1111111111");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + "1111111111" + "'", obj21, "1111111111");
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + "1111111111" + "'", obj22, "1111111111");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1111111111" + "'", str24, "1111111111");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "AA11111111" + "'", str26, "AA11111111");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "1111111111" + "'", str28, "1111111111");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "AA11111111" + "'", str30, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "AA11111111" + "'", str36, "AA11111111");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "AA11111111" + "'", str38, "AA11111111");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "AA11111111" + "'", str40, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "1111111111" + "'", str48, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "1111111111" + "'", str53, "1111111111");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "AA11111111" + "'", str55, "AA11111111");
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + "AA11111111" + "'", obj56, "AA11111111");
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "hi!");
        java.lang.String str5 = caverphone0.caverphone("hi!");
        java.lang.String str7 = caverphone0.caverphone("AA11111111");
        java.lang.String str9 = caverphone0.encode("hi!");
        org.apache.commons.codec.language.Caverphone caverphone10 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str12 = caverphone10.encode("");
        java.lang.Object obj13 = caverphone0.encode((java.lang.Object) "");
        java.lang.String str15 = caverphone0.encode("1111111111");
        boolean boolean18 = caverphone0.isCaverphoneEqual("hi!", "1111111111");
        boolean boolean21 = caverphone0.isCaverphoneEqual("AA11111111", "hi!");
        boolean boolean24 = caverphone0.isCaverphoneEqual("", "AA11111111");
        boolean boolean27 = caverphone0.isCaverphoneEqual("1111111111", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AA11111111" + "'", str9, "AA11111111");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1111111111" + "'", str12, "1111111111");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "1111111111" + "'", obj13, "1111111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1111111111" + "'", str15, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "hi!");
        java.lang.String str5 = caverphone0.caverphone("hi!");
        java.lang.String str7 = caverphone0.caverphone("");
        java.lang.String str9 = caverphone0.encode("");
        java.lang.String str11 = caverphone0.caverphone("hi!");
        boolean boolean14 = caverphone0.isCaverphoneEqual("", "AA11111111");
        java.lang.String str16 = caverphone0.encode("1111111111");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1111111111" + "'", str7, "1111111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1111111111" + "'", str9, "1111111111");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "AA11111111" + "'", str11, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1111111111" + "'", str16, "1111111111");
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "hi!");
        java.lang.String str5 = caverphone0.caverphone("hi!");
        boolean boolean8 = caverphone0.isCaverphoneEqual("", "AA11111111");
        boolean boolean11 = caverphone0.isCaverphoneEqual("1111111111", "1111111111");
        boolean boolean14 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str16 = caverphone0.encode("");
        java.lang.String str18 = caverphone0.caverphone("1111111111");
        java.lang.String str20 = caverphone0.caverphone("hi!");
        boolean boolean23 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str25 = caverphone0.caverphone("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1111111111" + "'", str16, "1111111111");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1111111111" + "'", str18, "1111111111");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "AA11111111" + "'", str20, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1111111111" + "'", str25, "1111111111");
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "hi!");
        java.lang.String str5 = caverphone0.caverphone("hi!");
        java.lang.String str7 = caverphone0.caverphone("");
        org.apache.commons.codec.language.Caverphone caverphone8 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean11 = caverphone8.isCaverphoneEqual("", "hi!");
        java.lang.String str13 = caverphone8.caverphone("hi!");
        java.lang.String str15 = caverphone8.caverphone("AA11111111");
        java.lang.String str17 = caverphone8.encode("hi!");
        org.apache.commons.codec.language.Caverphone caverphone18 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str20 = caverphone18.encode("");
        java.lang.Object obj21 = caverphone8.encode((java.lang.Object) "");
        java.lang.Object obj22 = caverphone0.encode((java.lang.Object) "");
        java.lang.String str24 = caverphone0.encode("");
        java.lang.String str26 = caverphone0.encode("hi!");
        boolean boolean29 = caverphone0.isCaverphoneEqual("hi!", "1111111111");
        java.lang.String str31 = caverphone0.caverphone("hi!");
        boolean boolean34 = caverphone0.isCaverphoneEqual("", "hi!");
        boolean boolean37 = caverphone0.isCaverphoneEqual("hi!", "AA11111111");
        java.lang.String str39 = caverphone0.caverphone("hi!");
        org.apache.commons.codec.language.Caverphone caverphone40 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean43 = caverphone40.isCaverphoneEqual("", "hi!");
        java.lang.String str45 = caverphone40.caverphone("hi!");
        java.lang.String str47 = caverphone40.caverphone("AA11111111");
        java.lang.String str49 = caverphone40.encode("hi!");
        org.apache.commons.codec.language.Caverphone caverphone50 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str52 = caverphone50.encode("");
        java.lang.Object obj53 = caverphone40.encode((java.lang.Object) "");
        java.lang.String str55 = caverphone40.encode("");
        boolean boolean58 = caverphone40.isCaverphoneEqual("AA11111111", "1111111111");
        java.lang.String str60 = caverphone40.encode("");
        java.lang.String str62 = caverphone40.encode("AA11111111");
        boolean boolean65 = caverphone40.isCaverphoneEqual("1111111111", "");
        java.lang.String str67 = caverphone40.caverphone("1111111111");
        boolean boolean70 = caverphone40.isCaverphoneEqual("", "hi!");
        boolean boolean73 = caverphone40.isCaverphoneEqual("", "hi!");
        java.lang.Object obj74 = caverphone0.encode((java.lang.Object) "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1111111111" + "'", str7, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AA11111111" + "'", str13, "AA11111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AA11111111" + "'", str15, "AA11111111");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "AA11111111" + "'", str17, "AA11111111");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1111111111" + "'", str20, "1111111111");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + "1111111111" + "'", obj21, "1111111111");
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + "1111111111" + "'", obj22, "1111111111");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1111111111" + "'", str24, "1111111111");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "AA11111111" + "'", str26, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "AA11111111" + "'", str31, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "AA11111111" + "'", str39, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "AA11111111" + "'", str45, "AA11111111");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "AA11111111" + "'", str47, "AA11111111");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "AA11111111" + "'", str49, "AA11111111");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "1111111111" + "'", str52, "1111111111");
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + "1111111111" + "'", obj53, "1111111111");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "1111111111" + "'", str55, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "1111111111" + "'", str60, "1111111111");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "AA11111111" + "'", str62, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "1111111111" + "'", str67, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertEquals("'" + obj74 + "' != '" + "AA11111111" + "'", obj74, "AA11111111");
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "hi!");
        java.lang.String str5 = caverphone0.caverphone("hi!");
        java.lang.String str7 = caverphone0.caverphone("AA11111111");
        java.lang.String str9 = caverphone0.encode("hi!");
        org.apache.commons.codec.language.Caverphone caverphone10 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str12 = caverphone10.encode("");
        java.lang.Object obj13 = caverphone0.encode((java.lang.Object) "");
        java.lang.String str15 = caverphone0.encode("1111111111");
        boolean boolean18 = caverphone0.isCaverphoneEqual("hi!", "1111111111");
        java.lang.String str20 = caverphone0.caverphone("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AA11111111" + "'", str9, "AA11111111");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1111111111" + "'", str12, "1111111111");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "1111111111" + "'", obj13, "1111111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1111111111" + "'", str15, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "AA11111111" + "'", str20, "AA11111111");
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "hi!");
        java.lang.String str5 = caverphone0.caverphone("hi!");
        java.lang.String str7 = caverphone0.caverphone("AA11111111");
        java.lang.String str9 = caverphone0.encode("hi!");
        org.apache.commons.codec.language.Caverphone caverphone10 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str12 = caverphone10.encode("");
        java.lang.Object obj13 = caverphone0.encode((java.lang.Object) "");
        java.lang.String str15 = caverphone0.encode("");
        boolean boolean18 = caverphone0.isCaverphoneEqual("AA11111111", "1111111111");
        java.lang.String str20 = caverphone0.encode("");
        java.lang.String str22 = caverphone0.encode("AA11111111");
        java.lang.String str24 = caverphone0.caverphone("");
        org.apache.commons.codec.language.Caverphone caverphone25 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean28 = caverphone25.isCaverphoneEqual("", "hi!");
        java.lang.String str30 = caverphone25.caverphone("hi!");
        java.lang.String str32 = caverphone25.caverphone("AA11111111");
        java.lang.String str34 = caverphone25.encode("hi!");
        org.apache.commons.codec.language.Caverphone caverphone35 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str37 = caverphone35.encode("");
        java.lang.Object obj38 = caverphone25.encode((java.lang.Object) "");
        java.lang.String str40 = caverphone25.encode("");
        java.lang.String str42 = caverphone25.caverphone("AA11111111");
        java.lang.Object obj43 = caverphone0.encode((java.lang.Object) str42);
        boolean boolean46 = caverphone0.isCaverphoneEqual("1111111111", "");
        boolean boolean49 = caverphone0.isCaverphoneEqual("1111111111", "hi!");
        boolean boolean52 = caverphone0.isCaverphoneEqual("1111111111", "");
        java.lang.String str54 = caverphone0.encode("1111111111");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AA11111111" + "'", str9, "AA11111111");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1111111111" + "'", str12, "1111111111");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "1111111111" + "'", obj13, "1111111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1111111111" + "'", str15, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1111111111" + "'", str20, "1111111111");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "AA11111111" + "'", str22, "AA11111111");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1111111111" + "'", str24, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "AA11111111" + "'", str30, "AA11111111");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "AA11111111" + "'", str32, "AA11111111");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "AA11111111" + "'", str34, "AA11111111");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "1111111111" + "'", str37, "1111111111");
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + "1111111111" + "'", obj38, "1111111111");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "1111111111" + "'", str40, "1111111111");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "AA11111111" + "'", str42, "AA11111111");
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + "AA11111111" + "'", obj43, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "1111111111" + "'", str54, "1111111111");
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "hi!");
        java.lang.String str5 = caverphone0.caverphone("hi!");
        boolean boolean8 = caverphone0.isCaverphoneEqual("", "AA11111111");
        boolean boolean11 = caverphone0.isCaverphoneEqual("1111111111", "1111111111");
        boolean boolean14 = caverphone0.isCaverphoneEqual("AA11111111", "");
        java.lang.String str16 = caverphone0.caverphone("1111111111");
        java.lang.String str18 = caverphone0.encode("AA11111111");
        boolean boolean21 = caverphone0.isCaverphoneEqual("hi!", "1111111111");
        boolean boolean24 = caverphone0.isCaverphoneEqual("hi!", "");
        java.lang.String str26 = caverphone0.encode("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1111111111" + "'", str16, "1111111111");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "AA11111111" + "'", str18, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "1111111111" + "'", str26, "1111111111");
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("");
        java.lang.String str4 = caverphone0.encode("hi!");
        java.lang.String str6 = caverphone0.caverphone("1111111111");
        java.lang.String str8 = caverphone0.encode("AA11111111");
        boolean boolean11 = caverphone0.isCaverphoneEqual("1111111111", "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "AA11111111" + "'", str4, "AA11111111");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1111111111" + "'", str6, "1111111111");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AA11111111" + "'", str8, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "hi!");
        java.lang.String str5 = caverphone0.caverphone("hi!");
        java.lang.String str7 = caverphone0.caverphone("AA11111111");
        java.lang.String str9 = caverphone0.caverphone("");
        java.lang.String str11 = caverphone0.encode("1111111111");
        org.apache.commons.codec.language.Caverphone caverphone12 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str14 = caverphone12.encode("");
        java.lang.String str16 = caverphone12.encode("hi!");
        java.lang.String str18 = caverphone12.caverphone("");
        java.lang.String str20 = caverphone12.encode("1111111111");
        java.lang.String str22 = caverphone12.caverphone("AA11111111");
        java.lang.String str24 = caverphone12.encode("");
        boolean boolean27 = caverphone12.isCaverphoneEqual("", "");
        org.apache.commons.codec.language.Caverphone caverphone28 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean31 = caverphone28.isCaverphoneEqual("AA11111111", "AA11111111");
        org.apache.commons.codec.language.Caverphone caverphone32 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean35 = caverphone32.isCaverphoneEqual("", "hi!");
        java.lang.String str37 = caverphone32.caverphone("hi!");
        java.lang.String str39 = caverphone32.caverphone("");
        org.apache.commons.codec.language.Caverphone caverphone40 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean43 = caverphone40.isCaverphoneEqual("", "hi!");
        java.lang.String str45 = caverphone40.caverphone("hi!");
        java.lang.String str47 = caverphone40.caverphone("AA11111111");
        java.lang.String str49 = caverphone40.encode("hi!");
        org.apache.commons.codec.language.Caverphone caverphone50 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str52 = caverphone50.encode("");
        java.lang.Object obj53 = caverphone40.encode((java.lang.Object) "");
        java.lang.Object obj54 = caverphone32.encode((java.lang.Object) "");
        boolean boolean57 = caverphone32.isCaverphoneEqual("1111111111", "AA11111111");
        java.lang.Object obj58 = caverphone28.encode((java.lang.Object) "AA11111111");
        boolean boolean61 = caverphone28.isCaverphoneEqual("AA11111111", "1111111111");
        boolean boolean64 = caverphone28.isCaverphoneEqual("1111111111", "");
        boolean boolean67 = caverphone28.isCaverphoneEqual("1111111111", "AA11111111");
        java.lang.String str69 = caverphone28.encode("");
        org.apache.commons.codec.language.Caverphone caverphone70 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str72 = caverphone70.encode("");
        java.lang.String str74 = caverphone70.encode("hi!");
        java.lang.String str76 = caverphone70.encode("");
        java.lang.Object obj77 = caverphone28.encode((java.lang.Object) str76);
        java.lang.Object obj78 = caverphone12.encode(obj77);
        java.lang.Object obj79 = caverphone0.encode(obj77);
        java.lang.String str81 = caverphone0.caverphone("AA11111111");
        java.lang.Class<?> wildcardClass82 = caverphone0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1111111111" + "'", str9, "1111111111");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1111111111" + "'", str11, "1111111111");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1111111111" + "'", str14, "1111111111");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "AA11111111" + "'", str16, "AA11111111");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1111111111" + "'", str18, "1111111111");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1111111111" + "'", str20, "1111111111");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "AA11111111" + "'", str22, "AA11111111");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1111111111" + "'", str24, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "AA11111111" + "'", str37, "AA11111111");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "1111111111" + "'", str39, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "AA11111111" + "'", str45, "AA11111111");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "AA11111111" + "'", str47, "AA11111111");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "AA11111111" + "'", str49, "AA11111111");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "1111111111" + "'", str52, "1111111111");
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + "1111111111" + "'", obj53, "1111111111");
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + "1111111111" + "'", obj54, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + "AA11111111" + "'", obj58, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "1111111111" + "'", str69, "1111111111");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "1111111111" + "'", str72, "1111111111");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "AA11111111" + "'", str74, "AA11111111");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "1111111111" + "'", str76, "1111111111");
        org.junit.Assert.assertEquals("'" + obj77 + "' != '" + "1111111111" + "'", obj77, "1111111111");
        org.junit.Assert.assertEquals("'" + obj78 + "' != '" + "1111111111" + "'", obj78, "1111111111");
        org.junit.Assert.assertEquals("'" + obj79 + "' != '" + "1111111111" + "'", obj79, "1111111111");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "AA11111111" + "'", str81, "AA11111111");
        org.junit.Assert.assertNotNull(wildcardClass82);
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "hi!");
        java.lang.String str5 = caverphone0.caverphone("hi!");
        java.lang.String str7 = caverphone0.encode("AA11111111");
        boolean boolean10 = caverphone0.isCaverphoneEqual("", "AA11111111");
        java.lang.String str12 = caverphone0.encode("AA11111111");
        java.lang.String str14 = caverphone0.encode("1111111111");
        java.lang.String str16 = caverphone0.caverphone("");
        java.lang.String str18 = caverphone0.encode("");
        org.apache.commons.codec.language.Caverphone caverphone19 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean22 = caverphone19.isCaverphoneEqual("", "hi!");
        java.lang.String str24 = caverphone19.caverphone("hi!");
        java.lang.String str26 = caverphone19.caverphone("");
        org.apache.commons.codec.language.Caverphone caverphone27 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean30 = caverphone27.isCaverphoneEqual("", "hi!");
        java.lang.String str32 = caverphone27.caverphone("hi!");
        java.lang.String str34 = caverphone27.caverphone("AA11111111");
        java.lang.String str36 = caverphone27.encode("hi!");
        org.apache.commons.codec.language.Caverphone caverphone37 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str39 = caverphone37.encode("");
        java.lang.Object obj40 = caverphone27.encode((java.lang.Object) "");
        java.lang.Object obj41 = caverphone19.encode((java.lang.Object) "");
        java.lang.String str43 = caverphone19.encode("");
        java.lang.String str45 = caverphone19.encode("hi!");
        boolean boolean48 = caverphone19.isCaverphoneEqual("hi!", "1111111111");
        java.lang.String str50 = caverphone19.caverphone("hi!");
        java.lang.String str52 = caverphone19.caverphone("1111111111");
        java.lang.String str54 = caverphone19.caverphone("1111111111");
        java.lang.String str56 = caverphone19.encode("hi!");
        java.lang.Object obj57 = caverphone0.encode((java.lang.Object) str56);
        boolean boolean60 = caverphone0.isCaverphoneEqual("hi!", "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "AA11111111" + "'", str12, "AA11111111");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1111111111" + "'", str14, "1111111111");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1111111111" + "'", str16, "1111111111");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1111111111" + "'", str18, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "AA11111111" + "'", str24, "AA11111111");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "1111111111" + "'", str26, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "AA11111111" + "'", str32, "AA11111111");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "AA11111111" + "'", str34, "AA11111111");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "AA11111111" + "'", str36, "AA11111111");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "1111111111" + "'", str39, "1111111111");
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + "1111111111" + "'", obj40, "1111111111");
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + "1111111111" + "'", obj41, "1111111111");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "1111111111" + "'", str43, "1111111111");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "AA11111111" + "'", str45, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "AA11111111" + "'", str50, "AA11111111");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "1111111111" + "'", str52, "1111111111");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "1111111111" + "'", str54, "1111111111");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "AA11111111" + "'", str56, "AA11111111");
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + "AA11111111" + "'", obj57, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
    }
}

