package org.apache.commons.lang.time;

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
        org.apache.commons.lang.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.lang.String str2 = fastDateFormat1.toString();
        java.util.TimeZone timeZone3 = fastDateFormat1.getTimeZone();
        java.util.TimeZone timeZone5 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone5);
        java.util.TimeZone timeZone7 = fastDateFormat6.getTimeZone();
        fastDateFormat6.init();
        boolean boolean9 = fastDateFormat1.equals((java.lang.Object) fastDateFormat6);
        java.util.TimeZone timeZone10 = fastDateFormat1.getTimeZone();
        java.lang.String str12 = fastDateFormat1.format((long) (byte) 100);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.lang.String str15 = fastDateFormat14.toString();
        java.util.Calendar calendar16 = null;
        java.lang.String str17 = fastDateFormat14.format(calendar16);
        java.util.Calendar calendar18 = null;
        java.lang.StringBuffer stringBuffer19 = null;
        java.lang.StringBuffer stringBuffer20 = fastDateFormat14.format(calendar18, stringBuffer19);
        boolean boolean21 = fastDateFormat1.equals((java.lang.Object) fastDateFormat14);
        java.lang.Object obj22 = fastDateFormat1.clone();
        java.lang.StringBuffer stringBuffer24 = null;
        java.lang.StringBuffer stringBuffer25 = fastDateFormat1.format((long) 'a', stringBuffer24);
        java.lang.String str26 = fastDateFormat1.toString();
        java.util.Locale locale27 = fastDateFormat1.getLocale();
        org.junit.Assert.assertNotNull(fastDateFormat1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "FastDateFormat[]" + "'", str2, "FastDateFormat[]");
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "FastDateFormat[]" + "'", str15, "FastDateFormat[]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(stringBuffer20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "FastDateFormat[]");
        org.junit.Assert.assertNull(stringBuffer25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "FastDateFormat[]" + "'", str26, "FastDateFormat[]");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "th_TH");
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.lang.String str7 = fastDateFormat6.toString();
        java.util.TimeZone timeZone8 = fastDateFormat6.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale12 = fastDateFormat11.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, locale12);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone8, locale12);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(1, timeZone8);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 zzzz", timeZone8);
        java.util.TimeZone timeZone24 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone24);
        java.util.TimeZone timeZone26 = fastDateFormat25.getTimeZone();
        java.util.Locale locale27 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat28 = new org.apache.commons.lang.time.FastDateFormat("", timeZone26, locale27);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone26);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale32 = fastDateFormat31.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat33 = new org.apache.commons.lang.time.FastDateFormat("", timeZone26, locale32);
        java.util.TimeZone timeZone35 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale41 = fastDateFormat40.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat42 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(0, (int) (short) 1, locale41);
        java.util.TimeZone timeZone44 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat45 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone44);
        java.util.TimeZone timeZone46 = fastDateFormat45.getTimeZone();
        boolean boolean47 = fastDateFormat42.equals((java.lang.Object) timeZone46);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat51 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale52 = fastDateFormat51.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat53 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(0, (int) (short) 1, locale52);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat54 = new org.apache.commons.lang.time.FastDateFormat("\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19", timeZone46, locale52);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat55 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e27\u0e31\u0e19\u0e1e\u0e24\u0e2b\u0e31\u0e2a\u0e1a\u0e14\u0e35\u0e17\u0e35\u0e48\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e04\u0e28. 70", timeZone35, locale52);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat56 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone26, locale52);
        java.lang.String str57 = org.apache.commons.lang.time.FastDateFormat.getTimeZoneDisplay(timeZone8, true, (int) (byte) 0, locale52);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat58 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(16, (int) (byte) 1, locale52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 16");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "FastDateFormat[]" + "'", str7, "FastDateFormat[]");
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertNotNull(fastDateFormat31);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat40);
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat42);
        org.junit.Assert.assertNotNull(fastDateFormat45);
        org.junit.Assert.assertNotNull(timeZone46);
        org.junit.Assert.assertEquals(timeZone46.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(fastDateFormat51);
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat53);
        org.junit.Assert.assertNotNull(fastDateFormat55);
        org.junit.Assert.assertNotNull(fastDateFormat56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "ICST" + "'", str57, "ICST");
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        java.util.TimeZone timeZone9 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone9);
        java.util.TimeZone timeZone11 = fastDateFormat10.getTimeZone();
        java.util.Locale locale12 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat13 = new org.apache.commons.lang.time.FastDateFormat("", timeZone11, locale12);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.lang.String str17 = fastDateFormat16.toString();
        java.util.TimeZone timeZone18 = fastDateFormat16.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale22 = fastDateFormat21.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, locale22);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone18, locale22);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone11, locale22);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21 70", locale22);
        java.util.TimeZone timeZone27 = fastDateFormat26.getTimeZone();
        java.util.TimeZone timeZone33 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone33);
        java.util.TimeZone timeZone35 = fastDateFormat34.getTimeZone();
        java.util.Locale locale36 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat37 = new org.apache.commons.lang.time.FastDateFormat("", timeZone35, locale36);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.lang.String str41 = fastDateFormat40.toString();
        java.util.TimeZone timeZone42 = fastDateFormat40.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat45 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale46 = fastDateFormat45.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat47 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, locale46);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat48 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone42, locale46);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat49 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone35, locale46);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat50 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21 70", locale46);
        java.util.TimeZone timeZone51 = fastDateFormat50.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat54 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale55 = fastDateFormat54.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat56 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, locale55);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat57 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e17\u0e35\u0e48 d MMMM GGGG y", timeZone51, locale55);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat58 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone27, locale55);
        java.util.TimeZone timeZone62 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat63 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone62);
        java.util.TimeZone timeZone64 = fastDateFormat63.getTimeZone();
        java.util.Locale locale65 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat66 = new org.apache.commons.lang.time.FastDateFormat("", timeZone64, locale65);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat69 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.lang.String str70 = fastDateFormat69.toString();
        java.util.TimeZone timeZone71 = fastDateFormat69.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat74 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale75 = fastDateFormat74.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat76 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, locale75);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat77 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone71, locale75);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat78 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone64, locale75);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat79 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone27, locale75);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat80 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e35\u0e17\u0e35\u0e48\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e04\u0e28. 70", timeZone27);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat81 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 0, (int) (byte) 0, timeZone27);
        java.lang.String str82 = fastDateFormat81.getPattern();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat84 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.lang.String str86 = fastDateFormat84.format((long) (byte) -1);
        fastDateFormat84.init();
        java.lang.Class<?> wildcardClass88 = fastDateFormat84.getClass();
        boolean boolean89 = fastDateFormat81.equals((java.lang.Object) wildcardClass88);
        java.lang.String str90 = fastDateFormat81.toString();
        java.util.Calendar calendar91 = null;
        java.lang.StringBuffer stringBuffer92 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer93 = fastDateFormat81.format(calendar91, stringBuffer92);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "FastDateFormat[]" + "'", str17, "FastDateFormat[]");
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat23);
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertNotNull(timeZone27);
        org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertNotNull(timeZone35);
        org.junit.Assert.assertEquals(timeZone35.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "FastDateFormat[]" + "'", str41, "FastDateFormat[]");
        org.junit.Assert.assertNotNull(timeZone42);
        org.junit.Assert.assertEquals(timeZone42.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat45);
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat47);
        org.junit.Assert.assertNotNull(fastDateFormat48);
        org.junit.Assert.assertNotNull(fastDateFormat49);
        org.junit.Assert.assertNotNull(fastDateFormat50);
        org.junit.Assert.assertNotNull(timeZone51);
        org.junit.Assert.assertEquals(timeZone51.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat54);
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat56);
        org.junit.Assert.assertNotNull(fastDateFormat57);
        org.junit.Assert.assertNotNull(fastDateFormat58);
        org.junit.Assert.assertNotNull(fastDateFormat63);
        org.junit.Assert.assertNotNull(timeZone64);
        org.junit.Assert.assertEquals(timeZone64.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "FastDateFormat[]" + "'", str70, "FastDateFormat[]");
        org.junit.Assert.assertNotNull(timeZone71);
        org.junit.Assert.assertEquals(timeZone71.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat74);
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat76);
        org.junit.Assert.assertNotNull(fastDateFormat77);
        org.junit.Assert.assertNotNull(fastDateFormat78);
        org.junit.Assert.assertNotNull(fastDateFormat79);
        org.junit.Assert.assertNotNull(fastDateFormat80);
        org.junit.Assert.assertNotNull(fastDateFormat81);
// flaky "1) test3003(org.apache.commons.lang.time.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str82 + "' != '" + "\u0e17\u0e35\u0e48\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 zzzz" + "'", str82, "\u0e17\u0e35\u0e48\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 zzzz");
        org.junit.Assert.assertNotNull(fastDateFormat84);
