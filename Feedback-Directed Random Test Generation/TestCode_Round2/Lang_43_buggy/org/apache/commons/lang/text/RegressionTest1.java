package org.apache.commons.lang.text;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

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
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test501");
        java.util.Map map4 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map4);
        java.util.Locale locale6 = extendedMessageFormat5.getLocale();
        java.lang.String str7 = extendedMessageFormat5.toPattern();
        extendedMessageFormat5.applyPattern("hi!");
        java.util.Map map12 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map12);
        java.lang.String str14 = extendedMessageFormat13.toPattern();
        java.text.Format[] formatArray15 = extendedMessageFormat13.getFormatsByArgumentIndex();
        java.util.Locale locale16 = extendedMessageFormat13.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale16);
        extendedMessageFormat5.setLocale(locale16);
        java.util.Map map19 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale16, map19);
        java.util.Map map21 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat22 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale16, map21);
        java.util.Map map23 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat24 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale16, map23);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale8 = null;
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale8, map9);
        java.text.Format[] formatArray11 = extendedMessageFormat10.getFormatsByArgumentIndex();
        java.lang.String str12 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray11);
        java.lang.String str13 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray11);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatsByArgumentIndex(formatArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        extendedMessageFormat2.applyPattern("hi!");
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        java.util.Map map8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map8);
        java.text.Format[] formatArray10 = extendedMessageFormat9.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatsByArgumentIndex(formatArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.util.Locale locale6 = extendedMessageFormat2.getLocale();
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map9);
        java.util.Locale locale11 = extendedMessageFormat10.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale11);
        extendedMessageFormat12.applyPattern("hi!");
        java.lang.String str15 = extendedMessageFormat12.toPattern();
        java.lang.Object[] objArray17 = extendedMessageFormat12.parse("hi!");
        java.text.Format[] formatArray18 = extendedMessageFormat12.getFormatsByArgumentIndex();
        java.text.Format[] formatArray19 = extendedMessageFormat12.getFormats();
        extendedMessageFormat12.applyPattern("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator22 = extendedMessageFormat2.formatToCharacterIterator((java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class [Ljava.lang.Object; (java.lang.String and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertArrayEquals(objArray17, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray18);
        org.junit.Assert.assertArrayEquals(formatArray18, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray19);
        org.junit.Assert.assertArrayEquals(formatArray19, new java.text.Format[] {});
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.lang.Object[] objArray6 = extendedMessageFormat2.parse("hi!");
        java.lang.Object[] objArray8 = extendedMessageFormat2.parse("hi!");
        java.lang.String str9 = extendedMessageFormat2.toPattern();
        java.lang.String str10 = extendedMessageFormat2.toPattern();
        java.text.ParsePosition parsePosition12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = extendedMessageFormat2.parseObject("hi!", parsePosition12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertArrayEquals(objArray6, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("");
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        java.util.Locale locale7 = extendedMessageFormat2.getLocale();
        java.lang.Object obj8 = extendedMessageFormat2.clone();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.lang.Object[] objArray6 = extendedMessageFormat2.parse("hi!");
        extendedMessageFormat2.applyPattern("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = extendedMessageFormat2.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertArrayEquals(objArray6, new java.lang.Object[] {});
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6);
        java.lang.Object[] objArray9 = extendedMessageFormat7.parse("hi!");
        java.util.Locale locale10 = extendedMessageFormat7.getLocale();
        java.util.Locale locale11 = extendedMessageFormat7.getLocale();
        java.lang.Object[] objArray13 = extendedMessageFormat7.parse("hi!");
        java.text.Format[] formatArray14 = extendedMessageFormat7.getFormatsByArgumentIndex();
        java.lang.Class<?> wildcardClass15 = formatArray14.getClass();
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertArrayEquals(objArray13, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.lang.Object[] objArray6 = extendedMessageFormat2.parse("hi!");
        java.lang.Object[] objArray8 = extendedMessageFormat2.parse("hi!");
        java.lang.String str9 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray10 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray11 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray12 = extendedMessageFormat2.getFormats();
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertArrayEquals(objArray6, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.lang.Object[] objArray4 = extendedMessageFormat2.parse("hi!");
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale7 = extendedMessageFormat2.getLocale();
        java.lang.StringBuffer stringBuffer9 = null;
        java.text.FieldPosition fieldPosition10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer11 = extendedMessageFormat2.format((java.lang.Object) '#', stringBuffer9, fieldPosition10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Character cannot be cast to class [Ljava.lang.Object; (java.lang.Character and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        java.util.Map map4 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map4);
        java.util.Locale locale6 = extendedMessageFormat5.getLocale();
        java.lang.String str7 = extendedMessageFormat5.toPattern();
        java.util.Locale locale8 = extendedMessageFormat5.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale8);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale8);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale8);
        java.lang.Object[] objArray13 = extendedMessageFormat11.parse("hi!");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertArrayEquals(objArray13, new java.lang.Object[] {});
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("");
        java.util.Map map8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map8);
        java.util.Locale locale10 = extendedMessageFormat9.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale10);
        java.lang.String str12 = extendedMessageFormat11.toPattern();
        java.lang.String str13 = extendedMessageFormat11.toPattern();
        java.util.Locale locale14 = extendedMessageFormat11.getLocale();
        java.text.Format[] formatArray15 = extendedMessageFormat11.getFormats();
        java.lang.StringBuffer stringBuffer16 = null;
        java.text.FieldPosition fieldPosition17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer18 = extendedMessageFormat2.format((java.lang.Object[]) formatArray15, stringBuffer16, fieldPosition17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.lang.Object[] objArray4 = extendedMessageFormat2.parse("hi!");
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale7 = extendedMessageFormat2.getLocale();
        java.lang.String str8 = extendedMessageFormat2.toPattern();
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map11);
        java.text.Format[] formatArray13 = extendedMessageFormat12.getFormats();
        java.text.Format[] formatArray14 = extendedMessageFormat12.getFormatsByArgumentIndex();
        java.util.Locale locale15 = extendedMessageFormat12.getLocale();
        java.util.Map map16 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale15, map16);
        extendedMessageFormat2.setLocale(locale15);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale6 = extendedMessageFormat2.getLocale();
        java.lang.Class<?> wildcardClass7 = locale6.getClass();
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("hi!");
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.Class<?> wildcardClass8 = extendedMessageFormat2.getClass();
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.lang.Object[] objArray4 = extendedMessageFormat2.parse("hi!");
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale7 = extendedMessageFormat2.getLocale();
        java.text.ParsePosition parsePosition9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = extendedMessageFormat2.parseObject("hi!", parsePosition9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map7);
        java.util.Locale locale9 = extendedMessageFormat8.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale9);
        extendedMessageFormat10.applyPattern("hi!");
        java.lang.String str13 = extendedMessageFormat10.toPattern();
        java.lang.Object[] objArray15 = extendedMessageFormat10.parse("hi!");
        java.text.Format[] formatArray16 = extendedMessageFormat10.getFormatsByArgumentIndex();
        java.text.Format[] formatArray17 = extendedMessageFormat10.getFormats();
        java.lang.Object[] objArray19 = extendedMessageFormat10.parse("hi!");
        java.lang.String str20 = java.text.MessageFormat.format("hi!", objArray19);
        java.lang.String str21 = java.text.MessageFormat.format("", objArray19);
        java.lang.String str22 = java.text.MessageFormat.format("hi!", objArray19);
        java.lang.String str23 = java.text.MessageFormat.format("", objArray19);
        java.lang.String str24 = java.text.MessageFormat.format("", objArray19);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertArrayEquals(objArray15, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray16);
        org.junit.Assert.assertArrayEquals(formatArray16, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertArrayEquals(objArray19, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        java.util.Map map5 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map5);
        java.util.Locale locale7 = extendedMessageFormat6.getLocale();
        java.lang.String str8 = extendedMessageFormat6.toPattern();
        java.util.Locale locale9 = extendedMessageFormat6.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale9);
        java.lang.Object[] objArray12 = extendedMessageFormat10.parse("hi!");
        java.util.Locale locale13 = extendedMessageFormat10.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale13);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale13);
        java.util.Map map16 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale13, map16);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertArrayEquals(objArray12, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4);
        extendedMessageFormat5.applyPattern("hi!");
        java.lang.String str8 = extendedMessageFormat5.toPattern();
        java.lang.Object[] objArray10 = extendedMessageFormat5.parse("hi!");
        java.lang.Object[] objArray12 = extendedMessageFormat5.parse("hi!");
        java.util.Map map14 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map14);
        java.util.Locale locale16 = extendedMessageFormat15.getLocale();
        java.util.Locale locale17 = extendedMessageFormat15.getLocale();
        java.lang.StringBuffer stringBuffer18 = null;
        java.text.FieldPosition fieldPosition19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer20 = extendedMessageFormat5.format((java.lang.Object) locale17, stringBuffer18, fieldPosition19);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.util.Locale cannot be cast to class [Ljava.lang.Object; (java.util.Locale and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertArrayEquals(objArray12, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "th_TH");
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str8 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("");
        java.util.Map map14 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map14);
        java.util.Locale locale16 = extendedMessageFormat15.getLocale();
        java.lang.Object[] objArray18 = extendedMessageFormat15.parse("hi!");
        java.lang.String str19 = java.text.MessageFormat.format("hi!", objArray18);
        java.lang.String str20 = java.text.MessageFormat.format("hi!", objArray18);
        java.lang.StringBuffer stringBuffer21 = null;
        java.text.FieldPosition fieldPosition22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer23 = extendedMessageFormat2.format((java.lang.Object) "hi!", stringBuffer21, fieldPosition22);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class [Ljava.lang.Object; (java.lang.String and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertArrayEquals(objArray18, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        extendedMessageFormat2.applyPattern("");
        org.junit.Assert.assertNotNull(formatArray3);
        org.junit.Assert.assertArrayEquals(formatArray3, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        java.util.Map map4 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map4);
        java.util.Locale locale6 = extendedMessageFormat5.getLocale();
        java.lang.String str7 = extendedMessageFormat5.toPattern();
        extendedMessageFormat5.applyPattern("hi!");
        java.util.Map map12 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map12);
        java.lang.String str14 = extendedMessageFormat13.toPattern();
        java.text.Format[] formatArray15 = extendedMessageFormat13.getFormatsByArgumentIndex();
        java.util.Locale locale16 = extendedMessageFormat13.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale16);
        extendedMessageFormat5.setLocale(locale16);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale16);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale16);
        java.util.Map map21 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat22 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale16, map21);
        java.util.Locale locale23 = extendedMessageFormat22.getLocale();
        java.lang.Object obj24 = extendedMessageFormat22.clone();
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "th_TH");
        org.junit.Assert.assertNotNull(obj24);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        java.lang.String str7 = extendedMessageFormat2.toPattern();
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map9);
        java.util.Locale locale11 = extendedMessageFormat10.getLocale();
        java.lang.Object[] objArray13 = extendedMessageFormat10.parse("hi!");
        java.text.Format[] formatArray14 = extendedMessageFormat10.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormats(formatArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertArrayEquals(objArray13, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.lang.Object[] objArray6 = extendedMessageFormat2.parse("hi!");
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray9 = extendedMessageFormat2.parse("hi!", parsePosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertArrayEquals(objArray6, new java.lang.Object[] {});
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.lang.Object[] objArray6 = extendedMessageFormat2.parse("hi!");
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.Class<?> wildcardClass8 = formatArray7.getClass();
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertArrayEquals(objArray6, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6);
        java.lang.String str8 = extendedMessageFormat7.toPattern();
        java.lang.String str9 = extendedMessageFormat7.toPattern();
        java.text.Format[] formatArray10 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat7.setFormats(formatArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        extendedMessageFormat3.applyPattern("hi!");
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6);
        java.util.Locale locale8 = extendedMessageFormat7.getLocale();
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        java.util.Map map4 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map4);
        java.util.Locale locale6 = extendedMessageFormat5.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale6);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6);
        java.lang.String str10 = extendedMessageFormat9.toPattern();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale14 = extendedMessageFormat13.getLocale();
        java.lang.String str15 = extendedMessageFormat13.toPattern();
        java.text.Format[] formatArray16 = extendedMessageFormat13.getFormatsByArgumentIndex();
        java.util.Locale locale17 = extendedMessageFormat13.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat9.setFormatByArgumentIndex((-1), (java.text.Format) extendedMessageFormat13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(formatArray16);
        org.junit.Assert.assertArrayEquals(formatArray16, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "th_TH");
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        java.util.Map map3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map3);
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.lang.String str6 = extendedMessageFormat4.toPattern();
        java.util.Locale locale7 = extendedMessageFormat4.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale7);
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale7, map9);
        java.text.ParsePosition parsePosition12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray13 = extendedMessageFormat10.parse("", parsePosition12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.util.Locale locale5 = extendedMessageFormat3.getLocale();
        java.util.Map map6 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale5, map6);
        java.util.Locale locale8 = extendedMessageFormat7.getLocale();
        java.util.Map map12 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map12);
        java.util.Locale locale14 = extendedMessageFormat13.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale14);
        extendedMessageFormat15.applyPattern("hi!");
        java.lang.String str18 = extendedMessageFormat15.toPattern();
        java.lang.Object[] objArray20 = extendedMessageFormat15.parse("hi!");
        java.text.Format[] formatArray21 = extendedMessageFormat15.getFormatsByArgumentIndex();
        java.text.Format[] formatArray22 = extendedMessageFormat15.getFormats();
        extendedMessageFormat15.applyPattern("hi!");
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat7.setFormatByArgumentIndex((int) (short) -1, (java.text.Format) extendedMessageFormat15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertArrayEquals(objArray20, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray21);
        org.junit.Assert.assertArrayEquals(formatArray21, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray22);
        org.junit.Assert.assertArrayEquals(formatArray22, new java.text.Format[] {});
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.lang.String str3 = extendedMessageFormat1.toPattern();
        extendedMessageFormat1.applyPattern("hi!");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        extendedMessageFormat3.applyPattern("hi!");
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map10);
        java.lang.String str12 = extendedMessageFormat11.toPattern();
        java.text.Format[] formatArray13 = extendedMessageFormat11.getFormatsByArgumentIndex();
        java.util.Locale locale14 = extendedMessageFormat11.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale14);
        extendedMessageFormat3.setLocale(locale14);
        java.util.Map map17 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale14, map17);
        java.text.Format[] formatArray19 = extendedMessageFormat18.getFormatsByArgumentIndex();
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray19);
        org.junit.Assert.assertArrayEquals(formatArray19, new java.text.Format[] {});
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        java.util.Map map3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map3);
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.lang.String str6 = extendedMessageFormat4.toPattern();
        java.util.Locale locale7 = extendedMessageFormat4.getLocale();
        java.util.Map map8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale7, map8);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale7);
        java.util.Map map12 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map12);
        java.util.Locale locale14 = extendedMessageFormat13.getLocale();
        java.lang.String str15 = extendedMessageFormat13.toPattern();
        extendedMessageFormat13.applyPattern("hi!");
        java.lang.String str18 = extendedMessageFormat13.toPattern();
        java.util.Locale locale19 = extendedMessageFormat13.getLocale();
        java.text.Format[] formatArray20 = extendedMessageFormat13.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat10.setFormatsByArgumentIndex(formatArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray20);
        org.junit.Assert.assertArrayEquals(formatArray20, new java.text.Format[] {});
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        extendedMessageFormat3.applyPattern("hi!");
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        java.text.Format[] formatArray7 = extendedMessageFormat3.getFormats();
        java.lang.String str8 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray7);
        java.lang.Class<?> wildcardClass9 = formatArray7.getClass();
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        java.util.Map map3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map3);
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.lang.String str6 = extendedMessageFormat4.toPattern();
        java.util.Locale locale7 = extendedMessageFormat4.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale7);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale7);
        java.text.Format[] formatArray10 = extendedMessageFormat9.getFormats();
        java.text.Format[] formatArray11 = extendedMessageFormat9.getFormatsByArgumentIndex();
        extendedMessageFormat9.applyPattern("hi!");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        java.lang.String str7 = extendedMessageFormat2.toPattern();
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map9);
        extendedMessageFormat10.applyPattern("hi!");
        java.lang.Object[] objArray14 = extendedMessageFormat10.parse("hi!");
        java.text.Format[] formatArray15 = extendedMessageFormat10.getFormatsByArgumentIndex();
        java.lang.StringBuffer stringBuffer16 = null;
        java.text.FieldPosition fieldPosition17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer18 = extendedMessageFormat2.format((java.lang.Object) formatArray15, stringBuffer16, fieldPosition17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray3);
        org.junit.Assert.assertArrayEquals(formatArray3, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertArrayEquals(objArray14, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        extendedMessageFormat3.applyPattern("hi!");
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map11);
        java.util.Locale locale13 = extendedMessageFormat12.getLocale();
        java.lang.String str14 = extendedMessageFormat12.toPattern();
        extendedMessageFormat12.applyPattern("hi!");
        java.util.Map map19 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map19);
        java.lang.String str21 = extendedMessageFormat20.toPattern();
        java.text.Format[] formatArray22 = extendedMessageFormat20.getFormatsByArgumentIndex();
        java.util.Locale locale23 = extendedMessageFormat20.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat24 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale23);
        extendedMessageFormat12.setLocale(locale23);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat26 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale23);
        java.util.Map map27 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat28 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale23, map27);
        java.text.Format[] formatArray29 = extendedMessageFormat28.getFormatsByArgumentIndex();
        java.util.Locale locale30 = extendedMessageFormat28.getLocale();
        extendedMessageFormat3.setLocale(locale30);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat32 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale30);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(formatArray22);
        org.junit.Assert.assertArrayEquals(formatArray22, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray29);
        org.junit.Assert.assertArrayEquals(formatArray29, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "th_TH");
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        java.util.Map map4 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map4);
        java.util.Locale locale6 = extendedMessageFormat5.getLocale();
        java.lang.String str7 = extendedMessageFormat5.toPattern();
        java.util.Locale locale8 = extendedMessageFormat5.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale8);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale8);
        java.text.Format[] formatArray11 = extendedMessageFormat10.getFormats();
        java.lang.String str12 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray11);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale6);
        java.util.Map map12 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map12);
        java.util.Locale locale14 = extendedMessageFormat13.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale14);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale14);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale14);
        extendedMessageFormat7.setLocale(locale14);
        extendedMessageFormat7.applyPattern("hi!");
        java.util.Locale locale21 = extendedMessageFormat7.getLocale();
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "th_TH");
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6);
        java.text.Format[] formatArray8 = extendedMessageFormat7.getFormatsByArgumentIndex();
        java.text.ParsePosition parsePosition10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray11 = extendedMessageFormat7.parse("", parsePosition10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        java.util.Map map4 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map4);
        java.util.Locale locale6 = extendedMessageFormat5.getLocale();
        java.lang.String str7 = extendedMessageFormat5.toPattern();
        java.util.Locale locale8 = extendedMessageFormat5.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale8);
        java.lang.String str10 = extendedMessageFormat9.toPattern();
        java.lang.String str11 = extendedMessageFormat9.toPattern();
        java.text.Format[] formatArray12 = extendedMessageFormat9.getFormatsByArgumentIndex();
        java.util.Locale locale13 = extendedMessageFormat9.getLocale();
        java.util.Map map14 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale13, map14);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale13);
        java.text.Format[] formatArray17 = extendedMessageFormat16.getFormats();
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.ParsePosition parsePosition9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray10 = extendedMessageFormat2.parse("hi!", parsePosition9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale6);
        java.util.Map map12 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map12);
        java.util.Locale locale14 = extendedMessageFormat13.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale14);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale14);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale14);
        extendedMessageFormat7.setLocale(locale14);
        java.util.Locale locale20 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale20);
        java.lang.String str22 = extendedMessageFormat7.format((java.lang.Object) locale20);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        java.util.Map map3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map3);
        java.lang.String str5 = extendedMessageFormat4.toPattern();
        java.text.Format[] formatArray6 = extendedMessageFormat4.getFormatsByArgumentIndex();
        java.util.Locale locale7 = extendedMessageFormat4.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale7);
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale7, map9);
        java.text.Format[] formatArray11 = extendedMessageFormat10.getFormatsByArgumentIndex();
        java.util.Map map13 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map13);
        java.util.Locale locale15 = extendedMessageFormat14.getLocale();
        java.util.Locale locale16 = extendedMessageFormat14.getLocale();
        java.util.Locale locale17 = extendedMessageFormat14.getLocale();
        java.text.Format[] formatArray18 = extendedMessageFormat14.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat10.setFormatsByArgumentIndex(formatArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray18);
        org.junit.Assert.assertArrayEquals(formatArray18, new java.text.Format[] {});
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6);
        java.lang.Object[] objArray9 = extendedMessageFormat7.parse("hi!");
        java.util.Locale locale10 = extendedMessageFormat7.getLocale();
        java.util.Locale locale11 = extendedMessageFormat7.getLocale();
        java.text.Format[] formatArray12 = extendedMessageFormat7.getFormats();
        java.util.Locale locale13 = extendedMessageFormat7.getLocale();
        java.lang.Object obj14 = extendedMessageFormat7.clone();
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        extendedMessageFormat2.applyPattern("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = extendedMessageFormat2.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        java.util.Map map4 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map4);
        java.util.Locale locale6 = extendedMessageFormat5.getLocale();
        java.lang.String str7 = extendedMessageFormat5.toPattern();
        java.util.Locale locale8 = extendedMessageFormat5.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale8);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale8);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = extendedMessageFormat11.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        java.util.Map map4 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map4);
        java.util.Locale locale6 = extendedMessageFormat5.getLocale();
        java.lang.String str7 = extendedMessageFormat5.toPattern();
        java.util.Locale locale8 = extendedMessageFormat5.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale8);
        java.text.Format[] formatArray10 = extendedMessageFormat9.getFormatsByArgumentIndex();
        java.lang.String str11 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray10);
        java.lang.String str12 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray10);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        java.util.Map map4 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map4);
        java.util.Locale locale6 = extendedMessageFormat5.getLocale();
        java.lang.String str7 = extendedMessageFormat5.toPattern();
        java.util.Locale locale8 = extendedMessageFormat5.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale8);
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale8, map10);
        java.util.Map map17 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map17);
        java.util.Locale locale19 = extendedMessageFormat18.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale19);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale19);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat22 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale19);
        java.util.Map map23 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat24 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale19, map23);
        extendedMessageFormat11.setLocale(locale19);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat26 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale19);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "th_TH");
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        java.util.Map map3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map3);
        java.lang.String str5 = extendedMessageFormat4.toPattern();
        java.text.Format[] formatArray6 = extendedMessageFormat4.getFormatsByArgumentIndex();
        java.util.Map map8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map8);
        java.util.Locale locale10 = extendedMessageFormat9.getLocale();
        java.lang.String str11 = extendedMessageFormat9.toPattern();
        java.util.Locale locale12 = extendedMessageFormat9.getLocale();
        java.text.Format[] formatArray13 = extendedMessageFormat9.getFormats();
        java.text.AttributedCharacterIterator attributedCharacterIterator14 = extendedMessageFormat4.formatToCharacterIterator((java.lang.Object) formatArray13);
        java.lang.String str15 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray13);
        java.lang.String str16 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray13);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        java.util.Map map4 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map4);
        java.util.Locale locale6 = extendedMessageFormat5.getLocale();
        java.lang.String str7 = extendedMessageFormat5.toPattern();
        java.util.Locale locale8 = extendedMessageFormat5.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale8);
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale8, map10);
        java.util.Map map15 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map15);
        java.util.Locale locale17 = extendedMessageFormat16.getLocale();
        java.lang.String str18 = extendedMessageFormat16.toPattern();
        extendedMessageFormat16.applyPattern("hi!");
        java.util.Map map23 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat24 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map23);
        java.lang.String str25 = extendedMessageFormat24.toPattern();
        java.text.Format[] formatArray26 = extendedMessageFormat24.getFormatsByArgumentIndex();
        java.util.Locale locale27 = extendedMessageFormat24.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat28 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale27);
        extendedMessageFormat16.setLocale(locale27);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat30 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale27);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat31 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale27);
        java.util.Locale locale32 = extendedMessageFormat31.getLocale();
        extendedMessageFormat11.setLocale(locale32);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat34 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale32);
        java.util.Locale locale35 = extendedMessageFormat34.getLocale();
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(formatArray26);
        org.junit.Assert.assertArrayEquals(formatArray26, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "th_TH");
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6);
        java.lang.Object[] objArray9 = extendedMessageFormat7.parse("hi!");
        java.util.Locale locale10 = extendedMessageFormat7.getLocale();
        java.util.Locale locale11 = extendedMessageFormat7.getLocale();
        java.text.Format[] formatArray12 = extendedMessageFormat7.getFormats();
        java.util.Locale locale13 = extendedMessageFormat7.getLocale();
        java.text.Format[] formatArray14 = extendedMessageFormat7.getFormats();
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("");
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        java.util.Locale locale7 = extendedMessageFormat2.getLocale();
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map9);
        java.util.Locale locale11 = extendedMessageFormat10.getLocale();
        java.lang.Object[] objArray13 = extendedMessageFormat10.parse("hi!");
        java.lang.StringBuffer stringBuffer14 = null;
        java.text.FieldPosition fieldPosition15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer16 = extendedMessageFormat2.format(objArray13, stringBuffer14, fieldPosition15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertArrayEquals(objArray13, new java.lang.Object[] {});
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4);
        extendedMessageFormat5.applyPattern("hi!");
        java.lang.String str8 = extendedMessageFormat5.toPattern();
        java.lang.Object[] objArray10 = extendedMessageFormat5.parse("hi!");
        java.text.Format[] formatArray11 = extendedMessageFormat5.getFormatsByArgumentIndex();
        java.text.Format[] formatArray12 = extendedMessageFormat5.getFormats();
        extendedMessageFormat5.applyPattern("hi!");
        java.text.Format[] formatArray15 = extendedMessageFormat5.getFormatsByArgumentIndex();
        extendedMessageFormat5.applyPattern("");
        extendedMessageFormat5.applyPattern("hi!");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        java.util.Map map3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map3);
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.lang.String str6 = extendedMessageFormat4.toPattern();
        java.util.Locale locale7 = extendedMessageFormat4.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale7);
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale7, map9);
        java.lang.Object obj11 = extendedMessageFormat10.clone();
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        java.util.Locale locale2 = null;
        java.util.Map map3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale2, map3);
        java.text.Format[] formatArray5 = extendedMessageFormat4.getFormatsByArgumentIndex();
        java.lang.String str6 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray5);
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        java.util.Map map3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map3);
        java.lang.String str5 = extendedMessageFormat4.toPattern();
        java.text.Format[] formatArray6 = extendedMessageFormat4.getFormatsByArgumentIndex();
        java.lang.String str7 = extendedMessageFormat4.toPattern();
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map10);
        java.util.Locale locale12 = extendedMessageFormat11.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale12);
        extendedMessageFormat4.setLocale(locale12);
        java.util.Map map15 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale12, map15);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale12);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str7 = extendedMessageFormat2.toPattern();
        org.junit.Assert.assertNotNull(formatArray3);
        org.junit.Assert.assertArrayEquals(formatArray3, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        java.util.Map map3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map3);
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.lang.String str6 = extendedMessageFormat4.toPattern();
        java.util.Locale locale7 = extendedMessageFormat4.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale7);
        java.lang.String str9 = extendedMessageFormat8.toPattern();
        java.text.Format[] formatArray10 = extendedMessageFormat8.getFormats();
        java.lang.String str11 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray10);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6);
        java.lang.Object[] objArray9 = extendedMessageFormat7.parse("hi!");
        java.util.Locale locale10 = extendedMessageFormat7.getLocale();
        java.util.Locale locale11 = extendedMessageFormat7.getLocale();
        java.util.Map map15 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map15);
        java.util.Locale locale17 = extendedMessageFormat16.getLocale();
        java.lang.String str18 = extendedMessageFormat16.toPattern();
        java.util.Locale locale19 = extendedMessageFormat16.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale19);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale19);
        extendedMessageFormat7.setLocale(locale19);
        java.lang.Object obj23 = null;
        java.lang.String str24 = extendedMessageFormat7.format(obj23);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray26 = extendedMessageFormat7.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.lang.Object obj6 = extendedMessageFormat2.clone();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4);
        extendedMessageFormat5.applyPattern("hi!");
        java.lang.String str8 = extendedMessageFormat5.toPattern();
        java.lang.Object[] objArray10 = extendedMessageFormat5.parse("hi!");
        java.text.Format[] formatArray11 = extendedMessageFormat5.getFormatsByArgumentIndex();
        java.text.Format[] formatArray12 = extendedMessageFormat5.getFormats();
        extendedMessageFormat5.applyPattern("hi!");
        java.text.Format[] formatArray15 = extendedMessageFormat5.getFormatsByArgumentIndex();
        java.util.Locale locale16 = extendedMessageFormat5.getLocale();
        java.util.Locale locale17 = extendedMessageFormat5.getLocale();
        java.lang.Class<?> wildcardClass18 = locale17.getClass();
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "th_TH");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        java.util.Map map3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map3);
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.lang.String str6 = extendedMessageFormat4.toPattern();
        java.util.Locale locale7 = extendedMessageFormat4.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale7);
        java.util.Map map13 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map13);
        java.util.Locale locale15 = extendedMessageFormat14.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale15);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale15);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale15);
        extendedMessageFormat8.setLocale(locale15);
        java.util.Map map20 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale15, map20);
        java.lang.Object obj22 = extendedMessageFormat21.clone();
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertNotNull(obj22);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = extendedMessageFormat2.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
        java.util.Map map3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map3);
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale5);
        extendedMessageFormat6.applyPattern("hi!");
        java.lang.String str9 = extendedMessageFormat6.toPattern();
        java.lang.String str10 = extendedMessageFormat6.toPattern();
        extendedMessageFormat6.applyPattern("");
        java.util.Locale locale13 = extendedMessageFormat6.getLocale();
        java.util.Map map14 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale13, map14);
        java.lang.Object obj16 = extendedMessageFormat15.clone();
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        java.util.Map map4 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map4);
        java.util.Locale locale6 = extendedMessageFormat5.getLocale();
        java.lang.String str7 = extendedMessageFormat5.toPattern();
        java.util.Locale locale8 = extendedMessageFormat5.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale8);
        java.lang.Object[] objArray11 = extendedMessageFormat9.parse("hi!");
        java.util.Locale locale12 = extendedMessageFormat9.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale12);
        java.util.Locale locale14 = extendedMessageFormat13.getLocale();
        java.util.Map map15 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale14, map15);
        java.util.Locale locale17 = extendedMessageFormat16.getLocale();
        java.lang.Object obj18 = extendedMessageFormat16.clone();
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "th_TH");
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
        java.util.Map map5 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map5);
        java.util.Locale locale7 = extendedMessageFormat6.getLocale();
        java.lang.String str8 = extendedMessageFormat6.toPattern();
        java.util.Locale locale9 = extendedMessageFormat6.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale9);
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale9, map11);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale9);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale9);
        java.text.ParsePosition parsePosition16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray17 = extendedMessageFormat14.parse("", parsePosition16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "th_TH");
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6);
        java.text.ParsePosition parsePosition9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray10 = extendedMessageFormat7.parse("hi!", parsePosition9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map1);
        java.util.Map map4 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map4);
        java.util.Locale locale6 = extendedMessageFormat5.getLocale();
        java.util.Locale locale7 = extendedMessageFormat5.getLocale();
        java.util.Locale locale8 = extendedMessageFormat5.getLocale();
        extendedMessageFormat2.setLocale(locale8);
        java.util.Locale locale10 = extendedMessageFormat2.getLocale();
        java.util.Map map14 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map14);
        java.util.Locale locale16 = extendedMessageFormat15.getLocale();
        java.lang.String str17 = extendedMessageFormat15.toPattern();
        java.util.Locale locale18 = extendedMessageFormat15.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale18);
        java.lang.String str20 = extendedMessageFormat19.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatByArgumentIndex((int) (byte) -1, (java.text.Format) extendedMessageFormat19);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
        java.util.Map map3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map3);
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.lang.String str6 = extendedMessageFormat4.toPattern();
        java.util.Locale locale7 = extendedMessageFormat4.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale7);
        java.lang.Object[] objArray10 = extendedMessageFormat8.parse("hi!");
        java.util.Locale locale11 = extendedMessageFormat8.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale11);
        java.util.Locale locale13 = extendedMessageFormat12.getLocale();
        java.util.Locale locale14 = extendedMessageFormat12.getLocale();
        java.text.Format[] formatArray15 = extendedMessageFormat12.getFormatsByArgumentIndex();
        java.util.Map map18 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map18);
        java.util.Locale locale20 = extendedMessageFormat19.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale20);
        extendedMessageFormat21.applyPattern("hi!");
        java.lang.String str24 = extendedMessageFormat21.toPattern();
        java.lang.Object[] objArray26 = extendedMessageFormat21.parse("hi!");
        java.text.Format[] formatArray27 = extendedMessageFormat21.getFormatsByArgumentIndex();
        java.text.Format[] formatArray28 = extendedMessageFormat21.getFormats();
        java.util.Map map32 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat33 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map32);
        java.util.Locale locale34 = extendedMessageFormat33.getLocale();
        java.lang.String str35 = extendedMessageFormat33.toPattern();
        java.util.Locale locale36 = extendedMessageFormat33.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat37 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale36);
        java.util.Map map38 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat39 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale36, map38);
        extendedMessageFormat21.setLocale(locale36);
        extendedMessageFormat12.setLocale(locale36);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertArrayEquals(objArray26, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray27);
        org.junit.Assert.assertArrayEquals(formatArray27, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray28);
        org.junit.Assert.assertArrayEquals(formatArray28, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "th_TH");
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("");
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        java.util.Locale locale7 = extendedMessageFormat2.getLocale();
        java.lang.Class<?> wildcardClass8 = locale7.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.lang.Object[] objArray4 = extendedMessageFormat2.parse("hi!");
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray7 = extendedMessageFormat2.parse("hi!", parsePosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[] {});
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
        java.util.Map map3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map3);
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale5);
        extendedMessageFormat6.applyPattern("hi!");
        extendedMessageFormat6.applyPattern("hi!");
        extendedMessageFormat6.applyPattern("");
        extendedMessageFormat6.applyPattern("hi!");
        java.text.Format[] formatArray15 = extendedMessageFormat6.getFormatsByArgumentIndex();
        java.lang.Object[] objArray17 = extendedMessageFormat6.parse("hi!");
        java.lang.String str18 = java.text.MessageFormat.format("hi!", objArray17);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertArrayEquals(objArray17, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        java.util.Locale locale1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1);
        extendedMessageFormat2.applyPattern("");
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = extendedMessageFormat2.parseObject("hi!", parsePosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4);
        extendedMessageFormat5.applyPattern("hi!");
        java.lang.String str8 = extendedMessageFormat5.toPattern();
        java.lang.Object[] objArray10 = extendedMessageFormat5.parse("hi!");
        java.text.Format[] formatArray11 = extendedMessageFormat5.getFormatsByArgumentIndex();
        java.text.Format[] formatArray12 = extendedMessageFormat5.getFormats();
        java.util.Map map15 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map15);
        java.lang.String str17 = extendedMessageFormat16.toPattern();
        extendedMessageFormat16.applyPattern("");
        java.lang.String str20 = extendedMessageFormat16.toPattern();
        java.text.Format[] formatArray21 = extendedMessageFormat16.getFormats();
        java.lang.String str22 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray21);
        java.lang.StringBuffer stringBuffer23 = null;
        java.text.FieldPosition fieldPosition24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer25 = extendedMessageFormat5.format((java.lang.Object[]) formatArray21, stringBuffer23, fieldPosition24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(formatArray21);
        org.junit.Assert.assertArrayEquals(formatArray21, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
        java.util.Map map3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map3);
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.lang.String str6 = extendedMessageFormat4.toPattern();
        java.util.Locale locale7 = extendedMessageFormat4.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale7);
        java.lang.Object[] objArray10 = extendedMessageFormat8.parse("hi!");
        java.util.Locale locale11 = extendedMessageFormat8.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale11);
        java.util.Map map16 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map16);
        java.util.Locale locale18 = extendedMessageFormat17.getLocale();
        java.util.Locale locale19 = extendedMessageFormat17.getLocale();
        java.util.Map map20 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale19, map20);
        java.util.Locale locale22 = extendedMessageFormat21.getLocale();
        java.util.Map map23 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat24 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale22, map23);
        extendedMessageFormat12.setLocale(locale22);
        java.text.ParsePosition parsePosition27 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray28 = extendedMessageFormat12.parse("hi!", parsePosition27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "th_TH");
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        extendedMessageFormat2.applyPattern("hi!");
        java.lang.Object[] objArray6 = extendedMessageFormat2.parse("hi!");
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormats();
        java.lang.String str8 = extendedMessageFormat2.toPattern();
        java.util.Map map13 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map13);
        java.util.Locale locale15 = extendedMessageFormat14.getLocale();
        java.lang.String str16 = extendedMessageFormat14.toPattern();
        java.util.Locale locale17 = extendedMessageFormat14.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale17);
        java.util.Map map19 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale17, map19);
        java.util.Map map24 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat25 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map24);
        java.util.Locale locale26 = extendedMessageFormat25.getLocale();
        java.lang.String str27 = extendedMessageFormat25.toPattern();
        extendedMessageFormat25.applyPattern("hi!");
        java.util.Map map32 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat33 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map32);
        java.lang.String str34 = extendedMessageFormat33.toPattern();
        java.text.Format[] formatArray35 = extendedMessageFormat33.getFormatsByArgumentIndex();
        java.util.Locale locale36 = extendedMessageFormat33.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat37 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale36);
        extendedMessageFormat25.setLocale(locale36);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat39 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale36);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat40 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale36);
        java.util.Locale locale41 = extendedMessageFormat40.getLocale();
        extendedMessageFormat20.setLocale(locale41);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat43 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale41);
        extendedMessageFormat2.setLocale(locale41);
        java.lang.Object obj45 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator46 = extendedMessageFormat2.formatToCharacterIterator(obj45);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Object cannot be cast to class [Ljava.lang.Object; (java.lang.Object and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertArrayEquals(objArray6, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(formatArray35);
        org.junit.Assert.assertArrayEquals(formatArray35, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "th_TH");
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale7 = extendedMessageFormat2.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = extendedMessageFormat2.format((java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Long cannot be cast to class [Ljava.lang.Object; (java.lang.Long and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray3);
        org.junit.Assert.assertArrayEquals(formatArray3, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
        java.util.Map map3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map3);
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.lang.String str6 = extendedMessageFormat4.toPattern();
        java.util.Locale locale7 = extendedMessageFormat4.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale7);
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale7, map9);
        java.util.Map map16 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map16);
        java.util.Locale locale18 = extendedMessageFormat17.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale18);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale18);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale18);
        java.util.Map map22 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat23 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale18, map22);
        extendedMessageFormat10.setLocale(locale18);
        java.text.Format[] formatArray25 = extendedMessageFormat10.getFormatsByArgumentIndex();
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray25);
        org.junit.Assert.assertArrayEquals(formatArray25, new java.text.Format[] {});
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
        java.util.Locale locale1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormats();
        extendedMessageFormat2.applyPattern("hi!");
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormatsByArgumentIndex();
        org.junit.Assert.assertNull(locale3);
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.text.Format[] formatArray5 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map9);
        java.util.Locale locale11 = extendedMessageFormat10.getLocale();
        java.lang.String str12 = extendedMessageFormat10.toPattern();
        java.util.Locale locale13 = extendedMessageFormat10.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale13);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale13);
        extendedMessageFormat3.setLocale(locale13);
        java.util.Map map17 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale13, map17);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
        java.util.Map map4 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map4);
        java.util.Locale locale6 = extendedMessageFormat5.getLocale();
        java.lang.String str7 = extendedMessageFormat5.toPattern();
        java.util.Locale locale8 = extendedMessageFormat5.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale8);
        java.lang.String str10 = extendedMessageFormat9.toPattern();
        java.lang.String str11 = extendedMessageFormat9.toPattern();
        java.text.Format[] formatArray12 = extendedMessageFormat9.getFormatsByArgumentIndex();
        java.lang.String str13 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray12);
        java.lang.String str14 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray12);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4);
        extendedMessageFormat5.applyPattern("hi!");
        java.lang.String str8 = extendedMessageFormat5.toPattern();
        java.lang.String str9 = extendedMessageFormat5.toPattern();
        java.lang.String str10 = extendedMessageFormat5.toPattern();
        java.util.Map map14 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map14);
        java.util.Locale locale16 = extendedMessageFormat15.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale16);
        extendedMessageFormat17.applyPattern("hi!");
        java.lang.String str20 = extendedMessageFormat17.toPattern();
        java.lang.Object[] objArray22 = extendedMessageFormat17.parse("hi!");
        java.text.Format[] formatArray23 = extendedMessageFormat17.getFormatsByArgumentIndex();
        java.text.Format[] formatArray24 = extendedMessageFormat17.getFormats();
        extendedMessageFormat17.applyPattern("hi!");
        java.text.Format[] formatArray27 = extendedMessageFormat17.getFormatsByArgumentIndex();
        java.lang.String str28 = extendedMessageFormat17.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat5.setFormat(100, (java.text.Format) extendedMessageFormat17);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertArrayEquals(objArray22, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray23);
        org.junit.Assert.assertArrayEquals(formatArray23, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray24);
        org.junit.Assert.assertArrayEquals(formatArray24, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray27);
        org.junit.Assert.assertArrayEquals(formatArray27, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4);
        extendedMessageFormat5.applyPattern("hi!");
        extendedMessageFormat5.applyPattern("hi!");
        extendedMessageFormat5.applyPattern("");
        extendedMessageFormat5.applyPattern("hi!");
        java.lang.Class<?> wildcardClass14 = extendedMessageFormat5.getClass();
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        java.lang.String str6 = extendedMessageFormat3.toPattern();
        java.text.Format[] formatArray7 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.lang.Object obj8 = null;
        java.lang.String str9 = extendedMessageFormat3.format(obj8);
        java.util.Locale locale10 = extendedMessageFormat3.getLocale();
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale10, map11);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
        java.util.Map map3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map3);
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.lang.String str6 = extendedMessageFormat4.toPattern();
        java.util.Locale locale7 = extendedMessageFormat4.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale7);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale7);
        java.text.Format[] formatArray10 = extendedMessageFormat9.getFormats();
        java.text.Format[] formatArray11 = extendedMessageFormat9.getFormatsByArgumentIndex();
        java.text.ParsePosition parsePosition13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray14 = extendedMessageFormat9.parse("", parsePosition13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
        java.util.Map map5 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map5);
        java.util.Locale locale7 = extendedMessageFormat6.getLocale();
        java.lang.String str8 = extendedMessageFormat6.toPattern();
        extendedMessageFormat6.applyPattern("hi!");
        java.util.Map map13 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map13);
        java.lang.String str15 = extendedMessageFormat14.toPattern();
        java.text.Format[] formatArray16 = extendedMessageFormat14.getFormatsByArgumentIndex();
        java.util.Locale locale17 = extendedMessageFormat14.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale17);
        extendedMessageFormat6.setLocale(locale17);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale17);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale17);
        java.util.Map map22 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat23 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale17, map22);
        java.util.Map map24 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat25 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale17, map24);
        extendedMessageFormat25.applyPattern("hi!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(formatArray16);
        org.junit.Assert.assertArrayEquals(formatArray16, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "th_TH");
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4);
        extendedMessageFormat5.applyPattern("hi!");
        java.lang.String str8 = extendedMessageFormat5.toPattern();
        java.lang.Object[] objArray10 = extendedMessageFormat5.parse("hi!");
        java.text.Format[] formatArray11 = extendedMessageFormat5.getFormatsByArgumentIndex();
        java.text.Format[] formatArray12 = extendedMessageFormat5.getFormats();
        extendedMessageFormat5.applyPattern("hi!");
        java.text.Format[] formatArray15 = extendedMessageFormat5.getFormatsByArgumentIndex();
        java.util.Locale locale16 = extendedMessageFormat5.getLocale();
        java.util.Locale locale17 = extendedMessageFormat5.getLocale();
        java.lang.Object obj18 = extendedMessageFormat5.clone();
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "th_TH");
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6);
        java.text.Format[] formatArray8 = extendedMessageFormat7.getFormats();
        java.util.Map map15 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map15);
        java.util.Locale locale17 = extendedMessageFormat16.getLocale();
        java.lang.String str18 = extendedMessageFormat16.toPattern();
        java.util.Locale locale19 = extendedMessageFormat16.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale19);
        java.util.Map map21 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat22 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale19, map21);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat23 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale19);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat24 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale19);
        java.util.Map map25 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat26 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale19, map25);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator27 = extendedMessageFormat7.formatToCharacterIterator((java.lang.Object) extendedMessageFormat26);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "th_TH");
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.lang.Object[] objArray6 = extendedMessageFormat2.parse("hi!");
        java.lang.Object[] objArray8 = extendedMessageFormat2.parse("hi!");
        java.lang.String str9 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray10 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray13 = extendedMessageFormat2.getFormats();
        java.lang.Class<?> wildcardClass14 = extendedMessageFormat2.getClass();
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertArrayEquals(objArray6, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
        java.util.Map map3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map3);
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.lang.String str6 = extendedMessageFormat4.toPattern();
        extendedMessageFormat4.applyPattern("hi!");
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map11);
        java.lang.String str13 = extendedMessageFormat12.toPattern();
        java.text.Format[] formatArray14 = extendedMessageFormat12.getFormatsByArgumentIndex();
        java.util.Locale locale15 = extendedMessageFormat12.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale15);
        extendedMessageFormat4.setLocale(locale15);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale15);
        java.util.Map map19 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale15, map19);
        java.text.Format[] formatArray21 = extendedMessageFormat20.getFormatsByArgumentIndex();
        java.lang.Object[] objArray22 = null;
        java.lang.StringBuffer stringBuffer23 = null;
        java.text.FieldPosition fieldPosition24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer25 = extendedMessageFormat20.format(objArray22, stringBuffer23, fieldPosition24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray21);
        org.junit.Assert.assertArrayEquals(formatArray21, new java.text.Format[] {});
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map2);
        java.util.Map map5 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map5);
        java.util.Locale locale7 = extendedMessageFormat6.getLocale();
        java.util.Locale locale8 = extendedMessageFormat6.getLocale();
        java.util.Locale locale9 = extendedMessageFormat6.getLocale();
        extendedMessageFormat3.setLocale(locale9);
        java.util.Locale locale11 = extendedMessageFormat3.getLocale();
        java.util.Map map12 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale11, map12);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "th_TH");
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
        java.util.Map map3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map3);
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.util.Locale locale6 = extendedMessageFormat4.getLocale();
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6, map7);
        java.util.Locale locale9 = extendedMessageFormat8.getLocale();
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale9, map10);
        java.util.Map map13 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map13);
        java.util.Locale locale15 = extendedMessageFormat14.getLocale();
        java.util.Locale locale16 = extendedMessageFormat14.getLocale();
        java.util.Locale locale17 = extendedMessageFormat14.getLocale();
        java.text.Format[] formatArray18 = extendedMessageFormat14.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat11.setFormats(formatArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray18);
        org.junit.Assert.assertArrayEquals(formatArray18, new java.text.Format[] {});
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        java.lang.Object obj7 = extendedMessageFormat2.clone();
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
        java.util.Map map3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map3);
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale5);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale5);
        extendedMessageFormat7.applyPattern("hi!");
        java.util.Map map12 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map12);
        java.util.Locale locale14 = extendedMessageFormat13.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale14);
        extendedMessageFormat15.applyPattern("hi!");
        java.lang.String str18 = extendedMessageFormat15.toPattern();
        java.lang.String str19 = extendedMessageFormat15.toPattern();
        extendedMessageFormat15.applyPattern("");
        java.util.Locale locale22 = extendedMessageFormat15.getLocale();
        java.text.Format[] formatArray23 = extendedMessageFormat15.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat7.setFormats(formatArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray23);
        org.junit.Assert.assertArrayEquals(formatArray23, new java.text.Format[] {});
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test596");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.Object[] objArray5 = extendedMessageFormat2.parse("hi!");
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale9);
        java.lang.String str11 = extendedMessageFormat10.toPattern();
        java.lang.StringBuffer stringBuffer12 = null;
        java.text.FieldPosition fieldPosition13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer14 = extendedMessageFormat2.format((java.lang.Object) extendedMessageFormat10, stringBuffer12, fieldPosition13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("hi!");
        org.junit.Assert.assertNotNull(formatArray3);
        org.junit.Assert.assertArrayEquals(formatArray3, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test598");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4);
        extendedMessageFormat5.applyPattern("hi!");
        extendedMessageFormat5.applyPattern("hi!");
        java.util.Map map13 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map13);
        java.util.Locale locale15 = extendedMessageFormat14.getLocale();
        java.lang.String str16 = extendedMessageFormat14.toPattern();
        extendedMessageFormat14.applyPattern("hi!");
        java.util.Map map21 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat22 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map21);
        java.lang.String str23 = extendedMessageFormat22.toPattern();
        java.text.Format[] formatArray24 = extendedMessageFormat22.getFormatsByArgumentIndex();
        java.util.Locale locale25 = extendedMessageFormat22.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat26 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale25);
        extendedMessageFormat14.setLocale(locale25);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat28 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale25);
        java.util.Map map29 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat30 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale25, map29);
        java.text.Format[] formatArray31 = extendedMessageFormat30.getFormatsByArgumentIndex();
        boolean boolean32 = extendedMessageFormat5.equals((java.lang.Object) extendedMessageFormat30);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(formatArray24);
        org.junit.Assert.assertArrayEquals(formatArray24, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray31);
        org.junit.Assert.assertArrayEquals(formatArray31, new java.text.Format[] {});
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test599");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4);
        extendedMessageFormat5.applyPattern("hi!");
        java.lang.String str8 = extendedMessageFormat5.toPattern();
        java.lang.String str9 = extendedMessageFormat5.toPattern();
        java.lang.String str10 = extendedMessageFormat5.toPattern();
        java.text.Format[] formatArray11 = extendedMessageFormat5.getFormatsByArgumentIndex();
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test600");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4);
        extendedMessageFormat5.applyPattern("hi!");
        extendedMessageFormat5.applyPattern("hi!");
        java.util.Map map13 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map13);
        java.util.Locale locale15 = extendedMessageFormat14.getLocale();
        java.lang.String str16 = extendedMessageFormat14.toPattern();
        java.util.Locale locale17 = extendedMessageFormat14.getLocale();
        java.util.Map map18 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale17, map18);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale17);
        extendedMessageFormat5.setLocale(locale17);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "th_TH");
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test601");
        java.util.Map map5 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map5);
        java.util.Locale locale7 = extendedMessageFormat6.getLocale();
        java.lang.String str8 = extendedMessageFormat6.toPattern();
        extendedMessageFormat6.applyPattern("hi!");
        java.util.Map map13 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map13);
        java.lang.String str15 = extendedMessageFormat14.toPattern();
        java.text.Format[] formatArray16 = extendedMessageFormat14.getFormatsByArgumentIndex();
        java.util.Locale locale17 = extendedMessageFormat14.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale17);
        extendedMessageFormat6.setLocale(locale17);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale17);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale17);
        java.util.Map map22 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat23 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale17, map22);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat24 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale17);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(formatArray16);
        org.junit.Assert.assertArrayEquals(formatArray16, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "th_TH");
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test602");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.lang.Object[] objArray6 = extendedMessageFormat2.parse("hi!");
        java.lang.Object[] objArray8 = extendedMessageFormat2.parse("hi!");
        java.lang.String str9 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray10 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray11 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.ParsePosition parsePosition13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray14 = extendedMessageFormat2.parse("", parsePosition13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertArrayEquals(objArray6, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test603");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.Object obj7 = null;
        java.lang.String str8 = extendedMessageFormat2.format(obj7);
        extendedMessageFormat2.applyPattern("");
        java.lang.String str11 = extendedMessageFormat2.toPattern();
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test604");
        java.util.Locale locale1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1);
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray6 = extendedMessageFormat2.parse("hi!", parsePosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test605");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4);
        extendedMessageFormat5.applyPattern("hi!");
        extendedMessageFormat5.applyPattern("hi!");
        extendedMessageFormat5.applyPattern("");
        extendedMessageFormat5.applyPattern("hi!");
        java.text.Format[] formatArray14 = extendedMessageFormat5.getFormatsByArgumentIndex();
        java.lang.Object[] objArray16 = extendedMessageFormat5.parse("hi!");
        java.text.ParsePosition parsePosition18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray19 = extendedMessageFormat5.parse("hi!", parsePosition18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertArrayEquals(objArray16, new java.lang.Object[] {});
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test606");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        java.lang.String str7 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray8 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale9 = extendedMessageFormat2.getLocale();
        org.junit.Assert.assertNotNull(formatArray3);
        org.junit.Assert.assertArrayEquals(formatArray3, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "th_TH");
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test607");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6);
        java.lang.Object[] objArray9 = extendedMessageFormat7.parse("hi!");
        java.util.Locale locale10 = extendedMessageFormat7.getLocale();
        java.util.Locale locale11 = extendedMessageFormat7.getLocale();
        java.text.Format[] formatArray12 = extendedMessageFormat7.getFormats();
        java.util.Map map14 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map14);
        java.text.Format[] formatArray16 = extendedMessageFormat15.getFormats();
        java.text.Format[] formatArray17 = extendedMessageFormat15.getFormatsByArgumentIndex();
        java.util.Locale locale18 = extendedMessageFormat15.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator19 = extendedMessageFormat7.formatToCharacterIterator((java.lang.Object) extendedMessageFormat15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray16);
        org.junit.Assert.assertArrayEquals(formatArray16, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "th_TH");
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test608");
        java.util.Map map4 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map4);
        java.util.Locale locale6 = extendedMessageFormat5.getLocale();
        java.util.Locale locale7 = extendedMessageFormat5.getLocale();
        java.util.Map map8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale7, map8);
        java.util.Locale locale10 = extendedMessageFormat9.getLocale();
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale10, map11);
        java.util.Map map13 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale10, map13);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test609");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        extendedMessageFormat3.applyPattern("hi!");
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map10);
        java.lang.String str12 = extendedMessageFormat11.toPattern();
        java.text.Format[] formatArray13 = extendedMessageFormat11.getFormatsByArgumentIndex();
        java.util.Locale locale14 = extendedMessageFormat11.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale14);
        extendedMessageFormat3.setLocale(locale14);
        java.util.Map map17 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale14, map17);
        java.text.Format[] formatArray19 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat18.setFormats(formatArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test610");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.lang.String str2 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray3 = extendedMessageFormat1.getFormats();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(formatArray3);
        org.junit.Assert.assertArrayEquals(formatArray3, new java.text.Format[] {});
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test611");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map1);
        java.util.Map map4 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map4);
        java.lang.String str6 = extendedMessageFormat5.toPattern();
        java.text.Format[] formatArray7 = extendedMessageFormat5.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormats(formatArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test612");
        java.util.Map map4 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map4);
        java.util.Locale locale6 = extendedMessageFormat5.getLocale();
        java.lang.String str7 = extendedMessageFormat5.toPattern();
        java.util.Locale locale8 = extendedMessageFormat5.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale8);
        java.text.Format[] formatArray10 = extendedMessageFormat9.getFormats();
        java.lang.String str11 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray10);
        java.lang.String str12 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray10);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test613");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4);
        extendedMessageFormat5.applyPattern("hi!");
        extendedMessageFormat5.applyPattern("hi!");
        java.lang.String str10 = extendedMessageFormat5.toPattern();
        java.util.Locale locale13 = null;
        java.util.Map map14 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale13, map14);
        java.text.Format[] formatArray16 = extendedMessageFormat15.getFormatsByArgumentIndex();
        java.lang.String str17 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray16);
        java.lang.StringBuffer stringBuffer18 = null;
        java.text.FieldPosition fieldPosition19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer20 = extendedMessageFormat5.format((java.lang.Object[]) formatArray16, stringBuffer18, fieldPosition19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(formatArray16);
        org.junit.Assert.assertArrayEquals(formatArray16, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test614");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        extendedMessageFormat2.applyPattern("hi!");
        java.lang.Object[] objArray6 = extendedMessageFormat2.parse("hi!");
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormats();
        java.lang.String str8 = extendedMessageFormat2.toPattern();
        java.util.Map map13 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map13);
        java.util.Locale locale15 = extendedMessageFormat14.getLocale();
        java.lang.String str16 = extendedMessageFormat14.toPattern();
        java.util.Locale locale17 = extendedMessageFormat14.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale17);
        java.util.Map map19 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale17, map19);
        java.util.Map map24 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat25 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map24);
        java.util.Locale locale26 = extendedMessageFormat25.getLocale();
        java.lang.String str27 = extendedMessageFormat25.toPattern();
        extendedMessageFormat25.applyPattern("hi!");
        java.util.Map map32 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat33 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map32);
        java.lang.String str34 = extendedMessageFormat33.toPattern();
        java.text.Format[] formatArray35 = extendedMessageFormat33.getFormatsByArgumentIndex();
        java.util.Locale locale36 = extendedMessageFormat33.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat37 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale36);
        extendedMessageFormat25.setLocale(locale36);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat39 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale36);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat40 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale36);
        java.util.Locale locale41 = extendedMessageFormat40.getLocale();
        extendedMessageFormat20.setLocale(locale41);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat43 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale41);
        extendedMessageFormat2.setLocale(locale41);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj46 = extendedMessageFormat2.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertArrayEquals(objArray6, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(formatArray35);
        org.junit.Assert.assertArrayEquals(formatArray35, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "th_TH");
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test615");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        extendedMessageFormat3.applyPattern("hi!");
        java.text.Format[] formatArray8 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.lang.String str9 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray8);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test616");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("hi!");
        java.lang.String str7 = extendedMessageFormat2.toPattern();
        java.util.Locale locale8 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray9 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray10 = extendedMessageFormat2.getFormatsByArgumentIndex();
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test617");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.Object obj8 = null;
        boolean boolean9 = extendedMessageFormat2.equals(obj8);
        org.junit.Assert.assertNotNull(formatArray3);
        org.junit.Assert.assertArrayEquals(formatArray3, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test618");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4);
        extendedMessageFormat5.applyPattern("hi!");
        java.lang.String str8 = extendedMessageFormat5.toPattern();
        java.lang.Object[] objArray10 = extendedMessageFormat5.parse("hi!");
        java.text.Format[] formatArray11 = extendedMessageFormat5.getFormatsByArgumentIndex();
        java.text.Format[] formatArray12 = extendedMessageFormat5.getFormats();
        java.lang.Object[] objArray14 = extendedMessageFormat5.parse("hi!");
        java.util.Map map17 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map17);
        java.util.Locale locale19 = extendedMessageFormat18.getLocale();
        java.lang.String str20 = extendedMessageFormat18.toPattern();
        java.util.Locale locale21 = extendedMessageFormat18.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat22 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale21);
        java.lang.String str23 = extendedMessageFormat22.toPattern();
        java.lang.String str24 = extendedMessageFormat22.toPattern();
        java.text.Format[] formatArray25 = extendedMessageFormat22.getFormatsByArgumentIndex();
        java.util.Locale locale26 = extendedMessageFormat22.getLocale();
        boolean boolean27 = extendedMessageFormat5.equals((java.lang.Object) locale26);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertArrayEquals(objArray14, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(formatArray25);
        org.junit.Assert.assertArrayEquals(formatArray25, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test619");
        java.util.Map map3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map3);
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.lang.String str6 = extendedMessageFormat4.toPattern();
        java.util.Locale locale7 = extendedMessageFormat4.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale7);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale7);
        java.util.Locale locale10 = extendedMessageFormat9.getLocale();
        java.text.Format[] formatArray11 = extendedMessageFormat9.getFormatsByArgumentIndex();
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test620");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale7 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray8 = extendedMessageFormat2.getFormatsByArgumentIndex();
        org.junit.Assert.assertNotNull(formatArray3);
        org.junit.Assert.assertArrayEquals(formatArray3, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test621");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale1, map2);
        java.lang.String str4 = extendedMessageFormat3.toPattern();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test622");
        java.util.Map map3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map3);
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale5);
        extendedMessageFormat6.applyPattern("hi!");
        java.lang.String str9 = extendedMessageFormat6.toPattern();
        java.lang.Object[] objArray11 = extendedMessageFormat6.parse("hi!");
        java.text.Format[] formatArray12 = extendedMessageFormat6.getFormatsByArgumentIndex();
        java.lang.String str13 = extendedMessageFormat6.toPattern();
        java.util.Locale locale14 = extendedMessageFormat6.getLocale();
        java.util.Map map15 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale14, map15);
        java.lang.Object obj17 = null;
        java.lang.StringBuffer stringBuffer18 = null;
        java.text.FieldPosition fieldPosition19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer20 = extendedMessageFormat16.format(obj17, stringBuffer18, fieldPosition19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test623");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        java.lang.String str7 = extendedMessageFormat2.toPattern();
        java.text.ParsePosition parsePosition9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = extendedMessageFormat2.parseObject("", parsePosition9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray3);
        org.junit.Assert.assertArrayEquals(formatArray3, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test624");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        extendedMessageFormat3.applyPattern("hi!");
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map10);
        java.lang.String str12 = extendedMessageFormat11.toPattern();
        java.text.Format[] formatArray13 = extendedMessageFormat11.getFormatsByArgumentIndex();
        java.util.Locale locale14 = extendedMessageFormat11.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale14);
        extendedMessageFormat3.setLocale(locale14);
        java.util.Map map17 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale14, map17);
        java.util.Map map21 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat22 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map21);
        extendedMessageFormat22.applyPattern("hi!");
        java.text.Format[] formatArray25 = extendedMessageFormat22.getFormats();
        java.lang.String str26 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray25);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator27 = extendedMessageFormat18.formatToCharacterIterator((java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class [Ljava.lang.Object; (java.lang.String and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray25);
        org.junit.Assert.assertArrayEquals(formatArray25, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test625");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormats();
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map9);
        java.util.Locale locale11 = extendedMessageFormat10.getLocale();
        java.lang.String str12 = extendedMessageFormat10.toPattern();
        java.util.Locale locale13 = extendedMessageFormat10.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale13);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale13);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale13);
        extendedMessageFormat3.setLocale(locale13);
        java.util.Map map18 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale13, map18);
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test626");
        java.util.Map map3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map3);
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.lang.String str6 = extendedMessageFormat4.toPattern();
        java.lang.Object[] objArray8 = extendedMessageFormat4.parse("hi!");
        java.lang.Object[] objArray10 = extendedMessageFormat4.parse("hi!");
        java.lang.String str11 = extendedMessageFormat4.toPattern();
        java.text.Format[] formatArray12 = extendedMessageFormat4.getFormatsByArgumentIndex();
        java.lang.String str13 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray12);
        java.lang.String str14 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray12);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test627");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale6);
        java.text.Format[] formatArray8 = extendedMessageFormat7.getFormats();
        java.text.Format[] formatArray9 = extendedMessageFormat7.getFormats();
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test628");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        extendedMessageFormat2.applyPattern("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray8 = extendedMessageFormat2.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray3);
        org.junit.Assert.assertArrayEquals(formatArray3, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test629");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        java.util.Locale locale6 = extendedMessageFormat2.getLocale();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = extendedMessageFormat2.parseObject("", parsePosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray3);
        org.junit.Assert.assertArrayEquals(formatArray3, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test630");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.Object obj7 = null;
        java.lang.String str8 = extendedMessageFormat2.format(obj7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray10 = extendedMessageFormat2.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test631");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormats();
        java.lang.String str8 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray9 = extendedMessageFormat2.getFormats();
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test632");
        java.util.Map map3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map3);
        extendedMessageFormat4.applyPattern("hi!");
        java.util.Locale locale7 = extendedMessageFormat4.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale7);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale7);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test633");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale7 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray8 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray9 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str10 = extendedMessageFormat2.toPattern();
        org.junit.Assert.assertNotNull(formatArray3);
        org.junit.Assert.assertArrayEquals(formatArray3, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test634");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4);
        extendedMessageFormat5.applyPattern("hi!");
        java.lang.String str8 = extendedMessageFormat5.toPattern();
        java.lang.Object[] objArray10 = extendedMessageFormat5.parse("hi!");
        java.text.Format[] formatArray11 = extendedMessageFormat5.getFormatsByArgumentIndex();
        java.text.Format[] formatArray12 = extendedMessageFormat5.getFormats();
        java.util.Map map16 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map16);
        java.util.Locale locale18 = extendedMessageFormat17.getLocale();
        java.lang.String str19 = extendedMessageFormat17.toPattern();
        java.util.Locale locale20 = extendedMessageFormat17.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale20);
        java.util.Map map22 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat23 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale20, map22);
        extendedMessageFormat5.setLocale(locale20);
        java.text.Format[] formatArray25 = extendedMessageFormat5.getFormatsByArgumentIndex();
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray25);
        org.junit.Assert.assertArrayEquals(formatArray25, new java.text.Format[] {});
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test635");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        extendedMessageFormat3.applyPattern("hi!");
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map10);
        java.lang.String str12 = extendedMessageFormat11.toPattern();
        java.text.Format[] formatArray13 = extendedMessageFormat11.getFormatsByArgumentIndex();
        java.util.Locale locale14 = extendedMessageFormat11.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale14);
        extendedMessageFormat3.setLocale(locale14);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale14);
        java.text.ParsePosition parsePosition19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = extendedMessageFormat17.parseObject("", parsePosition19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test636");
        java.util.Map map3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map3);
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.lang.String str6 = extendedMessageFormat4.toPattern();
        extendedMessageFormat4.applyPattern("hi!");
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map11);
        java.lang.String str13 = extendedMessageFormat12.toPattern();
        java.text.Format[] formatArray14 = extendedMessageFormat12.getFormatsByArgumentIndex();
        java.util.Locale locale15 = extendedMessageFormat12.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale15);
        extendedMessageFormat4.setLocale(locale15);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale15);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale15);
        extendedMessageFormat19.applyPattern("");
        java.lang.String str22 = extendedMessageFormat19.toPattern();
        java.text.Format[] formatArray23 = extendedMessageFormat19.getFormatsByArgumentIndex();
        java.util.Locale locale24 = extendedMessageFormat19.getLocale();
        extendedMessageFormat19.applyPattern("");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(formatArray23);
        org.junit.Assert.assertArrayEquals(formatArray23, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "th_TH");
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test637");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str6 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray5);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test638");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        java.util.Map map6 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map6);
        java.util.Locale locale8 = extendedMessageFormat7.getLocale();
        java.util.Locale locale9 = extendedMessageFormat7.getLocale();
        java.util.Locale locale10 = extendedMessageFormat7.getLocale();
        extendedMessageFormat2.setLocale(locale10);
        java.util.Map map14 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map14);
        java.util.Locale locale16 = extendedMessageFormat15.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale16);
        extendedMessageFormat17.applyPattern("hi!");
        java.lang.String str20 = extendedMessageFormat17.toPattern();
        java.lang.Object[] objArray22 = extendedMessageFormat17.parse("hi!");
        java.util.Locale locale23 = extendedMessageFormat17.getLocale();
        extendedMessageFormat2.setLocale(locale23);
        java.text.ParsePosition parsePosition26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray27 = extendedMessageFormat2.parse("", parsePosition26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray3);
        org.junit.Assert.assertArrayEquals(formatArray3, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertArrayEquals(objArray22, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "th_TH");
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test639");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.lang.Object[] objArray6 = extendedMessageFormat2.parse("hi!");
        extendedMessageFormat2.applyPattern("");
        extendedMessageFormat2.applyPattern("hi!");
        java.lang.Object[] objArray12 = extendedMessageFormat2.parse("hi!");
        java.util.Locale locale13 = extendedMessageFormat2.getLocale();
        java.lang.Object obj14 = extendedMessageFormat2.clone();
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertArrayEquals(objArray6, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertArrayEquals(objArray12, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test640");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4);
        extendedMessageFormat5.applyPattern("hi!");
        java.lang.String str8 = extendedMessageFormat5.toPattern();
        java.lang.Object[] objArray10 = extendedMessageFormat5.parse("hi!");
        java.text.Format[] formatArray11 = extendedMessageFormat5.getFormatsByArgumentIndex();
        java.text.Format[] formatArray12 = extendedMessageFormat5.getFormats();
        extendedMessageFormat5.applyPattern("hi!");
        java.lang.Object[] objArray16 = extendedMessageFormat5.parse("hi!");
        java.lang.Class<?> wildcardClass17 = objArray16.getClass();
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertArrayEquals(objArray16, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test641");
        java.util.Map map5 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map5);
        java.util.Locale locale7 = extendedMessageFormat6.getLocale();
        java.lang.String str8 = extendedMessageFormat6.toPattern();
        extendedMessageFormat6.applyPattern("hi!");
        java.util.Map map13 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map13);
        java.lang.String str15 = extendedMessageFormat14.toPattern();
        java.text.Format[] formatArray16 = extendedMessageFormat14.getFormatsByArgumentIndex();
        java.util.Locale locale17 = extendedMessageFormat14.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale17);
        extendedMessageFormat6.setLocale(locale17);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale17);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale17);
        java.util.Map map22 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat23 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale17, map22);
        java.util.Map map24 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat25 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale17, map24);
        java.util.Locale locale26 = extendedMessageFormat25.getLocale();
        java.text.Format[] formatArray27 = extendedMessageFormat25.getFormats();
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(formatArray16);
        org.junit.Assert.assertArrayEquals(formatArray16, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray27);
        org.junit.Assert.assertArrayEquals(formatArray27, new java.text.Format[] {});
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test642");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        extendedMessageFormat3.applyPattern("hi!");
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map10);
        java.lang.String str12 = extendedMessageFormat11.toPattern();
        java.text.Format[] formatArray13 = extendedMessageFormat11.getFormatsByArgumentIndex();
        java.util.Locale locale14 = extendedMessageFormat11.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale14);
        extendedMessageFormat3.setLocale(locale14);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale14);
        java.util.Locale locale18 = extendedMessageFormat17.getLocale();
        java.util.Map map23 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat24 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map23);
        java.util.Locale locale25 = extendedMessageFormat24.getLocale();
        java.lang.String str26 = extendedMessageFormat24.toPattern();
        java.util.Locale locale27 = extendedMessageFormat24.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat28 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale27);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat29 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale27);
        java.util.Map map30 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat31 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale27, map30);
        java.text.Format[] formatArray32 = extendedMessageFormat31.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat17.setFormatsByArgumentIndex(formatArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray32);
        org.junit.Assert.assertArrayEquals(formatArray32, new java.text.Format[] {});
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test643");
        java.util.Map map5 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map5);
        java.util.Locale locale7 = extendedMessageFormat6.getLocale();
        java.lang.String str8 = extendedMessageFormat6.toPattern();
        java.util.Locale locale9 = extendedMessageFormat6.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale9);
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale9, map11);
        java.util.Map map16 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map16);
        java.util.Locale locale18 = extendedMessageFormat17.getLocale();
        java.lang.String str19 = extendedMessageFormat17.toPattern();
        extendedMessageFormat17.applyPattern("hi!");
        java.util.Map map24 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat25 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map24);
        java.lang.String str26 = extendedMessageFormat25.toPattern();
        java.text.Format[] formatArray27 = extendedMessageFormat25.getFormatsByArgumentIndex();
        java.util.Locale locale28 = extendedMessageFormat25.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat29 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale28);
        extendedMessageFormat17.setLocale(locale28);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat31 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale28);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat32 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale28);
        java.util.Locale locale33 = extendedMessageFormat32.getLocale();
        extendedMessageFormat12.setLocale(locale33);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat35 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale33);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat36 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale33);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(formatArray27);
        org.junit.Assert.assertArrayEquals(formatArray27, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "th_TH");
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test644");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.Object obj7 = null;
        java.lang.String str8 = extendedMessageFormat2.format(obj7);
        java.util.Locale locale9 = extendedMessageFormat2.getLocale();
        java.lang.String str10 = extendedMessageFormat2.toPattern();
        java.util.Locale locale11 = extendedMessageFormat2.getLocale();
        java.text.ParsePosition parsePosition13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray14 = extendedMessageFormat2.parse("", parsePosition13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "th_TH");
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test645");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.lang.String str4 = extendedMessageFormat3.toPattern();
        java.text.Format[] formatArray5 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.lang.String str6 = extendedMessageFormat3.toPattern();
        java.util.Locale locale7 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale7);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test646");
        java.util.Map map3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map3);
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.lang.String str6 = extendedMessageFormat4.toPattern();
        extendedMessageFormat4.applyPattern("hi!");
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map11);
        java.lang.String str13 = extendedMessageFormat12.toPattern();
        java.text.Format[] formatArray14 = extendedMessageFormat12.getFormatsByArgumentIndex();
        java.util.Locale locale15 = extendedMessageFormat12.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale15);
        extendedMessageFormat4.setLocale(locale15);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale15);
        java.util.Map map19 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale15, map19);
        java.util.Locale locale21 = extendedMessageFormat20.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = extendedMessageFormat20.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "th_TH");
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test647");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("");
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        java.util.Locale locale7 = extendedMessageFormat2.getLocale();
        java.lang.String str8 = extendedMessageFormat2.toPattern();
        java.util.Map map12 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map12);
        java.lang.String str14 = extendedMessageFormat13.toPattern();
        java.text.Format[] formatArray15 = extendedMessageFormat13.getFormatsByArgumentIndex();
        java.util.Locale locale16 = extendedMessageFormat13.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale16);
        java.util.Map map20 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map20);
        java.text.Format[] formatArray22 = extendedMessageFormat21.getFormats();
        java.text.Format[] formatArray23 = extendedMessageFormat21.getFormatsByArgumentIndex();
        java.util.Locale locale24 = extendedMessageFormat21.getLocale();
        java.util.Map map25 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat26 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale24, map25);
        extendedMessageFormat17.setLocale(locale24);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormat((int) (byte) -1, (java.text.Format) extendedMessageFormat17);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray22);
        org.junit.Assert.assertArrayEquals(formatArray22, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray23);
        org.junit.Assert.assertArrayEquals(formatArray23, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "th_TH");
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test648");
        java.util.Map map3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map3);
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.util.Locale locale6 = extendedMessageFormat4.getLocale();
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6, map7);
        java.util.Locale locale9 = extendedMessageFormat8.getLocale();
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale9, map10);
        extendedMessageFormat11.applyPattern("");
        java.text.Format format15 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat11.setFormat((int) (byte) -1, format15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "th_TH");
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test649");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        extendedMessageFormat3.applyPattern("hi!");
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map10);
        java.lang.String str12 = extendedMessageFormat11.toPattern();
        java.text.Format[] formatArray13 = extendedMessageFormat11.getFormatsByArgumentIndex();
        java.util.Locale locale14 = extendedMessageFormat11.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale14);
        extendedMessageFormat3.setLocale(locale14);
        java.util.Map map17 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale14, map17);
        java.util.Locale locale19 = extendedMessageFormat18.getLocale();
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "th_TH");
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test650");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("hi!");
        java.lang.String str7 = extendedMessageFormat2.toPattern();
        java.util.Locale locale8 = extendedMessageFormat2.getLocale();
        extendedMessageFormat2.applyPattern("hi!");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test651");
        java.util.Map map3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map3);
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale5);
        extendedMessageFormat6.applyPattern("hi!");
        java.lang.String str9 = extendedMessageFormat6.toPattern();
        java.lang.String str10 = extendedMessageFormat6.toPattern();
        java.lang.String str11 = extendedMessageFormat6.toPattern();
        java.util.Locale locale12 = extendedMessageFormat6.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale12);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test652");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.lang.String str3 = extendedMessageFormat1.toPattern();
        extendedMessageFormat1.applyPattern("");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test653");
        java.util.Map map3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map3);
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale5);
        extendedMessageFormat6.applyPattern("hi!");
        java.lang.String str9 = extendedMessageFormat6.toPattern();
        java.lang.Object[] objArray11 = extendedMessageFormat6.parse("hi!");
        java.text.Format[] formatArray12 = extendedMessageFormat6.getFormatsByArgumentIndex();
        java.text.Format[] formatArray13 = extendedMessageFormat6.getFormats();
        java.util.Map map17 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map17);
        java.util.Locale locale19 = extendedMessageFormat18.getLocale();
        java.lang.String str20 = extendedMessageFormat18.toPattern();
        java.util.Locale locale21 = extendedMessageFormat18.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat22 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale21);
        java.util.Map map23 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat24 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale21, map23);
        extendedMessageFormat6.setLocale(locale21);
        java.util.Locale locale26 = extendedMessageFormat6.getLocale();
        java.util.Map map27 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat28 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale26, map27);
        java.text.Format[] formatArray29 = extendedMessageFormat28.getFormatsByArgumentIndex();
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray29);
        org.junit.Assert.assertArrayEquals(formatArray29, new java.text.Format[] {});
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test654");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormats();
        java.util.Map map5 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map5);
        java.text.Format[] formatArray7 = extendedMessageFormat6.getFormats();
        java.text.Format[] formatArray8 = extendedMessageFormat6.getFormatsByArgumentIndex();
        java.util.Locale locale9 = extendedMessageFormat6.getLocale();
        java.text.Format[] formatArray10 = extendedMessageFormat6.getFormatsByArgumentIndex();
        java.util.Locale locale11 = extendedMessageFormat6.getLocale();
        java.text.Format[] formatArray12 = extendedMessageFormat6.getFormats();
        java.text.Format[] formatArray13 = extendedMessageFormat6.getFormatsByArgumentIndex();
        java.text.Format[] formatArray14 = extendedMessageFormat6.getFormatsByArgumentIndex();
        java.lang.String str15 = extendedMessageFormat6.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormat((int) (byte) 100, (java.text.Format) extendedMessageFormat6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray2);
        org.junit.Assert.assertArrayEquals(formatArray2, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test655");
        java.util.Map map6 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map6);
        java.util.Locale locale8 = extendedMessageFormat7.getLocale();
        java.lang.String str9 = extendedMessageFormat7.toPattern();
        java.util.Locale locale10 = extendedMessageFormat7.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale10);
        java.util.Map map12 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale10, map12);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale10);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale10);
        java.util.Map map16 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale10, map16);
        java.lang.Object obj18 = null;
        java.lang.String str19 = extendedMessageFormat17.format(obj18);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test656");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.Object obj7 = null;
        java.lang.String str8 = extendedMessageFormat2.format(obj7);
        java.util.Locale locale9 = extendedMessageFormat2.getLocale();
        java.lang.String str10 = extendedMessageFormat2.toPattern();
        java.util.Map map16 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map16);
        java.util.Locale locale18 = extendedMessageFormat17.getLocale();
        java.lang.String str19 = extendedMessageFormat17.toPattern();
        java.util.Locale locale20 = extendedMessageFormat17.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale20);
        java.lang.Object[] objArray23 = extendedMessageFormat21.parse("hi!");
        java.util.Locale locale24 = extendedMessageFormat21.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat25 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale24);
        java.util.Locale locale26 = extendedMessageFormat25.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat27 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale26);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat28 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale26);
        java.text.Format[] formatArray29 = extendedMessageFormat28.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatsByArgumentIndex(formatArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertArrayEquals(objArray23, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray29);
        org.junit.Assert.assertArrayEquals(formatArray29, new java.text.Format[] {});
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test657");
        java.util.Map map3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map3);
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.util.Locale locale6 = extendedMessageFormat4.getLocale();
        java.util.Locale locale7 = extendedMessageFormat4.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale7);
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale7, map9);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test658");
        java.util.Map map3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map3);
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.lang.String str6 = extendedMessageFormat4.toPattern();
        extendedMessageFormat4.applyPattern("hi!");
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map11);
        java.lang.String str13 = extendedMessageFormat12.toPattern();
        java.text.Format[] formatArray14 = extendedMessageFormat12.getFormatsByArgumentIndex();
        java.util.Locale locale15 = extendedMessageFormat12.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale15);
        extendedMessageFormat4.setLocale(locale15);
        java.util.Map map18 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale15, map18);
        java.text.Format[] formatArray20 = extendedMessageFormat19.getFormatsByArgumentIndex();
        java.lang.String str21 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray20);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray20);
        org.junit.Assert.assertArrayEquals(formatArray20, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test659");
        java.util.Map map3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map3);
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.lang.String str6 = extendedMessageFormat4.toPattern();
        extendedMessageFormat4.applyPattern("hi!");
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map11);
        java.lang.String str13 = extendedMessageFormat12.toPattern();
        java.text.Format[] formatArray14 = extendedMessageFormat12.getFormatsByArgumentIndex();
        java.util.Locale locale15 = extendedMessageFormat12.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale15);
        extendedMessageFormat4.setLocale(locale15);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale15);
        java.util.Map map19 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale15, map19);
        java.util.Locale locale21 = extendedMessageFormat20.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = extendedMessageFormat20.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "th_TH");
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test660");
        java.util.Map map3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map3);
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.lang.String str6 = extendedMessageFormat4.toPattern();
        extendedMessageFormat4.applyPattern("hi!");
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map11);
        java.lang.String str13 = extendedMessageFormat12.toPattern();
        java.text.Format[] formatArray14 = extendedMessageFormat12.getFormatsByArgumentIndex();
        java.util.Locale locale15 = extendedMessageFormat12.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale15);
        extendedMessageFormat4.setLocale(locale15);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale15);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale15);
        extendedMessageFormat19.applyPattern("");
        java.lang.String str22 = extendedMessageFormat19.toPattern();
        java.text.Format[] formatArray23 = extendedMessageFormat19.getFormatsByArgumentIndex();
        java.util.Locale locale24 = extendedMessageFormat19.getLocale();
        java.util.Map map29 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat30 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map29);
        java.util.Locale locale31 = extendedMessageFormat30.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat32 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale31);
        extendedMessageFormat32.applyPattern("hi!");
        java.lang.String str35 = extendedMessageFormat32.toPattern();
        java.lang.Object[] objArray37 = extendedMessageFormat32.parse("hi!");
        java.text.Format[] formatArray38 = extendedMessageFormat32.getFormatsByArgumentIndex();
        java.lang.String str39 = extendedMessageFormat32.toPattern();
        java.util.Locale locale40 = extendedMessageFormat32.getLocale();
        java.util.Map map41 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat42 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale40, map41);
        java.util.Map map43 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat44 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale40, map43);
        extendedMessageFormat19.setLocale(locale40);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(formatArray23);
        org.junit.Assert.assertArrayEquals(formatArray23, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertArrayEquals(objArray37, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray38);
        org.junit.Assert.assertArrayEquals(formatArray38, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "th_TH");
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test661");
        java.util.Map map3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map3);
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.lang.String str6 = extendedMessageFormat4.toPattern();
        extendedMessageFormat4.applyPattern("hi!");
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map11);
        java.lang.String str13 = extendedMessageFormat12.toPattern();
        java.text.Format[] formatArray14 = extendedMessageFormat12.getFormatsByArgumentIndex();
        java.util.Locale locale15 = extendedMessageFormat12.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale15);
        extendedMessageFormat4.setLocale(locale15);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale15);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale15);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test662");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("hi!");
        java.lang.String str7 = extendedMessageFormat2.toPattern();
        java.util.Locale locale8 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray9 = extendedMessageFormat2.getFormats();
        java.lang.String str10 = extendedMessageFormat2.toPattern();
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test663");
        java.util.Map map4 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map4);
        java.util.Locale locale6 = extendedMessageFormat5.getLocale();
        java.lang.Object[] objArray8 = extendedMessageFormat5.parse("hi!");
        java.lang.String str9 = java.text.MessageFormat.format("", objArray8);
        java.lang.String str10 = java.text.MessageFormat.format("", objArray8);
        java.lang.String str11 = java.text.MessageFormat.format("hi!", objArray8);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test664");
        java.util.Map map5 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map5);
        java.util.Locale locale7 = extendedMessageFormat6.getLocale();
        java.lang.String str8 = extendedMessageFormat6.toPattern();
        java.util.Locale locale9 = extendedMessageFormat6.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale9);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale9);
        java.text.Format[] formatArray12 = extendedMessageFormat11.getFormats();
        java.lang.String str13 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray12);
        java.lang.String str14 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray12);
        java.lang.Class<?> wildcardClass15 = formatArray12.getClass();
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test665");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4);
        extendedMessageFormat5.applyPattern("hi!");
        java.text.Format[] formatArray8 = extendedMessageFormat5.getFormats();
        java.lang.Object[] objArray10 = extendedMessageFormat5.parse("hi!");
        java.util.Map map13 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map13);
        java.util.Locale locale15 = extendedMessageFormat14.getLocale();
        java.lang.String str16 = extendedMessageFormat14.toPattern();
        java.util.Locale locale17 = extendedMessageFormat14.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale17);
        java.lang.Object[] objArray20 = extendedMessageFormat18.parse("hi!");
        java.util.Locale locale21 = extendedMessageFormat18.getLocale();
        java.util.Locale locale22 = extendedMessageFormat18.getLocale();
        java.text.Format[] formatArray23 = extendedMessageFormat18.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat5.setFormats(formatArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertArrayEquals(objArray20, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray23);
        org.junit.Assert.assertArrayEquals(formatArray23, new java.text.Format[] {});
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test666");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4);
        extendedMessageFormat5.applyPattern("hi!");
        java.lang.String str8 = extendedMessageFormat5.toPattern();
        java.lang.Object[] objArray10 = extendedMessageFormat5.parse("hi!");
        java.text.Format[] formatArray11 = extendedMessageFormat5.getFormatsByArgumentIndex();
        java.util.Map map14 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map14);
        java.util.Locale locale16 = extendedMessageFormat15.getLocale();
        java.lang.String str17 = extendedMessageFormat15.toPattern();
        extendedMessageFormat15.applyPattern("hi!");
        java.util.Map map22 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat23 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map22);
        java.lang.String str24 = extendedMessageFormat23.toPattern();
        java.text.Format[] formatArray25 = extendedMessageFormat23.getFormatsByArgumentIndex();
        java.util.Locale locale26 = extendedMessageFormat23.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat27 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale26);
        extendedMessageFormat15.setLocale(locale26);
        java.util.Map map29 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat30 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale26, map29);
        java.text.Format[] formatArray31 = extendedMessageFormat30.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat5.setFormats(formatArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(formatArray25);
        org.junit.Assert.assertArrayEquals(formatArray25, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray31);
        org.junit.Assert.assertArrayEquals(formatArray31, new java.text.Format[] {});
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test667");
        java.util.Map map4 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map4);
        java.util.Locale locale6 = extendedMessageFormat5.getLocale();
        java.lang.String str7 = extendedMessageFormat5.toPattern();
        java.util.Locale locale8 = extendedMessageFormat5.getLocale();
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale8, map9);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale8);
        java.util.Map map12 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale8, map12);
        java.text.Format[] formatArray14 = extendedMessageFormat13.getFormatsByArgumentIndex();
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test668");
        java.util.Map map3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map3);
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale5);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale5);
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map11);
        java.util.Locale locale13 = extendedMessageFormat12.getLocale();
        java.lang.String str14 = extendedMessageFormat12.toPattern();
        java.util.Locale locale15 = extendedMessageFormat12.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale15);
        java.lang.Object[] objArray18 = extendedMessageFormat16.parse("hi!");
        java.util.Locale locale19 = extendedMessageFormat16.getLocale();
        java.util.Locale locale20 = extendedMessageFormat16.getLocale();
        java.util.Map map24 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat25 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map24);
        java.util.Locale locale26 = extendedMessageFormat25.getLocale();
        java.lang.String str27 = extendedMessageFormat25.toPattern();
        java.util.Locale locale28 = extendedMessageFormat25.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat29 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale28);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat30 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale28);
        extendedMessageFormat16.setLocale(locale28);
        java.lang.Object obj32 = null;
        java.lang.String str33 = extendedMessageFormat16.format(obj32);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat7.setFormat(0, (java.text.Format) extendedMessageFormat16);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertArrayEquals(objArray18, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test669");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6);
        java.text.Format[] formatArray8 = extendedMessageFormat7.getFormats();
        java.lang.Object[] objArray10 = extendedMessageFormat7.parse("hi!");
        extendedMessageFormat7.applyPattern("hi!");
        extendedMessageFormat7.applyPattern("");
        java.text.Format[] formatArray15 = extendedMessageFormat7.getFormatsByArgumentIndex();
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test670");
        java.util.Map map6 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map6);
        java.util.Locale locale8 = extendedMessageFormat7.getLocale();
        java.lang.String str9 = extendedMessageFormat7.toPattern();
        java.util.Locale locale10 = extendedMessageFormat7.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale10);
        java.lang.Object[] objArray13 = extendedMessageFormat11.parse("hi!");
        java.util.Locale locale14 = extendedMessageFormat11.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale14);
        java.util.Locale locale16 = extendedMessageFormat15.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale16);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale16);
        java.text.Format[] formatArray19 = extendedMessageFormat18.getFormats();
        java.lang.String str20 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray19);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertArrayEquals(objArray13, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray19);
        org.junit.Assert.assertArrayEquals(formatArray19, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test671");
        java.util.Map map3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map3);
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.lang.String str6 = extendedMessageFormat4.toPattern();
        java.util.Locale locale7 = extendedMessageFormat4.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale7);
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale7, map9);
        java.util.Map map14 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map14);
        java.util.Locale locale16 = extendedMessageFormat15.getLocale();
        java.lang.String str17 = extendedMessageFormat15.toPattern();
        extendedMessageFormat15.applyPattern("hi!");
        java.util.Map map22 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat23 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map22);
        java.lang.String str24 = extendedMessageFormat23.toPattern();
        java.text.Format[] formatArray25 = extendedMessageFormat23.getFormatsByArgumentIndex();
        java.util.Locale locale26 = extendedMessageFormat23.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat27 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale26);
        extendedMessageFormat15.setLocale(locale26);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat29 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale26);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat30 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale26);
        java.util.Locale locale31 = extendedMessageFormat30.getLocale();
        extendedMessageFormat10.setLocale(locale31);
        java.util.Map map38 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat39 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map38);
        java.util.Locale locale40 = extendedMessageFormat39.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat41 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale40);
        extendedMessageFormat41.applyPattern("hi!");
        java.lang.String str44 = extendedMessageFormat41.toPattern();
        java.lang.Object[] objArray46 = extendedMessageFormat41.parse("hi!");
        java.text.Format[] formatArray47 = extendedMessageFormat41.getFormatsByArgumentIndex();
        java.text.Format[] formatArray48 = extendedMessageFormat41.getFormats();
        java.lang.Object[] objArray50 = extendedMessageFormat41.parse("hi!");
        java.lang.String str51 = java.text.MessageFormat.format("hi!", objArray50);
        java.lang.String str52 = java.text.MessageFormat.format("", objArray50);
        java.lang.String str53 = java.text.MessageFormat.format("hi!", objArray50);
        java.lang.StringBuffer stringBuffer54 = null;
        java.text.FieldPosition fieldPosition55 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer56 = extendedMessageFormat10.format(objArray50, stringBuffer54, fieldPosition55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(formatArray25);
        org.junit.Assert.assertArrayEquals(formatArray25, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertArrayEquals(objArray46, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray47);
        org.junit.Assert.assertArrayEquals(formatArray47, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray48);
        org.junit.Assert.assertArrayEquals(formatArray48, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertArrayEquals(objArray50, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test672");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        java.util.Locale locale7 = extendedMessageFormat2.getLocale();
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map11);
        java.util.Locale locale13 = extendedMessageFormat12.getLocale();
        java.lang.String str14 = extendedMessageFormat12.toPattern();
        extendedMessageFormat12.applyPattern("hi!");
        java.util.Map map19 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map19);
        java.lang.String str21 = extendedMessageFormat20.toPattern();
        java.text.Format[] formatArray22 = extendedMessageFormat20.getFormatsByArgumentIndex();
        java.util.Locale locale23 = extendedMessageFormat20.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat24 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale23);
        extendedMessageFormat12.setLocale(locale23);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat26 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale23);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat27 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale23);
        java.util.Locale locale28 = extendedMessageFormat27.getLocale();
        extendedMessageFormat2.setLocale(locale28);
        java.util.Map map31 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat32 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map31);
        java.util.Map map34 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat35 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map34);
        java.util.Locale locale36 = extendedMessageFormat35.getLocale();
        java.util.Locale locale37 = extendedMessageFormat35.getLocale();
        java.util.Locale locale38 = extendedMessageFormat35.getLocale();
        extendedMessageFormat32.setLocale(locale38);
        java.util.Locale locale40 = extendedMessageFormat32.getLocale();
        boolean boolean41 = extendedMessageFormat2.equals((java.lang.Object) extendedMessageFormat32);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(formatArray22);
        org.junit.Assert.assertArrayEquals(formatArray22, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test673");
        java.util.Map map3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map3);
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.lang.String str6 = extendedMessageFormat4.toPattern();
        java.util.Locale locale7 = extendedMessageFormat4.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale7);
        java.lang.Object[] objArray10 = extendedMessageFormat8.parse("hi!");
        java.util.Locale locale11 = extendedMessageFormat8.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale11);
        java.util.Map map15 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map15);
        java.util.Locale locale17 = extendedMessageFormat16.getLocale();
        java.lang.String str18 = extendedMessageFormat16.toPattern();
        java.util.Locale locale19 = extendedMessageFormat16.getLocale();
        java.text.Format[] formatArray20 = extendedMessageFormat16.getFormats();
        java.lang.String str21 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = extendedMessageFormat12.format((java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class [Ljava.lang.Object; (java.lang.String and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray20);
        org.junit.Assert.assertArrayEquals(formatArray20, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test674");
        java.util.Map map4 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map4);
        java.util.Locale locale6 = extendedMessageFormat5.getLocale();
        java.lang.String str7 = extendedMessageFormat5.toPattern();
        java.util.Locale locale8 = extendedMessageFormat5.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale8);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale8);
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale8, map11);
        java.text.Format[] formatArray13 = extendedMessageFormat12.getFormatsByArgumentIndex();
        java.text.ParsePosition parsePosition15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray16 = extendedMessageFormat12.parse("", parsePosition15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test675");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6);
        java.lang.Object[] objArray9 = extendedMessageFormat7.parse("hi!");
        java.util.Locale locale10 = extendedMessageFormat7.getLocale();
        java.text.ParsePosition parsePosition12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray13 = extendedMessageFormat7.parse("hi!", parsePosition12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test676");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.util.Map map5 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale4, map5);
        java.text.Format[] formatArray7 = extendedMessageFormat6.getFormats();
        java.text.ParsePosition parsePosition9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray10 = extendedMessageFormat6.parse("hi!", parsePosition9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test677");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        java.util.Locale locale7 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray8 = extendedMessageFormat2.getFormatsByArgumentIndex();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test678");
        java.util.Map map3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map3);
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.lang.String str6 = extendedMessageFormat4.toPattern();
        extendedMessageFormat4.applyPattern("hi!");
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map11);
        java.lang.String str13 = extendedMessageFormat12.toPattern();
        java.text.Format[] formatArray14 = extendedMessageFormat12.getFormatsByArgumentIndex();
        java.util.Locale locale15 = extendedMessageFormat12.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale15);
        extendedMessageFormat4.setLocale(locale15);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale15);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale15);
        extendedMessageFormat19.applyPattern("");
        java.lang.String str22 = extendedMessageFormat19.toPattern();
        java.text.Format[] formatArray23 = extendedMessageFormat19.getFormats();
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(formatArray23);
        org.junit.Assert.assertArrayEquals(formatArray23, new java.text.Format[] {});
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test679");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4);
        extendedMessageFormat5.applyPattern("hi!");
        java.lang.String str8 = extendedMessageFormat5.toPattern();
        java.lang.Object[] objArray10 = extendedMessageFormat5.parse("hi!");
        java.text.Format[] formatArray11 = extendedMessageFormat5.getFormatsByArgumentIndex();
        java.text.Format[] formatArray12 = extendedMessageFormat5.getFormats();
        extendedMessageFormat5.applyPattern("hi!");
        java.text.Format[] formatArray15 = extendedMessageFormat5.getFormatsByArgumentIndex();
        extendedMessageFormat5.applyPattern("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = extendedMessageFormat5.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test680");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.lang.Object[] objArray6 = extendedMessageFormat2.parse("hi!");
        java.lang.Object[] objArray8 = extendedMessageFormat2.parse("hi!");
        java.lang.String str9 = extendedMessageFormat2.toPattern();
        java.lang.String str10 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray11 = extendedMessageFormat2.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = extendedMessageFormat2.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertArrayEquals(objArray6, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test681");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.text.Format[] formatArray5 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.lang.String str6 = extendedMessageFormat3.toPattern();
        java.lang.Object[] objArray8 = extendedMessageFormat3.parse("hi!");
        java.lang.String str9 = extendedMessageFormat3.toPattern();
        java.text.Format[] formatArray10 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.lang.String str11 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray10);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test682");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4);
        extendedMessageFormat5.applyPattern("hi!");
        java.lang.String str8 = extendedMessageFormat5.toPattern();
        java.lang.String str9 = extendedMessageFormat5.toPattern();
        extendedMessageFormat5.applyPattern("");
        extendedMessageFormat5.applyPattern("");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test683");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6);
        java.text.Format[] formatArray8 = extendedMessageFormat7.getFormats();
        java.lang.Object[] objArray10 = extendedMessageFormat7.parse("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = extendedMessageFormat7.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[] {});
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test684");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormats();
        java.util.Locale locale5 = extendedMessageFormat3.getLocale();
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map7);
        java.util.Locale locale9 = extendedMessageFormat8.getLocale();
        java.util.Locale locale10 = extendedMessageFormat8.getLocale();
        java.util.Locale locale11 = extendedMessageFormat8.getLocale();
        extendedMessageFormat3.setLocale(locale11);
        java.util.Map map15 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map15);
        java.util.Locale locale17 = extendedMessageFormat16.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale17);
        extendedMessageFormat18.applyPattern("hi!");
        java.lang.String str21 = extendedMessageFormat18.toPattern();
        java.lang.Object[] objArray23 = extendedMessageFormat18.parse("hi!");
        java.util.Locale locale24 = extendedMessageFormat18.getLocale();
        extendedMessageFormat3.setLocale(locale24);
        java.util.Map map26 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat27 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale24, map26);
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertArrayEquals(objArray23, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "th_TH");
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test685");
        java.util.Map map3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map3);
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.lang.String str6 = extendedMessageFormat4.toPattern();
        java.util.Locale locale7 = extendedMessageFormat4.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale7);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale7);
        java.text.Format[] formatArray10 = extendedMessageFormat9.getFormats();
        extendedMessageFormat9.applyPattern("");
        java.text.ParsePosition parsePosition14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray15 = extendedMessageFormat9.parse("", parsePosition14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test686");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormats();
        java.lang.Class<?> wildcardClass8 = formatArray7.getClass();
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test687");
        java.util.Map map4 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map4);
        java.util.Locale locale6 = extendedMessageFormat5.getLocale();
        java.lang.String str7 = extendedMessageFormat5.toPattern();
        extendedMessageFormat5.applyPattern("hi!");
        java.util.Map map12 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map12);
        java.lang.String str14 = extendedMessageFormat13.toPattern();
        java.text.Format[] formatArray15 = extendedMessageFormat13.getFormatsByArgumentIndex();
        java.util.Locale locale16 = extendedMessageFormat13.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale16);
        extendedMessageFormat5.setLocale(locale16);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale16);
        java.util.Map map20 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale16, map20);
        java.util.Map map22 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat23 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale16, map22);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test688");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        extendedMessageFormat2.applyPattern("hi!");
        java.lang.Object[] objArray6 = extendedMessageFormat2.parse("hi!");
        java.lang.Object obj7 = extendedMessageFormat2.clone();
        java.lang.Class<?> wildcardClass8 = extendedMessageFormat2.getClass();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertArrayEquals(objArray6, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test689");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.Object obj7 = null;
        java.lang.String str8 = extendedMessageFormat2.format(obj7);
        java.util.Locale locale9 = extendedMessageFormat2.getLocale();
        java.lang.String str10 = extendedMessageFormat2.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray12 = extendedMessageFormat2.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test690");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.lang.String str4 = extendedMessageFormat3.toPattern();
        java.text.Format[] formatArray5 = extendedMessageFormat3.getFormats();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test691");
        java.util.Map map5 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map5);
        java.util.Locale locale7 = extendedMessageFormat6.getLocale();
        java.lang.String str8 = extendedMessageFormat6.toPattern();
        extendedMessageFormat6.applyPattern("hi!");
        java.util.Map map13 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map13);
        java.lang.String str15 = extendedMessageFormat14.toPattern();
        java.text.Format[] formatArray16 = extendedMessageFormat14.getFormatsByArgumentIndex();
        java.util.Locale locale17 = extendedMessageFormat14.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale17);
        extendedMessageFormat6.setLocale(locale17);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale17);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale17);
        java.util.Map map22 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat23 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale17, map22);
        java.util.Map map24 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat25 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale17, map24);
        java.util.Locale locale26 = extendedMessageFormat25.getLocale();
        java.lang.Object obj27 = extendedMessageFormat25.clone();
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(formatArray16);
        org.junit.Assert.assertArrayEquals(formatArray16, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "th_TH");
        org.junit.Assert.assertNotNull(obj27);
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test692");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.lang.String str4 = extendedMessageFormat3.toPattern();
        java.text.Format[] formatArray5 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.lang.String str6 = extendedMessageFormat3.toPattern();
        java.lang.String str7 = extendedMessageFormat3.toPattern();
        java.util.Locale locale8 = extendedMessageFormat3.getLocale();
        java.util.Map map12 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map12);
        java.util.Locale locale14 = extendedMessageFormat13.getLocale();
        java.lang.String str15 = extendedMessageFormat13.toPattern();
        extendedMessageFormat13.applyPattern("hi!");
        java.util.Map map20 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map20);
        java.lang.String str22 = extendedMessageFormat21.toPattern();
        java.text.Format[] formatArray23 = extendedMessageFormat21.getFormatsByArgumentIndex();
        java.util.Locale locale24 = extendedMessageFormat21.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat25 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale24);
        extendedMessageFormat13.setLocale(locale24);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat27 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale24);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat28 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale24);
        java.util.Locale locale29 = extendedMessageFormat28.getLocale();
        extendedMessageFormat3.setLocale(locale29);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat31 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale29);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(formatArray23);
        org.junit.Assert.assertArrayEquals(formatArray23, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "th_TH");
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test693");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormats();
        java.lang.String str5 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray4);
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test694");
        java.util.Map map4 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map4);
        java.util.Locale locale6 = extendedMessageFormat5.getLocale();
        java.lang.String str7 = extendedMessageFormat5.toPattern();
        java.util.Locale locale8 = extendedMessageFormat5.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale8);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale8);
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale8, map11);
        java.text.Format[] formatArray13 = extendedMessageFormat12.getFormatsByArgumentIndex();
        java.lang.String str14 = extendedMessageFormat12.toPattern();
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test695");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.lang.String str4 = extendedMessageFormat3.toPattern();
        java.text.Format[] formatArray5 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.lang.String str6 = extendedMessageFormat3.toPattern();
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map9);
        java.util.Locale locale11 = extendedMessageFormat10.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale11);
        extendedMessageFormat3.setLocale(locale11);
        java.util.Map map14 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale11, map14);
        java.util.Map map19 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map19);
        java.util.Locale locale21 = extendedMessageFormat20.getLocale();
        java.lang.String str22 = extendedMessageFormat20.toPattern();
        java.util.Locale locale23 = extendedMessageFormat20.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat24 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale23);
        java.lang.Object[] objArray26 = extendedMessageFormat24.parse("hi!");
        java.lang.String str27 = java.text.MessageFormat.format("hi!", objArray26);
        java.lang.StringBuffer stringBuffer28 = null;
        java.text.FieldPosition fieldPosition29 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer30 = extendedMessageFormat15.format((java.lang.Object) "hi!", stringBuffer28, fieldPosition29);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class [Ljava.lang.Object; (java.lang.String and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertArrayEquals(objArray26, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test696");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("hi!");
        java.lang.String str7 = extendedMessageFormat2.toPattern();
        java.util.Locale locale8 = extendedMessageFormat2.getLocale();
        java.text.ParsePosition parsePosition10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray11 = extendedMessageFormat2.parse("", parsePosition10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test697");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        org.junit.Assert.assertNotNull(formatArray3);
        org.junit.Assert.assertArrayEquals(formatArray3, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test698");
        java.util.Map map3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map3);
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.lang.String str6 = extendedMessageFormat4.toPattern();
        extendedMessageFormat4.applyPattern("hi!");
        java.lang.String str9 = extendedMessageFormat4.toPattern();
        java.text.Format[] formatArray10 = extendedMessageFormat4.getFormats();
        java.lang.String str11 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray10);
        java.lang.String str12 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray10);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test699");
        java.util.Map map4 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map4);
        java.util.Locale locale6 = extendedMessageFormat5.getLocale();
        java.lang.String str7 = extendedMessageFormat5.toPattern();
        java.util.Locale locale8 = extendedMessageFormat5.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale8);
        java.util.Map map14 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map14);
        java.util.Locale locale16 = extendedMessageFormat15.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale16);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale16);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale16);
        extendedMessageFormat9.setLocale(locale16);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale16);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat22 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale16);
        java.text.Format[] formatArray23 = extendedMessageFormat22.getFormats();
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray23);
        org.junit.Assert.assertArrayEquals(formatArray23, new java.text.Format[] {});
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test700");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormats();
        extendedMessageFormat2.applyPattern("hi!");
        org.junit.Assert.assertNotNull(formatArray3);
        org.junit.Assert.assertArrayEquals(formatArray3, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test701");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("hi!");
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map9);
        java.lang.String str11 = extendedMessageFormat10.toPattern();
        java.text.Format[] formatArray12 = extendedMessageFormat10.getFormatsByArgumentIndex();
        java.util.Locale locale13 = extendedMessageFormat10.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale13);
        extendedMessageFormat2.setLocale(locale13);
        java.lang.Object obj16 = extendedMessageFormat2.clone();
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test702");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.lang.Object[] objArray4 = extendedMessageFormat2.parse("hi!");
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.util.Locale locale6 = extendedMessageFormat2.getLocale();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test703");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.util.Locale locale5 = extendedMessageFormat3.getLocale();
        java.util.Map map6 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale5, map6);
        java.util.Locale locale8 = extendedMessageFormat7.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = extendedMessageFormat7.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test704");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4);
        extendedMessageFormat5.applyPattern("hi!");
        java.text.Format[] formatArray8 = extendedMessageFormat5.getFormats();
        java.lang.Object[] objArray10 = extendedMessageFormat5.parse("hi!");
        java.text.ParsePosition parsePosition12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray13 = extendedMessageFormat5.parse("hi!", parsePosition12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[] {});
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test705");
        java.util.Map map3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map3);
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.lang.String str6 = extendedMessageFormat4.toPattern();
        java.util.Locale locale7 = extendedMessageFormat4.getLocale();
        java.util.Map map8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale7, map8);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale7);
        java.util.Locale locale11 = extendedMessageFormat10.getLocale();
        java.util.Map map14 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map14);
        extendedMessageFormat15.applyPattern("hi!");
        java.text.Format[] formatArray18 = extendedMessageFormat15.getFormats();
        java.lang.String str19 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray18);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat10.setFormatsByArgumentIndex(formatArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray18);
        org.junit.Assert.assertArrayEquals(formatArray18, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test706");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.lang.Object[] objArray6 = extendedMessageFormat2.parse("hi!");
        java.lang.Object[] objArray8 = extendedMessageFormat2.parse("hi!");
        java.lang.String str9 = extendedMessageFormat2.toPattern();
        java.lang.String str10 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray11 = extendedMessageFormat2.getFormatsByArgumentIndex();
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertArrayEquals(objArray6, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test707");
        java.util.Map map3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map3);
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.lang.String str6 = extendedMessageFormat4.toPattern();
        java.util.Locale locale7 = extendedMessageFormat4.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale7);
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale7, map9);
        java.util.Locale locale11 = extendedMessageFormat10.getLocale();
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "th_TH");
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test708");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6);
        java.text.Format[] formatArray8 = extendedMessageFormat7.getFormats();
        java.text.Format[] formatArray9 = extendedMessageFormat7.getFormats();
        extendedMessageFormat7.applyPattern("");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test709");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6);
        java.text.Format[] formatArray8 = extendedMessageFormat7.getFormats();
        java.text.Format[] formatArray9 = extendedMessageFormat7.getFormats();
        java.lang.Object[] objArray11 = extendedMessageFormat7.parse("hi!");
        java.lang.Object obj12 = null;
        java.lang.StringBuffer stringBuffer13 = null;
        java.text.FieldPosition fieldPosition14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer15 = extendedMessageFormat7.format(obj12, stringBuffer13, fieldPosition14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[] {});
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test710");
        java.util.Map map3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map3);
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale5);
        java.lang.String str7 = extendedMessageFormat6.toPattern();
        java.lang.String str8 = extendedMessageFormat6.toPattern();
        java.util.Locale locale9 = extendedMessageFormat6.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale9);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "th_TH");
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test711");
        java.util.Map map3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map3);
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale5);
        extendedMessageFormat6.applyPattern("hi!");
        java.lang.String str9 = extendedMessageFormat6.toPattern();
        java.lang.Object[] objArray11 = extendedMessageFormat6.parse("hi!");
        java.lang.Object[] objArray13 = extendedMessageFormat6.parse("hi!");
        java.lang.String str14 = java.text.MessageFormat.format("hi!", objArray13);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertArrayEquals(objArray13, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test712");
        java.util.Map map3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map3);
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.lang.String str6 = extendedMessageFormat4.toPattern();
        java.util.Locale locale7 = extendedMessageFormat4.getLocale();
        java.util.Map map8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale7, map8);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale7);
        java.util.Locale locale11 = extendedMessageFormat10.getLocale();
        java.util.Locale locale12 = extendedMessageFormat10.getLocale();
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test713");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4);
        extendedMessageFormat5.applyPattern("hi!");
        java.lang.String str8 = extendedMessageFormat5.toPattern();
        java.lang.Object[] objArray10 = extendedMessageFormat5.parse("hi!");
        extendedMessageFormat5.applyPattern("hi!");
        java.text.ParsePosition parsePosition14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray15 = extendedMessageFormat5.parse("", parsePosition14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[] {});
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test714");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.lang.Object[] objArray6 = extendedMessageFormat2.parse("hi!");
        java.lang.Object[] objArray8 = extendedMessageFormat2.parse("hi!");
        java.lang.String str9 = extendedMessageFormat2.toPattern();
        java.lang.String str10 = extendedMessageFormat2.toPattern();
        java.text.ParsePosition parsePosition12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = extendedMessageFormat2.parseObject("", parsePosition12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertArrayEquals(objArray6, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test715");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        java.util.Locale locale7 = extendedMessageFormat2.getLocale();
        java.util.Map map13 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map13);
        java.util.Locale locale15 = extendedMessageFormat14.getLocale();
        java.lang.String str16 = extendedMessageFormat14.toPattern();
        java.util.Locale locale17 = extendedMessageFormat14.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale17);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale17);
        java.text.Format[] formatArray20 = extendedMessageFormat19.getFormats();
        java.lang.String str21 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray20);
        java.lang.String str22 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray20);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatsByArgumentIndex(formatArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray20);
        org.junit.Assert.assertArrayEquals(formatArray20, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test716");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat5.getFormats();
        java.util.Map map8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map8);
        java.text.Format[] formatArray10 = extendedMessageFormat9.getFormats();
        java.text.Format[] formatArray11 = extendedMessageFormat9.getFormatsByArgumentIndex();
        java.util.Locale locale12 = extendedMessageFormat9.getLocale();
        java.text.Format[] formatArray13 = extendedMessageFormat9.getFormatsByArgumentIndex();
        java.lang.String str14 = extendedMessageFormat5.format((java.lang.Object) formatArray13);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test717");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4);
        extendedMessageFormat5.applyPattern("hi!");
        extendedMessageFormat5.applyPattern("hi!");
        java.lang.String str10 = extendedMessageFormat5.toPattern();
        java.util.Map map15 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map15);
        java.util.Locale locale17 = extendedMessageFormat16.getLocale();
        java.lang.String str18 = extendedMessageFormat16.toPattern();
        extendedMessageFormat16.applyPattern("hi!");
        java.util.Map map23 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat24 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map23);
        java.lang.String str25 = extendedMessageFormat24.toPattern();
        java.text.Format[] formatArray26 = extendedMessageFormat24.getFormatsByArgumentIndex();
        java.util.Locale locale27 = extendedMessageFormat24.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat28 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale27);
        extendedMessageFormat16.setLocale(locale27);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat30 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale27);
        java.util.Map map31 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat32 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale27, map31);
        java.util.Map map33 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat34 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale27, map33);
        java.util.Locale locale35 = extendedMessageFormat34.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str36 = extendedMessageFormat5.format((java.lang.Object) locale35);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.util.Locale cannot be cast to class [Ljava.lang.Object; (java.util.Locale and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(formatArray26);
        org.junit.Assert.assertArrayEquals(formatArray26, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "th_TH");
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test718");
        java.util.Map map4 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map4);
        java.util.Locale locale6 = extendedMessageFormat5.getLocale();
        java.lang.String str7 = extendedMessageFormat5.toPattern();
        extendedMessageFormat5.applyPattern("hi!");
        java.util.Map map12 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map12);
        java.lang.String str14 = extendedMessageFormat13.toPattern();
        java.text.Format[] formatArray15 = extendedMessageFormat13.getFormatsByArgumentIndex();
        java.util.Locale locale16 = extendedMessageFormat13.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale16);
        extendedMessageFormat5.setLocale(locale16);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale16);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale16);
        java.util.Map map21 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat22 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale16, map21);
        java.util.Locale locale23 = extendedMessageFormat22.getLocale();
        java.text.Format[] formatArray24 = extendedMessageFormat22.getFormatsByArgumentIndex();
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray24);
        org.junit.Assert.assertArrayEquals(formatArray24, new java.text.Format[] {});
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test719");
        java.util.Map map3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map3);
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.lang.String str6 = extendedMessageFormat4.toPattern();
        extendedMessageFormat4.applyPattern("hi!");
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map11);
        java.lang.String str13 = extendedMessageFormat12.toPattern();
        java.text.Format[] formatArray14 = extendedMessageFormat12.getFormatsByArgumentIndex();
        java.util.Locale locale15 = extendedMessageFormat12.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale15);
        extendedMessageFormat4.setLocale(locale15);
        java.util.Map map18 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale15, map18);
        java.util.Map map20 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale15, map20);
        extendedMessageFormat21.applyPattern("hi!");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test720");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("");
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormatsByArgumentIndex();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test721");
        java.util.Map map3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map3);
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.lang.String str6 = extendedMessageFormat4.toPattern();
        extendedMessageFormat4.applyPattern("hi!");
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map11);
        java.lang.String str13 = extendedMessageFormat12.toPattern();
        java.text.Format[] formatArray14 = extendedMessageFormat12.getFormatsByArgumentIndex();
        java.util.Locale locale15 = extendedMessageFormat12.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale15);
        extendedMessageFormat4.setLocale(locale15);
        java.util.Map map18 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale15, map18);
        java.util.Map map20 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale15, map20);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test722");
        java.util.Map map4 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map4);
        java.util.Locale locale6 = extendedMessageFormat5.getLocale();
        java.lang.String str7 = extendedMessageFormat5.toPattern();
        java.util.Locale locale8 = extendedMessageFormat5.getLocale();
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale8, map9);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale8);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale8);
        java.lang.Object obj13 = extendedMessageFormat12.clone();
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test723");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4);
        extendedMessageFormat5.applyPattern("hi!");
        extendedMessageFormat5.applyPattern("hi!");
        extendedMessageFormat5.applyPattern("");
        extendedMessageFormat5.applyPattern("hi!");
        java.util.Locale locale14 = extendedMessageFormat5.getLocale();
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
    }
}