// flaky "1) test3003(org.apache.commons.lang.time.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str86 + "' != '" + "\u0e21\u0e04. 70" + "'", str86, "\u0e21\u0e04. 70");
        org.junit.Assert.assertNotNull(wildcardClass88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
// flaky "1) test3003(org.apache.commons.lang.time.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str90 + "' != '" + "\u0e17\u0e35\u0e48\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 zzzz]" + "'", str90, "\u0e17\u0e35\u0e48\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 zzzz]");
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        java.util.TimeZone timeZone8 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone8);
        java.util.TimeZone timeZone10 = fastDateFormat9.getTimeZone();
        java.util.Locale locale11 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat12 = new org.apache.commons.lang.time.FastDateFormat("", timeZone10, locale11);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone10);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(2, 3, timeZone10);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale22 = fastDateFormat21.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(0, (int) (short) 1, locale22);
        java.util.TimeZone timeZone25 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone25);
        java.util.TimeZone timeZone27 = fastDateFormat26.getTimeZone();
        boolean boolean28 = fastDateFormat23.equals((java.lang.Object) timeZone27);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale33 = fastDateFormat32.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(0, (int) (short) 1, locale33);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat35 = new org.apache.commons.lang.time.FastDateFormat("\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19", timeZone27, locale33);
        int int36 = fastDateFormat35.getMaxLengthEstimate();
        fastDateFormat35.init();
        java.util.TimeZone timeZone41 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat42 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone41);
        java.util.TimeZone timeZone43 = fastDateFormat42.getTimeZone();
        java.util.Locale locale44 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat45 = new org.apache.commons.lang.time.FastDateFormat("", timeZone43, locale44);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat48 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.lang.String str49 = fastDateFormat48.toString();
        java.util.TimeZone timeZone50 = fastDateFormat48.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat53 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale54 = fastDateFormat53.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat55 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, locale54);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat56 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone50, locale54);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat57 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone43, locale54);
        java.util.Calendar calendar58 = null;
        java.lang.StringBuffer stringBuffer59 = null;
        java.lang.StringBuffer stringBuffer60 = fastDateFormat57.applyRules(calendar58, stringBuffer59);
        boolean boolean61 = fastDateFormat35.equals((java.lang.Object) fastDateFormat57);
        java.lang.StringBuffer stringBuffer63 = null;
        java.lang.StringBuffer stringBuffer64 = fastDateFormat57.format((long) 'a', stringBuffer63);
        java.util.TimeZone timeZone65 = fastDateFormat57.getTimeZone();
        java.util.TimeZone timeZone68 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat69 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone68);
        java.util.TimeZone timeZone70 = fastDateFormat69.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat74 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale75 = fastDateFormat74.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat76 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(0, (int) (short) 1, locale75);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat77 = new org.apache.commons.lang.time.FastDateFormat("\u0e17\u0e35\u0e48 d MMMM GGGG y", timeZone70, locale75);
        java.util.Locale locale78 = fastDateFormat77.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat79 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21 70", timeZone65, locale78);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat84 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale85 = fastDateFormat84.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat86 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e17\u0e35\u0e48 d MMMM GGGG y", locale85);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat87 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, locale85);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat88 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(3, locale85);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat89 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 zzzz", timeZone65, locale85);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat90 = new org.apache.commons.lang.time.FastDateFormat("\u0e17\u0e35\u0e48\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 zzzz]", timeZone10, locale85);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat91 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(0, (int) (short) 0, locale85);
        java.util.Calendar calendar92 = null;
        java.lang.StringBuffer stringBuffer93 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer94 = fastDateFormat91.applyRules(calendar92, stringBuffer93);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat23);
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertNotNull(timeZone27);
        org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(fastDateFormat32);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(fastDateFormat42);
        org.junit.Assert.assertNotNull(timeZone43);
        org.junit.Assert.assertEquals(timeZone43.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "FastDateFormat[]" + "'", str49, "FastDateFormat[]");
        org.junit.Assert.assertNotNull(timeZone50);
        org.junit.Assert.assertEquals(timeZone50.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat53);
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat55);
        org.junit.Assert.assertNotNull(fastDateFormat56);
        org.junit.Assert.assertNotNull(fastDateFormat57);
        org.junit.Assert.assertNull(stringBuffer60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(stringBuffer64);
        org.junit.Assert.assertNotNull(timeZone65);
        org.junit.Assert.assertEquals(timeZone65.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat69);
        org.junit.Assert.assertNotNull(timeZone70);
        org.junit.Assert.assertEquals(timeZone70.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat74);
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat76);
        org.junit.Assert.assertNotNull(locale78);
        org.junit.Assert.assertEquals(locale78.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat79);
        org.junit.Assert.assertNotNull(fastDateFormat84);
        org.junit.Assert.assertNotNull(locale85);
        org.junit.Assert.assertEquals(locale85.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat86);
        org.junit.Assert.assertNotNull(fastDateFormat87);
        org.junit.Assert.assertNotNull(fastDateFormat88);
        org.junit.Assert.assertNotNull(fastDateFormat89);
        org.junit.Assert.assertNotNull(fastDateFormat91);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(1);
        fastDateFormat2.init();
        java.util.TimeZone timeZone4 = fastDateFormat2.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone4);
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat5);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        java.util.TimeZone timeZone7 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone7);
        java.util.TimeZone timeZone9 = fastDateFormat8.getTimeZone();
        java.util.Locale locale10 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat11 = new org.apache.commons.lang.time.FastDateFormat("", timeZone9, locale10);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.lang.String str15 = fastDateFormat14.toString();
        java.util.TimeZone timeZone16 = fastDateFormat14.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale20 = fastDateFormat19.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, locale20);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone16, locale20);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone9, locale20);
        java.util.TimeZone timeZone27 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat28 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone27);
        java.util.TimeZone timeZone29 = fastDateFormat28.getTimeZone();
        java.util.Locale locale30 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat31 = new org.apache.commons.lang.time.FastDateFormat("", timeZone29, locale30);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.lang.String str35 = fastDateFormat34.toString();
        java.util.TimeZone timeZone36 = fastDateFormat34.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat39 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale40 = fastDateFormat39.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat41 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, locale40);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat42 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone36, locale40);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat43 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone29, locale40);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat44 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e27\u0e31\u0e19\u0e1e\u0e24\u0e2b\u0e31\u0e2a\u0e1a\u0e14\u0e35\u0e17\u0e35\u0e48\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e04\u0e28. 70", timeZone9, locale40);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat45 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21 70 07:00:00", locale40);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat46 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale40);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat50 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.lang.String str51 = fastDateFormat50.toString();
        java.util.TimeZone timeZone52 = fastDateFormat50.getTimeZone();
        java.util.TimeZone timeZone56 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat60 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale61 = fastDateFormat60.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat62 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(0, (int) (short) 1, locale61);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat63 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone56, locale61);
        java.lang.String str64 = org.apache.commons.lang.time.FastDateFormat.getTimeZoneDisplay(timeZone52, false, (int) (byte) 1, locale61);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat65 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19", timeZone52);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat66 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19", timeZone52);
        java.util.TimeZone timeZone69 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat70 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone69);
        java.util.TimeZone timeZone71 = fastDateFormat70.getTimeZone();
        java.util.Locale locale72 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat73 = new org.apache.commons.lang.time.FastDateFormat("", timeZone71, locale72);
        int[] intArray76 = new int[] { 10 };
        java.lang.String str77 = fastDateFormat73.parseToken("FastDateFormat[]", intArray76);
        boolean boolean78 = fastDateFormat66.equals((java.lang.Object) intArray76);
        java.lang.String str79 = fastDateFormat66.toString();
        boolean boolean80 = fastDateFormat46.equals((java.lang.Object) fastDateFormat66);
        java.util.Calendar calendar81 = null;
        java.lang.String str82 = fastDateFormat46.format(calendar81);
        java.util.TimeZone timeZone83 = fastDateFormat46.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat84 = org.apache.commons.lang.time.FastDateFormat.getInstance("FastDateFormat[d/M/yy HH:mm]", timeZone83);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: t");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "FastDateFormat[]" + "'", str15, "FastDateFormat[]");
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(fastDateFormat23);
        org.junit.Assert.assertNotNull(fastDateFormat28);
        org.junit.Assert.assertNotNull(timeZone29);
        org.junit.Assert.assertEquals(timeZone29.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "FastDateFormat[]" + "'", str35, "FastDateFormat[]");
        org.junit.Assert.assertNotNull(timeZone36);
        org.junit.Assert.assertEquals(timeZone36.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat39);
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat41);
        org.junit.Assert.assertNotNull(fastDateFormat42);
        org.junit.Assert.assertNotNull(fastDateFormat43);
        org.junit.Assert.assertNotNull(fastDateFormat44);
        org.junit.Assert.assertNotNull(fastDateFormat45);
        org.junit.Assert.assertNotNull(fastDateFormat46);
        org.junit.Assert.assertNotNull(fastDateFormat50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "FastDateFormat[]" + "'", str51, "FastDateFormat[]");
        org.junit.Assert.assertNotNull(timeZone52);
        org.junit.Assert.assertEquals(timeZone52.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat60);
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat62);
        org.junit.Assert.assertNotNull(fastDateFormat63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19" + "'", str64, "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat65);
        org.junit.Assert.assertNotNull(fastDateFormat66);
        org.junit.Assert.assertNotNull(fastDateFormat70);
        org.junit.Assert.assertNotNull(timeZone71);
        org.junit.Assert.assertEquals(timeZone71.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertArrayEquals(intArray76, new int[] { 10 });
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "r" + "'", str77, "r");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
// flaky "2) test3006(org.apache.commons.lang.time.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str79 + "' != '" + "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19]" + "'", str79, "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19]");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertNotNull(timeZone83);
        org.junit.Assert.assertEquals(timeZone83.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone1);
        java.util.TimeZone timeZone3 = fastDateFormat2.getTimeZone();
        java.util.List list4 = fastDateFormat2.parsePattern();
        java.lang.String str5 = fastDateFormat2.getPattern();
        java.lang.String str7 = fastDateFormat2.format((long) 0);
        java.lang.Object obj8 = fastDateFormat2.clone();
        java.text.ParsePosition parsePosition10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = fastDateFormat2.parseObject("mm", parsePosition10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(list4);
// flaky "3) test3007(org.apache.commons.lang.time.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u0e17\u0e35\u0e48 d MMMM GGGG y" + "'", str5, "\u0e17\u0e35\u0e48 d MMMM GGGG y");
// flaky "2) test3007(org.apache.commons.lang.time.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u0e27\u0e31\u0e19\u0e1e\u0e24\u0e2b\u0e31\u0e2a\u0e1a\u0e14\u0e35\u0e17\u0e35\u0e48\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e04\u0e28. 70" + "'", str7, "\u0e27\u0e31\u0e19\u0e1e\u0e24\u0e2b\u0e31\u0e2a\u0e1a\u0e14\u0e35\u0e17\u0e35\u0e48\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e04\u0e28. 70");
        org.junit.Assert.assertNotNull(obj8);
// flaky "2) test3007(org.apache.commons.lang.time.RegressionTest6)":         org.junit.Assert.assertEquals(obj8.toString(), "\u0e17\u0e35\u0e48 d MMMM GGGG y]");
// flaky "1) test3007(org.apache.commons.lang.time.RegressionTest6)":         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "\u0e17\u0e35\u0e48 d MMMM GGGG y]");
// flaky "1) test3007(org.apache.commons.lang.time.RegressionTest6)":         org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "\u0e17\u0e35\u0e48 d MMMM GGGG y]");
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        java.util.TimeZone timeZone4 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone4);
        java.util.TimeZone timeZone6 = fastDateFormat5.getTimeZone();
        java.util.Locale locale7 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat8 = new org.apache.commons.lang.time.FastDateFormat("", timeZone6, locale7);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone6);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone6);
        boolean boolean11 = fastDateFormat10.getTimeZoneOverridesCalendar();
        boolean boolean12 = fastDateFormat10.getTimeZoneOverridesCalendar();
        org.junit.Assert.assertNotNull(fastDateFormat5);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 zzzz");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale9 = fastDateFormat8.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(0, (int) (short) 1, locale9);
        java.util.TimeZone timeZone12 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone12);
        java.util.TimeZone timeZone14 = fastDateFormat13.getTimeZone();
        boolean boolean15 = fastDateFormat10.equals((java.lang.Object) timeZone14);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale20 = fastDateFormat19.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(0, (int) (short) 1, locale20);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat22 = new org.apache.commons.lang.time.FastDateFormat("\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19", timeZone14, locale20);
        int int23 = fastDateFormat22.getMaxLengthEstimate();
        fastDateFormat22.init();
        java.util.TimeZone timeZone28 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone28);
        java.util.TimeZone timeZone30 = fastDateFormat29.getTimeZone();
        java.util.Locale locale31 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat32 = new org.apache.commons.lang.time.FastDateFormat("", timeZone30, locale31);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.lang.String str36 = fastDateFormat35.toString();
        java.util.TimeZone timeZone37 = fastDateFormat35.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale41 = fastDateFormat40.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat42 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, locale41);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat43 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone37, locale41);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat44 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone30, locale41);
        java.util.Calendar calendar45 = null;
        java.lang.StringBuffer stringBuffer46 = null;
        java.lang.StringBuffer stringBuffer47 = fastDateFormat44.applyRules(calendar45, stringBuffer46);
        boolean boolean48 = fastDateFormat22.equals((java.lang.Object) fastDateFormat44);
        java.util.TimeZone timeZone49 = fastDateFormat44.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat52 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.lang.String str53 = fastDateFormat52.toString();
        java.util.TimeZone timeZone54 = fastDateFormat52.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat57 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale58 = fastDateFormat57.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat59 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, locale58);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat60 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone54, locale58);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat61 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(3, 0, timeZone49, locale58);
        boolean boolean62 = fastDateFormat1.equals((java.lang.Object) locale58);
        int int63 = fastDateFormat1.getMaxLengthEstimate();
        java.lang.String str64 = fastDateFormat1.toString();
        org.junit.Assert.assertNotNull(fastDateFormat1);
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertNotNull(timeZone30);
        org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "FastDateFormat[]" + "'", str36, "FastDateFormat[]");
        org.junit.Assert.assertNotNull(timeZone37);
        org.junit.Assert.assertEquals(timeZone37.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat40);
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat42);
        org.junit.Assert.assertNotNull(fastDateFormat43);
        org.junit.Assert.assertNotNull(fastDateFormat44);
        org.junit.Assert.assertNull(stringBuffer47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(timeZone49);
        org.junit.Assert.assertEquals(timeZone49.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "FastDateFormat[]" + "'", str53, "FastDateFormat[]");
        org.junit.Assert.assertNotNull(timeZone54);
        org.junit.Assert.assertEquals(timeZone54.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat57);
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat59);
        org.junit.Assert.assertNotNull(fastDateFormat60);
        org.junit.Assert.assertNotNull(fastDateFormat61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
// flaky "4) test3009(org.apache.commons.lang.time.RegressionTest6)":         org.junit.Assert.assertTrue("'" + int63 + "' != '" + 70 + "'", int63 == 70);
// flaky "3) test3009(org.apache.commons.lang.time.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str64 + "' != '" + "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 zzzz]" + "'", str64, "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 zzzz]");
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.lang.String str9 = fastDateFormat8.toString();
        java.util.TimeZone timeZone10 = fastDateFormat8.getTimeZone();
        java.util.TimeZone timeZone14 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale19 = fastDateFormat18.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(0, (int) (short) 1, locale19);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone14, locale19);
        java.lang.String str22 = org.apache.commons.lang.time.FastDateFormat.getTimeZoneDisplay(timeZone10, false, (int) (byte) 1, locale19);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19", timeZone10);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19", timeZone10);
        java.util.TimeZone timeZone26 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale31 = fastDateFormat30.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(0, (int) (short) 1, locale31);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone26, locale31);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat34 = new org.apache.commons.lang.time.FastDateFormat("\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21 70", timeZone10, locale31);
        java.util.TimeZone timeZone36 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone36);
        java.util.TimeZone timeZone38 = fastDateFormat37.getTimeZone();
        fastDateFormat37.init();
        java.lang.String str41 = fastDateFormat37.format((long) (byte) 1);
        java.util.Locale locale42 = fastDateFormat37.getLocale();
        java.util.Locale locale43 = fastDateFormat37.getLocale();
        java.util.Locale locale44 = fastDateFormat37.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat45 = new org.apache.commons.lang.time.FastDateFormat("MMMM", timeZone10, locale44);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat52 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale53 = fastDateFormat52.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat54 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(0, (int) (short) 1, locale53);
        java.util.TimeZone timeZone56 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat57 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone56);
        java.util.TimeZone timeZone58 = fastDateFormat57.getTimeZone();
        boolean boolean59 = fastDateFormat54.equals((java.lang.Object) timeZone58);
        java.util.TimeZone timeZone61 = null;
        java.util.Locale locale62 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat63 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone61, locale62);
        int int64 = fastDateFormat63.getMaxLengthEstimate();
        java.util.Locale locale65 = fastDateFormat63.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat66 = org.apache.commons.lang.time.FastDateFormat.getInstance("HH", timeZone58, locale65);
        java.util.TimeZone timeZone70 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat71 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone70);
        java.util.TimeZone timeZone72 = fastDateFormat71.getTimeZone();
        java.util.Locale locale73 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat74 = new org.apache.commons.lang.time.FastDateFormat("", timeZone72, locale73);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat77 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.lang.String str78 = fastDateFormat77.toString();
        java.util.TimeZone timeZone79 = fastDateFormat77.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat82 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale83 = fastDateFormat82.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat84 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, locale83);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat85 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone79, locale83);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat86 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone72, locale83);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat87 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(2, 0, timeZone58, locale83);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat88 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(1, timeZone10, locale83);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat89 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e17\u0e35\u0e48\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e04\u0e28\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 ", timeZone10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat90 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(65, timeZone10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 65");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "FastDateFormat[]" + "'", str9, "FastDateFormat[]");
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19" + "'", str22, "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat23);
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNotNull(fastDateFormat30);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat32);
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertNotNull(timeZone38);
        org.junit.Assert.assertEquals(timeZone38.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
// flaky "5) test3010(org.apache.commons.lang.time.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\u0e27\u0e31\u0e19\u0e1e\u0e24\u0e2b\u0e31\u0e2a\u0e1a\u0e14\u0e35\u0e17\u0e35\u0e48\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e04\u0e28. 70" + "'", str41, "\u0e27\u0e31\u0e19\u0e1e\u0e24\u0e2b\u0e31\u0e2a\u0e1a\u0e14\u0e35\u0e17\u0e35\u0e48\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e04\u0e28. 70");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat52);
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat54);
        org.junit.Assert.assertNotNull(fastDateFormat57);
        org.junit.Assert.assertNotNull(timeZone58);
        org.junit.Assert.assertEquals(timeZone58.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(fastDateFormat63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 34 + "'", int64 == 34);
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat66);
        org.junit.Assert.assertNotNull(fastDateFormat71);
        org.junit.Assert.assertNotNull(timeZone72);
        org.junit.Assert.assertEquals(timeZone72.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat77);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "FastDateFormat[]" + "'", str78, "FastDateFormat[]");
        org.junit.Assert.assertNotNull(timeZone79);
        org.junit.Assert.assertEquals(timeZone79.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat82);
        org.junit.Assert.assertNotNull(locale83);
        org.junit.Assert.assertEquals(locale83.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat84);
        org.junit.Assert.assertNotNull(fastDateFormat85);
        org.junit.Assert.assertNotNull(fastDateFormat86);
        org.junit.Assert.assertNotNull(fastDateFormat87);
        org.junit.Assert.assertNotNull(fastDateFormat88);
        org.junit.Assert.assertNotNull(fastDateFormat89);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        java.util.TimeZone timeZone3 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone3);
        java.util.TimeZone timeZone5 = fastDateFormat4.getTimeZone();
        java.util.Locale locale6 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat7 = new org.apache.commons.lang.time.FastDateFormat("", timeZone5, locale6);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone5);
        java.util.TimeZone timeZone9 = fastDateFormat8.getTimeZone();
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.lang.String str5 = fastDateFormat4.toString();
        java.util.TimeZone timeZone6 = fastDateFormat4.getTimeZone();
        java.util.TimeZone timeZone10 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale15 = fastDateFormat14.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(0, (int) (short) 1, locale15);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone10, locale15);
        java.lang.String str18 = org.apache.commons.lang.time.FastDateFormat.getTimeZoneDisplay(timeZone6, false, (int) (byte) 1, locale15);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19", timeZone6);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19", timeZone6);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale24 = fastDateFormat23.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e17\u0e35\u0e48 d MMMM GGGG y", locale24);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(3, timeZone6, locale24);
        java.util.Locale locale27 = fastDateFormat26.getLocale();
        java.text.ParsePosition parsePosition29 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = fastDateFormat26.parseObject("FastDateFormat[y]", parsePosition29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FastDateFormat[]" + "'", str5, "FastDateFormat[]");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19" + "'", str18, "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(fastDateFormat23);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "th_TH");
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.lang.String str5 = fastDateFormat4.toString();
        java.util.TimeZone timeZone6 = fastDateFormat4.getTimeZone();
        java.util.TimeZone timeZone10 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale15 = fastDateFormat14.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(0, (int) (short) 1, locale15);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone10, locale15);
        java.lang.String str18 = org.apache.commons.lang.time.FastDateFormat.getTimeZoneDisplay(timeZone6, false, (int) (byte) 1, locale15);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19", timeZone6);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19", timeZone6);
        java.util.TimeZone timeZone22 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale27 = fastDateFormat26.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat28 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(0, (int) (short) 1, locale27);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone22, locale27);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat30 = new org.apache.commons.lang.time.FastDateFormat("\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21 70", timeZone6, locale27);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = fastDateFormat30.parseObject("\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FastDateFormat[]" + "'", str5, "FastDateFormat[]");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19" + "'", str18, "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat28);
        org.junit.Assert.assertNotNull(fastDateFormat29);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.lang.String str3 = fastDateFormat2.toString();
        java.util.TimeZone timeZone4 = fastDateFormat2.getTimeZone();
        java.util.TimeZone timeZone5 = fastDateFormat2.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.lang.String str10 = fastDateFormat9.toString();
        java.util.TimeZone timeZone11 = fastDateFormat9.getTimeZone();
        java.util.TimeZone timeZone15 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale20 = fastDateFormat19.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(0, (int) (short) 1, locale20);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone15, locale20);
        java.lang.String str23 = org.apache.commons.lang.time.FastDateFormat.getTimeZoneDisplay(timeZone11, false, (int) (byte) 1, locale20);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19", timeZone11);
        java.util.TimeZone timeZone32 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone32);
        java.util.TimeZone timeZone34 = fastDateFormat33.getTimeZone();
        java.util.Locale locale35 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat36 = new org.apache.commons.lang.time.FastDateFormat("", timeZone34, locale35);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat39 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.lang.String str40 = fastDateFormat39.toString();
        java.util.TimeZone timeZone41 = fastDateFormat39.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat44 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale45 = fastDateFormat44.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat46 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, locale45);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat47 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone41, locale45);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat48 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone34, locale45);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat49 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21 70", locale45);
        java.util.TimeZone timeZone50 = fastDateFormat49.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat53 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale54 = fastDateFormat53.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat55 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, locale54);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat56 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e17\u0e35\u0e48 d MMMM GGGG y", timeZone50, locale54);
        java.lang.String str57 = org.apache.commons.lang.time.FastDateFormat.getTimeZoneDisplay(timeZone11, false, 0, locale54);
        java.util.TimeZone timeZone59 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat60 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone59);
        java.util.TimeZone timeZone61 = fastDateFormat60.getTimeZone();
        java.util.List list62 = fastDateFormat60.parsePattern();
        int[] intArray70 = new int[] { 10, (short) 10, '#', 34, 2, (byte) 1 };
        java.lang.String str71 = fastDateFormat60.parseToken("FastDateFormat[]", intArray70);
        java.util.Locale locale72 = fastDateFormat60.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat73 = new org.apache.commons.lang.time.FastDateFormat("\u0e35\u0e17\u0e35\u0e48\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e04\u0e28. 70", timeZone11, locale72);
        java.util.Locale locale74 = fastDateFormat73.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat75 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 10, timeZone5, locale74);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "FastDateFormat[]" + "'", str3, "FastDateFormat[]");
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "FastDateFormat[]" + "'", str10, "FastDateFormat[]");
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19" + "'", str23, "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNotNull(timeZone34);
        org.junit.Assert.assertEquals(timeZone34.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "FastDateFormat[]" + "'", str40, "FastDateFormat[]");
        org.junit.Assert.assertNotNull(timeZone41);
        org.junit.Assert.assertEquals(timeZone41.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat44);
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat46);
        org.junit.Assert.assertNotNull(fastDateFormat47);
        org.junit.Assert.assertNotNull(fastDateFormat48);
        org.junit.Assert.assertNotNull(fastDateFormat49);
        org.junit.Assert.assertNotNull(timeZone50);
        org.junit.Assert.assertEquals(timeZone50.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat53);
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat55);
        org.junit.Assert.assertNotNull(fastDateFormat56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "ICT" + "'", str57, "ICT");
        org.junit.Assert.assertNotNull(fastDateFormat60);
        org.junit.Assert.assertNotNull(timeZone61);
        org.junit.Assert.assertEquals(timeZone61.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(list62);
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertArrayEquals(intArray70, new int[] { 10, 10, 35, 34, 2, 1 });
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "r" + "'", str71, "r");
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale74);
        org.junit.Assert.assertEquals(locale74.toString(), "th_TH");
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.lang.String str5 = fastDateFormat4.toString();
        java.util.TimeZone timeZone6 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale12 = fastDateFormat11.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(0, (int) (short) 1, locale12);
        java.util.TimeZone timeZone15 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone15);
        java.util.TimeZone timeZone17 = fastDateFormat16.getTimeZone();
        boolean boolean18 = fastDateFormat13.equals((java.lang.Object) timeZone17);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.lang.String str21 = fastDateFormat20.toString();
        java.util.TimeZone timeZone22 = fastDateFormat20.getTimeZone();
        java.util.TimeZone timeZone26 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale31 = fastDateFormat30.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(0, (int) (short) 1, locale31);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone26, locale31);
        java.lang.String str34 = org.apache.commons.lang.time.FastDateFormat.getTimeZoneDisplay(timeZone22, false, (int) (byte) 1, locale31);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e17\u0e35\u0e48 d MMMM GGGG y", timeZone17, locale31);
        java.util.Locale locale36 = fastDateFormat35.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19", timeZone6, locale36);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat38 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e32\u0e04\u0e21\u0e04\u0e28. 70", timeZone6);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat39 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21 70", timeZone6);
        java.util.Date date40 = null;
        java.lang.StringBuffer stringBuffer41 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer42 = fastDateFormat39.format(date40, stringBuffer41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FastDateFormat[]" + "'", str5, "FastDateFormat[]");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "FastDateFormat[]" + "'", str21, "FastDateFormat[]");
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat30);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat32);
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19" + "'", str34, "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat35);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertNotNull(fastDateFormat38);
        org.junit.Assert.assertNotNull(fastDateFormat39);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.lang.String str4 = fastDateFormat3.toString();
        java.util.TimeZone timeZone5 = fastDateFormat3.getTimeZone();
        java.util.TimeZone timeZone9 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale14 = fastDateFormat13.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(0, (int) (short) 1, locale14);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone9, locale14);
        java.lang.String str17 = org.apache.commons.lang.time.FastDateFormat.getTimeZoneDisplay(timeZone5, false, (int) (byte) 1, locale14);
        java.util.TimeZone timeZone23 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone23);
        java.util.TimeZone timeZone25 = fastDateFormat24.getTimeZone();
        java.util.Locale locale26 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat27 = new org.apache.commons.lang.time.FastDateFormat("", timeZone25, locale26);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat28 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone25);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone25);
        java.lang.String str31 = fastDateFormat29.format((long) (short) 1);
        java.util.TimeZone timeZone32 = fastDateFormat29.getTimeZone();
        java.util.TimeZone timeZone34 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat39 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale40 = fastDateFormat39.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat41 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(0, (int) (short) 1, locale40);
        java.util.TimeZone timeZone43 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat44 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone43);
        java.util.TimeZone timeZone45 = fastDateFormat44.getTimeZone();
        boolean boolean46 = fastDateFormat41.equals((java.lang.Object) timeZone45);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat50 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale51 = fastDateFormat50.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat52 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(0, (int) (short) 1, locale51);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat53 = new org.apache.commons.lang.time.FastDateFormat("\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19", timeZone45, locale51);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat54 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e27\u0e31\u0e19\u0e1e\u0e24\u0e2b\u0e31\u0e2a\u0e1a\u0e14\u0e35\u0e17\u0e35\u0e48\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e04\u0e28. 70", timeZone34, locale51);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat55 = new org.apache.commons.lang.time.FastDateFormat("\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19", timeZone32, locale51);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat56 = new org.apache.commons.lang.time.FastDateFormat("ICST", timeZone5, locale51);
        java.util.TimeZone timeZone60 = null;
        java.util.Locale locale61 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat62 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone60, locale61);
        int int63 = fastDateFormat62.getMaxLengthEstimate();
        int int64 = fastDateFormat62.getMaxLengthEstimate();
        boolean boolean65 = fastDateFormat62.getTimeZoneOverridesCalendar();
        java.util.Locale locale66 = fastDateFormat62.getLocale();
        java.lang.String str67 = org.apache.commons.lang.time.FastDateFormat.getTimeZoneDisplay(timeZone5, true, (int) (short) 0, locale66);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat70 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(1, 2);
        java.lang.String str72 = fastDateFormat70.format((long) (byte) 0);
        java.lang.Object obj73 = fastDateFormat70.clone();
        int[] intArray77 = new int[] { 8, (byte) 1 };
        java.lang.String str78 = fastDateFormat70.parseToken("FastDateFormat[HH]", intArray77);
        java.util.Locale locale79 = fastDateFormat70.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat80 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(11, timeZone5, locale79);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 11");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "FastDateFormat[]" + "'", str4, "FastDateFormat[]");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19" + "'", str17, "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat28);
        org.junit.Assert.assertNotNull(fastDateFormat29);
// flaky "6) test3016(org.apache.commons.lang.time.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19" + "'", str31, "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone32);
        org.junit.Assert.assertEquals(timeZone32.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat39);
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat41);
        org.junit.Assert.assertNotNull(fastDateFormat44);
        org.junit.Assert.assertNotNull(timeZone45);
        org.junit.Assert.assertEquals(timeZone45.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(fastDateFormat50);
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat52);
        org.junit.Assert.assertNotNull(fastDateFormat54);
        org.junit.Assert.assertNotNull(fastDateFormat62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 34 + "'", int63 == 34);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 34 + "'", int64 == 34);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "ICST" + "'", str67, "ICST");
        org.junit.Assert.assertNotNull(fastDateFormat70);
// flaky "4) test3016(org.apache.commons.lang.time.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str72 + "' != '" + "\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21 70 07:00:00" + "'", str72, "\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21 70 07:00:00");
        org.junit.Assert.assertNotNull(obj73);
        org.junit.Assert.assertEquals(obj73.toString(), "FastDateFormat[d MMMM y HH:mm:ss]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj73), "FastDateFormat[d MMMM y HH:mm:ss]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj73), "FastDateFormat[d MMMM y HH:mm:ss]");
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertArrayEquals(intArray77, new int[] { 8, 1 });
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "F" + "'", str78, "F");
        org.junit.Assert.assertNotNull(locale79);
        org.junit.Assert.assertEquals(locale79.toString(), "th_TH");
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale5 = fastDateFormat4.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(0, (int) (short) 1, locale5);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang.time.FastDateFormat.getInstance("07", locale5);
        java.util.Date date8 = null;
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer10 = fastDateFormat7.format(date8, stringBuffer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(fastDateFormat7);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        java.util.TimeZone timeZone8 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone8);
        java.util.TimeZone timeZone10 = fastDateFormat9.getTimeZone();
        java.util.Locale locale11 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat12 = new org.apache.commons.lang.time.FastDateFormat("", timeZone10, locale11);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone10);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(2, 3, timeZone10);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.lang.String str20 = fastDateFormat19.toString();
        java.util.TimeZone timeZone21 = fastDateFormat19.getTimeZone();
        java.util.TimeZone timeZone25 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale30 = fastDateFormat29.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(0, (int) (short) 1, locale30);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone25, locale30);
        java.lang.String str33 = org.apache.commons.lang.time.FastDateFormat.getTimeZoneDisplay(timeZone21, false, (int) (byte) 1, locale30);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19", timeZone21);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19", timeZone21);
        java.util.TimeZone timeZone38 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat39 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone38);
        java.util.TimeZone timeZone40 = fastDateFormat39.getTimeZone();
        java.util.Locale locale41 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat42 = new org.apache.commons.lang.time.FastDateFormat("", timeZone40, locale41);
        java.util.Locale locale43 = fastDateFormat42.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat44 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e35\u0e17\u0e35\u0e48\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e04\u0e28. 70", timeZone21, locale43);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat45 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone10, locale43);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat49 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.lang.String str50 = fastDateFormat49.toString();
        java.util.TimeZone timeZone51 = fastDateFormat49.getTimeZone();
        java.util.TimeZone timeZone55 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat59 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale60 = fastDateFormat59.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat61 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(0, (int) (short) 1, locale60);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat62 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone55, locale60);
        java.lang.String str63 = org.apache.commons.lang.time.FastDateFormat.getTimeZoneDisplay(timeZone51, false, (int) (byte) 1, locale60);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat64 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19", timeZone51);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat65 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19", timeZone51);
        boolean boolean66 = fastDateFormat45.equals((java.lang.Object) "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        java.util.Calendar calendar67 = null;
        java.lang.StringBuffer stringBuffer68 = null;
        java.lang.StringBuffer stringBuffer69 = fastDateFormat45.applyRules(calendar67, stringBuffer68);
        int int70 = fastDateFormat45.getMaxLengthEstimate();
        java.util.List list71 = fastDateFormat45.parsePattern();
        int int72 = fastDateFormat45.getMaxLengthEstimate();
        java.lang.StringBuffer stringBuffer73 = null;
        java.text.FieldPosition fieldPosition74 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer75 = fastDateFormat1.format((java.lang.Object) int72, stringBuffer73, fieldPosition74);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat1);
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "FastDateFormat[]" + "'", str20, "FastDateFormat[]");
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat31);
        org.junit.Assert.assertNotNull(fastDateFormat32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19" + "'", str33, "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertNotNull(fastDateFormat35);
        org.junit.Assert.assertNotNull(fastDateFormat39);
        org.junit.Assert.assertNotNull(timeZone40);
        org.junit.Assert.assertEquals(timeZone40.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat44);
        org.junit.Assert.assertNotNull(fastDateFormat45);
        org.junit.Assert.assertNotNull(fastDateFormat49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "FastDateFormat[]" + "'", str50, "FastDateFormat[]");
        org.junit.Assert.assertNotNull(timeZone51);
        org.junit.Assert.assertEquals(timeZone51.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat59);
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat61);
        org.junit.Assert.assertNotNull(fastDateFormat62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19" + "'", str63, "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat64);
        org.junit.Assert.assertNotNull(fastDateFormat65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNull(stringBuffer69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(list71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale4 = fastDateFormat3.getLocale();
        java.util.Calendar calendar5 = null;
        java.lang.StringBuffer stringBuffer6 = null;
        java.lang.StringBuffer stringBuffer7 = fastDateFormat3.applyRules(calendar5, stringBuffer6);
        java.util.Calendar calendar8 = null;
        java.lang.StringBuffer stringBuffer9 = null;
        java.lang.StringBuffer stringBuffer10 = fastDateFormat3.applyRules(calendar8, stringBuffer9);
        java.lang.StringBuffer stringBuffer12 = null;
        java.lang.StringBuffer stringBuffer13 = fastDateFormat3.format((long) (byte) 0, stringBuffer12);
        java.util.TimeZone timeZone14 = fastDateFormat3.getTimeZone();
        java.util.TimeZone timeZone17 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone17);
        java.util.TimeZone timeZone19 = fastDateFormat18.getTimeZone();
        java.util.List list20 = fastDateFormat18.parsePattern();
        java.lang.String str21 = fastDateFormat18.getPattern();
        java.lang.String str22 = fastDateFormat18.getPattern();
        java.util.TimeZone timeZone23 = fastDateFormat18.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e04\u0e28. 70");
        java.util.Locale locale26 = fastDateFormat25.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21 70", timeZone23, locale26);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat28 = org.apache.commons.lang.time.FastDateFormat.getInstance("HH:mm", timeZone14, locale26);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale36 = fastDateFormat35.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(0, (int) (short) 1, locale36);
        java.util.TimeZone timeZone39 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone39);
        java.util.TimeZone timeZone41 = fastDateFormat40.getTimeZone();
        boolean boolean42 = fastDateFormat37.equals((java.lang.Object) timeZone41);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat46 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale47 = fastDateFormat46.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat48 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(0, (int) (short) 1, locale47);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat49 = new org.apache.commons.lang.time.FastDateFormat("\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19", timeZone41, locale47);
        int int50 = fastDateFormat49.getMaxLengthEstimate();
        fastDateFormat49.init();
        java.util.TimeZone timeZone55 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat56 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone55);
        java.util.TimeZone timeZone57 = fastDateFormat56.getTimeZone();
        java.util.Locale locale58 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat59 = new org.apache.commons.lang.time.FastDateFormat("", timeZone57, locale58);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat62 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.lang.String str63 = fastDateFormat62.toString();
        java.util.TimeZone timeZone64 = fastDateFormat62.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat67 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale68 = fastDateFormat67.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat69 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, locale68);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat70 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone64, locale68);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat71 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone57, locale68);
        java.util.Calendar calendar72 = null;
        java.lang.StringBuffer stringBuffer73 = null;
        java.lang.StringBuffer stringBuffer74 = fastDateFormat71.applyRules(calendar72, stringBuffer73);
        boolean boolean75 = fastDateFormat49.equals((java.lang.Object) fastDateFormat71);
        java.util.TimeZone timeZone76 = fastDateFormat71.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat79 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.lang.String str80 = fastDateFormat79.toString();
        java.util.TimeZone timeZone81 = fastDateFormat79.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat84 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale85 = fastDateFormat84.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat86 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, locale85);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat87 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone81, locale85);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat88 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(3, 0, timeZone76, locale85);
        java.lang.Object obj89 = fastDateFormat88.clone();
        java.util.Locale locale90 = fastDateFormat88.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat91 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((-1), timeZone14, locale90);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertNull(stringBuffer7);
        org.junit.Assert.assertNull(stringBuffer10);
        org.junit.Assert.assertNull(stringBuffer13);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(list20);
// flaky "7) test3019(org.apache.commons.lang.time.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\u0e17\u0e35\u0e48 d MMMM GGGG y" + "'", str21, "\u0e17\u0e35\u0e48 d MMMM GGGG y");
// flaky "5) test3019(org.apache.commons.lang.time.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\u0e17\u0e35\u0e48 d MMMM GGGG y" + "'", str22, "\u0e17\u0e35\u0e48 d MMMM GGGG y");
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertNotNull(fastDateFormat28);
        org.junit.Assert.assertNotNull(fastDateFormat35);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertNotNull(fastDateFormat40);
        org.junit.Assert.assertNotNull(timeZone41);
        org.junit.Assert.assertEquals(timeZone41.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(fastDateFormat46);
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(fastDateFormat56);
        org.junit.Assert.assertNotNull(timeZone57);
        org.junit.Assert.assertEquals(timeZone57.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "FastDateFormat[]" + "'", str63, "FastDateFormat[]");
        org.junit.Assert.assertNotNull(timeZone64);
        org.junit.Assert.assertEquals(timeZone64.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat67);
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat69);
        org.junit.Assert.assertNotNull(fastDateFormat70);
        org.junit.Assert.assertNotNull(fastDateFormat71);
        org.junit.Assert.assertNull(stringBuffer74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(timeZone76);
        org.junit.Assert.assertEquals(timeZone76.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat79);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "FastDateFormat[]" + "'", str80, "FastDateFormat[]");
        org.junit.Assert.assertNotNull(timeZone81);
        org.junit.Assert.assertEquals(timeZone81.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat84);
        org.junit.Assert.assertNotNull(locale85);
        org.junit.Assert.assertEquals(locale85.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat86);
        org.junit.Assert.assertNotNull(fastDateFormat87);
        org.junit.Assert.assertNotNull(fastDateFormat88);
        org.junit.Assert.assertNotNull(obj89);
// flaky "3) test3019(org.apache.commons.lang.time.RegressionTest6)":         org.junit.Assert.assertEquals(obj89.toString(), "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 zzzz]");
// flaky "2) test3019(org.apache.commons.lang.time.RegressionTest6)":         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj89), "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 zzzz]");
// flaky "2) test3019(org.apache.commons.lang.time.RegressionTest6)":         org.junit.Assert.assertEquals(java.util.Objects.toString(obj89), "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 zzzz]");
        org.junit.Assert.assertNotNull(locale90);
        org.junit.Assert.assertEquals(locale90.toString(), "th_TH");
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        java.util.TimeZone timeZone8 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone8);
        java.util.TimeZone timeZone10 = fastDateFormat9.getTimeZone();
        java.util.Locale locale11 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat12 = new org.apache.commons.lang.time.FastDateFormat("", timeZone10, locale11);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone10);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone10);
        java.lang.String str16 = fastDateFormat14.format((long) (short) 1);
        java.util.TimeZone timeZone17 = fastDateFormat14.getTimeZone();
        java.util.TimeZone timeZone19 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale25 = fastDateFormat24.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(0, (int) (short) 1, locale25);
        java.util.TimeZone timeZone28 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone28);
        java.util.TimeZone timeZone30 = fastDateFormat29.getTimeZone();
        boolean boolean31 = fastDateFormat26.equals((java.lang.Object) timeZone30);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale36 = fastDateFormat35.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(0, (int) (short) 1, locale36);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat38 = new org.apache.commons.lang.time.FastDateFormat("\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19", timeZone30, locale36);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat39 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e27\u0e31\u0e19\u0e1e\u0e24\u0e2b\u0e31\u0e2a\u0e1a\u0e14\u0e35\u0e17\u0e35\u0e48\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e04\u0e28. 70", timeZone19, locale36);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat40 = new org.apache.commons.lang.time.FastDateFormat("\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19", timeZone17, locale36);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat41 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(2, 0, timeZone17);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat44 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale45 = fastDateFormat44.getLocale();
        java.util.Calendar calendar46 = null;
        java.lang.StringBuffer stringBuffer47 = null;
        java.lang.StringBuffer stringBuffer48 = fastDateFormat44.applyRules(calendar46, stringBuffer47);
        java.util.Calendar calendar49 = null;
        java.lang.StringBuffer stringBuffer50 = null;
        java.lang.StringBuffer stringBuffer51 = fastDateFormat44.applyRules(calendar49, stringBuffer50);
        java.lang.StringBuffer stringBuffer53 = null;
        java.lang.StringBuffer stringBuffer54 = fastDateFormat44.format((long) (byte) 0, stringBuffer53);
        java.util.TimeZone timeZone55 = fastDateFormat44.getTimeZone();
        java.util.TimeZone timeZone58 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat59 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone58);
        java.util.TimeZone timeZone60 = fastDateFormat59.getTimeZone();
        java.util.List list61 = fastDateFormat59.parsePattern();
        java.lang.String str62 = fastDateFormat59.getPattern();
        java.lang.String str63 = fastDateFormat59.getPattern();
        java.util.TimeZone timeZone64 = fastDateFormat59.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat66 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e04\u0e28. 70");
        java.util.Locale locale67 = fastDateFormat66.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat68 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21 70", timeZone64, locale67);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat69 = org.apache.commons.lang.time.FastDateFormat.getInstance("HH:mm", timeZone55, locale67);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat70 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(16, timeZone17, locale67);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 16");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(fastDateFormat14);
// flaky "8) test3020(org.apache.commons.lang.time.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19" + "'", str16, "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertNotNull(timeZone30);
        org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(fastDateFormat35);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertNotNull(fastDateFormat39);
        org.junit.Assert.assertNotNull(fastDateFormat41);
        org.junit.Assert.assertNotNull(fastDateFormat44);
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "th_TH");
        org.junit.Assert.assertNull(stringBuffer48);
        org.junit.Assert.assertNull(stringBuffer51);
        org.junit.Assert.assertNull(stringBuffer54);
        org.junit.Assert.assertNotNull(timeZone55);
        org.junit.Assert.assertEquals(timeZone55.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat59);
        org.junit.Assert.assertNotNull(timeZone60);
        org.junit.Assert.assertEquals(timeZone60.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(list61);
// flaky "6) test3020(org.apache.commons.lang.time.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str62 + "' != '" + "\u0e17\u0e35\u0e48 d MMMM GGGG y" + "'", str62, "\u0e17\u0e35\u0e48 d MMMM GGGG y");
// flaky "4) test3020(org.apache.commons.lang.time.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str63 + "' != '" + "\u0e17\u0e35\u0e48 d MMMM GGGG y" + "'", str63, "\u0e17\u0e35\u0e48 d MMMM GGGG y");
        org.junit.Assert.assertNotNull(timeZone64);
        org.junit.Assert.assertEquals(timeZone64.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat66);
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat68);
        org.junit.Assert.assertNotNull(fastDateFormat69);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.lang.String str4 = fastDateFormat3.toString();
        java.util.TimeZone timeZone5 = fastDateFormat3.getTimeZone();
        java.util.TimeZone timeZone6 = fastDateFormat3.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang.time.FastDateFormat.getInstance("FastDateFormat[]", timeZone6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: t");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "FastDateFormat[]" + "'", str4, "FastDateFormat[]");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat7);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        java.util.TimeZone timeZone5 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone5);
        java.util.TimeZone timeZone7 = fastDateFormat6.getTimeZone();
        java.util.Locale locale8 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat9 = new org.apache.commons.lang.time.FastDateFormat("", timeZone7, locale8);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.lang.String str13 = fastDateFormat12.toString();
        java.util.TimeZone timeZone14 = fastDateFormat12.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale18 = fastDateFormat17.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, locale18);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone14, locale18);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone7, locale18);
        java.util.TimeZone timeZone25 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone25);
        java.util.TimeZone timeZone27 = fastDateFormat26.getTimeZone();
        java.util.Locale locale28 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat29 = new org.apache.commons.lang.time.FastDateFormat("", timeZone27, locale28);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.lang.String str33 = fastDateFormat32.toString();
        java.util.TimeZone timeZone34 = fastDateFormat32.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale38 = fastDateFormat37.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat39 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, locale38);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone34, locale38);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat41 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone27, locale38);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat42 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e27\u0e31\u0e19\u0e1e\u0e24\u0e2b\u0e31\u0e2a\u0e1a\u0e14\u0e35\u0e17\u0e35\u0e48\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e04\u0e28. 70", timeZone7, locale38);
        fastDateFormat42.init();
        java.util.TimeZone timeZone44 = fastDateFormat42.getTimeZone();
        java.util.TimeZone timeZone50 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat51 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone50);
        java.util.TimeZone timeZone52 = fastDateFormat51.getTimeZone();
        java.util.Locale locale53 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat54 = new org.apache.commons.lang.time.FastDateFormat("", timeZone52, locale53);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat55 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone52);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat56 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(2, timeZone52);
        java.util.TimeZone timeZone60 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat61 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone60);
        java.util.TimeZone timeZone62 = fastDateFormat61.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat63 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone62);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat65 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.lang.String str66 = fastDateFormat65.toString();
        java.util.TimeZone timeZone67 = fastDateFormat65.getTimeZone();
        java.util.TimeZone timeZone71 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat75 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale76 = fastDateFormat75.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat77 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(0, (int) (short) 1, locale76);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat78 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone71, locale76);
        java.lang.String str79 = org.apache.commons.lang.time.FastDateFormat.getTimeZoneDisplay(timeZone67, false, (int) (byte) 1, locale76);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat80 = new org.apache.commons.lang.time.FastDateFormat("HH:mm", timeZone62, locale76);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat81 = new org.apache.commons.lang.time.FastDateFormat("a", timeZone52, locale76);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat82 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone44, locale76);
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "FastDateFormat[]" + "'", str13, "FastDateFormat[]");
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertNotNull(timeZone27);
        org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "FastDateFormat[]" + "'", str33, "FastDateFormat[]");
        org.junit.Assert.assertNotNull(timeZone34);
        org.junit.Assert.assertEquals(timeZone34.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat39);
        org.junit.Assert.assertNotNull(fastDateFormat40);
        org.junit.Assert.assertNotNull(fastDateFormat41);
        org.junit.Assert.assertNotNull(fastDateFormat42);
        org.junit.Assert.assertNotNull(timeZone44);
        org.junit.Assert.assertEquals(timeZone44.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat51);
        org.junit.Assert.assertNotNull(timeZone52);
        org.junit.Assert.assertEquals(timeZone52.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat55);
        org.junit.Assert.assertNotNull(fastDateFormat56);
        org.junit.Assert.assertNotNull(fastDateFormat61);
        org.junit.Assert.assertNotNull(timeZone62);
        org.junit.Assert.assertEquals(timeZone62.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat63);
        org.junit.Assert.assertNotNull(fastDateFormat65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "FastDateFormat[]" + "'", str66, "FastDateFormat[]");
        org.junit.Assert.assertNotNull(timeZone67);
        org.junit.Assert.assertEquals(timeZone67.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat75);
        org.junit.Assert.assertNotNull(locale76);
        org.junit.Assert.assertEquals(locale76.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat77);
        org.junit.Assert.assertNotNull(fastDateFormat78);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19" + "'", str79, "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat82);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        java.util.TimeZone timeZone6 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone6);
        java.util.TimeZone timeZone8 = fastDateFormat7.getTimeZone();
        java.util.Locale locale9 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat10 = new org.apache.commons.lang.time.FastDateFormat("", timeZone8, locale9);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone8);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone8);
        java.lang.String str14 = fastDateFormat12.format((long) (short) 1);
        java.util.TimeZone timeZone15 = fastDateFormat12.getTimeZone();
        java.util.TimeZone timeZone21 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone21);
        java.util.TimeZone timeZone23 = fastDateFormat22.getTimeZone();
        java.util.Locale locale24 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat25 = new org.apache.commons.lang.time.FastDateFormat("", timeZone23, locale24);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat28 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.lang.String str29 = fastDateFormat28.toString();
        java.util.TimeZone timeZone30 = fastDateFormat28.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale34 = fastDateFormat33.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, locale34);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone30, locale34);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone23, locale34);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat38 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21 70", locale34);
        java.util.TimeZone timeZone39 = fastDateFormat38.getTimeZone();
        java.util.TimeZone timeZone45 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat46 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone45);
        java.util.TimeZone timeZone47 = fastDateFormat46.getTimeZone();
        java.util.Locale locale48 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat49 = new org.apache.commons.lang.time.FastDateFormat("", timeZone47, locale48);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat52 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.lang.String str53 = fastDateFormat52.toString();
        java.util.TimeZone timeZone54 = fastDateFormat52.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat57 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale58 = fastDateFormat57.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat59 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, locale58);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat60 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone54, locale58);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat61 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone47, locale58);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat62 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21 70", locale58);
        java.util.TimeZone timeZone63 = fastDateFormat62.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat66 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale67 = fastDateFormat66.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat68 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, locale67);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat69 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e17\u0e35\u0e48 d MMMM GGGG y", timeZone63, locale67);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat70 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone39, locale67);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat71 = new org.apache.commons.lang.time.FastDateFormat("\u0e35\u0e17\u0e35\u0e48\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e04\u0e28. 70", timeZone15, locale67);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat72 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 1, timeZone15);
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(fastDateFormat12);
// flaky "9) test3023(org.apache.commons.lang.time.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19" + "'", str14, "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "FastDateFormat[]" + "'", str29, "FastDateFormat[]");
        org.junit.Assert.assertNotNull(timeZone30);
        org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat35);
        org.junit.Assert.assertNotNull(fastDateFormat36);
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertNotNull(fastDateFormat38);
        org.junit.Assert.assertNotNull(timeZone39);
        org.junit.Assert.assertEquals(timeZone39.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat46);
        org.junit.Assert.assertNotNull(timeZone47);
        org.junit.Assert.assertEquals(timeZone47.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "FastDateFormat[]" + "'", str53, "FastDateFormat[]");
        org.junit.Assert.assertNotNull(timeZone54);
        org.junit.Assert.assertEquals(timeZone54.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat57);
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat59);
        org.junit.Assert.assertNotNull(fastDateFormat60);
        org.junit.Assert.assertNotNull(fastDateFormat61);
        org.junit.Assert.assertNotNull(fastDateFormat62);
        org.junit.Assert.assertNotNull(timeZone63);
        org.junit.Assert.assertEquals(timeZone63.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat66);
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat68);
        org.junit.Assert.assertNotNull(fastDateFormat69);
        org.junit.Assert.assertNotNull(fastDateFormat70);
        org.junit.Assert.assertNotNull(fastDateFormat72);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.lang.String str4 = fastDateFormat3.toString();
        java.util.TimeZone timeZone5 = fastDateFormat3.getTimeZone();
        java.util.TimeZone timeZone9 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale14 = fastDateFormat13.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(0, (int) (short) 1, locale14);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone9, locale14);
        java.lang.String str17 = org.apache.commons.lang.time.FastDateFormat.getTimeZoneDisplay(timeZone5, false, (int) (byte) 1, locale14);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19", timeZone5);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19", timeZone5);
        java.util.List list20 = fastDateFormat19.parsePattern();
        java.lang.Object obj21 = fastDateFormat19.clone();
        java.lang.String str23 = fastDateFormat19.format((long) 80);
        org.junit.Assert.assertNotNull(fastDateFormat3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "FastDateFormat[]" + "'", str4, "FastDateFormat[]");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19" + "'", str17, "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNotNull(obj21);
// flaky "10) test3024(org.apache.commons.lang.time.RegressionTest6)":         org.junit.Assert.assertEquals(obj21.toString(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19]");
// flaky "7) test3024(org.apache.commons.lang.time.RegressionTest6)":         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19]");
// flaky "5) test3024(org.apache.commons.lang.time.RegressionTest6)":         org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19" + "'", str23, "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        java.util.TimeZone timeZone4 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone4);
        java.util.TimeZone timeZone6 = fastDateFormat5.getTimeZone();
        java.util.Locale locale7 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat8 = new org.apache.commons.lang.time.FastDateFormat("", timeZone6, locale7);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.lang.String str12 = fastDateFormat11.toString();
        java.util.TimeZone timeZone13 = fastDateFormat11.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale17 = fastDateFormat16.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, locale17);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone13, locale17);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone6, locale17);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21 70", locale17);
        java.util.TimeZone timeZone22 = fastDateFormat21.getTimeZone();
        java.util.Calendar calendar23 = null;
        java.lang.String str24 = fastDateFormat21.format(calendar23);
        java.lang.String str25 = fastDateFormat21.getPattern();
        java.lang.String str27 = fastDateFormat21.format((long) 10);
        java.lang.String str28 = fastDateFormat21.getPattern();
        java.util.TimeZone timeZone29 = fastDateFormat21.getTimeZone();
        int int30 = fastDateFormat21.getMaxLengthEstimate();
        org.junit.Assert.assertNotNull(fastDateFormat5);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "FastDateFormat[]" + "'", str12, "FastDateFormat[]");
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21 70" + "'", str24, "\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21 70");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21 70" + "'", str25, "\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21 70");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21 70" + "'", str27, "\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21 70");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21 70" + "'", str28, "\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21 70");
        org.junit.Assert.assertNotNull(timeZone29);
        org.junit.Assert.assertEquals(timeZone29.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
// flaky "11) test3025(org.apache.commons.lang.time.RegressionTest6)":         org.junit.Assert.assertTrue("'" + int30 + "' != '" + 11 + "'", int30 == 11);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        java.util.TimeZone timeZone8 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone8);
        java.util.TimeZone timeZone10 = fastDateFormat9.getTimeZone();
        java.util.Locale locale11 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat12 = new org.apache.commons.lang.time.FastDateFormat("", timeZone10, locale11);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.lang.String str16 = fastDateFormat15.toString();
        java.util.TimeZone timeZone17 = fastDateFormat15.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale21 = fastDateFormat20.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, locale21);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone17, locale21);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone10, locale21);
        java.util.TimeZone timeZone28 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone28);
        java.util.TimeZone timeZone30 = fastDateFormat29.getTimeZone();
        java.util.Locale locale31 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat32 = new org.apache.commons.lang.time.FastDateFormat("", timeZone30, locale31);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.lang.String str36 = fastDateFormat35.toString();
        java.util.TimeZone timeZone37 = fastDateFormat35.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale41 = fastDateFormat40.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat42 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, locale41);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat43 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone37, locale41);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat44 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone30, locale41);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat45 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e27\u0e31\u0e19\u0e1e\u0e24\u0e2b\u0e31\u0e2a\u0e1a\u0e14\u0e35\u0e17\u0e35\u0e48\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e04\u0e28. 70", timeZone10, locale41);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat46 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 1, timeZone10);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat47 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(1, timeZone10);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat48 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone10);
        java.util.TimeZone timeZone49 = fastDateFormat48.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat50 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (short) 10, timeZone49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "FastDateFormat[]" + "'", str16, "FastDateFormat[]");
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(fastDateFormat23);
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertNotNull(timeZone30);
        org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "FastDateFormat[]" + "'", str36, "FastDateFormat[]");
        org.junit.Assert.assertNotNull(timeZone37);
        org.junit.Assert.assertEquals(timeZone37.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat40);
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat42);
        org.junit.Assert.assertNotNull(fastDateFormat43);
        org.junit.Assert.assertNotNull(fastDateFormat44);
        org.junit.Assert.assertNotNull(fastDateFormat45);
        org.junit.Assert.assertNotNull(fastDateFormat46);
        org.junit.Assert.assertNotNull(fastDateFormat47);
        org.junit.Assert.assertNotNull(fastDateFormat48);
        org.junit.Assert.assertNotNull(timeZone49);
        org.junit.Assert.assertEquals(timeZone49.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) '#', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale4 = fastDateFormat3.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(0, (int) (short) 1, locale4);
        java.util.TimeZone timeZone7 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone7);
        java.util.TimeZone timeZone9 = fastDateFormat8.getTimeZone();
        boolean boolean10 = fastDateFormat5.equals((java.lang.Object) timeZone9);
        java.lang.String str11 = fastDateFormat5.getPattern();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale17 = fastDateFormat16.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(0, (int) (short) 1, locale17);
        java.util.TimeZone timeZone20 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone20);
        java.util.TimeZone timeZone22 = fastDateFormat21.getTimeZone();
        boolean boolean23 = fastDateFormat18.equals((java.lang.Object) timeZone22);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.lang.String str26 = fastDateFormat25.toString();
        java.util.TimeZone timeZone27 = fastDateFormat25.getTimeZone();
        java.util.TimeZone timeZone31 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale36 = fastDateFormat35.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(0, (int) (short) 1, locale36);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat38 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone31, locale36);
        java.lang.String str39 = org.apache.commons.lang.time.FastDateFormat.getTimeZoneDisplay(timeZone27, false, (int) (byte) 1, locale36);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e17\u0e35\u0e48 d MMMM GGGG y", timeZone22, locale36);
        java.util.Locale locale41 = fastDateFormat40.getLocale();
        boolean boolean42 = fastDateFormat5.equals((java.lang.Object) locale41);
        java.lang.String str44 = fastDateFormat5.format((long) 45);
        java.lang.StringBuffer stringBuffer46 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer47 = fastDateFormat5.format((long) (byte) 0, stringBuffer46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat5);
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "12) test3028(org.apache.commons.lang.time.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u0e17\u0e35\u0e48\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 z" + "'", str11, "\u0e17\u0e35\u0e48\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 z");
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "FastDateFormat[]" + "'", str26, "FastDateFormat[]");
        org.junit.Assert.assertNotNull(timeZone27);
        org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat35);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertNotNull(fastDateFormat38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19" + "'", str39, "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat40);
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
// flaky "8) test3028(org.apache.commons.lang.time.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "\u0e27\u0e31\u0e19\u0e1e\u0e24\u0e2b\u0e31\u0e2a\u0e1a\u0e14\u0e35\u0e17\u0e35\u0e48\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e04\u0e28\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 ICT" + "'", str44, "\u0e27\u0e31\u0e19\u0e1e\u0e24\u0e2b\u0e31\u0e2a\u0e1a\u0e14\u0e35\u0e17\u0e35\u0e48\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e04\u0e28\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 ICT");
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        java.util.TimeZone timeZone6 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone6);
        java.util.TimeZone timeZone8 = fastDateFormat7.getTimeZone();
        java.util.Locale locale9 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat10 = new org.apache.commons.lang.time.FastDateFormat("", timeZone8, locale9);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone8);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone8);
        java.lang.String str14 = fastDateFormat12.format((long) (short) 1);
        java.util.TimeZone timeZone15 = fastDateFormat12.getTimeZone();
        java.util.TimeZone timeZone16 = fastDateFormat12.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.lang.String str19 = fastDateFormat18.toString();
        java.util.TimeZone timeZone20 = fastDateFormat18.getTimeZone();
        java.util.TimeZone timeZone24 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat28 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale29 = fastDateFormat28.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(0, (int) (short) 1, locale29);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone24, locale29);
        java.lang.String str32 = org.apache.commons.lang.time.FastDateFormat.getTimeZoneDisplay(timeZone20, false, (int) (byte) 1, locale29);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, (int) (byte) 0, timeZone16, locale29);
        java.util.Locale locale34 = fastDateFormat33.getLocale();
        java.util.TimeZone timeZone35 = fastDateFormat33.getTimeZone();
        java.util.Locale locale36 = fastDateFormat33.getLocale();
        java.lang.String str38 = fastDateFormat33.format((long) '#');
        java.util.TimeZone timeZone39 = fastDateFormat33.getTimeZone();
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(fastDateFormat12);
// flaky "13) test3029(org.apache.commons.lang.time.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19" + "'", str14, "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "FastDateFormat[]" + "'", str19, "FastDateFormat[]");
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat28);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat30);
        org.junit.Assert.assertNotNull(fastDateFormat31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19" + "'", str32, "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "th_TH");
        org.junit.Assert.assertNotNull(timeZone35);
        org.junit.Assert.assertEquals(timeZone35.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "th_TH");
// flaky "9) test3029(org.apache.commons.lang.time.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19" + "'", str38, "\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone39);
        org.junit.Assert.assertEquals(timeZone39.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        java.util.TimeZone timeZone7 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone7);
        java.util.TimeZone timeZone9 = fastDateFormat8.getTimeZone();
        java.util.Locale locale10 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat11 = new org.apache.commons.lang.time.FastDateFormat("", timeZone9, locale10);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone9);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(2, 3, timeZone9);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.lang.String str19 = fastDateFormat18.toString();
        java.util.TimeZone timeZone20 = fastDateFormat18.getTimeZone();
        java.util.TimeZone timeZone24 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat28 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale29 = fastDateFormat28.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(0, (int) (short) 1, locale29);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone24, locale29);
        java.lang.String str32 = org.apache.commons.lang.time.FastDateFormat.getTimeZoneDisplay(timeZone20, false, (int) (byte) 1, locale29);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19", timeZone20);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19", timeZone20);
        java.util.TimeZone timeZone37 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat38 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone37);
        java.util.TimeZone timeZone39 = fastDateFormat38.getTimeZone();
        java.util.Locale locale40 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat41 = new org.apache.commons.lang.time.FastDateFormat("", timeZone39, locale40);
        java.util.Locale locale42 = fastDateFormat41.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat43 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e35\u0e17\u0e35\u0e48\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e04\u0e28. 70", timeZone20, locale42);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat44 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone9, locale42);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat48 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.lang.String str49 = fastDateFormat48.toString();
        java.util.TimeZone timeZone50 = fastDateFormat48.getTimeZone();
        java.util.TimeZone timeZone54 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat58 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale59 = fastDateFormat58.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat60 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(0, (int) (short) 1, locale59);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat61 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone54, locale59);
        java.lang.String str62 = org.apache.commons.lang.time.FastDateFormat.getTimeZoneDisplay(timeZone50, false, (int) (byte) 1, locale59);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat63 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19", timeZone50);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat64 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19", timeZone50);
        boolean boolean65 = fastDateFormat44.equals((java.lang.Object) "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        java.util.Calendar calendar66 = null;
        java.lang.StringBuffer stringBuffer67 = null;
        java.lang.StringBuffer stringBuffer68 = fastDateFormat44.applyRules(calendar66, stringBuffer67);
        java.util.TimeZone timeZone69 = fastDateFormat44.getTimeZone();
        java.util.Locale locale70 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat71 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21", timeZone69, locale70);
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "FastDateFormat[]" + "'", str19, "FastDateFormat[]");
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat28);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat30);
        org.junit.Assert.assertNotNull(fastDateFormat31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19" + "'", str32, "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertNotNull(fastDateFormat38);
        org.junit.Assert.assertNotNull(timeZone39);
        org.junit.Assert.assertEquals(timeZone39.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat43);
        org.junit.Assert.assertNotNull(fastDateFormat44);
        org.junit.Assert.assertNotNull(fastDateFormat48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "FastDateFormat[]" + "'", str49, "FastDateFormat[]");
        org.junit.Assert.assertNotNull(timeZone50);
        org.junit.Assert.assertEquals(timeZone50.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat58);
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat60);
        org.junit.Assert.assertNotNull(fastDateFormat61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19" + "'", str62, "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat63);
        org.junit.Assert.assertNotNull(fastDateFormat64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNull(stringBuffer68);
        org.junit.Assert.assertNotNull(timeZone69);
        org.junit.Assert.assertEquals(timeZone69.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat71);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.lang.String str8 = fastDateFormat7.toString();
        java.util.TimeZone timeZone9 = fastDateFormat7.getTimeZone();
        java.util.TimeZone timeZone13 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale18 = fastDateFormat17.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(0, (int) (short) 1, locale18);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone13, locale18);
        java.lang.String str21 = org.apache.commons.lang.time.FastDateFormat.getTimeZoneDisplay(timeZone9, false, (int) (byte) 1, locale18);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19", timeZone9);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19", timeZone9);
        java.util.TimeZone timeZone25 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale30 = fastDateFormat29.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(0, (int) (short) 1, locale30);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone25, locale30);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat33 = new org.apache.commons.lang.time.FastDateFormat("\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21 70", timeZone9, locale30);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(2, timeZone9);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale41 = fastDateFormat40.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat42 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(0, (int) (short) 1, locale41);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat43 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, locale41);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat44 = org.apache.commons.lang.time.FastDateFormat.getInstance("HH:mm", locale41);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat45 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone9, locale41);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat46 = org.apache.commons.lang.time.FastDateFormat.getInstance("d/M/yy HH:mm", timeZone9);
        java.lang.String str47 = fastDateFormat46.toString();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat51 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale52 = fastDateFormat51.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat53 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, locale52);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat54 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21 70", locale52);
        java.lang.StringBuffer stringBuffer55 = null;
        java.text.FieldPosition fieldPosition56 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer57 = fastDateFormat46.format((java.lang.Object) fastDateFormat54, stringBuffer55, fieldPosition56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: org.apache.commons.lang.time.FastDateFormat");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "FastDateFormat[]" + "'", str8, "FastDateFormat[]");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19" + "'", str21, "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(fastDateFormat23);
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat31);
        org.junit.Assert.assertNotNull(fastDateFormat32);
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertNotNull(fastDateFormat40);
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat42);
        org.junit.Assert.assertNotNull(fastDateFormat43);
        org.junit.Assert.assertNotNull(fastDateFormat44);
        org.junit.Assert.assertNotNull(fastDateFormat45);
        org.junit.Assert.assertNotNull(fastDateFormat46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "FastDateFormat[d/M/yy HH:mm]" + "'", str47, "FastDateFormat[d/M/yy HH:mm]");
        org.junit.Assert.assertNotNull(fastDateFormat51);
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat53);
        org.junit.Assert.assertNotNull(fastDateFormat54);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale4 = fastDateFormat3.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e17\u0e35\u0e48 d MMMM GGGG y", locale4);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, locale4);
        fastDateFormat6.init();
        java.util.Locale locale8 = fastDateFormat6.getLocale();
        java.util.Locale locale9 = fastDateFormat6.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale15 = fastDateFormat14.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(0, (int) (short) 1, locale15);
        java.util.TimeZone timeZone18 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone18);
        java.util.TimeZone timeZone20 = fastDateFormat19.getTimeZone();
        boolean boolean21 = fastDateFormat16.equals((java.lang.Object) timeZone20);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale26 = fastDateFormat25.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(0, (int) (short) 1, locale26);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat28 = new org.apache.commons.lang.time.FastDateFormat("\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19", timeZone20, locale26);
        int int29 = fastDateFormat28.getMaxLengthEstimate();
        fastDateFormat28.init();
        java.util.TimeZone timeZone34 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone34);
        java.util.TimeZone timeZone36 = fastDateFormat35.getTimeZone();
        java.util.Locale locale37 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat38 = new org.apache.commons.lang.time.FastDateFormat("", timeZone36, locale37);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat41 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.lang.String str42 = fastDateFormat41.toString();
        java.util.TimeZone timeZone43 = fastDateFormat41.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat46 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale47 = fastDateFormat46.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat48 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, locale47);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat49 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone43, locale47);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat50 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone36, locale47);
        java.util.Calendar calendar51 = null;
        java.lang.StringBuffer stringBuffer52 = null;
        java.lang.StringBuffer stringBuffer53 = fastDateFormat50.applyRules(calendar51, stringBuffer52);
        boolean boolean54 = fastDateFormat28.equals((java.lang.Object) fastDateFormat50);
        java.lang.StringBuffer stringBuffer56 = null;
        java.lang.StringBuffer stringBuffer57 = fastDateFormat50.format((long) 'a', stringBuffer56);
        java.util.TimeZone timeZone58 = fastDateFormat50.getTimeZone();
        java.lang.Class<?> wildcardClass59 = fastDateFormat50.getClass();
        boolean boolean60 = fastDateFormat6.equals((java.lang.Object) fastDateFormat50);
        java.util.List list61 = fastDateFormat6.parsePattern();
        org.junit.Assert.assertNotNull(fastDateFormat3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat5);
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(fastDateFormat35);
        org.junit.Assert.assertNotNull(timeZone36);
        org.junit.Assert.assertEquals(timeZone36.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "FastDateFormat[]" + "'", str42, "FastDateFormat[]");
        org.junit.Assert.assertNotNull(timeZone43);
        org.junit.Assert.assertEquals(timeZone43.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat46);
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat48);
        org.junit.Assert.assertNotNull(fastDateFormat49);
        org.junit.Assert.assertNotNull(fastDateFormat50);
        org.junit.Assert.assertNull(stringBuffer53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(stringBuffer57);
        org.junit.Assert.assertNotNull(timeZone58);
        org.junit.Assert.assertEquals(timeZone58.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(list61);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        java.util.TimeZone timeZone6 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone6);
        java.util.TimeZone timeZone8 = fastDateFormat7.getTimeZone();
        java.util.Locale locale9 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat10 = new org.apache.commons.lang.time.FastDateFormat("", timeZone8, locale9);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone8);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale14 = fastDateFormat13.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat15 = new org.apache.commons.lang.time.FastDateFormat("", timeZone8, locale14);
        java.util.TimeZone timeZone17 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale23 = fastDateFormat22.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(0, (int) (short) 1, locale23);
        java.util.TimeZone timeZone26 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone26);
        java.util.TimeZone timeZone28 = fastDateFormat27.getTimeZone();
        boolean boolean29 = fastDateFormat24.equals((java.lang.Object) timeZone28);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale34 = fastDateFormat33.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(0, (int) (short) 1, locale34);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat36 = new org.apache.commons.lang.time.FastDateFormat("\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19", timeZone28, locale34);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e27\u0e31\u0e19\u0e1e\u0e24\u0e2b\u0e31\u0e2a\u0e1a\u0e14\u0e35\u0e17\u0e35\u0e48\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e04\u0e28. 70", timeZone17, locale34);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat38 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone8, locale34);
        java.util.TimeZone timeZone44 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat45 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone44);
        java.util.TimeZone timeZone46 = fastDateFormat45.getTimeZone();
        java.util.Locale locale47 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat48 = new org.apache.commons.lang.time.FastDateFormat("", timeZone46, locale47);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat51 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.lang.String str52 = fastDateFormat51.toString();
        java.util.TimeZone timeZone53 = fastDateFormat51.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat56 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale57 = fastDateFormat56.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat58 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, locale57);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat59 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone53, locale57);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat60 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone46, locale57);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat61 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21 70", locale57);
        java.util.TimeZone timeZone62 = fastDateFormat61.getTimeZone();
        java.util.TimeZone timeZone68 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat69 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone68);
        java.util.TimeZone timeZone70 = fastDateFormat69.getTimeZone();
        java.util.Locale locale71 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat72 = new org.apache.commons.lang.time.FastDateFormat("", timeZone70, locale71);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat75 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.lang.String str76 = fastDateFormat75.toString();
        java.util.TimeZone timeZone77 = fastDateFormat75.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat80 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale81 = fastDateFormat80.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat82 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, locale81);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat83 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone77, locale81);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat84 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone70, locale81);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat85 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21 70", locale81);
        java.util.TimeZone timeZone86 = fastDateFormat85.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat89 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale90 = fastDateFormat89.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat91 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, locale90);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat92 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e17\u0e35\u0e48 d MMMM GGGG y", timeZone86, locale90);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat93 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone62, locale90);
        java.lang.String str94 = fastDateFormat93.toString();
        boolean boolean95 = fastDateFormat38.equals((java.lang.Object) fastDateFormat93);
        java.util.Locale locale96 = fastDateFormat38.getLocale();
        java.util.Locale locale97 = fastDateFormat38.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat98 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, locale97);
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertNotNull(timeZone28);
        org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat35);
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertNotNull(fastDateFormat38);
        org.junit.Assert.assertNotNull(fastDateFormat45);
        org.junit.Assert.assertNotNull(timeZone46);
        org.junit.Assert.assertEquals(timeZone46.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "FastDateFormat[]" + "'", str52, "FastDateFormat[]");
        org.junit.Assert.assertNotNull(timeZone53);
        org.junit.Assert.assertEquals(timeZone53.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat56);
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat58);
        org.junit.Assert.assertNotNull(fastDateFormat59);
        org.junit.Assert.assertNotNull(fastDateFormat60);
        org.junit.Assert.assertNotNull(fastDateFormat61);
        org.junit.Assert.assertNotNull(timeZone62);
        org.junit.Assert.assertEquals(timeZone62.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat69);
        org.junit.Assert.assertNotNull(timeZone70);
        org.junit.Assert.assertEquals(timeZone70.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat75);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "FastDateFormat[]" + "'", str76, "FastDateFormat[]");
        org.junit.Assert.assertNotNull(timeZone77);
        org.junit.Assert.assertEquals(timeZone77.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat80);
        org.junit.Assert.assertNotNull(locale81);
        org.junit.Assert.assertEquals(locale81.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat82);
        org.junit.Assert.assertNotNull(fastDateFormat83);
        org.junit.Assert.assertNotNull(fastDateFormat84);
        org.junit.Assert.assertNotNull(fastDateFormat85);
        org.junit.Assert.assertNotNull(timeZone86);
        org.junit.Assert.assertEquals(timeZone86.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat89);
        org.junit.Assert.assertNotNull(locale90);
        org.junit.Assert.assertEquals(locale90.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat91);
        org.junit.Assert.assertNotNull(fastDateFormat92);
        org.junit.Assert.assertNotNull(fastDateFormat93);
// flaky "14) test3033(org.apache.commons.lang.time.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str94 + "' != '" + "\u0e17\u0e35\u0e48 d MMMM GGGG y]" + "'", str94, "\u0e17\u0e35\u0e48 d MMMM GGGG y]");
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertNotNull(locale96);
        org.junit.Assert.assertEquals(locale96.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale97);
        org.junit.Assert.assertEquals(locale97.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat98);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.lang.String str2 = fastDateFormat1.toString();
        java.util.Calendar calendar3 = null;
        java.lang.String str4 = fastDateFormat1.format(calendar3);
        java.lang.Object obj5 = fastDateFormat1.clone();
        java.util.Calendar calendar6 = null;
        java.lang.StringBuffer stringBuffer7 = null;
        java.lang.StringBuffer stringBuffer8 = fastDateFormat1.format(calendar6, stringBuffer7);
        java.util.TimeZone timeZone10 = null;
        java.util.Locale locale11 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone10, locale11);
        int int13 = fastDateFormat12.getMaxLengthEstimate();
        java.util.Locale locale14 = fastDateFormat12.getLocale();
        boolean boolean15 = fastDateFormat12.getTimeZoneOverridesCalendar();
        java.util.TimeZone timeZone16 = fastDateFormat12.getTimeZone();
        boolean boolean17 = fastDateFormat1.equals((java.lang.Object) fastDateFormat12);
        java.lang.Object obj18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator19 = fastDateFormat12.formatToCharacterIterator(obj18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: <null>");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "FastDateFormat[]" + "'", str2, "FastDateFormat[]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "FastDateFormat[]");
        org.junit.Assert.assertNull(stringBuffer8);
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 34 + "'", int13 == 34);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        fastDateFormat1.init();
        java.util.Locale locale3 = fastDateFormat1.getLocale();
        java.lang.StringBuffer stringBuffer5 = null;
        java.lang.StringBuffer stringBuffer6 = fastDateFormat1.format(0L, stringBuffer5);
        java.lang.StringBuffer stringBuffer8 = null;
        java.lang.StringBuffer stringBuffer9 = fastDateFormat1.format((long) 49, stringBuffer8);
        org.junit.Assert.assertNotNull(fastDateFormat1);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertNull(stringBuffer6);
        org.junit.Assert.assertNull(stringBuffer9);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale5 = fastDateFormat4.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(0, 2, locale5);
        java.util.Locale locale7 = fastDateFormat6.getLocale();
        java.util.TimeZone timeZone8 = fastDateFormat6.getTimeZone();
        java.util.TimeZone timeZone12 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone12);
        java.util.TimeZone timeZone14 = fastDateFormat13.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone14);
        boolean boolean16 = fastDateFormat15.getTimeZoneOverridesCalendar();
        boolean boolean17 = fastDateFormat15.getTimeZoneOverridesCalendar();
        java.util.TimeZone timeZone18 = fastDateFormat15.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e04\u0e28. 70", timeZone18);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale26 = fastDateFormat25.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(0, 2, locale26);
        java.lang.String str28 = org.apache.commons.lang.time.FastDateFormat.getTimeZoneDisplay(timeZone18, false, (int) (byte) 1, locale26);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat29 = new org.apache.commons.lang.time.FastDateFormat("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 zzzz]", timeZone8, locale26);
        java.util.TimeZone timeZone33 = null;
        java.util.TimeZone timeZone37 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat38 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone37);
        java.util.TimeZone timeZone39 = fastDateFormat38.getTimeZone();
        java.util.Locale locale40 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat41 = new org.apache.commons.lang.time.FastDateFormat("", timeZone39, locale40);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat42 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone39);
        java.lang.String str43 = fastDateFormat42.toString();
        java.lang.String str44 = fastDateFormat42.toString();
        java.util.Locale locale45 = fastDateFormat42.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat46 = org.apache.commons.lang.time.FastDateFormat.getInstance("d MMMM y", timeZone33, locale45);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str47 = org.apache.commons.lang.time.FastDateFormat.getTimeZoneDisplay(timeZone8, false, 18, locale45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 18");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19" + "'", str28, "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat38);
        org.junit.Assert.assertNotNull(timeZone39);
        org.junit.Assert.assertEquals(timeZone39.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat42);
// flaky "15) test3036(org.apache.commons.lang.time.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str43 + "' != '" + "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 zzzz]" + "'", str43, "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 zzzz]");
// flaky "10) test3036(org.apache.commons.lang.time.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 zzzz]" + "'", str44, "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 zzzz]");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat46);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(0, (int) (short) 1);
        java.util.TimeZone timeZone4 = fastDateFormat3.getTimeZone();
        java.util.TimeZone timeZone6 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale12 = fastDateFormat11.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(0, (int) (short) 1, locale12);
        java.util.TimeZone timeZone15 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone15);
        java.util.TimeZone timeZone17 = fastDateFormat16.getTimeZone();
        boolean boolean18 = fastDateFormat13.equals((java.lang.Object) timeZone17);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale23 = fastDateFormat22.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(0, (int) (short) 1, locale23);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat25 = new org.apache.commons.lang.time.FastDateFormat("\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19", timeZone17, locale23);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e27\u0e31\u0e19\u0e1e\u0e24\u0e2b\u0e31\u0e2a\u0e1a\u0e14\u0e35\u0e17\u0e35\u0e48\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e04\u0e28. 70", timeZone6, locale23);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone4, locale23);
        org.junit.Assert.assertNotNull(fastDateFormat3);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertNotNull(fastDateFormat27);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang.time.FastDateFormat.getInstance();
        int int3 = fastDateFormat2.getMaxLengthEstimate();
        java.lang.String str4 = fastDateFormat2.getPattern();
        boolean boolean5 = fastDateFormat1.equals((java.lang.Object) fastDateFormat2);
        java.lang.String str7 = fastDateFormat2.format((long) 13);
        org.junit.Assert.assertNotNull(fastDateFormat1);
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "d/M/yy HH:mm" + "'", str4, "d/M/yy HH:mm");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1/1/70 07:00" + "'", str7, "1/1/70 07:00");
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale5 = fastDateFormat4.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(0, (int) (short) 1, locale5);
        java.util.TimeZone timeZone8 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone8);
        java.util.TimeZone timeZone10 = fastDateFormat9.getTimeZone();
        boolean boolean11 = fastDateFormat6.equals((java.lang.Object) timeZone10);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.lang.String str14 = fastDateFormat13.toString();
        java.util.TimeZone timeZone15 = fastDateFormat13.getTimeZone();
        java.util.TimeZone timeZone19 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale24 = fastDateFormat23.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(0, (int) (short) 1, locale24);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone19, locale24);
        java.lang.String str27 = org.apache.commons.lang.time.FastDateFormat.getTimeZoneDisplay(timeZone15, false, (int) (byte) 1, locale24);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat28 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e17\u0e35\u0e48 d MMMM GGGG y", timeZone10, locale24);
        java.util.Locale locale29 = fastDateFormat28.getLocale();
        fastDateFormat28.init();
        java.util.TimeZone timeZone31 = fastDateFormat28.getTimeZone();
        java.lang.String str33 = fastDateFormat28.format((long) 0);
        java.util.Locale locale34 = fastDateFormat28.getLocale();
        int int35 = fastDateFormat28.getMaxLengthEstimate();
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "FastDateFormat[]" + "'", str14, "FastDateFormat[]");
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat23);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19" + "'", str27, "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat28);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "th_TH");
        org.junit.Assert.assertNotNull(timeZone31);
        org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
// flaky "16) test3039(org.apache.commons.lang.time.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\u0e27\u0e31\u0e19\u0e1e\u0e24\u0e2b\u0e31\u0e2a\u0e1a\u0e14\u0e35\u0e17\u0e35\u0e48\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e04\u0e28. 70" + "'", str33, "\u0e27\u0e31\u0e19\u0e1e\u0e24\u0e2b\u0e31\u0e2a\u0e1a\u0e14\u0e35\u0e17\u0e35\u0e48\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e04\u0e28. 70");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "th_TH");
// flaky "11) test3039(org.apache.commons.lang.time.RegressionTest6)":         org.junit.Assert.assertTrue("'" + int35 + "' != '" + 45 + "'", int35 == 45);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.lang.String str2 = fastDateFormat1.toString();
        java.util.Calendar calendar3 = null;
        java.lang.String str4 = fastDateFormat1.format(calendar3);
        java.util.Calendar calendar5 = null;
        java.lang.StringBuffer stringBuffer6 = null;
        java.lang.StringBuffer stringBuffer7 = fastDateFormat1.format(calendar5, stringBuffer6);
        java.lang.String str9 = fastDateFormat1.format((long) 62);
        java.lang.String str10 = fastDateFormat1.getPattern();
        java.lang.Object obj11 = fastDateFormat1.clone();
        org.junit.Assert.assertNotNull(fastDateFormat1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "FastDateFormat[]" + "'", str2, "FastDateFormat[]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(stringBuffer7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "FastDateFormat[]");
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.lang.String str3 = fastDateFormat2.toString();
        java.util.TimeZone timeZone4 = fastDateFormat2.getTimeZone();
        java.util.TimeZone timeZone5 = fastDateFormat2.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone5);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.lang.String str18 = fastDateFormat17.toString();
        java.util.TimeZone timeZone19 = fastDateFormat17.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale23 = fastDateFormat22.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, locale23);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone19, locale23);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(1, timeZone19);
        java.util.TimeZone timeZone28 = null;
        java.util.Locale locale29 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone28, locale29);
        int int31 = fastDateFormat30.getMaxLengthEstimate();
        java.util.Locale locale32 = fastDateFormat30.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat33 = new org.apache.commons.lang.time.FastDateFormat("r", timeZone19, locale32);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale32);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang.time.FastDateFormat.getInstance("HH", locale32);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, 1, locale32);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str37 = org.apache.commons.lang.time.FastDateFormat.getTimeZoneDisplay(timeZone5, true, 11, locale32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 11");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "FastDateFormat[]" + "'", str3, "FastDateFormat[]");
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "FastDateFormat[]" + "'", str18, "FastDateFormat[]");
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertNotNull(fastDateFormat30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 34 + "'", int31 == 34);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertNotNull(fastDateFormat35);
        org.junit.Assert.assertNotNull(fastDateFormat36);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(3);
        int int2 = fastDateFormat1.getMaxLengthEstimate();
        int int3 = fastDateFormat1.getMaxLengthEstimate();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.lang.String str8 = fastDateFormat7.toString();
        java.util.TimeZone timeZone9 = fastDateFormat7.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale13 = fastDateFormat12.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, locale13);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone9, locale13);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone9);
        java.lang.String str18 = fastDateFormat16.format((long) 34);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator19 = fastDateFormat1.formatToCharacterIterator((java.lang.Object) 34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "FastDateFormat[]" + "'", str8, "FastDateFormat[]");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(fastDateFormat16);
// flaky "17) test3042(org.apache.commons.lang.time.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 ICT" + "'", str18, "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 ICT");
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        java.util.TimeZone timeZone6 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone6);
        java.util.TimeZone timeZone8 = fastDateFormat7.getTimeZone();
        java.util.Locale locale9 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat10 = new org.apache.commons.lang.time.FastDateFormat("", timeZone8, locale9);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone8);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone8);
        java.lang.String str14 = fastDateFormat12.format((long) (short) 1);
        java.util.TimeZone timeZone15 = fastDateFormat12.getTimeZone();
        java.util.TimeZone timeZone19 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone19);
        java.util.TimeZone timeZone21 = fastDateFormat20.getTimeZone();
        java.util.Locale locale22 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat23 = new org.apache.commons.lang.time.FastDateFormat("", timeZone21, locale22);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.lang.String str27 = fastDateFormat26.toString();
        java.util.TimeZone timeZone28 = fastDateFormat26.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale32 = fastDateFormat31.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, locale32);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone28, locale32);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone21, locale32);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone15, locale32);
        java.util.TimeZone timeZone37 = fastDateFormat36.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale41 = fastDateFormat40.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat42 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19", locale41);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat43 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(27, timeZone37, locale41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 27");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(fastDateFormat12);
// flaky "18) test3043(org.apache.commons.lang.time.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19" + "'", str14, "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "FastDateFormat[]" + "'", str27, "FastDateFormat[]");
        org.junit.Assert.assertNotNull(timeZone28);
        org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat31);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertNotNull(fastDateFormat35);
        org.junit.Assert.assertNotNull(fastDateFormat36);
        org.junit.Assert.assertNotNull(timeZone37);
        org.junit.Assert.assertEquals(timeZone37.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat40);
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat42);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(1, 2);
        java.lang.String str4 = fastDateFormat2.format((long) (byte) 0);
        java.lang.Object obj5 = fastDateFormat2.clone();
        java.util.TimeZone timeZone11 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone11);
        java.util.TimeZone timeZone13 = fastDateFormat12.getTimeZone();
        java.util.Locale locale14 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat15 = new org.apache.commons.lang.time.FastDateFormat("", timeZone13, locale14);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone13);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone13);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale24 = fastDateFormat23.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(0, (int) (short) 1, locale24);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, locale24);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang.time.FastDateFormat.getInstance("HH:mm", locale24);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat28 = new org.apache.commons.lang.time.FastDateFormat("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 zzzz", timeZone13, locale24);
        java.lang.String str29 = fastDateFormat28.getPattern();
        boolean boolean30 = fastDateFormat2.equals((java.lang.Object) fastDateFormat28);
        org.junit.Assert.assertNotNull(fastDateFormat2);
// flaky "19) test3044(org.apache.commons.lang.time.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21 70 07:00:00" + "'", str4, "\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21 70 07:00:00");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "FastDateFormat[d MMMM y HH:mm:ss]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "FastDateFormat[d MMMM y HH:mm:ss]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "FastDateFormat[d MMMM y HH:mm:ss]");
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(fastDateFormat23);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 zzzz" + "'", str29, "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 zzzz");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        java.util.TimeZone timeZone3 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone3);
        java.util.TimeZone timeZone5 = fastDateFormat4.getTimeZone();
        java.util.Locale locale6 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat7 = new org.apache.commons.lang.time.FastDateFormat("", timeZone5, locale6);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone5);
        java.lang.Object obj9 = fastDateFormat8.clone();
        int int10 = fastDateFormat8.getMaxLengthEstimate();
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(obj9);
// flaky "20) test3045(org.apache.commons.lang.time.RegressionTest6)":         org.junit.Assert.assertEquals(obj9.toString(), "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 zzzz]");
// flaky "12) test3045(org.apache.commons.lang.time.RegressionTest6)":         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 zzzz]");
// flaky "6) test3045(org.apache.commons.lang.time.RegressionTest6)":         org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 zzzz]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 51 + "'", int10 == 51);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale5 = fastDateFormat4.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e17\u0e35\u0e48 d MMMM GGGG y", locale5);
        int[] intArray12 = new int[] { (byte) 0, (-1), 'a', 3 };
        java.lang.String str13 = fastDateFormat6.parseToken("r", intArray12);
        boolean boolean15 = fastDateFormat6.equals((java.lang.Object) false);
        java.lang.String str17 = fastDateFormat6.format((long) 62);
        java.util.Locale locale18 = fastDateFormat6.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) '#', 0, locale18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 0, (-1), 97, 3 });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "r" + "'", str13, "r");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
// flaky "21) test3046(org.apache.commons.lang.time.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\u0e27\u0e31\u0e19\u0e1e\u0e24\u0e2b\u0e31\u0e2a\u0e1a\u0e14\u0e35\u0e17\u0e35\u0e48\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e04\u0e28. 70" + "'", str17, "\u0e27\u0e31\u0e19\u0e1e\u0e24\u0e2b\u0e31\u0e2a\u0e1a\u0e14\u0e35\u0e17\u0e35\u0e48\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e04\u0e28. 70");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "th_TH");
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale7 = fastDateFormat6.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(0, (int) (short) 1, locale7);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone2, locale7);
        java.util.Locale locale10 = fastDateFormat9.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(34, locale10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 34");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        java.util.TimeZone timeZone3 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone3);
        java.util.TimeZone timeZone5 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 zzzz", timeZone5);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(3, timeZone5);
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer10 = fastDateFormat7.format((long) 49, stringBuffer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(fastDateFormat7);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        java.util.TimeZone timeZone4 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone4);
        java.util.TimeZone timeZone6 = fastDateFormat5.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone6);
        java.util.TimeZone timeZone8 = fastDateFormat7.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(49, 12, timeZone8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 12");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat5);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        java.util.TimeZone timeZone6 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone6);
        java.util.TimeZone timeZone8 = fastDateFormat7.getTimeZone();
        java.util.Locale locale9 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat10 = new org.apache.commons.lang.time.FastDateFormat("", timeZone8, locale9);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone8);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(2, 3, timeZone8);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.lang.String str18 = fastDateFormat17.toString();
        java.util.TimeZone timeZone19 = fastDateFormat17.getTimeZone();
        java.util.TimeZone timeZone23 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale28 = fastDateFormat27.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(0, (int) (short) 1, locale28);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone23, locale28);
        java.lang.String str31 = org.apache.commons.lang.time.FastDateFormat.getTimeZoneDisplay(timeZone19, false, (int) (byte) 1, locale28);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19", timeZone19);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19", timeZone19);
        java.util.TimeZone timeZone36 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone36);
        java.util.TimeZone timeZone38 = fastDateFormat37.getTimeZone();
        java.util.Locale locale39 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat40 = new org.apache.commons.lang.time.FastDateFormat("", timeZone38, locale39);
        java.util.Locale locale41 = fastDateFormat40.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat42 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e35\u0e17\u0e35\u0e48\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e04\u0e28. 70", timeZone19, locale41);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat43 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone8, locale41);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat47 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.lang.String str48 = fastDateFormat47.toString();
        java.util.TimeZone timeZone49 = fastDateFormat47.getTimeZone();
        java.util.TimeZone timeZone53 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat57 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale58 = fastDateFormat57.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat59 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(0, (int) (short) 1, locale58);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat60 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone53, locale58);
        java.lang.String str61 = org.apache.commons.lang.time.FastDateFormat.getTimeZoneDisplay(timeZone49, false, (int) (byte) 1, locale58);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat62 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19", timeZone49);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat63 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19", timeZone49);
        boolean boolean64 = fastDateFormat43.equals((java.lang.Object) "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        java.lang.String str66 = fastDateFormat43.format((long) 80);
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "FastDateFormat[]" + "'", str18, "FastDateFormat[]");
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertNotNull(fastDateFormat30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19" + "'", str31, "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat32);
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertNotNull(timeZone38);
        org.junit.Assert.assertEquals(timeZone38.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat42);
        org.junit.Assert.assertNotNull(fastDateFormat43);
        org.junit.Assert.assertNotNull(fastDateFormat47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "FastDateFormat[]" + "'", str48, "FastDateFormat[]");
        org.junit.Assert.assertNotNull(timeZone49);
        org.junit.Assert.assertEquals(timeZone49.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat57);
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat59);
        org.junit.Assert.assertNotNull(fastDateFormat60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19" + "'", str61, "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat62);
        org.junit.Assert.assertNotNull(fastDateFormat63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        java.util.TimeZone timeZone6 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone6);
        java.util.TimeZone timeZone8 = fastDateFormat7.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone8);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.lang.String str12 = fastDateFormat11.toString();
        java.util.TimeZone timeZone13 = fastDateFormat11.getTimeZone();
        java.util.TimeZone timeZone17 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale22 = fastDateFormat21.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(0, (int) (short) 1, locale22);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone17, locale22);
        java.lang.String str25 = org.apache.commons.lang.time.FastDateFormat.getTimeZoneDisplay(timeZone13, false, (int) (byte) 1, locale22);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat26 = new org.apache.commons.lang.time.FastDateFormat("HH:mm", timeZone8, locale22);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(2, (int) (short) 0, timeZone8);
        java.util.Locale locale28 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat29 = new org.apache.commons.lang.time.FastDateFormat("i", timeZone8, locale28);
        boolean boolean30 = fastDateFormat29.getTimeZoneOverridesCalendar();
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "FastDateFormat[]" + "'", str12, "FastDateFormat[]");
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat23);
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19" + "'", str25, "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale5 = fastDateFormat4.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e17\u0e35\u0e48 d MMMM GGGG y", locale5);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, locale5);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(3, locale5);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.lang.String str11 = fastDateFormat10.toString();
        java.util.TimeZone timeZone12 = fastDateFormat10.getTimeZone();
        java.util.TimeZone timeZone14 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone14);
        java.util.TimeZone timeZone16 = fastDateFormat15.getTimeZone();
        fastDateFormat15.init();
        boolean boolean18 = fastDateFormat10.equals((java.lang.Object) fastDateFormat15);
        java.util.TimeZone timeZone19 = fastDateFormat10.getTimeZone();
        java.lang.String str21 = fastDateFormat10.format((long) (byte) 100);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.lang.String str24 = fastDateFormat23.toString();
        java.util.Calendar calendar25 = null;
        java.lang.String str26 = fastDateFormat23.format(calendar25);
        java.util.Calendar calendar27 = null;
        java.lang.StringBuffer stringBuffer28 = null;
        java.lang.StringBuffer stringBuffer29 = fastDateFormat23.format(calendar27, stringBuffer28);
        boolean boolean30 = fastDateFormat10.equals((java.lang.Object) fastDateFormat23);
        boolean boolean31 = fastDateFormat8.equals((java.lang.Object) fastDateFormat10);
        java.lang.String str32 = fastDateFormat8.getPattern();
        java.util.Date date33 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str34 = fastDateFormat8.format(date33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "FastDateFormat[]" + "'", str11, "FastDateFormat[]");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(fastDateFormat23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "FastDateFormat[]" + "'", str24, "FastDateFormat[]");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNull(stringBuffer29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "HH:mm" + "'", str32, "HH:mm");
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale7 = fastDateFormat6.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e17\u0e35\u0e48 d MMMM GGGG y", locale7);
        int[] intArray14 = new int[] { (byte) 0, (-1), 'a', 3 };
        java.lang.String str15 = fastDateFormat8.parseToken("r", intArray14);
        java.lang.String str16 = fastDateFormat2.parseToken("HH:mm", intArray14);
        java.lang.String str17 = fastDateFormat2.toString();
        java.util.TimeZone timeZone18 = fastDateFormat2.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 1);
        java.util.List list21 = fastDateFormat20.parsePattern();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale28 = fastDateFormat27.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(0, (int) (short) 1, locale28);
        java.util.TimeZone timeZone31 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone31);
        java.util.TimeZone timeZone33 = fastDateFormat32.getTimeZone();
        boolean boolean34 = fastDateFormat29.equals((java.lang.Object) timeZone33);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat38 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale39 = fastDateFormat38.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(0, (int) (short) 1, locale39);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat41 = new org.apache.commons.lang.time.FastDateFormat("\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19", timeZone33, locale39);
        int int42 = fastDateFormat41.getMaxLengthEstimate();
        fastDateFormat41.init();
        java.util.TimeZone timeZone47 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat48 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone47);
        java.util.TimeZone timeZone49 = fastDateFormat48.getTimeZone();
        java.util.Locale locale50 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat51 = new org.apache.commons.lang.time.FastDateFormat("", timeZone49, locale50);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat54 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.lang.String str55 = fastDateFormat54.toString();
        java.util.TimeZone timeZone56 = fastDateFormat54.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat59 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale60 = fastDateFormat59.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat61 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, locale60);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat62 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone56, locale60);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat63 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone49, locale60);
        java.util.Calendar calendar64 = null;
        java.lang.StringBuffer stringBuffer65 = null;
        java.lang.StringBuffer stringBuffer66 = fastDateFormat63.applyRules(calendar64, stringBuffer65);
        boolean boolean67 = fastDateFormat41.equals((java.lang.Object) fastDateFormat63);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat70 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat74 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale75 = fastDateFormat74.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat76 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e17\u0e35\u0e48 d MMMM GGGG y", locale75);
        int[] intArray82 = new int[] { (byte) 0, (-1), 'a', 3 };
        java.lang.String str83 = fastDateFormat76.parseToken("r", intArray82);
        java.lang.String str84 = fastDateFormat70.parseToken("HH:mm", intArray82);
        java.lang.String str85 = fastDateFormat63.parseToken("hi!", intArray82);
        java.lang.String str86 = fastDateFormat20.parseToken("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 zzzz]", intArray82);
        boolean boolean87 = fastDateFormat2.equals((java.lang.Object) fastDateFormat20);
        boolean boolean88 = fastDateFormat2.getTimeZoneOverridesCalendar();
        java.util.Locale locale89 = fastDateFormat2.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat90 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(21, locale89);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 21");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 1, (-1), 97, 3 });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "r" + "'", str15, "r");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HH" + "'", str16, "HH");
// flaky "22) test3053(org.apache.commons.lang.time.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19]" + "'", str17, "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19]");
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertNotNull(fastDateFormat32);
        org.junit.Assert.assertNotNull(timeZone33);
        org.junit.Assert.assertEquals(timeZone33.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(fastDateFormat38);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(fastDateFormat48);
        org.junit.Assert.assertNotNull(timeZone49);
        org.junit.Assert.assertEquals(timeZone49.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "FastDateFormat[]" + "'", str55, "FastDateFormat[]");
        org.junit.Assert.assertNotNull(timeZone56);
        org.junit.Assert.assertEquals(timeZone56.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(fastDateFormat59);
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat61);
        org.junit.Assert.assertNotNull(fastDateFormat62);
        org.junit.Assert.assertNotNull(fastDateFormat63);
        org.junit.Assert.assertNull(stringBuffer66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(fastDateFormat70);
        org.junit.Assert.assertNotNull(fastDateFormat74);
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "th_TH");
        org.junit.Assert.assertNotNull(fastDateFormat76);
        org.junit.Assert.assertNotNull(intArray82);
// flaky "13) test3053(org.apache.commons.lang.time.RegressionTest6)":         org.junit.Assert.assertArrayEquals(intArray82, new int[] { 1, (-1), 97, 3 });
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "r" + "'", str83, "r");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "HH" + "'", str84, "HH");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "i" + "'", str85, "i");
// flaky "7) test3053(org.apache.commons.lang.time.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str86 + "' != '" + "a" + "'", str86, "a");
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(locale89);
        org.junit.Assert.assertEquals(locale89.toString(), "th_TH");
    }
}
